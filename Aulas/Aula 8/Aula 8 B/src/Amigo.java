public class Amigo extends Pessoa {
    protected String dataDeAniversario;

    public String getDataDeAniversario() {
        return dataDeAniversario;
    }

    public void setDataDeAniversario(String dataDeAniversario) {
        this.dataDeAniversario = dataDeAniversario;
    }

    public Amigo(){
        this.setDataDeAniversario("Indefinido");
    }
}
