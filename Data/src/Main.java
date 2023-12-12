public class Main {
    public static void main(String[] args) {
        Data data1 = new Data(22,11,2023);
        Data data2 = new Data(21,11,2023);
        data1.obterDataFormatada();
        boolean antes = data1.antes(new Data(21, 11, 2022));
        System.out.println(antes);
        System.out.println(data1.equals(data2));
    }
}