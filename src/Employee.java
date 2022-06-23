package src;
public abstract class Employee {
  private String nameSurname;
  private String telephone;
  private String email;

  public Employee(String nameSurname, String telephone, String email){
      this.nameSurname=nameSurname;
      this.telephone=telephone;
      this.email=email;
  }
  public String getNameSurname(){
      return nameSurname;
  }
  public void setNameSurname(String nameSurname){
      this.nameSurname=nameSurname;
  }
  public String getTelephone(){
      return telephone;
  }
  public void setTelephone(String telephone){
      this.telephone=telephone;
  }
  public String getEmail(){
      return email ;
  }
  public void setEmail(String email){
      this.email=email;
  }
  public void entry(){
      System.out.println(this.nameSurname + " üniversiteye giriş yaptı");
  }
  public void entry(String entryTime){
      System.out.println(this.getNameSurname()+""+entryTime  + "saatinde üniversiteye giriş yaptı.");
  }
  public void entry(String entryTime, String exitTime){
      System.out.println(this.getNameSurname() + "" + entryTime + "saatinde giriş yaptı ve" + exitTime + "saatinde çıkış yaptı.");
  }
  public void exit(){
      System.out.println(this.nameSurname + " üniversiteden çıkış yaptı.");
  }
  public void diningRoom(){
      System.out.println(this.nameSurname + " yemekhaneye girdi");
  }
  public static void entries(Employee[] loginUsers){
      for(Employee e : loginUsers){
          e.entry();
      }
  }
}