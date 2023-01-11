public class LibMain {
    public static void main(String[] args) {
        Reader st1 = new Reader();
        Reader st2 = new Reader();

        st1.setName("Иван Сидоров");
        st1.setNumber(215);
        st1.setDate("14/10/1992");
        st1.setFacult("Программирование");
        st1.setPhone("+79999999999");
        System.out.println("Читатель " + st1.getName() + " с номером билета " + st1.getNumber() + " учащийся факультета " + st1.getFacult() + " добавлен");
        System.out.println("Дата рождения: " + st1.getDate() + "; номер телефона: " + st1.getPhone());

        st2.setName("Макар Иванов");
        st2.setNumber(216);
        st2.setDate("16/08/1995");
        st2.setFacult("Тестирование");
        st2.setPhone("+79998887766");
        System.out.println("Читатель " + st2.getName() + " с номером билета " + st2.getNumber() + " учащийся факультета " + st2.getFacult() + " добавлен");
        System.out.println("Дата рождения: " + st2.getDate() + "; номер телефона: " + st2.getPhone());

        st1.takeBook("Алгоритмы на Java");

        st1.returnBook("Кодеры за работой");

        st1.info();
        st2.info();
    }
}
