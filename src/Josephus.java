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
        boolean[] soldiers = new boolean[n];  // true if alive, false if dead.
        for (int a = 0; a < soldiers.length; a++) {
            soldiers[a] = true;
        }
        int curr = 1;
        int j = 1;   // A soldier will be killed whenever j == i.

        while (numTrue(soldiers)>1) {
            if (curr == n+1) {curr = 1;};

            if (soldiers[curr-1]) {

                if (j == i) {
                    soldiers[curr-1] = false;
                    curr++;
                    j = 1;
                }

                else {
                    curr++;
                    j++;
                }

            }
            else {
                curr++;
            }



            System.out.println(booleanArrayToString(soldiers));
        }


        for (int b = 1; b < soldiers.length+1; b++) {
            if (soldiers[b-1]) {return b;}
        }

        System.out.println("The for-loop to find the 'true' value failed!");
        return n;
    }

    public static void main(String[] args) {
        System.out.println(josephus(5,3));
    }

}
