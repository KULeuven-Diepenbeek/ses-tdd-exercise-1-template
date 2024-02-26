# SES TDD Exercise 1

Oefening voor https://github.com/KULeuven-Diepenbeek/ses-tdd-exercise-1-template

## Technologie

Test harnas met JUnit 5. [JUnit documentatie](https://junit.org/junit5/docs/current/user-guide/).

**LET OP**, JUnit 4 gebruiken we niet meer, en v5 heeft een andere API!

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
./gradlew test
```

Dit genereert een **test rapport** HTML bestand in de `build/test` map.

#### Wat moet ik zelf testen?

Denk aan de volgende zaken:

- Hoe zit het met een industriële speculaas, zonder kruiden of boter? 
- Wat doet de functie beoordeel als het argument `null` is?
- Wat als een speculaas wordt meegegeven zonder ingrediënten?

We zijn dus geïnteresseerd in **edge cases**. Probeer alle mogelijkheden te controleren. 

Deze oefening legt de nadruk op de testen, niet de implementatie.

# SES TDD Exercise 4

## Opgave

Dit is een vervolgopgave van de code van **Opgave 1**. Werk verder op dat bestaand project.

Een verkoopster werkt in een (goede) speculaasfabriek. De verkoopster wilt graag 2 EUR aanrekenen per speculaas die de fabriek produceert. 
Echter, als de klant meer dan 5 stuks verkoopt, mag er een korting van 10% worden aangerekend. In dit voorbeeld gaan we ervan uit dat een fabriek een willekeurig aantal speculaas per dag maakt en dat de klant steeds alle speculazen koopt. De verkoop gebeurt in de Verkoopsterklasse en het bakken van de speculazen gebeurt in de SpeculaasFabriek. Als we nu willen testen of onze `verkoop` methode uit de `Verkoopster`-klasse werkt, dan willen we dit **isolated** doen. We willen dus de onzekerheid van de Fabriek weghalen door specifieke gevallen aan te halen. Dit kan echter niet via de standaard `SpeculaasFabriek`. Daarom gaan we een **test double** gebruiken. Hiervoor gaan we deze keer een **mock** gebruiken zoals verder duidelijk wordt.

```java
	public double verkoop() {
        var gebakken = speculaasFabriek.bak();
		// TODO ...
	}
```

Je ziet aan bovenstaande code dat de speculaasfabriek instantie wordt gebruikt. We hebben dus eigenlijk **geen controle** op de hoeveelheid speculaas die deze fabriek produceert.

### Unit testen

Hoe kunnen we dan toch nog testen wat we willen testen? Mogelijke scenario's:

1. De fabriek produceert niets. De klant betaalt niets.
2. De fabriek produceert minder dan 5 speculaasjes. De klant betaalt per stuk, 2 EUR.
3. De fabriek produceert meer dan 5 stuks. De klant krijgt 10% korting op zijn totaal.

### Hoe controleer ik het gedrag van de fabriek?

Mockito is verreweg het meest populaire Unit Test Framework dat bovenop JUnit wordt gebruikt om heel snel Test Doubles en integratietesten op te bouwen. 

Gebruik dus hiervoor Mockito, en injecteer een `mock(SpeculaasFabriek.class)` in de verkoopster (de setter is reeds voorzien). 

Lees op [https://site.mockito.org](https://site.mockito.org) **hoe** je het framework moet gebruiken. (Volledige [javadoc](https://javadoc.io/doc/org.mockito/mockito-core/latest/org/mockito/Mockito.html)) Denk aan de volgende zaken:

- Hoe include ik Mockito als een dependency in mijn project?
- Hoe gebruik ik de API om een Test Double/mock aan te maken?
- Hoe valideer ik verwachtingen die ik heb van deze Test Double?
