package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class u90 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ opg a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ e d;
    public final /* synthetic */ toa e;

    public u90(opg opgVar, long j, boolean z, e eVar, toa toaVar) {
        this.a = opgVar;
        this.b = j;
        this.c = z;
        this.d = eVar;
        this.e = toaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            rm2.a(um2.s.a(this.a), bh2.c(1260045569, new t90(this.b, this.c, this.d, this.e), bVar2), bVar2, 56);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
