 class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null ;
    }
}
public class swapNodesInPair{
    public static void main(String[] args){
        Node head = new Node(29);
        head.next = new Node(59);
        head.next.next = new Node(5);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(509);
        // head.next.next .next .next .next  = new Node(591);
        traverse(head);
        swapinpair(head);
        traverse(head);
    }
    public static void traverse(Node head){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void swapinpair(Node head){
        if(head == null || head.next == null){
            return;
        }

        int temp = head.data;
        head.data = head.next.data;
        head.next.data=temp;
        swapinpair(head.next.next);
 }
}