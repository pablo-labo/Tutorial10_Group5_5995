package defpackage;

import androidx.compose.runtime.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class su6 implements xu5<xo8, Integer, b, Integer, j6g> {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ c3a b;

    public su6(ArrayList arrayList, c3a c3aVar) {
        this.a = arrayList;
        this.b = c3aVar;
    }

    @Override // defpackage.xu5
    public final j6g j(xo8 xo8Var, Integer num, b bVar, Integer num2) {
        int iIntValue = num.intValue();
        b bVar2 = bVar;
        int iIntValue2 = num2.intValue();
        xo8Var.getClass();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= bVar2.d(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 145) == 144 && bVar2.i()) {
            bVar2.D();
        } else {
            ou6 ou6Var = (ou6) this.a.get(iIntValue);
            cs6.c(null, ou6Var.f, (4294967295L & ((long) Float.floatToRawIntBits(4.0f))) | (((long) Float.floatToRawIntBits(-4.0f)) << 32), "null_Badge", bh2.c(1080194836, new ru6(ou6Var, iIntValue, this.b), bVar2), bVar2, 24960, 1);
        }
        return j6g.a;
    }
}
