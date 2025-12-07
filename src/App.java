public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca 10 números separados por INTRO:");

        int[] origin = new int[10];

        for (int i = 0; i < origin.length; i++) {
            origin[i] = Integer.parseInt(System.console().readLine());
        }

        System.out.println();
        System.out.println("Array original:");

        int[] indice = new int[10];

        for (int i = 0; i < indice.length; i++) {
            System.out.print((indice[i] = i)+" ");
        }
        System.out.println();
        for (int i = 0; i < origin.length; i++) {
            System.out.print(origin[i] + " ");
        }

        System.out.println();

        int posInicial = Integer.parseInt(System.console().readLine("Introduzca la posición inicial (0-9): "));
        int posFinal = Integer.parseInt(System.console().readLine("Introduzca la posición final (0-9): "));

        int guardado = origin[posInicial];

        for (int i = posInicial; i < posFinal; i++) {
            origin[i] = origin[i + 1];
        }

        origin[posFinal] = guardado;

        for (int i = 0; i < 10; i++) System.out.printf("%4d", i);
        System.out.println();
        
        for (int i = 0; i < 10; i++) System.out.printf("%4d", origin[i]);
        System.out.println();




    }
}
