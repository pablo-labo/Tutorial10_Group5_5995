package defpackage;

import androidx.media3.common.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zn3 implements ti6 {
    public static final int[] c = {8, 13, 11, 2, 0, 1, 7};
    public qq3 a;
    public boolean b;

    public static void a(int i, ArrayList arrayList) {
        if (bm7.N1(i, 0, c, 7) == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    public final a b(a aVar) {
        if (!this.b || !this.a.a(aVar)) {
            return aVar;
        }
        a.C0036a c0036aA = aVar.a();
        String str = aVar.k;
        c0036aA.m = st9.p("application/x-media3-cues");
        c0036aA.K = this.a.b(aVar);
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.n);
        sb.append(str != null ? " ".concat(str) : "");
        c0036aA.j = sb.toString();
        c0036aA.r = Long.MAX_VALUE;
        return new a(c0036aA);
    }
}
