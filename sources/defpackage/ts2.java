package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import defpackage.noa;
import defpackage.z91;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ts2 implements vc4, a6b, z91.a {
    public final noa.a a;
    public final RectF b;
    public final noa c;
    public final Matrix d;
    public final Path e;
    public final RectF f;
    public final boolean g;
    public final ArrayList h;
    public final j79 i;
    public ArrayList j;
    public final lrf k;

    public ts2(j79 j79Var, ba1 ba1Var, String str, boolean z, ArrayList arrayList, rc0 rc0Var) {
        this.a = new noa.a();
        this.b = new RectF();
        this.c = new noa();
        this.d = new Matrix();
        this.e = new Path();
        this.f = new RectF();
        this.i = j79Var;
        this.g = z;
        this.h = arrayList;
        if (rc0Var != null) {
            lrf lrfVar = new lrf(rc0Var);
            this.k = lrfVar;
            lrfVar.a(ba1Var);
            lrfVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ks2 ks2Var = (ks2) arrayList.get(size);
            if (ks2Var instanceof hd6) {
                arrayList2.add((hd6) ks2Var);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((hd6) arrayList2.get(size2)).f(arrayList.listIterator(arrayList.size()));
        }
    }

    @Override // z91.a
    public final void a() {
        this.i.invalidateSelf();
    }

    @Override // defpackage.ks2
    public final void b(List<ks2> list, List<ks2> list2) {
        int size = list.size();
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ks2 ks2Var = (ks2) arrayList.get(size2);
            ks2Var.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(ks2Var);
        }
    }

    @Override // defpackage.a6b
    public final Path c() {
        Matrix matrix = this.d;
        matrix.reset();
        lrf lrfVar = this.k;
        if (lrfVar != null) {
            matrix.set(lrfVar.d());
        }
        Path path = this.e;
        path.reset();
        if (!this.g) {
            ArrayList arrayList = this.h;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ks2 ks2Var = (ks2) arrayList.get(size);
                if (ks2Var instanceof a6b) {
                    path.addPath(((a6b) ks2Var).c(), matrix);
                }
            }
        }
        return path;
    }

    @Override // defpackage.vc4
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        lrf lrfVar = this.k;
        if (lrfVar != null) {
            matrix2.preConcat(lrfVar.d());
        }
        RectF rectF2 = this.f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ks2 ks2Var = (ks2) arrayList.get(size);
            if (ks2Var instanceof vc4) {
                ((vc4) ks2Var).e(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    public final List<a6b> f() {
        if (this.j == null) {
            this.j = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i >= arrayList.size()) {
                    break;
                }
                ks2 ks2Var = (ks2) arrayList.get(i);
                if (ks2Var instanceof a6b) {
                    this.j.add((a6b) ks2Var);
                }
                i++;
            }
        }
        return this.j;
    }

    @Override // defpackage.vc4
    public final void h(Canvas canvas, Matrix matrix, int i, hd4 hd4Var) {
        if (this.g) {
            return;
        }
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        lrf lrfVar = this.k;
        if (lrfVar != null) {
            matrix2.preConcat(lrfVar.d());
            i = (int) (((((lrfVar.j == null ? 100 : r1.e().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        j79 j79Var = this.i;
        boolean z = (j79Var.e0 && i() && i != 255) || (hd4Var != null && j79Var.f0 && i());
        int i2 = z ? 255 : i;
        noa noaVar = this.c;
        if (z) {
            RectF rectF = this.b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            e(rectF, matrix, true);
            noa.a aVar = this.a;
            aVar.a = i;
            if (hd4Var != null) {
                if (Color.alpha(hd4Var.d) > 0) {
                    aVar.b = hd4Var;
                } else {
                    aVar.b = null;
                }
                hd4Var = null;
            } else {
                aVar.b = null;
            }
            canvas = noaVar.e(canvas, rectF, aVar);
        } else if (hd4Var != null) {
            hd4 hd4Var2 = new hd4(hd4Var);
            hd4Var2.b(i2);
            hd4Var = hd4Var2;
        }
        ArrayList arrayList = this.h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof vc4) {
                ((vc4) obj).h(canvas, matrix2, i2, hd4Var);
            }
        }
        if (z) {
            noaVar.c();
        }
    }

    public final boolean i() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i) instanceof vc4) && (i2 = i2 + 1) >= 2) {
                return true;
            }
            i++;
        }
    }

    public ts2(j79 j79Var, ba1 ba1Var, nce nceVar, s69 s69Var) {
        rc0 rc0Var;
        String str = nceVar.a;
        boolean z = nceVar.c;
        List<ct2> list = nceVar.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            ks2 ks2VarA = list.get(i2).a(j79Var, s69Var, ba1Var);
            if (ks2VarA != null) {
                arrayList.add(ks2VarA);
            }
        }
        while (true) {
            if (i >= list.size()) {
                rc0Var = null;
                break;
            }
            ct2 ct2Var = list.get(i);
            if (ct2Var instanceof rc0) {
                rc0Var = (rc0) ct2Var;
                break;
            }
            i++;
        }
        this(j79Var, ba1Var, str, z, arrayList, rc0Var);
    }
}
