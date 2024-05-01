# Итоговая контрольная работа
## Информация о проекте
Необходимо организовать систему учета для питомника в котором живут домашние и вьючные животные.
## Как сдавать проект
Для сдачи проекта необходимо создать отдельный общедоступный репозиторий (Github, gitlub, или Bitbucket). Разработку вести в этом репозитории, использовать пул реквесты на изменения. Программа должна запускаться и работать, ошибок при выполнении программы быть не должно. Программа, может использоваться в различных системах, поэтому необходимо разработать класс в виде конструктора.
## Задание
1. Используя команду `cat` в терминале операционной системы **Linux**, создать два файла **Домашние животные** (заполнив файл собаками, кошками, хомяками) и **Вьючные животные** заполнив файл лошадьми, верблюдами и ослами), а затем объединить их. Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (**Друзья человека**).

![image](https://github.com/Cerebelum/Final-control-specialization/assets/68476536/2c0c2c59-531e-4b77-84e0-58910e7984fa)

2. Создать директорию, переместить файл туда.

![image](https://github.com/Cerebelum/Final-control-specialization/assets/68476536/682eeeaf-0b01-4d32-b1be-9d1bcd48e03d)

3. Подключить дополнительный репозиторий **MySQL**. Установить любой пакет из этого репозитория.

![image](https://github.com/Cerebelum/Final-control-specialization/assets/68476536/c6321275-7489-45a6-a2d4-d0b6c1848fbd)
*Дальше много строчек…*
*И конец установки*
![image](https://github.com/Cerebelum/Final-control-specialization/assets/68476536/0096125a-46a8-441c-ab2b-0279ff3d6d72)

4. Установить и удалить deb-пакет с помощью `dpkg`.

![image](https://github.com/Cerebelum/Final-control-specialization/assets/68476536/58901cae-181c-4be1-948c-653016f3ecca)
*При установке возникли проблемы с зависимостями.*
*Устранил их с помощью apt -f install*
![image](https://github.com/Cerebelum/Final-control-specialization/assets/68476536/b6eb291c-badb-4d8a-9938-577536aa7b5c)
*Удаление пакета*
![image](https://github.com/Cerebelum/Final-control-specialization/assets/68476536/3d1df7d5-5667-4e87-baef-99fcf6b2f9ae)

5. Выложить историю команд в терминале `ubuntu`.
6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние животные и вьючные животные, в составы которых в случае домашних животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные войдут: Лошади, верблюды и ослы).
![Диаграмма](https://github.com/Cerebelum/Final-control-specialization/assets/68476536/3165beaa-07df-4753-aa37-b4606b3d7a36)

7. В подключенном **MySQL** репозитории создать базу данных “**Друзья человека**”.
8. Создать таблицы с иерархией из диаграммы в БД.
9. Заполнить низкоуровневые таблицы именами (животных), командами которые они выполняют и датами рождения.

![image](https://github.com/Cerebelum/Final-control-specialization/assets/68476536/3a234232-1b22-4f92-84f4-f4b0c8ab2335)
![image](https://github.com/Cerebelum/Final-control-specialization/assets/68476536/bb7b5a3c-93db-4c58-9fd5-2ade3fe9a849)
![image](https://github.com/Cerebelum/Final-control-specialization/assets/68476536/5c41254b-70e1-4b94-b89d-e26eadfb245e)
![image](https://github.com/Cerebelum/Final-control-specialization/assets/68476536/6eb1f047-b70a-449d-9835-1d03f52ba1d4)
![image](https://github.com/Cerebelum/Final-control-specialization/assets/68476536/683b294c-283f-44b0-a623-c33cc4898484)
![image](https://github.com/Cerebelum/Final-control-specialization/assets/68476536/b519420c-8af5-4dbc-9cbf-9f1cf7fc6ca8)

10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.

![image](https://github.com/Cerebelum/Final-control-specialization/assets/68476536/0c0aac76-3910-4293-a0b8-913230ca8f58)
![image](https://github.com/Cerebelum/Final-control-specialization/assets/68476536/9998badc-ae0e-4666-9800-35f7cd55dbee)
*В таблице pack_animals и так остались только лошади и ослы).*
*Но выглядеть будет примерно так:*
![image](https://github.com/Cerebelum/Final-control-specialization/assets/68476536/343ba309-cde0-49c6-8dea-c8a15f0bc4fb)
![image](https://github.com/Cerebelum/Final-control-specialization/assets/68476536/70ef8ee8-cf11-469b-a62f-96bc3f9ca85f)

11. Создать новую таблицу “**молодые животные**” в которую попадут все животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью до месяца подсчитать возраст животных в новой таблице.

![image](https://github.com/Cerebelum/Final-control-specialization/assets/68476536/2a52cf19-381d-46bd-8881-2d35f874e4c3)
*Надо было даты другие брать ))*
![image](https://github.com/Cerebelum/Final-control-specialization/assets/68476536/71ea5454-3255-4448-8011-c50b3f7722eb)

12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам.

![image](https://github.com/Cerebelum/Final-control-specialization/assets/68476536/fdcd0fc1-114a-47f6-a2eb-7a108ef2eec4)

13. Создать класс с Инкапсуляцией методов и наследованием по диаграмме.
14. Написать программу, имитирующую работу реестра домашних животных. В программе должен быть реализован следующий функционал:
    1. Завести новое животное
    2. определять животное в правильный класс
    3. увидеть список команд, которое выполняет животное
    4. обучить животное новым командам
    5. Реализовать навигацию по меню
15. Создайте класс Счетчик, у которого есть метод `add()`, увеличивающий значение внутренней `int` переменной на 1 при нажатие “Завести новое животное” Сделайте так, чтобы с объектом такого типа можно было работать в блоке `try-with-resources`. Нужно бросить исключение, если работа с объектом типа счетчик была не в ресурсном `try` и/или ресурс остался открыт. Значение считать в ресурсе `try`, если при заведения животного заполнены все поля.

Реализовано в проекте [HumansFriends](https://github.com/Cerebelum/Final-control-specialization/tree/main/HumanFriends/src).
