package androidx.media3.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import androidx.media3.session.q;
import defpackage.aae;
import defpackage.aw5;
import defpackage.cdb;
import defpackage.dqf;
import defpackage.e47;
import defpackage.emf;
import defpackage.gdb;
import defpackage.hz8;
import defpackage.ij9;
import defpackage.jj9;
import defpackage.ka2;
import defpackage.oj9;
import defpackage.ox0;
import defpackage.q83;
import defpackage.s34;
import defpackage.sg9;
import defpackage.tog;
import defpackage.u37;
import defpackage.v8e;
import defpackage.vjg;
import defpackage.w8e;
import defpackage.wq2;
import defpackage.wqf;
import defpackage.ws1;
import defpackage.x9e;
import defpackage.zkd;
import java.util.HashSet;
import java.util.List;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes.dex */
public class j implements gdb {
    public final emf.d a;
    public boolean b;

    @NotOnlyInitialized
    public final b c;
    public final q.b d;
    public final Handler e;
    public final long f;
    public boolean g;
    public final sg9 h;

    public interface a {
        static u37 C() {
            return aw5.K1(new x9e(-6));
        }

        default void F() {
        }

        default u37 G(v8e v8eVar) {
            return aw5.K1(new x9e(-6));
        }

        default void x() {
        }
    }

    public interface b {
        void A(boolean z);

        void A0(int i, int i2, int i3);

        void B();

        void B0(List<ij9> list);

        void C(int i);

        boolean C0();

        wqf D();

        boolean D0();

        q83 E();

        long E0();

        void F(ox0 ox0Var, boolean z);

        void F0(int i);

        void G(oj9 oj9Var);

        void G0();

        int H();

        void H0();

        void I(boolean z);

        oj9 I0();

        void J(ij9 ij9Var);

        void J0(List list);

        void K(List list, int i, int i2);

        long K0();

        int L();

        long L0();

        emf M();

        w8e M0();

        void N(int i, ij9 ij9Var);

        e47<androidx.media3.session.a> N0();

        void O();

        Bundle O0();

        dqf P();

        hz8 P0(v8e v8eVar);

        void Q();

        void R(TextureView textureView);

        int S();

        long T();

        void U(int i, long j);

        gdb.a V();

        boolean W();

        void X(boolean z);

        long Y();

        void Z(gdb.c cVar);

        PlaybackException a();

        long a0();

        int b();

        int b0();

        void c();

        void c0(TextureView textureView);

        boolean d();

        tog d0();

        cdb e();

        float e0();

        void f();

        ox0 f0();

        void g(cdb cdbVar);

        s34 g0();

        long getDuration();

        void h(float f);

        void h0(int i, int i2);

        int i();

        int i0();

        void j(Surface surface);

        void j0(long j);

        boolean k();

        void k0(float f);

        long l();

        void l0(List<ij9> list, int i, long j);

        void m(ij9 ij9Var, long j);

        void m0(int i);

        void n();

        long n0();

        int o();

        boolean o0();

        void p();

        long p0();

        void q();

        void q0(int i, List<ij9> list);

        void r(int i, boolean z);

        long r0();

        void release();

        void s();

        oj9 s0();

        void stop();

        void t(int i);

        boolean t0();

        void u(SurfaceView surfaceView);

        void u0();

        void v(dqf dqfVar);

        int v0();

        void w(int i);

        void w0(int i);

        void x();

        void x0(gdb.c cVar);

        void y(int i, int i2);

        void y0(SurfaceView surfaceView);

        void z();

        void z0(int i, int i2);
    }

    public j(v vVar, aae aaeVar, Bundle bundle, q.b bVar, Looper looper, sg9 sg9Var, ws1 ws1Var) {
        j jVar;
        b kVar;
        ka2.o(aaeVar, "token must not be null");
        zkd.D("MediaController", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + vjg.a + "]");
        this.a = new emf.d();
        this.f = -9223372036854775807L;
        this.d = bVar;
        this.e = new Handler(looper);
        this.h = sg9Var;
        if (aaeVar.a.g()) {
            ws1Var.getClass();
            kVar = new l(vVar, this, aaeVar, bundle, looper, ws1Var);
            jVar = this;
        } else {
            jVar = this;
            kVar = new k(vVar, jVar, aaeVar, bundle, looper);
        }
        jVar.c = kVar;
        kVar.x();
    }

    @Override // defpackage.gdb
    public final void A(boolean z) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.A(z);
        }
    }

    @Override // defpackage.gdb
    public final void A0(int i, int i2, int i3) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.A0(i, i2, i3);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring moveMediaItems().");
        }
    }

    @Override // defpackage.gdb
    public final void B() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.B();
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring seekToNextMediaItem().");
        }
    }

    @Override // defpackage.gdb
    public final void B0(List<ij9> list) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.B0(list);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring addMediaItems().");
        }
    }

    @Override // defpackage.gdb
    public final void C(int i) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.C(i);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring decreaseDeviceVolume().");
        }
    }

    @Override // defpackage.gdb
    public final boolean C0() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            return bVar.C0();
        }
        return false;
    }

    @Override // defpackage.gdb
    public final wqf D() {
        V0();
        b bVar = this.c;
        return bVar.o0() ? bVar.D() : wqf.b;
    }

    @Override // defpackage.gdb
    public final boolean D0() {
        V0();
        b bVar = this.c;
        return bVar.o0() && bVar.D0();
    }

    @Override // defpackage.gdb
    public final q83 E() {
        V0();
        b bVar = this.c;
        return bVar.o0() ? bVar.E() : q83.d;
    }

    @Override // defpackage.gdb
    public final long E0() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            return bVar.E0();
        }
        return 0L;
    }

    @Override // defpackage.gdb
    public final void F(ox0 ox0Var, boolean z) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.F(ox0Var, z);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring setAudioAttributes().");
        }
    }

    @Override // defpackage.gdb
    @Deprecated
    public final void F0(int i) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.F0(i);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring setDeviceVolume().");
        }
    }

    @Override // defpackage.gdb
    public final void G(oj9 oj9Var) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.G(oj9Var);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring setPlaylistMetadata().");
        }
    }

    @Override // defpackage.gdb
    public final void G0() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.G0();
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring seekForward().");
        }
    }

    @Override // defpackage.gdb
    public final int H() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            return bVar.H();
        }
        return -1;
    }

    @Override // defpackage.gdb
    public final void H0() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.H0();
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring seekBack().");
        }
    }

    @Override // defpackage.gdb
    @Deprecated
    public final void I(boolean z) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.I(z);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring setDeviceMuted().");
        }
    }

    @Override // defpackage.gdb
    public final oj9 I0() {
        V0();
        b bVar = this.c;
        return bVar.o0() ? bVar.I0() : oj9.K;
    }

    @Override // defpackage.gdb
    public final void J(ij9 ij9Var) {
        V0();
        ka2.o(ij9Var, "mediaItems must not be null");
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.J(ij9Var);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // defpackage.gdb
    public final void J0(List list) {
        V0();
        ka2.o(list, "mediaItems must not be null");
        for (int i = 0; i < list.size(); i++) {
            ka2.k("items must not contain null, index=" + i, list.get(i) != null);
        }
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.J0(list);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // defpackage.gdb
    public final void K(List list, int i, int i2) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.K(list, i, i2);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring replaceMediaItems().");
        }
    }

    @Override // defpackage.gdb
    public final long K0() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            return bVar.K0();
        }
        return 0L;
    }

    @Override // defpackage.gdb
    public final int L() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            return bVar.L();
        }
        return 0;
    }

    @Override // defpackage.gdb
    public final long L0() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            return bVar.L0();
        }
        return 0L;
    }

    @Override // defpackage.gdb
    public final emf M() {
        V0();
        b bVar = this.c;
        return bVar.o0() ? bVar.M() : emf.a;
    }

    @Override // defpackage.gdb
    public final ij9 M0() {
        emf emfVarM = M();
        if (emfVarM.p()) {
            return null;
        }
        return emfVarM.m(v0(), this.a, 0L).b;
    }

    @Override // defpackage.gdb
    public final void N(int i, ij9 ij9Var) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.N(i, ij9Var);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring replaceMediaItem().");
        }
    }

    @Override // defpackage.gdb
    @Deprecated
    public final void O() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.O();
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring increaseDeviceVolume().");
        }
    }

    @Override // defpackage.gdb
    public final boolean O0(int i) {
        return V().a(i);
    }

    @Override // defpackage.gdb
    public final dqf P() {
        V0();
        b bVar = this.c;
        return !bVar.o0() ? dqf.F : bVar.P();
    }

    @Override // defpackage.gdb
    public final boolean P0() {
        V0();
        emf emfVarM = M();
        return !emfVarM.p() && emfVarM.m(v0(), this.a, 0L).h;
    }

    @Override // defpackage.gdb
    public final void Q() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.Q();
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring seekToNext().");
        }
    }

    @Override // defpackage.gdb
    public final Looper Q0() {
        return this.e.getLooper();
    }

    @Override // defpackage.gdb
    public final void R(TextureView textureView) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.R(textureView);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring setVideoTextureView().");
        }
    }

    @Override // defpackage.gdb
    public final boolean R0() {
        V0();
        emf emfVarM = M();
        return !emfVarM.p() && emfVarM.m(v0(), this.a, 0L).g;
    }

    @Override // defpackage.gdb
    public final int S() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            return bVar.S();
        }
        return 0;
    }

    @Override // defpackage.gdb
    public final boolean S0() {
        V0();
        emf emfVarM = M();
        return !emfVarM.p() && emfVarM.m(v0(), this.a, 0L).a();
    }

    @Override // defpackage.gdb
    public final long T() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            return bVar.T();
        }
        return -9223372036854775807L;
    }

    public final void T0() {
        String str;
        Handler handler = this.e;
        V0();
        if (this.b) {
            return;
        }
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.8.0] [");
        sb.append(vjg.a);
        sb.append("] [");
        HashSet<String> hashSet = jj9.a;
        synchronized (jj9.class) {
            str = jj9.b;
        }
        sb.append(str);
        sb.append("]");
        zkd.D("MediaController", sb.toString());
        this.b = true;
        handler.removeCallbacksAndMessages(null);
        try {
            this.c.release();
        } catch (Exception e) {
            zkd.v("MediaController", "Exception while releasing impl", e);
        }
        if (!this.g) {
            this.g = true;
            sg9 sg9Var = this.h;
            sg9Var.getClass();
            sg9Var.m(new SecurityException("Session rejected the connection request."));
            return;
        }
        ka2.q(Looper.myLooper() == handler.getLooper());
        q.b bVar = this.d;
        v vVar = bVar.a;
        r rVar = bVar.b;
        if (vVar.c(rVar)) {
            vVar.g(rVar);
        }
        vVar.f(rVar, false);
    }

    @Override // defpackage.gdb
    public final void U(int i, long j) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.U(i, j);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    public final void U0(Runnable runnable) {
        vjg.T(this.e, runnable);
    }

    @Override // defpackage.gdb
    public final gdb.a V() {
        V0();
        b bVar = this.c;
        return !bVar.o0() ? gdb.a.b : bVar.V();
    }

    public final void V0() {
        ka2.p("MediaController method is called from a wrong thread. See javadoc of MediaController for details.", Looper.myLooper() == this.e.getLooper());
    }

    @Override // defpackage.gdb
    public final boolean W() {
        V0();
        b bVar = this.c;
        return bVar.o0() && bVar.W();
    }

    @Override // defpackage.gdb
    public final void X(boolean z) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.X(z);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring setShuffleMode().");
        }
    }

    @Override // defpackage.gdb
    public final long Y() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            return bVar.Y();
        }
        return 0L;
    }

    @Override // defpackage.gdb
    public final void Z(gdb.c cVar) {
        ka2.o(cVar, "listener must not be null");
        this.c.Z(cVar);
    }

    @Override // defpackage.gdb
    public final PlaybackException a() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            return bVar.a();
        }
        return null;
    }

    @Override // defpackage.gdb
    public final long a0() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            return bVar.a0();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.gdb
    public final int b() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            return bVar.b();
        }
        return 1;
    }

    @Override // defpackage.gdb
    public final int b0() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            return bVar.b0();
        }
        return -1;
    }

    @Override // defpackage.gdb
    public final void c() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.c();
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring pause().");
        }
    }

    @Override // defpackage.gdb
    public final void c0(TextureView textureView) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.c0(textureView);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring clearVideoTextureView().");
        }
    }

    @Override // defpackage.gdb
    public final boolean d() {
        V0();
        b bVar = this.c;
        return bVar.o0() && bVar.d();
    }

    @Override // defpackage.gdb
    public final tog d0() {
        V0();
        b bVar = this.c;
        return bVar.o0() ? bVar.d0() : tog.d;
    }

    @Override // defpackage.gdb
    public final cdb e() {
        V0();
        b bVar = this.c;
        return bVar.o0() ? bVar.e() : cdb.d;
    }

    @Override // defpackage.gdb
    public final float e0() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            return bVar.e0();
        }
        return 1.0f;
    }

    @Override // defpackage.gdb
    public final void f() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.f();
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring prepare().");
        }
    }

    @Override // defpackage.gdb
    public final ox0 f0() {
        V0();
        b bVar = this.c;
        return !bVar.o0() ? ox0.h : bVar.f0();
    }

    @Override // defpackage.gdb
    public final void g(cdb cdbVar) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.g(cdbVar);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring setPlaybackParameters().");
        }
    }

    @Override // defpackage.gdb
    public final s34 g0() {
        V0();
        b bVar = this.c;
        return !bVar.o0() ? s34.e : bVar.g0();
    }

    @Override // defpackage.gdb
    public final long getDuration() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            return bVar.getDuration();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.gdb
    public final void h(float f) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.h(f);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring setPlaybackSpeed().");
        }
    }

    @Override // defpackage.gdb
    public final void h0(int i, int i2) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.h0(i, i2);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring setDeviceVolume().");
        }
    }

    @Override // defpackage.gdb
    public final int i() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            return bVar.i();
        }
        return 0;
    }

    @Override // defpackage.gdb
    public final int i0() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            return bVar.i0();
        }
        return -1;
    }

    @Override // defpackage.gdb
    public final void j(Surface surface) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.j(surface);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring setVideoSurface().");
        }
    }

    @Override // defpackage.gdb
    public final void j0(long j) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.j0(j);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.gdb
    public final boolean k() {
        V0();
        b bVar = this.c;
        return bVar.o0() && bVar.k();
    }

    @Override // defpackage.gdb
    public final void k0(float f) {
        V0();
        ka2.k("volume must be between 0 and 1", f >= 0.0f && f <= 1.0f);
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.k0(f);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring setVolume().");
        }
    }

    @Override // defpackage.gdb
    public final long l() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            return bVar.l();
        }
        return 0L;
    }

    @Override // defpackage.gdb
    public final void l0(List<ij9> list, int i, long j) {
        V0();
        ka2.o(list, "mediaItems must not be null");
        for (int i2 = 0; i2 < list.size(); i2++) {
            ka2.k("items must not contain null, index=" + i2, list.get(i2) != null);
        }
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.l0(list, i, j);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // defpackage.gdb
    public final void m(ij9 ij9Var, long j) {
        V0();
        ka2.o(ij9Var, "mediaItems must not be null");
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.m(ij9Var, j);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring setMediaItem().");
        }
    }

    @Override // defpackage.gdb
    public final void m0(int i) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.m0(i);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.gdb
    public final void n() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.n();
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring clearMediaItems().");
        }
    }

    @Override // defpackage.gdb
    public final long n0() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            return bVar.n0();
        }
        return 0L;
    }

    @Override // defpackage.gdb
    public final int o() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            return bVar.o();
        }
        return 0;
    }

    public final void o0(wq2<a> wq2Var) {
        ka2.q(Looper.myLooper() == this.e.getLooper());
        wq2Var.accept(this.d);
    }

    @Override // defpackage.gdb
    public final void p() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.p();
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring seekToPreviousMediaItem().");
        }
    }

    @Override // defpackage.gdb
    public final long p0() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            return bVar.p0();
        }
        return 0L;
    }

    @Override // defpackage.gdb
    public final void q() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.q();
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.gdb
    public final void q0(int i, List<ij9> list) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.q0(i, list);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring addMediaItems().");
        }
    }

    @Override // defpackage.gdb
    public final void r(int i, boolean z) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.r(i, z);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring setDeviceMuted().");
        }
    }

    @Override // defpackage.gdb
    public final long r0() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            return bVar.r0();
        }
        return 0L;
    }

    @Override // defpackage.gdb
    @Deprecated
    public final void s() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.s();
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring decreaseDeviceVolume().");
        }
    }

    @Override // defpackage.gdb
    public final oj9 s0() {
        V0();
        b bVar = this.c;
        return bVar.o0() ? bVar.s0() : oj9.K;
    }

    @Override // defpackage.gdb
    public final void stop() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.stop();
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring stop().");
        }
    }

    @Override // defpackage.gdb
    public final void t(int i) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.t(i);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring increaseDeviceVolume().");
        }
    }

    @Override // defpackage.gdb
    public final boolean t0() {
        V0();
        b bVar = this.c;
        return bVar.o0() && bVar.t0();
    }

    @Override // defpackage.gdb
    public final void u(SurfaceView surfaceView) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.u(surfaceView);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring setVideoSurfaceView().");
        }
    }

    @Override // defpackage.gdb
    public final void u0() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.u0();
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring play().");
        }
    }

    @Override // defpackage.gdb
    public final void v(dqf dqfVar) {
        V0();
        b bVar = this.c;
        if (!bVar.o0()) {
            zkd.T("MediaController", "The controller is not connected. Ignoring setTrackSelectionParameters().");
        }
        bVar.v(dqfVar);
    }

    @Override // defpackage.gdb
    public final int v0() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            return bVar.v0();
        }
        return -1;
    }

    @Override // defpackage.gdb
    public final void w(int i) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.w(i);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring removeMediaItem().");
        }
    }

    @Override // defpackage.gdb
    public final void w0(int i) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.w0(i);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring setRepeatMode().");
        }
    }

    public final void x() {
        ka2.q(Looper.myLooper() == this.e.getLooper());
        ka2.q(!this.g);
        this.g = true;
        sg9 sg9Var = this.h;
        sg9Var.Y = true;
        T t = sg9Var.X;
        if (t != 0) {
            sg9Var.l(t);
        }
    }

    @Override // defpackage.gdb
    public final void x0(gdb.c cVar) {
        V0();
        ka2.o(cVar, "listener must not be null");
        this.c.x0(cVar);
    }

    @Override // defpackage.gdb
    public final void y(int i, int i2) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.y(i, i2);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring removeMediaItems().");
        }
    }

    @Override // defpackage.gdb
    public final void y0(SurfaceView surfaceView) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.y0(surfaceView);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring clearVideoSurfaceView().");
        }
    }

    @Override // defpackage.gdb
    public final void z() {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.z();
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring seekToPrevious().");
        }
    }

    @Override // defpackage.gdb
    public final void z0(int i, int i2) {
        V0();
        b bVar = this.c;
        if (bVar.o0()) {
            bVar.z0(i, i2);
        } else {
            zkd.T("MediaController", "The controller is not connected. Ignoring moveMediaItem().");
        }
    }
}
