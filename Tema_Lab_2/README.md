## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Cerinta proiect

Scrieti programul Java care indeplineste cerintele urmatoare:

- Declara o clasa Person cu atributele: name, age, address (compus din street,
number, city, country). Incapsulati corespunzator datele member.

- Declara o clasa Student care extinde clasa Person dar care nu poate fi extinsa la
randul ei si care adauga atributele urmatoare, incapsulate corespunzator:
    - studyYear

    - studyGroup

    - gradesPerDiscipline de tip array multidimensional cu urmatoarea codificare:

        - fiecare linie reprezinta notele obtinute la o anumita materie in anul
        curent

        - consideram ca intr-un an de studiu sunt 4 materii, numele lor nu
        conteaza

        - pentru a se putea incheia media, un student trebuie sa aiba minim 2
        note la fiecare materie si poate avea maxim 4 note la o materie

- In clasa Student implementati metodele:

    - getYearAverage() care intoarce media generala = media mediilor pentru
    fiecare materie

    - getSituation() care afiseaza la consola numele studentului, anul de studiu,
    grupa si media generala


- In clasa Main, folositi un array de obiecte pentru a tine lista studentilor dintr-o grupa
(pentru simplicitate puteti declara numai 5-10 studenti). Populati fiecare obiect de
tip Student cu campurile corespunzatoate, inclusive notele la cele 4 materii

- In metoda main() (sau alta metoda apelata din main()), afisati la consola primii 3
studenti in ordinea descrescatoare a mediilor lor generale
