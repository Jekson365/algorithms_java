import java.util.Arrays;

class Main {
    public static void main(String[] args){
        System.out.println(
                find(new int[] {2, 6, 8, -10, 3})
        );
    }
    static int find(int[] integers) {

        int isEven = 0;
        int isOdd = 0;

        for (int i = 0; i < integers.length;i++) {
            if (integers[i] % 2 == 0) {
                isOdd++;
            }
            else {
                isEven++;
            }
        }
        if (isEven == 1) {
            for (int i = 0;i < integers.length;i++) {
                if (integers[i] % 2 != 0) {
                    return integers[i];
                }
            }
        }
        if (isOdd == 1) {

            for (int i = 0;i < integers.length;i++) {
                if (integers[i] % 2 == 0) {
                    return integers[i];
                }
        }
        }
        return 0;

    }
}





