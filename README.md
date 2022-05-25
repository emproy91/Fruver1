# Fruver1

Fruver1 is a java project to represents a transaction to claim a government benefit in a fruits and vegetables store.

## Installation

This project was created in:

- Linux Lite 4.8 x86_64
- IntelliJ IDEA 2022.1.1
- jvm/openjdk-18.0.1.1

To solve JVM error in IntelliJ (on Linux), please read this [post](https://ipecas.co/tutoriales/error-cannot-resolve-symbol-string-system-java-intellij-idea-en-linux-lite-ubuntu/).

## Usage

Make sure you have openjdk-18.0.1.1 installed.

Open the project with IDEA 2022.1.1.

Build the project with Ctrl+F9.

Run the project from the main class with Shift+F10.

In the Run tab you will find a console dialog, follow the instructions to get your benefit.

Type your answers when required. (watch the example below, without quotes.)

```bash
Welcome to Fruver Colombia
We have a link to the Muisca system accounts
for this we will need some information below.
Type your name please and press Enter key:
'Ramon'
Type your identification number no dots or spaces please and press Enter key:
'111587695'
Type TRUE if your account is activated
or
Type FALSE if your account is deactivated
and press Enter key:
'TRUE'
```
```
Based on your height and age this is what you were assigned free for today
Fruit {name= 'Tomato', averageWeight= 0.6 Kg, colors = [green, red, yellow]}
Vegetable {name= 'Onion', averageWeight= 0.5 Kg, colors = [purple, white]}
Vegetable {name= 'Beans', averageWeight= 1.0 Kg, colors = [black, white, pink, red]}
|________Fruver Colombia_______|
|      Nit: 62442654-3         |
| Street 24 No 14 - 22 Alameda |
|Date Trade: 2022 5 25 15:21:20 |
|3 units free have been added |
| to your account 111587696    |
|Successful transaction, come |
| back soon, thank you for    |
|      preferring us. <3      |
_______________________________
Do you want to see your information in the system?
```
```bash
Press Y to view or N to finish and enter key:
'Y'
Identification number: 111587695
Name: Ramon
First last name: Giraldo
Second last name: Garcia
Birth date: Mon May 20 00:00:00 COT 2002
Height [m]: 1.7
Age: 20
__
Thank you for visit Fruver Colombia
__

```
To change other personal data, enter the Main class and locate the Person constructor on line # 71.

This project has 3 packages; main, models, and stakeholders.

In main package do you find Main class with the treatment of parameters, launchers from other classes methods.

In models package do you find father class Product and her classes daughters; Fruit and Vegetable.

The stakeholders package content: Person class, Trade class extended from BankAccount class.

More info in the comments of each class.


## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)