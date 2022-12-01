import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int comando=0, i=0;
        Restaurante BuchinhoCheio = new Restaurante();
        Scanner ler = new Scanner(System.in);

        BuchinhoCheio.setNome("Buchinho cheio");
        BuchinhoCheio.setEndereco("Rua Herança, 01");

        System.out.println("------------"+BuchinhoCheio.getNome()+"------------");
        System.out.println("Endereço: "+BuchinhoCheio.getEndereco()+"\n");

        do{
            System.out.println("------------MENU------------");
            System.out.println("1-Adicionar mesa");
            System.out.println("2-Fazer reserva");
            System.out.println("3-Adicionar cliente");
            System.out.println("4-Anotar pedido");
            System.out.println("5-Adicionar os 10% do garçom");
            System.out.println("6-Dividir a conta");
            System.out.println("0-Finalizar sistema");
            System.out.println("----------------------------");
            comando=ler.nextInt();

            switch(comando){
                case 1:
                Mesa mesaComando=new Mesa();
                System.out.println("Identificacao da mesa:");
                mesaComando.setNumeroMesa(ler.nextInt());
                BuchinhoCheio.adiciona_mesa(mesaComando);
                break;

                case 2:
                int identificadorMesa=0, indice=0, numPessoas=0;;
                System.out.println("Qual mesa deseja reservar: ");
                identificadorMesa=ler.nextInt();
                System.out.println("Quantas pessoas estarão na reserva: ");
                numPessoas=ler.nextInt();
                for(i=0;i<BuchinhoCheio.getMesas_geral().length;i++){
                    if(BuchinhoCheio.getMesas(i).getNumeroMesa()==identificadorMesa){
                        indice=i;
                    }
                }
                BuchinhoCheio.getMesas(indice).reservar(numPessoas);
                break;

                case 3:
                Cliente clienteDaReserva=new Cliente();
                int identificadorMesaCliente=0, indiceReserva=0;
                System.out.println("Qual é a mesa do cliente: ");
                identificadorMesaCliente=ler.nextInt();
                ler.nextLine();
                System.out.println("Nome do cliente: ");
                clienteDaReserva.setNome(ler.nextLine());
                System.out.println("E-mail do cliente: ");
                clienteDaReserva.setEmail(ler.nextLine());
                for(i=0;i<BuchinhoCheio.getMesas_geral().length;i++){
                    if(BuchinhoCheio.getMesas(i).getNumeroMesa()==identificadorMesaCliente){
                        indiceReserva=i;
                    }
                }
                BuchinhoCheio.getMesas(indiceReserva).adiciona_cliente(clienteDaReserva);
                break;

            }
        }while (comando!=0);

        for(i=0;i<BuchinhoCheio.getMesas_geral().length;i++){
            System.out.println(BuchinhoCheio.getMesas(i).getNumeroMesa());
            System.out.println(BuchinhoCheio.getMesas(i).getNumPessoas());
        }
        BuchinhoCheio.getMesas(0).listar_clientes();
        /*
         *  for(i=0;i<2;i++){
            vetor4[i]=vetor5[i];
        }
        for(i=2;i<4;i++){
            vetor4[i]=vetor5[i+1];
        }
        for(i=0;i<4;i++){
            System.out.println(vetor4[i]);
        }
         */
    }
}

    

