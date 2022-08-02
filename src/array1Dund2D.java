

    public class array1Dund2D {
        public static void main(String[] args) {
            /*
            int [] array = new int[10];
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                j+=3;
                array[i] = j;
            }

            for (int i = 0; i < array.length; i++) {
                System.out.println("das ist meine Zahle " + array[i]);
            }

            int [][] array2D = new int[4][4];
            array2D [0][0] = 2;
            array2D [0][1] = 40;
            array2D [3][1] = 35;
            array2D [2][3] = 45;

            for (int i = 0; i < array2D.length; i++) {
                for (int k = 0; k < array2D[i].length; k++) {
                    System.out.print( array2D[i][k] + "\t");

                }
                System.out.println();

            }

            */

            int [][] nextArrsy2D = {{22,43,23},{23,44,54,23},{3,4}};
            for (int i = 0; i < nextArrsy2D.length; i++) {
                for (int k = 0; k < nextArrsy2D[i].length; k++) {
                    System.out.print( nextArrsy2D[i][k] + "\t");

                }
                System.out.println();

            }
        }
    }


