public class Disciplina {
    String nome;
    int num_alunos;
    Professor prof[];
    Avaliacao provas[];

    public Avaliacao getProvas(int i) {
        return provas[i];
    }
    public void setProvas(Avaliacao provas, int i) {
        this.provas[i] = provas;
    }
    public Professor getProf(int i) {
        return this.prof[i];
    }
    public void setProf(Professor prof, int i) {
        this.prof[i] = prof;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
   
    public int getNum_alunos() {
        return num_alunos;
    }
    public void setNum_alunos(int num_alunos) {
        this.num_alunos = num_alunos;
    }

    void adiciona_prof (Professor novo_professor){
        if(this.prof==null){
            this.prof=new Professor[1];
            this.setProf(novo_professor, 0);

        }else{
            Professor[] prof_reserva = new Professor[this.prof.length];
            for(int i=0; i<prof.length;i++){
                prof_reserva[i]=this.prof[i];
            }

            this.prof= new Professor[this.prof.length + 1];

            for(int i=0; i<prof.length-1;i++){
                this.setProf(prof_reserva[i], i);
            }

            setProf(novo_professor, this.prof.length-1);
        }
    }

    void adiciona_prova (Avaliacao novo_prova){
        if(this.provas==null){
            this.provas=new Avaliacao[1];
            this.setProvas(novo_prova, 0);

        }else{
            Avaliacao[] provas_reserva = new Avaliacao[this.provas.length];
            for(int i=0; i<provas.length;i++){
                provas_reserva[i]=this.provas[i];
            }

            this.provas= new Avaliacao[this.provas.length + 1];

            for(int i=0; i<provas.length-1;i++){
                this.setProvas(provas_reserva[i], i);
            }

            setProvas(novo_prova, this.provas.length-1);
        }
    }
    
    void imprime_disciplina (){
        System.out.println(getNome());
        System.out.println(getNum_alunos());
        for(int i=0;i<this.prof.length;i++){
            System.out.println(getProf(i).getNome());
        }
        for(int i=0;i<this.provas.length;i++){
            System.out.println(getProvas(i).getIdentificador());
        }
    }
}
