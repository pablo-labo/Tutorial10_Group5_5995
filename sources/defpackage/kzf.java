package defpackage;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kzf {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ig8.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final String a(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        r6e r6eVarO = v6e.O(type, lzf.a);
        return ((Class) a7e.U(r6eVarO)).getName() + wve.G(a7e.P(r6eVarO), "[]");
    }

    public static final Type b(zf8 zf8Var, boolean z) {
        oe8 oe8VarA = zf8Var.a();
        if (oe8VarA instanceof dg8) {
            return new lyf((dg8) oe8VarA);
        }
        if (!(oe8VarA instanceof yd8)) {
            l5.p(zf8Var, "Unsupported type classifier: ");
            return null;
        }
        yd8 yd8Var = (yd8) oe8VarA;
        Class clsQ = z ? jh2.q(yd8Var) : jh2.p(yd8Var);
        List<gg8> listG = zf8Var.g();
        if (listG.isEmpty()) {
            return clsQ;
        }
        if (!clsQ.isArray()) {
            return c(clsQ, listG);
        }
        if (clsQ.getComponentType().isPrimitive()) {
            return clsQ;
        }
        gg8 gg8Var = (gg8) z92.m1(listG);
        if (gg8Var == null) {
            akb.o(zf8Var, "kotlin.Array must have exactly one type argument: ");
            return null;
        }
        ig8 ig8Var = gg8Var.a;
        zf8 zf8Var2 = gg8Var.b;
        int i = ig8Var == null ? -1 : a.a[ig8Var.ordinal()];
        if (i == -1 || i == 1) {
            return clsQ;
        }
        if (i != 2 && i != 3) {
            l.g();
            return null;
        }
        zf8Var2.getClass();
        Type typeB = b(zf8Var2, false);
        return typeB instanceof Class ? clsQ : new ww5(typeB);
    }

    public static final t3b c(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(d((gg8) it.next()));
            }
            return new t3b(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(t92.r0(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(d((gg8) it2.next()));
            }
            return new t3b(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        t3b t3bVarC = c(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(t92.r0(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(d((gg8) it3.next()));
        }
        return new t3b(cls, t3bVarC, arrayList3);
    }

    public static final Type d(gg8 gg8Var) {
        ig8 ig8Var = gg8Var.a;
        if (ig8Var == null) {
            return gzg.c;
        }
        zf8 zf8Var = gg8Var.b;
        zf8Var.getClass();
        int iOrdinal = ig8Var.ordinal();
        if (iOrdinal == 0) {
            return b(zf8Var, true);
        }
        if (iOrdinal == 1) {
            return new gzg(null, b(zf8Var, true));
        }
        if (iOrdinal == 2) {
            return new gzg(b(zf8Var, true), null);
        }
        l.g();
        return null;
    }
}
