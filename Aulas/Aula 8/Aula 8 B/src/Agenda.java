import java.util.Scanner;
public class Agenda {
    private Pessoa[] pessoas;
    private int quantAmigos;
    private int quantConhecidos;

    public Pessoa[] getPessoasGeral() {
        return pessoas;
    }
    public void setPessoasGeral(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }
    public Pessoa getPessoas(int i) {
        return pessoas[i];
    }
    public void setPessoas(Pessoa pessoas, int i) {
        this.pessoas[i] = pessoas;
    }
    public void setPessoasAmigos(Amigo pessoas, int i) {
        this.pessoas[i] = pessoas;
    }
    public void setPessoasConhecidos(Conhecido pessoas, int i) {
        this.pessoas[i] = pessoas;
    }
    public int getQuantAmigos() {
        return quantAmigos;
    }
    public String getData(Amigo amigo){
        return amigo.getDataDeAniversario();
    }
    public void setQuantAmigos(int quantAmigos) {
        this.quantAmigos = quantAmigos;
    }
    public int getQuantConhecidos() {
        return quantConhecidos;
    }
    public void setQuantConhecidos(int quantConhecidos) {
        this.quantConhecidos = quantConhecidos;
    }

    public Agenda(int numPessoa){
        this.pessoas=new Pessoa[numPessoa];
        int comando=0;
        for(int i=0;i<this.pessoas.length;i++){
            comando = 1+(int)(Math.random()*2);
            if(comando==1){
                pessoas[i]=new Amigo();
                this.setQuantAmigos(getQuantAmigos()+1);
            }else if(comando==2){
                pessoas[i]=new Conhecido();
                this.setQuantConhecidos(this.getQuantConhecidos()+1);
            }
        }

        for(int j=0;j<this.pessoas.length;j++){
            if(this.pessoas[j] instanceof Amigo){
                System.out.println("Amigo");
            }else if(this.pessoas[j] instanceof Conhecido){
                System.out.println("Conhecido");
            }
        }
    }
    public void addInformacoes(){
        Scanner ler = new Scanner(System.in);
        int comando=0, indice=0, cadastrou=0;
        String lixo;

        for(int i=0;i<this.pessoas.length;i++){
            System.out.println("A pessoa a ser cadastrada é amigo (1) ou conhecido (2): ");
            comando=ler.nextInt();
            if(comando==1){
                for(int j=0;j<this.getPessoasGeral().length;j++){
                    if(this.getPessoas(j) instanceof Amigo&&this.getPessoas(j).getIdade()==0){
                        Amigo amigoCadastrado=(Amigo)this.pessoas[j];
                        ler.nextLine();
                        System.out.println("Indique o nome do amigo: ");
                        amigoCadastrado.setNome(ler.nextLine());
                        System.out.println("Indique a idade do amigo: ");
                        amigoCadastrado.setIdade(ler.nextInt());
                        ler.nextLine();
                        System.out.println("Indique o aniversario do amigo: ");
                        amigoCadastrado.setDataDeAniversario(ler.nextLine());
                        cadastrou++;
                        break;
                    }
                }
                if(cadastrou==0){
                    System.out.println("Não há mais espaço para amigos");
                    i--;
                    
                }else{
                    cadastrou=0;
                }
            }else if(comando==2){
                for(int j=0;j<this.getPessoasGeral().length;j++){
                    if(this.getPessoas(j) instanceof Conhecido&&this.getPessoas(j).getIdade()==0){
                        System.out.println("entrou");
                        Conhecido conhecidoCadastrado=(Conhecido)this.pessoas[j];
                        System.out.println("Indique o nome do conhecido: ");
                        ler.nextLine();
                        conhecidoCadastrado.setNome(ler.nextLine());
                        System.out.println("Indique a idade do conhecido: ");
                        conhecidoCadastrado.setIdade(ler.nextInt());
                        ler.nextLine();
                        System.out.println("Indique o email do conhecido: ");
                        conhecidoCadastrado.setEmail(ler.nextLine());
                        cadastrou++;
                        break;
                    }
                }
                if(cadastrou==0){
                    System.out.println("Não há mais espaço para conhecidos");
                    i--;
                }else{
                    cadastrou=0;
                }
            }
        }
        
    }

    void exibeData(Amigo a){
        System.out.println(a.getDataDeAniversario());
    }

    void exibeEmail(Conhecido b){
        System.out.println(b.getEmail());
    }

    public void exibe(){
        for(int i=0;i<this.getPessoasGeral().length;i++){
            System.out.println(this.getPessoas(i).getNome());
            System.out.println(this.getPessoas(i).getIdade());
            if(this.getPessoas(i) instanceof Amigo){
                Amigo a= (Amigo)this.getPessoas(i);
                exibeData(a);
            }else if(this.getPessoas(i) instanceof Conhecido){
                Conhecido b = (Conhecido)this.getPessoas(i);
                exibeEmail(b);
            }
        }
    }
}
