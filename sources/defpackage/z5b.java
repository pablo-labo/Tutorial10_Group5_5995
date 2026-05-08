package defpackage;

import android.graphics.PathMeasure;
import java.util.List;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes.dex */
public final class z5b extends ykg {
    public sn1 b;
    public float c = 1.0f;
    public List<? extends i6b> d;
    public float e;
    public float f;
    public sn1 g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public bwe q;
    public final m80 r;
    public m80 s;
    public final Lazy t;

    public static final class a extends mj8 implements gu5<h6b> {
        public static final a a = new a(0);

        @Override // defpackage.gu5
        public final h6b invoke() {
            return new o80(new PathMeasure());
        }
    }

    public z5b() {
        int i = gmg.a;
        this.d = zr4.a;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        m80 m80VarA = p80.a();
        this.r = m80VarA;
        this.s = m80VarA;
        this.t = boa.E(qt8.c, a.a);
    }

    @Override // defpackage.ykg
    public final void a(gb4 gb4Var) {
        bwe bweVar;
        if (this.n) {
            k6b.b(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        sn1 sn1Var = this.b;
        if (sn1Var != null) {
            gb4.i0(gb4Var, this.s, sn1Var, this.c, null, 56);
        }
        sn1 sn1Var2 = this.g;
        if (sn1Var2 != null) {
            bwe bweVar2 = this.q;
            if (this.o || bweVar2 == null) {
                bwe bweVar3 = new bwe(this.f, this.j, this.h, this.i, null, 16);
                this.q = bweVar3;
                this.o = false;
                bweVar = bweVar3;
            } else {
                bweVar = bweVar2;
            }
            gb4.i0(gb4Var, this.s, sn1Var2, this.e, bweVar, 48);
        }
    }

    public final void e() {
        float f = this.k;
        m80 m80Var = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = m80Var;
            return;
        }
        if (wl7.b(this.s, m80Var)) {
            this.s = p80.a();
        } else {
            int i = this.s.i();
            this.s.k();
            this.s.e(i);
        }
        Lazy lazy = this.t;
        ((h6b) lazy.getValue()).b(m80Var);
        float length = ((h6b) lazy.getValue()).getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((h6b) lazy.getValue()).a(f4, f5, this.s);
        } else {
            ((h6b) lazy.getValue()).a(f4, length, this.s);
            ((h6b) lazy.getValue()).a(0.0f, f5, this.s);
        }
    }

    public final String toString() {
        return this.r.toString();
    }
}
