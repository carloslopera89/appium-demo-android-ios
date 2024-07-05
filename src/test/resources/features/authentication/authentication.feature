#language: es

Característica: autenticación en la aplicación de prueba
  Como usuario de demo mobile
  Quiero realizar la autenticación de un usuario
  Para acceder a las diferentes opciones de la aplicación

  @testExitoso
  Escenario: Ingresar en la aplicación demo
    Dado inicio la aplicación demo
    Cuando ingreso con usuario "standard_user" y contraseña "secret_sauce"
    Entonces debería ver el home de la aplicación demo

  Escenario: Ingresar en la aplicación demo con validacion Ensure
    Dado inicio la aplicación demo
    Cuando ingreso con usuario "standard_user" y contraseña "secret_sauce"
    Entonces debería validar con Ensure y ver el home de la aplicación demo

  @testOutline
  Esquema del escenario: Ingresar en la aplicación demo con validacion Ensure
    Dado inicio la aplicación demo
    Cuando ingreso con usuario "<usuario>" y contraseña "<password>"
    Entonces debería validar con Ensure y ver el home de la aplicación demo

    Ejemplos:
      | usuario       | password     |
      | standard_user | secret_sauce |

  @testOutline
  Esquema del escenario: Ingresar en la aplicación demo con validacion Ensure
    Dado inicio la aplicación demo
    Cuando ingreso con usuario "<usuario>" y contraseña "<password>"
    Entonces debería validar con Ensure y ver el home de la aplicación demo

    Ejemplos:
      | usuario       | password     |
      | standard_user | secret_sauce |

  @testOutline2
  Esquema del escenario: Ingresar en la aplicación demo con validacion Ensure y data csv
    Dado inicio la aplicación demo
    Cuando ingreso con usuario "<usuario>" y contraseña "<password>"
    Entonces debería validar con Ensure y ver el home de la aplicación demo

    Ejemplos:
|usuario|password|
######      | @externaldata@data/autenticaciondata.csv |

  @testOutline3
  Esquema del escenario: Ingresar en la aplicación demo con validacion Ensure y data csv
    Dado inicio la aplicación demo
    Cuando ingreso con usuario "<usuario>" y contraseña "<password>"
    Entonces debería validar con Ensure y ver el home de la aplicación demo

    Ejemplos:
|usuario|password|
######      | @externaldata@data/autenticaciondata.csv |
