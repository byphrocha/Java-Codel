programa
{
	inclua biblioteca Texto --> txt
	funcao inicio()
	{
		cadeia texto, texto2 = "norte" , substituicao
		inteiro pos
	
		texto = "Rio Grande do Sul"

		pos = txt.posicao_texto("Sul", texto, 0)

		escreva(pos)
		substituicao = txt.substituir(texto, "Sul", texto2)
		escreva("\n" + substituicao)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 293; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */