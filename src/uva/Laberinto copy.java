public class Laberinto{
    char laberinto[][];
    
    public Laberinto(char [][] l){
        this.laberinto = l;
    }
    
    public boolean buscarCamino(int x, int y){
        if(laberinto[x][y]=='Q'){
            return true;
        }else{
            if(laberinto[x][y]!= '#'&& laberinto[x][y]!='c'){
                laberinto[x][y] = 'c';
                if(buscarCamino(x-1, y)||
                   buscarCamino(x+1, y)||
                   buscarCamino(x, y+1)||
                   buscarCamino(x, y-1)){
                       return true;
                    }else
                        laberinto[x][y] = ' ';
            }
        }
        return false;
    }
}