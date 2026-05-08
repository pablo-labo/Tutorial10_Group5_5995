package defpackage;

import defpackage.ewc;
import io.jsonwebtoken.JwtParser;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class te8 implements k52 {
    public static final pxc a = new pxc("<v#(\\d+)>");

    public abstract class a {
        public static final /* synthetic */ qf8<Object>[] b = {fwc.a.g(new l4c(a.class, "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", 0))};
        public final ewc.a a;

        public a(te8 te8Var) {
            this.a = ewc.a(null, new r4(te8Var, 3));
        }
    }

    public static final class b {
        public final ArrayList a;
        public final Class<?> b;

        public b(Class cls, ArrayList arrayList) {
            this.a = arrayList;
            this.b = cls;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c a;
        public static final c b;
        public static final /* synthetic */ c[] c;

        static {
            c cVar = new c("DECLARED", 0);
            a = cVar;
            c cVar2 = new c("INHERITED", 1);
            b = cVar2;
            c = new c[]{cVar, cVar2};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) c.clone();
        }
    }

    public static final class d extends hzh {
        @Override // defpackage.hzh, defpackage.ej3
        public final Object p(n52 n52Var, Object obj) {
            ((j6g) obj).getClass();
            throw new IllegalStateException("No constructors should appear here: " + n52Var);
        }
    }

    public static Method A(Class cls, String str, Class[] clsArr, Class cls2, boolean z) {
        Method methodA;
        if (z) {
            clsArr[0] = cls;
        }
        Method methodE = E(cls, str, clsArr, cls2);
        if (methodE != null) {
            return methodE;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodA = A(superclass, str, clsArr, cls2, z)) != null) {
            return methodA;
        }
        ct0 ct0VarQ = web.q(cls.getInterfaces());
        while (true) {
            Class<?> cls3 = null;
            if (!ct0VarQ.hasNext()) {
                return null;
            }
            Class cls4 = (Class) ct0VarQ.next();
            cls4.getClass();
            Method methodA2 = A(cls4, str, clsArr, cls2, z);
            if (methodA2 != null) {
                return methodA2;
            }
            if (z) {
                try {
                    cls3 = Class.forName(cls4.getName().concat("$DefaultImpls"), false, wuc.d(cls4));
                } catch (ClassNotFoundException unused) {
                }
                if (cls3 != null) {
                    clsArr[0] = cls4;
                    Method methodE2 = E(cls3, str, clsArr, cls2);
                    if (methodE2 != null) {
                        return methodE2;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public static Constructor D(Class cls, ArrayList arrayList) {
        try {
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method E(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (wl7.b(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (wl7.b(method.getName(), str) && wl7.b(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static void m(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        Class cls;
        cls = DefaultConstructorMarker.class;
        boolean zB = wl7.b(z92.Z0(arrayList2), cls);
        List listSubList = arrayList2;
        if (zB) {
            listSubList = arrayList2.subList(0, arrayList2.size() - 1);
        }
        arrayList.addAll(listSubList);
        int size = (listSubList.size() + 31) / 32;
        for (int i = 0; i < size; i++) {
            Class cls2 = Integer.TYPE;
            cls2.getClass();
            arrayList.add(cls2);
        }
        arrayList.add(z ? DefaultConstructorMarker.class : Object.class);
    }

    public final b B(String str, boolean z) {
        int iR;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (str.charAt(i) != ')') {
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char cCharAt = str.charAt(i2);
            if (zve.M("VZCBSIFJD", cCharAt)) {
                iR = i2 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new qi8("Unknown type prefix in the method signature: ".concat(str));
                }
                iR = zve.R(str, ';', i, false, 4) + 1;
            }
            arrayList.add(C(i, iR, str));
            i = iR;
        }
        return new b(z ? C(i + 1, str.length(), str) : null, arrayList);
    }

    public final Class C(int i, int i2, String str) throws ClassNotFoundException {
        char cCharAt = str.charAt(i);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            ClassLoader classLoaderD = wuc.d(j());
            String strReplace = str.substring(i + 1, i2 - 1).replace('/', JwtParser.SEPARATOR_CHAR);
            strReplace.getClass();
            Class<?> clsLoadClass = classLoaderD.loadClass(strReplace);
            clsLoadClass.getClass();
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class cls = Void.TYPE;
            cls.getClass();
            return cls;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            Class clsC = C(i + 1, i2, str);
            mq5 mq5Var = akg.a;
            clsC.getClass();
            return Array.newInstance((Class<?>) clsC, 0).getClass();
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new qi8("Unknown type prefix in the method signature: ".concat(str));
        }
    }

    public final Method o(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        if (str.equals("<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(j());
        }
        b bVarB = B(str2, true);
        m(arrayList, bVarB.a, false);
        Class<?> clsY = y();
        String strConcat = str.concat("$default");
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class<?> cls = bVarB.b;
        cls.getClass();
        return A(clsY, strConcat, clsArr, cls, z);
    }

    public final Method q(String str, String str2) {
        Method methodA;
        str.getClass();
        str2.getClass();
        if (str.equals("<init>")) {
            return null;
        }
        b bVarB = B(str2, true);
        Class[] clsArr = (Class[]) bVarB.a.toArray(new Class[0]);
        Class<?> cls = bVarB.b;
        cls.getClass();
        Method methodA2 = A(y(), str, clsArr, cls, false);
        if (methodA2 != null) {
            return methodA2;
        }
        if (!y().isInterface() || (methodA = A(Object.class, str, clsArr, cls, false)) == null) {
            return null;
        }
        return methodA;
    }

    public abstract Collection<uq2> t();

    public abstract Collection<kv5> v(n8a n8aVar);

    public abstract d4c w(int i);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection<defpackage.wd8<?>> x(defpackage.in9 r8, te8.c r9) {
        /*
            r7 = this;
            r8.getClass()
            te8$d r0 = new te8$d
            r0.<init>(r7)
            r7 = 3
            r1 = 0
            java.util.Collection r7 = z4d.a.a(r8, r1, r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L19:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L60
            java.lang.Object r2 = r7.next()
            aj3 r2 = (defpackage.aj3) r2
            boolean r3 = r2 instanceof defpackage.hv1
            if (r3 == 0) goto L59
            r3 = r2
            hv1 r3 = (defpackage.hv1) r3
            e04 r4 = r3.getVisibility()
            d04$k r5 = defpackage.d04.h
            boolean r4 = defpackage.wl7.b(r4, r5)
            if (r4 != 0) goto L59
            hv1$a r3 = r3.f()
            r3.getClass()
            hv1$a r4 = hv1.a.b
            r5 = 1
            r6 = 0
            if (r3 == r4) goto L47
            r3 = r5
            goto L48
        L47:
            r3 = r6
        L48:
            te8$c r4 = te8.c.a
            if (r9 != r4) goto L4d
            goto L4e
        L4d:
            r5 = r6
        L4e:
            if (r3 != r5) goto L59
            j6g r3 = defpackage.j6g.a
            java.lang.Object r2 = r2.o0(r0, r3)
            wd8 r2 = (defpackage.wd8) r2
            goto L5a
        L59:
            r2 = r1
        L5a:
            if (r2 == 0) goto L19
            r8.add(r2)
            goto L19
        L60:
            java.util.List r7 = defpackage.z92.z1(r8)
            java.util.Collection r7 = (java.util.Collection) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te8.x(in9, te8$c):java.util.Collection");
    }

    public Class<?> y() {
        Class<?> clsJ = j();
        List<yd8<? extends Object>> list = wuc.a;
        clsJ.getClass();
        Class<? extends Object> cls = wuc.c.get(clsJ);
        return cls == null ? j() : cls;
    }

    public abstract Collection<d4c> z(n8a n8aVar);
}
