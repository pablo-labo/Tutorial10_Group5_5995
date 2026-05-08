package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", l = {160}, m = "awaitCancellation")
public final class ks3 extends pu2 {
    int label;
    /* synthetic */ Object result;

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        ls3.a(this);
        return g13.a;
    }
}
