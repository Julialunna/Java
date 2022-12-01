public class Empresa {
    private String nome;
    private String cnpj;
    Funcionario[] empregados = new Funcionario[2]; 
    private int quantidade_atual;

    public void setNome (String nome){
        this.nome=nome;
    }
    public String getNome (){
        return this.nome;
    }
    public void setCnpj (String cnpj){
        this.cnpj=cnpj;
    }
    public String getCnpj (){
        return this.cnpj;
    }
    public void setQuantidade_atual (int quantidade_atual){
        this.quantidade_atual=quantidade_atual;
    }
    public int getQuantidade_atual (int quantidade_atual){
        return this.quantidade_atual;
    }
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
           System.out.println("Nome: " +empregados[i].getNome());
           System.out.println("Departamento: " +empregados[i].getDepartamento());
           System.out.println("RG: " +empregados[i].getRg());
           System.out.println("Salario: " +empregados[i].getSalario());
           System.out.print("Data de entrada: " +empregados[i].getData_de_entrada_dia());
           System.out.print("/" +empregados[i].getData_de_entrada_mes());
           System.out.println("/" +empregados[i].getData_de_entrada_ano());
           System.out.println("Identificador: " +empregados[i].getIdentificador_individual());
        }
    }
        
}
