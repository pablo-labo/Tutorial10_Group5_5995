package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class ma5 implements f5d<File> {
    public final File a;

    public ma5(File file) {
        beb.e(file, "Argument must not be null");
        this.a = file;
    }

    @Override // defpackage.f5d
    public final int a() {
        return 1;
    }

    @Override // defpackage.f5d
    public final Class<File> b() {
        return this.a.getClass();
    }

    @Override // defpackage.f5d
    public final File get() {
        return this.a;
    }

    @Override // defpackage.f5d
    public final void recycle() {
    }
}
