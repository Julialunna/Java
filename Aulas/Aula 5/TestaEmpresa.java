public class TestaEmpresa {
    public static void main(String[] args){
        int quant_funcionarios=0;
        Funcionario empregado1, empregado2, empregado3;
        Empresa empresa_teste;

        empregado1 = new Funcionario();
        empregado2 =new Funcionario();
        empregado3 =new Funcionario();
        empresa_teste=new Empresa();

        empregado1.nome= "José da Silva";
        empregado1.departamento="Marketing";
        empregado1.salario=2550.50;
        empregado1.rg="MG-90.631.398";
        empregado1.data_de_entrada.dia=10;
        empregado1.data_de_entrada.mes=2;
        empregado1.data_de_entrada.ano=2007;
        empresa_teste.adiciona(empregado1, quant_funcionarios);
        empregado1.quant=quant_funcionarios++;

        empregado2.nome= "Ana Oliveira";
        empregado2.departamento="Recursos Humanos";
        empregado2.salario=3700;
        empregado2.rg="MG-32.430.422";
        empregado2.data_de_entrada.dia=05;
        empregado2.data_de_entrada.mes=6;
        empregado2.data_de_entrada.ano=2005;
        empresa_teste.adiciona(empregado2, quant_funcionarios);
        quant_funcionarios++;

        empregado3.nome= "Paula Matos";
        empregado3.departamento="Limpeza";
        empregado3.salario=1500;
        empregado3.rg="MG-68.672.982";
        empregado3.data_de_entrada.dia=15;
        empregado3.data_de_entrada.mes=8;
        empregado3.data_de_entrada.ano=2009;
        empresa_teste.adiciona(empregado3, quant_funcionarios);
        quant_funcionarios++;
        empresa_teste.mostra_empregado();
    }
}
