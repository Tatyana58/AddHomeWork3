public class Main {
    public static void main(String[] args) {
        System.out.println("Дополнительное задание Условные опереаторы");
        //skypro: Задача 6
        //и снова дела банковские, уже сложнее.
        //В нашем банке можно, кроме дебетовых, получать еще и кредитные карты. У таких карт есть допустимый лимит средств,
        //который рассчитывается исходя из возраста клиента и его зарплаты.
        //Правила расчета следующие:
        //Людям старше (или равно) 23 лет мы предоставляем лимит в размере 3 зарплат.
        //Людям младше 23 лет мы предоставляем лимит в размере 2 зарплат.
        //Если заработная плата клиента выше (или равно) 50 тысяч, мы увеличиваем лимит в 1.2 раза.
        //Если заработная плата выше (или равно) 80 тысяч, мы увеличиваем лимит в 1.5 раза.
        //Наша задача: написать программу, которая показывает, какую сумму на кредитке может получить клиент.
        //Вводные данные: переменная age = 19 для обозначения возраста клиента, salary = 58_000 для обозначения зарплаты клиента.
        //Увеличения не могут быть применены одновременно. Необходимо вывести максимальный лимит в консоль в формате:
        // «Мы готовы выдать вам кредитную карту с лимитом *** рублей».
        //Критерии оценки
        //• При изменении значения переменной age результат вывода в консоль изменяется согласно условиям задачи
        //• При изменении значения переменной salary результат вывода в консоль изменяется согласно условиям задачи
        //• Написанный код отрабатывает условия задачи и изменение значений переменных, выводит в консоль корректный результат
        //• Правила синтаксиса и пунктуации соблюдены.
        System.out.println("");
        int age = 19;
        int salary = 80_000;
        System.out.println("Ваш возраст " + age + " лет ");
        System.out.println("Ваша заработная плата " + salary + " рублей ");
        if (age >= 23) {
            if (salary >=80000) {
                salary *= 1.5;
            }else if (salary >= 50000 && salary < 80000){
                salary *= 1.2;
            }else salary *= 3;
        } else {if (salary >= 80000) {
            salary *= 1.5;
        }else if (salary >= 50000 && salary < 80000) {
            salary *= 1.2;
        }else salary *= 2;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей ");
    }
}
