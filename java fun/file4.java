import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
    private String name, id, address;
    private int age;

    private ArrayList<Double> toan = new ArrayList<Double>();
    private ArrayList<Double> ly = new ArrayList<Double>();
    private ArrayList<Double> hoa = new ArrayList<Double>();
    private ArrayList<Double> sinh = new ArrayList<Double>();

    public Student() {
    }

    public Double TBMon(ArrayList<Double> n){
        Double s = 0.0;
        for(Double l:n){
            s += l;
        }
        s = s/n.size();
        return s;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Double> getToan() {
        return toan;
    }

    public void setToan(ArrayList<Double> toan) {
        this.toan = toan;
    }

    public ArrayList<Double> getLy() {
        return ly;
    }

    public void setLy(ArrayList<Double> ly) {
        this.ly = ly;
    }

    public ArrayList<Double> getHoa() {
        return hoa;
    }

    public void setHoa(ArrayList<Double> hoa) {
        this.hoa = hoa;
    }

    public ArrayList<Double> getSinh() {
        return sinh;
    }

    public void setSinh(ArrayList<Double> sinh) {
        this.sinh = sinh;
    }


    //Monhoc
    
    
}

public class file4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Student student = new Student();
        ArrayList<Double> hoa = student.getHoa();
        
        System.out.println("nhap mon hoc:");
        String a = in.nextLine();
        if (a == "hoa"){
            System.out.println("Nhap diem hoa");
            Double diem = in.nextDouble();
            hoa.add(diem);
        }else{
            System.out.println("no");
        }
        for(double s : hoa){
            System.out.println(s);
        }

        in.close();
    }
    //new
}
