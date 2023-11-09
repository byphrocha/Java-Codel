let dx, dy;
let px, py;
let vel;
let obj;
let tmp;

function inicia(){
    dx = 0;
    dy = 0;
    px = 0;
    py = 0;
    vel = 10;
    obj = document.querySelector('#obj')
    tmp = setInterval(acao, 20)

    document.addEventListener('keydown' , teclaPressionada)
    document.addEventListener('keyup' , teclaLiberada)
}

function teclaPressionada(){
    let tecla = event.keyCode
    if(tecla == 37){
        dx = -1;
    }
    if(tecla == 38){
        dy = -1;
    }
    if(tecla == 39){
        dx = 1;
    }
    if(tecla == 40){
        dy = 1;
    }
}

function teclaLiberada(){
    let tecla = event.keyCode
    if(tecla == 37){
        dx = 0;
    }
    else if(tecla == 38){
        dy = 0;
    }
    else if(tecla == 39){
        dx = 0;
    }
    else if(tecla == 40){
        dy = 0;
    }

}

function acao(){
    px += dx*vel
    py += dy*vel

    obj.style.left = px + "px";
    obj.style.top = py + "px";

}

window.addEventListener('load', inicia)