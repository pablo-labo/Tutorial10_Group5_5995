package defpackage;

import defpackage.in9;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public final class s14 extends v4 implements g14 {
    public final k5c Y;
    public final o8a Z;
    public final hyf a0;
    public final cng b0;
    public final c14 c0;
    public mge d0;
    public mge e0;
    public List<? extends rxf> f0;
    public mge g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s14(aue aueVar, aj3 aj3Var, lf0 lf0Var, n8a n8aVar, e04 e04Var, k5c k5cVar, o8a o8aVar, hyf hyfVar, cng cngVar, c14 c14Var) {
        super(aueVar, aj3Var, lf0Var, n8aVar, e04Var);
        aueVar.getClass();
        aj3Var.getClass();
        e04Var.getClass();
        k5cVar.getClass();
        o8aVar.getClass();
        hyfVar.getClass();
        cngVar.getClass();
        this.Y = k5cVar;
        this.Z = o8aVar;
        this.a0 = hyfVar;
        this.b0 = cngVar;
        this.c0 = c14Var;
    }

    @Override // defpackage.g14
    public final hyf D() {
        return this.a0;
    }

    @Override // defpackage.zvf
    public final mge F() {
        mge mgeVar = this.e0;
        if (mgeVar != null) {
            return mgeVar;
        }
        wl7.g("expandedType");
        throw null;
    }

    @Override // defpackage.g14
    public final o8a I() {
        return this.Z;
    }

    @Override // defpackage.g14
    public final c14 J() {
        return this.c0;
    }

    @Override // defpackage.v4
    public final List<rxf> L0() {
        List list = this.f0;
        if (list != null) {
            return list;
        }
        wl7.g("typeConstructorParameters");
        throw null;
    }

    public final void M0(List<? extends rxf> list, mge mgeVar, mge mgeVar2) {
        in9 in9VarW;
        mgeVar.getClass();
        mgeVar2.getClass();
        this.V = list;
        this.d0 = mgeVar;
        this.e0 = mgeVar2;
        this.f0 = oie.h(this);
        t52 t52VarR0 = r0();
        if (t52VarR0 == null || (in9VarW = t52VarR0.W()) == null) {
            in9VarW = in9.b.b;
        }
        t4 t4Var = new t4(this, 0);
        hx4 hx4Var = kyf.a;
        this.g0 = lx4.f(this) ? lx4.c(kx4.X, toString()) : kyf.l(j(), in9VarW, t4Var);
    }

    @Override // defpackage.qxe
    public final cj3 b(TypeSubstitutor typeSubstitutor) {
        typeSubstitutor.getClass();
        if (typeSubstitutor.a.e()) {
            return this;
        }
        aj3 aj3VarD = d();
        aj3VarD.getClass();
        lf0 annotations = getAnnotations();
        annotations.getClass();
        n8a name = getName();
        name.getClass();
        s14 s14Var = new s14(this.e, aj3VarD, annotations, name, this.f, this.Y, this.Z, this.a0, this.b0, this.c0);
        List<rxf> listP = p();
        mge mgeVarT0 = t0();
        ylg ylgVar = ylg.INVARIANT;
        s14Var.M0(listP, dyf.a(typeSubstitutor.h(mgeVarT0, ylgVar)), dyf.a(typeSubstitutor.h(F(), ylgVar)));
        return s14Var;
    }

    @Override // defpackage.g14
    public final rp9 f0() {
        return this.Y;
    }

    @Override // defpackage.v62
    public final mge o() {
        mge mgeVar = this.g0;
        if (mgeVar != null) {
            return mgeVar;
        }
        wl7.g("defaultTypeImpl");
        throw null;
    }

    @Override // defpackage.zvf
    public final t52 r0() {
        if (pnb.D(F())) {
            return null;
        }
        v62 v62VarD = F().M0().d();
        if (v62VarD instanceof t52) {
            return (t52) v62VarD;
        }
        return null;
    }

    @Override // defpackage.zvf
    public final mge t0() {
        mge mgeVar = this.d0;
        if (mgeVar != null) {
            return mgeVar;
        }
        wl7.g("underlyingType");
        throw null;
    }
}
