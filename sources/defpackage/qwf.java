package defpackage;

import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;

/* JADX INFO: loaded from: classes3.dex */
public final class qwf extends ge4<Integer> {
    public final /* synthetic */ ExpectedType a;

    public qwf(ExpectedType expectedType) {
        this.a = expectedType;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return this.a;
    }

    @Override // defpackage.ge4
    public final Integer e(Object obj, gk0 gk0Var, boolean z) {
        return (Integer) obj;
    }

    @Override // defpackage.ge4
    public final Integer f(Dynamic dynamic, gk0 gk0Var, boolean z) {
        return Integer.valueOf((int) dynamic.asDouble());
    }
}
