class Continue {
    public static void main(String args[]){
        System.out.println("For Loop:");
        for (int i = 0; i < 5; i++) {
         if (i == 2) {
            System.out.println("Ending the for loop");
            continue;
         }
            System.out.println(i);
            System.out.println("Java is a programming language");
        }

         // Do-while loop
        System.out.println("\nDo-While Loop:");
        int k = 0;
        do {
            k++;
             if (k == 2) {
                System.out.println("Ending the do-while loop");
                continue;
             }
            System.out.println(k);
            System.out.println("java is a programming language");
        } while (k < 5);

    }
}
