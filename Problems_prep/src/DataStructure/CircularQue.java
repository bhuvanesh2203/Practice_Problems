package DataStructure;

public class CircularQue {
    public static int DEFAULT_SIZE=5;
    protected  int data[];
    int first=0;
    int end=0;
    int size=0;
    public CircularQue(){
        this(DEFAULT_SIZE);
    }
    public CircularQue(int size){
        this.data=new int[size];

    }
    
    public boolean insert(int item) throws  Exception{
        if(full()){
            throw new Exception("this que is full cant add anymore");
        }

        data[end++]=item;
        end=end%data.length;
        size++;


        return true;
    }
    public int remove() throws Exception {
        if(empty()) {
            throw new Exception("cant remove da ");
        }
        int removed=data[first++];
        first=first%data.length;
        size--;
        return removed;
        
    }
    
    public boolean empty(){
        return size== 0;
    }
    
    public boolean full(){
        return size== data.length;
    }
    
    public void display() {
        int i=first;
        do {
            System.out.print(data[i]+"-->");
            i++;
            i=i%data.length;
        } while (i!=end);
        
    }
    
    public static void main(String args[]) throws Exception {
        CircularQue que=new CircularQue(5);
        que.insert(3);
        que.insert(4);
        que.insert(5);
        que.insert(6);
        que.insert(7);
        que.remove();
        que.insert(8);
        que.display();
        
        
    }
}