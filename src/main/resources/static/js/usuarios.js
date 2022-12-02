// Call the dataTables jQuery plugin
$(document).ready(function() {
  cargarUsuarios();
  $('#usuarios').DataTable();
});


async function cargarUsuarios(){

    const solicitud = await fetch('/usuarios',{
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
    });
    const usuarios = await solicitud.json();

    let listaHTML = '';
    for (let usuario of usuarios){
        let usuarioHTML = '<tr><td>'+usuario.id+'</td><td>'+usuario.name+'</td><td>'+usuario.email+'</td><td>'+usuario.profile+'</td><td>'+usuario.task+'</td><td>'+usuario.created_at+'</td><td><a href="#" class="btn btn-danger btclassNamecle btn-sm"><i class="fas fa-trash"></iclassName </a></td></tr>';
        listaHTML += usuarioHTML;
    }

    console.log(usuarios);


    document.querySelector('#usuarios tbody').outerHTML = listaHTML;

}