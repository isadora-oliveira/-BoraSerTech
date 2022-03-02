public class Veiculo {
    private String modelo;
    private String marca;
    private int ano;
    private int velocidadeMaxima;
    private String cor;
    private double valorFipe;

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public int getAno(){
        return this.ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }
    public void setVelocidadeMaxima(int velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public double getValorFipe(){
        return valorFipe;
    }
    public void setValorFipe(double valorFipe){
        this.valorFipe = valorFipe;
    }

    public void dadosVeiculo(){
        System.out.printf("Marca: %s", this.marca, "/n Modelo: %s", this.modelo, "/n Ano: %d", this.ano);
    }

    public void adicionaVelocidade(int velocidade){


        if(velocidade > this.velocidadeMaxima){
            dadosVeiculo();
            System.out.println("Velocidade acima do valor permitido para o veículo! /n");
        }else{
            System.out.printf("Estou acelerando %d km/h /n", velocidade);
        }
    }
    public void frea(){
        System.out.printf("Estou freando o veículo: %s", this.modelo);
    }

    @Override
    public String toString(){
        return "Modelo: " + this.modelo +
                ", Marca: " + this.marca +
                ", Cor: " + this.cor +
                ", Ano: " + this.ano +
                ", Velocidade Máxima: " + this.velocidadeMaxima +
                ", Valor FIPE: " + this.valorFipe;
    }
}
