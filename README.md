## Example API REST with JAVA, SPRING-BOOT, JPA and MYSQL

1.- Crear nuestro proyecto con springboot initializer, 
agregando las dependencias:
* Spring Web
* JPA
* MySQL Driver

2.-Creamos nuestra division de carpetas en src
* Controllers
* Models
* Repositorys

3.-Creamos nuestros controllers usando la etiqueta
@RestController

4.-Establecemos los endpoints de nuestra API usando
las etiquetas:
* @GetMapping(value = "" )
* @PostMapping(value = "" )
* @DeleteMapping(value = "" )
* @PutMapping(value = "" ) / @PatchMapping(value = "" )

5.-Creamos las entidades de nuestro proyecto, esto lo
hacemos con JPA, usando las etiquetas que nos proporciona:
* @Entity
* @Id
* @Column
* etc