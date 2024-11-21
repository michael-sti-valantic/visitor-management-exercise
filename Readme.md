# Feature: Visitor Time Slot Search Endpoint

## Aufgabe
- Wir möchten Endpunkte fuers Anlegen, Aendern und Loeschen von Termin für Besichtigungen haben
- Wir möchten einen Endpunkt für Besichtiungesterminen haben, in dem man nach
  verschiedenen Kriterien filtern kann
- Die Endpunkte sollen API-Endpunkte sein, welche JSON verarbeiten (keine UI / Template)

Besichtigungs-Modell:
  - date
  - start time
  - end time
  - kind (Single/Group)
  - participants
  - capacity

## Implementation Details
- Ausbaustufen:
  - Liste aller Termine
  - Einen Termin anhand der ID finden
  - Filterung der Termine nach Datum
  - Filterung der Termine nach Uhrzeit
  - Filterung der Terime nach Slot-Laenge
  - Validierung "start time before end time" beim Anlagen/Anpassen von einem Termin (bei invalidem Format oder Endzeit vor Startzeit → Bad Request)