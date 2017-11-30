import java.util.Scanner;

public class Quest2 {
    public static void Main(String[] args) {
        System.out.println("vvedi chislo ot 1 do 10");
        Scanner scanner = new Scanner(System.in);
        int compZagadalChislo = (int) (Math.random()*10)+1;
        int counter;

        for (counter = 0; counter < 5; counter++) {
            int chisloChtloveka = scanner.nextInt();
        if(chisloChtloveka==compZagadalChislo) {
            System.out.println("ugadal");
            break;
        }
        else {
            System.out.println("ne ugadal");
            if (chisloChtloveka < compZagadalChislo) {
                System.out.println("beri boll");
            }
            else {
                System.out.println("beri men");
            }
        }
    }
        System.out.println("otdohni, popitki konchilis'");

    }
}