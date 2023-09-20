/*
1) Напишите класс-конструктор у которого принимает минимум 3 строки,
содержащие три поля id игрушки, текстовое название и частоту выпадения
игрушки
2) Из принятой строки id и частоты выпадения(веса) заполнить минимум три
массива.
3) Используя API коллекцию: java.util.PriorityQueue добавить элементы в
коллекцию
4) Организовать общую очередь 5) Вызвать Get 10 раз и записать результат в
файл
 */

public class Main {
    public static void main(String args[]){

        ToyRandom toyRandom = new ToyRandom();
        toyRandom.put(new Toy(1, "Конструктор", 10));
        toyRandom.put(new Toy(2, "Машинка", 20));
        toyRandom.put(new Toy(3, "Кукла", 60));

        for(int i=0; i<100; i++){
            System.out.println(toyRandom.get().getName()); 
        }
    }
}