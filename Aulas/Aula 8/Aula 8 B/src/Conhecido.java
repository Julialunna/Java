public class Conhecido extends Pessoa {
    protected String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Conhecido(){
        this.setEmail("Indefinido");
    }
}
