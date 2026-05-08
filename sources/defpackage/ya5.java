package defpackage;

import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.exception.Exceptions$IllegalArgument;
import expo.modules.kotlin.jni.ExpectedType;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class ya5 extends ge4<File> {
    @Override // defpackage.kka, defpackage.owf
    public final boolean b() {
        return false;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return new ExpectedType(s23.f);
    }

    @Override // defpackage.ge4
    public final File e(Object obj, gk0 gk0Var, boolean z) {
        return new File((String) obj);
    }

    @Override // defpackage.ge4
    public final File f(Dynamic dynamic, gk0 gk0Var, boolean z) throws Exceptions$IllegalArgument {
        String strAsString = dynamic.asString();
        if (strAsString != null) {
            return new File(strAsString);
        }
        throw new Exceptions$IllegalArgument("Cannot convert " + dynamic.getType() + " to File", null);
    }
}
