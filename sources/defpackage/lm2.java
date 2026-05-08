package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import defpackage.noa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lm2 extends ba1 {
    public final z91<Float, Float> D;
    public final ArrayList E;
    public final RectF F;
    public final RectF G;
    public final RectF H;
    public final noa I;
    public final noa.a J;
    public float K;
    public boolean L;
    public final kd4 M;

    public lm2(j79 j79Var, hl8 hl8Var, List<hl8> list, s69 s69Var) {
        int i;
        ba1 ba1Var;
        ba1 lm2Var;
        super(j79Var, hl8Var);
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new noa();
        this.J = new noa.a();
        this.L = true;
        dc0 dc0Var = hl8Var.s;
        if (dc0Var != null) {
            di5 di5VarT = dc0Var.t();
            this.D = di5VarT;
            f(di5VarT);
            this.D.a(this);
        } else {
            this.D = null;
        }
        r59 r59Var = new r59(s69Var.j.size());
        int size = list.size() - 1;
        ba1 ba1Var2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            hl8 hl8Var2 = list.get(size);
            int iOrdinal = hl8Var2.e.ordinal();
            if (iOrdinal == 0) {
                lm2Var = new lm2(j79Var, hl8Var2, (List) s69Var.c.get(hl8Var2.g), s69Var);
            } else if (iOrdinal == 1) {
                lm2Var = new lne(j79Var, hl8Var2);
            } else if (iOrdinal == 2) {
                lm2Var = new g17(j79Var, hl8Var2);
            } else if (iOrdinal == 3) {
                lm2Var = new hma(j79Var, hl8Var2);
            } else if (iOrdinal == 4) {
                lm2Var = new rce(j79Var, hl8Var2, this, s69Var);
            } else if (iOrdinal != 5) {
                a49.b("Unknown layer type " + hl8Var2.e);
                lm2Var = null;
            } else {
                lm2Var = new gif(j79Var, hl8Var2);
            }
            if (lm2Var != null) {
                r59Var.h(lm2Var, lm2Var.p.d);
                if (ba1Var2 != null) {
                    ba1Var2.s = lm2Var;
                    ba1Var2 = null;
                } else {
                    this.E.add(0, lm2Var);
                    int iOrdinal2 = hl8Var2.u.ordinal();
                    if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                        ba1Var2 = lm2Var;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < r59Var.j(); i++) {
            ba1 ba1Var3 = (ba1) r59Var.d(r59Var.g(i));
            if (ba1Var3 != null && (ba1Var = (ba1) r59Var.d(ba1Var3.p.f)) != null) {
                ba1Var3.t = ba1Var;
            }
        }
        id4 id4Var = this.p.x;
        if (id4Var != null) {
            this.M = new kd4(this, this, id4Var);
        }
    }

    @Override // defpackage.ba1, defpackage.vc4
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((ba1) arrayList.get(size)).e(rectF2, this.n, true);
            rectF.union(rectF2);
        }
    }

    @Override // defpackage.ba1
    public final void k(Canvas canvas, Matrix matrix, int i, hd4 hd4Var) {
        Canvas canvasE;
        boolean z = false;
        kd4 kd4Var = this.M;
        boolean z2 = (hd4Var == null && kd4Var == null) ? false : true;
        j79 j79Var = this.o;
        boolean z3 = j79Var.e0;
        ArrayList<ba1> arrayList = this.E;
        if ((z3 && arrayList.size() > 1 && i != 255) || (z2 && j79Var.f0)) {
            z = true;
        }
        int i2 = z ? 255 : i;
        if (kd4Var != null) {
            hd4Var = kd4Var.b(matrix, i2);
        }
        boolean z4 = this.L;
        hl8 hl8Var = this.p;
        RectF rectF = this.G;
        if (z4 || !"__container".equals(hl8Var.c)) {
            rectF.set(0.0f, 0.0f, hl8Var.o, hl8Var.p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            for (ba1 ba1Var : arrayList) {
                RectF rectF2 = this.H;
                ba1Var.e(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        noa noaVar = this.I;
        if (z) {
            noa.a aVar = this.J;
            aVar.b = null;
            aVar.a = i;
            if (hd4Var != null) {
                if (Color.alpha(hd4Var.d) > 0) {
                    aVar.b = hd4Var;
                } else {
                    aVar.b = null;
                }
                hd4Var = null;
            }
            canvasE = noaVar.e(canvas, rectF, aVar);
        } else {
            canvasE = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ba1) arrayList.get(size)).h(canvasE, matrix, i2, hd4Var);
            }
        }
        if (z) {
            noaVar.c();
        }
        canvas.restore();
    }

    @Override // defpackage.ba1
    public final void o(boolean z) {
        super.o(z);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((ba1) it.next()).o(z);
        }
    }

    @Override // defpackage.ba1
    public final void p(float f) {
        this.K = f;
        super.p(f);
        hl8 hl8Var = this.p;
        z91<Float, Float> z91Var = this.D;
        if (z91Var != null) {
            s69 s69Var = this.o.a;
            f = ((z91Var.e().floatValue() * hl8Var.b.n) - hl8Var.b.l) / ((s69Var.m - s69Var.l) + 0.01f);
        }
        if (z91Var == null) {
            float f2 = hl8Var.n;
            s69 s69Var2 = hl8Var.b;
            f -= f2 / (s69Var2.m - s69Var2.l);
        }
        if (hl8Var.m != 0.0f && !"__container".equals(hl8Var.c)) {
            f /= hl8Var.m;
        }
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((ba1) arrayList.get(size)).p(f);
        }
    }
}
