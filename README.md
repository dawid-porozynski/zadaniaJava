# zadaniaJavaZadania laboratoryjne - powtórka z programowania strukturalnego + obsługa serwisu GitHub
Ilość punktów do zdobycia	Hard deadline
15	19.03.2023
Zadanie 1
Napisz program, który obliczy pole prostokąta o bokach a i b, wprowadzonych wcześniej przez użytkownika (każda wartość będzie znajdować się w osobnej linii).

WEJŚCIE: 2 2

WYJŚCIE: 4.0

Zadanie 2
Napisz program, który wyświetla na ekranie komputera pierwiastek kwadratowy z wartości liczby pi z dokładnością do dwóch miejsc po przecinku.

Zadanie 3
Napisz program, który pobierze od użytkownika dwa ciągi tekstowe (rozdzielone znakiem spacji) napis1 oraz napis2, a następnie wyświetli ciąg tekstowy w następującym formacie: "%napis2 napis1%".

WEJŚCIE: ala ma

WYJŚCIE: ma ala

Zadanie 4
Napisz program, który dla trzech boków a,b,c podanych wcześniej przez użytkownika stwierdzi czy da się z tych boków zbudować trójkąt. Trójkąt da się zbudować z boków a,b,c wtedy i tylko wtedy gdy zachodzą następujące warunki:

a + b > c
a + c > b
b + c > a
W przypadku wprowadzenia niepoprawnych danych program ma wyrzucić komunikat: BŁĄD.

WEJŚCIE: 1 2 3

WYJŚCIE: NIE

WEJŚCIE: 2 2 2

WYJŚCIE: TAK

WEJŚCIE: 1 -2 3

WYJŚCIE: BŁĄD

Zadanie 5
Napisz program, który dla podanej liczby z odpowiedniego zakresu wyświetli jaki to miesiąc i ile ma on dni. Zakładamy, że rok tutaj nie jest przestępny. W przypadku niepoprawnych danych program ma wypisać komunikat: BŁĄD. Użyj słowa kluczowego switch.

WEJŚCIE: 1

WYJŚCIE: Styczeń: 31 dni

Zadanie 6
Napisz program, który pobierze trzy liczby rzeczywiste, a następnie wyświetli je w kolejności od najmniejszej do największej, a potem od największej do najmniejszej. Nie używaj tutaj żadnych dostępnych metod sortujących.

WEJŚCIE: 1 2 3

WYJŚCIE:

1.000000 2.000000 3.000000

3.000000 2.000000 1.000000

Zadanie 7
Napisz program, który zadeklaruje dwie tablice typu int, następnie wczyta liczby naturalne n i m, wczyta do pierwszej tablicy n liczb, następnie wczyta m liczb do drugiej tablicy (wcześniej trzeba te tablice utworzyć), a następnie wykona iloczyn skalarny tych tablic zgodnie z wzorem:

[\sum_{i=1}^{n} A[i] \cdot B[i]]

Zastanów się, co w przypadku gdy n<m lub m<n.

W przypadku podania jakikolwiek błędnych danych program wypisuje komunikat BŁĄD, a następnie kończy działanie.

WEJŚCIE:

2 2

1 1

2 2

WYJŚCIE: 4

Zadanie 8
Napisz program, który dla liczby naturalnej n wypisze poniższe wzory (jeden pod drugim). W przypadku niepoprawnych danych program ma ponownie je wczytać. Zakładamy, że na końcu linii jest wyłącznie znak nowej linii.

WEJŚCIE: 3

WYJŚCIE:

**
***
***
**
*
***
**
 *
 *
**
***  
Zadanie 9
Napisz funkcje, a następnie program, który sprawdzi czy dane słowo jest palindromem.

Palindrom to słowo, które zapisane wspak jest takim samym słowem. Przykładem palindromu jest słowo: kajak.

