public class Main {
    public static void main(String[] args){
        InstaPet obj=new InstaPet();

        obj.cadastra_usuarios("juju", "juju@gmail");
        obj.cadastra_usuarios("bj", "bj@gmail");
        obj.cadastra_usuarios("lolo", "lolo@gmail");
        
        obj.cadastra_foto("lolo@gmail", "teste1/teste", "meu pet!");
        obj.cadastra_foto("lolo@gmail", "teste2/teste", "outro pet!");
        obj.cadastra_foto("juju@gmail", "teste3/teste", "mais outro pet!");

        obj.quant_pets("juju@gmail");
        obj.quant_pets("bj@gmail");
        obj.quant_pets("lolo@gmail");

        obj.quant_usuarios();


        obj.listar_pets("juju@gmail");
        obj.listar_pets("bj@gmail");
        obj.listar_pets("lolo@gmail");
        
        obj.listar_usuarios();

        obj.altera_descricao("lolo@gmail", 0, "Meu pet 2!");

        
        obj.listar_pets("lolo@gmail");
    }
}