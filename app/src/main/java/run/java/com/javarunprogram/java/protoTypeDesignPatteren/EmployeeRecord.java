package run.java.com.javarunprogram.java.protoTypeDesignPatteren;

public class EmployeeRecord implements ProtoType {

    String name;
    int Id;
    String stream;

    EmployeeRecord(String name, int Id, String stream) {
        this.Id = Id;
        this.name = name;
        this.stream = stream;
    }

    void getEmployeeRecord() {
        System.out.println("Employee Name : " + name +
                "\n" + "----------------------------------------------" +
                "\n" + "Employee Id : " + Id + "\n" + "----------------------------------------------" +
                "\n" + "Employee Stream : " + stream);
    }


    @Override
    public ProtoType getProtoType() {
        return new EmployeeRecord(name, Id, stream);
    }
}
