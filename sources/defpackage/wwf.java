package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.jni.ExpectedType;

/* JADX INFO: loaded from: classes3.dex */
public final class wwf extends ge4<ReadableArray> {
    public final /* synthetic */ ExpectedType a;

    public wwf(ExpectedType expectedType) {
        this.a = expectedType;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return this.a;
    }

    @Override // defpackage.ge4
    public final ReadableArray e(Object obj, gk0 gk0Var, boolean z) {
        return (ReadableArray) obj;
    }

    @Override // defpackage.ge4
    public final ReadableArray f(Dynamic dynamic, gk0 gk0Var, boolean z) throws DynamicCastException {
        ReadableArray readableArrayAsArray = dynamic.asArray();
        if (readableArrayAsArray != null) {
            return readableArrayAsArray;
        }
        throw new DynamicCastException(fwc.a.b(ReadableArray.class));
    }
}
