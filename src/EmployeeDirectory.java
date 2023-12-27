import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmployeeDirectory {
    private Map<Integer, Employee> directory;

    public EmployeeDirectory(Map<Integer, Employee> directory) {
        this.directory = directory;
    }
    
    public List<Employee> findEmployeeByExperience(float experienceStart, float experienceStop){
        List<Employee> result = new ArrayList<>();
        for (Map.Entry<Integer, Employee> element : directory.entrySet()) {
            if (element.getValue().getExperience() >= experienceStart && element.getValue().getExperience() <= experienceStop){
                result.add(element.getValue());
            }
        }

        if (result.isEmpty()){
            return null;
        } else return result;
    }

    public List<Long> findPhoneNumberByName(String name){
        List<Long> result = new ArrayList<>();
        for (Map.Entry<Integer, Employee> element : directory.entrySet()) {
            if (element.getValue().getName().equals(name)){
                result.add(element.getValue().getPhoneNumber());
            }
        }

        if (result.isEmpty()){
            return null;
        } else return result;
    }

    public Employee findEmployeeById(int id){
        return directory.get(id); //т.к. у меня ключ - это и есть табельный номер сотрудника
    }

    public void addEmployee(Employee employee){
        boolean flag = true;
        while (flag){
            if (directory.containsKey(employee.getId())){
                employee.setId(employee.getId() + 1);
            } else {
                directory.put(employee.getId(), employee);
                flag = false;
            }
        }

    }

    @Override
    public String toString() {
        return directory.toString();
    }
}
