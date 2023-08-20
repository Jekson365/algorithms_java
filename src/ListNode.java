import java.util.Arrays;

class Main {
    public static void main(String[] args){
        System.out.println(
                findEvenIndex(new int[] {1,2,3,4,5,6})
        );
    }
    // Equal Sides of an array
    public static int findEvenIndex(int[] arr) {
        for (int i = 0;i < arr.length;i++) {
            int[] splitedFrist = Arrays.copyOfRange(arr,0,i);
            int[] splitedSecond = Arrays.copyOfRange(arr,i+1,arr.length);

            if (Arrays.stream(splitedFrist).sum() == Arrays.stream(splitedSecond).sum()) {
                return i;
            }
        }

        return -1;
    }
}





