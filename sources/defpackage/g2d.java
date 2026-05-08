package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import defpackage.z91;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class g2d implements vc4, a6b, hd6, z91.a, ks2 {
    public final Matrix a = new Matrix();
    public final Path b = new Path();
    public final j79 c;
    public final ba1 d;
    public final boolean e;
    public final di5 f;
    public final di5 g;
    public final lrf h;
    public ts2 i;

    public g2d(j79 j79Var, ba1 ba1Var, f2d f2dVar) {
        this.c = j79Var;
        this.d = ba1Var;
        this.e = f2dVar.e;
        di5 di5VarT = f2dVar.b.t();
        this.f = di5VarT;
        ba1Var.f(di5VarT);
        di5VarT.a(this);
        di5 di5VarT2 = f2dVar.c.t();
        this.g = di5VarT2;
        ba1Var.f(di5VarT2);
        di5VarT2.a(this);
        rc0 rc0Var = f2dVar.d;
        rc0Var.getClass();
        lrf lrfVar = new lrf(rc0Var);
        this.h = lrfVar;
        lrfVar.a(ba1Var);
        lrfVar.b(this);
    }

    @Override // z91.a
    public final void a() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.ks2
    public final void b(List<ks2> list, List<ks2> list2) {
        this.i.b(list, list2);
    }

    @Override // defpackage.a6b
    public final Path c() {
        Path pathC = this.i.c();
        Path path = this.b;
        path.reset();
        float fFloatValue = this.f.e().floatValue();
        float fFloatValue2 = this.g.e().floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            Matrix matrixE = this.h.e(i + fFloatValue2);
            Matrix matrix = this.a;
            matrix.set(matrixE);
            path.addPath(pathC, matrix);
        }
        return path;
    }

    @Override // defpackage.vc4
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        this.i.e(rectF, matrix, z);
    }

    @Override // defpackage.hd6
    public final void f(ListIterator<ks2> listIterator) {
        if (this.i != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.i = new ts2(this.c, this.d, "Repeater", this.e, arrayList, null);
    }

    @Override // defpackage.vc4
    public final void h(Canvas canvas, Matrix matrix, int i, hd4 hd4Var) {
        float fFloatValue = this.f.e().floatValue();
        float fFloatValue2 = this.g.e().floatValue();
        lrf lrfVar = this.h;
        float fFloatValue3 = lrfVar.m.e().floatValue() / 100.0f;
        float fFloatValue4 = lrfVar.n.e().floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(lrfVar.e(f + fFloatValue2));
            this.i.h(canvas, matrix2, (int) (du9.e(fFloatValue3, fFloatValue4, f / fFloatValue) * i), hd4Var);
        }
    }
}
