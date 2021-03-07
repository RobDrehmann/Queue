public class Dynlist implements ListInterface{
   private Node head;
   private int size;
   private Node acurr;
   private Node rcurr;
         
    public static void main(String[] args){
     Dynlist Stack = new Dynlist();
     Stack.append(2);
     Stack.append(1);
     Stack.dumpstack();
     Stack.append(3);
     Stack.append(10);
     System.out.println(Stack.retval());
     Stack.append(15);
     Stack.dumpstack();
     System.out.println(Stack.retval());
     System.out.println(Stack.retval());
    Stack.dumpstack();
     System.out.println(Stack.retval());
     System.out.println(Stack.retval());
     Stack.retval();
     Stack.dumpstack();

     
     
     
      }
    
   public Dynlist()
   {
      head=null;
      acurr=null;
      rcurr=null;
      size=0;
    }
    
    @Override
    public void append(int val){
      if(size==0)
      {
         head = new Node();
         head.value=val;
         head.next=null;
         size++;
       }else{
         acurr=new Node();
         
         acurr.value=val;
         acurr.next=head;
         head=acurr;
         
         size++;
       }
       System.out.println("Pushed: " + val);
     }
     @Override
     public int retval(){
      int tmp;
      if(head !=null)
      {
         rcurr = new Node();
        
         rcurr.value = head.value;
         tmp = rcurr.value;
         
         head=head.next;
         size--;
         
         
        
         
         return(tmp);
       }
       else {
       System.out.println("Nothing to pop"); 
       return(0);}
       }
    public void dumpstack(){
      int counter = 1;
      int val;
      int sizetmp = size;
      Node headtmp = head;
      
      
      System.out.print("[ ");
      while(counter <= sizetmp){
         System.out.print(retval() + " ");
         counter++;
         
         
        }
        size = sizetmp;
        head = headtmp;
        System.out.println("]");

         
      }
       
   }
   
   
     