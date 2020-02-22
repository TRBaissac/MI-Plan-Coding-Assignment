public class GeneralStaff{

    private String name;
    private String surname;
    private int id;

//Constructor

    public GeneralStaff(String name, String surname, int id){
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

// Getters

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public int getID(){
        return id;
    }

// Setters

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;

    }

    public void setID(int id){
        this.id = id;
    }
}
