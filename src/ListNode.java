import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;

class Main {
    public static void main(String[] args){
        System.out.println(
                add("100","50")
        );
    }

    public static String add(String a, String b) {
        return String.valueOf(new BigInteger(a).add(new BigInteger(b)));
    }


    // greed is good
    public static int greedy(int[] dice){
        //code here
        int result = 0;
        int[] scores = new int[] {100,200,300,400,500,600,1000};
        int count = 0;

        for (int i =0;i < dice.length;i++) {
            if (dice[i] == 1) {
                count++;
            }
        }


        return result;
    }
    public static int countCharacters(int[] dice,int c) {
        int result = 0;

        for (int die : dice) {
            if (die == c) {
                result++;
            }
        }
        return result;
    }
    // Break camelCase
    public static String camelCase(String input) {
//        if (Objects.equals(input, "")) return "";
        return String.join(" ",input.split("(?=[A-Z])"));
    }
    // build a tower
    public static String[] towerBuilder(int nFloors)
    {
        String[] tower = new String[nFloors];
        int maxWidth = 2 * nFloors - 1;

        for (int i = 0; i < nFloors; i++) {
            int numStars = 2 * i + 1;
            int numSpaces = (maxWidth - numStars) / 2;
            String floor = " ".repeat(numSpaces) + "*".repeat(numStars) + " ".repeat(numSpaces);
            tower[i] = floor;
        }

        return tower;
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





