<input id="a" type="number">
<input id="b" type="number">
<button onclick="somar()">Somar</button>
<p id="resultado"></p>

<script>
function somar() {
    let a = Number(document.getElementById("a").value);
    let b = Number(document.getElementById("b").value);
    document.getElementById("resultado").innerText = a + b;
}
</script>
