public class TestaEmpresa {
    public static void main(String[] args){
        int quant_funcionarios=0;
        Funcionario empregado1, empregado2, empregado3;
        Empresa empresa_teste;

        empregado1 = new Funcionario();
        empregado2 =new Funcionario();
        empregado3 =new Funcionario();
        empresa_teste=new Empresa();

        empresa_teste.setNome("Amazon");
        empresa_teste.setCnpj("29.372.787/0002-74");

        empregado1.setDepartamento("Marketing");
        empregado1.setSalario(2550.50);
        empregado1.setRg("MG-90.631.398");
        empregado1.setData_de_entrada_dia(10);
        empregado1.setData_de_entrada_mes(2);
        empregado1.setData_de_entrada_ano(2007);
        empresa_teste.adiciona(empregado1, quant_funcionarios);
        empregado1.setQuant(quant_funcionarios++);


        empregado2.setDepartamento("Recursos Humanos");
        empregado2.setSalario(3700.0);
        empregado2.setRg("MG-32.430.422");
        empregado2.setData_de_entrada_dia(05);
        empregado2.setData_de_entrada_mes(6);
        empregado2.setData_de_entrada_ano(2005);
        empresa_teste.adiciona(empregado2, quant_funcionarios);
        quant_funcionarios++;

        empregado3.setDepartamento("Limpeza");
        empregado3.setSalario(1500.0);
        empregado3.setRg("MG-68.672.982");
        empregado3.setData_de_entrada_dia(15);
        empregado3.setData_de_entrada_mes(8);
        empregado3.setData_de_entrada_ano(2009);
        empresa_teste.adiciona(empregado3, quant_funcionarios);
        quant_funcionarios++;
        empresa_teste.mostra_empregado();
        System.out.println("OI");
    }
}
