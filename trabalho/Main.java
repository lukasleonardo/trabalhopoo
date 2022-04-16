package trabalho;

import java.util.Scanner;
import trabalho.Produto;
import trabalho.Item;
import java.util.Locale;

public class Main {
        public static void main(String[] args) {

                Scanner leitor = new Scanner(System.in);

                Locale.setDefault(Locale.US);
                /*
                 * ----------------------------------******----------------------------------
                 * 
                 * 8) Implemente a classe Programa, tal que:
                 * 
                 * ---a) Implemente dois objetos da classe Cliente, com dados inseridos pelo
                 * teclado
                 * (usar objeto da classe Scanner). Imprima esses objetos no console;
                 * 
                 * b) Implemente três objetos da classe Produto, com dados inseridos pelo
                 * teclado.Imprima esses objetos no console ;
                 * 
                 * c) Implemente dois objetos da classe Pedido, com dados inseridos pelo
                 * teclado,
                 * associados a cada cliente criado anteriormente, com a situação de ANALISE.
                 * Imprima esses objetos no console;
                 * 
                 * d) Implemente dois objetos da classe Item para cada objeto Pedido, criado
                 * anteriormente. No primeiro item a ser associado ao pedido, a situação do
                 * pedido deverá ser alterada para APROVADO. No segundo item a ser associado
                 * ao pedido, a situação do pedido deverá ser alterada para ATENDIDO. Todo
                 * item criado ao pedido deverá ser adicionado à lista de itens do pedido.
                 * Através
                 * do laço for mostre esse objetos.
                 */

                // Objetos da Classe Cliente

                System.out.println("Digite o cpf" );
                String cpf = leitor.nextLine();
                
                System.out.println("Digite o nome do cliente" );
                String nome = leitor.nextLine();
                
                System.out.println("Digite o nome do endereco" );
                String endereco = leitor.nextLine();
                

                Cliente c1 = new Cliente(cpf, nome, endereco);
                // ********************************************
                nome = null;
                cpf = null;

                System.out.println("Digite o cpf" );
                cpf = leitor.nextLine();
                
                System.out.println("Digite o nome do cliente" );
                nome = leitor.nextLine();


                Cliente c2 = new Cliente(cpf, nome);

                nome = null;
                cpf = null;

                System.out.println(c1.toString());
                System.out.println(c2.toString());
                // *****************************************

                // Objetos da Classe Produto
                System.out.println("Digite o codigo do produto" );
                String codigo = leitor.nextLine();
                
                System.out.println("Digite o nome do produto" );
                nome = leitor.nextLine();
                
                System.out.println("Digite o preco do produto" );
                double preco = Float.parseFloat(leitor.nextLine());
                
                System.out.println("Digite o quantidade do produto" );
                double qtdestoque = Float.parseFloat(leitor.nextLine());

                Produto p1 = new Produto(codigo, nome, preco, qtdestoque);

                nome = null;
                codigo = null;
                preco = 0.0;
                qtdestoque = 0.0;
                // *************************************************
                System.out.println("Digite o codigo do produto" );
                codigo = leitor.nextLine();
         
                System.out.println("Digite o nome do produto" );
                nome = leitor.nextLine();
                
                System.out.println("Digite o preco do produto" );
                preco = Float.parseFloat(leitor.nextLine());
                
                System.out.println("Digite o qtd em estoque do produto" );
                qtdestoque = Float.parseFloat(leitor.nextLine());

                Produto p2 = new Produto(codigo, nome, preco, qtdestoque);

                nome = null;
                codigo = null;
                preco = 0.0;
                qtdestoque = 0.0;
                // *****************************************************

                
                System.out.println("Digite o codigo do produto" );
                codigo = leitor.nextLine();
                
                System.out.println("Digite o nome do produto" );
                nome = leitor.nextLine();
                 
                System.out.println("Digite o preco do produto" );
                preco = Float.parseFloat(leitor.nextLine());
                
                System.out.println("Digite o qtd em estoque do produto" );
                qtdestoque = Float.parseFloat(leitor.nextLine());

                Produto p3 = new Produto(codigo, nome, preco, qtdestoque);

                nome = null;
                codigo = null;
                preco = 0.0;
                qtdestoque = 0.0;

                System.out.println(p1.toString());
                System.out.println(p2.toString());
                System.out.println(p3.toString());
                // *****************************************************/

                // *Objetos da Classe Pedido*/

                System.out.println("Digite o numero do pedido");
                String numero = leitor.nextLine();
        
                System.out.println("Digite o data a data de compra");
                String data = leitor.nextLine(); 
                

                Pedido pedido1 = new Pedido(numero, data, c1);

                numero = null;
                data = null;

                System.out.println("Digite o numero do pedido" );
                numero = leitor.nextLine();
                  
                System.out.println("Digite o data a data de compra" );
                data = leitor.nextLine(); 
                 

                Pedido pedido2 = new Pedido(numero, data, c2);
                // ********************************************** */

                // Objetos da Classe item
                System.out.println("Digite a quantidade de itens");
                double qtd = Float.parseFloat(leitor.nextLine());

                System.out.println("Digite a sequencial");
                int seq = leitor.nextInt();
                Item item1 = new Item(seq, qtd, p1, pedido1);
                /// ********* */
                 leitor.nextLine();
                System.out.println("Digite a quantidade de itens");
                qtd = Float.parseFloat(leitor.nextLine());

                System.out.println("Digite a sequencial");
                int seq2 = leitor.nextInt();
                Item item2 = new Item(seq2, qtd, p2, pedido2); 
                leitor.nextLine(); 
                //**** */
                 // Objetos da Classe item
                System.out.println("Digite a quantidade de itens");
                qtd = Float.parseFloat(leitor.nextLine());
 
                 System.out.println("Digite a sequencial");
                seq = leitor.nextInt();
                 Item item3 = new Item(seq, qtd, p3, pedido1);
  
                 /// ********* */
                 leitor.nextLine();
                 System.out.println("Digite a quantidade de itens");
                 qtd = Float.parseFloat(leitor.nextLine());
 
                 System.out.println("Digite a sequencial");
                seq2 = leitor.nextInt();



                Item item4 = new Item(seq2, qtd, p3, pedido2); 

                
                // ********* */

                //////////////// **********************************************
                pedido1.setItens(item1);
                pedido1.setSituacao(StatusPedido.APROVADO);
                pedido2.setItens(item2);
                pedido2.setSituacao(StatusPedido.APROVADO);

                pedido1.setItens(item3);
                pedido1.setSituacao(StatusPedido.ATENDIDO);
                pedido2.setItens(item4); 
                pedido2.setSituacao(StatusPedido.ATENDIDO);
                System.out.println(pedido1.toString());
                System.out.println(pedido2.toString());

                for (Item item  : pedido1.getItens() ) {
                        System.out.println(item);
                }

                for (Item item  : pedido2.getItens() ) {
                        System.out.println(item);
                }


                leitor.close();
        }
}
