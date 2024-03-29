package DataStructure;

public class CustomStack {

    public static final int DEFAULT_SIZE=10;
    protected  int data[];
    protected int ptr=-1;    
    public  CustomStack() {  
        this(DEFAULT_SIZE);
     
    }
    public CustomStack(int size) {
        this.data=new int [size];
        
    }
    public boolean isFull() {
        if(ptr==data.length-1) {
            return true;
        }
        return false;
    }
    public boolean isEmpty() {
        if(ptr==-1) {
            return true;
        }
        return false;
    }
    public boolean push(int item) throws Exception {
        if(isFull()) {
            throw new Exception("Ommala the stack is full");
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    
    public int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("ommala the stack is empty how can you remove");
        }
        int removed=data[ptr];
        ptr--;
        return removed;
    }
    
    public int peek()  throws Exception{
        if(isEmpty()) {
            throw new Exception("The stacked is ofcorse empty cant peek");
        }
        return data[ptr];
    }
}
