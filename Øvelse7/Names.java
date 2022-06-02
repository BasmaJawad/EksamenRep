package Øvelse7;

public class Names {

    private String firstName;
    private String middleName;
    private String lastName;
    private String fullNameSplit[];

    public Names(String fullName){
        System.out.println(fullName);
        fullName.trim();
        System.out.println(fullName);
        fullNameSplit = fullName.split(" ");
        firstName=fullNameSplit[0];

        if(fullNameSplit.length ==3){
            middleName=fullNameSplit[1];
            lastName=fullNameSplit[2];
        }
        else if(fullNameSplit.length==2){
            lastName = fullNameSplit[1];
        }

    }

    @Override
    public String toString() {
        return "Names{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
