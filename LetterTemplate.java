/* Write a Java program to fill in a letter template which looks like below:
letter = "Dear <|name|>, Thanks a lot"
Replace <|name|> with a string (some name)
*/

class LetterTemplate {
    public static void main(String args[]){
        String Letter="Dear <|name|>, Thanks a lot";
        Letter=Letter.replace("<|name|>","Karishma");
        System.out.println(Letter);
    }
}
