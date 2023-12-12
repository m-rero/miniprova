import java.util.Random;

public class Dadolancamento {
    private int numero;
    private double um = 0; private double dois = 0; private double tres = 0; private double quatro = 0;
    private double cinco = 0; private double seis = 0; private int total = 0;
    public void lancar(){
        Random random = new Random();
        for(int i = 0; i < 100000; i++){
            numero = random.nextInt(6)+1;
            total++;
            if (numero == 1){
                um++;
            } else if (numero == 2) {
                dois++;
            } else if (numero == 3) {
                tres++;
            } else if (numero == 4) {
                quatro++;
            } else if (numero == 5) {
                cinco++;
            } else {
                seis++;
            }
        }
        System.out.printf("Proporção de cada fase sorteada{ um = %.4f, dois = %.4f, três = %.4f, quatro = %.4f, cinco = %.4f, seis = %.4f",
                (um/total*100), (dois/total*100), (tres/total*100), (quatro/total*100), (cinco/total*100), (seis/total*100));
    }

    @Override
    public String toString() {
        return "Proporção de cada fase sorteada{" +
                "um = " + um/total*100 + "%" +
                ", dois = " + dois/total*100 + "%" +
                ", tres = " + tres/total*100 + "%" +
                ", quatro = " + quatro/total*100 + "%" +
                ", cinco = " + cinco/total*100 + "%" +
                ", seis = " + seis/total*100 + "%" + '}';
    }
}
