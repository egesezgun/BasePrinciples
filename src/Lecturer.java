package src;

public class Lecturer  extends Academician{
    private String doorNo;

    public Lecturer(String nameSurname, String telephone, String email, String department, String title, String doorNo){
        super(nameSurname, telephone, email, department, title);
        this.doorNo = doorNo;
    }
    public String getDoorNo(){
        return doorNo;
    }
    public void setDoorNo(String doorNo){
        this.doorNo= doorNo;
    }
    @Override
    public void entry(){
        System.out.println(this.getNameSurname()+ "ögretim görevlisi B kapısından giriş yaptı");
    }
    @Override
    public void classEntry(String time){
        System.out.println(this.getNameSurname()+"derse "+ time + "giriş yaptı");
    };
}
