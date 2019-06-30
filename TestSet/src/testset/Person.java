package testset;

public class Person implements Comparable<Person>{
    private String name;
    private int number;

    public Person() {
    }

    public Person(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //重写equals方法
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if(obj instanceof Person){
            Person anotherPerson = (Person) obj;
            if (this.name.equals(anotherPerson.name)){
                return true;
            }
        }
        return false;
    }

    //重写hashCode方法
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    //重写toString方法 让对象打印输出的时候直接输出对象的属性 而不是hashCode码
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        stringBuilder.append(this.name);
        stringBuilder.append(":");
        stringBuilder.append(this.number);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    //如果想要让person对象存入TreeSet集合内，必须实现接口 重写这个方法
    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}
