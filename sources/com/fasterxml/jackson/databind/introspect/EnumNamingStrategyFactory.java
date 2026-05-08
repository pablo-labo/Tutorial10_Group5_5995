package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.EnumNamingStrategy;
import com.fasterxml.jackson.databind.util.ClassUtil;
import defpackage.l5;

/* JADX INFO: loaded from: classes2.dex */
public class EnumNamingStrategyFactory {
    public static EnumNamingStrategy createEnumNamingStrategyInstance(Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof EnumNamingStrategy) {
            return (EnumNamingStrategy) obj;
        }
        if (!(obj instanceof Class)) {
            l5.q(l5.m("AnnotationIntrospector returned EnumNamingStrategy definition of type ", ClassUtil.classNameOf(obj), "; expected type `Class<EnumNamingStrategy>` instead"));
            return null;
        }
        Class cls = (Class) obj;
        if (cls == EnumNamingStrategy.class) {
            return null;
        }
        if (EnumNamingStrategy.class.isAssignableFrom(cls)) {
            return (EnumNamingStrategy) ClassUtil.createInstance(cls, z);
        }
        l5.q(l5.m("Problem with AnnotationIntrospector returned Class ", ClassUtil.classNameOf(cls), "; expected `Class<EnumNamingStrategy>`"));
        return null;
    }
}
