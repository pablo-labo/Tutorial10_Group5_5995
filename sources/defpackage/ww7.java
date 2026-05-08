package defpackage;

import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public final class ww7 extends ge4<URI> {
    @Override // defpackage.kka, defpackage.owf
    public final boolean b() {
        return false;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return new ExpectedType(s23.f);
    }

    @Override // defpackage.ge4
    public final URI e(Object obj, gk0 gk0Var, boolean z) {
        URI uriCreate = URI.create((String) obj);
        uriCreate.getClass();
        return uriCreate;
    }

    @Override // defpackage.ge4
    public final URI f(Dynamic dynamic, gk0 gk0Var, boolean z) {
        URI uriCreate = URI.create(dynamic.asString());
        uriCreate.getClass();
        return uriCreate;
    }
}
