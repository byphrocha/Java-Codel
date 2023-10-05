programa
{
	
	funcao inicio()
	{
		inteiro b1, i  
		real resultado = 0.0, media = 0.0
		i = 1
		
		enquanto (i <= 4){
			escreva("\nDigite sua " , i , " nota: ")
			leia(b1)
			resultado += b1
			i++
		}
		media = resultado / 4
		escreva("\nA média do aluno é: " , media)
		se (media>=60){
			escreva("\nAluno Aprovado")}
		senao{ 
			escreva("\nAluno Reprovado")}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 247; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */