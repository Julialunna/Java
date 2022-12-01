import java.util.Scanner; 
public class Testes {
    public static void main(String[] args) {
        Funcionario teste;

        teste=new Funcionario();

        Testes.testando(teste);
    }

    public static void mostra(Funcionario f){
        System.out.println(f.getNome());
        System.out.println(f.getDepartamento());
        System.out.println(f.getSalario());
        System.out.println(f.getData_de_entrada_dia());
        System.out.println(f.getData_de_entrada_mes());
        System.out.println(f.getData_de_entrada_ano());
        System.out.println(f.getRg());
        System.out.println(f.getIdentificador_individual());
    }
    public static void testando(Funcionario teste){
        Scanner ler = new Scanner(System.in);

        System.out.println("Departamento: ");
        teste.setDepartamento(ler.nextLine());
        System.out.println("RG: ");
        teste.setRg(ler.nextLine());
        System.out.println("Salario: ");
        teste.setSalario(ler.nextDouble());
        //System.out.println("Data de entrada: ");
        //teste.setData_de_entrada_dia(ler.nextInt());
        //teste.setData_de_entrada_mes(ler.nextInt());
        //teste.setData_de_entrada_ano(ler.nextInt());
        mostra(teste);
    }

    public static void testes_referencia(){
        Funcionario f1;
        Funcionario f2;
        Funcionario f3;

        f1=new Funcionario();
        f2=new Funcionario();
        f3=new Funcionario();

        f1.setNome("Carlos");
        f1.setDepartamento("Marketing");
        f2.setNome("Carlos");
        f2.setDepartamento("Marketing");

        if(f1==f2){
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }
        
        f3=f1;
        if(f1==f3){
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }
    }
}
