
// Danilo Henrique Maia da Silva GEC 2092

import br.inatel.Clientes.Cliente;
import br.inatel.Computadores.Computador;
import br.inatel.Computadores.HardwareBásico;
import br.inatel.Computadores.MemoriaUSB;
import br.inatel.Computadores.SistemaOperacional;

import java.util.Scanner;

public class LOJA_PCMANIA {
    public static void main(String[] args) {

        // Montagem dos PCS
        MemoriaUSB memoria1 = new MemoriaUSB("Pen-Drive 16GB", 16);
        SistemaOperacional sistemaoperacional1 = new SistemaOperacional("macOS",64);
        HardwareBásico hardware1[] = {
                new HardwareBásico("Pentium Core i3 (2200 Mhz)",2200),
                new HardwareBásico("8 Gb de Memória RAM", 8),
                new HardwareBásico("500Gb de HD",500)
        };

        Computador promo1 = new Computador("Apple",2092,sistemaoperacional1,hardware1);
        promo1.addMemoriaUSB(memoria1);



        MemoriaUSB memoria2 = new MemoriaUSB("Pen-Drive 32GB", 32);
        SistemaOperacional sistemaoperacional2 = new SistemaOperacional("Windows 8 (64 bits)", 64);
        HardwareBásico hardware2[] = {
                new HardwareBásico("Pentium Core i5 (3370 Mhz)",3370),
                new HardwareBásico("16 Gb de Memória RAM", 16),
                new HardwareBásico("1Tb de HD",1000)
        };
        Computador promo2 = new Computador("Samsung",2092+1234,sistemaoperacional2,hardware2);
        promo2.addMemoriaUSB(memoria2);


        MemoriaUSB memoria3 = new MemoriaUSB("HD Externo 1Tb", 1000);
        SistemaOperacional sistemaoperacional3 = new SistemaOperacional("Windows 10 (64 bits)", 64);
        HardwareBásico hardware3[] = {
                new HardwareBásico("Pentium Core i7 (4500 Mhz)",45),
                new HardwareBásico("32 Gb de Memória RAM", 32),
                new HardwareBásico("2Tb de HD",2000)
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
                for (int i = 1; i < 1000; i++) {
                    int n = entrada.nextInt();
                    if (n==1){
                        cliente1.addComputadores(promo1);
                        ProcessarPedido p1 =new ProcessarPedido(promo1);
                        System.out.println(p1.PCscomprados(promo1));
                    }
                    else if (n==2){
                        cliente1.addComputadores(promo2);
                        ProcessarPedido p1 =new ProcessarPedido(promo1);
                        System.out.println(p1.PCscomprados(promo1));
                    }
                    else if(n==3){
                        cliente1.addComputadores(promo3);
                        ProcessarPedido p1 =new ProcessarPedido(promo1);
                        System.out.println(p1.PCscomprados(promo1));
                    }
                    else{
                        System.out.println("Não existe essa promoção");
                    }
                    if (i<2) {
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
                            cliente1.escreverPCs();
                            System.out.println("Preço total do pedido: R$"+ cliente1.calculaTotalCompra());
                            x=0;
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