package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class jif {
    public static final float a(mif mifVar, int i) {
        if (i < 0) {
            return 0.0f;
        }
        kif kifVar = mifVar.a;
        q1a q1aVar = mifVar.b;
        if (kifVar.a.b.length() == 0) {
            return 0.0f;
        }
        int iMin = Math.min(q1aVar.d(i), Math.min(q1aVar.b - 1, q1aVar.f - 1));
        if (i > q1aVar.c(iMin, false)) {
            return 0.0f;
        }
        q1aVar.m(iMin);
        ArrayList arrayList = q1aVar.h;
        f3b f3bVar = (f3b) arrayList.get(ak2.n(iMin, arrayList));
        h80 h80Var = f3bVar.a;
        int i2 = iMin - f3bVar.d;
        hif hifVar = h80Var.d;
        return hifVar.e(i2) - hifVar.g(i2);
    }
}
