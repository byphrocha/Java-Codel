programa
{
	
	funcao inicio()
	{
		inteiro op
		escreva("Escolha o seu estado civil: \n")
		escreva("(1) Solteiro || (2) Casado   || (3) Divorciado \n")
		escreva("(4) Viúvo    || (5) Amasiado || (6) Outro \n")
		leia(op)

		escolha (op){ 
			caso 1: escreva("Você escolheu a opção solteiro!") pare
			caso 2: escreva("Você escolheu a opção casado!") pare
			caso 3: escreva("Você escolheu a opção divorciado!") pare
			caso 4: escreva("Você escolheu a opção viuvo!") pare
			caso 5: escreva("Você escolheu a opção amasiado!") pare
			caso 6: escreva("Você escolheu a opção outros!") pare
			caso contrario: escreva("Opção escolhida é invalida")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 214; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */