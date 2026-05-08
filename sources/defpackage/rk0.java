package defpackage;

import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rk0 implements tk0, ui7 {
    public final ReactApplicationContext a;

    public rk0(ReactApplicationContext reactApplicationContext) {
        this.a = reactApplicationContext;
    }

    @Override // defpackage.tk0
    public final File a() {
        File cacheDir = this.a.getCacheDir();
        cacheDir.getClass();
        return cacheDir;
    }

    @Override // defpackage.ui7
    public final List<Class<?>> f() {
        return u63.Z(tk0.class);
    }
}
