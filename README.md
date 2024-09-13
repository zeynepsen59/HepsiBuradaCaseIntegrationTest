# HepsiBuradaCaseIntegrationTest

* Rest Assured ve JUnit kullanılarak yazılmıştır.

## Hepsiburada Task İsterleri  </br>
* JSON API isteğinin sonucunun(http status) kontrolünü gerçekleştiren bir entegrasyon testi yazınız.
* Örnek url: http://generator.swagger.io
* Tarafınızdan seçilecek birer tane GET ve POST endpointleri için Http status code 200 verirse başarılı,
değilse başarısız olarak rapor edilmelidir.

## GetRequest
* Base URL: https://generator.swagger.io olarak ayarlandı.
* GET İsteği: GET /api/gen/servers endpointine istek gönderildi.
* Header’lar: İlgili header bilgileri eklendi. (Örneğin access-control-allow-headers, content-type).
* HTTP Durum Kodu Kontrolü: Eğer durum kodu 200 ise test başarılı olarak kabul edildi. Aksi durumda hata mesajı veriyor.
* JUnit Kullanımı: Test sonucunda durumu kontrol etmek için JUnit’in Assert.assertEquals() metodukullanıldı.
*  * Testi Çalıştırma:
  JUnit test framework’ü kullanarak çalıştırıldı. Eger GET isteği başarılı olursa ve durum kodu 200 dönerse “GET Request Successful” mesajı konsolda görünecek şekilde ayarlandı.

## PostRequest

* URL: https://generator.swagger.io olarak ayarlandı.
* POST İsteği: POST /api/gen/clients/ada endpointine verilen JSON body ile istek gönderildi. Parametreleri string olarak example ile gönderildi.
* Header’lar: accept: application/json ve Content-Type: application/json header bilgileri eklendi.
* HTTP Durum Kodu Kontrolü: Eğer durum kodu 200 ise test başarılı olarak kabul edildi. Aksi durumda, yanıtın body kısmındaki hata mesajı detaylı şekilde konsola yazdırıldı. 
* JUnit Kullanımı: Test sonucunda durumu kontrol etmek için JUnit’in Assert.assertEquals() metodu kullanıldı.
*  * Testi Çalıştırma:
 JUnit test framework’ü kullanarak çalıştırıldı. Eğer POST isteği başarılı olursa “POST Request Successful” mesajı konsolda görünecektir. Eğer başarısız olursa, durum kodu ve hata mesajı detaylı bir şekilde konsolda yazdırılacaktır.
