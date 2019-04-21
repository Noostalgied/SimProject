Els membres del grup som Adrià Soler y Enric Crespo.

Hem creat y assignat una serie d'atributs com categoria o estat, a la operació consistent a registrar un bug.
Ho hem realitzat seguint una serie de pasos, desde Donar d'alta un Bug fins a altres funcions com buscar o eliminar per atributs.
hem analitzat, dissenyat y desenvolupat doncs el servei web ReST pertinent creant dos clases, la classe Bug amb els seus atributs y referéncies, I la classe repository per a diverses funcions.
Finalment hem pujat el projecte al GitHub.
 
##Configurar

Conectarse a Mysql
Crear BD CREATE DATABASE aos
Crear usuario gimbernatsim
Configurar/Revisar fichero src/main/resources/application.properties:
spring.jpa.hibernate.ddl-auto=create

spring.datasource.url=jdbc:mysql://localhost:3306/aos

spring.datasource.username=gimbernatsim

spring.datasource.password=gimbernat

####Nota: Recordar Cambiar spring.jpa.hibernate.ddl-auto=create por
spring.jpa.hibernate.ddl-auto=update luego de la primera ejecución cuando ser verifique que la tabla está creada. Sino, Spring volverá a crear la tabla y se penderan los datos.

##Como Iniciar Run Aplication

##Operaciones disponibles

-Alta de un bug: Operación POST /videojoc Parámetros de entrada (Json) String videojoc; String usuari; Date dataDelBug; String plataforma; String paisDeConnexio; String email; String descripcioBreu; String descripcio; String categoria; String prioritat; String estat;
Salida: (Json) Json http://localhost:808/bug/{videojoc bug} Ejemplo:
curl -i -X POST -H "Content-Type:application/json" -d '{"videojoc": "RocketLeague", "usuari": "Marcela","dataDelBug":"20/1/2018","plataforma":"PS4", "paisDeConnexio":"España", "email":"marceloa@gmail.com", "descripcioBreu":"error gir", "descripcio":"Al girar no detecta el joystick","categoria":"greu","prioritat":"Alta","estat":"no processat"}' http://localhost:8080/bug 
curl -i -X POST -H "Content-Type:application/json" -d '{"videojoc": "Hearthstone", "usuari": "Marcela","dataDelBug":"20/1/2018","plataforma":"PC", "paisDeConnexio":"España", "email":"marceloa@gmail.com", "descripcioBreu":"fallo d'animació", "descripcio":"la carta no fa be l'animació","categoria":"lleu","prioritat":"Mitjana","estat":"confirmat"}' http://localhost:8080/bug 
curl -i -X POST -H "Content-Type:application/json" -d '{"videojoc": "nba2k19", "usuari": "Marcela","dataDelBug":"20/1/2018","plataforma":"PS4", "paisDeConnexio":"España", "email":"marceloa@gmail.com", "descripcioBreu":"tir impossible", "descripcio":"es pot tirar desde fora del camp","categoria":"lleu","prioritat":"Baixa","estat":"no validat"}' http://localhost:8080/bug

-Modificar un bug: Operación PUT /usuari Parámetros de entrada (Json) String videojoc; String usuari; Date dataDelBug; String plataforma; String paisDeConnexio; String email; String descripcioBreu; String descripcio; String categoria; String prioritat; String estat; Salida: (Json) http://localhost:808/bug/{videojoc bug} 
Ejemplo: curl -i -X POST -H "Content-Type:application/json" -d '{"videojoc": "Hearthstone", "usuari": "Marcela","dataDelBug":"20/1/2018","plataforma":"PC", "paisDeConnexio":"España", "email":"marceloa@gmail.com", "descripcioBreu":"fallo d'animació", "descripcio":"la carta no fa be l'animació","categoria":"lleu","prioritat":"Mitjana","estat":"confirmat"}' http://localhost:8080/bug/Hearthstone

-Obtener todos los bugs: Operación GET /videojoc Parámetros de entrada: NONE Salida: (Json) Lista de {} Ejemplo: curl -i -X GET http://localhost:8080/bug

-Obtener los datos de un bug: Operación GET /bug/{videojoc bug} Parámetros de entrada: NONE Salida: (Json) http://localhost:808/usuari/{videojoc bug} Ejemplo: curl -i -X GET http://localhost:8080/bug/Hearthstone

- Modificar un atributo de un bug: Operación PATCH /usuari Parámetros de entrada (Json) String videojoc; String usuari; Date dataDelBug; String plataforma; String paisDeConnexio; String email; String descripcioBreu; String descripcio; String categoria; String prioritat; String estat; Salida: (Json) http://localhost:808/usuari/{videojoc bug} Ejemplo: curl -i -X PATCH -H "Content-Type:application/json" -d '{"videojoc":"Hearthstone" }' http://localhost:8080/bug/Hearthstone

- Buscar functiones disponibles: Operación GET /bug/search Parámetros de entrada: NONE Salida: Lista de funciones disponibles Ejemplo: curl -i -X GET http://localhost:8080/bug/search

- Encontrar por usuario: Operación GET /search/findByUsuari Parámtros de Entrada String usuari Salida: (Json) Json http://localhost:808/bug/{videojoc bug} Ejemplo: curl -i -X GET http://localhost:8080/bug/search/findByUsuari?usuari=Marcela

- Eliminar por usuario: GET /search/deleteByEmail Parámetros de Entrada String usuari Salida:
Ejemplo: curl -i -X GET http://localhost:8080/bug/search/deleteByUsuari?usuari=Marcela

- Eliminar por juegp: Operación DELETE /bug/{videojoc bug} Parametros de Entrada NONE Salida:
Ejemplo: curl -i -X DELETE http://localhost:8080/bug/Hearthstone


