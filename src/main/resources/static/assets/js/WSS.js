const info_template = document.getElementById("info_template");
const img_tamplate = document.getElementById("info_template");

/* Crear una función que permita cambiar el template string de una card completa
 * @param {string} template
 */

const btn_Adolf = document.getElementById("btn_Adolf");
const btn_Mitzi = document.getElementById("btn_Mitzi");
const btn_Aket = document.getElementById("btn_Aket");
const btn_Monse = document.getElementById("btn_Monse");
const btn_Manu = document.getElementById("btn_Manu");
const btn_Mijh = document.getElementById("btn_Mijh");

const template_Adolf = `
            <div class="container fondo">
                <div class="row texto-equipo align-items-center">
                    <div id="" class="col-12 col-md-6 mt-5 mb-5">
                        <div id="img_tamplate">
                            <img class="img-card w-100 h-100" src="assets/img/Adolfo.jpg" alt="">
                        </div>
                    </div>
                    <div class="col-12 col-md-6">
                        <div id="info_template" class="cont-texto d-flex flex-column">
                        <h3>  Mario Adolfo Rodriguez Gutierrez  </h3>
                        <h4> Equipo SCRUM </h4>
                        <hr>
                        <p>
                        Egresado como Técnico Quimico Industrial con titulo y cedula profesional del Conalep Tlalpan 2.
                        Ingeniería Robótica Industrial hasta 5to semestre en la ESIME Azcapotzalco del IPN.
                        Con espíritu emprendedor, persistente, perseverante y servicial.
                        </p>
                        <div class="redes">
                            <div class = ic-redes>
                                <a href="https://www.instagram.com/athalwolf369/">
                                    <i class="fa-brands fa-instagram"></i> 
                                </a>
                            </div>
                            <div class = ic-redes>
                                <a href="https://www.linkedin.com/in/mario-adolfo-rodriguez-gutierrez-141988235/">
                                    <i class="fa-brands fa-linkedin-in"></i>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>`;
const template_Mitzi = `
            <div class="container fondo">
                <div class="row texto-equipo align-items-center">
                    <div id="" class="col-12 col-md-6 mt-5 mb-5">
                        <div id="img_tamplate">
                        <img class="img-card w-100 h-100" src="assets/img/Mitzi.jpg" alt="">
                        </div>
                    </div>
                    <div class="col-12 col-md-6">
                    <div id="info_template" class="cont-texto d-flex flex-column">
                        <h3>  Mitzi Daniela Hernández Sánchez </h3>
                        <h4> Equipo SCRUM </h4>
                        <hr>
                        <p>
                        Soy recién egresada en Ingeniería en sistemas computacionales y cuento con carrera técnica en informática, por lo cual me considero una persona con diversos conocimientos en el ámbito tecnológico, dispuesta a seguir aprendiendo y desarrollándome tanto académica como laboralmente, para un mejor desempeño y aplicación de mis conocimientos.
                        </p>
                        <div class="redes">
                            <div class = ic-redes>
                                <a href="https://www.instagram.com/mavis.swagger/">
                                <i class="fa-brands fa-instagram"></i> 
                                </a>
                            </div>
                            <div class = ic-redes>
                                <a href="https://www.linkedin.com/in/mitzi-daniela-hernandez-sanchez/">
                                <i class="fa-brands fa-linkedin-in"></i>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>`;
const template_Akes = `
            <div class="container fondo">
                <div class="row texto-equipo align-items-center">
                    <div id="" class="col-12 col-md-6 mt-5 mb-5">
                        <div id="img_tamplate">
                            <img class="img-card w-100 h-100" src="assets/img/Aketzali.jpeg" alt="">
                        </div>
                    </div>
                    <div class="col-12 col-md-6">
                    <div id="info_template" class="cont-texto d-flex flex-column">
                        <h3>  Miriam Aketzali González Sánchez  </h3>
                        <h4> Equipo SCRUM </h4>
                        <hr>
                        <p>
                        Egresada en Administración con gran interés en temas tecnológicos y de negocios, estudiainte en Desarrollo de Java Full Stack, con buena actitud y experinecia en trabajo en equipo, adaptibilidad y cooperación.
                        </p>
                        <div class="redes">
                            <div class = ic-redes>
                                <a href="https://www.instagram.com/ketza_nut/">
                                <i class="fa-brands fa-instagram"></i> 
                                </a>
                            </div>
                            <div class = ic-redes>
                                <a href="https://www.linkedin.com/in/miriamagonz%C3%A1lezsan/">
                                <i class="fa-brands fa-linkedin-in"></i>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>`;
