import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Interpolation {
    public static void main(String[] args) {
        double[] xi = {2, 2.3, 2.4, 2.45, 3, 3.32, 3.81, 4, -1, -4.23, 5.5, 6.1, 7.1, 7.15, 7.88, 9, 9.5};
        double[] fi = {786, 2375.663558, 3331.907425, 3925.896301, 19739, 44357.05585, 133317.7762, 196738, 3, 307349.9701, 2512352.887, 5751675.352, 19373323.76, 20492036.71, 44600583.79, 129141623, 199027846.1};
        ReduceFraction reduce = new ReduceFraction();
        double y12;



            //main
            y12 =0;
            for(int j=0; j<=16;j++){
                    double upperPartial =1;
                    double lowerPartial =1;
                    System.out.print(BigDecimal.valueOf(fi[j]) + " * [ {" );
                    for(int k =0;k<=16;k++){
                        if(j!=k){
                            upperPartial = Double.parseDouble(reduce.reduceFraction(upperPartial *(12-xi[k])));
                            System.out.print(" ( 12 - "+ xi[k]+ " ) ");
                        }
                    }
                    System.out.print(" } / {");
                    for(int k =0;k<=16;k++){
                        if(j!=k){

                            lowerPartial =  Double.parseDouble(reduce.reduceFraction(lowerPartial *(xi[j]-xi[k])));;
                            System.out.print(" ( "+xi[j]+ " - "+ xi[k] + " ) ");
                        }
                    }
                    System.out.print(" } ] + \n ");
                    y12 += fi[j] * (upperPartial/lowerPartial);

            }













            // others
            double y12a = 0;
        System.out.println("\n\nLine 2 ");
        for(int j=0; j<=16;j++){
            double upperPartial =1;
            double lowerPartial =1;
            System.out.print(BigDecimal.valueOf(fi[j]) + " * [ {" );
            for(int k =0;k<=16;k++){
                if(j!=k){
                    upperPartial = Double.parseDouble(reduce.reduceFraction(upperPartial *(12-xi[k])));
                    System.out.print(" ( "+ (12 - xi[k])+ " ) ");
                }
            }
            System.out.print(" } / {");
            for(int k =0;k<=16;k++){
                if(j!=k){
                    lowerPartial =  Double.parseDouble(reduce.reduceFraction(lowerPartial *(xi[j]-xi[k])));;
                    System.out.print(" ( "+(xi[j]- xi[k]) + " ) ");
                }
            }
            System.out.print(" } ] + \n ");


        }

        System.out.println("\n\nline 3 ");
        for(int j=0; j<=16;j++){
            double upperPartial =1;
            double lowerPartial =1;
            System.out.print(BigDecimal.valueOf(fi[j]) + " * [ {" );
            for(int k =0;k<=16;k++){
                if(j!=k){
                    upperPartial = Double.parseDouble(reduce.reduceFraction(upperPartial *(12-xi[k])));
                }
            }
            System.out.print(upperPartial +" } / {");
            for(int k =0;k<=16;k++){
                if(j!=k){
                    lowerPartial =  Double.parseDouble(reduce.reduceFraction(lowerPartial *(xi[j]-xi[k])));;
                }
            }
            System.out.print( lowerPartial +" } ] + \n ");
        }


        System.out.println("\n\nline 4 ");
        for(int j=0; j<=16;j++){
            double upperPartial =1;
            double lowerPartial =1;
            System.out.print(BigDecimal.valueOf(fi[j]) + " * " );
            for(int k =0;k<=16;k++){
                if(j!=k){
                    upperPartial = Double.parseDouble(reduce.reduceFraction(upperPartial *(12-xi[k])));
                }
            }
            for(int k =0;k<=16;k++){
                if(j!=k){

                    lowerPartial =  Double.parseDouble(reduce.reduceFraction(lowerPartial *(xi[j]-xi[k])));;
                }
            }
            System.out.print(  reduce.reduceFraction(upperPartial/lowerPartial) +"  \n ");
//            y12 += fi[j] * upperPartial;

        }








        System.out.println("\n y12 = "+ new BigDecimal(y12));


        System.out.println(reduce.reduceFraction(23250.545465664));

    }



//    28399457166367093948416
}
