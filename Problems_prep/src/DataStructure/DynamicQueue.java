package DataStructure;

public class DynamicQueue extends CircularQue {
    
    public DynamicQueue() {
        super();
    }
    public DynamicQueue(int size) {
        super(size);
    }
    
    public boolean insert(int item) throws Exception {
       if(this.full()) { 
           int temp[]=new int[data.length*2];
           for(int i=0;i<data.length;i++) {
               temp[i]=data[(first+i)% data.length];
           }
          first=0;
          end=data.length;
          data=temp;
          
       }
       return super.insert(item);
    }

}
