package Java8;

//https://www.javatpoint.com/custom-annotation

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Types of Annotation
 * There are three types of annotations.
 * <p>
 * Marker Annotation (The @Override and @Deprecated are marker annotations.)
 * Single-Value Annotation
 * Multi-Value Annotation
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface MyAnnotation {

    String value() default "";

    //@MyAnnotation(value=10)
//когда только 1 метод то сингл вайлу

    // много методов Multi-Value Annotation
//    int value1();
//    String value2();
//    String value3();


}
