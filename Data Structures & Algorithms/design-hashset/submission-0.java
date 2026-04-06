class MyHashSet {
    Node head;
    Node curr;
    public MyHashSet() {
        head = new Node(-1);
        curr = head;
    }
    
    public void add(int key) {
        Node newNode = new Node(key);
        Node temp = head;
        boolean flag = false;
        while(temp.next!=null){
            if(temp.next.data==key){
                return;
            }
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    public void remove(int key) {
        Node temp = head;
        while(temp.next!=null && temp.next.data!=key){
            temp = temp.next;
        }
        if(temp.next!=null){
            temp.next = temp.next.next;
        }
    }
    
    public boolean contains(int key) {
        Node temp = head;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
        this.next = null;
    }
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */