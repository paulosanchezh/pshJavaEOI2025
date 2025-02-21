public class Dog {
    private String size;
    private String name;
    private int age;

    Dog(String size, String name, int age) {
        this.size = size;
        this.name = name;
        this.age = age;
    }

    public String getSize(){ return size; }
    public void setSize(String size){ this.size = size; }

    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }

    public int getAge(){ return age; }
    public void setAge(int age){ this.age = age; }
}
