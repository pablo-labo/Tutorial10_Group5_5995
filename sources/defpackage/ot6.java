package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes3.dex */
public final class ot6 implements wu5<fhd, b, Integer, j6g> {
    public final /* synthetic */ fv6 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ fv6 c;
    public final /* synthetic */ String d;

    public ot6(fv6 fv6Var, String str, fv6 fv6Var2, String str2) {
        this.a = fv6Var;
        this.b = str;
        this.c = fv6Var2;
        this.d = str2;
    }

    @Override // defpackage.wu5
    public final j6g q(fhd fhdVar, b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        fhdVar.getClass();
        if ((iIntValue & 17) == 16 && bVar2.i()) {
            bVar2.D();
        } else {
            gt6.a(this.a, this.b, this.c, this.d, bVar2, 0);
        }
        return j6g.a;
    }
}
