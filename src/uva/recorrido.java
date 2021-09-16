
public class Recorrido
{
    public static void main(String args[]){
        int mat[][] = {{ 1, 2, 3, 4},
                       { 5, 6, 7, 8},
                       { 9,10,11,12},
                       {13,14,15,16}};
                       
        //mostrar contenido de la matriz
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
       
        System.out.print(mat[0][0]+", ");
        int i, j, auxi, auxj;
        i=0;
        j=1;
        boolean bb= true;
        while(i!=j){
            auxi=i;
            auxj=j;
            if(bb==true){
                while(j!=auxi && i!=auxj){
                    System.out.print(mat[i][j]+", ");
                    i++;
                    j--;
                }
                System.out.print(mat[i][j]+", ");
                bb=false;
                if(i<3){
                    i++;
                }else{
                    j++;
                }           
                
            }else{
                while(j!=auxi && i!=auxj){
                    System.out.print(mat[i][j]+", ");
                    i--;
                    j++;
                }
                System.out.print(mat[i][j]+", ");
                bb=true;
                if(i<4){
                    i++;
                }else{
                    j++;
                }
            }
        }
        System.out.print(mat[i][j]+".");
    }
}
