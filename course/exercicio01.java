package course;
    import java.util.Scanner;
public class exercicio01 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // verificar qual o maior número

        /*if (a > b && b > c){
            System.out.println("Higher = " + a);
        }
        else if (b > c){
            System.out.println("Higher: " + b);
        }
        else {
            System.out.println("Higher: " + c);
        }*/

        // pode ser substituido pela função abaixo

        int heigher = max(a, b, c);

        showResult(heigher);

        sc.close();
    }
    
    public static void showResult(int value){
        System.out.println("Higher = " + value);
        
    }
    // criando função

    public static int max(int x, int y, int z) {
        int aux;

        if (x > y && y > z){
            aux = x;
        }
        else if (y > z){
            aux = y;
        }
        else {
            aux = z;
        }
        return aux;
    }
}
