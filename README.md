## «Структурные шаблоны. Proxy, Decorator, Adapter»
### Задача №2. “Двоичный фасад”

В этом задании продемонстрирована работа с шаблоном Facade (Фасад).
Java даёт нам много возможностей для вычислений, в том числе для парсинга чисел из произвольных систем счисления и обратно, произведения математических операций и так далее. Класс ```BinOps``` представляет простой класс-фасад к набору стандартных классов java, который будет уметь всего две вещи: складывать и перемножать числа в двоичной системе счисления.

В итоге пользователь сможет выполнять эти две операции всего лишь через один вызов метода класса ```BinOps```, а не через самостоятельный вызов комбинации стандартных для java методов. Работоспособность продемонстрирована в классе ```Main```.