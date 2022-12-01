public class Usuario {
    private String nome;
    private String email;
    private Fotos[] publicacoes;

    public Fotos[] getPublicacoes_vet() {
        return publicacoes;
    }

    public void setPublicacoes_vet(Fotos[] publicacoes) {
        this.publicacoes = publicacoes;
    }

    public Fotos getPublicacoes(int i) {
        return publicacoes[i];
    }
    public void setPublicacoes(Fotos imagens, int i) {
        this.publicacoes[i] = imagens;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void cadastra_fotos (String link, String desc){
        if(this.publicacoes==null){
            Fotos publicacao= new Fotos();
            this.publicacoes=new Fotos[1];
            publicacao.setUrl(link);
            publicacao.setDescricao(desc);
            this.setPublicacoes(publicacao, 0);

        }else{
            Fotos[] publicacoes_reserva = new Fotos[this.publicacoes.length];
            for(int i=0; i<publicacoes.length;i++){
                publicacoes_reserva[i]=this.getPublicacoes(i);
            }

            this.publicacoes= new Fotos[this.publicacoes.length + 1];

            for(int i=0; i<publicacoes.length-1;i++){
                this.setPublicacoes(publicacoes_reserva[i], i);
            }
            Fotos publicacao= new Fotos();
            publicacao.setUrl(link);
            publicacao.setDescricao(desc);
            this.setPublicacoes(publicacao, this.publicacoes.length-1);
        }
    }

    public void altera_descricao (int n, String nova_desc){
        this.getPublicacoes(n).setDescricao(nova_desc);
    }

    public void imprime_fotos(){
        System.out.println(this.email);
        if(this.publicacoes!=null){

            for (int i=0;i<this.publicacoes.length;i++){
                System.out.println(getPublicacoes(i).getUrl());
                System.out.println(getPublicacoes(i).getDescricao());
            }
        }
        
    }
}