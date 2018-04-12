Meta:
Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: crear una nueva solicitud PQRS
GivenStories: stories/visoraplicaciones/serenitytest/mainpage.story
When crear la solicitud PQRS:
|nombre|apellido|tipo|lugar|prioridad|correo|detalle|
|Cesar|Robledo|Queja|BELLO|Media|nairda_rasec123@hotmail.com|page factory model selenium|
Then revisar solitud PQRS fue creada

Scenario: conslultar una solicitud PQRS
GivenStories: stories/visoraplicaciones/serenitytest/mainpage.story
When consultar la solicitud PQRS:
|general|nombre|detalle|
|Media|Cesar|page factory model selenium|
Then verificar la consultar PQRS