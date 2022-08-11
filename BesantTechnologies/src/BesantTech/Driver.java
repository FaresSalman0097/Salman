package BesantTech;

public class Driver {
    void execute(int a,int b)throws ArithmeticException
    {
        System.out.println((a/b));
    }
}
class program
{
    public static void main(String[] args) {

            Driver ref = new Driver();
        try{
            ref.execute(4,0);
        }
        catch(ArithmeticException obj){
            obj.printStackTrace();
        }

    }
}