let modal = document.querySelector("#minhaModal"); // criar a variavel e inserir nela o elemento div dentro dela
let placarModal = document.querySelector("#placar"); // criar a variavel e inserir o elemento "placar"
let perguntaAtual = 0;
let acertos = 0;

let questoes = [
    { questao: "Quanto é 2 + 2?" , resposta: "4" },
    { questao: "Quanto é 2 * 2?" , resposta: "4" },
    { questao: "Raiz quadrada de 16?" , resposta: "4" },
    { questao: "O dobro de 1 + 1 é?" , resposta: "3" },
    { questao: "2 elevado a 2 é?" , resposta: "4" },
    { questao: "100 dividido por 25?" , resposta: "4" }
];

function iniciarGame(){
    modal.style.display = "block"
    mostrarQuestao();
}
function mostrarQuestao(){
    if(perguntaAtual < questoes.length){
        document.querySelector("#questao").innerText = questoes[perguntaAtual].questao
    }
    else{
        showPlacar()
    }
}
function showPlacar(){
    modal.style.display = "none";
    placarModal.style.display = "block"
    document.querySelector("#acertos").innerText = "Você acertou" + acertos + " de " + questoes.length + " perguntas "
}
function checarPergunta(){
    let pergunta = document.querySelector("#pergunta").value;
    let resultado = document.querySelector("#resultado");
    if(pergunta  == questoes[perguntaAtual].resposta){
        resultado.innerText = "Resposta Correta!"
        acertos++
    }
    else{
        resultado.innerText = "Resposta Incorreta!"
    }
    perguntaAtual++
    document.querySelector("#pergunta").value="";
    mostrarQuestao()
}
function fecharModal(){
    modal.style.display = "none";
    perguntaAtual = 0;
}
