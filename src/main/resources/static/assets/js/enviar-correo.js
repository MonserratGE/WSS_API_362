//const btn = document.getElementById('enviarCorreo');

const form = document.getElementById("formulario")
form.addEventListener('submit', function(e) {
    e.preventDefault();
    let datos = new FormData(form);
    const email = form.querySelector('#email').value;
    const nombre = form.querySelector('#nombre').value;
    const direccion = form.querySelector('#direccion').value;
    const mensaje = form.querySelector('#mensaje').value;
    window.location.href=`mailto:samwebstuff.06@gmail.com?subject=Formulario&body=Correo%3A${email}%0ANombre%3A${nombre}%0ADirecci%C3%B3n%3A${direccion}%0AMensaje%3A${mensaje}`
})