class LL {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add - first , last

    public void addFirst(String  data){
        Node newNode = new Node("A");

        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next  = head;
        head = newNode;
    }

    // Add Last

    public void addLast(String data) {
        Node newNode = new Node("A");

        if(head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // Print

    public void printList() {
        if( head == null){
            System.out.print("List is empty");
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");

    }

    public static void main(String args[]) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

    }
}