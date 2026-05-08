package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.jni.ExpectedType;

/* JADX INFO: loaded from: classes3.dex */
public final class cxf extends ge4<double[]> {
    public final /* synthetic */ ExpectedType a;

    public cxf(ExpectedType expectedType) {
        this.a = expectedType;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return this.a;
    }

    @Override // defpackage.ge4
    public final double[] e(Object obj, gk0 gk0Var, boolean z) {
        return (double[]) obj;
    }

    @Override // defpackage.ge4
    public final double[] f(Dynamic dynamic, gk0 gk0Var, boolean z) throws DynamicCastException {
        ReadableArray readableArrayAsArray = dynamic.asArray();
        if (readableArrayAsArray == null) {
            throw new DynamicCastException(fwc.a.b(ReadableArray.class));
        }
        int size = readableArrayAsArray.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = readableArrayAsArray.getDouble(i);
        }
        return dArr;
    }
}
