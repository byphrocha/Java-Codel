const btnAdicionar = document.querySelector("#btnAdicionar");
//cria uma variável consta
//document = documento d html
// querySelector = selecionar qualquer item da tela, com indicaçao
// #btnAdicionar = botão com id = "Adicionar"

//addEventlistener = ouvinte de ações na tela sobr o botão, recebe 2 argumentos... 1 ação e outra função.
btnAdicionar.addEventListener("click", function () {
  const item = document.createElement("li");
  //crie um novo elemento html(li) e insere uma variável
  const caixaValor = document.querySelector("#minhaCaixa").value;
  //seleciona o elemento #minhaCaixa, e insere na variável
  const novaTarefa = document.createTextNode(caixaValor);
  //adiociona o texto do input na variável
  item.appendChild(novaTarefa);
  //appendChild = insere o texto na li

  //verifica se o input está ou não vazio
  if (caixaValor === "") {
    alert("Você deve informar uma nova tarefa para adicionar");
    //mostra uma caixa de aviso em tela
  } else {
    document.querySelector("#tarefas").appendChild(item);
    //insere novo elemento texto no "li"
  }
  document.querySelector("#minhaCaixa").value = "";
  //zera, apaga o valor do input digitado

  //botão "Apagar"
  const span = document.createElement("span");
  //cria um novo elemento span
  const icon = document.createTextNode("\u00d7");
  //crie e adiciona um "caracter especial" texto no html, este código refere-se a um "X".
  span.className = "fechar";
  //adiciona a classe "Fechar" a essa span
  span.appendChild(icon);
  //adiciona o "icon" texto na span
  item.appendChild(span);
  //insere a span na "li criada."
  /*--------------------------------- */
  //Deletar uma tarefa
  const close = document.querySelectorAll(".fechar");
  //captura "todas" as spans com classe fechar
  /*------------------------------------------------------ */
  /*varre a lista de spans e verifica uma por uma, qual foi criada */
  //estrutura de repetição que inicia a zero e vai até o comprimento total de close
  for (let i = 0; i <close.length; i++){
    close[i].addEventListener("click", function(){
        //a cada elemento do close que for clicado será executado
        const item = this.parentElement;
        //captura a tag pai dessa"this tag span, no caso a li.
        item.style.display = "none";
        //Muda o display da li para "none" fazendo ela sumir    
    });

  }
});
//Marcar como "tarefa feita"
const list = document.querySelector("ul")//captura a lista inteira
//Ao clicar na lista a minha função recebe um evento
list.addEventListener("clicl", function(ev){
    //Se o nome do item que eu cliquei na lista foi "li"
    if(removeEventListener.target.nodeName === "li"){
        ev.target.classList.toggle("checado");
        //adiciona nesse elemento a classe "checked"
    }

})