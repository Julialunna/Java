public class Mdc {

    public static boolean eh_primo (int A){
        int i, resultado=0;
        for (i=1;i<A;i++){
            if (A%i==0){
                resultado++;
            }
        }
        if (resultado==1){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) throws Exception{
        int A=12p, B=8;
        int i=0, mdc=1;
        boolean c;
        c=eh_primo(3);
        System.out.println(c);

        for (i=0;i<A||i<B;i++){

            if (eh_primo(i)==true){
                System.out.println("entrei eh  primo");
                System.out.println(i);
                System.out.println(A);
                System.out.println(B);
            
                while(B%i==0&&A%i==0){
                    if(A%i==0&&B%1==0){
                        A=A/i;
                        B=B/i;
                        mdc=mdc*i;
                    }else if(A%i==0||B%i==0){
                        if (A%i==0){
                            A=A/i;
                        }else if(B%i==0){
                            B=B/i;
                        }
                    }else{
                        continue;
                    }
                    System.out.println("While");
                    System.out.println(i);
                    System.out.println(A);
                    System.out.println(B);
                }
            }else{
                continue;
            }
            System.out.println("i");
            System.out.println(i);
            System.out.println(A);
            System.out.println(B);
        }
        System.out.println(mdc);
    }

}
