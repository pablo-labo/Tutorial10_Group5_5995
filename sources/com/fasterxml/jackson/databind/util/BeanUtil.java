package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes2.dex */
public class BeanUtil {
    public static String checkUnsupportedType(JavaType javaType) {
        String str;
        String str2;
        String name = javaType.getRawClass().getName();
        if (isJava8TimeClass(name)) {
            if (name.indexOf(46, 10) >= 0) {
                return null;
            }
            str = "Java 8 date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310";
        } else if (isJodaTimeClass(name)) {
            str = "Joda date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-joda";
        } else {
            if (!isJava8OptionalClass(name)) {
                return null;
            }
            str = "Java 8 optional";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-jdk8";
        }
        return str + " type " + ClassUtil.getTypeDescription(javaType) + " not supported by default: add Module \"" + str2 + "\" to enable handling";
    }

    public static Object getDefaultValue(JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        Class<?> clsPrimitiveType = ClassUtil.primitiveType(rawClass);
        if (clsPrimitiveType != null) {
            return ClassUtil.defaultValue(clsPrimitiveType);
        }
        if (javaType.isContainerType() || javaType.isReferenceType()) {
            return JsonInclude.Include.NON_EMPTY;
        }
        if (rawClass == String.class) {
            return "";
        }
        if (javaType.isTypeOrSubTypeOf(Date.class)) {
            return new Date(0L);
        }
        if (!javaType.isTypeOrSubTypeOf(Calendar.class)) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(0L);
        return gregorianCalendar;
    }

    private static boolean isJava8OptionalClass(String str) {
        return str.startsWith("java.util.Optional");
    }

    private static boolean isJava8TimeClass(String str) {
        return str.startsWith("java.time.");
    }

    private static boolean isJodaTimeClass(String str) {
        return str.startsWith("org.joda.time.");
    }
}
