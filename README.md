CRUD

Registrar estudiantes con sus respectivos datos, asignandole a cada uno un Id y además guardando los datos.

CRUD creado en JAVA, utilizando el framework de Spring y sus dependencias, conectándolo a la base de datos MySQL

Utilización de diversos métodos:

Entidad:

Se crea la conexión con la base de datos "tbl_student" - Se indica cual es la llave primaria con @Id y @GeneratedValue, de tipo Long StudentId - Demás variables de tipo privado y especificando que el correo electrónico debe ser único (unique=true)
Repositorio:

Interfaz
Servicio:

Se llama el Repository con @Autowired (studentRepository)
getStudent = StudentRepository.findAll -> Busca los elementos y los retorna.
getStudent = StudentRepository.findById -> Recibe el Id y le envío la información que llega
saveOrUpdate = Guarda o actualiza la información del estudiante
eliminar = Eliminar através del id
Controlador: Se importa @RestController path = "api/v1/students" -> Ruta @Autowired -> Nos permite enlazar los servicios
