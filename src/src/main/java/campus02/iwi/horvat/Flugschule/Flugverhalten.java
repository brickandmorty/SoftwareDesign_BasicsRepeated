package campus02.iwi.horvat.Flugschule;

public interface Flugverhalten {
    void fliegen();
}

// hier setzen wir einfach nur die void als Maske

/*
Erklärung: welches Verhalten während der Laufzeit ausgeführt wird, wird dann
explizit entschieden -> via Upcasting oder Downcasting

Wichtigstes Design Prinzip einer Applikation:

Ich muss jenes Verhalten auslagern, welches sich oft ändert.
Und strikt von jenem trennen, welches sich selten ändert bzw. idR gleich bleibt.

Wir programmieren gegen einen Super-Typ, und welches Objekt konkret ausgeführt wird, wird während der Laufzeit entschieden.

Abstrakter Code kann natürlich zu Verständnisproblemen führen, vor allem wenn der Entwickler nicht
alle Klassen gut kennt. Aber trotzdem ist der Vorteil der Flexibilität unglaublich wichtig.

Strategy Pattern -> Strategie hier, dass wir ein konkretes Flugverhalten haben
Und wir können durch die Interface-Implementierung das "Flugverhalten" zur Laufzeit ändern.
Wir haben hier eine lose Kopplung / also HAS A


Je größer ein Projekt oder eine App ist, desto wichtiger sind klare Strukturierung und Auslagerungen von Funktionalitäten
in eigene Klassen.




 */
