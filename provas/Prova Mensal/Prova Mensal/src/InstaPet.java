public class InstaPet {
    private Usuario users[];
    public Usuario[] getUsers_vet() {
        return users;
    }
    public void setUsers_vet(Usuario[] users) {
        this.users = users;
    }
    public Usuario getUsers(int i) {
        return users[i];
    }
    public void setUsers(Usuario users, int i) {
        this.users[i] = users;
    }

    public void cadastra_usuarios(String nome, String email){
        if(this.users==null){
            Usuario novo_usuario= new Usuario();
            this.users=new Usuario[1];
            novo_usuario.setNome(nome);
            novo_usuario.setEmail(email);
            this.setUsers(novo_usuario, 0);

        }else{
            Usuario[] users_reserva = new Usuario[this.users.length];
            for(int i=0; i<users.length;i++){
                users_reserva[i]=this.getUsers(i);
            }

            this.users= new Usuario[this.users.length + 1];

            for(int i=0; i<users.length-1;i++){
                this.setUsers(users_reserva[i], i);
            }
            Usuario novo_usuario= new Usuario();
            novo_usuario.setNome(nome);
            novo_usuario.setEmail(email);
            this.setUsers(novo_usuario, this.users.length-1);
        }
    }

    public void cadastra_foto(String email, String link, String descricao){
        int posicao_usuario=0;
        for (int i=0;i<this.users.length;i++){
            if(getUsers(i).getEmail()==email){
                posicao_usuario=i;
            }
        }
        this.getUsers(posicao_usuario).cadastra_fotos(link, descricao);
        System.out.println(posicao_usuario);
    }

    public int quant_pets (String email){
        System.out.println("Quantidade de pets:");
        int posicao_usuario=0, quant_pets=0;
        for (int i=0;i<this.users.length;i++){
            if(getUsers(i).getEmail()==email){
                posicao_usuario=i;
            }
        }
        if(this.users[posicao_usuario].getPublicacoes_vet()==null){
            quant_pets=0;
        }else{
            quant_pets=this.getUsers(posicao_usuario).getPublicacoes_vet().length;
        }
        System.out.println("quant pets "+quant_pets);
        return quant_pets;
    }

    public int quant_usuarios(){
        System.out.println("Quantidade de usuarios:");
        int quant_usuarios=0;
        for(Usuario x: users){
            quant_usuarios++;
        }
        System.out.println(quant_usuarios);
        return quant_usuarios;
    }

    public Fotos[] listar_pets(String email){
        System.out.println("Listagem de pets:");
        int posicao_usuario=0;
        int i=0;
        for (i=0;i<this.users.length;i++){
            if(this.getUsers(i).getEmail()==email){
                posicao_usuario=i;
            }
        }
        this.getUsers(posicao_usuario).imprime_fotos();
        return this.getUsers(posicao_usuario).getPublicacoes_vet();
    }

    public Usuario[] listar_usuarios (){
        System.out.println("Listagem de usuarios:");
        for (int i=0;i<this.users.length;i++){
            System.out.println(this.getUsers(i).getNome());
            System.out.println(this.getUsers(i).getEmail());
        }
        return this.users;
    }

    public void altera_descricao (String email, int n, String nova_desc){
        int posicao_usuario =0;
        for (int i=0;i<this.users.length;i++){
            if(getUsers(i).getEmail()==email){
                posicao_usuario=i;
            }
        }

        this.getUsers(posicao_usuario).altera_descricao(n, nova_desc);
    }
}