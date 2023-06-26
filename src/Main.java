import java.util.Scanner;   //by Douglas Holanda

public class Main
{
    public static void main(String[] args)
    {
       int [] codigo = new int[11];
       double [] saldo = new double[11];
       boolean valor = true;
       int opcao, cod, cod1;

       Scanner scan = new Scanner(System.in);

       System.out.println("Bem-vindo(a) ao nosso sistema bancário!\n");
       System.out.println("Inicialize preenchendo os códigos das contas com seus respectivos saldos.\n");

       for (int j = 1; j < 11; j++)
       {
           System.out.printf("Digite o código da conta (um valor inteiro):\n");
           codigo[j] = scan.nextInt();

           System.out.printf("Digite agora, em reais, o saldo dessa conta:\n");
           saldo[j] = scan.nextInt();
       }
       while(valor)
       {
           System.out.println("\nMenu inicial\n");
           System.out.printf("Digite uma das opções:\n1-Consultar saldo\n2-Efetuar depósito\n3-Efetuar saque\n4-Mostrar ativo bancário\n5-Encerrar\n");
           opcao = scan.nextInt();

           if (opcao == 1) {
               System.out.println("Você escolheu consultar saldo.");
               System.out.printf("Digite o código de sua conta:");
               cod = scan.nextInt();

               if (cod > codigo[10]) {
                   System.out.println("Conta não encontrada.\n");
               } else {
                   System.out.println("Conta encontrada com sucesso.\n");
                   System.out.printf("%n%s%n%s", cod, saldo[cod]);
               }
           }
           else if (opcao == 2) {
               System.out.println("Você escolheu efetuar depósito:\n");
               System.out.printf("Digite o código de sua conta:\n");
               cod1 = scan.nextInt();

               if (cod1 > codigo[10]) {
                   System.out.println("Conta não encontrada.\n");
               } else {
                   System.out.println("Conta encontrada com sucesso.\n");
                   System.out.printf("Digite, em reais, a quantidade que deseja depositar:");
                   double quantidade = scan.nextDouble();


                   saldo[cod1] += quantidade;


                   System.out.println("Conta atualizada com sucesso.\n");

                   System.out.printf("%n%s%n%s\n", cod1, saldo[cod1]);
               }
           }
           else if (opcao == 3) {
               System.out.println("Você escolheu efetuar saldo.\n");
               System.out.printf("Digite o código de sua conta:");
               cod1 = scan.nextInt();

               if (cod1 > codigo[10]) {
                   System.out.println("Conta não encontrada.\n");
               } else {
                   System.out.println("Conta encontrada com sucesso.\n");
                   System.out.printf("Digite, em reais, a quantidade que deseja sacar:\n");
                   double quantSacar = scan.nextDouble();

                   if (quantSacar > saldo[cod1]) {
                       System.out.println("Saldo insuficiente para efetuar saque.\n");
                   } else {
                       System.out.println("Saldo realizado com sucesso.\n");


                       saldo[cod1] -= quantSacar;



                       System.out.println("Atualização de conta.\n");

                       System.out.printf("%n%s%n%s\n", cod1, saldo[cod1]);
                   }
               }
           }
           else if (opcao == 4) {
               System.out.println("Você escolheu a opção de visualizar o ativo bancário atual.\n");

               for (int j = 1; j < 11; j++) {
                   System.out.printf("%n%s%n%s", codigo[j], saldo[j]);

               }

           }
           else if (opcao == 5) {
               System.out.println("Operação encerrada com sucesso. O banco agradece sua interação!\n");

               break;
           }
           else {

               System.out.println("Opção inexistente.");
               break;
           }
       }
    }
}