public class Pascal {
    public int fatorial (int num){
        int i, fatorial=1;
        for (i=1;i<=num;i++){
            fatorial=fatorial*i;
        }
        return fatorial;
    }
    public int calculo (int i, int j){
        int a=0, b=0, c=0, resultado=0;
        a=fatorial(i);
        b=fatorial(j);
        c=fatorial(i-j);

        resultado=a/(b*c);
        return resultado;
    }

    public void calcula_pascal (int[][] matriz){
        int i, j;
        for(i=0;i<matriz.length;i++){
            for(j=0;j<=i; j++){
                matriz[i][j]=calculo(i,j);
            }
        }
        for(i=0;i<matriz.length;i++){
            for(j=0;j<=i; j++){
                if(j+1>i){
                    System.out.println(matriz[i][j]);
                }else{
                    System.out.print(matriz[i][j]);
                }
                
            }
        }
}
}
