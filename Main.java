public class Main {

    public static void main(String[] args) {

        /*for (int i = 0; i < 5; i++) {
            System.out.println(i);
            for (int c = 0; c < 5; c++) {
                System.out.println(c);
                for (int a = 0; a < 5; a++) {
                    System.out.println(a);
                }
            }
        }

    }*/

    class Typetester {

        void printType(int x) {
            System.out.println(x + " É um Int");
        }
        void printType(float x) {
            System.out.println(x + " é um Float");
        }
        void printType(double x) {
            System.out.println(x + " É um Double");
        }
    }

    Typetester testando = new Typetester();

    String num = "1";
    Double teste = Double.parseDouble(num);

    testando.printType(teste);

    String randomthing = "teste";
    String randomthing2 = "teste";
    
    }
}
