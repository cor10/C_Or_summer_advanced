public class algorithm1{
    static int numberOfPaths(int width, int height){
        if(width == 1 || height == 1){
            return 1;
        }else{
            return numberOfPaths(width - 1, height) + numberOfPaths(width, height - 1);
        }
    }
    public static void main(String args[]){
        System.out.println(numberOfPaths(6, 4));
    }
}
