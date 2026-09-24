class Break {
    public static void main(String[] args) {
        // For loop
        System.out.println("For Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("Java is a programming language");
            if (i == 2) {
                System.out.println("Ending the for loop");
                break;
            }
        }

        // While loop
        System.out.println("\nWhile Loop:");
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            System.out.println("Java is a programming language");
            if (j == 2) {
                System.out.println("Ending the while loop");
                break;
            }
            j++;
        }

        // Do-while loop
        System.out.println("\nDo-While Loop:");
        int k = 0;
        do {
            System.out.println(k);
            System.out.println("java is a programming language");
            if (k == 2) {
                System.out.println("Ending the do-while loop");
                break;
            }
            k++;
        } while (k < 5);
    }
}