package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ef9 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ nzf a;
    public final /* synthetic */ ah2 b;

    public ef9(nzf nzfVar, ah2 ah2Var) {
        this.a = nzfVar;
        this.b = ah2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            fif.a(this.a.i, bh2.c(905505767, new df9(this.b, 0), bVar2), bVar2, 48);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
