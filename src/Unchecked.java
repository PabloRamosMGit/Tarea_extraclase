public class Unchecked {
    public void UncheckedMethod() {
        try{
            int a[]={1,2,3,4,5,6,7};
            System.out.println(a[7]);
        } catch (ArrayIndexOutOfBoundsException  e) {
            System.out.println("ArrayIndexOutOfBoundException" + e);
        }

    }
}
