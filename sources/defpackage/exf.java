package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.jni.ExpectedType;

/* JADX INFO: loaded from: classes3.dex */
public final class exf extends ge4<boolean[]> {
    public final /* synthetic */ ExpectedType a;

    public exf(ExpectedType expectedType) {
        this.a = expectedType;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return this.a;
    }

    @Override // defpackage.ge4
    public final boolean[] e(Object obj, gk0 gk0Var, boolean z) {
        return (boolean[]) obj;
    }

    @Override // defpackage.ge4
    public final boolean[] f(Dynamic dynamic, gk0 gk0Var, boolean z) throws DynamicCastException {
        ReadableArray readableArrayAsArray = dynamic.asArray();
        if (readableArrayAsArray == null) {
            throw new DynamicCastException(fwc.a.b(ReadableArray.class));
        }
        int size = readableArrayAsArray.size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = readableArrayAsArray.getBoolean(i);
        }
        return zArr;
    }
}
