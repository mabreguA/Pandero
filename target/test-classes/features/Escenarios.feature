#language:es

Característica: Validar la inforacion al acceder y navegar en el sistema Ginni de Pandero


  @Escenario1
  Esquema del escenario: Realizar un logeo en el sistema Ginni y verificar el mensaje del pop-up
    Dado Ingreso a Ginni
    Cuando  Ingreso las credenciales de usuario foliva y passrowd 123456 para el logeo
    Y Realizar el restablecmiento de contraseña e ingresar el mensaje pruebaspandero
    Entonces Validar que se muestre el siguiente
      | <mensaje> |
    Ejemplos:
      | mensaje                                                     |
      | Si el usuario es válido se te enviará un correo en el popup |
