package DataStructure;
public class customQueue {
    public static int DEFAULT_SIZE=5;
    protected  int data[];
    int end=0;
    public customQueue(){
        this(DEFAULT_SIZE);
    }
    public customQueue(int size){
        this.data=new int[size];

    }

    public boolean insert(int item) throws  Exception{
        if(full()){
            throw new Exception("this que is full cant add anymore");
        }

        data[end]=item;
        end++;


        return true;
    }
    public int remove() throws  Exception{
        if(empty()){
            throw  new Exception("can remove from empty que");
        }
        int removed=data[0];
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }


    public boolean full(){
        return end== data.length;
    }
    public boolean empty(){
        return end== 0;
    }
    public void display(){
        for(int a:data){
            System.out.println(a +"->");
        }
    }

    public static  void main(String args[]) throws Exception {
        customQueue queue=new customQueue();
        queue.insert(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
       // queue.insert(5);
        queue.remove();
        queue.remove();
       /* for(int a: queue.data){
            System.out.println(queue.toString());
        }*/
        queue.display();


    }

}