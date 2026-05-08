package androidx.media3.exoplayer;

import androidx.media3.exoplayer.j;
import androidx.media3.exoplayer.source.h;
import defpackage.d82;
import defpackage.emf;
import defpackage.ng9;
import defpackage.rjd;
import defpackage.sdb;
import defpackage.w1d;

/* JADX INFO: loaded from: classes.dex */
public interface k extends j.b {

    public interface a {
        void a();

        void b();
    }

    long A();

    void B(long j);

    ng9 C();

    boolean b();

    boolean c();

    void disable();

    String getName();

    int getState();

    void i(long j, long j2);

    boolean j();

    default void k() {
    }

    void l();

    void n();

    boolean o();

    int p();

    void q(emf emfVar);

    default long r(long j, long j2) {
        if (getState() == 1) {
            return (b() || c()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    default void release() {
    }

    void reset();

    void s(w1d w1dVar, androidx.media3.common.a[] aVarArr, rjd rjdVar, boolean z, boolean z2, long j, long j2, h.b bVar);

    void start();

    void stop();

    void t(androidx.media3.common.a[] aVarArr, rjd rjdVar, long j, long j2, h.b bVar);

    void u(int i, sdb sdbVar, d82 d82Var);

    b v();

    default void x(float f, float f2) {
    }

    rjd z();
}
