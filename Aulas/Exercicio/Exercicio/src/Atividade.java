public class Atividade {
    public static void main(String[] args) throws Exception {

        Disciplina OCSlab = new Disciplina();
        Disciplina AEDs = new Disciplina();
        Disciplina TP = new Disciplina();
        Professor Honda = new Professor();
        Professor Virgina = new Professor();
        Avaliacao teste1 = new Avaliacao();
        Avaliacao teste2 = new Avaliacao();

        OCSlab.setNome("OCSlab");
        AEDs.setNome("AEDs");
        TP.setNome("TP");

        OCSlab.setNum_alunos(26);
        AEDs.setNum_alunos(26);
        TP.setNum_alunos(22);

        Honda.setNome("Honda");
        Virgina.setNome("Virginia");

        Honda.setMatricula(202250);
        Virgina.setMatricula(202240);

        Honda.setEscolaridade("Mestrado");
        Virgina.setEscolaridade("Doutorado");

        Honda.adiciona_materia(OCSlab);
        Virgina.adiciona_materia(TP);
        Virgina.adiciona_materia(AEDs);

        OCSlab.adiciona_prof(Honda);
        TP.adiciona_prof(Virgina);
        AEDs.adiciona_prof(Virgina);

        teste1.setIdentificador(1);
        teste2.setIdentificador(2);
        
        OCSlab.adiciona_prova(teste1);
        OCSlab.adiciona_prova(teste2);

        TP.adiciona_prova(teste1);
        TP.adiciona_prova(teste2);

        AEDs.adiciona_prova(teste1);
        AEDs.adiciona_prova(teste2);

        //OCSlab.imprime_disciplina();
        //TP.imprime_disciplina();
        //AEDs.imprime_disciplina();

        Virgina.imprime_professor();
        Honda.imprime_professor();
    }
}
