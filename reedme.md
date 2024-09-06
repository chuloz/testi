#Tehtävä 1: Array Test

a.What does the assertArrayEquals method do?
 - assertArrayEquals-metodia käytetään JUnit-testauksessa vertaamaan kahta taulukkoa. Se tarkistaa taulukon pituuden ja elementit varmistaakseen, että ne ovat samat.

b. What will happen if the arrays a1 and a2 are not equal in testSingleDimensionalArrayEquality?
- Jos a1 ja a2 eivät ole samat, testi epäonnistuu ja JUnit heittää AssertionError-virheen, joka ilmoittaa, että taulukot eivät ole yhteneviä. Virheviestinä näkyy myös metodille annettu viesti.

c. How does the assertArrayEquals method handle multi-dimensional arrays as seen in testMultiDimensionalArrayEquality?
- assertArrayEquals vertailee kaksiulotteisia taulukoita vaiheittain. Ensin se tarkistaa, ovatko ulommat taulukot yhtä pitkiä. Sitten se käy läpi sisemmät taulukot yksi kerrallaan ja vertaa niiden sisältöä samalla tavalla.