import java.util.Scanner; 
public class Funcionario {
     private String nome;
     private String departamento;
     private Double salario;
     private Data data_de_entrada;
     private String rg;
     private int quant;
     private int identificador_individual;
     private static int identificador;

    Funcionario (){
        int controle=0;
        Scanner ler = new Scanner(System.in);

        System.out.println("Deseja que o funcionario tenha nome? 1-sim ou 2-nao?");
        controle=ler.nextInt();

        Funcionario.identificador++;
        this.setIdentificador_individual(getIdentificador());

        if (controle==1){
            System.out.println("Nome: ");
            this.setNome(ler.next());
        }else if (controle==2){
            System.out.println("okay");
        }else{
            System.out.println("nao deu");
        }
        data_de_entrada=new Data();

    }

    public void setNome (String nome){
        this.nome=nome;
    }
    public String getNome (){
        return this.nome;
    }
    public void setDepartamento (String departamento){
        this.departamento=departamento;
    }
    public String getDepartamento (){
        return this.departamento;
    }
    public void setSalario (double salario){
        this.salario=salario;
    }
    public double getSalario (){
        return this.salario;
    }
    public void setData_de_entrada_dia (int data_de_entrada_dia){
        this.data_de_entrada.dia=data_de_entrada_dia;
    }
    public int getData_de_entrada_dia (){
        return this.data_de_entrada.dia;
    }
    public void setData_de_entrada_mes (int data_de_entrada_mes){
        this.data_de_entrada.mes=data_de_entrada_mes;
    }
    public int getData_de_entrada_mes (){
        return this.data_de_entrada.mes;
    }
    public void setData_de_entrada_ano (int data_de_entrada_ano){
        this.data_de_entrada.ano=data_de_entrada_ano;
    }
    public int getData_de_entrada_ano (){
        return this.data_de_entrada.ano;
    }
    public void setRg (String rg){
        this.rg=rg;
    }
    public String getRg (){
        return this.rg;
    }
    public void setQuant (int quant){
        this.quant=quant;
    }
    public double getQuant (){
        return this.quant;
    }
    public void setIdentificador (int identificador){
        Funcionario.identificador=identificador;
    }
    public int getIdentificador (){
        return Funcionario.identificador;
    }
    public void setIdentificador_individual (int identificador_individual){
        this.identificador_individual=identificador_individual;
    }
    public double getIdentificador_individual (){
        return this.identificador_individual;
    }
}

