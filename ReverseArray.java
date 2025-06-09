public class ReverseArray {
    public static double[] reverse(double[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            double temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        reverse(numbers);

        System.out.print("Reversed array: ");
        for (double n : numbers) {
            System.out.print(n + " ");
        }
    }
}
