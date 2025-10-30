import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String RESET = "\u001B[0m";
        final String RED = "\u001B[31m";
        final String GREEN = "\u001B[32m";
        final String YELLOW = "\u001B[33m";
        final String BLUE = "\u001B[34m";
        int opcao = 0;

        do {
            System.out.println(BLUE + "=====================");
            System.out.println("   MENU DO CONTADOR   ");
            System.out.println("=====================" + RESET);
            System.out.println("Escolha uma opção:");
            System.out.println(YELLOW + "--- Contador ---" + RESET);
            System.out.println(GREEN + "1 - Contagem Crescente" + RESET);
            System.out.println(GREEN + "2 - Contagem Decrescente" + RESET);
            System.out.println(YELLOW + "--- Calculadora ---" + RESET);
            System.out.println(GREEN + "3 - Somar" + RESET);
            System.out.println(GREEN + "4 - Dividir" + RESET);
            System.out.println(GREEN + "5 - Multiplicação" + RESET);
            System.out.println(GREEN + "6 - Ver Tabuada" + RESET);
            System.out.println(GREEN + "7 - Subtração" + RESET);
            System.out.println(RED + "8 - Sair" + RESET);

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:{

                    System.out.println("Digite o valor inicial");
                    int inicio = scanner.nextInt();
                    System.out.println("Digite o limite final da contagem crescente:");
                    int fim1 = scanner.nextInt();
                    System.out.println("Digite o passo (de quanto em quanto você quer contar? Ex: 2):");
                    int passo = scanner.nextInt();
                    if (passo <= 0){
                        System.out.println(RED + "Erro, o passo deve ser um número positivo." + RESET);
                    }else{
                        System.out.println("Contagem de " + inicio + " até " + fim1 + ":");
                        for (int i = inicio; i <= fim1; i += passo){
                            System.out.print(i + " ");
                        }
                        if ((fim1 - inicio) % passo != 0) {
                            System.out.print(" " + fim1);
                        }

                    }
                    System.out.println();
                }
                break;

                case 2:{
                    System.out.println("Digite o valor inicial da contagem decrescente: ");
                    int comeco = scanner.nextInt();
                    System.out.println("Digite o valor final da contagem decrescente: ");
                    int ultimo = scanner.nextInt();
                    System.out.println("Digite o passo (de quanto em quanto você quer contar?):");
                    int passo = scanner.nextInt();
                    if (passo <= 0){
                        System.out.println(RED + "Erro, o passo deve ser um número positivo." + RESET);
                    } else {
                        System.out.println("Contagem de " + comeco + " até " + ultimo + ":");
                        for (int i = comeco; i >= ultimo; i -= passo){
                            System.out.print(i + " ");
                        }
                        if ((comeco - ultimo) % passo != 0) {
                            System.out.print(" " + ultimo);
                        }

                    }
                    System.out.println();
                }
                break;




                case 3: {
                    System.out.println("Digite o primeiro valor a ser somado: ");
                    int num1 = scanner.nextInt();
                    System.out.println("Digite o segundo valor a ser somado: ");
                    int num2 = scanner.nextInt();
                    System.out.println(GREEN + "O resultado do calculo de soma é : " + (num1 + num2) + RESET);
                }
                break;


                case 4: {

                    System.out.println("Digite o valor a ser dividido : ");
                    double div1 = scanner.nextDouble();
                    System.out.println("Digite o valor divisor : ");
                    double div2 = scanner.nextDouble();
                    while (div2 == 0) {
                        System.out.println(RED + "Numero 0 não é divisor, Digite outro numero! " + RESET);
                        div2 = scanner.nextDouble();

                    }
                    System.out.println(GREEN + "O resultado da divisão é : " + (div1 / div2) + RESET);
                }
                 break;
                case 5: {
                    System.out.println("Digite o numero a ser multiplicado : ");
                    int mult1 = scanner.nextInt();
                    System.out.println("Digite o numero multiplicador : ");
                    int mult2 = scanner.nextInt();
                    System.out.println(GREEN + "O resultado da multiplicação é : " + (mult1 * mult2) + RESET);
                }
                break;
                case 6: {
                    System.out.println(YELLOW + "Digite um numero para ver a tabuada : " + RESET);
                    int tabu = scanner.nextInt();
                    System.out.println(YELLOW + "Tabuada do numero " + tabu + " é :" + RESET);
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(GREEN + tabu + " x " + i + " = " + (tabu * i) + RESET);

                    }
                }
                break;
                case 7: {
                    System.out.println("Digite o primeiro valor (minuendo): ");
                    double num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo valor (subtraendo): ");
                    double num2 = scanner.nextDouble();
                    double resultado = num1 - num2;
                    System.out.println(GREEN + "O resultado da subtração é : " + resultado + RESET);
                }
                break;
                case 8:
                    System.out.println(YELLOW + "Operação encerrada. Obrigado por usar o Contador/Calculadora!" + RESET);
                    break;
                default:


                    System.out.println("Opção inválida! Tente novamente." + RESET);
            }
            if (opcao != 8) {
                scanner.nextLine();
                System.out.println(YELLOW + "\nPressione Enter para voltar ao menu..." + RESET);
                scanner.nextLine();
            }
        }while (opcao != 8);


        scanner.close();
    }
    }


