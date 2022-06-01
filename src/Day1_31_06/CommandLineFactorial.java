package Day1_31_06;

public class CommandLineFactorial {
    public static void main(String[] args) {
        for (String arg : args) {
            int n = Integer.parseInt(arg);
            int val = 1;
            for (int i = 1; i <= n; i++) {
                val *= i;
            }
            System.out.println("factorial of " + arg + " is " + val);
        }
    }
}
