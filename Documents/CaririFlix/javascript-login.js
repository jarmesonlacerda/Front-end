const name = document.getElementById('name')
const password = document.getElementById('password')
const form = document.getElementById('form')
const errorElement = document.getElementById('error')


form.addEventListener('submit',(e) =>{

    let messages = []
    if (name.value === '' || name.value == null) {
        messages.push('Nome Obrigatório')
    }

    if (password.value.length <= 6) {
        messages.push('A senha deve ter mais de 6 caracteres')
         }

    if (password.value.length >= 15) {
        messages.push('A senha deve ter menos de 15 caracteres')
        }

        if (password.value === 'password') {
            messages.push('Senha Iválida')
        }

    if (messages.length > 0) {
        e.prevertDefault()
        errorElement.innerText = messages.join(', ')
    }
})
    document.write(document.getElementById("Pag1").elements[0].values);
    var form = document.forms[0];
    var el = form.elements;

    for(var i = 0; i < el.length -1; i++){
        el[i].style.backgroundColor = "#ddd";
    }

//var form = document.forms["0"].id;
//document.write(form);