import java.util.*;

public class atv04Um{
    public static void main(String[] args) {
        String[] produtos = {"Pão (UN)", "Maçã (KG)", "Sabão em pó 2kg (UN)", "Abacate (KG)", "Coca-Cola 2L (UN)"}; // Declaração das Listas
        double[] precos = {0.75, 8.2, 19.98, 5.76, 8.64};

        List<String> produtosCarrinho = new ArrayList<>(); //
        List<Double> precosCarrinho = new ArrayList<>();   //
        List<Double> unidadesCarrinho = new ArrayList<>(); //Fim da Declaração das Listas!!!!!

        Scanner scnProdutos = new Scanner(System.in);  //  Inicialização dos Scanners:
        int codScnProduto;                             // 
        Scanner scnQtdProduto = new Scanner(System.in);// 
        double qtdScnProd;                             // 
        Scanner scnContinuar = new Scanner(System.in); // Fim da Inicialização dos Scanners:

        double precoTotal = 0;

        while (true) {                                                                                // Loop Principal usando While
            System.out.println("Escolha um produto digitando o código correspondente:"); /*Exibição dos Produtos e Solicitação de Código do Produto:*/
            for (int i = 0; i < produtos.length; i++) {
                System.out.println("Cód.: " + i + " - Produto: " + produtos[i] + " - Preço: R$ " + precos[i]); /*Exibição dos Produtos e Solicitação de Código do Produto,  a estrutura lenght vê a quantidade de produtos dentro da lista fazendo juntamento com o for uma repetição que termina quando acabar a lista, como exemplo do pao irá aparecer da seguinte forma no terminal : Cód.: 0(POIS RETORNA O I, QUE NESTE CASO ESTÁ NA POSIÇÃO 0 DA LISTA) - Produto: Pão (UN)(LÊ PRODUTOS[I] DESTA FORMA ESCREVENDO O NOME DO PRODUTO NA POSIÇÃO I, NO CASO POSIÇ 0) - Preço: R$ 0.75(PREÇOS[I] DA MESMA FORMA QUE PRODUTOS RETORNA O VALOR DO PRODUTO QUE ESTA NA POSIÇÃO I, NO CASO POSIÇ 0) */
            }

            System.out.println("Digite o código do produto (ou 5 para encerrar a compra):");
            codScnProduto = scnProdutos.nextInt(); // ESCREVE A CONDIÇÃO DE REPETIÇAO QUE SO SERÁ ENCERRADA NA PROXIMA CONDIÇAÕ IF

            if (codScnProduto == 5) {
                break;                  // CONDIÇÃO QUE DETERMINA O FIM DO LOOP OU SEJA CASO DIGITADO O NUM 5 PARA(BREAK) O LOOP WHILE, CASO Ñ SEJA DIGITADO 5 IRÁ REPETIR TODA A PARTE DE CIMA NOVAMENTE.
            }

            if (codScnProduto >= 0 && codScnProduto < produtos.length) {  //VERIFICA SE O NUMERO É MAIOR OU IGUAL A 0 E MENOR QUE 4(QTD DE PROD)
                System.out.println("Digite a quantidade desejada:");
                qtdScnProd = scnQtdProduto.nextDouble();

                produtosCarrinho.add(produtos[codScnProduto]); /*NESSA LINHA ESTAMOS FALANDO PARA ADICIONAR O PRODUTO(CÓD) QUE DIGITAMOS NA LINHA 27(CODIGO DO PRODUTO) NA LISTA PRODUTOSCARRINHO /-/-/ NESSE CASO PRODUTOS[CODSCNPRODUTOS] FAZ RETORNAR O QUE ESTA NA POSIÇÃO CODSCNPRODUTO DA LISTA PRODUTO OU SEJA SE DIGITARMOS 0 IRÁ RETORNAR O PRODUTO QUE ESTA NA POSIÇÃO 0 NO CASO O PÃO*/
                precosCarrinho.add(precos[codScnProduto]);/*NESSA LINHA ESTAMOS FALANDO PARA ADICIONAR O PREÇO A LISTA PRECOSCARRINHO /-/-/ DA MESMA FORMA QUE ACIMA ESTÁ RETORNANDO O VALOR DE PRECO NA POSIÇÃO DO CÓD DIGITADO OU SEJA SE DIGITADO 0 IRÁ RETORNAR 0.75*/
                unidadesCarrinho.add(qtdScnProd);// ADICIONA A QUANTIDADE DE PRODUTOS NA LISTA  UNIDADESCARRINHO PARA MULTIPLICAR A SEGUIR 

                precoTotal += precos[codScnProduto] * qtdScnProd; // FAZ A MULTIPLICAÇÃO DO PREÇO COM A QTD E INSERE NA VARIAVEL PRECOTOTAL QUE É INICIADA COM 0 ANTES DA INICIALIZAÇÃO DO WHILE
            } else {
                System.out.println("Código de produto inválido. Tente novamente."); // CONDIÇÃO CASO Ñ FOR DIGITADO UM CODIGO POSSIVEL
            }
        }

        scnProdutos.close();    // FECHAMENTO DO SCANNER
        scnQtdProduto.close();  // FECHAMENTO DO SCANNER
        scnContinuar.close();   // FECHAMENTO DO SCANNER

        System.out.println("Produtos no carrinho:");// EXIBIÇÃO DO CARRINHO E VALOR TOTAL AO ENCERRAR O WHILE**ESSA PARTE ESTA FORA DO WHILE**
        for (int i = 0; i < produtosCarrinho.size(); i++) { // REPETIÇÃO USANDO O FOR IGUAL A PRIMEIRA POREM USANDO SIZE POIS Ñ TEMOS A QUANTIDADE DE PRODUTOS PRE DEFINIDAS SERAO DEFINIDAS PELO USUARIO
            System.out.println("Produto: " + produtosCarrinho.get(i) + " - Preço: R$ " + precosCarrinho.get(i) +
                    " - Quantidade: " + unidadesCarrinho.get(i));
        }

        System.out.println("Valor total da compra: R$ " + precoTotal);
    }
}
