public class Main {
    public static void main(String[] args)  {
        try{
            QuadraticEquation e1=new QuadraticEquation(1,0,-3);
            e1.QuadraticCalc();
        } catch (QuadraticException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Exit System");
        }
        Unchecked example2=new Unchecked();
        example2.UncheckedMethod();
        FileReader2 example3=new FileReader2();
        example3.FileReader();
    }
}
