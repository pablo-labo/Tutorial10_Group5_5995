package defpackage;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class ax1 implements gb4 {
    public final a a;
    public final b b;
    public f80 c;
    public f80 d;

    public static final class a {
        public iy3 a;
        public vl8 b;
        public ww1 c;
        public long d;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && this.b == aVar.b && wl7.b(this.c, aVar.c) && kie.a(this.d, aVar.d);
        }

        public final int hashCode() {
            return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) kie.f(this.d)) + ')';
        }
    }

    public static final class b {
        public final bx1 a = new bx1(this);
        public xc6 b;

        public b() {
        }

        public final ww1 a() {
            return ax1.this.a.c;
        }

        public final iy3 b() {
            return ax1.this.a.a;
        }

        public final vl8 c() {
            return ax1.this.a.b;
        }

        public final long d() {
            return ax1.this.a.d;
        }

        public final void e(ww1 ww1Var) {
            ax1.this.a.c = ww1Var;
        }

        public final void f(iy3 iy3Var) {
            ax1.this.a.a = iy3Var;
        }

        public final void g(vl8 vl8Var) {
            ax1.this.a.b = vl8Var;
        }

        public final void h(long j) {
            ax1.this.a.d = j;
        }
    }

    public ax1() {
        jy3 jy3Var = pyd.X;
        a aVar = new a();
        aVar.a = jy3Var;
        aVar.b = vl8.a;
        aVar.c = tr4.a;
        aVar.d = 0L;
        this.a = aVar;
        this.b = new b();
    }

    public static u2b d(ax1 ax1Var, long j, ib4 ib4Var, float f, ga2 ga2Var, int i) {
        u2b u2bVarK = ax1Var.k(ib4Var);
        if (f != 1.0f) {
            j = da2.b(j, da2.d(j) * f);
        }
        f80 f80Var = (f80) u2bVarK;
        if (!da2.c(f80Var.c(), j)) {
            f80Var.d(j);
        }
        if (f80Var.c != null) {
            f80Var.f(null);
        }
        if (!wl7.b(f80Var.d, ga2Var)) {
            f80Var.k(ga2Var);
        }
        if (f80Var.b != i) {
            f80Var.j(i);
        }
        if (f80Var.a.isFilterBitmap()) {
            return u2bVarK;
        }
        f80Var.l(1);
        return u2bVarK;
    }

    @Override // defpackage.gb4
    public final void B0(sn1 sn1Var, long j, long j2, float f, ib4 ib4Var) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.a.c.t(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i2), g(sn1Var, ib4Var, f, null, 3, 1));
    }

    @Override // defpackage.gb4
    public final void D(v5b v5bVar, long j, float f, ib4 ib4Var) {
        this.a.c.m(v5bVar, d(this, j, ib4Var, f, null, 3));
    }

    @Override // defpackage.gb4
    public final void D1(long j, long j2, long j3, float f, ib4 ib4Var, ga2 ga2Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.a.c.t(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), d(this, j, ib4Var, f, ga2Var, i));
    }

    @Override // defpackage.gb4
    public final void Q(long j, float f, float f2, long j2, long j3, float f3, ib4 ib4Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.a.c.b(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, d(this, j, ib4Var, f3, null, 3));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.gb4
    public final void W(long j, long j2, long j3, float f, int i) {
        ww1 ww1Var = this.a.c;
        f80 f80VarA = this.d;
        if (f80VarA == null) {
            f80VarA = g80.a();
            f80VarA.r(1);
            this.d = f80VarA;
        }
        Paint paint = f80VarA.a;
        if (!da2.c(f80VarA.c(), j)) {
            f80VarA.d(j);
        }
        if (f80VarA.c != null) {
            f80VarA.f(null);
        }
        if (!wl7.b(f80VarA.d, null)) {
            f80VarA.k(null);
        }
        if (f80VarA.b != 3) {
            f80VarA.j(3);
        }
        if (paint.getStrokeWidth() != f) {
            f80VarA.q(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            f80VarA.p(4.0f);
        }
        if (f80VarA.h() != i) {
            f80VarA.n(i);
        }
        if (f80VarA.i() != 0) {
            f80VarA.o(0);
        }
        if (!wl7.b(f80VarA.e, null)) {
            f80VarA.m(null);
        }
        if (!paint.isFilterBitmap()) {
            f80VarA.l(1);
        }
        ww1Var.k(j2, j3, f80VarA);
    }

    @Override // defpackage.gb4
    public final void X0(m07 m07Var, long j, long j2, long j3, long j4, float f, ib4 ib4Var, ga2 ga2Var, int i, int i2) {
        this.a.c.d(m07Var, j, j2, j3, j4, g(null, ib4Var, f, ga2Var, i, i2));
    }

    public final u2b g(sn1 sn1Var, ib4 ib4Var, float f, ga2 ga2Var, int i, int i2) {
        u2b u2bVarK = k(ib4Var);
        if (sn1Var != null) {
            sn1Var.a(f, c(), u2bVarK);
        } else {
            f80 f80Var = (f80) u2bVarK;
            if (f80Var.c != null) {
                f80Var.f(null);
            }
            long jC = f80Var.c();
            long j = da2.b;
            if (!da2.c(jC, j)) {
                f80Var.d(j);
            }
            if (f80Var.a() != f) {
                f80Var.b(f);
            }
        }
        f80 f80Var2 = (f80) u2bVarK;
        if (!wl7.b(f80Var2.d, ga2Var)) {
            f80Var2.k(ga2Var);
        }
        if (f80Var2.b != i) {
            f80Var2.j(i);
        }
        if (f80Var2.a.isFilterBitmap() == i2) {
            return u2bVarK;
        }
        f80Var2.l(i2);
        return u2bVarK;
    }

    @Override // defpackage.iy3
    public final float getDensity() {
        return this.a.a.getDensity();
    }

    @Override // defpackage.gb4
    public final vl8 getLayoutDirection() {
        return this.a.b;
    }

    @Override // defpackage.gb4
    public final void h1(long j, float f, long j2, ib4 ib4Var) {
        this.a.c.s(f, j2, d(this, j, ib4Var, 1.0f, null, 3));
    }

    public final u2b k(ib4 ib4Var) {
        if (wl7.b(ib4Var, ib5.a)) {
            f80 f80Var = this.c;
            if (f80Var != null) {
                return f80Var;
            }
            f80 f80VarA = g80.a();
            f80VarA.r(0);
            this.c = f80VarA;
            return f80VarA;
        }
        if (!(ib4Var instanceof bwe)) {
            l.g();
            return null;
        }
        f80 f80VarA2 = this.d;
        if (f80VarA2 == null) {
            f80VarA2 = g80.a();
            f80VarA2.r(1);
            this.d = f80VarA2;
        }
        Paint paint = f80VarA2.a;
        float strokeWidth = paint.getStrokeWidth();
        bwe bweVar = (bwe) ib4Var;
        n80 n80Var = bweVar.e;
        float f = bweVar.a;
        if (strokeWidth != f) {
            f80VarA2.q(f);
        }
        int iH = f80VarA2.h();
        int i = bweVar.c;
        if (iH != i) {
            f80VarA2.n(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = bweVar.b;
        if (strokeMiter != f2) {
            f80VarA2.p(f2);
        }
        int i2 = f80VarA2.i();
        int i3 = bweVar.d;
        if (i2 != i3) {
            f80VarA2.o(i3);
        }
        if (!wl7.b(f80VarA2.e, n80Var)) {
            f80VarA2.m(n80Var);
        }
        return f80VarA2;
    }

    @Override // defpackage.gb4
    public final void m1(v5b v5bVar, sn1 sn1Var, float f, ib4 ib4Var, int i) {
        this.a.c.m(v5bVar, g(sn1Var, ib4Var, f, null, i, 1));
    }

    @Override // defpackage.gb4
    public final void o0(m07 m07Var, ib4 ib4Var, ih1 ih1Var) {
        this.a.c.g(m07Var, g(null, ib4Var, 1.0f, ih1Var, 3, 1));
    }

    @Override // defpackage.gb4
    public final void p0(long j, long j2, long j3, long j4, ib4 ib4Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.a.c.l(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), d(this, j, ib4Var, 1.0f, null, 3));
    }

    @Override // defpackage.iy3
    public final float p1() {
        return this.a.a.p1();
    }

    @Override // defpackage.gb4
    public final void q1(sn1 sn1Var, long j, long j2, long j3, float f, ib4 ib4Var) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.a.c.l(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), g(sn1Var, ib4Var, f, null, 3, 1));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.gb4
    public final void s1(kne kneVar, long j, long j2, float f, float f2) {
        ww1 ww1Var = this.a.c;
        f80 f80VarA = this.d;
        if (f80VarA == null) {
            f80VarA = g80.a();
            f80VarA.r(1);
            this.d = f80VarA;
        }
        Paint paint = f80VarA.a;
        kneVar.a(f2, c(), f80VarA);
        if (!wl7.b(f80VarA.d, null)) {
            f80VarA.k(null);
        }
        if (f80VarA.b != 3) {
            f80VarA.j(3);
        }
        if (paint.getStrokeWidth() != f) {
            f80VarA.q(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            f80VarA.p(4.0f);
        }
        if (f80VarA.h() != 0) {
            f80VarA.n(0);
        }
        if (f80VarA.i() != 0) {
            f80VarA.o(0);
        }
        if (!wl7.b(f80VarA.e, null)) {
            f80VarA.m(null);
        }
        if (!paint.isFilterBitmap()) {
            f80VarA.l(1);
        }
        ww1Var.k(j, j2, f80VarA);
    }

    @Override // defpackage.gb4
    public final b w1() {
        return this.b;
    }
}
