package defpackage;

import android.os.Trace;

/* JADX INFO: loaded from: classes2.dex */
public final class k3f implements AutoCloseable {
    public k3f(String str) {
        Trace.beginSection(jpf.g(str));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Trace.endSection();
    }
}
