#language:es

Característica: Validar la inforacion al acceder y navegar en el sistema Ginni de Pandero


  @Escenario1
  Esquema del escenario:
    Dado Ingreso a la pagina de SauceDemo
    Cuando Uso las credenciales de usuario standard_user y password secret_sauce
    Entonces Valido que se muestre el siguiente
      | <producto> |
    Cuando Seleccionemos el producto
    Y Agregamos al carrito y vamos al inventario
      #Al agregar al carrito con el boton add tambien en la parte superior direccionamer al invetario
    Entonces Confirmamos la compra del producto en el checkout
    Y llenamos los siguientes datos
      |<first>|<last>|<postal>|
    Y continuamos para validar la compra y confirmar
    Y Volver a la pagina de compra

    Ejemplos:
      | producto                 | first   | last | postal |
      | Sauce Labs Fleece Jacket | Cliente | Test | Lima20 |