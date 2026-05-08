package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes3.dex */
public final class lt6 implements wu5<fhd, b, Integer, j6g> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ fv6 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ fv6 d;
    public final /* synthetic */ String e;

    public lt6(boolean z, fv6 fv6Var, String str, fv6 fv6Var2, String str2) {
        this.a = z;
        this.b = fv6Var;
        this.c = str;
        this.d = fv6Var2;
        this.e = str2;
    }

    @Override // defpackage.wu5
    public final j6g q(fhd fhdVar, b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        fhdVar.getClass();
        if ((iIntValue & 17) == 16 && bVar2.i()) {
            bVar2.D();
        } else {
            gt6.p(this.a, false, bh2.c(1061200845, new kt6(this.b, this.c, this.d, this.e), bVar2), bVar2, 432, 0);
        }
        return j6g.a;
    }
}
