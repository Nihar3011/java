
package programs;

class NewThread implements Runnable{
    String name;
    Thread t;

    public NewThread(String name) {
        this.name = name;
        this.t = new Thread(this,name);
        t.start();
    }
    
    
    public void run(){
        try{
            for(int i=5 ; i>0 ;i--){
                System.out.println( name +":" + i);
                Thread.sleep(1000); 
            }
            
        }catch(Exception e){
            System.err.println(e);
        }
        
    }
}

public class BasicThread {
    public static void main(String[] args) {
        new NewThread("one");
        new NewThread("Two");
        new NewThread("Three");
        
        try{
            Thread.sleep(1000);//wait for other Thread
        }catch(Exception e)
        {
            System.err.println(e);
        }
    }
    
}
