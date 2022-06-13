const myAccess = '563492ad6f91700001000001189ff3f514204c2e8051b9e549c2158b';
const search = window.location.href.split('=').pop();
const searchResult = document.getElementById('searchResult');

const url = `https://api.pexels.com/v1/search?query=${search}&per_page=57`;

fetch(url, {
    headers: {
        Authorization: myAccess
    }
    }).
    then(
        (response) => response.json()
        ).
        then(
            (data) => {
            const arrayImages = data.photos.slice(0, 57);
            console.log(arrayImages);
            arrayImages.forEach(image => {

            const datosNecesarios = {
                id: image.id,
                image: image.src.tiny,
                title: image.photographer,
                alt: image.alt
            }

            const template = `
            <div class="col-sm-10 col-md-6 col-lg-4">      
                <div class="card mt-3 mb-3" role="button">
                    <img src="${datosNecesarios.image}" class="card-img-top img-card" alt="${datosNecesarios.alt}"/>
                    <div class="card-body">
                        <div class="d-flex flex-row bb-2">
                            <h5 class="card-title ">${datosNecesarios.title}</h5>
                            <a class="ml-auto card-title " href="carrito.html"> <i class="fas fa-shopping-cart fa-2x go-shopping go-shopping"></i> </a>            
                        </div>
                            <p class="card-text mb-3">
                                This is a longer card with supporting text below as a natural
                                lead-in to additional content. This content is a little bit
                                longer.
                            </p>
                        </div>
                    </div>
                </div>
            </div>
            `;
            searchResult.innerHTML += template;
    });
});