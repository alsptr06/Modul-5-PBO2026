public class App {
    public static void main(String[] args) throws Exception {

        //No 4: Alur main
        karyawan employee = new karyawan("John Doe", '1072');

        employee.setGajiPokok(-5000000);
        
        employee.setGajiPokok(5000000);

        employee.setDepartemen("IT");

        employee.displayInfo();

    }
}
