programa
{
	inclua biblioteca Matematica --> m
	funcao inicio()
	{
		inteiro op, n1, n2
		escreva("Escolha qual forma deseja calcular a área: \n")
		escreva("(1) Retângulo || (2) Quadrado || (3) Losango || (4) Triangulo || (5) Círculo ||\n")
		leia(op)
		escolha (op){
			caso 1: escreva("Digite a base: ") 
			        leia(n1)
			        escreva("Digite a altura: ")
			        leia (n2)
			        escreva("A área será: " + (n1*n2))  pare
			caso 2: escreva("Digite o valor do primeiro lado: ") 
			        leia(n1)
			        escreva("A área será: " + (n1*n1))  pare
			caso 3: escreva("Digite a diagonal maior: ") 
			        leia(n1)
			        escreva("Digite a diagonal menor: ")
			        leia (n2)
			        escreva("A área será: " + (n1*n2)/2)  pare
			caso 4: escreva("Digite a base: ") 
			        leia(n1)
			        escreva("Digite a altura: ")
			        leia (n2)
			        escreva("A área será: " + (n1*n2)/2)  pare
			caso 5: escreva("Digite o valor do raio: ") 
			        leia(n1)
			        escreva("A área será: " + (3.14*n1))  pare
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1070; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */