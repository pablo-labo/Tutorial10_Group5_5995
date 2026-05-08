package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.jni.ExpectedType;

/* JADX INFO: loaded from: classes3.dex */
public final class axf extends ge4<int[]> {
    public final /* synthetic */ ExpectedType a;

    public axf(ExpectedType expectedType) {
        this.a = expectedType;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return this.a;
    }

    @Override // defpackage.ge4
    public final int[] e(Object obj, gk0 gk0Var, boolean z) {
        return (int[]) obj;
    }

    @Override // defpackage.ge4
    public final int[] f(Dynamic dynamic, gk0 gk0Var, boolean z) throws DynamicCastException {
        ReadableArray readableArrayAsArray = dynamic.asArray();
        if (readableArrayAsArray == null) {
            throw new DynamicCastException(fwc.a.b(ReadableArray.class));
        }
        int size = readableArrayAsArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = readableArrayAsArray.getInt(i);
        }
        return iArr;
    }
}
