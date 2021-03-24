public class Main {
    public static void main(String[] args)  {
        try{
            QuadraticEquation e1=new QuadraticEquation(1,0,3);//Aqui puede tirar un error entonces usamos el try y catch
            e1.QuadraticCalc();
        } catch (QuadraticException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Exit System");
        }

        Unchecked example2=new Unchecked();//Ejemplo de Unchecked
        example2.UncheckedMethod();
        FileReader2 example3=new FileReader2();
        example3.FileReader();
    }
}
