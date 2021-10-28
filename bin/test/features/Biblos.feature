Feature: Test de biblos

@Smoke
Scenario: Logueo en intranet
    Given Estoy en la intranet
    When  Ingreso usuario
    And   Ingreso contraseña
    Then  Logueo a intranet


Scenario: Realizar busqueda e ingresar a pagina
    Given Ingreso url 
    When  Hago click en ir
    And   Hago una busqueda
    Then  Accedo al primer resultado
    And   Valido que este un elemento


Scenario: Ingresar a iconos
    Given Ingreso a ayuda 
    And   Ingreso a info util 
    And   Ingreso a espacios, a un host, pagina 
    And   Solicito modificacion de pagina
    Then  Solicito creacion de pagina

Scenario: Ingresar a noticias
    Given Estoy en el buscador
    When  Accedo a las noticias
    Then  Valido que este un elemento