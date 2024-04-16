public class fuzz_Buzz {
    public static void main(String[] args) {
        int i;
    for(i = 1; i < 100; i++) {
        if (i % 15 == 0) {
            System.out.print("FuzzBuzz \t");
        }
        else if (i % 5 == 0) {
            System.out.print("Buzz \t");
        }
        else if (i % 3 == 0) {
            System.out.print("Fuzz \t");
        }
        else {
            System.out.print(i + "\t");
        }
    }
}
}