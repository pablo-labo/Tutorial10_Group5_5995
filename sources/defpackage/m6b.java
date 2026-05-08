package defpackage;

import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;
import java.nio.file.Path;
import java.nio.file.Paths;

/* JADX INFO: loaded from: classes3.dex */
public final class m6b extends ge4<Path> {
    @Override // defpackage.kka, defpackage.owf
    public final boolean b() {
        return false;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return new ExpectedType(s23.f);
    }

    @Override // defpackage.ge4
    public final Path e(Object obj, gk0 gk0Var, boolean z) {
        Path path = Paths.get((String) obj, new String[0]);
        path.getClass();
        return path;
    }

    @Override // defpackage.ge4
    public final Path f(Dynamic dynamic, gk0 gk0Var, boolean z) {
        Path path = Paths.get(dynamic.asString(), new String[0]);
        path.getClass();
        return path;
    }
}
