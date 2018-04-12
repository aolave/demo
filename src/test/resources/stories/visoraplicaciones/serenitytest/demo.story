Meta:
Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Test para entrar un iframe
GivenStories: stories/visoraplicaciones/serenitytest/demohome.story
When entrar on iframe test
Then verficar iframe test

Scenario: Test para entrar a una tabla
GivenStories: stories/visoraplicaciones/serenitytest/demohome.story
When entrar on table test:
|EMPLOYEE_ID|FIRST_NAME|EMAIL|
|E101|Steven|steven.king@gmail.com|
Then verficar table test