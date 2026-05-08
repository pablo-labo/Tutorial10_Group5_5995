package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes3.dex */
public final class dt6 implements wu5<fhd, b, Integer, j6g> {
    public final /* synthetic */ fv6 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public dt6(fv6 fv6Var, String str, String str2) {
        this.a = fv6Var;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.wu5
    public final j6g q(fhd fhdVar, b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        fhdVar.getClass();
        if ((iIntValue & 17) == 16 && bVar2.i()) {
            bVar2.D();
        } else {
            ev6.a(this.a, null, null, null, ((da2) bVar2.M(qs2.a)).a, this.b, this.c.concat("_Icon"), bVar2, 0, 14);
        }
        return j6g.a;
    }
}
