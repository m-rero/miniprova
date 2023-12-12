public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String diaS;
    private String mesS;
    private String anoS;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String obterDataFormatada(){
        if (dia<=9){
            diaS = "0"+ dia;
        } else {
            diaS = String.valueOf(dia);
        }
        if (mes<=9){
            mesS = "0"+ mes;
        } else {
            mesS = String.valueOf(mes);
        }
        anoS = String.valueOf(ano);
        return System.out.printf("%s/%s/%s\n", diaS, mesS, anoS).toString();
    }
    public boolean antes(Data outraData){
        if (outraData.getAno() < getAno()){
            return true;
        } else if (outraData.getAno() > getAno()) {
            return false;
        } else if (outraData.getMes() < getMes()) {
            return  true;
        } else if (outraData.getMes() > getMes()) {
            return false;
        } else return outraData.getDia() < getDia();

    }
    public boolean depois(Data outraData){
        if (outraData.getAno() > getAno()){
            return true;
        } else if (outraData.getAno() < getAno()) {
            return false;
        } else if (outraData.getMes() > getMes()) {
            return  true;
        } else if (outraData.getMes() < getMes()) {
            return false;
        } else return outraData.getDia() > getDia();

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(getAno())==obj.equals(getAno()) && super.equals(getMes())== obj.equals(getMes())
                && super.equals(getDia()) == obj.equals(getDia());
    }
}
