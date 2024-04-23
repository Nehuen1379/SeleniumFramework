@Prueba2
Feature: TC02 - Validar comboBox

  Background: Seleccionar una opcion del ComboBox y verificar que coincida con mi risultado esperado

    Scenario: 1. Elegir la primera opcion del comboBox
      Given que el usuario ingresa al sitio web
      And hace click en la opcion Dropdownlist
      When El usuario selecciona la opción "Option 1"
      Then La opción seleccionada en el comboBox debería ser "Option 1"