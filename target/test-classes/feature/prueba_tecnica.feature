# language: es


  Característica: ingresar a la página de Utest.com
    y proceder a dar click en la opción de registro (JOIN TODAY)
    y realizar el diligenciamiento del formulario con la finalidad de crear un nuevo usuario.

  @Escenario1
    Escenario:Ir a la web y precionar boton de registro
      Dado que un usuario accede a la pagina web de utest y preciona el boton join today
      Cuando llenamos el formulario de información personal con el nombre Nombre Apellido correo ejemplo2@gmail.com y la fecha de nacimiento February/20/2000
      Y llenamos el formulario de registro de localización la ciudad Cartagena, codigo postal 080006 y el pais Colombia
      Y llenamos el formulario de dispositivo con tu computador Windows la version 10 y el lenguaje Spanish
      Y llenamos el formulario de contraseña creando una contraseña VBew23@fa*
      Entonces deberia ver Welcome to the world's largest community of freelance software testers!
