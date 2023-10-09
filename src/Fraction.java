public class Fraction {
    //Define a class called Fraction. This class is used to represent a ratio of two integers.
    //● Include mutator methods that allow the user to set the numerator and the denominator.
    private int numer;
    private int denom;

    //constructor

    public Fraction(int numer, int denom){
        setFraction(numer,denom);
    }

    //mutator methods to set numer and denom
    public void setFraction(int numer, int denom) {
        if (denom == 0) {
            System.out.println("The denominator cannot be zero!");
            return;
        }
        this.numer = numer;
        this.denom = denom;

        reduceToLowest();
    }

    //● Also include a method that returns the value of numerator divided by denominator as a
    //double.

    public double getDecimalValue() {
        return (double) numer / denom;
    }


    //● Include an additional method that outputs the value of the fraction reduced to lowest
    //terms (e.g., instead of outputting 20/60, the method should output 1/3). This will require
    //finding the greatest common divisor for the numerator and denominator, then dividing
    //both by that number
    private void reduceToLowest() {
        int gcd = findGCD(Math.abs(numer), Math.abs(denom));

        if (gcd >1) {
            numer/= gcd;
            denom /= gcd;
        }
    }

    //method to find greatest common denom using Euclidean algorithm
    private  int findGCD(int a, int b) {
        while (b !=0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //method to display the fraction
    public void displayFraction() {
        System.out.println(numer + "/" + denom);
    }

    public static void main (String[] args) {
        Fraction myFraction = new Fraction(20,60);
        myFraction.displayFraction();
        System.out.println(myFraction.getDecimalValue());
    }

}

//Output:
//1/3
//0.3333333333333333
