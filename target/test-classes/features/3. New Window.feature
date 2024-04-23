@Prueba3
Feature: TC-03 - Validar nueva pestaña

  Background: Hacer click en un botón y cambiar de pestaña

  Scenario: Validar que al hacer clic en un botón se abra una nueva pestaña con texto específico
    Given que el usuario ingresa al sitio web
    And hace click en la opcion Multiple Windows
    When El usuario hace clic en el botón Click here
    Then La nueva pestaña debería contener el texto "New Window"
