public class Sum {
    public static void main(String[] args) {
        multiply times= new multiply();
        times.a=10;
        times.b=20;
        times.result();
        int a=25;
        int b=35;
        int c=25;
        int sum=a+b;
        System.out.println(sum);
    }
}
class multiply{
    int a;
    int b;

    void result(){
        System.out.println(a*b);
    }
}
