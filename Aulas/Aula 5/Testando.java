public class Testando {
    public static void main(String[] args) {
        Casa casa_teste;
        casa_teste=new Casa();

        Porta porta1;
        Porta porta2;
        Porta porta3;
        porta1=new Porta();
        porta2=new Porta();
        porta3=new Porta();

        casa_teste.pinta("Branco");

        porta1.identificador="Porta 1";
        porta1.cor="Preta";
        porta1.esta_aberta=true;
        casa_teste.adiciona_porta(porta1);

        porta2.identificador="Porta 2";
        porta2.cor="Marrom";
        porta2.esta_aberta=false;
        casa_teste.adiciona_porta(porta2);

        porta3.identificador="Porta 3";
        porta3.cor="Branca";
        porta3.esta_aberta=true;
        casa_teste.adiciona_porta(porta3);

        casa_teste.mostra_porta();
        casa_teste.mostra_total_de_portas();
        casa_teste.quantasPortasEstaoAbertas();
    }
}
