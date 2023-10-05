programa
{
	
	funcao inicio()
	{
		real n1, n2, n3, media
		escreva("Escreva a sua primeira nota: ")
		leia(n1)
		escreva("Escreva a sua segunda nota: ")
		leia(n2)
		escreva("Escreva a sua terceira nota: ")
		leia(n3)
		media = (n1 + n2 + n3)/3
		se (media >= 8){
			escreva("A sua media foi: " + media + " e o seu conceito foi A")
		} senao se(media < 5){
			escreva("A sua media foi " + media + " e o seu conceito foi C")
		} senao{
			escreva("A sua media foi " + media + " e o seu conceito foi B")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 511; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */