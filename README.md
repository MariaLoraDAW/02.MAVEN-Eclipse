# 02.MAVEN-Eclipse
Se procede a la instalación de Java y Maven. Comprobar que podemos acceder a sus comandos desde cualquier parte de nuestro sistema.
Para ello comprobaremos que el Path y las variables de entorno (tanto de java como de maven están bien enrutadas).

Procedemos a crear un proyecto Maven dentro de eclipse. Para este caso partiremos de un arquetipo predefinido. A la hora de crear el proyecto desmarcaremos la 
casilla de "crear un proyecto sencillo". A continuación filtraremos nuestro arquetipo con las palabras clave "apache.maven" y buscaremos el famoso "quickstart".

Esto nos creará un proyecto con todos los modulos correspondientes y nuestro pom.xml ya creado. Ahora desarrollaremos nuestra aplicación, en este caso un menu, una secuencia fibonacci y un generador de pdf.

Estas clases que creamos las generaremos en la carpeta src/main/java dentro de su correspondiente paquete. 

En el caso de necesitar importar cualquier plugin deberemos hacerlo (a través del método que se prefiera) y  añadirlo a nuestro pom.xml y debe quedar comprendido dentro de las etiqueta principal <project></project>.
También añadiramos las dependencias que vayamos a necesitar como por ejemplo la clase "fibonacci" a la hora de configurar el pom.xml de nuestra mainClass "fibonacciMain", sin este paso nuestra main no reconocerá la clase a la que está llamando.

Una vez creadas nuestras clases podemos ir ejecutandolas desde eclipse como una aplicación java para comprobar que funciona y en caso de no hacerlo observar los mensajes que nos devuelve la consola paras
solucionar los posibles "bugs" que nos vayamos encontrando.

Destacar que debemos estar pendiente de la pestaña "problems" ya que es un indicador de los posibles fallos que estemos cometiendo. Los más comunes que se me han presentado en estos ejercicios han sido
problemas de compatibilidad entre las JRE y la versión del compilador de Java, problemas de sintaxis y con la configuración del pom.xml. 

Notas:

-JDK utilizado 17.0.1
-Version de compilador: 1.7
