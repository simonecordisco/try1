import java.util.InputMismatchException;
import java.util.Scanner;

//Scrivere una funzione che controlli se un numero int è in un determinato range
//Se lo è ritorna true se non lo è lancia un'eccezione
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        prova(x);
    }

    private static void prova(int x) throws Exception {

            if (x <= 10 && x > 2) {
                boolean b = true;
                System.out.println(b);
            } else {
                throw new Exception("fuori range");
            }
    }
}




