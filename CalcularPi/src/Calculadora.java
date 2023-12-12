import static java.lang.Math.round;

public class Calculadora {
    private int base;
    private double pi; private String piString;
    public void calcularPi(){
        pi = 4;
        base = 3;
        for (int i = 0; i < (200000/2)-1; i++) {
            pi+= -1 * ((double) 4 /base);
            base+=2;
            pi+= ((double) 4 /base);
            base+=2;
            piString = String.valueOf(pi);
        }
        System.out.println(pi);
    }
    public void chegarValor(){
        pi = 4;
        base = 3;
        for (int i = 0; i < (200000/2)-1; i++) {
            pi+= -1 * ((double) 4 /base);
            base+=2;
            pi+= ((double) 4 /base);
            base+=2;
            piString = String.valueOf(pi);
            if(piString.startsWith("3,14159")){
                System.out.println(i);
                break;
            }
        }
        System.out.println(pi);
    }
}
