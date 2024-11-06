import java.text.DecimalFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         float x2 = 1;
         float x3 = 65;
         float x4 = -18;
         float x1 = 2;
        DecimalFormat df = new DecimalFormat("0.000");

        for (int i = 1; i <= 10; i++) {
            x1 = Float.parseFloat(df.format((18-( 5*x2 + 3*x3+ x4 ))/2));
            x2 = Float.parseFloat(df.format((-18-(-8*x1 +9*x3- 3*x4))/6));
            x3=  Float.parseFloat(df.format((6-(-2*x1 + 5*x2 + x4))/-7));
            x4=  Float.parseFloat(df.format((-10-(2*x1 + -4*x2 + 7*x3))/-4))
            ;
            System.out.println("iteration : "+ i);
            System.out.println("x1 = "+x1 + " || x2 = "+x2 + " || x3 = "+x3+ "  || x4 = "+x4);

        }
    }
}