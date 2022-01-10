package S1_07_NIVELL2_E1;

import java.io.File;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface Serial {
	
	File f=new File("c:/users/juanc/desktop/java_ejemplo/proba.json");

}
