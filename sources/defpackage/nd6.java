package defpackage;

import defpackage.ax1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class nd6 extends ykg {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = da2.i;
    public List<? extends i6b> f;
    public boolean g;
    public m80 h;
    public Function1<? super ykg, j6g> i;
    public final a j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public static final class a extends mj8 implements Function1<ykg, j6g> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(ykg ykgVar) {
            ykg ykgVar2 = ykgVar;
            nd6.this.g(ykgVar2);
            Function1<? super ykg, j6g> function1 = nd6.this.i;
            if (function1 != null) {
                function1.invoke(ykgVar2);
            }
            return j6g.a;
        }
    }

    public nd6() {
        int i = gmg.a;
        this.f = zr4.a;
        this.g = true;
        this.j = new a();
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // defpackage.ykg
    public final void a(gb4 gb4Var) {
        if (this.s) {
            float[] fArrA = this.b;
            if (fArrA == null) {
                fArrA = if9.a();
                this.b = fArrA;
            } else {
                if9.d(fArrA);
            }
            if9.f(fArrA, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArrA.length >= 16) {
                double d = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrA[0];
                float f3 = fArrA[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrA[1];
                float f8 = fArrA[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = (f8 * fCos) + (f7 * f5);
                float f11 = fArrA[2];
                float f12 = fArrA[6];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = (f12 * fCos) + (f11 * f5);
                float f15 = fArrA[3];
                float f16 = fArrA[7];
                float f17 = (fSin * f16) + (fCos * f15);
                fArrA[0] = f4;
                fArrA[1] = f9;
                fArrA[2] = f13;
                fArrA[3] = f17;
                fArrA[4] = f6;
                fArrA[5] = f10;
                fArrA[6] = f14;
                fArrA[7] = (fCos * f16) + (f5 * f15);
            }
            float f18 = this.o;
            float f19 = this.p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f18;
                fArrA[1] = fArrA[1] * f18;
                fArrA[2] = fArrA[2] * f18;
                fArrA[3] = fArrA[3] * f18;
                fArrA[4] = fArrA[4] * f19;
                fArrA[5] = fArrA[5] * f19;
                fArrA[6] = fArrA[6] * f19;
                fArrA[7] = fArrA[7] * f19;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            if9.f(fArrA, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                m80 m80VarA = this.h;
                if (m80VarA == null) {
                    m80VarA = p80.a();
                    this.h = m80VarA;
                }
                k6b.b(this.f, m80VarA);
            }
            this.g = false;
        }
        ax1.b bVarW1 = gb4Var.w1();
        long jD = bVarW1.d();
        bVarW1.a().o();
        try {
            bx1 bx1Var = bVarW1.a;
            float[] fArr = this.b;
            if (fArr != null) {
                ((ax1.b) bx1Var.a).a().q(fArr);
            }
            m80 m80Var = this.h;
            if (!this.f.isEmpty() && m80Var != null) {
                bx1Var.b(m80Var);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ykg) arrayList.get(i)).a(gb4Var);
            }
            g7.k(bVarW1, jD);
        } catch (Throwable th) {
            g7.k(bVarW1, jD);
            throw th;
        }
    }

    @Override // defpackage.ykg
    public final Function1<ykg, j6g> b() {
        return this.i;
    }

    @Override // defpackage.ykg
    public final void d(a aVar) {
        this.i = aVar;
    }

    public final void e(int i, ykg ykgVar) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, ykgVar);
        } else {
            arrayList.add(ykgVar);
        }
        g(ykgVar);
        ykgVar.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = gmg.a;
            if (da2.h(j2) == da2.h(j) && da2.g(j2) == da2.g(j) && da2.e(j2) == da2.e(j)) {
                return;
            }
            this.d = false;
            this.e = da2.i;
        }
    }

    public final void g(ykg ykgVar) {
        if (!(ykgVar instanceof z5b)) {
            if (ykgVar instanceof nd6) {
                nd6 nd6Var = (nd6) ykgVar;
                if (nd6Var.d && this.d) {
                    f(nd6Var.e);
                    return;
                } else {
                    this.d = false;
                    this.e = da2.i;
                    return;
                }
            }
            return;
        }
        z5b z5bVar = (z5b) ykgVar;
        sn1 sn1Var = z5bVar.b;
        if (this.d && sn1Var != null) {
            if (sn1Var instanceof kne) {
                f(((kne) sn1Var).a);
            } else {
                this.d = false;
                this.e = da2.i;
            }
        }
        sn1 sn1Var2 = z5bVar.g;
        if (this.d && sn1Var2 != null) {
            if (sn1Var2 instanceof kne) {
                f(((kne) sn1Var2).a);
            } else {
                this.d = false;
                this.e = da2.i;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ykg ykgVar = (ykg) arrayList.get(i);
            sb.append("\t");
            sb.append(ykgVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
