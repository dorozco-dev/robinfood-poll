# robinfood-poll

####Desarrollo de API prueba técnica RobinFood feedback restaurante
####Archivo sql se encuentra en la carpeta resource del proyecto

![alt text](https://github.com/dorozco-dev/robinfood-poll/blob/master/src/main/resources/MER.png?raw=true)

### `http://localhost:8080/swagger-ui.html#/poll-controller/findPollByIdUsingGET`
![alt text](https://github.com/dorozco-dev/robinfood-poll/blob/master/src/main/resources/SWAGGER.png?raw=true)

### `http://localhost:8080/poll/1`
```
{
    "id": 1,
    "name": "Encuesta satisfacción",
    "questionList": [
        {
            "id": 1,
            "question": "Recomendarias nuestra tienda a tus amigos y familiares",
            "questionType": "CLOSE",
            "optionsQuestion": [
                {
                    "id": 1,
                    "optionValue": "Si"
                },
                {
                    "id": 2,
                    "optionValue": "No"
                }
            ]
        },
        {
            "id": 2,
            "question": "Que fue lo que más te gusto",
            "questionType": "OPEN",
            "optionsQuestion": []
        },
        {
            "id": 3,
            "question": "Como calificas el servicio",
            "questionType": "CLOSE",
            "optionsQuestion": [
                {
                    "id": 3,
                    "optionValue": "Bueno"
                },
                {
                    "id": 4,
                    "optionValue": "Malo"
                },
                {
                    "id": 5,
                    "optionValue": "Regular"
                }
            ]
        }
    ]
}
```

### `http://localhost:8080/poll/2`
```
{
    "id": 2,
    "name": "Encuesta primer año",
    "questionList": [
        {
            "id": 1,
            "question": "Recomendarias nuestra tienda a tus amigos y familiares",
            "questionType": "CLOSE",
            "optionsQuestion": [
                {
                    "id": 1,
                    "optionValue": "Si"
                },
                {
                    "id": 2,
                    "optionValue": "No"
                }
            ]
        }
    ]
}
```