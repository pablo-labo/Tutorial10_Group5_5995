package defpackage;

import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.jni.ExpectedType;

/* JADX INFO: loaded from: classes3.dex */
public final class vwf extends ge4<String> {
    public final /* synthetic */ ExpectedType a;

    public vwf(ExpectedType expectedType) {
        this.a = expectedType;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return this.a;
    }

    @Override // defpackage.ge4
    public final String e(Object obj, gk0 gk0Var, boolean z) {
        return (String) obj;
    }

    @Override // defpackage.ge4
    public final String f(Dynamic dynamic, gk0 gk0Var, boolean z) throws DynamicCastException {
        String strAsString = dynamic.asString();
        if (strAsString != null) {
            return strAsString;
        }
        throw new DynamicCastException(fwc.a.b(String.class));
    }
}
