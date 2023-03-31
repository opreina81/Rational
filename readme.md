
# Запуск
Необходимо склонировать репозиторий https://github.com/opreina81/Rational.git в свою IDE.
Например, при работе в IntelliJ IDEA, Вы можете клонировать удаленный репозиторий с экрана приветствия,
который открывается сразу после запуска IntelliJ IDEA.
Нажмите Get from VCS в правом верхнем углу.
В открывшемся диалоговом окне Get from Version Control выберите Git из списка.
Укажите URL-адрес удаленного репозитория https://github.com/opreina81/Rational.git
В поле Каталог введите путь к папке, в которой будет создан ваш локальный репозиторий.
Щелкните Клонировать .

Клонировать репозиторий можно из главного меню:
В главном меню выберите Git | Клон .
В открывшемся диалоговом окне Get from Version Control выберите Git из списка.
Укажите URL-адрес удаленного репозитория https://github.com/opreina81/Rational.git
В поле Каталог введите путь к папке, в которой будет создан ваш локальный репозиторий.
Щелкните Клонировать .

Когда процесс клонирования завершится, IntelliJ IDEA откроет проект.

# Rational
Класс для работы с рациональными числами, т.е. числами, которые можно представить в виде обыкновенной дроби, в которой числитель и знаменатель — целые числа. Примеры чисел: `1/2`, `3/4`, `-5/2`.

Класс позволяет создавать объекты обыкновенных дробей с заданными числителем и знаменателем или же со значением по умолчанию (`0`/`1`).

При попытке создания дроби с нулевым знаменателем генерируется исключение `ArithmeticException("division by zero !")`.

Если дробь отрицательна, минус стоит перед числителем.

При создании дроби она сокращается, если такая возможность есть. Например, дробь `5/10` сократится до `1/2`.

Также класс предоставляет возможность проводить с обыкновенными дробями

- элементарные операции: сложение, вычитание, умножение, деление.

- сравнения: на равно, на меньше, на меньше или равно.

При попытке деления на ноль генерируется исключение `ArithmeticException("division by zero !")`.


# Tests
Класс с тестами на класс `Rational`, которые покрывают создание чисел и операции с ними.

@BeforeClass, @AfterClass – аннотации, которые позволяют выполнять логику перед и после выполнением всех тестов в данном классе. Так как в данном случае в этом нет необходимости, их не указываем.

@Before - выполняется перед запуском метода с аннотацией @Test. Используется для инициализации данных для последующего теста.

@After - выполняется после завершения работы каждого теста. Подчищаем за собой.

@Test - сам тест.


Тесты на создание чисел

Тест (void testStandardConstructor()), проверяет значения числителя и знаменателя стандартного экземпляра класса. Проверка создания дроби со значением по умолчанию (`0`/`1`)

Тест (void simplifyMinusesTest()), проверяет значения числителя и знаменателя экземпляра класса в случае, что если дробь отрицательна, то минус будет стоять перед числителем.

Тест (void minusToPlusTest()), проверяет значения числителя и знаменателя экземпляра класса, если они заданы целыми отрицательными числами. Проверка, что итоговая дробь будет положительной.

Тест (void reduceTest()), проверяет значения числителя и знаменателя экземпляра класса в случае, если при создании дроби она сокращается, при наличии такой возможности. Проверка, что итоговая дробь будет сокращена правильно.

Тест (void zeroDenominatorTest()), проверяет значения числителя и знаменателя экземпляра класса при попытке создания дроби с нулевым знаменателем. Проверяем, что генерируется исключение `ArithmeticException("division by zero !")`.


Тесты на операции с рациональными числами

Тест (void plusTest_1()), проверяет, что при сложении положительных рациональных чисел, получаем положительное число.

Тест (void plusTest_2()), проверяет, что при сложении отрицательных рациональных чисел, получаем отрицательное число.

Тест (void plusTest_3()), проверяет, что при сложении отрицательного и положительного рациональных чисел, когда по модулю больше положительное число, получаем положительное число.

Тест, который проверяет, что при сложении отрицательного и положительного рациональных чисел, 
когда по модулю больше отрицательно число, с получением в результате отрицательного числа 
- не рассамтриваем, так как он будет аналогичен тесту (void minusTest_2()).

Тест (void plusTest_4()), проверяет, что при сложении нулей, получаем ноль.

Тест (void plusTest_5()), проверяет, что при сложении нуля и положительного рационального числа, получаем положительное число.

Тест (void plusTest_6()), проверяет, что при сложении нуля и отрицательного рационального числа, получаем отрицательное число.

Тест (void multiplyTest_1()), проверяет, что при умножении положительных рациональных чисел, получаем положительное число.

Тест (void multiplyTest_2()), проверяет, что при умножении нулей, получаем ноль.

Тест (void multiplyTest_3()), проверяет, что при умножении двух отрицательных рациональных чисел, получаем положительное число.

Тест (void multiplyTest_4()), проверяет, что при умножении отрицательного и положительного рациональных чисел, получаем отрицательное число.

Тест (void multiplyTest_5()), проверяет, что при умножении рационального числа на ноль, получаем ноль.

Тест (void minusTest_1()), проверяет, что при вычитании из большего положительного рационального числа меньшего положительного рационального числа, получаемположительное число.

Тест (void minusTest_2()), проверяет, что при вычитании из большего по модулю отрицательного рационального числа меньшего по модулю отрицательного рационального числа, получаем отрицательное число.

Тест, который проверяет, что при вычитании из отрицательного рационального числа положительного рационального числа, 
получаем отрицательное число - не рассматриваем, так как он получается аналогичен тесту (void plusTest_2()). 

Тест (void minusTest_3()), проверяет, что при вычитании из большего по модулю положительного рационального числа отрицательного рационального числа, получаем положительное число.

Тест (void minusTest_4()), проверяет, что при вычитании из ноля, получаем ноль.

Тест (void minusTest_5()), проверяет, что при вычитании из ноля положительного числа, получаем отрицательное число.

Тест (void minusTest_6()), проверяет, что при вычитании из ноля отрицательного числа, получаем положительное число.

Тест (void divideTest _1()), проверяет, что при делении положительных рациональных чисел, получаем положительное число.

Тест (void divideTest _2()), проверяет, что при делении отрицательных рациональных чисел, получаем положительное число.

Тест (void divideTest _3()), проверяет, что при делении положительного рационального числа на отрицательное рациональное число, получаем отрицательное число.

Тест (void divideTest _3()), проверяет, что при делении ноля на рациональное число, получаем ноль.

Тест (void divideTest _3()), проверяет, что при попытке деления на ноль, генерируется исключение `ArithmeticException("division by zero !")`.

Тест (void lessTest_1()), сравнивает два положительных рациональных числа.

Тест (void lessTest_2()), сравнивает положительное и отрицательное рациональные числа.

Тест (void lessTest_2()), сравнивает два отрицательных рациональных числа.

Тест (void lessOrEqualTest_1()), сравнивает два равных положительных рациональных числа.

Тест (void lessOrEqualTest_2()), сравнивает нули.

Тест (void lessOrEqualTest_3()), сравнивает два равных отрицательных рациональных числа.
