package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.jni.ExpectedType;

/* JADX INFO: loaded from: classes3.dex */
public final class lqc extends ge4<kqc> {
    @Override // defpackage.kka, defpackage.owf
    public final boolean b() {
        return false;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return new ExpectedType(s23.Y);
    }

    @Override // defpackage.ge4
    public final kqc e(Object obj, gk0 gk0Var, boolean z) {
        ((ReadableMap) obj).toHashMap();
        return new ie7(25);
    }

    @Override // defpackage.ge4
    public final kqc f(Dynamic dynamic, gk0 gk0Var, boolean z) throws DynamicCastException {
        ReadableMap readableMapAsMap = dynamic.asMap();
        if (readableMapAsMap == null) {
            throw new DynamicCastException(fwc.a.b(ReadableMap.class));
        }
        readableMapAsMap.toHashMap();
        return new ie7(25);
    }
}
