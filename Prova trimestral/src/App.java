import java.util.Scanner;
public class App {
    //Júlia Almeida Luna Lorena Ricoy Martins
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
            System.out.println("5-Listar pedido");
            System.out.println("6-Adicionar os 10% do garçom");
            System.out.println("7-Dividir a conta");
            System.out.println("8-Finalizar reserva");
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

                case 4:
                int idMesa=0, indiceDaReserva=0;
                System.out.println("Deseja anotar pedido de qual mesa: ");
                idMesa=ler.nextInt();
                ler.nextLine();
                for(i=0;i<BuchinhoCheio.getMesas_geral().length;i++){
                    if(BuchinhoCheio.getMesas(i).getNumeroMesa()==idMesa){
                        indiceDaReserva=i;
                    }
                }
                BuchinhoCheio.getMesas(indiceDaReserva).getComandaMesa().anotar_pedido();
                break;
                case 5:
                indiceDaReserva=0;
                idMesa=0;
                System.out.println("Deseja listar pedido de qual mesa: ");
                idMesa=ler.nextInt();
                for(i=0;i<BuchinhoCheio.getMesas_geral().length;i++){
                    if(BuchinhoCheio.getMesas(i).getNumeroMesa()==idMesa){
                        indiceDaReserva=i;
                    }
                }
                BuchinhoCheio.getMesas(indiceDaReserva).getComandaMesa().listarConsumo();
                break;

                case 6:
                idMesa=0;
                indiceDaReserva=0;
                System.out.println("Deseja calcular os 10% de qual mesa: ");
                idMesa=ler.nextInt();
                for(i=0;i<BuchinhoCheio.getMesas_geral().length;i++){
                    if(BuchinhoCheio.getMesas(i).getNumeroMesa()==idMesa){
                        indiceDaReserva=i;
                    }
                }
                BuchinhoCheio.getMesas(indiceDaReserva).DezPorcentoGarcom();
                break;

                case 7:
                idMesa=0;
                indiceDaReserva=0;
                System.out.println("Deseja calcular os 10% de qual mesa: ");
                idMesa=ler.nextInt();
                for(i=0;i<BuchinhoCheio.getMesas_geral().length;i++){
                    if(BuchinhoCheio.getMesas(i).getNumeroMesa()==idMesa){
                        indiceDaReserva=i;
                    }
                }
                BuchinhoCheio.getMesas(indiceDaReserva).divisaoDaConta();
                break;

                case 8:
                idMesa=0;
                indiceDaReserva=0;
                System.out.println("Deseja calcular os 10% de qual mesa: ");
                idMesa=ler.nextInt();
                for(i=0;i<BuchinhoCheio.getMesas_geral().length;i++){
                    if(BuchinhoCheio.getMesas(i).getNumeroMesa()==idMesa){
                        indiceDaReserva=i;
                    }
                }
                BuchinhoCheio.getMesas(indiceDaReserva).finalizar_reserva();
                break;

            }
        }while (comando!=0);
    }
}

    

