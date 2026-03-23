import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolhaUser;

        System.out.println("Olá, seja bem-vindo! Escolha o exercício que deseja analisar:");
        System.out.println("Exercício 1 (1) -  Vetor de N númeoros e vogais \n Exercício 2 (2) - Vetor elevado ao quadrado \n Exercício 3 (3) - Nome contrário");

        //Entrada e validação da entrada
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("Número inválido!");
                sc.nextLine();
            }else{
                escolhaUser = sc.nextInt();
                if (escolhaUser == 1) {
                    exercicio1();
                    break;
                }else if (escolhaUser == 2) {
                    exercicio2();
                    break;
                }else if (escolhaUser == 3) {
                    exercicio3();
                    break;
                }
            }
        }

    }

    static void exercicio1() {
        Scanner sc = new Scanner(System.in);
        String nome;

        //Entrada do usuário
        System.out.println("Digite quantos números quiser e eu irei ordenar para você");

        //Validação da entrada
        while (true) {
            System.out.println("Quantos números quer digitar?");
            if (!sc.hasNextInt()){
                System.out.println("Número inválido, por favor digite um número válido.");
                sc.nextLine();
            }else{
                break;
            }
        }

        //Salvando a entrada
        int numerosQtde = sc.nextInt();
        Double[] numerosAleatorios = new Double[numerosQtde];

        //Entrada de vetor do Usuário
        // Loop entrada

        for (int i = 0; i < numerosAleatorios.length; i++) {
            System.out.println("Digite o " + (i+1) + "° número: ");
            sc.nextLine();
            if (!sc.hasNextDouble()){
                System.out.println("Número inválido!");
                i--;
            }else{
                numerosAleatorios[i] = sc.nextDouble();
            }

        }

        //Loop processamento
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios.length - 1; j++) {
                if (numerosAleatorios[j] > numerosAleatorios[j + 1]) {
                    double aux = numerosAleatorios[j];
                    numerosAleatorios[j] = numerosAleatorios[j + 1];
                    numerosAleatorios[j + 1] = aux;
                }
            }
        }

        //Loop saída
        for (int i = 0; i < numerosAleatorios.length; i++) {
            System.out.println("Números ordenados");
            System.out.println(numerosAleatorios[i]);
        }

        // Limpando buffer
        sc.nextLine();

        //Recebendo e validando o nome com loop
        while (true){
            System.out.print("Digite seu nome: ");
            nome = sc.nextLine().toLowerCase();
            if (nome.isEmpty()){
                System.out.println("Nome inválido!");
            }else{
                break;
            }
        }

        // Encontrando vogais
        int vogaisQtde = 0;
        for (int i = 0; i < nome.length(); i++) {
            char vogais =  nome.charAt(i);
            if (vogais == 'a' || vogais == 'e' || vogais == 'i' || vogais == 'o' || vogais == 'u') {
                vogaisQtde++;
            }
        }

        System.out.println("Seu nome é " + nome);
        System.out.println("Seu nome tem " + vogaisQtde + " vogais.");

    }

    static void exercicio2() {
        Scanner sc = new Scanner(System.in);
        Integer escolhaUser;

        System.out.println("Quantos números você quer digitar?");
        //Entrada e validação da qtde do vetor
        while (true) {
            if (!sc.hasNextInt()){
                System.out.println("Número inválido!");
                sc.next();
            }else{
                escolhaUser = sc.nextInt();
                break;
            }
        }

        //Entrada e validação dos números do vetor
        Integer[] numerosUser = new Integer[escolhaUser];
        for (int i = 0; i < numerosUser.length; i++) {
            System.out.println("Digite o " + (i+1)+" ° número");

            if (!sc.hasNextInt()) {
                System.out.println("Número inválido!");
                i--;
                sc.next();
            }else{
                escolhaUser = sc.nextInt();
                numerosUser[i] = escolhaUser;
            }

        }

        //Processamento dos números do vetor
        for (int i = 0; i < numerosUser.length; i++) {
            if (numerosUser[i] % 2 == 0) {
                numerosUser[i] *= 2;
            }else {
                numerosUser[i] = (int) Math.pow(numerosUser[i], 2);
            }
        }

        //Saída dos valores processados
        System.out.println(Arrays.toString(numerosUser));
    }

    static void exercicio3() {
        Scanner sc = new Scanner(System.in);
    }
}
