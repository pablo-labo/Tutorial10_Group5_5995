package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes.dex */
public final class cn3 implements mp4 {
    public static final cn3 a = new cn3();

    @Override // defpackage.mp4
    public final long a(long j, float f, b bVar, int i) {
        bVar.L(-1687113661);
        kb2 kb2Var = (kb2) bVar.M(lb2.a);
        if (Float.compare(f, 0.0f) <= 0 || kb2Var.g()) {
            bVar.L(-1095440862);
            bVar.F();
        } else {
            bVar.L(-1095579370);
            jte jteVar = np4.a;
            j = pnb.x(da2.b(lb2.b(j, bVar), ((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f), j);
            bVar.F();
        }
        bVar.F();
        return j;
    }
}
