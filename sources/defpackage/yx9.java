package defpackage;

import defpackage.j29;
import defpackage.lf0;
import defpackage.xya;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;

/* JADX INFO: loaded from: classes3.dex */
public final class yx9 extends bj3 implements xx9 {
    public ze4 V;
    public nya W;
    public final boolean X;
    public final nn9<mq5, wya> Y;
    public final d2f Z;
    public final j29 c;
    public final ei8 d;
    public final Map<nfa, Object> e;
    public final xya f;

    public yx9() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx9(n8a n8aVar, j29 j29Var, ei8 ei8Var, int i) {
        super(lf0.a.a, n8aVar);
        n8aVar.getClass();
        this.c = j29Var;
        this.d = ei8Var;
        if (!n8aVar.b) {
            akb.o(n8aVar, "Module name must be special: ");
            throw null;
        }
        this.e = bs4.a;
        xya.a.getClass();
        xya xyaVar = (xya) k0(xya.a.b);
        this.f = xyaVar == null ? xya.b.b : xyaVar;
        this.X = true;
        int i2 = 2;
        this.Y = j29Var.g(new if0(this, i2));
        this.Z = new d2f(new ce8(this, i2));
    }

    public final void K0() {
        if (this.X) {
            return;
        }
        dm7 dm7Var = (dm7) k0(yid.c);
        if (dm7Var != null) {
            dm7Var.a();
        } else {
            throw new InvalidModuleException("Accessing invalid module descriptor " + this);
        }
    }

    @Override // defpackage.xx9
    public final wya S(mq5 mq5Var) {
        mq5Var.getClass();
        K0();
        return (wya) ((j29.k) this.Y).invoke(mq5Var);
    }

    @Override // defpackage.aj3
    public final aj3 d() {
        return null;
    }

    @Override // defpackage.xx9
    public final <T> T k0(nfa nfaVar) {
        nfaVar.getClass();
        T t = (T) this.e.get(nfaVar);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // defpackage.xx9
    public final ei8 l() {
        return this.d;
    }

    @Override // defpackage.aj3
    public final <R, D> R o0(ej3<R, D> ej3Var, D d) {
        return (R) ej3Var.f(this, d);
    }

    @Override // defpackage.xx9
    public final Collection<mq5> q(mq5 mq5Var, Function1<? super n8a, Boolean> function1) {
        mq5Var.getClass();
        K0();
        K0();
        return ((zl2) this.Z.getValue()).q(mq5Var, function1);
    }

    @Override // defpackage.bj3
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(bj3.G0(this));
        if (!this.X) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        nya nyaVar = this.W;
        sb.append(nyaVar != null ? nyaVar.getClass().getSimpleName() : null);
        return sb.toString();
    }

    @Override // defpackage.xx9
    public final boolean w(xx9 xx9Var) {
        xx9Var.getClass();
        if (this == xx9Var) {
            return true;
        }
        this.V.getClass();
        if (z92.I0(is4.a, xx9Var)) {
            return true;
        }
        y0();
        return xx9Var.y0().contains(this);
    }

    @Override // defpackage.xx9
    public final List<xx9> y0() {
        if (this.V != null) {
            return zr4.a;
        }
        String str = getName().a;
        str.getClass();
        ja.p("Dependencies of module ", str, " were not set");
        return null;
    }
}
