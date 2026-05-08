package defpackage;

import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;

/* JADX INFO: loaded from: classes3.dex */
public final class rwf extends ge4<Long> {
    public final /* synthetic */ ExpectedType a;

    public rwf(ExpectedType expectedType) {
        this.a = expectedType;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return this.a;
    }

    @Override // defpackage.ge4
    public final Long e(Object obj, gk0 gk0Var, boolean z) {
        return (Long) obj;
    }

    @Override // defpackage.ge4
    public final Long f(Dynamic dynamic, gk0 gk0Var, boolean z) {
        return Long.valueOf((long) dynamic.asDouble());
    }
}
