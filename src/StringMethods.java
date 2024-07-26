public class StringMethods {
    public static void main(String[] args) {
        String birthdate ="12/03/2002";
        int startIndex =birthdate.indexOf("2002");
        System.out.println("Birth year ="+birthdate.substring(6));
        System.out.println("Month  ="+birthdate.substring(3,5));

        String newDate= String.join("/","23","09","1983");
        System.out.println(newDate);

        newDate ="25";
        newDate=newDate.concat("/");
        newDate=newDate.concat("09");
        newDate=newDate.concat("/");
        newDate=newDate.concat("1988");
        System.out.println(newDate);

        newDate="23"+"/"+"10"+"/"+"2005";
        System.out.println(newDate);

        newDate="25".concat("/").concat("07").concat("/").concat("2011");
        System.out.println(newDate);
        System.out.println(newDate.replace('/','-'));
        System.out.println(newDate.replace("07","0007"));
        System.out.println(newDate.replaceFirst("/","-"));
        System.out.println(newDate.replaceAll("/","----"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-------".repeat(20));
        System.out.println("                   ABC\n".repeat(3).indent(-10));
        System.out.println("-------".repeat(20));

    }
}
