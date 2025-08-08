package Ex2;

public class Student {
    private String name = "Jonh";
    private String classes = "C02" ;

    public Student(){};
    public Student(String name, String classes){
        this.name = name;
        this.classes = classes;
    }
    public String getName(){
        return name;
    }
    public String getClasses(){
        return classes;
    }
    protected void setName(String name){
        this.name = name;
    }
    protected void setClasses(String classes){
        this.classes = classes;
    }
    private void setName1(String name){
        this.name = name;
    }
    private void setClasses1(String classes){
        this.classes= classes;
    }
    public void callSetName (String name){
        setName1(name);
    }
    public void callSetClasses (String classes){
        setClasses1(classes);
    }

}
