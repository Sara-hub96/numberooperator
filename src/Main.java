public class Main {
    public static void main(String[] args) {
        int a = 15;
        a += 5;
        a -= 4;
        System.out.println(a);
        int b = a;
        b += 1;
        System.out.println(b);

        boolean firstStatement = b % 2 != 0;
        boolean secondStatement = (b * (b + 1)) % 3 == 0;

        if (firstStatement && secondStatement){
            System.out.println("le condizioni sono soddisfatte");
        }else{
            System.out.println("le condizioni non sono soddisfatte");
        }
    }
}
