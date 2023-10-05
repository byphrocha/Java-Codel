programa
{
	
	funcao inicio()
	{
		cadeia aluno[3]
		inteiro n1[3]
		real media[3]
		inteiro i , j

		para(i=0 ; i<3 ; i++){  //repetição para inserir os alunos
			escreva("\nInforme o nome do aluno(a): ")
			leia(aluno[i])
			para(j=0 ; j<3 ; j++){   //repetição para receber notas dos alunos
				escreva("Informe a " , j+1 , "ª nota:")
				leia(n1[j])
				
				}
			media[i] = (n1[0]+n1[1]+n1[2]) / 3
			}
		para(i=0; i<3; i++)
		escreva("\nA média do " ,aluno[i] , " = " , media[i])
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 71; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */