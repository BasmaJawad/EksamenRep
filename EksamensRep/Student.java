package EksamensRep;
// ABSTRAKTE KLASSER OG METODER
// DOWNCASTING OG UPCASTING
public class Student extends Human{
    private int studentId;

    public Student(String name, int age, int studentId){
        super(name,age);
        this.studentId = studentId;
    }

    //ABSTRACT INFORCMENT- metoden er inforced fra superklassen da "saysHi" er en abstract metode
    public void saysHi() {
        System.out.println("the student says hi");
    }

    public static void main(String[] args) {


        Student s1 = new Student("Hans",20,9090);
        Student s2 = new Student("Greta", 19, 8464);
        s1.saysHi();
        s2.saysName();
        System.out.println(s1);
        System.out.println(s2);


        // brug af instansOf
        if(s1 instanceof Student )
            System.out.println("true");
        //ELLER
        System.out.println(s1 instanceof Student);

        //CASTING

        //UPCASTING - new student kan nu bruges som et human objekt, dvs vi ikke har adgang til de metoder der er i student
        Human human = new Student("mette",30,12345);

        //DOWNCASTING - fra super til sub klasse
        //TJEKKE OM S3 ER STUDENT, og får adgang til metode i studentklassen
        if(human instanceof Student) {
            Student s3 = (Student) human;
            s3.saysHi();
        }

    }

    @Override

    public String toString(){
        return studentId + " "+ name +" "+ age;
    }
}
