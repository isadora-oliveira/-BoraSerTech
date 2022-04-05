public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;

    public double getValorCredito(){
        return this.valorCredito;
    }
    public void setValorCredito(double valorCredito){
        this.valorCredito = valorCredito;
    }
    public double getValorDivida(){
        return this.valorDivida;
    }
    public void setValorDivida(double valorDivida){
        this.valorDivida = valorDivida;
    }
    public void obtemSaldo(){
        double saldo = this.valorCredito - this.valorDivida;
        System.out.println("Seu saldo é de: R$ " + saldo);
    }

    @Override
    public String toString() {
        return "Fornecedor: \n" +
                "\nNome: "+ this.getNome() +
                "\nTelefone: "+ this.getTelefone() +
                "\nEndereço: " + this.getEndereco() +
                "\nValor do Crédito: R$ " + this.valorCredito +
                "\nValor da Dívida: R$ " + this.valorDivida;
    }
}

