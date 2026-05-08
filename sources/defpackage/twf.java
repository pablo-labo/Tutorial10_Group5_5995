package defpackage;

import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;

/* JADX INFO: loaded from: classes3.dex */
public final class twf extends ge4<Float> {
    public final /* synthetic */ ExpectedType a;

    public twf(ExpectedType expectedType) {
        this.a = expectedType;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return this.a;
    }

    @Override // defpackage.ge4
    public final Float e(Object obj, gk0 gk0Var, boolean z) {
        return (Float) obj;
    }

    @Override // defpackage.ge4
    public final Float f(Dynamic dynamic, gk0 gk0Var, boolean z) {
        return Float.valueOf((float) dynamic.asDouble());
    }
}
