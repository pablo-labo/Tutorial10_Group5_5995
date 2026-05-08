package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ft1 implements iy3 {
    public wo1 a = r03.V;
    public nfa b;

    public final nfa d(Function1<? super ss2, j6g> function1) {
        nfa nfaVar = new nfa();
        nfaVar.b = function1;
        this.b = nfaVar;
        return nfaVar;
    }

    @Override // defpackage.iy3
    public final float getDensity() {
        return this.a.getDensity().getDensity();
    }

    @Override // defpackage.iy3
    public final float p1() {
        return this.a.getDensity().p1();
    }
}
