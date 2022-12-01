import java.util.Scanner; 
public class Data {
    int dia;
    int mes;
    int ano;
    Scanner ler = new Scanner(System.in);

    Data(){
        int dia=0, mes=0, ano=0;
        System.out.println("Qual a data:");
        dia=ler.nextInt();
        mes=ler.nextInt();
        ano=ler.nextInt();
        if (dia!=31&&mes!=2&&ano!=2012){
            this.dia=dia;
            this.mes=mes;
            this.ano=ano;
        }else{
            System.out.println("Nao eh possivel utilizar essa data");
        }
    }
}
