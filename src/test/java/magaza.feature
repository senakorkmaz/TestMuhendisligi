Feature: Odev Test
  Scenario: A harfindeki tum magzalari yaz
    Given web sitesine git
    And konumu kapat
    And firsat kampanya kapat
    And magzalar tikla
    And magzalari gor tikla
    And tum magzalar tikla
    And a harfini sec
    When tum a magzalarini al txt yazdir
    Then basarili mesajini yaz