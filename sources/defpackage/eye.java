package defpackage;

import android.util.SparseArray;
import defpackage.dye;

/* JADX INFO: loaded from: classes.dex */
public final class eye implements o55 {
    public final o55 a;
    public final dye.a b;
    public final SparseArray<gye> c = new SparseArray<>();
    public boolean d;

    public eye(o55 o55Var, dye.a aVar) {
        this.a = o55Var;
        this.b = aVar;
    }

    @Override // defpackage.o55
    public final void b(zxd zxdVar) {
        this.a.b(zxdVar);
    }

    @Override // defpackage.o55
    public final void m() {
        this.a.m();
        if (!this.d) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray<gye> sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            sparseArray.valueAt(i).i = true;
            i++;
        }
    }

    @Override // defpackage.o55
    public final zpf o(int i, int i2) {
        o55 o55Var = this.a;
        if (i2 != 3) {
            this.d = true;
            return o55Var.o(i, i2);
        }
        SparseArray<gye> sparseArray = this.c;
        gye gyeVar = sparseArray.get(i);
        if (gyeVar != null) {
            return gyeVar;
        }
        gye gyeVar2 = new gye(o55Var.o(i, i2), this.b);
        sparseArray.put(i, gyeVar2);
        return gyeVar2;
    }
}
