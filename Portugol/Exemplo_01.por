programa
{
	inclua biblioteca Texto
	funcao inicio()
	{
		cadeia nome, nome1, nome2
		inteiro qtd
		
		escreva("Escreva o seu nome: ")
		leia(nome)
		
		nome1 = Texto.caixa_alta(nome)
		nome2 = Texto.caixa_baixa(nome)
		qtd = Texto.numero_caracteres(nome)
		
		escreva("Seu nome é: " + nome1)
		escreva("\nSeu nome é: " + nome2)
		escreva("\nA quantidade de letras é: " + qtd)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 385; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */