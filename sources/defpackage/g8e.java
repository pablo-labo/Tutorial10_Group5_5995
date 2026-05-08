package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g8e {
    public static final Class<?> a(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            return a(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            upperBounds.getClass();
            Object objJ0 = ut0.j0(upperBounds);
            objJ0.getClass();
            return a((Type) objJ0);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            genericComponentType.getClass();
            return a(genericComponentType);
        }
        StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
        sb.append(type);
        sb.append(" has type ");
        l5.q(ia.m(fwc.a, type.getClass(), sb));
        return null;
    }

    public static final <T> KSerializer<T> b(v1 v1Var, Class<T> cls, List<? extends KSerializer<Object>> list) throws IllegalAccessException, InvocationTargetException {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer<T> kSerializerN = hh2.n(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (kSerializerN != null) {
            return kSerializerN;
        }
        iwc iwcVar = fwc.a;
        yd8 yd8VarB = iwcVar.b(cls);
        KSerializer<T> kSerializer = (KSerializer) hnb.a.get(yd8VarB);
        if (kSerializer != null) {
            return kSerializer;
        }
        KSerializer<T> kSerializerX = v1Var.X(yd8VarB, list);
        if (kSerializerX != null) {
            return kSerializerX;
        }
        if (cls.isInterface()) {
            return new mfb(iwcVar.b(cls));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r7 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (r7 == null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlinx.serialization.KSerializer<java.lang.Object> c(defpackage.v1 r7, java.lang.reflect.Type r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g8e.c(v1, java.lang.reflect.Type, boolean):kotlinx.serialization.KSerializer");
    }
}
