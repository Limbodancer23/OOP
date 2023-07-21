## Здравствуйте!
 1) Был нарушен первый принцип - "Single responsibility principle". 
 2) Убрал методы save и report из класса User оставив только поля и конструктор
 3) Перенес метот save в класс Persister, который будет ответсвенный за один вид поведения
 также создал класс Reporter с соответсвующим классом
 4) Создал класс Operation, который будет предком Persister и Reporter. Liskov`s Substitution principle.
 5) Методы save и report сделал защищенными от модификаций "protected". OPEN/CLOSED principle.
6) В телефонном справочнике Сканнер из UserView можно переместить в отдельный класс