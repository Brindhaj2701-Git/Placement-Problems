public class Fabinacci {
    public int fib(int n){
        if(n <= 1){
            return n;
        }

        int a = 0, b = 1, c =0;
        for(int i = 2; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        Fabinacci f = new Fabinacci();
        System.out.println("Fibonacci of 5 is: " + f.fib(5));
    }
}
