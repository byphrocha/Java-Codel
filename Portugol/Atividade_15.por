programa
{
	
	funcao inicio()
	{
		inteiro n1, n2 , op
		escreva("Escolha um número: ")
		leia(n1)
		escreva("Escolha outro número: ")
		leia(n2)
		escreva("Qual opção deseja: \n")
		escreva("(1) Adição  || (2) Subtração || (3) Multiplicação || (4) Divisão \n")
		leia(op)
		
		escolha (op){
			caso 1: escreva("A adição de " + n1 + ("+") + n2 + (" será: ") + (n1+n2)) pare
			caso 2: escreva("A subtração de " + n1 + ("-") + n2 + (" será: ") + (n1-n2)) pare 
			caso 3: escreva("A multiplicação de " + n1 + ("*") + n2 + (" será: ") + (n1*n2)) pare
			caso 4: escreva("A divisão de " + n1 + ("/") + n2 + (" será: ") + (n1/n2)) pare
			caso contrario: escreva("Opção escolhida é invalida")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 198; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */