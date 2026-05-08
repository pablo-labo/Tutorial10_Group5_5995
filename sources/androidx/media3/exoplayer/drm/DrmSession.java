package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.a;
import defpackage.ws5;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public interface DrmSession {

    public static class DrmSessionException extends IOException {
        public final int errorCode;

        public DrmSessionException(int i, Throwable th) {
            super(th);
            this.errorCode = i;
        }
    }

    UUID a();

    default boolean b() {
        return false;
    }

    DrmSessionException c();

    ws5 d();

    void e(a.C0043a c0043a);

    void f(a.C0043a c0043a);

    boolean g(String str);

    int getState();
}
