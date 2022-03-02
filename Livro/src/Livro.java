
public class Livro {
        private String titulo;
        private String nomeLeitor;
        private double paginasTotal;
        private double paginasLidas;

        public String getTitulo (){
            return  this.titulo;
        }
        public void setTitulo(String titulo){
            this.titulo = titulo;
        }

        public String getNomeLeitor() {
            return this.nomeLeitor;
        }

        public void setNomeLeitor(String nomeLeitor) {
            this.nomeLeitor = nomeLeitor;
        }
        public double getPaginasTotal(){
            return this.paginasTotal;
        }
        public void setPaginasTotal(double paginasTotal){
            this.paginasTotal = paginasTotal;
        }
        public double getPaginasLidas(){
            return this.paginasLidas;
        }
        public void setPaginasLidas(double paginasLidas){
            this.paginasLidas = paginasLidas;
        }

        public void porcentagemLeitura(){

            double progressoLeitura = (this.paginasLidas*100)/this.paginasTotal;
            System.out.printf("Parabéns! Você já leu: %.1f %% do seu livro!", progressoLeitura);

        }
    }
