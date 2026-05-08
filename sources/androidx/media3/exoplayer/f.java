package androidx.media3.exoplayer;

import androidx.media3.exoplayer.source.h;
import defpackage.emf;
import defpackage.p35;
import defpackage.qk3;
import defpackage.sdb;
import defpackage.zkd;

/* JADX INFO: loaded from: classes.dex */
public interface f {

    public static final class a {
        public final sdb a;
        public final long b;
        public final float c;
        public final boolean d;
        public final long e;

        public a(sdb sdbVar, emf emfVar, h.b bVar, long j, long j2, float f, boolean z, long j3) {
            this.a = sdbVar;
            this.b = j2;
            this.c = f;
            this.d = z;
            this.e = j3;
        }
    }

    default boolean a(a aVar) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    default boolean b() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    default long c() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    qk3 d();

    default boolean e(a aVar) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    default boolean f() {
        zkd.T("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    default void g(sdb sdbVar) {
        throw new IllegalStateException("onReleased not implemented");
    }

    default void h(sdb sdbVar) {
        throw new IllegalStateException("onStopped not implemented");
    }

    default void i(sdb sdbVar) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    default void j(a aVar, p35[] p35VarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }
}
