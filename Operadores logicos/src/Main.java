//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int i = 20;
        int b = 10;
        int a = 2;

        if (i > b || i > a ){ // ||= operador logico referente ao ou
            System.out.println("i eh o maior numero.");
        } else if (a < i && a < b) { // &&  operador logico referente ao e
            System.out.println("a eh o menor numero.");
        }
    }
}