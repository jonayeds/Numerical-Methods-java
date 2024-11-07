import java.math.BigDecimal;
import java.util.Objects;

public class ReduceFraction {
    public String reduceFractionObj(double a) {
        String fraction = String.valueOf(a);
        String[] frac = fraction.split("");
        boolean isFraction = false;
        int count = 0;
        for (int i=0; i<frac.length; i++) {
            if(isFraction){
                count++;
                if(count ==6){
                    if(i== frac.length-1) break;
                    if(Integer.parseInt(frac[i+1])>= 5){
                        frac[i] =  String.valueOf(Integer.parseInt( frac[i])+1);
                        String finalValue = "";
                        for(int j=0; j<=i ; j++){
                            finalValue += frac[j];
                        }
                        return finalValue;
                    }else{
                        String finalValue = "";
                        for(int j=0; j<=i ; j++){
                            finalValue += frac[j];
                        }
                        return finalValue;
                    }
                }
            }
            if(Objects.equals(frac[i], ".")){
                isFraction = true;
            }

        }
        return fraction;
    }
}
