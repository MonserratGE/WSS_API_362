//const myAccess = '563492ad6f91700001000001189ff3f514204c2e8051b9e549c2158b';
const url = 'src/api/datamuebles.json';
const catalogContainer = document.getElementById('catalogContainer');

fetch(url).then((response) => response.json()).
        then(
            (data) => {
            const arrayProducts = data.productos.slice(0, 25);

            arrayProducts.forEach(product => {
                const datosNecesarios = {
                    id: product.id,
                    nombre: product.nombre,
                    descripcion: product.descripcion,
                    front_image: product.imagen_frontal,
                }

                const template = `
                <div  class="col-12 my-4">      
                    <div class="card mt-3 mb-3 h-100" role="button">
                        <a id="${datosNecesarios.id}" class="productClass" href="productDetail.html">
                            <img src="${datosNecesarios.front_image}" class="card-img-top img-card" alt="${datosNecesarios.nombre}"/>
                        </a>
                        <div class="card-body">
                            <div class="d-flex flex-row bb-2">
                                <h5 class="card-title ">${datosNecesarios.nombre}</h5>
                                <a class="ml-auto card-title " href="carrito.html"> <i class="fas fa-shopping-cart fa-2x go-shopping go-shopping"></i> </a>            
                            </div>
                                <p class="card-text mb-3">
                                    ${datosNecesarios.descripcion}
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
                `;
                catalogContainer.innerHTML += template;
    });
});
