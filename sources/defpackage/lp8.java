package defpackage;

import defpackage.gj3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class lp8 extends vp8 {
    public final nv7 n;
    public final hp8 o;
    public final sma<Set<String>> p;
    public final on9<a, t52> q;

    public static final class a {
        public final n8a a;
        public final hvc b;

        public a(n8a n8aVar, hvc hvcVar) {
            n8aVar.getClass();
            this.a = n8aVar;
            this.b = hvcVar;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return wl7.b(this.a, ((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public static abstract class b {

        public static final class a extends b {
            public final t52 a;

            public a(t52 t52Var) {
                this.a = t52Var;
            }
        }

        /* JADX INFO: renamed from: lp8$b$b, reason: collision with other inner class name */
        public static final class C0308b extends b {
            public static final C0308b a = new C0308b();
        }

        public static final class c extends b {
            public static final c a = new c();
        }
    }

    public lp8(mp8 mp8Var, nv7 nv7Var, hp8 hp8Var) {
        super(null, mp8Var);
        this.n = nv7Var;
        this.o = hp8Var;
        aue aueVar = mp8Var.a.a;
        this.p = aueVar.e(new hu7(mp8Var, this, 1));
        this.q = aueVar.d(new kp8(this, mp8Var));
    }

    @Override // defpackage.qp8, defpackage.jn9, defpackage.in9
    public final Collection b(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        return zr4.a;
    }

    @Override // defpackage.jn9, defpackage.z4d
    public final v62 d(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        diaVar.getClass();
        return v(n8aVar, null);
    }

    @Override // defpackage.qp8, defpackage.jn9, defpackage.z4d
    public final Collection<aj3> f(lz3 lz3Var, Function1<? super n8a, Boolean> function1) {
        lz3Var.getClass();
        if (!lz3Var.a(lz3.l | lz3.e)) {
            return zr4.a;
        }
        Collection<aj3> collectionInvoke = this.d.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionInvoke) {
            aj3 aj3Var = (aj3) obj;
            if (aj3Var instanceof t52) {
                n8a name = ((t52) aj3Var).getName();
                name.getClass();
                if (function1.invoke(name).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.qp8
    public final Set<n8a> h(lz3 lz3Var, Function1<? super n8a, Boolean> function1) {
        lz3Var.getClass();
        if (!lz3Var.a(lz3.e)) {
            return is4.a;
        }
        Set<String> setInvoke = this.p.invoke();
        if (setInvoke == null) {
            if (function1 == null) {
                function1 = uv5.b;
            }
            this.n.n(function1);
            return new LinkedHashSet();
        }
        HashSet hashSet = new HashSet();
        Iterator<T> it = setInvoke.iterator();
        while (it.hasNext()) {
            hashSet.add(n8a.h((String) it.next()));
        }
        return hashSet;
    }

    @Override // defpackage.qp8
    public final Set i(lz3 lz3Var, zz3 zz3Var) {
        lz3Var.getClass();
        return is4.a;
    }

    @Override // defpackage.qp8
    public final gj3 k() {
        return gj3.a.a;
    }

    @Override // defpackage.qp8
    public final void m(LinkedHashSet linkedHashSet, n8a n8aVar) {
        n8aVar.getClass();
    }

    @Override // defpackage.qp8
    public final Set o(lz3 lz3Var) {
        lz3Var.getClass();
        return is4.a;
    }

    @Override // defpackage.qp8
    public final aj3 q() {
        return this.o;
    }

    public final t52 v(n8a n8aVar, hvc hvcVar) {
        n8a n8aVar2 = toe.a;
        n8aVar.getClass();
        String strC = n8aVar.c();
        strC.getClass();
        if (strC.length() <= 0 || n8aVar.b) {
            return null;
        }
        Set<String> setInvoke = this.p.invoke();
        if (hvcVar == null && setInvoke != null && !setInvoke.contains(n8aVar.c())) {
            return null;
        }
        return this.q.invoke(new a(n8aVar, hvcVar));
    }

    public final us9 w() {
        this.b.a.d.c().c.getClass();
        return us9.g;
    }
}
