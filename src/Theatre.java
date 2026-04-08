public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180.5);
        Actor actor2 = new Actor("Мария", "Петрова", Gender.FEMALE, 165.0);
        Actor actor3 = new Actor("Петр", "Сидоров", Gender.MALE, 175.0);

        Director director1 = new Director("Алексей", "Смирнов", Gender.MALE, 5);
        Director director2 = new Director("Елена", "Козлова", Gender.FEMALE, 3);
        Director director3 = new Director("Олег", "Новиков", Gender.MALE, 7);

        Show show = new Show("Ревизор", 120, director1);
        Opera opera = new Opera("Травиата", 180, director2, "Текст либретто оперы...", "Верди", 20);
        Ballet ballet = new Ballet("Лебединое озеро", 150, director3, "Текст либретто балета...", "Чайковский", "Петина");

        show.addActor(actor1);
        show.addActor(actor2);
        show.addActor(actor3);

        opera.addActor(actor1);
        opera.addActor(actor2);

        ballet.addActor(actor2);
        ballet.addActor(actor3);

        System.out.println("Актёры в спектакле 'Ревизор': ");
        show.printActors();

        System.out.println("Актёры в опере 'Травиата': ");
        opera.printActors();

        System.out.println("Актёры в балете 'Лебединое озеро': ");
        ballet.printActors();

        opera.replaceActor(actor3, "Петрова");
        System.out.println("Актёры в опере 'Травиата': ");
        opera.printActors();

        //Проверка на несуществующего актера
        ballet.replaceActor(actor1, "Смирнова");

        System.out.println("Либретто оперы:");
        opera.printLibretto();

        System.out.println("Либретто балета:");
        ballet.printLibretto();

        System.out.println("Режиссёр спектакля 'Ревизор': " + show.getDirector());
        System.out.println("Режиссёр оперы 'Травиата': " + opera.getDirector());
        System.out.println("Режиссёр балета 'Лебединое озеро': " + ballet.getDirector());
    }
}