package RIKKEI;

public class Student {
    private String name=  "john";
   String classes = "C02";

    public Student() {
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    private void setClasses(String classes) {
        this.classes = classes;
    }
}
