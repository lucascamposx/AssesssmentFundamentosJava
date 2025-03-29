package org.example.Exercicio06;

public class Veiculo {
    String placa;
    String modelo;
    int anoFabricacao;
    double quilometragem;

    public Veiculo (String placa, String modelo, int anoFabricacao, double quilometragem){
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    public void exibirDetalhes(){
        System.out.println("\n### Detalhes Veiculo ###");
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricação: " + anoFabricacao);
        System.out.println("Quilometragem: " + quilometragem);
    }

    public void registrarViagem(double km){
        if(km >= 0) {
            quilometragem += km;
        } else {
            System.out.println("Erro: Quilometragem nao pode ser negativa.");
        }
    }

    public static void main(String[] args) {
        Veiculo fiesta = new Veiculo("PDZ1A00","New Fiesta", 2018, 158.23);
        Veiculo civic = new Veiculo("LDS0A20","Civic SI", 2025, 0.0);

        fiesta.registrarViagem(50.00);
        civic.registrarViagem(15.20);

        fiesta.exibirDetalhes();
        civic.exibirDetalhes();
    }
}
