# Refactor Project

## Описание

Этот проект реализует собственные версии классов `Arrays` и `Collections`, которые содержат методы `binarySearch`, аналогичные тем, что предоставляются в стандартной библиотеке Java. Проект выполнен в рамках учебного задания.

## Структура проекта

- `src/main/java`: содержит исходные файлы классов `Arrays` и `Collections`.
- `src/test/java`: содержит тесты для проверки корректности реализации методов `binarySearch`.

## Реализованные методы

### Класс `Arrays`

- `binarySearch` для массивов примитивных типов: `byte`, `char`, `double`, `float`, `int`, `long`, `short`.
- `binarySearch` для массивов обобщенных типов с использованием `Comparator`.

### Класс `Collections`

- `binarySearch` для списков, поддерживающий как естественный порядок (через `Comparable`), так и пользовательский порядок (через `Comparator`).

## Сборка и тестирование

Проект использует Maven для управления зависимостями и сборки. Чтобы собрать проект и запустить тесты, выполните следующие команды:


bash
mvn clean install
mvn test



## Требования

- Java 8 или выше
- Maven 3.6 или выше

## Установка

1. Клонируйте репозиторий:

   ```bash
   git clone https://github.com/Evgeniy2001Poluhin/Refactor.git
   ```

2. Перейдите в директорию проекта:

   ```bash
   cd Refactor
   ```

3. Соберите проект и запустите тесты:

   ```bash
   mvn clean install
   mvn test
   ```
