programa
{
	
	funcao inicio()
	{
		inteiro num[5]  
		inteiro i , cont = 0
		
		para (i=0 ; i < 5 ; i++){
			escreva("Informe o " , i+1 , "º número: ")
			leia(num[i]) }
			se (num[1] % 2 == 0){
				cont++
			}
		escreva("Os números informados foram os: " )
		para (i=0 ; i<5 ; i++) {
			escreva(num[i] , "-")
		}
		escreva("\nVocê digitou" , cont , " números pares")
		para (i = 0 ; i < 5 ; i ++){
			se (num[i] % 2 == 0){
				escreva("\nposição: " , i+1)
		    }
		 }
		}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 332; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */