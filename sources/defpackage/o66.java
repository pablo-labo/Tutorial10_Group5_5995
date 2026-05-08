package defpackage;

import com.facebook.react.bridge.Promise;

/* JADX INFO: loaded from: classes3.dex */
public final class o66 implements yq2<Exception> {
    public final /* synthetic */ Promise a;
    public final /* synthetic */ f5 b;

    public o66(Promise promise, f5 f5Var) {
        this.a = promise;
        this.b = f5Var;
    }

    @Override // defpackage.yq2
    public final void accept(Exception exc) {
        Exception exc2 = exc;
        Promise promise = this.a;
        if (exc2 != null) {
            promise.reject(exc2);
        } else {
            promise.resolve(this.b.e());
        }
    }
}
