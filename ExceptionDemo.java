public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            tryBlock1();
            tryBlock2();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    static void tryBlock1() throws ArithmeticException {
        int a = 10, b = 0;
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        } else {
            int result = a / b;
            System.out.println("Result of division: " + result);
        }
        
    }

    static void tryBlock2() throws NullPointerException {
        String str = null;
        if (str.equals("hello")) {
            System.out.println("String is hello");
        } else {
            throw new NullPointerException("Null Pointer Exception");
        }
    }
}