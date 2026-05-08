package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class hoh {
    public static final WeakHashMap d = new WeakHashMap();
    public final boolean a;
    public final Field b;
    public final String c;

    public hoh(Field field, String str) {
        this.b = field;
        this.c = str == null ? null : str.intern();
        this.a = lnh.c(field.getType());
    }

    public static Object a(Object obj, Field field) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            b0.s(e);
            return null;
        }
    }

    public static hoh b(Field field) {
        String strValue = null;
        if (field == null) {
            return null;
        }
        WeakHashMap weakHashMap = d;
        synchronized (weakHashMap) {
            try {
                hoh hohVar = (hoh) weakHashMap.get(field);
                boolean zIsEnumConstant = field.isEnumConstant();
                if (hohVar == null && (zIsEnumConstant || !Modifier.isStatic(field.getModifiers()))) {
                    if (zIsEnumConstant) {
                        xqh xqhVar = (xqh) field.getAnnotation(xqh.class);
                        if (xqhVar != null) {
                            strValue = xqhVar.value();
                        } else if (((bqh) field.getAnnotation(bqh.class)) == null) {
                            return null;
                        }
                    } else {
                        vph vphVar = (vph) field.getAnnotation(vph.class);
                        if (vphVar == null) {
                            return null;
                        }
                        strValue = vphVar.value();
                        field.setAccessible(true);
                    }
                    if ("##default".equals(strValue)) {
                        strValue = field.getName();
                    }
                    hohVar = new hoh(field, strValue);
                    weakHashMap.put(field, hohVar);
                }
                return hohVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj, Object obj2) {
        Field field = this.b;
        if (!Modifier.isFinal(field.getModifiers())) {
            try {
                field.set(obj, obj2);
                return;
            } catch (IllegalAccessException e) {
                b0.s(e);
                return;
            } catch (SecurityException e2) {
                b0.s(e2);
                return;
            }
        }
        Object objA = a(obj, field);
        if (obj2 == null) {
            if (objA == null) {
                return;
            }
        } else if (obj2.equals(objA)) {
            return;
        }
        String strValueOf = String.valueOf(objA);
        String strValueOf2 = String.valueOf(obj2);
        String name = field.getName();
        String name2 = obj.getClass().getName();
        StringBuilder sb = new StringBuilder(name2.length() + uz.c(strValueOf2.length() + strValueOf.length() + 48, name));
        sb.append("expected final value <");
        sb.append(strValueOf);
        sb.append("> but was <");
        sb.append(strValueOf2);
        l5.q(z3.n(sb, "> on ", name, " field in ", name2));
    }
}
