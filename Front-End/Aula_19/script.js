let slideAtual = 1;
let slideMax = 3;
let tempo = 3000;

function troca() {
  document.getElementById("b1").style.visibility = "hidden";
  document.getElementById("b2").style.visibility = "hidden";
  document.getElementById("b3").style.visibility = "hidden";
  document.getElementById("b" + slideAtual).style.visibility = "visible";
  slideAtual++;
  if (slideAtual > slideMax) {
    slideAtual = 1;
  }
}

function slider() {
  document.getElementById("b1").style.visibility = "hidden";
  document.getElementById("b2").style.visibility = "hidden";
  document.getElementById("b3").style.visibility = "hidden";
  sliderTimer = setInterval(troca, tempo);
}
