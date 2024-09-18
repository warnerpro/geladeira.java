package geladeira;

public class Geladeira {
    private int temperatura;
    private String cor;
    private String marca;
    private String modelo;

    Geladeira() {
        temperatura = 10;
        cor = "Branca";
        marca = "Electrolux";
        modelo = "E130";
    }

    Geladeira(int t, String c, String m, String model) {
        temperatura = t;
        cor = c;
        marca = m;
        modelo = model;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int t) {
        this.temperatura = t;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static void main(String[] args) {
        Geladeira geladeira1 = new Geladeira();
        System.out.println("A geladeira é da marca " + geladeira1.getMarca());
        System.out.println("Modelo: " + geladeira1.getModelo());
    }
}

