public class Professor {
    String nome;
    String escolaridade;
    int matricula;
    Disciplina materia[];

    public Disciplina getMateria(int i) {
        return materia[i];
    }
    public void setMateria(Disciplina materia, int i) {
        this.materia[i] = materia;
    }
    public void setNome (String nome){
        this.nome=nome;
    }
    public String getNome (){
        return this.nome;
    }

    public void setEscolaridade (String escolaridade){
        this.escolaridade=escolaridade;
    }
    public String getEscolaridade (){
        return this.escolaridade;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    } 


    void adiciona_materia (Disciplina nova_disciplina){
        if(this.materia==null){
            this.materia=new Disciplina[1];
            this.setMateria(nova_disciplina, 0);

        }else{
            Disciplina[] materia_reserva = new Disciplina[this.materia.length];
            for(int i=0; i<this.materia.length;i++){
                materia_reserva[i]=this.materia[i];
            }

            this.materia= new Disciplina[this.materia.length + 1];

            for(int i=0; i<this.materia.length-1;i++){
                this.setMateria(materia_reserva[i], i);
            }

            this.setMateria(nova_disciplina, this.materia.length-1);
        }
    }

    void imprime_professor (){
        System.out.println(this.getNome());
        System.out.println(this.getMatricula());
        System.out.println(this.getEscolaridade());
        for (int i=0;i<this.materia.length;i++){
            System.out.println(this.getMateria(i).getNome());
        }
    }
}
