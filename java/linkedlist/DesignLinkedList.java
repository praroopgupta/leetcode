class MyLinkedList {
    
    class Node {
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }
    
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }
    
    public int get(int index) {
        if(index >= size){
            return -1;
        }
        Node p = head;
        for(int j=0; j<index; j++){
            p = p.next;
        }
        return p.val;
    }
    
    public void addAtHead(int val) {
        Node p = new Node(val);
        p.next = head;
        head = p;
        size++;
        if (head.next == null) {
            tail = head;
        }
    }
    
    public void addAtTail(int val) {
        Node p = new Node(val);
        if(tail != null){
            tail.next = p;
        }
        if(tail == null || size == 0){
            head = p;
        }
        tail = p;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }
        if (index == 0) {
            addAtHead(val);

        } else if (index == size) {
            addAtTail(val);
        } else {
            Node i = head;
            for (int j = 0; j < index - 1; j++) {
                i = i.next;
            }
            Node p = new Node(val);
            Node save = i;
            i = i.next;
            save.next = p;
            p.next = i;
            size++;  
        }     
    }
    
    public void deleteAtIndex(int index) {
        if (size == 0 || index < 0 || index >= size) {
            return;
        }
        if (index == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else {
            Node i = head;
            for (int j = 0; j < index - 1; j++) {
                i = i.next;
            }
            i.next = i.next.next;
            size--;
            if (i.next == null) {
                tail = i;
            }
        } 
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */