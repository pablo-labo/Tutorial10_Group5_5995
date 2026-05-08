package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;

/* JADX INFO: loaded from: classes3.dex */
public final class tw6 implements wu5<fhd, b, Integer, j6g> {
    public final /* synthetic */ String a;
    public final /* synthetic */ o97 b;
    public final /* synthetic */ String c;

    public tw6(String str, o97 o97Var, String str2) {
        this.a = str;
        this.b = o97Var;
        this.c = str2;
    }

    @Override // defpackage.wu5
    public final j6g q(fhd fhdVar, b bVar, Integer num) {
        fhd fhdVar2 = fhdVar;
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        fhdVar2.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= bVar2.K(fhdVar2) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && bVar2.i()) {
            bVar2.D();
        } else {
            e eVarA = f.a(fhdVar2.a(e.a.b, 1.0f), this.a.concat("_Title"));
            o97 o97Var = this.b;
            cif.b(this.c, eVarA, o97Var.c.a.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.e, 0L, 0L, o97Var.f.c, null, null, 0L, 0, 0L, null, null, 0, 16777211), bVar2, 0, 0, 65528);
        }
        return j6g.a;
    }
}
