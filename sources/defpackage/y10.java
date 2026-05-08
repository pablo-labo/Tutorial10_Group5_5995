package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class y10 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ long V;
    public final /* synthetic */ ah2 a;
    public final /* synthetic */ e b;
    public final /* synthetic */ Function2<b, Integer, j6g> c;
    public final /* synthetic */ Function2<b, Integer, j6g> d;
    public final /* synthetic */ dce e;
    public final /* synthetic */ long f;

    public y10(ah2 ah2Var, e eVar, Function2 function2, Function2 function22, dce dceVar, long j, long j2) {
        this.a = ah2Var;
        this.b = eVar;
        this.c = function2;
        this.d = function22;
        this.e = dceVar;
        this.f = j;
        this.V = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            a20.b(this.a, this.b, this.c, this.d, this.e, this.f, this.V, bVar2, 0);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
