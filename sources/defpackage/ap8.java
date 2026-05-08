package defpackage;

import defpackage.cqd;
import defpackage.d04;
import defpackage.du7;
import defpackage.yu7;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ap8 extends u52 implements pu7 {
    public static final Set<String> l0 = ut0.I0(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    public final mp8 V;
    public final hvc W;
    public final t52 X;
    public final mp8 Y;
    public final d2f Z;
    public final c62 a0;
    public final ax9 b0;
    public final i7 c0;
    public final boolean d0;
    public final a e0;
    public final gp8 f0;
    public final cqd<gp8> g0;
    public final oe7 h0;
    public final up8 i0;
    public final zo8 j0;
    public final fla<List<rxf>> k0;

    public final class a extends y0 {
        public final fla<List<rxf>> c;

        /* JADX WARN: Illegal instructions before constructor call */
        public a() {
            mp8 mp8Var = ap8.this.Y;
            super(mp8Var.a.a);
            this.c = mp8Var.a.a.f(new t14(ap8.this, 3));
        }

        @Override // defpackage.y0, defpackage.kwf
        public final v62 d() {
            return ap8.this;
        }

        @Override // defpackage.kwf
        public final boolean e() {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:102:0x0238  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x024a  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x024f  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0258  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x028b  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x0292  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x0084 A[EDGE_INSN: B:131:0x0084->B:16:0x0084 BREAK  A[LOOP:4: B:26:0x00a8->B:45:0x00d9], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01d1  */
        @Override // defpackage.a5
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.Collection<defpackage.ui8> g() {
            /*
                Method dump skipped, instruction units count: 675
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ap8.a.g():java.util.Collection");
        }

        @Override // defpackage.kwf
        public final List<rxf> getParameters() {
            return this.c.invoke();
        }

        @Override // defpackage.a5
        public final cze j() {
            return ap8.this.Y.a.m;
        }

        @Override // defpackage.y0
        /* JADX INFO: renamed from: p */
        public final t52 d() {
            return ap8.this;
        }

        public final String toString() {
            String strC = ap8.this.getName().c();
            strC.getClass();
            return strC;
        }
    }

    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ak2.i(b04.g((t52) t).a.a, b04.g((t52) t2).a.a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ap8(mp8 mp8Var, aj3 aj3Var, hvc hvcVar, t52 t52Var) throws IllegalAccessException, InvocationTargetException {
        mp8Var.getClass();
        aj3Var.getClass();
        hvcVar.getClass();
        sv7 sv7Var = mp8Var.a;
        super(sv7Var.a, aj3Var, hvcVar.getName(), sv7Var.j.a(hvcVar));
        this.V = mp8Var;
        this.W = hvcVar;
        this.X = t52Var;
        mp8 mp8VarI = boa.i(mp8Var, this, hvcVar, 4);
        this.Y = mp8VarI;
        sv7 sv7Var2 = mp8VarI.a;
        aue aueVar = sv7Var2.a;
        sv7Var2.g.getClass();
        this.Z = new d2f(new uv7(this, 3));
        this.a0 = hvcVar.w() ? c62.ANNOTATION_CLASS : hvcVar.y() ? c62.INTERFACE : hvcVar.x() ? c62.ENUM_CLASS : c62.CLASS;
        boolean zW = hvcVar.w();
        ax9 ax9Var = ax9.b;
        int i = 1;
        if (!zW && !hvcVar.x()) {
            boolean zA = hvcVar.A();
            boolean z = hvcVar.A() || hvcVar.isAbstract() || hvcVar.y();
            boolean zIsFinal = hvcVar.isFinal();
            ax9.a.getClass();
            if (zA) {
                ax9Var = ax9.c;
            } else if (z) {
                ax9Var = ax9.e;
            } else if (!zIsFinal) {
                ax9Var = ax9.d;
            }
        }
        this.b0 = ax9Var;
        this.c0 = hvcVar.getVisibility();
        this.d0 = (hvcVar.u() == null || hvcVar.b()) ? false : true;
        this.e0 = new a();
        gp8 gp8Var = new gp8(mp8VarI, this, hvcVar, t52Var != null, null);
        this.f0 = gp8Var;
        cqd.a aVar = cqd.e;
        bj8 bj8VarC = sv7Var2.u.c();
        sib sibVar = new sib(this, 2);
        aVar.getClass();
        aueVar.getClass();
        bj8VarC.getClass();
        this.g0 = new cqd<>(this, aueVar, sibVar, bj8VarC);
        this.h0 = new oe7(gp8Var);
        this.i0 = new up8(mp8VarI, hvcVar, this);
        this.j0 = ee3.v(mp8VarI, hvcVar);
        this.k0 = aueVar.f(new nf8(this, i));
    }

    @Override // defpackage.t52
    public final m52 C() {
        return null;
    }

    @Override // defpackage.t52
    public final boolean H0() {
        return false;
    }

    @Override // defpackage.tx9
    public final in9 K(bj8 bj8Var) {
        bj8Var.getClass();
        return (gp8) this.g0.a(bj8Var);
    }

    public final gp8 K0() {
        return (gp8) super.W();
    }

    @Override // defpackage.x0, defpackage.t52
    public final in9 T() {
        return this.h0;
    }

    @Override // defpackage.t52
    public final hlg<mge> U() {
        return null;
    }

    @Override // defpackage.x0, defpackage.t52
    public final in9 W() {
        return (gp8) super.W();
    }

    @Override // defpackage.zm9
    public final boolean X() {
        return false;
    }

    @Override // defpackage.t52
    public final boolean a0() {
        return false;
    }

    @Override // defpackage.t52
    public final boolean e0() {
        return false;
    }

    @Override // defpackage.t52
    public final c62 f() {
        return this.a0;
    }

    @Override // defpackage.ie0
    public final lf0 getAnnotations() {
        return this.j0;
    }

    @Override // defpackage.t52, defpackage.zm9, defpackage.fj3
    public final e04 getVisibility() {
        d04.d dVar = d04.a;
        i7 i7Var = this.c0;
        if (!wl7.b(i7Var, dVar) || this.W.u() != null) {
            return skg.a(i7Var);
        }
        yu7.a aVar = yu7.a;
        aVar.getClass();
        return aVar;
    }

    @Override // defpackage.zm9
    public final boolean i0() {
        return false;
    }

    @Override // defpackage.t52
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.v62
    public final kwf j() {
        return this.e0;
    }

    @Override // defpackage.t52
    public final Collection k() {
        return this.f0.q.invoke();
    }

    @Override // defpackage.t52
    public final in9 l0() {
        return this.i0;
    }

    @Override // defpackage.t52
    public final t52 m0() {
        return null;
    }

    @Override // defpackage.t52, defpackage.w62
    public final List<rxf> p() {
        return this.k0.invoke();
    }

    @Override // defpackage.t52, defpackage.zm9
    public final ax9 r() {
        return this.b0;
    }

    @Override // defpackage.t52
    public final boolean s() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Lazy Java class ");
        int i = b04.a;
        nq5 nq5VarG = yz3.g(this);
        nq5VarG.getClass();
        sb.append(nq5VarG);
        return sb.toString();
    }

    @Override // defpackage.t52
    public final Collection<t52> x() throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        r6e y92Var;
        if (this.b0 != ax9.c) {
            return zr4.a;
        }
        lw7 lw7VarA = wab.A(jyf.b, false, null, 7);
        Class<?> cls = this.W.a;
        cls.getClass();
        du7.a aVar = du7.a;
        if (aVar == null) {
            try {
                aVar = new du7.a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            } catch (NoSuchMethodException unused) {
                aVar = new du7.a(null, null, null, null);
            }
            du7.a = aVar;
        }
        Method method = aVar.b;
        if (method == null) {
            clsArr = null;
        } else {
            Object objInvoke = method.invoke(cls, null);
            objInvoke.getClass();
            clsArr = (Class[]) objInvoke;
        }
        if (clsArr != null) {
            ArrayList arrayList = new ArrayList(clsArr.length);
            for (Class cls2 : clsArr) {
                arrayList.add(new kvc(cls2));
            }
            y92Var = new y92(arrayList);
        } else {
            y92Var = hs4.a;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = y92Var.iterator();
        while (it.hasNext()) {
            v62 v62VarD = this.Y.d.d((tu7) it.next(), lw7VarA).M0().d();
            t52 t52Var = v62VarD instanceof t52 ? (t52) v62VarD : null;
            if (t52Var != null) {
                arrayList2.add(t52Var);
            }
        }
        return z92.p1(arrayList2, new b());
    }

    @Override // defpackage.w62
    public final boolean y() {
        return this.d0;
    }
}
