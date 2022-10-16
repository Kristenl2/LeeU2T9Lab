public class LuckyNumbers {
    /* No instance variables or constructors */

    /* Generates a random number between min and max, inclusive,
       and returns that random number
     */
    public int randomIntegerBetween(int min, int max){
        int random = (int)(Math.random()*(max-min+1))+min;
        return random;
    }

    public String getLuckyNumbers(){
        int num1 = randomIntegerBetween(1,65);
        int num2 = randomIntegerBetween(1,65);
        int num3 = randomIntegerBetween(1,65);
        int num4 = randomIntegerBetween(1,65);
        int num5 = randomIntegerBetween(1,65);
        int num6 = randomIntegerBetween(1,30);
        String numbers = "Your lucky number are " + num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + "\n";
        numbers += "The super ball is: " + num6;
        return numbers;
    }


}
