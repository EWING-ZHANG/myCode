package Java;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class SalaryRecord {
    private static int idCounter = 1;
    private int id;
    private String employeeName;
    private int month;
    private double salary;
    private String createTime;

    public SalaryRecord(String employeeName, int month, double salary) {
        this.id = idCounter++;
        this.employeeName = employeeName;
        this.month = month;
        this.salary = salary;
        this.createTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "SalaryRecord{" +
                "id=" + id +
                ", employeeName='" + employeeName + '\'' +
                ", month=" + month +
                ", salary=" + salary +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}

public class Pay {
    private List<SalaryRecord> salaryRecords = new ArrayList<>();

    public String input(String employeeName, int month, double salary) {
        SalaryRecord salaryRecord = new SalaryRecord(employeeName, month, salary);
        salaryRecords.add(salaryRecord);
        return salaryRecord.toString();
    }

    public List<String> list(int n) {
        ArrayList<String> result = new ArrayList<>();
        if (salaryRecords.size() > n) {
            n = salaryRecords.size();
        } else if (salaryRecords.size() < 1) {
            return result;
        }
        for (int i = salaryRecords.size() - 1; i >= salaryRecords.size() - n; i--) {
            result.add(salaryRecords.get(i).toString());
        }
        return result;

    }

    public String delete(int recordId) {
        for (SalaryRecord salaryRecord : salaryRecords) {
            if (salaryRecord.getId() == recordId) {
                salaryRecords.remove(salaryRecord);
                return "success";
            }
        }
        return "fail Can't find the recodeId";
    }

    public static void main(String[] args) {
        Pay pay = new Pay();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            switch (parts[0]) {
                case "input":
                    if (parts.length == 4) {
                        String name = parts[1];
                        int month = Integer.parseInt(parts[2]);
                        double salary = Double.parseDouble(parts[3]);
                        System.out.println(pay.input(name, month, salary));
                    }
                    break;
                case "list":
                    if (parts.length == 2) {
                        int n = Integer.parseInt(parts[1]);
                        List<String> list = pay.list(n);
                        for (String s : list) {
                            System.out.println(s);
                        }
                    }
                    break;
                case "del":
                    if (parts.length == 2) {
                        int recordId = Integer.parseInt(parts[1]);
                        System.out.println(pay.delete(recordId));
                    }
            }
        }
    }
}
