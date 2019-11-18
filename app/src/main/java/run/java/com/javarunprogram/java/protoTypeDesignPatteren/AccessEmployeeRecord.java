package run.java.com.javarunprogram.java.protoTypeDesignPatteren;

public class AccessEmployeeRecord {

    public static void main(String[] args) {
        EmployeeRecord employeeRecord = new EmployeeRecord("Narender", 01, "android developer");
        employeeRecord.getEmployeeRecord();

        ProtoType employeeRecord1 = (EmployeeRecord) employeeRecord.getProtoType();
        employeeRecord.getEmployeeRecord();
    }
}
