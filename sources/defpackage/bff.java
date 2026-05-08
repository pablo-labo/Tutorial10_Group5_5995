package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.r;

/* JADX INFO: loaded from: classes.dex */
public final class bff implements wu5<ff7, b, Integer, da2> {
    public final /* synthetic */ ar3 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ei7 c;

    public bff(ar3 ar3Var, boolean z, ei7 ei7Var) {
        this.a = ar3Var;
        this.b = z;
        this.c = ei7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wu5
    public final da2 q(ff7 ff7Var, b bVar, Integer num) {
        b bVar2 = bVar;
        num.intValue();
        bVar2.L(1423138213);
        bVar2.L(727091888);
        g4a g4aVarP = wg2.p(this.c, bVar2, 0);
        ar3 ar3Var = this.a;
        g4a g4aVarG = r.g(new da2(!this.b ? ar3Var.r : ((Boolean) g4aVarP.getValue()).booleanValue() ? ar3Var.p : ar3Var.q), bVar2);
        bVar2.F();
        long j = ((da2) g4aVarG.getValue()).a;
        bVar2.F();
        return new da2(j);
    }
}
