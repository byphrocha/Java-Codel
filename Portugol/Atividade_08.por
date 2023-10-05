programa
{
	
	funcao inicio()
	{
		inteiro n1 , n2 , n3
		cadeia nome
		escreva("Qual o seu nome? ")
		leia(nome)
		escreva("Escreva a primeira nota: ")
		leia(n1)
		escreva("Escreva a segunda nota: ")
		leia(n2)
		escreva("Escreva a terceira nota: ")
		leia(n3)
		se ((n1 + n2 + n3)/3 >= 7){
			escreva("Parabéns " + nome + " você foi aprovado!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 357; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */