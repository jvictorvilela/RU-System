

window.onload = function() {
  Particles.init({
      selector: '.canvas',
      color: '#2ecc71',
      maxParticles: 130,
      connectParticles: true,
      responsive: [
        {
          breakpoint: 768,
          options: {
            maxParticles: 80
          }
        }, {
          breakpoint: 375,
          options: {
            maxParticles: 50
          }
        }
      ]
  });

  $('.carousel-cardapio').carousel({
    interval: false
  });


};