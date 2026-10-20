//Write a function to convert celsius temperature to fahrenheit
class TempCtoF{
    static void Temp(int c){
        double Fahrenheit=(9.0/5*c)+32;
        System.out.println("Fahrenheit: " + Fahrenheit);
    }
    public static void main(String[] args) {
        Temp(25);
    }
}