Znaki wczytujemy do tablicy statycznej typu char (zakładamy dla prostoty, że tablica ta jest 100-elementowa, następnie wczytujemy znaki, aż do napotkania końca znaku pliku (można to wywołać przy pomocy kombinacji klawiszy ctrl+d).

Zakładamy, że wszystkie znaki są z małej litery (nie rozpatrujemy przypadku, że występują duże litery). Jako rezultat program ma wypisać komunikat TAK, jeśli jest to palindrom lub NIE w przeciwnym przypadku.

WEJŚCIE: kajak

WYJŚCIE: TAK

Zadanie 10
Napisz program, który będzie posiadał statycznie tablicę dwuwymiarową o wymiarach a×b.

Następnie program pobrze od użytkownika liczby a i b, które mają oznaczać liczbę wierszy oraz kolumn tablicy. Następnie pobierze a×b liczb i wypisze transpozycję tej macierzy (patrz poniższy test). Transpozycja oznacza, że wypisujemy najpierw kolumny, a potem wiersze danej macierzy.

W przypadku sytuacji błędnych program ma wypisać komunikat: BŁĄD i zakończyć działanie.

WEJŚCIE:

6 2
95 89
100 10 
77 19
94 59
2 91
11 90
WYJŚCIE:

95 100 77 94 2 11
89 10 19 59 91 90
Zadanie 11
Pangramem nazywamy tekst, w którym każda litera alfabetu łacińskiego występuje przy najmniej raz. Najpopularniejszym pangramem w języku angielskim jest zdanie: The quick brown fox jumps over the lazy dog. Napisz program, który sprawdzi czy dany tekst jest pangramem. W przypadku pozytywnej odpowiedzi program powinien wyświetlić wartość true, w przeciwnym przypadku program powinien wyrzucić wartość false. Rozważ różne przypadki i wielkości liter, które nie powinny mieć znaczenia!!!

WEJŚCIE:

The quick brown fox jumps over the lazy dog

WYJŚCIE: true

Zadanie 12
Jeżeli podamy wiek osoby w sekundach, to jest możliwe obliczenie ile ta osoba ta ma lat na ziemi. Kula ziemska przechodzi przez własną orbitę przez 365,25 dnia, które wynosi równo 31 557 600 sekund.

Jeżeli osoba ma 1000 000 000 sekund to łatwo można policzyć, że 1000 000 000/31 557 600 = 31,69 lat (w przybliżeniu do drugiego miejsca po przecinku). Teraz rozpatrzmy funkcję, która będzie przyjmowała:

wiek osoby w sekundach oraz
planetę, na której chcemy obliczyć wiek osoby.
i obliczała wiek osoby w latach danej planety.

Napisz program, który będzie zawierał tę funkcję uwzględniając poniższe dane dotyczące innych planet:

Obrót Merkurego podczas własnej orbity wynosi 0.2408467 lat ziemskich
Obrót Wenus podczas własnej orbity wynosi 0.61519726 lat ziemskich
Obrót Marsa podczas własnej orbity wynosi 1.8808158 lat ziemskich
Obrót Jowisza podczas własnej orbity wynosi 11.862615 lat ziemskich
Obrót Saturna podczas własnej orbity wynosi 29.447498 lat ziemskich
Obrót Uranu podczas własnej orbity wynosi 84.016846 lat ziemskich
Obrót Neptuna podczas własnej orbity wynosi 164.79132 lat ziemskich
WEJŚCIE:

1000000000

Ziemia

WYJŚCIE: 31.69

Zadanie 13
Napisz rekurencyjną funkcję, która dla danej tablicy jednowymiarowej wyznaczy element największy tej tablicy.

WEJŚCIE:

5

1 2 4 7 3

WYJŚCIE:

7

Zadanie 14
Liczby zaprzyjaźnione to para liczb naturalnych, takich że suma dzielników każdej z tych liczb nie większych niż ona sama (łącznie z jedynką) równa się drugiej z nich. ####Przykład

220 = 1 + 2 + 4 + 71 + 142 (dzielniki liczby 284)
284 = 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 (dzielniki liczby 220)
Napisz program, który dla pary liczb całkowitych wczytanych ze standardowego wejścia wyświetli TAK, jeśli są one liczbami zaprzyjaźnionymi oraz NIE w przeciwnym przypadku.

WEJŚCIE: 220 284

WYJŚCIE: TAK

WEJŚCIE: 150 27

WYJŚCIE: NIE

Zadanie 15
Napisz program, który sprawdzi, czy ciąg złożony ze znaków {}[]() jest poprawnym wyrażeniem nawiasowym. Zakładamy, że nawiasy nie mają priorytetów, tj. niekoniecznie nawiasy okrągłe muszą być „wewnątrz” nawiasów kwadratowych itp.

Przykładowe wejście i wyjścia programu, poniżej.

WEJŚCIE: [(])

WYJŚCIE: nie

WEJŚCIE: ([(){}])

WYJŚCIE: tak

WEJŚCIE: (()

WYJŚCIE: nie

WEJŚCIE: )()){}

WYJŚCIE: nie

WEJŚCIE: {[()[]]}()()([])

WYJŚCIE: tak
