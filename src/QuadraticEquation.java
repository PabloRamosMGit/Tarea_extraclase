//Ejemplo de Checked exception
public class QuadraticEquation{
    public int a;
    public int b;
    public int c;
    public QuadraticEquation(int a,int b,int c) throws QuadraticException {
        if (a==0){
            throw new QuadraticException("Invalid Value A");
        }else{
            this.a=a;
            this.b=b;
            this.c=c;
        }
    }
    public void QuadraticCalc() throws QuadraticException {
        double determinate = Math.pow(b,2)- (4 * a * c);
        if (determinate >= 0){
            float sqrt1 = (float) (((-b + Math.sqrt(determinate)))/ (2 * a));
            float sqrt2 = (float) (((-b - Math.sqrt(determinate)))/ (2 * a));
            System.out.printf("Anwser One: %s \n", sqrt1);
            System.out.printf("Anwser Two: %s \n", sqrt2);
        }else{
            throw new QuadraticException("Negative determinate");
        }

    }
}


