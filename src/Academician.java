package src;

public abstract class Academician extends Employee {
    private String department;
    private String title;
    public Academician(String nameSurname,String telephone ,String email, String department, String title){
     super(nameSurname,telephone,email);
     this.department = department;
     this.title = title;

    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public abstract void classEntry(String classTime);
    @Override
    public void entry(){
        System.out.println(this.getNameSurname()+ "akademisyen a kapısından çıkış yaptı");
    }
}
