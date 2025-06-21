package Test;

public class Challenge_4 {
    public static void main(String[] args) {
int i=5;
        System.out.println("Post-Increment:");
        System.out.println("Value returned by i++: " + (i++)); // returns then increments
        System.out.println("Value of i after i++: " + i);
        System.out.println();

        i = 5;
        System.out.println("Pre-Increment:");
        System.out.println("Value returned by ++i: " + (++i)); // increments then returns
        System.out.println("Value of i after ++i: " + i);
        System.out.println();

        i=5;
        System.out.println("Post-Decrement:");
        System.out.println("Value returned by i--: " + (i--)); // returns then decrements
        System.out.println("Value of i after i--: " + i);
        System.out.println();

        i=5;
        System.out.println("Pre-Decrement:");
        System.out.println("Value returned by --i: " + (--i));
        System.out.println("Value of i after --i: " + i);
    }

}
