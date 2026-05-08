package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.jni.ExpectedType;

/* JADX INFO: loaded from: classes3.dex */
public final class dxf extends ge4<float[]> {
    public final /* synthetic */ ExpectedType a;

    public dxf(ExpectedType expectedType) {
        this.a = expectedType;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return this.a;
    }

    @Override // defpackage.ge4
    public final float[] e(Object obj, gk0 gk0Var, boolean z) {
        return (float[]) obj;
    }

    @Override // defpackage.ge4
    public final float[] f(Dynamic dynamic, gk0 gk0Var, boolean z) throws DynamicCastException {
        ReadableArray readableArrayAsArray = dynamic.asArray();
        if (readableArrayAsArray == null) {
            throw new DynamicCastException(fwc.a.b(ReadableArray.class));
        }
        int size = readableArrayAsArray.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = (float) readableArrayAsArray.getDouble(i);
        }
        return fArr;
    }
}
