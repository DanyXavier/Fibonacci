public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Esta es la serie Fibonacci");
        // FORMA 1: RECURSIVIDAD
        /*int size = 50;
        for (int i = 0; i < size; i++) {
            System.out.print(Fibonacci(i) + " ");
        }
        System.out.println();*/

        // FORMA 2: ARRAY
        int size = 150;
        long[] fibonacci = new long[size];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 0; i < fibonacci.length; i++) {
            if(i>1){
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            }
            System.out.print(fibonacci[i] + " ");
        }
        System.out.println();
    }
    // FORMA 1 : RECURSIVIDAD
    public static long Fibonacci(int n){
        switch(n){
            case 0: return 0;
            case 1: return 1;
            default: 
                return Fibonacci(n-1) +  Fibonacci(n-2);
        }
    }
}
