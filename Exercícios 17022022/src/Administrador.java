public class Administrador extends Empregado{
    private float ajudaDeCusto;
    private float salarioAdministrador;

    public float getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public float getSalarioAdministrador() {
        return salarioAdministrador;
    }

    public void setAjudaDeCusto(float ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public void setSalarioAdministrador(float salarioAdministrador) {
        this.salarioAdministrador = salarioAdministrador;
    }

    @Override
    public void calculaSalario() {
        if((this.salarioBase + this.ajudaDeCusto)<=2500){
            this.imposto = (this.salarioBase / 100) * 0;
        }else if(this.salarioBase >2500&&this.salarioBase <=3200){
            this.imposto = (float) ((this.salarioBase / 100) * 7.5);
        }else if(this.salarioBase >3200&&this.salarioBase <=4250){
            this.imposto = (this.salarioBase / 100) * 15;
        }else if(this.salarioBase >4250&&this.salarioBase <=5300){
            this.imposto = (float) ((this.salarioBase / 100) * 22.5);
        }else{
            this.imposto = (float) ((this.salarioBase / 100) * 27.5);
        }
        salarioAdministrador = this.getSalarioBase() - this.getImposto();

        System.out.println("Salário: " +
                "\n Valor bruto: R$ "+ this.getSalarioBase() +
                "\n Valor imposto: R$ "+ this.getImposto() +
                "\n Valor líquido: R$ " + this.salarioAdministrador);
    }


    @Override
    public String toString() {
        return "Dados do Administrador: " +
                "\nNome: " + this.getNome() +
                "\nTelefone: " + this.getTelefone() +
                "\nEndereço: " + this.getEndereco() +
                "\nCódigo Setor: " + this.getCodigoSetor() +
                "\nSalario base:R$ " + this.getSalarioBase() +
                "\nImposto calculado: " + (this.getImposto() * 100) / this.getSalarioBase() + "%" +
                "\nAjuda de Custo: R$ " + this.ajudaDeCusto;
    }
}
