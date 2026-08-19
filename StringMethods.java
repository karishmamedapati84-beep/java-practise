class StringMethods{
    public static void main(String args[]){
        String name="Karishma";
        System.out.println(name);
        int value=name.length();                                                   //Method-1
        System.out.println(value); 
        String a="KARISHMA";
        System.out.println(a.toLowerCase());                                       //Method-2
        String b="hello";
        System.out.println(b.toUpperCase());                                       //Method-3
        String c="        Hello world       ";
        System.out.println(c);
        System.out.println(c.trim());                                              //Method -4
        System.out.println(name.substring(5));                         //Method-5
        System.out.println(name.substring(3, 7));            //Method-6
        System.out.println(b.replace('e', 'a'));                //Method-7
        System.out.println(b.replace("hello", "Hi"));       //Method-8
        System.out.println(name.startsWith("Ka"));                      //Method-9     
        System.out.println(name.endsWith("l"));                        //Method-10
        System.out.println(name.charAt(5));                             //Method-11
        System.out.println(name.indexOf("m"));                            //Method-12
        String d="Harryrry";       
        System.out.println(d.indexOf("rry",4));                 //Method-13
        System.out.println(d.lastIndexOf("rry",4));             //Method-14
        System.out.println(name.equals("Karishma"));                 //Method-15
        System.out.println(name.equalsIgnoreCase("kARishMa"));  //Method-16

        //escape sequence
        System.out.println("I am escape sequence \n double quote");
        System.out.println("I am escape sequence\tdouble quote");
        
    }
}