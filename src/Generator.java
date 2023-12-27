import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Generator {

    private final Random RANDOM = new Random();
    private final String[] NAMES = {"Иван", "Товарищ Сталин", "Мария", "Анна", "Федя",
                                    "Санек", "Дарья", "Володя", "Инга", "Семен"};

    private long createPhoneNumber(){
        return RANDOM.nextLong(89110000000L, 89650000000L);
    }

    private String createName(){
        return NAMES[RANDOM.nextInt(10)];
    }

    private float createExperience(){
        return (float)Math.round(RANDOM.nextFloat(0.5f, 21.0f) * 10)/10;
    }

    public Employee createEmployee(int id){
        return new Employee(id, createPhoneNumber(), createName(), createExperience());
    }

    public Map<Integer, Employee> createEmployeeDirectory(int employeeQuantity){
        Map<Integer,Employee> result = new HashMap<>();
        for (int i = 1; i < employeeQuantity + 1; i++) {
            result.put(i, createEmployee(i));
        }
        return result;
    }
}
