programa
{
	funcao inicio()
	{
		real n1
		cadeia nome
		escreva("Qual o seu nome? ") //entrada do nome
		leia(nome)
		
		escreva("Escreva o seu salario: ")//entrada do salario
		leia(n1)
		
		se (n1 == 0 ou n1 < 1000.01){ // condições para aumento do salario 
			escreva("Olá " + nome + "o seu salario atual é " + n1 + " e o com o reajuste seu salario será: " + (n1+(n1*0.2)))
		} senao se (n1 >= 1000.01 ou n1 > 5000.00){
			escreva("Olá " + nome + "o seu salario atual é " + n1 + " e o com o reajuste seu salario será: "  + (n1+(n1*0.1)))
		} senao{ 
			escreva("Olá " + nome +	 "o seu salario atual é " + n1 + " e o com o reajuste seu salario será: " + (n1+(n1*0.02))) 
		}
			
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 586; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */