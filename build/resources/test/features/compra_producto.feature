Feature: busqueda de un producto y agregarlo al carrito

  Scenario: Buscar producto computador
    Given duban quiere ingresar al sitio web plazavea
    When duban busca el producto computador
    Then valida que el producto se agrego al carrito de compras