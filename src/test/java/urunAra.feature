Feature: Odev Test
  Scenario: urun bul sepete ekle
    Given web sitesine gir
    And kapat konum
    And kapat kampanya
    And kulaklik kelimesini ara
    And yorum sayisina gore sirala
    And ucretsiz kargo sirala
    And ilk urunu ekle
    And son urunu ekle
    And sepete git
    And ucuzu arttir
    When misafir kullanici odeme adimi
    Then basarili mesajini