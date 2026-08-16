public class ArmStrong {
    public int ArmNumber(int n){
        int original = n;
        int temp = n;
        int len = 0;

        while(temp != 0){
            len++;
            temp = temp/10;
        }

        int sum = 0;
        temp = n;

        while(temp != 0){
            int digit = temp % 10;

            int pow = 1;

            for(int i=0;i<len;i++){
                pow = pow * digit;
            }

            sum = sum + pow;
            temp = temp / 10;

        }

        return sum;
    }

    public static void main(String[] args) {
        ArmStrong obj = new ArmStrong();
        System.out.println(obj.ArmNumber(153)); // Output: 153
        System.out.println(obj.ArmNumber(9474)); // Output: 9474
        System.out.println(obj.ArmNumber(123)); // Output: 36
        System.out.println(obj.ArmNumber(9475)); // Output: 9475
    }
}