const template_Monse = `
            <div class="container fondo">
                <div class="row texto-equipo align-items-center">
                    <div id="" class="col-12 col-md-6 mt-5 mb-5">
                        <div id="img_tamplate">
                            <img class="img-card w-100 h-100" src="assets/img/Monse.jpg" alt="">
                        </div>
                    </div>
                    <div class="col-12 col-md-6">
                    <div id="info_template" class="cont-texto d-flex flex-column">
                        <h3>  Monserrat Amanda García Espinoza  </h3>
                        <h4> Scrum Master </h4>
                        <hr>
                        <p>
                        Técnica en Infromática y Desarrolladora Java Full Stack. Tengo gran intéres en las herramientas tecnológicas. En muchos aspectos, agente de cambio. En busca de oportunidades en donde pueda desarrollar mis habilidades y adquirir experiencia.
                        </p>
                        <div class="redes">
                            <div class = ic-redes>
                                <a href="https://www.instagram.com/mon.garez/">
                                <i class="fa-brands fa-instagram"></i> 
                                </a>
                            </div>
                            <div class = ic-redes>
                                <a href="https://www.linkedin.com/in/monserrat-amanda-garcia-espinoza-z/">
                                <i class="fa-brands fa-linkedin-in"></i>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>`;
const template_Manu = ` 
            <div class="container fondo">
                <div class="row texto-equipo align-items-center">
                    <div id="" class="col-12 col-md-6 mt-5 mb-5">
                        <div id="img_tamplate">
                            <img class="img-card w-100 h-100" src="assets/img/Manuel.jpg" alt="">
                        </div>
                    </div>
                    <div class="col-12 col-md-6">
                    <div id="info_template" class="cont-texto d-flex flex-column">
                        <h3>  Manuel Adán Carrillo Zavala  </h3>
                        <h4> Product Owner</h4>
                        <hr>
                        <p> 
                        Apasionado Ingeniero en Desarrollo y Gestion del Software, con 2 años de experiencia en el ramo. A lo largo de este tiempo he tenido la frotuna de participar en las diferentes áreas del desarrollo de software, así como también la oportunidad de apoyar en la gestión de algunos proyectos.
                        </p>
                    <div class="redes">
                            <div class = ic-redes>
                                <a href="https://www.instagram.com/manuel_adancz/">
                                <i class="fa-brands fa-instagram"></i> 
                                </a>
                            </div>
                            <div class = ic-redes>
                                <a href="https://www.linkedin.com/in/manuelcarrillozticdev/">
                                <i class="fa-brands fa-linkedin-in"></i>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>`; 
const template_Mijh = `
            <div class="container fondo">
                <div class="row texto-equipo align-items-center">
                    <div id="" class="col-12 col-md-6 mt-5 mb-5">
                        <div id="img_tamplate">
                            <img class="img-card w-100 h-100" src="assets/img/Mijhail.jpeg" alt="">
                        </div>
                    </div>
                    <div class="col-12 col-md-6">
                    <div id="info_template" class="cont-texto d-flex flex-column">
                        <h3>  Mijhail Cabrera Huerta  </h3>
                        <h4> Equipo Scrum </h4>
                        <hr>
                        <p>
                        Algunos de los atributos que me caracterizan son: Ambición, Perseverante, Paciente y Dedicado. Considero que tengo capacidad de análisis a un problema, sea cual sea, que esto a su vez junto con mi paciencia y perseverancia me han dado excelentes resultados en el ámbito personal y laboral.
                        </p>
                    <div class="redes">
                        <div class = ic-redes>
                                <a href="https://www.instagram.com/mijhailrs/">
                                <i class="fa-brands fa-instagram"></i> 
                                </a>
                            </div>
                            <div class = ic-redes>
                                <a href="https://www.linkedin.com/in/mijhail-cabrera-h/">
                                <i class="fa-brands fa-linkedin-in"></i>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>`;

btn_Adolf.addEventListener("click", () => {
  info_template.innerHTML = template_Adolf;
});

btn_Mitzi.addEventListener("click", () => {
  info_template.innerHTML = template_Mitzi;
});

btn_Mijh.addEventListener("click", () => {
  info_template.innerHTML = template_Mijh;
});

btn_Manu.addEventListener("click", () => {
  info_template.innerHTML = template_Manu;
  
});

btn_Monse.addEventListener("click", () => {
  info_template.innerHTML = template_Monse;
});

btn_Aket.addEventListener("click", () => {
  info_template.innerHTML = template_Akes;
});
