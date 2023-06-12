
public class MyLinkedList {
    private static class Node{
        EarthQuake data;
        Node next;
        public Node(EarthQuake data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    private int size;
    private Node head;
    public int getSize(){
        return size;
    }
    public void add(EarthQuake data){
        head=new Node(data,head);
        size++;
    }
    public void traverse(){
        for(Node temp=head;temp!=null;temp=temp.next){ 
        System.out.println(temp.data);
        }
    }
}