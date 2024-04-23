@Prueba
Feature: TC01 - Validar Inicio de Sesión

  Background: Validar el inicio de sesión con credenciales válidas e inválidas

    Scenario: 1. Ingresar correctamente al LogIn
      Given que el usuario ingresa al sitio web
      And hace click en la opcion Form Authentication
      When ingrese sus credenciales validas
      Then la aplicacion muestra un mensaje de ingreso exitoso

      Scenario: 2. Ingresar incorrectamente al LogIn
        Given que el usuario ingresa al sitio web
        And hace click en la opcion Form Authentication
        When ingrese sus credenciales invalidas
        Then la aplicacion muestra un mensaje de ingreso fallido
