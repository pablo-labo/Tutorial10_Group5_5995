package defpackage;

import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;

/* JADX INFO: loaded from: classes3.dex */
public final class swf extends ge4<Double> {
    public final /* synthetic */ ExpectedType a;

    public swf(ExpectedType expectedType) {
        this.a = expectedType;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return this.a;
    }

    @Override // defpackage.ge4
    public final Double e(Object obj, gk0 gk0Var, boolean z) {
        return (Double) obj;
    }

    @Override // defpackage.ge4
    public final Double f(Dynamic dynamic, gk0 gk0Var, boolean z) {
        return Double.valueOf(dynamic.asDouble());
    }
}
