document.getElementById("face").addEventListener("click", function () {
  document.body.style.background = "#00008b";
  document.getElementById("facebook").style.display = "block";
});

document.getElementById("git").addEventListener("click", function () {
  document.body.style.background = "#fff";
  document.getElementById("github").style.display = "block";
});

document.getElementById("linkedin").addEventListener("click", function () {
  document.body.style.background = "#0e76a8";
  document.getElementById("linkedinImagem").style.display = "block";
});

document.getElementById("insta").addEventListener("click", function () {
  document.body.style.background = "#c13584";
  document.getElementById("instagram").style.display = "block";
});

document.getElementById("face").addEventListener("mouseover", function () {
    document.body.style.background = "#add8e6";
    document.getElementById("facebook").style.display = "none";
  });
document.getElementById("git").addEventListener("mouseover", function () {
    document.body.style.background = "#add8e6";
    document.getElementById("github").style.display = "none";
  });
document.getElementById("linkedin").addEventListener("mouseover", function () {
    document.body.style.background = "#add8e6";
    document.getElementById("linkedinImagem").style.display = "none";
  });
document.getElementById("insta").addEventListener("mouseover", function () {
    document.body.style.background = "#add8e6";
    document.getElementById("instagram").style.display = "none";
  });
