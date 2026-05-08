package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w5g extends y03 {
    public static final w5g c = new w5g();

    @Override // defpackage.y03
    public final y03 E1(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.y03
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // defpackage.y03
    public final void v1(v03 v03Var, Runnable runnable) {
        z5h z5hVar = (z5h) v03Var.h1(z5h.c);
        if (z5hVar != null) {
            z5hVar.b = true;
        } else {
            b0.u("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }
}
