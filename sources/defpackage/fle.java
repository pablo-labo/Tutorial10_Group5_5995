package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes.dex */
public final class fle implements wu5<fhd, b, Integer, j6g> {
    public final /* synthetic */ String a;

    public fle(String str) {
        this.a = str;
    }

    @Override // defpackage.wu5
    public final j6g q(fhd fhdVar, b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
            fif.b(this.a, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar2, 0, 0, 131070);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
