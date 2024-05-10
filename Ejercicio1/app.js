// Primera función
function lengthString(string, array) {
  return array.filter((word) => word.length > string.length);
}

// Segunda función
function printResult(array) {
  const ul = document.querySelector("ul");
  ul.innerHTML = "";
  array.forEach((word) => {
    const li = document.createElement("li");
    li.textContent = word;
    ul.appendChild(li);
  });
}

// Ejemplo de uso
const myArray = [
  "insecto",
  "bootcamp",
  "mangos",
  "reptil",
  "mosca",
  "escritorio",
  "computadora",
  "teclado",
  "libro",
  "pluma",
  "cuaderno",
  "silla",
  "mesa",
  "ventana",
  "puerta",
  "piso",
  "techo",
  "pared",
  "lámpara",
  "reloj",
  "bolígrafo",
  "pantalla",
  "ratón",
  "teléfono",
  "impresora",
];

document.getElementById("button").addEventListener("click", () => {
  const input = document.getElementById("input").value;
  const result = lengthString(input, myArray);
  printResult(result);
});
