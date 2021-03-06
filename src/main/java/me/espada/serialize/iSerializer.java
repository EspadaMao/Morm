package me.espada.serialize;

import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface iSerializer {
    Class<? extends iSerializable> value();
}
