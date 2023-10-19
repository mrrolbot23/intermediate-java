package PolymorphismUdemy;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
//        The .getClass().getSimpleName returns a string with the class name
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film.");
    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new SciFi(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n" .repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens"
                );
    }
}

class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n" .repeat(3),
                "Something funny happens",
                "Even Funnier",
                "Happy ending"
        );
    }
}


class SciFi extends Movie {
    public SciFi(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n" .repeat(3),
                "Bad Aliens do bad stuff",
                "Space guys chase aliens",
                "Planet blows up"
        );
    }
}