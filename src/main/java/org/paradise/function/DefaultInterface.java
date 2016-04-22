package org.paradise.function;

/**
 * Created by terrence on 23/04/2016.
 */
public interface DefaultInterface {

    default String foo() {
        return "Foo" ;
    }

    default String bar() {
        return "Bar";
    }

}
