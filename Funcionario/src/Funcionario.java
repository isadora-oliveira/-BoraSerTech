/**
 *
 * @author Sunflower98
 */
public class Funcionario {
    private String nome;
    private String sobrenome;
    private String cidade;
    private String estado;
    private double horasTrabalhadas;
    private double valorHora;

    public Funcionario(String nome, String sobrenome, String cidade, String estado, double horasTrabalhadas, double valorHora){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cidade = cidade;
        this.estado = estado;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    Funcionario() {

    }

    public String getNome(){

        return this.nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }
    public String getSobrenome(){

        return this.sobrenome;
    }
    public void setSobrenome(String sobrenome){

        this.sobrenome = sobrenome;
    }
    public String getCidade(){

        return this.cidade;
    }
    public void setCidade(String cidade){

        this.cidade = cidade;
    }
    public String getEstado(){

        return this.estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public double getHorasTrabalhadas(){

        return this.horasTrabalhadas;
    }
    public void setHorasTrabalhadas(double horasTrabalhadas){

        this.horasTrabalhadas = horasTrabalhadas;
    }
    public double getValorHora(){

        return this.valorHora;
    }
    public void setValorHora(double valor_hora){
        this.valorHora = valor_hora;
    }

    public void exibeNomeSobrenome(){
        System.out.println("Funcionário: " +this.nome + "" + this.sobrenome);
    }

    public void incrementaHorasTrabalhadas(double horasTrabalhadas){
        System.out.println("Saldo horas trabalhadas: " + this.horasTrabalhadas);
        this.horasTrabalhadas += horasTrabalhadas;
        System.out.println("HE adicionadas: " + horasTrabalhadas);
        System.out.println("Saldo final de horas trabalhadas: " + this.horasTrabalhadas);
    }

    public void calculaSalario(){
        double salario = this.horasTrabalhadas * this.valorHora;
        System.out.println("Salário final do mês:R$ " + salario);
    }
    public void alteraValorHora(double novoValorHora){
        System.out.println("Valor Hora atual: " + this.valorHora);
        this.valorHora = novoValorHora;
        System.out.println("Novo valor hora: " + this.valorHora);
    }




}


