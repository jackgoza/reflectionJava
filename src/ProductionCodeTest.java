
import java.lang.reflect.*;

public class ProductionCodeTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

	ProductionCode testSubject = new ProductionCode();
	Class reflectionSubject = testSubject.getClass();
	Class[] argTypes = new Class[]{int.class, int.class};
	Method addMethod = reflectionSubject.getDeclaredMethod("add", argTypes);
	addMethod.setAccessible(true);

	int inputValue1 = 3;
	int inputValue2 = 7;
	int expectedResult = inputValue1 + inputValue2 + 1;

	Object[] parms = new Object[]{inputValue1, inputValue2};

	int actualResult = (int) addMethod.invoke(testSubject, parms);

	if (actualResult == expectedResult) {
	    System.out.println("ProductionCode test passed.");
	}
	else {
	    System.out.println("ProductionCode test failed.");
	}
    }
}
