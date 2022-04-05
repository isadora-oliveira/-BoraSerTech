public class Empregado extends Pessoa {
    protected int codigoSetor;
    protected float salarioBase;
    protected float imposto;
    private float salario;

    public int getCodigoSetor() {
        return this.codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public float getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getImposto() {
        return this.imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void calculaSalario(){
        if(this.salarioBase<=2500){
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

        salario = this.salarioBase - this.imposto;

        System.out.println("Salário: " +
                "\n Valor bruto: R$ "+ this.salarioBase +
                "\n Valor imposto: R$ "+ this.imposto +
                "\n Valor líquido: R$ " + salario);
    }

    @Override
    public String toString() {
        return "Dados do Empregado: " +
                "\n Nome: " + this.getNome() +
                "\n Telefone: " + this.getTelefone() +
                "\n Endereço: " + this.getEndereco() +
                "\n Código Setor: " + this.codigoSetor +
                "\n Salário Base: " + this.salarioBase +
                "\n Imposto Calculado: " + (this.imposto * 100) / this.salarioBase + "%";
    }
}
