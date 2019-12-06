# SES TDD Exercise 1

Oefening voor https://brainbaking.com/teaching/ses/

## Technologie

Test harnas met JUnit 5. [JUnit documentatie](https://junit.org/junit5/docs/current/user-guide/).

## Opgave

De Artisanale Bakkers Associatie vertrouwt op uw technische bekwaamheid om hun probleem op te lossen. 
Er wordt veel Hasseltse [Speculaas](https://en.wikipedia.org/wiki/Speculaas) gebakken, maar niemand weet 
precies wat de **beste** Speculaas is. Schrijf een methode die _speculaas_ beoordeelt op basis van de ingrediënten. 
De methode, in de klasse `Speculaas`, zou er zo uit moeten zien:

```java
	public int beoordeel() {
		// TODO ...
	}
```

De functie geeft een nummer terug - hoe hoger dit nummer, hoe beter de beoordeling en 
hoe gelukkiger de bakker. Een speculaas kan de volgende ingrediënten bevatten: 
kruiden, boter, suiker, eieren, melk, honing, bloem, zout. 
Elke eigenschap is een nummer dat de hoeveelheid in gram uitdrukt:


```java
{
    boter: 250,
    bloem: 1000,
    zout: 10,
    melk: 100
};
```

#### Hoe weet ik welke Speculaas beter is?

Gebruik het KISS principe (Keep It Simple Stupid):
maak gewoon de som van alle ingrediënten.

Kijk naar een voorbeeld test hoe de methodes te hanteren.


### Unit testen

Er zijn al enkele testen voorzien. Die kan je uitvoeren met IntelliJ door op het groen pijltje te drukken, of met Gralde:

```
./gradlew.bat test
```

(Op Unix: `./gradlew test`)

Dit genereert een **test rapport** HTML bestand in de `build/test` map.

#### Wat moet ik zelf testen?

Denk aan de volgende zaken:

- Hoe zit het met een industriële speculaas, zonder kruiden of boter? 
- Wat doet de funcite beoordeel als het argument `null` is?
- Wat als een speculaas wordt meegegeven zonder ingrediënten?

We zijn dus geïnteresseerd in **edge cases**. Probeer alle mogelijkheden te controleren. 

Deze oefening legt de nadruk op de testen, niet de implementatie.
