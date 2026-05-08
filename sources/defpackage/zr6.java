package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;

/* JADX INFO: loaded from: classes3.dex */
public final class zr6 implements wu5<fhd, b, Integer, j6g> {
    public final /* synthetic */ Integer a;
    public final /* synthetic */ String b;
    public final /* synthetic */ tjf c;

    public zr6(Integer num, String str, tjf tjfVar) {
        this.a = num;
        this.b = str;
        this.c = tjfVar;
    }

    @Override // defpackage.wu5
    public final j6g q(fhd fhdVar, b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        fhdVar.getClass();
        if ((iIntValue & 17) == 16 && bVar2.i()) {
            bVar2.D();
        } else {
            Integer num2 = this.a;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                cif.b(iIntValue2 <= 99 ? String.valueOf(iIntValue2) : "99+", f.a(e.a.b, this.b.concat("_Text")), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, this.c, bVar2, 0, 0, 65532);
            }
        }
        return j6g.a;
    }
}
