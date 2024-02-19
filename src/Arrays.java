public class Arrays {
    public static void main (String[] args) {

        // Opgave 1-3
        int[] intArr = new int[8];
        intArr[0] = 34;
        intArr[intArr.length - 1] = 117;
        for (int item : intArr) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Opgave 4-5
        String[] strArr = {"Hej", "med", "dig"};
        for (String item : strArr) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Opgave 6
        double[] doubleArr = {3.4, 2.5, 1.2, 6.7};
        System.out.println(doubleArr[2]);
        //System.out.println(doubleArr[4]);
    }
}
