const container = document.getElementById('catalogContainer');
console.log(typeof container); //-> object
const products = container.querySelectorAll('[id]');
console.log(products); //-> NodeList(25)
console.log(typeof products); //-> object
const product = products.forEach(product => { 
    product.addEventListener('click', (e) => { //-> e.target.id
        e.preventDefault();
        const pSelected = e.path[1].id;
        //console.log(pSelected);
        window.location.href = `productDetail.html?id=${pSelected}`;
    });
});
