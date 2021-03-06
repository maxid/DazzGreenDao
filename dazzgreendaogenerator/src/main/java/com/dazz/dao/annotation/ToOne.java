package com.dazz.dao.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines *-to-1 relation with base on existing property as foreign key or with base on
 * automatically created backing column
 * <p>
 * In case foreignKey is not specified, the following annotations can be applied together with @ToOne:
 * - {@link Property} to specify backing column name
 * - {@link Unique} to put the unique constraint on backing column during table creation
 * - {@link NotNull} to put the NOT NULL constraint on backing column during table creation
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.FIELD)
public @interface ToOne {

    /**
     * 关联实体类的关联键，注意，需要定义在实体类中的表当中
     *
     * @return
     */
    String foreignKey();


    /**
     * Only the Long and String
     *
     * @return
     */
    String foreignKeyType();
}
