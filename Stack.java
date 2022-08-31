public class Stack {

    private int store[];
    private int top;
    private int capacity;

    Stack(int capacity){
        this.store = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }

    public void push(int element){
        if(isFull()){
            System.out.println("Stack is full!");
            // System.exit(1);
        }
        else{
            System.out.println("Inserting element : "+element);
            this.store[++this.top] = element;
        }
    }

    public int pop(){
        if(isEmpty()){{
            System.out.println("Stack is empty!");
            // System.exit(1);

            // Edge case handled
            this.store[0] = 0;
            return this.store[0];
        }}
        else{
            System.out.println("Popping last element from stack...");
            return this.store[this.top--];
        }
    }

    public Boolean isFull(){
        return this.top == this.capacity - 1;
    }

    public Boolean isEmpty(){
        return this.top == -1;
    }

    public int getSize(){
        System.out.println("Size of the Stack is : "+ (this.top + 1));
        return this.top + 1;
    }

    public void printStack(){
        for(int i = 0; i<= this.top; i++){
            System.out.println(this.store[i]+ " , ");
        }
    }


    public static void main(String[] Args){
        System.out.println("This is stack class..");
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.getSize();
        stack.pop();
        stack.getSize();

        stack.printStack();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.printStack();

        stack.getSize();
    }
}