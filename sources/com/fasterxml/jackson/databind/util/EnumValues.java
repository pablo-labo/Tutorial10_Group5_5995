package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.EnumNamingStrategy;
import com.fasterxml.jackson.databind.cfg.EnumFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import defpackage.l5;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class EnumValues implements Serializable {
    private static final long serialVersionUID = 1;
    private final Class<Enum<?>> _enumClass;
    private final SerializableString[] _textual;
    private final Enum<?>[] _values;

    private EnumValues(Class<Enum<?>> cls, SerializableString[] serializableStringArr) {
        this._enumClass = cls;
        this._values = cls.getEnumConstants();
        this._textual = serializableStringArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Class<Enum<?>> _enumClass(Class<?> cls) {
        return cls;
    }

    public static Enum<?>[] _enumConstants(Class<?> cls) {
        Enum<?>[] enumArr = (Enum[]) ClassUtil.findEnumType(cls).getEnumConstants();
        if (enumArr != null) {
            return enumArr;
        }
        l5.q("No enum constants for class ".concat(cls.getName()));
        return null;
    }

    public static EnumValues construct(Class<Enum<?>> cls, SerializableString[] serializableStringArr) {
        return new EnumValues(cls, serializableStringArr);
    }

    public static EnumValues constructFromName(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass) {
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        boolean zIsEnabled = mapperConfig.isEnabled(EnumFeature.WRITE_ENUMS_TO_LOWERCASE);
        Class<?> rawType = annotatedClass.getRawType();
        Class<Enum<?>> cls_enumClass = _enumClass(rawType);
        Enum<?>[] enumArr_enumConstants = _enumConstants(rawType);
        String[] strArrFindEnumValues = annotationIntrospector.findEnumValues(mapperConfig, annotatedClass, enumArr_enumConstants, new String[enumArr_enumConstants.length]);
        SerializableString[] serializableStringArr = new SerializableString[enumArr_enumConstants.length];
        int length = enumArr_enumConstants.length;
        for (int i = 0; i < length; i++) {
            Enum<?> r6 = enumArr_enumConstants[i];
            String lowerCase = strArrFindEnumValues[i];
            if (lowerCase == null) {
                lowerCase = r6.name();
            }
            if (zIsEnabled) {
                lowerCase = lowerCase.toLowerCase();
            }
            serializableStringArr[r6.ordinal()] = mapperConfig.compileString(lowerCase);
        }
        return construct(cls_enumClass, serializableStringArr);
    }

    public static EnumValues constructFromToString(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass) {
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        boolean zIsEnabled = mapperConfig.isEnabled(EnumFeature.WRITE_ENUMS_TO_LOWERCASE);
        Class<?> rawType = annotatedClass.getRawType();
        Class<Enum<?>> cls_enumClass = _enumClass(rawType);
        Enum<?>[] enumArr_enumConstants = _enumConstants(rawType);
        String[] strArr = new String[enumArr_enumConstants.length];
        if (annotationIntrospector != null) {
            annotationIntrospector.findEnumValues(mapperConfig, annotatedClass, enumArr_enumConstants, strArr);
        }
        SerializableString[] serializableStringArr = new SerializableString[enumArr_enumConstants.length];
        for (int i = 0; i < enumArr_enumConstants.length; i++) {
            String lowerCase = strArr[i];
            if (lowerCase == null && (lowerCase = enumArr_enumConstants[i].toString()) == null) {
                lowerCase = "";
            }
            if (zIsEnabled) {
                lowerCase = lowerCase.toLowerCase();
            }
            serializableStringArr[i] = mapperConfig.compileString(lowerCase);
        }
        return construct(cls_enumClass, serializableStringArr);
    }

    public static EnumValues constructUsingEnumNamingStrategy(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, EnumNamingStrategy enumNamingStrategy) {
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        boolean zIsEnabled = mapperConfig.isEnabled(EnumFeature.WRITE_ENUMS_TO_LOWERCASE);
        Class<?> rawType = annotatedClass.getRawType();
        Class<Enum<?>> cls_enumClass = _enumClass(rawType);
        Enum<?>[] enumArr_enumConstants = _enumConstants(rawType);
        String[] strArr = new String[enumArr_enumConstants.length];
        if (annotationIntrospector != null) {
            annotationIntrospector.findEnumValues(mapperConfig, annotatedClass, enumArr_enumConstants, strArr);
        }
        SerializableString[] serializableStringArr = new SerializableString[enumArr_enumConstants.length];
        int length = enumArr_enumConstants.length;
        for (int i = 0; i < length; i++) {
            Enum<?> r6 = enumArr_enumConstants[i];
            String lowerCase = strArr[i];
            if (lowerCase == null) {
                lowerCase = enumNamingStrategy.convertEnumToExternalName(r6.name());
            }
            if (zIsEnabled) {
                lowerCase = lowerCase.toLowerCase();
            }
            serializableStringArr[i] = mapperConfig.compileString(lowerCase);
        }
        return construct(cls_enumClass, serializableStringArr);
    }

    public Class<Enum<?>> getEnumClass() {
        return this._enumClass;
    }

    public SerializableString serializedValueFor(Enum<?> r1) {
        return this._textual[r1.ordinal()];
    }

    public Collection<SerializableString> values() {
        return Arrays.asList(this._textual);
    }
}
