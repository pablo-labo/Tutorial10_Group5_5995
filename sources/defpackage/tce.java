package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import defpackage.uce;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class tce extends uce.f {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Matrix c;

    public tce(ArrayList arrayList, Matrix matrix) {
        this.b = arrayList;
        this.c = matrix;
    }

    @Override // uce.f
    public final void a(Matrix matrix, zbe zbeVar, int i, Canvas canvas) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((uce.f) it.next()).a(this.c, zbeVar, i, canvas);
        }
    }
}
