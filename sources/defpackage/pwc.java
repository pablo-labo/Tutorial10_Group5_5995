package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import defpackage.gwc;
import defpackage.hwc;
import defpackage.kwc;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pwc implements qvf {
    public final pq2 a;
    public final d15 b;
    public final List<gwc> c;

    public static abstract class a<T, A> extends pvf<T> {
        public final LinkedHashMap a;

        public a(LinkedHashMap linkedHashMap) {
            this.a = linkedHashMap;
        }

        @Override // defpackage.pvf
        public final T a(nb8 nb8Var) throws IOException {
            if (nb8Var.j0() == sb8.X) {
                nb8Var.l1();
                return null;
            }
            A aC = c();
            try {
                nb8Var.h();
                while (nb8Var.hasNext()) {
                    b bVar = (b) this.a.get(nb8Var.X());
                    if (bVar == null || !bVar.e) {
                        nb8Var.I();
                    } else {
                        e(aC, nb8Var, bVar);
                    }
                }
                nb8Var.G();
                return d(aC);
            } catch (IllegalAccessException e) {
                kwc.a aVar = kwc.a;
                l6.p("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                return null;
            } catch (IllegalStateException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, T t) throws IOException {
            if (t == null) {
                gc8Var.Q();
                return;
            }
            gc8Var.p();
            try {
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((b) it.next()).c(gc8Var, t);
                }
                gc8Var.G();
            } catch (IllegalAccessException e) {
                kwc.a aVar = kwc.a;
                l6.p("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            }
        }

        public abstract A c();

        public abstract T d(A a);

        public abstract void e(A a, nb8 nb8Var, b bVar);
    }

    public static abstract class b {
        public final String a;
        public final Field b;
        public final String c;
        public final boolean d;
        public final boolean e;

        public b(String str, Field field, boolean z, boolean z2) {
            this.a = str;
            this.b = field;
            this.c = field.getName();
            this.d = z;
            this.e = z2;
        }

        public abstract void a(nb8 nb8Var, int i, Object[] objArr);

        public abstract void b(nb8 nb8Var, Object obj);

        public abstract void c(gc8 gc8Var, Object obj);
    }

    public static final class c<T> extends a<T, T> {
        public final hna<T> b;

        public c(hna hnaVar, LinkedHashMap linkedHashMap) {
            super(linkedHashMap);
            this.b = hnaVar;
        }

        @Override // pwc.a
        public final T c() {
            return this.b.b();
        }

        @Override // pwc.a
        public final T d(T t) {
            return t;
        }

        @Override // pwc.a
        public final void e(T t, nb8 nb8Var, b bVar) {
            bVar.b(nb8Var, t);
        }
    }

    public static final class d<T> extends a<T, Object[]> {
        public static final HashMap e;
        public final Constructor<T> b;
        public final Object[] c;
        public final HashMap d;

        static {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            e = map;
        }

        public d(Class cls, LinkedHashMap linkedHashMap, boolean z) {
            super(linkedHashMap);
            this.d = new HashMap();
            kwc.a aVar = kwc.a;
            Constructor<T> constructorB = aVar.b(cls);
            this.b = constructorB;
            if (z) {
                pwc.a(null, constructorB);
            } else {
                kwc.e(constructorB);
            }
            String[] strArrC = aVar.c(cls);
            for (int i = 0; i < strArrC.length; i++) {
                this.d.put(strArrC[i], Integer.valueOf(i));
            }
            Class<?>[] parameterTypes = this.b.getParameterTypes();
            this.c = new Object[parameterTypes.length];
            for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                this.c[i2] = e.get(parameterTypes[i2]);
            }
        }

        @Override // pwc.a
        public final Object[] c() {
            return (Object[]) this.c.clone();
        }

        @Override // pwc.a
        public final Object d(Object[] objArr) {
            Object[] objArr2 = objArr;
            Constructor<T> constructor = this.b;
            try {
                return constructor.newInstance(objArr2);
            } catch (IllegalAccessException e2) {
                kwc.a aVar = kwc.a;
                l6.p("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
                return null;
            } catch (IllegalArgumentException e3) {
                e = e3;
                throw new RuntimeException("Failed to invoke constructor '" + kwc.b(constructor) + "' with args " + Arrays.toString(objArr2), e);
            } catch (InstantiationException e4) {
                e = e4;
                throw new RuntimeException("Failed to invoke constructor '" + kwc.b(constructor) + "' with args " + Arrays.toString(objArr2), e);
            } catch (InvocationTargetException e5) {
                l6.p("Failed to invoke constructor '" + kwc.b(constructor) + "' with args " + Arrays.toString(objArr2), e5.getCause());
                return null;
            }
        }

        @Override // pwc.a
        public final void e(Object[] objArr, nb8 nb8Var, b bVar) {
            Object[] objArr2 = objArr;
            String str = bVar.c;
            Integer num = (Integer) this.d.get(str);
            if (num != null) {
                bVar.a(nb8Var, num.intValue(), objArr2);
            } else {
                b0.q("Could not find the index in the constructor '", kwc.b(this.b), "' for field with name '", str, "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
            }
        }
    }

    public pwc(pq2 pq2Var, d15 d15Var, v98 v98Var) {
        List<gwc> list = Collections.EMPTY_LIST;
        this.a = pq2Var;
        this.b = d15Var;
        this.c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!hwc.a.a.a(obj, accessibleObject)) {
            throw new JsonIOException(kwc.d(accessibleObject, true).concat(" is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ea A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.LinkedHashMap b(defpackage.ae6 r29, defpackage.iyf r30, java.lang.Class r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pwc.b(ae6, iyf, java.lang.Class, boolean, boolean):java.util.LinkedHashMap");
    }

    @Override // defpackage.qvf
    public final <T> pvf<T> c(ae6 ae6Var, iyf<T> iyfVar) {
        Class<? super T> cls = iyfVar.a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        List list = Collections.EMPTY_LIST;
        gwc.a aVarA = hwc.a(cls);
        if (aVarA != gwc.a.d) {
            boolean z = aVarA == gwc.a.c;
            return kwc.a.d(cls) ? new d(cls, b(ae6Var, iyfVar, cls, z, true), z) : new c(this.a.b(iyfVar), b(ae6Var, iyfVar, cls, z, false));
        }
        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + cls + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    public final boolean d(Field field, boolean z) {
        Class<?> type = field.getType();
        d15 d15Var = this.b;
        d15Var.getClass();
        if (d15.e(type) || d15Var.d(type, z) || (136 & field.getModifiers()) != 0 || field.isSynthetic() || d15.e(field.getType())) {
            return false;
        }
        List<e15> list = z ? d15Var.a : d15Var.b;
        if (list.isEmpty()) {
            return true;
        }
        Iterator<e15> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().b()) {
                return false;
            }
        }
        return true;
    }
}
