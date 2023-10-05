programa
{	
		inteiro i
		cadeia nome ="" , n =""
		real nota=0.0 , maior=0.0
	funcao inicio(){
	
		escreva("Informe a nota do Aluno: ")
		leia(nota)
		escreva("Informe o nome do Aluno: ")
		leia(nome)
		menu()
	}
	funcao menu (){
		limpa()
		escreva("#####################################\n")
		escreva("#                                   #\n")
		escreva("#       Verificador de nota         #\n")
		escreva("#           Maior nota: ",nota,"        #\n")
		escreva("#           Aluno: ", nome,"            #\n")
		escreva("#                                   #\n")
		escreva("#                                   #\n")
		escreva("#####################################\n")
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