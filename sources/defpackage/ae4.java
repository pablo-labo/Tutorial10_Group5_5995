package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.jni.ExpectedType;
import java.net.URL;

/* JADX INFO: loaded from: classes3.dex */
public final class ae4 extends ge4 {
    public final /* synthetic */ int a;

    @Override // defpackage.kka, defpackage.owf
    public final boolean b() {
        switch (this.a) {
        }
        return false;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        switch (this.a) {
            case 0:
                return new ExpectedType(s23.a);
            default:
                return new ExpectedType(s23.f);
        }
    }

    @Override // defpackage.ge4
    public final Object e(Object obj, gk0 gk0Var, boolean z) {
        switch (this.a) {
            case 0:
                return new wd4(pg8.S(((Double) obj).doubleValue(), be4.SECONDS));
            default:
                return new URL((String) obj);
        }
    }

    @Override // defpackage.ge4
    public final Object f(Dynamic dynamic, gk0 gk0Var, boolean z) {
        switch (this.a) {
            case 0:
                if (dynamic.getType() == ReadableType.Number) {
                    return new wd4(pg8.S(dynamic.asDouble(), be4.SECONDS));
                }
                bg.m(dynamic.getType(), "Expected a number, but received ");
                return null;
            default:
                return new URL(dynamic.asString());
        }
    }
}
