package src;

public class Officer extends Employee {
    private String expert;
    private String work;

    public Officer(String nameSurname, String telephone, String email, String expert, String work){
        super(nameSurname,telephone,email);
        this.expert = expert;
        this.work = work;
    }
    public String getExpert(){
        return expert;
    }
    public void setExpert(String expert){
        this.expert = expert;
    }
    public String getWork(){
        return work;
    }
    public void setWork(String work){
        this.work = work;
    }
    public void working(){
        System.out.println(this.getNameSurname()+"üniversite de çalışıyor.");
    }
}
