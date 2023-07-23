package Patterns;

public class Singleton{
    // We have declared the obj volatile which ensures that multiple threads offer the obj variable correctly when it is being initialized to Singleton instance.
    private static volatile Singleton obj = null;
    
    // private constructor
    private Singleton(){}

    public static Singleton getInstance(){
        if(obj == null) {
            // instantiate obj by acquiring lock

            synchronized(Singleton.class){
                // check obj again as multiple threads can reach above point

                if(obj == null)
                    obj = new Singleton();
            }
        }

        return obj;
    }

}