import java.util.Arrays;
import java.util.Objects;

class Main {
    public static void main(String[] args){
        System.out.println(camelCase("HelloWorld"));
    }

    // greed is good -> skiped!
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





