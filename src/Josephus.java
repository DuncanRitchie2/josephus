public class Josephus {

    public static String booleanArrayToString(boolean[] arr) {
        String output = "";
        for (int j = 0; j < arr.length; j++) {
            output += ( arr[j] ? "-" : "_" );
        }
        return output;
    }

    public static int numTrue(boolean[] arr) {
        int output = 0;
        for (boolean item : arr) {
            if (item) {output++;}
        }
        return output;
    }

    public static int josephus(int n, int i) {
        boolean[] soldiersAlive = new boolean[n];
        int currentSoldier = 0;


        while (numTrue(soldiersAlive)>1) {

        }

        System.out.println(booleanArrayToString(soldiersAlive));
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(josephus(40,1));
    }

}
