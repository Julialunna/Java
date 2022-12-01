public class Empresa {
    String nome;
    String cnpj;
    Funcionario[] empregados = new Funcionario[2]; 
    int quantidade_atual;


    public void mais_funcionario(int tamanho){
        Funcionario[] empregados_reserva=new Funcionario[tamanho];
        int i;
        for(i=0;i<empregados_reserva.length;i++){
            empregados_reserva[i]=this.empregados[i];
        }
        this.empregados=new Funcionario [tamanho+1];
        for(i=0;i<empregados_reserva.length;i++){
            this.empregados[i]=empregados_reserva[i];
        }
    }
    public void adiciona(Funcionario f, int posicao){
        if(posicao>this.empregados.length-1){
            mais_funcionario(posicao);
            this.empregados[posicao]=f;
        }else{
            this.empregados[posicao]=f;
        }
    }
    public void mostra_empregado(){
        int i;
        for(i=0; i<empregados.length;i++){
            if (empregados[i]==null){
                break;
            }
           System.out.println("Funcionario: "+i);
           System.out.println("Nome: " +empregados[i].nome);
           System.out.println("Departamento: " +empregados[i].departamento);
           System.out.println("RG: " +empregados[i].rg);
           System.out.println("Salario: " +empregados[i].salario);
           System.out.print("Data de entrada: " +empregados[i].data_de_entrada.dia);
           System.out.print("/" +empregados[i].data_de_entrada.mes);
           System.out.println("/" +empregados[i].data_de_entrada.ano);
        }
    }
        
}
