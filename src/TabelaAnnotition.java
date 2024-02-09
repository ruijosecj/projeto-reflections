import java.lang.annotation.*;
;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface TabelaAnnotition {
    String value();
}
