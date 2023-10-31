public class Main {
    public class SimpleClass {
        private int number;
        private String text;

        public SimpleClass(int number, String text) {
            this.number = number;
            this.text = text;
        }


        public void printDetails() {
            System.out.println("Number: " + number);
            System.out.println("Text: " + text);
        }
    }

    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 10;

        int result = number1 + number2;
        System.out.println("Result: " + result);
    }
}