# Posts

Prosty serwer do RESTowej manipulacji komentarzami. Komentarze to po prostu
posty użytkowników pod jakimś tematem, nadrzędnym postem (a'la Reddit).
Dla uproszczenia nie bawimy się w uwierzytelnianie uzytkowników czy
hierarchię postów i zakładamy jeden wielki temat :D

Komentarz powinien zawierać identyfikator, autora, kontent.

Przykład jako JSON:
{
    "id":"1",
    "author":"janusz",
    "content":"Dobrze mówisz @wojtek23, stawiam browara"
}

Powinno być możliwe dodawanie i usuwanie postów, edytowanie pojedynczych
postów, oraz pobieranie ich (zarówno pojedynczych, po identyfikatorze,
jak i wszystkich naraz w liście).

Posty powinny być trzymane w MySQL.
