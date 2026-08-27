public class SquareRoot {
    public int sqrt(int n){
        if(n < 0){
            throw new IllegalArgumentException("Cannot compute square root of negative number");
        }

        if(n == 0 || n == 1){
            return n;
        }

        int result = (int) Math.sqrt(n);
        return result;
    }

    public static void main(String[] args) {
        SquareRoot sr = new SquareRoot();
        System.out.println("Square root of 16 is: " + sr.sqrt(16));
    }
}
