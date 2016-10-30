
import acme.NetworkService;
import java.lang.reflect.Field;

public class reflectionLab {

    public static void main(String[] args) throws NoSuchFieldException,
	    SecurityException, IllegalArgumentException, IllegalAccessException {
	NetworkService ns = new NetworkService();
	Class nsClass = ns.getClass();

	Field fields[] = nsClass.getDeclaredFields();
	System.out.println("\nFields:");
	for (Field field : fields) {
	    System.out.println(field.getName() + " is: "
		    + field.toGenericString());
	}

	Field addressField = nsClass.getDeclaredField("machineName");
	addressField.setAccessible(true);
	addressField.set(ns, "aws.com");

	ns.connect();
    }
}
