package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import defpackage.hl8;
import defpackage.z91;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ba1 implements vc4, z91.a {
    public float A;
    public BlurMaskFilter B;
    public ij8 C;
    public final Path a = new Path();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final ij8 d = new ij8(1);
    public final ij8 e;
    public final ij8 f;
    public final ij8 g;
    public final ij8 h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final Matrix n;
    public final j79 o;
    public final hl8 p;
    public final he9 q;
    public final di5 r;
    public ba1 s;
    public ba1 t;
    public List<ba1> u;
    public final ArrayList v;
    public final lrf w;
    public boolean x;
    public boolean y;
    public ij8 z;

    public ba1(j79 j79Var, hl8 hl8Var) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new ij8(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new ij8(mode2);
        ij8 ij8Var = new ij8(1);
        this.g = ij8Var;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        ij8 ij8Var2 = new ij8();
        ij8Var2.setXfermode(new PorterDuffXfermode(mode3));
        this.h = ij8Var2;
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Matrix();
        this.v = new ArrayList();
        this.x = true;
        this.A = 0.0f;
        this.o = j79Var;
        this.p = hl8Var;
        List<ge9> list = hl8Var.h;
        if (hl8Var.u == hl8.b.b) {
            ij8Var.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            ij8Var.setXfermode(new PorterDuffXfermode(mode));
        }
        rc0 rc0Var = hl8Var.i;
        rc0Var.getClass();
        lrf lrfVar = new lrf(rc0Var);
        this.w = lrfVar;
        lrfVar.b(this);
        if (list != null && !list.isEmpty()) {
            he9 he9Var = new he9(list);
            this.q = he9Var;
            Iterator it = he9Var.a.iterator();
            while (it.hasNext()) {
                ((z91) it.next()).a(this);
            }
            for (z91<?, ?> z91Var : this.q.b) {
                f(z91Var);
                z91Var.a(this);
            }
        }
        hl8 hl8Var2 = this.p;
        if (hl8Var2.t.isEmpty()) {
            if (true != this.x) {
                this.x = true;
                this.o.invalidateSelf();
                return;
            }
            return;
        }
        di5 di5Var = new di5(hl8Var2.t);
        this.r = di5Var;
        di5Var.b = true;
        di5Var.a(new z91.a() { // from class: aa1
            @Override // z91.a
            public final void a() {
                ba1 ba1Var = this.a;
                boolean z = ba1Var.r.j() == 1.0f;
                if (z != ba1Var.x) {
                    ba1Var.x = z;
                    ba1Var.o.invalidateSelf();
                }
            }
        });
        boolean z = this.r.e().floatValue() == 1.0f;
        if (z != this.x) {
            this.x = z;
            this.o.invalidateSelf();
        }
        f(this.r);
    }

    @Override // z91.a
    public final void a() {
        this.o.invalidateSelf();
    }

    @Override // defpackage.ks2
    public final void b(List<ks2> list, List<ks2> list2) {
    }

    @Override // defpackage.vc4
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        i();
        Matrix matrix2 = this.n;
        matrix2.set(matrix);
        if (z) {
            List<ba1> list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(this.u.get(size).w.d());
                }
            } else {
                ba1 ba1Var = this.t;
                if (ba1Var != null) {
                    matrix2.preConcat(ba1Var.w.d());
                }
            }
        }
        matrix2.preConcat(this.w.d());
    }

    public final void f(z91<?, ?> z91Var) {
        if (z91Var == null) {
            return;
        }
        this.v.add(z91Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0111  */
    @Override // defpackage.vc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(android.graphics.Canvas r22, android.graphics.Matrix r23, int r24, defpackage.hd4 r25) {
        /*
            Method dump skipped, instruction units count: 988
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba1.h(android.graphics.Canvas, android.graphics.Matrix, int, hd4):void");
    }

    public final void i() {
        if (this.u != null) {
            return;
        }
        if (this.t == null) {
            this.u = Collections.EMPTY_LIST;
            return;
        }
        this.u = new ArrayList();
        for (ba1 ba1Var = this.t; ba1Var != null; ba1Var = ba1Var.t) {
            this.u.add(ba1Var);
        }
    }

    public final void j(Canvas canvas) {
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
    }

    public abstract void k(Canvas canvas, Matrix matrix, int i, hd4 hd4Var);

    public v l() {
        return this.p.w;
    }

    public final boolean m() {
        he9 he9Var = this.q;
        return (he9Var == null || he9Var.a.isEmpty()) ? false : true;
    }

    public final void n() {
        b8b b8bVar = this.o.a.a;
        String str = this.p.c;
        HashMap map = b8bVar.a;
    }

    public void o(boolean z) {
        if (z && this.z == null) {
            this.z = new ij8();
        }
        this.y = z;
    }

    public void p(float f) {
        lrf lrfVar = this.w;
        z91<Integer, Integer> z91Var = lrfVar.j;
        if (z91Var != null) {
            z91Var.h(f);
        }
        z91<?, Float> z91Var2 = lrfVar.m;
        if (z91Var2 != null) {
            z91Var2.h(f);
        }
        z91<?, Float> z91Var3 = lrfVar.n;
        if (z91Var3 != null) {
            z91Var3.h(f);
        }
        z91<PointF, PointF> z91Var4 = lrfVar.f;
        if (z91Var4 != null) {
            z91Var4.h(f);
        }
        z91<?, PointF> z91Var5 = lrfVar.g;
        if (z91Var5 != null) {
            z91Var5.h(f);
        }
        z91<bnd, bnd> z91Var6 = lrfVar.h;
        if (z91Var6 != null) {
            z91Var6.h(f);
        }
        z91<Float, Float> z91Var7 = lrfVar.i;
        if (z91Var7 != null) {
            z91Var7.h(f);
        }
        di5 di5Var = lrfVar.k;
        if (di5Var != null) {
            di5Var.h(f);
        }
        di5 di5Var2 = lrfVar.l;
        if (di5Var2 != null) {
            di5Var2.h(f);
        }
        int i = 0;
        he9 he9Var = this.q;
        if (he9Var != null) {
            ArrayList arrayList = he9Var.a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((z91) arrayList.get(i2)).h(f);
            }
        }
        di5 di5Var3 = this.r;
        if (di5Var3 != null) {
            di5Var3.h(f);
        }
        ba1 ba1Var = this.s;
        if (ba1Var != null) {
            ba1Var.p(f);
        }
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i >= arrayList2.size()) {
                return;
            }
            ((z91) arrayList2.get(i)).h(f);
            i++;
        }
    }
}
