package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes.dex */
public final class vhe {
    public static final vpe<da2> a = zd0.c(0.0f, null, 7);

    public static final ese a(long j, jf5 jf5Var, String str, b bVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            jf5Var = a;
        }
        jf5 jf5Var2 = jf5Var;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        boolean zK = bVar.K(da2.f(j));
        Object objV = bVar.v();
        if (zK || objV == b.a.a) {
            objV = (lvf) ib2.a.invoke(da2.f(j));
            bVar.p(objV);
        }
        return vc0.c(new da2(j), (lvf) objV, jf5Var2, null, str2, bVar, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }
}
