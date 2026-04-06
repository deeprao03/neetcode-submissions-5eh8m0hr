class MyHashMap {
    Node head;
    public MyHashMap() {
        head = new Node(-1,-1);
    }
    
    public void put(int key, int value) {
        Node temp = head;
        while(temp.next!=null){
            if(temp.next.key==key){
                temp.next.value = value;
                return;
            }
            temp = temp.next;
        }
        temp.next = new Node(key,value);
    }
    
    public int get(int key) {
        Node temp = head;
        while(temp.next!=null){
            if(temp.next.key==key){
                return temp.next.value;
            }
            temp = temp.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        Node temp = head;
        while(temp.next!=null && temp.next.key!=key){
            temp = temp.next;
        }
        if(temp.next!=null){
            temp.next = temp.next.next;
        }
    }
}
class Node{
    int key;
    int value;
    Node next;
    Node(int key, int value){
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */