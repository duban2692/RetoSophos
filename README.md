# Introduction 
el proyecto va orientado a la busqueda de un producto y validación que se agregue al carrito de compras. 

# CONTENIDO
##	Adecuacion del proyecto: 
Para configurar el proyecto en la maquina para su modificación se recomienda seguir los siguientes pasos:
- Ingresar a la url donde se encuentra almancenado el proyecto en el repositorio
y clonar el repositorio.
- Importar el proyecto clonado en su IDE de preferencia, se recomienda trabajar con Eclipe o IntelliJ IDEA
- Instalar dependencias requeridas para su correcto funcionamiento. 

## Explicacion del proyecto:
- El proyecto cuenta con un paquete llamado feature, el cual se encuentra en el folder src/test/resources. En este paquete feature estan todos los escenarios que se están validando en la automatizacion. 
Si se desea agregar nuevos escenarios de prueba se deben agregar en el archivo .feature que mas se relacione con lo que se desee probar, en estos archivos .feature es donde se dejan consignados los datos de prueba, por lo que si se requeire cambiar los datos de prueba se debe recurrir a los archivos feature y hacer sus respectivas modificaciones de datos.
- Se cuenta con un archivo serenity.properties que se encuentra en la raíz del proyecto, en el cual se encuentra el nombre del navegador web con el cual se hará la prueba, por el momento se tienen parametrizados los navegadores Google Chrome.
- Si se desean agregar nuevos escenarios de prueba, como se mencionó anteriormente el primer paso es crear su respectivo escenario en el archivo .feature, si el archivo .feature es nuevo se debe crear su respectiva clase runner, la cual se encargara de correr la prueba ademas de implementar su respectivo step definitions.

## Alcance
Se ingresa a la URL y se agrega el producto al carrito.

## Ejecucion:
Para ejecutar el proyecto se puede usar Junit o desde gradle, se recomienda ejecutar mediante gradle en la línea de comandos para que quede la evidencia que el framework de serenity brinda tras la ejecucion de una prueba.

_______________________________________URLs_______________________________________________
																					      |
La Url: 	  |

__________________________________________________________________________________________|


Cuando se ejecuta mediante gradle con el parametro verify, serenity deja un archivo de evidencia de las pruebas, el cual queda alojado en la siguiente ruta:
