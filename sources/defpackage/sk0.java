package defpackage;

import android.content.Context;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sk0 implements tk0, ui7 {
    public final Context a;

    public sk0(Context context) {
        context.getClass();
        this.a = context;
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
