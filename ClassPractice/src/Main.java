public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        int n = 5;
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                System.out.printf("%-10s","*"); // leaves 20 spaces on the right
            }
            System.out.println();
        }
    }
}