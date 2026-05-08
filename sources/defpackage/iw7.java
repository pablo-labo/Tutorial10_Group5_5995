package defpackage;

import defpackage.a62;
import defpackage.ere;
import defpackage.rv5;
import io.jsonwebtoken.JwtParser;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public final class iw7 {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final a62 e;
    public static final mq5 f;
    public static final a62 g;
    public static final HashMap<nq5, a62> h;
    public static final HashMap<nq5, a62> i;
    public static final HashMap<nq5, mq5> j;
    public static final HashMap<nq5, mq5> k;
    public static final HashMap<a62, a62> l;
    public static final HashMap<a62, a62> m;
    public static final List<a> n;

    public static final class a {
        public final a62 a;
        public final a62 b;
        public final a62 c;

        public a(a62 a62Var, a62 a62Var2, a62 a62Var3) {
            this.a = a62Var;
            this.b = a62Var2;
            this.c = a62Var3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.a + ", kotlinReadOnly=" + this.b + ", kotlinMutable=" + this.c + ')';
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        rv5.a aVar = rv5.a.c;
        sb.append(aVar.a);
        sb.append(JwtParser.SEPARATOR_CHAR);
        sb.append(aVar.b);
        a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        rv5.b bVar = rv5.b.c;
        sb2.append(bVar.a);
        sb2.append(JwtParser.SEPARATOR_CHAR);
        sb2.append(bVar.b);
        b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        rv5.d dVar = rv5.d.c;
        sb3.append(dVar.a);
        sb3.append(JwtParser.SEPARATOR_CHAR);
        sb3.append(dVar.b);
        c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        rv5.c cVar = rv5.c.c;
        sb4.append(cVar.a);
        sb4.append(JwtParser.SEPARATOR_CHAR);
        sb4.append(cVar.b);
        d = sb4.toString();
        a62 a62VarB = a62.a.b(new mq5("kotlin.jvm.functions.FunctionN"));
        e = a62VarB;
        f = a62VarB.a();
        g = xqe.s;
        d(Class.class);
        h = new HashMap<>();
        i = new HashMap<>();
        j = new HashMap<>();
        k = new HashMap<>();
        l = new HashMap<>();
        m = new HashMap<>();
        a62 a62VarB2 = a62.a.b(ere.a.B);
        mq5 mq5Var = ere.a.J;
        mq5 mq5Var2 = a62VarB2.a;
        a aVar2 = new a(d(Iterable.class), a62VarB2, new a62(mq5Var2, oq5.a(mq5Var, mq5Var2), false));
        a62 a62VarB3 = a62.a.b(ere.a.A);
        mq5 mq5Var3 = ere.a.I;
        mq5 mq5Var4 = a62VarB3.a;
        a aVar3 = new a(d(Iterator.class), a62VarB3, new a62(mq5Var4, oq5.a(mq5Var3, mq5Var4), false));
        a62 a62VarB4 = a62.a.b(ere.a.C);
        mq5 mq5Var5 = ere.a.K;
        mq5 mq5Var6 = a62VarB4.a;
        a aVar4 = new a(d(Collection.class), a62VarB4, new a62(mq5Var6, oq5.a(mq5Var5, mq5Var6), false));
        a62 a62VarB5 = a62.a.b(ere.a.D);
        mq5 mq5Var7 = ere.a.L;
        mq5 mq5Var8 = a62VarB5.a;
        a aVar5 = new a(d(List.class), a62VarB5, new a62(mq5Var8, oq5.a(mq5Var7, mq5Var8), false));
        a62 a62VarB6 = a62.a.b(ere.a.F);
        mq5 mq5Var9 = ere.a.N;
        mq5 mq5Var10 = a62VarB6.a;
        a aVar6 = new a(d(Set.class), a62VarB6, new a62(mq5Var10, oq5.a(mq5Var9, mq5Var10), false));
        a62 a62VarB7 = a62.a.b(ere.a.E);
        mq5 mq5Var11 = ere.a.M;
        mq5 mq5Var12 = a62VarB7.a;
        a aVar7 = new a(d(ListIterator.class), a62VarB7, new a62(mq5Var12, oq5.a(mq5Var11, mq5Var12), false));
        mq5 mq5Var13 = ere.a.G;
        a62 a62VarB8 = a62.a.b(mq5Var13);
        mq5 mq5Var14 = ere.a.O;
        mq5 mq5Var15 = a62VarB8.a;
        a aVar8 = new a(d(Map.class), a62VarB8, new a62(mq5Var15, oq5.a(mq5Var14, mq5Var15), false));
        a62 a62VarD = a62.a.b(mq5Var13).d(ere.a.H.a.f());
        mq5 mq5Var16 = ere.a.P;
        mq5 mq5Var17 = a62VarD.a;
        List<a> listA0 = u63.a0(aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, new a(d(Map.Entry.class), a62VarD, new a62(mq5Var17, oq5.a(mq5Var16, mq5Var17), false)));
        n = listA0;
        c(Object.class, ere.a.a);
        c(String.class, ere.a.f);
        c(CharSequence.class, ere.a.e);
        b(Throwable.class, ere.a.k);
        c(Cloneable.class, ere.a.c);
        c(Number.class, ere.a.i);
        b(Comparable.class, ere.a.l);
        c(Enum.class, ere.a.j);
        b(Annotation.class, ere.a.s);
        for (a aVar9 : listA0) {
            a62 a62Var = aVar9.a;
            a62 a62Var2 = aVar9.b;
            a62 a62Var3 = aVar9.c;
            a(a62Var, a62Var2);
            i.put(a62Var3.a().a, a62Var);
            l.put(a62Var3, a62Var2);
            m.put(a62Var2, a62Var3);
            mq5 mq5VarA = a62Var2.a();
            mq5 mq5VarA2 = a62Var3.a();
            j.put(a62Var3.a().a, mq5VarA);
            k.put(mq5VarA.a, mq5VarA2);
        }
        for (md8 md8Var : md8.values()) {
            mq5 mq5VarM = md8Var.m();
            mq5VarM.getClass();
            a62 a62Var4 = new a62(mq5VarM.b(), mq5VarM.a.f());
            bnb bnbVarH = md8Var.h();
            bnbVarH.getClass();
            mq5 mq5VarA3 = ere.l.a(bnbVarH.m());
            a(a62Var4, new a62(mq5VarA3.b(), mq5VarA3.a.f()));
        }
        for (a62 a62Var5 : bd2.a) {
            mq5 mq5Var18 = new mq5("kotlin.jvm.internal." + a62Var5.f().c() + "CompanionObject");
            a(new a62(mq5Var18.b(), mq5Var18.a.f()), a62Var5.d(toe.b));
        }
        for (int i2 = 0; i2 < 23; i2++) {
            mq5 mq5Var19 = new mq5(p6.c(i2, "kotlin.jvm.functions.Function"));
            a(new a62(mq5Var19.b(), mq5Var19.a.f()), new a62(ere.l, n8a.h("Function" + i2)));
            i.put(new mq5(b + i2).a, g);
        }
        for (int i3 = 0; i3 < 22; i3++) {
            rv5.c cVar2 = rv5.c.c;
            i.put(new mq5((cVar2.a + JwtParser.SEPARATOR_CHAR + cVar2.b) + i3).a, g);
        }
        mq5 mq5Var20 = new mq5("kotlin.concurrent.atomics.AtomicInt");
        a62 a62VarD2 = d(AtomicInteger.class);
        HashMap<nq5, a62> map = i;
        map.put(mq5Var20.a, a62VarD2);
        map.put(new mq5("kotlin.concurrent.atomics.AtomicLong").a, d(AtomicLong.class));
        map.put(new mq5("kotlin.concurrent.atomics.AtomicBoolean").a, d(AtomicBoolean.class));
        map.put(new mq5("kotlin.concurrent.atomics.AtomicReference").a, d(AtomicReference.class));
        map.put(new mq5("kotlin.concurrent.atomics.AtomicIntArray").a, d(AtomicIntegerArray.class));
        map.put(new mq5("kotlin.concurrent.atomics.AtomicLongArray").a, d(AtomicLongArray.class));
        map.put(new mq5("kotlin.concurrent.atomics.AtomicArray").a, d(AtomicReferenceArray.class));
        map.put(ere.a.b.g().a, d(Void.class));
    }

    public static void a(a62 a62Var, a62 a62Var2) {
        h.put(a62Var.a().a, a62Var2);
        i.put(a62Var2.a().a, a62Var);
    }

    public static void b(Class cls, mq5 mq5Var) {
        a62 a62VarD = d(cls);
        mq5Var.getClass();
        a(a62VarD, new a62(mq5Var.b(), mq5Var.a.f()));
    }

    public static void c(Class cls, nq5 nq5Var) {
        b(cls, nq5Var.g());
    }

    public static a62 d(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return d(declaringClass).d(n8a.h(cls.getSimpleName()));
        }
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        mq5 mq5Var = new mq5(canonicalName);
        return new a62(mq5Var.b(), mq5Var.a.f());
    }

    public static boolean e(nq5 nq5Var, String str) {
        Integer numB;
        String str2 = nq5Var.a;
        if (wve.K(str2, str, false)) {
            String strSubstring = str2.substring(str.length());
            if (!zve.m0(strSubstring, '0') && (numB = vve.B(10, strSubstring)) != null && numB.intValue() >= 23) {
                return true;
            }
        }
        return false;
    }

    public static a62 f(mq5 mq5Var) {
        mq5Var.getClass();
        return h.get(mq5Var.a);
    }

    public static a62 g(nq5 nq5Var) {
        nq5Var.getClass();
        return (e(nq5Var, a) || e(nq5Var, c)) ? e : (e(nq5Var, b) || e(nq5Var, d)) ? g : i.get(nq5Var);
    }
}
