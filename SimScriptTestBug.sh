    
#Test alta de bugs
curl -i -X POST -H "Content-Type:application/json" -d '{"videojoc": "RocketLeague", "usuari": "Marcela","dataDelBug":"20/1/2018","plataforma":"PS4", "paisDeConnexio":"España", "email":"marceloa@gmail.com", "descripcioBreu":"error gir", "descripcio":"Al girar no detecta el joystick","categoria":"greu","prioritat":"Alta","estat":"no processat"}' http://localhost:8080/bug
curl -i -X POST -H "Content-Type:application/json" -d '{"videojoc": "Heartstone", "usuari": "Marcela","dataDelBug":"20/1/2018","plataforma":"PC", "paisDeConnexio":"España", "email":"marceloa@gmail.com", "descripcioBreu":"fallo d'animació", "descripcio":"la carta no fa bé la animació","categoria":"lleu","prioritat":"mitja","estat":"confirmat"}' http://localhost:8080/bug
curl -i -X POST -H "Content-Type:application/json" -d '{"videojoc": "nba2k19", "usuari": "Marcela","dataDelBug":"20/1/2018","plataforma":"PC", "paisDeConnexio":"España", "email":"marceloa@gmail.com", "descripcioBreu":"tir impossible", "descripcio":"es pot tirar desde fora del camp","categoria":"lleu","prioritat":"baixa","estat":"no validat"}' http://localhost:8080/bug
#Test modificación
curl -i -X POST -H "Content-Type:application/json" -d '{"videojoc": "RocketLeague", "usuari": "Marcela","dataDelBug":"20/1/2018","plataforma":"PS4", "paisDeConnexio":"España", "email":"marceloa@gmail.com", "descripcioBreu":"error gir", "descripcio":"Al girar no detecta el joystick","categoria":"greu","prioritat":"Alta","estat":"no processat"}' http://localhost:8080/bug/RocketLeague
#Test Obtener todos los datos
curl -i -X GET http://localhost:8080/bug
#Test Obtener los datos de 1 bug
curl -i -X GET http://localhost:8080/bug/RocketLeague
#Test modificar un atributo
curl -i -X PATCH -H "Content-Type:application/json" -d '{"videojoc":"RocketLeague" }' http://localhost:8080/bug/RocketLeague
#Test Lista de funciones disponibles 
curl -i -X GET http://localhost:8080/bug/search
#Test Buscar por usuario
curl -i -X GET  http://localhost:8080/bug/search/findByUsuari?usuari=Marcela
#Test Borrar por usuario
curl -i -X GET  http://localhost:8080/bug/search/deleteByUsuari?usuari=Marcela
#Test Borrar por videojuego
curl -i -X DELETE  http://localhost:8080/bug/RocketLeague
