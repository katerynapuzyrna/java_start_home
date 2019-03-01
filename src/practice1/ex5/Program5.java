package practice1.ex5;

public class Program5 {
    public static void main(String[] args) {

        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;

        int left = 0; // задаем левую и правую границы поиска
        int right = data.length-1;
        int search = -1; // найденный индекс элемента равен -1 (элемент не найден)
        while (left <= right) // пока левая граница не "перескочит" правую
        {
            int mid = (left + right) / 2; // ищем середину отрезка
            if (numberToFind == data[mid]) {  // если ключевое поле равно искомому
                search = mid;     // мы нашли требуемый элемент,
                break;            // выходим из цикла
            }
            if (numberToFind < data[mid])     // если искомое ключевое поле меньше найденной середины
                right = mid - 1;  // смещаем правую границу, продолжим поиск в левой части
            else                  // иначе
                left = mid + 1;   // смещаем левую границу, продолжим поиск в правой части
        }
        System.out.println(search);
    }
}
