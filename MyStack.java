
public class MyStack {
    private String name;
    public MyStack(String name){
        this.name=name;
    }
    public class Node{
        private EarthQuake data;
        private Node next;
        public Node(EarthQuake data, Node next){
            this.next=next;
            this.data=data;
        }
        public Node(){}
        public Node getNext(){
            return next;
        }
        public EarthQuake getData(){
            return data;
        }
    }
    private Node top;
    private int size;
    public int getSize(){
        return size;
    }
    public void push(EarthQuake data){
        top = new Node(data,top);
        size++;
    }
    public Node getTop(){
        return top;
    }
    public String getName(){
        return name;
    }
    public void traverse(){
        for(Node temp=top;temp!=null;temp=temp.next) 
        {
            System.out.println(temp.data);
        }
        System.out.println("-------------------------------------------------------");
    }
}