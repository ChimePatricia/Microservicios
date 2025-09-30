# Proyecto: Microservicios

El proyecto “Microservicios” está orientado al desarrollo de aplicaciones basadas en una arquitectura distribuida, donde la funcionalidad del sistema se divide en módulos independientes (microservicios).
Cada microservicio está diseñado para cumplir con una tarea específica (por ejemplo: gestión de usuarios, catálogo de productos, autenticación, pagos, etc.), y todos ellos se comunican entre sí mediante APIs REST o mensajería asíncrona.
El objetivo del proyecto es demostrar cómo una aplicación puede construirse y escalarse más fácilmente utilizando microservicios en lugar de un sistema monolítico. Esta metodología permite:

- Escalabilidad → cada servicio puede crecer de forma independiente.
- Mantenibilidad → el código está modularizado y más simple de actualizar.
- Resiliencia → si un servicio falla, no necesariamente afecta a los demás.

# Instrucciones de compilación y uso
1. Requisitos previos
Antes de compilar y ejecutar el proyecto, asegúrate de tener instalado:
Java JDK
 (si los servicios están en Spring Boot).
Maven
 o Gradle
 (dependiendo del gestor usado).
Docker
 (si los microservicios están contenedorizados).
Postman
 o navegador para probar las APIs.

2. Instalación del proyecto
Descarga y descomprime el archivo ZIP.
Abre cada carpeta de microservicio en tu IDE (por ejemplo, IntelliJ o Eclipse).
Compila cada servicio con Maven o Gradle:
mvn clean install
o
gradle build

3. Ejecución en entorno local
Dependiendo de la configuración:
Si son servicios Spring Boot, inicia cada uno con:
mvn spring-boot:run
Si se usa Docker, simplemente levanta los contenedores con:
docker-compose up
Cada microservicio correrá en un puerto distinto (por ejemplo: http://localhost:8081/usuarios, http://localhost:8082/pedidos, etc.).

4. Uso del sistema
Accede a las APIs de cada servicio desde Postman o el navegador.
Según el diseño, podrás:
Crear y consultar información en la base de datos.
Probar la comunicación entre microservicios (ejemplo: un pedido consulta al servicio de usuarios).
Si existe un API Gateway, todos los microservicios estarán disponibles desde un único punto de entrada.
