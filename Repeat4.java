//Repeat 4 using recursion
class Repeat4 {
    static void repeat(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(4);
        repeat(n - 1);
    }
    public static void main(String[] args) {
        repeat(5);
    }
}
