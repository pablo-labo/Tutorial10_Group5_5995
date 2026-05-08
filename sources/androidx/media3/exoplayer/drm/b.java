package androidx.media3.exoplayer.drm;

import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.a;
import defpackage.o6;
import defpackage.sdb;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    public static final a a = new a();

    public class a implements b {
        @Override // androidx.media3.exoplayer.drm.b
        public final void a(Looper looper, sdb sdbVar) {
        }

        @Override // androidx.media3.exoplayer.drm.b
        public final DrmSession b(a.C0043a c0043a, androidx.media3.common.a aVar) {
            if (aVar.r == null) {
                return null;
            }
            return new e(new DrmSession.DrmSessionException(6001, new UnsupportedDrmException()));
        }

        @Override // androidx.media3.exoplayer.drm.b
        public final int c(androidx.media3.common.a aVar) {
            return aVar.r != null ? 1 : 0;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.drm.b$b, reason: collision with other inner class name */
    public interface InterfaceC0045b {
        public static final o6 S = new o6(8);

        void release();
    }

    void a(Looper looper, sdb sdbVar);

    DrmSession b(a.C0043a c0043a, androidx.media3.common.a aVar);

    int c(androidx.media3.common.a aVar);

    default InterfaceC0045b d(a.C0043a c0043a, androidx.media3.common.a aVar) {
        return InterfaceC0045b.S;
    }

    default void f() {
    }

    default void release() {
    }
}
