package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class wwa implements Function2<b, Integer, j6g> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ d3a b;
    public final /* synthetic */ ar3 c;
    public final /* synthetic */ dce d;

    public wwa(boolean z, d3a d3aVar, ar3 ar3Var, dce dceVar) {
        this.a = z;
        this.b = d3aVar;
        this.c = ar3Var;
        this.d = dceVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            ief.a.a(this.a, this.b, this.c, this.d, 0.0f, 0.0f, bVar2, 12582912);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
