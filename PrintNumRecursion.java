public class PrintNumRecursion {
    public void printNum(int n){
        if(n == 0){
            return;
        }

        printNum(n-1);
        System.out.println(n);
        
    }

    public static void main(String[] args) {
        PrintNumRecursion obj = new PrintNumRecursion();
        obj.printNum(5);
    }
}
