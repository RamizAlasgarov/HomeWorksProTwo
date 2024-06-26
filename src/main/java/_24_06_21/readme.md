### Техническое задание

#### Описание проекта
Создание консольного приложения на языке Java для управления списком контактов. Контакты будут храниться в текстовом файле.

#### Функциональные требования
1. **Создание контакта**
   - Ввод данных контакта: имя, фамилия, телефон, e-mail.
   - Сохранение данных контакта в текстовый файл.
   - Общий, объём бд - не менее 1000 записей

2. **Чтение списка контактов**
   - Чтение всех контактов из текстового файла.
   - Отображение списка контактов в консоли.

3. **Редактирование контакта**
   - Возможность редактирования существующего контакта.
   - Обновление данных контакта в текстовом файле.

4. **Удаление контакта**
   - Удаление контакта из текстового файла.

#### Нефункциональные требования
1. Приложение должно быть написано на языке Java.
2. Данные контактов должны храниться в текстовом файле.
3. Приложение должно использовать OOP (Объектно-Ориентированное Программирование) принципы.
4. Приложение должно быть структурировано и разделено на логические модули.

#### Архитектура приложения
1. **Модель (Model)**
   - Класс `Contact` для хранения информации о контакте (имя, фамилия, телефон, e-mail).

2. **Работа с консолью (View)**
   - Класс `ConsoleView` для взаимодействия с пользователем:
     - Ввод данных контакта.
     - Отображение списка контактов.
     - Обновление и удаление контактов.

3. **Работа с файлом (Repository)**
   - Класс `FileRepository` для работы с текстовым файлом:
     - Чтение данных из файла.
     - Запись данных в файл.
     - Обновление и удаление данных в файле.

4. **Сервис (Service)**
   - Класс `ContactService` для обработки бизнес-логики:
     - Добавление, редактирование, удаление контактов.
     - Взаимодействие с репозиторием.

5. **Интерфейсы (Interfaces)**
   - Интерфейс `IRepository` для абстракции взаимодействия с хранилищем данных.
   - Интерфейс `IView` для абстракции взаимодействия с пользователем.

6. **Внедрение зависимостей (Dependency Injection)**
   - Использование внедрения зависимостей для взаимодействия между компонентами.
