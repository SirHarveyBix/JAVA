public class Hello {

    public static void main(String[] args){
        System.out.println("Hello, Tim");

        boolean isAlien = false;
        if(isAlien == false) { // Equality Operator
            System.out.println("It is not an Alien!");
            System.out.println("And I am scared of Aliens!");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println(("Either or both of conditions are true"));
        }


        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen.");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);

        double twenty = 20.00d;
        double eighty = 80.00d;
        double sum = (twenty + eighty) * 100.00d;
        System.out.println("sum = " + sum);

        double theRemainder = sum % 40.00d;
        System.out.println("theRemainder = " + theRemainder);

        boolean isNoRemainder = (theRemainder == 0);
        System.out.println("isNoRemainder = " + isNoRemainder);

        if (!isNoRemainder){
            System.out.println("Got some remainder");
        }
    }
}
