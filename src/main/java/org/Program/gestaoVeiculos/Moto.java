package org.Program.gestaoVeiculos;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String placa, String marca, double preco, int cilindradas) {
        super(placa, marca, preco);
        this.cilindradas = cilindradas;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("CC: " + cilindradas);
    }

    public void mostrarDados(boolean emCavalos) {
        System.out.println("CC: " + cilindradas);
        System.out.println("HP: " + (cilindradas / 15));
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
