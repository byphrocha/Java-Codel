function construirtabela(){
    let tabela = document.querySelector("#tabela tbody");
    let produto = document.querySelector("#nproduto").value;

    tabela.innerHTML = "";

    for(let i = 0 ; i < 10 ; i++){
        let preco = Math.random() * 50 + 50
        let n = Math.floor(Math.random() * 10)
        let tipo = Math.floor(Math.random() * 7)
        
        let conteudo = `
                       <td>${lojas[n]}</td>
                       <td>${produto}${modelo[ tipo]}</td>
                       <td>${preco.toFixed(2).replace('.',',')}</td>
                        `
        let tr = document.createElement("tr")
        tr.innerHTML = conteudo;
        tabela.append(tr);
    }
}

document.querySelector(".btn").addEventListener('click', construirtabela)

let lojas = ["Carrefour","Muffato","Fast","Magazine Luiza","Kabum","Pichau","Mercado Livre","Shopee","Aliexpress","Amazon"]

let modelo = ["pad"," ergonômico"," gamer"," slim"," wireless"," serial"," usb"]

let inptText = document.querySelector('input')
inptText.addEventListener('keydown' , botaoPressionado(e))

function botaoPressionado(e){
    if (e.key === 'Enter'){
        construirtabela()
    }

}

