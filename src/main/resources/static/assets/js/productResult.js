const product = window.location.href.split('=').pop();
const url = 'src/api/datamuebles.json';
const productContainer = document.getElementById('productContainer');

//console.log(product);
fetch(url).then(response => response.json()).then(data => {
    const toArray = Object.entries(data);
    const producto = toArray[0][1].filter(producto => producto.id == product);
    //console.log(producto[0]);
    const datosNecesarios = {
        id: producto[0].id,
        nombre: producto[0].nombre,
        descripcion: producto[0].descripcion,
        categoria: producto[0].categoria,
        cuidados: producto[0].cuidados,
        funcionalidad: producto[0].funcionalidad,
        materiales: producto[0].materiales,
        precio: producto[0].precio,
        imagen_frontal: producto[0].imagen_frontal,
        imagen_general: producto[0].imagen_general,
        imagen_lateral: producto[0].imagen_lateral,
    };

    const template = `
    <div class="row">
        <div class="col-12 col-md-7 col-lg-6">
            <img class="img-logo w-100 h-auto p-3" src="${datosNecesarios.imagen_general}" alt="">
        </div>
        <div class="col mt-5 mb-5">
            <h2 class="display-4 mb-3">${datosNecesarios.nombre}</h2>
            <h4 class="mb-3">Descripción:</h4>
            <p class="mb-3">
                ${datosNecesarios.descripcion}
            </p>
            <h5 class="mb-3">Características:</h5>
            <table class="table table-striped">
                <thead class="thead-dark">
                    <tr>
                        <th scope="col">
                            <div>Precio</div>
                        </th>
                        <th scope="col">
                            <div>Materiales</div>
                        </th>
                        <th scope="col">
                            <div >Funcionalidad</div>
                        </th>
                        <th scope="col" class="d-none d-lg-block">
                            <div class="d-flex flex-row">
                                <div>Cuidados</div>
                                <div class="ml-auto">
                                    <a href="carrito.html">
                                        <i class="fas fa-shopping-cart go-shopping go-shopping text-light"></i>
                                    </a>
                                </div>
                            </div>
                        </th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>$${datosNecesarios.precio}</td>
                        <td>${datosNecesarios.materiales}</td>
                        <td>${datosNecesarios.funcionalidad}</td>
                        <td class="d-none d-lg-block">${datosNecesarios.cuidados}</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
    <div class="row d-none d-md-block card">
        <div class="col-12 gridContainer">
            <div id="d1">
                <img class="img-logo w-100 h-100 p-3" src="${datosNecesarios.imagen_frontal}" alt="">
            </div>
            <div id="d2">
                <img class="img-logo w-100 h-100 p-3" src="${datosNecesarios.imagen_lateral}" alt="">
            </div>
            <div id="d3">
                <img class="img-logo w-100 h-100 p-3" src="${datosNecesarios.imagen_general}" alt="">
            </div>
        </div>
    </div>
    
    `;

    productContainer.innerHTML = template;
});
