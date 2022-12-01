public class Estatistica{
    int k;
public void moda(int[] nums){
    int i, j, moda=0, controle=0;

    int[] nums2=new int[nums.length];
    int[] ocorrencias=new int[nums.length];

    nums2=nums;

    for(i=0;i<nums.length;i++){
        for(j=0;j<nums.length;j++){
            if(nums[i]==nums2[j]){
                ocorrencias[i]++;
            }
        }
    }
    for(i=0;i<nums.length;i++){
        if (ocorrencias[i]>controle){
            controle=ocorrencias[i];
            moda=nums[i];
        }
    }
    System.out.println(moda);
}

public void mediana (int[] nums){
    int i, j, controle, mediana, indice, media;
    for(i=0;i<nums.length;i++){
        for(j=0;j<nums.length;j++){
            if(nums[i]<nums[j]){
                controle=nums[i];
                nums[i]=nums[j];
                nums[j]=controle;
            }
        }
    }
    
   if(nums.length%2==0){
    indice=nums.length/2;
    mediana=(nums[indice-1]+nums[indice])/2;
    System.out.println(mediana);
   }else{
    mediana=nums.length/2;
    System.out.println(nums[mediana]);
   }
}

void media (int[] nums){
    int soma=0, media=0, i;
    for(i=0;i<nums.length;i++){
        soma=soma+nums[i];
    }
    media=soma/nums.length;
    System.out.println(media);
}


}