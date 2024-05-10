// Función fetchAnswer que realiza una petición al API
async function fetchAnswer() {
    const response = await fetch('https://yesno.wtf/api');
    const data = await response.json();
    return data.answer;
}

// Muestra la respuesta del API en el HTML
async function showAnswer() {
    const answer = await fetchAnswer();
    document.getElementById('answer').innerText = answer;
}

// Agrega la función fetchAnswer a un eventListener
document.getElementById('button').addEventListener('click', function() {
    const input = document.getElementById('input');
    // Valida que no se pueda dar click al botón si el input esta vacio
    if(input.value.trim() === '') {
        alert('El input no puede estar vacío');
        return;
    }
    showAnswer();
    // Limpia la pregunta y la respuesta después de 5 segundos
    setTimeout(function() {
        input.value = '';
        document.getElementById('answer').innerText = '';
    }, 5000);
});
