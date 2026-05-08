package defpackage;

import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;

/* JADX INFO: loaded from: classes3.dex */
public final class uwf extends ge4<Boolean> {
    public final /* synthetic */ ExpectedType a;

    public uwf(ExpectedType expectedType) {
        this.a = expectedType;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return this.a;
    }

    @Override // defpackage.ge4
    public final Boolean e(Object obj, gk0 gk0Var, boolean z) {
        return (Boolean) obj;
    }

    @Override // defpackage.ge4
    public final Boolean f(Dynamic dynamic, gk0 gk0Var, boolean z) {
        return Boolean.valueOf(dynamic.asBoolean());
    }
}
