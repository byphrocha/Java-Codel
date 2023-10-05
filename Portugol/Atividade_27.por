programa
{
	
	funcao inicio()
	{
		cadeia nome[3]
		inteiro i , n1[3] , n2[3] , n3[3] , m[3] 
		
		para (i = 0; i<3 ; i++){ 
			escreva("Informe o seu nome: ")
			leia(nome[i])}

		para (i = 0; i<3 ; i++){ 
			escreva("Informe a nota do aluno " , nome[i] , ":" )
			leia(n1[i])}

		para (i = 0; i<3 ; i++){ 
			escreva("Informe a 2ª nota do aluno " , nome[i] , ":")
			leia(n2[i])}
	     
	     para (i = 0; i<3 ; i++){ 
			escreva("Informe a 3ª nota do aluno " , nome[i] , ":")
			leia(n3[i])}

 		para (i = 0; i<3; i++){
			escreva("\nA media das notas do " , nome[i] , " é " , ((n1[i]+n2[i]+n3[i])/3))
 		}
			
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 531; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */