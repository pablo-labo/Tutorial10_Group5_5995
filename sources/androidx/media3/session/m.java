package androidx.media3.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import androidx.media3.session.f;
import androidx.media3.session.j;
import androidx.media3.session.k;
import androidx.media3.session.z;
import defpackage.aae;
import defpackage.b0;
import defpackage.dz1;
import defpackage.g9;
import defpackage.gdb;
import defpackage.hg0;
import defpackage.i35;
import defpackage.l6;
import defpackage.tm1;
import defpackage.u91;
import defpackage.v8e;
import defpackage.v9e;
import defpackage.vjg;
import defpackage.wu8;
import defpackage.x9e;
import defpackage.zkd;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class m extends f.a {
    public final WeakReference<k> a;

    public interface a<T extends k> {
        void f(T t);
    }

    public m(k kVar) {
        attachInterface(this, "androidx.media3.session.IMediaController");
        this.a = new WeakReference<>(kVar);
    }

    @Override // androidx.media3.session.f
    public final void B0(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            e(new u91(gdb.a.b(bundle), 11));
        } catch (RuntimeException e) {
            zkd.U("MediaControllerStub", "Ignoring malformed Bundle for Commands", e);
        }
    }

    @Override // androidx.media3.session.f
    public final void D0(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            e(new i35(v9e.b(bundle), 5));
        } catch (RuntimeException e) {
            zkd.U("MediaControllerStub", "Ignoring malformed Bundle for SessionPositionInfo", e);
        }
    }

    @Override // androidx.media3.session.f
    public final void F0(final int i, Bundle bundle, final Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            zkd.T("MediaControllerStub", "Ignoring custom command with null args.");
            return;
        }
        try {
            final v8e v8eVarA = v8e.a(bundle);
            e(new a(i, v8eVarA, bundle2) { // from class: cj9
                public final /* synthetic */ int a;
                public final /* synthetic */ v8e b;

                @Override // androidx.media3.session.m.a
                public final void f(k kVar) {
                    if (kVar.o0()) {
                        j jVarZ0 = kVar.Z0();
                        jVarZ0.getClass();
                        ka2.q(Looper.myLooper() == jVarZ0.e.getLooper());
                        u37 u37VarG = jVarZ0.d.G(this.b);
                        u37VarG.a(new yg9(kVar, u37VarG, this.a), h54.a);
                    }
                }
            });
        } catch (RuntimeException e) {
            zkd.U("MediaControllerStub", "Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    @Override // androidx.media3.session.f
    public final void G0(int i, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        try {
            int iH = h();
            if (iH == -1) {
                return;
            }
            final z zVarR = z.r(iH, bundle);
            try {
                final z.a aVar = new z.a(bundle2.getBoolean(z.a.d, false), bundle2.getBoolean(z.a.e, false));
                e(new a() { // from class: bj9
                    @Override // androidx.media3.session.m.a
                    public final void f(k kVar) {
                        kVar.l1(zVarR, aVar);
                    }
                });
            } catch (RuntimeException e) {
                zkd.U("MediaControllerStub", "Ignoring malformed Bundle for BundlingExclusions", e);
            }
        } catch (RuntimeException e2) {
            zkd.U("MediaControllerStub", "Ignoring malformed Bundle for PlayerInfo", e2);
        }
    }

    @Override // androidx.media3.session.f
    public final void K(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            k1(i, wu8.a(bundle));
        } catch (RuntimeException e) {
            zkd.U("MediaControllerStub", "Ignoring malformed Bundle for LibraryResult", e);
        }
    }

    @Override // androidx.media3.session.f
    public final void a1(int i, Bundle bundle) {
        if (bundle == null) {
            zkd.T("MediaControllerStub", "Ignoring null Bundle for extras");
        } else {
            e(new g9(bundle, 8));
        }
    }

    @Override // androidx.media3.session.f
    public final void d(int i) {
        e(new l6());
    }

    @Override // androidx.media3.session.f
    @Deprecated
    public final void d1(int i, Bundle bundle, boolean z) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(z.a.d, z);
        bundle2.putBoolean(z.a.e, true);
        G0(i, bundle, bundle2);
    }

    public final <T extends k> void e(a<T> aVar) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            k kVar = this.a.get();
            if (kVar == null) {
                return;
            }
            vjg.T(kVar.Z0().e, new tm1(4, kVar, aVar));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // androidx.media3.session.f
    public final void f() {
        e(new b0(16));
    }

    public final int h() {
        aae aaeVar;
        k kVar = this.a.get();
        if (kVar == null || (aaeVar = kVar.m) == null) {
            return -1;
        }
        return aaeVar.a.d();
    }

    @Override // androidx.media3.session.f
    public final void k0(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            k1(i, x9e.a(bundle));
        } catch (RuntimeException e) {
            zkd.U("MediaControllerStub", "Ignoring malformed Bundle for SessionResult", e);
        }
    }

    public final <T> void k1(int i, T t) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            k kVar = this.a.get();
            if (kVar == null) {
                return;
            }
            kVar.b.d(i, t);
            kVar.Z0().U0(new hg0(kVar, i, 1));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // androidx.media3.session.f
    public final void s(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            e(new dz1(c.a(bundle), 7));
        } catch (RuntimeException e) {
            zkd.U("MediaControllerStub", "Malformed Bundle for ConnectionResult. Disconnected from the session.", e);
            f();
        }
    }
}
