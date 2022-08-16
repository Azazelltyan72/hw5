public class Main {
    public static void main(String[] args) {
        {
            // Задание1
            // 1.
            int[] numbers = new int[3];
            numbers[0] = 1;
            int numderOne = numbers[0];
            numbers[1] = 2;
            int numderTwo = numbers[1];
            numbers[2] = 3;
            int numderThree = numbers[2];
            for (int i = 0; i < numbers.length; i++) {
                i = i + 1;
            }
            //2.
            double[] numerics = {1.57, 7.654, 9.986};
            numerics[0] = 1.57;
            double numericOne = numerics[0];
            numerics[1] = 7.654;
            double numericTwo = numerics[1];
            numerics[2] = 9.986;
            double numericThree = numerics[2];
            //3.
            boolean[] judgment = new boolean[5];
            judgment[0] = true;
            judgment[1] = true;
            judgment[2] = false;
            judgment[3] = true;
            judgment[4] = true;
            // Задание 2

            for (int i = 0; i < numbers.length; i++)  {
                System.out.print(numbers[i]);
                if (i != numbers.length - 1) {
                    System.out.print(", ");}
            }
            System.out.println( );
            for (int i = 0; i < numerics.length; i++)  {
                System.out.print(numerics[i]);
                if (i != numerics.length - 1) {
                    System.out.print(", ");}
            }
            System.out.println( );
            for (int i = 0; i < judgment.length; i++)  {
                System.out.print(judgment[i]);
                if (i != judgment.length - 1) {
                    System.out.print(", ");}
            }
            System.out.println( );
            System.out.println( );
            // Задание 3

            for (int i = numbers.length - 1; i >= 0 ; i--)  {
                System.out.print(numbers[i]);
                if (i != 0) {
                    System.out.print(", ");}
            }
            System.out.println( );
            for (int i = numerics.length - 1; i >= 0; i--)  {
                System.out.print(numerics[i]);
                if (i != 0) {
                    System.out.print(", ");}
            }
            System.out.println( );
            for (int i = judgment.length - 1; i >= 0; i--)  {
                System.out.print(judgment[i]);
                if (i != 0) {
                    System.out.print(", ");}
            }
            System.out.println( );
            System.out.println( );

            // Задание 4
            for (int i = 0; i < numbers.length; i++)  {
                if (numbers[i] % 2 == 1) {
                    numbers[i]++;
                } System.out.print(numbers[i]);
                if (i != numbers.length - 1) {
                    System.out.print(", ");}
            }

        }
    }
}