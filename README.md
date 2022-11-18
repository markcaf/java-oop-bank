# Java Bank

#### Repo
java-oop-bank

#### Package
jana60.bank

#### Features
Creata la classe `Conto`, caratterizzata come segue:

##### Conto
Variabili d'ambiente:
- numero conto - int
- nome proprietario - String
- saldo - int

Generati *costruttore*, *proprieta'* (getter/setter) e *toString()*.
Definiti i *modificatori di visibilita'*.

Definita inoltre la classe seguendo le seguenti logiche:
- durante la fase di istanza il *saldo del conto* è impostato a 0
- *codice del conto* e il *saldo* sono accessibili solo in lettura (omesse le opportune proprieta')
- *nome proprietario* accessibile sia in lettura che in scrittura

Definiti inoltre i seguenti metodi:
- *addMoney* utile per versare denaro sul conto
- *getMoney* utile a prelevare denaro
- *getSaldo* ritorna il saldo utile

**DANGER**: il saldo **NON** è mai negativo

##### Main
Nella classe `Main` definite alcune variabili di tipo `Conto` per testare la correttezza del codice.
