
// Danilo Henrique Maia da Silva GEC 2092

import br.inatel.Clientes.Cliente;
import br.inatel.Clientes.ProcessarPedido;
import br.inatel.Computadores.Computador;
import br.inatel.Computadores.HardwareBásico;
import br.inatel.Computadores.MemoriaUSB;
import br.inatel.Computadores.SistemaOperacional;

import java.util.Scanner;

public class LOJA_PCMANIA {
    public static void main(String[] args) {

        // Montagem dos PCS
        MemoriaUSB memoria1 = new MemoriaUSB("Pen-Drive", 16);
        SistemaOperacional sistemaoperacional1 = new SistemaOperacional("macOS Sequoia",64);
        HardwareBásico hardware1[] = {
                new HardwareBásico("Pentium Core i3",2200),
                new HardwareBásico("Memória RAM", 8),
                new HardwareBásico("HD",500)
        };

        Computador promo1 = new Computador("Apple",2092,sistemaoperacional1,hardware1);
        promo1.addMemoriaUSB(memoria1);



        MemoriaUSB memoria2 = new MemoriaUSB("Pen-Drive", 32);
        SistemaOperacional sistemaoperacional2 = new SistemaOperacional("Windows 8", 64);
        HardwareBásico hardware2[] = {
                new HardwareBásico("Pentium Core i5",3370),
                new HardwareBásico("Memória RAM", 16),
                new HardwareBásico("HD",1000)
        };
        Computador promo2 = new Computador("Samsung",2092+1234,sistemaoperacional2,hardware2);
        promo2.addMemoriaUSB(memoria2);


        MemoriaUSB memoria3 = new MemoriaUSB("HD Externo", 1000);
        SistemaOperacional sistemaoperacional3 = new SistemaOperacional("Windows", 64);
        HardwareBásico hardware3[] = {
                new HardwareBásico("Pentium Core i7",45000),
                new HardwareBásico("Memória RAM", 32),
                new HardwareBásico("HD",2000)
        };
        Computador promo3 = new Computador("Dell",2092+5678,sistemaoperacional3,hardware3);
        promo3.addMemoriaUSB(memoria3);
        // PCS montados
        // clientes
        Cliente cliente1 = new Cliente("Danilo", "123456789");

        // MENU
        int x;
        Scanner entrada = new Scanner(System.in);
        do {
            String nome;
            String cpf;
            System.out.println("========================================");
            System.out.println("   Bem-vindo à loja PC Mania!      ");
            System.out.println("   1-Promoções de PC");
            System.out.println("   0-Sair da Loja");
            System.out.println("========================================");

            x = entrada.nextInt();
            entrada.nextLine();

            if (x==1) {
                System.out.println("==================================================");
                System.out.println("   PROMOÇÃO 1: ");
                promo1.mostraPCConfigs();
                System.out.println("                                        ");
                System.out.println("   PROMOÇÃO 2: ");
                promo2.mostraPCConfigs();
                System.out.println("                                        ");
                System.out.println("   PROMOÇÃO 3: ");
                promo3.mostraPCConfigs();
                System.out.println("                                        ");
                System.out.println("                                        ");
                System.out.println("  Por quais PCs você mais se interessou (Min 2): ");
                System.out.println("   1-Promoção 1");
                System.out.println("   2-Promoção 2");
                System.out.println("   3-Promoção 3");
                System.out.println("==================================================");
                int cont=0;
                for (int i = 1; i < 10000; i++) {
                    int n = entrada.nextInt();
                    if (n==1){
                        cliente1.setComputadores(promo1);
                        ProcessarPedido p1 =new ProcessarPedido(promo1);
                        System.out.println(p1.PCscomprados(promo1));
                        cont++;

                    }
                    else if (n==2){
                        cliente1.setComputadores(promo2);
                        ProcessarPedido p1 =new ProcessarPedido(promo1);
                        System.out.println(p1.PCscomprados(promo1));
                        cont++;
                    }
                    else if(n==3){
                        cliente1.setComputadores(promo3);
                        ProcessarPedido p1 =new ProcessarPedido(promo1);
                        System.out.println(p1.PCscomprados(promo1));
                        cont++;
                    }
                    else{
                        System.out.println("Não existe essa promoção");
                    }
                    if (cont<2) {
                        System.out.println("   Escolha mais 1 PC");
                    }
                    else{
                        System.out.println("   Escolher outro PC: ");
                        System.out.println("   1-Sim");
                        System.out.println("   0-Não");
                        int p = entrada.nextInt();
                        if (p==1){
                            System.out.println("   1-Promoção 1");
                            System.out.println("   2-Promoção 2");
                            System.out.println("   3-Promoção 3");
                        }
                        else if (p==0) {
                            System.out.println(cliente1.getNomecpf());
                            Computador[] pcsComprados = cliente1.getComputadores(); // colocando os gets dos computadores comprados em um array de Computador
                            for (int j = 0; j < pcsComprados.length; j++) {
                                if (pcsComprados[j] != null) {
                                    System.out.println("  ");
                                    System.out.println("PC " + (j+1) + ":");
                                    pcsComprados[j].mostraPCConfigs();
                                    System.out.println();
                                }
                            }
                            System.out.println("Preço total do pedido: R$"+ cliente1.calculaTotalCompra());
                            x=0; // fechar a loja
                            break;
                        }
                        else{
                            System.out.println("Opção inválida");
                        }
                    }

                }
            }
            else if(x!=0){
                System.out.println("Escolha inválida");
            }
        }while (x!=0);
        entrada.close();
        System.out.println("                                        ");
        System.out.println("Obrigado por comprar conosco!!!");
        }
    }