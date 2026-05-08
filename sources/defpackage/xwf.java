package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.jni.ExpectedType;

/* JADX INFO: loaded from: classes3.dex */
public final class xwf extends ge4<ReadableMap> {
    public final /* synthetic */ ExpectedType a;

    public xwf(ExpectedType expectedType) {
        this.a = expectedType;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return this.a;
    }

    @Override // defpackage.ge4
    public final ReadableMap e(Object obj, gk0 gk0Var, boolean z) {
        return (ReadableMap) obj;
    }

    @Override // defpackage.ge4
    public final ReadableMap f(Dynamic dynamic, gk0 gk0Var, boolean z) throws DynamicCastException {
        ReadableMap readableMapAsMap = dynamic.asMap();
        if (readableMapAsMap != null) {
            return readableMapAsMap;
        }
        throw new DynamicCastException(fwc.a.b(ReadableMap.class));
    }
}
