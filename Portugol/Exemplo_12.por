programa
{
	inteiro n1, n2, res = 0
	funcao somar() {
		escreva("Informe o primeiro valor: ")
		leia(n1)
		escreva("Informe o segunfo valor: ")
		leia(n2)
		res += n1 + n2
		
	}
	funcao inicio()
	{
		somar()
		escreva("\nConjunto 2\n")
		somar()
		escreva("\nConjunto 3\n")
		somar()
		escreva("\nConjunto 4\n")
		somar()
		escreva("\nConjunto 5\n")
		somar()
		escreva("O resultado da soma dos números é: ", res)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 352; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */