//WAP to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.

class Grade{
    public static void main(String args[]){
        char grade = 'A';
        grade=(char)(grade+8);
        System.out.println(grade);

        //Decrypting the grade
        grade=(char)(grade-8);
        System.out.println(grade);
    }
}