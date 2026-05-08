package defpackage;

import com.facebook.react.bridge.Dynamic;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ge4<T> extends kka<T> {
    @Override // defpackage.kka
    public final T d(Object obj, gk0 gk0Var, boolean z) {
        return obj instanceof Dynamic ? f((Dynamic) obj, gk0Var, z) : e(obj, gk0Var, z);
    }

    public abstract T e(Object obj, gk0 gk0Var, boolean z);

    public abstract T f(Dynamic dynamic, gk0 gk0Var, boolean z);
}
