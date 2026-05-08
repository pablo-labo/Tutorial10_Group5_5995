package defpackage;

import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.jni.ExpectedType;

/* JADX INFO: loaded from: classes3.dex */
public final class qhg extends ge4<Uri> {
    @Override // defpackage.kka, defpackage.owf
    public final boolean b() {
        return false;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return new ExpectedType(s23.f);
    }

    @Override // defpackage.ge4
    public final Uri e(Object obj, gk0 gk0Var, boolean z) {
        return Uri.parse((String) obj);
    }

    @Override // defpackage.ge4
    public final Uri f(Dynamic dynamic, gk0 gk0Var, boolean z) throws DynamicCastException {
        Uri uri;
        String strAsString = dynamic.asString();
        if (strAsString == null || (uri = Uri.parse(strAsString)) == null) {
            throw new DynamicCastException(fwc.a.b(Uri.class));
        }
        return uri;
    }
}
