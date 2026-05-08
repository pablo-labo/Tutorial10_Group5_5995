package defpackage;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.media3.session.a;
import androidx.media3.session.a0;
import androidx.media3.session.b;
import androidx.media3.session.c;
import androidx.media3.session.c.a;
import androidx.media3.session.f;
import androidx.media3.session.m;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.x;
import androidx.media3.session.z;
import defpackage.gdb;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class no2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ no2(b bVar, AtomicBoolean atomicBoolean, b.C0057b c0057b, AtomicBoolean atomicBoolean2) {
        this.b = bVar;
        this.c = atomicBoolean;
        this.e = c0057b;
        this.d = atomicBoolean2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        f fVar;
        Bundle bundleB;
        boolean z = true;
        switch (this.a) {
            case 0:
                b bVar = (b) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                b.C0057b c0057b = (b.C0057b) this.e;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.d;
                synchronized (bVar.a) {
                    try {
                        if (atomicBoolean.get()) {
                            atomicBoolean2.set(true);
                        } else {
                            bVar.c(c0057b);
                        }
                    } finally {
                    }
                    break;
                }
                return;
            default:
                x xVar = (x) this.b;
                r.d dVar = (r.d) this.c;
                s sVar = (s) this.d;
                f fVar2 = (f) this.e;
                b<IBinder> bVar2 = xVar.c;
                boolean z2 = false;
                try {
                    xVar.d.remove(dVar);
                } catch (Throwable th) {
                    th = th;
                    fVar = fVar2;
                }
                if (!sVar.k()) {
                    x.a aVar = (x.a) dVar.e;
                    ka2.r(aVar);
                    IBinder iBinderAsBinder = aVar.a.asBinder();
                    r.b bVarN = sVar.n(dVar);
                    boolean z3 = bVarN.a;
                    if (z3 || dVar.d) {
                        if (!z3) {
                            bVarN = new r.b(true, w8e.b, gdb.a.b, null, null, null);
                        }
                        if (bVar2.k(dVar)) {
                            zkd.T("MediaSessionStub", "Controller " + dVar + " has sent connection request multiple times");
                        }
                        bVar2.a(iBinderAsBinder, dVar, bVarN.b, bVarN.c);
                        a0 a0VarJ = bVar2.j(dVar);
                        if (a0VarJ != null) {
                            vdb vdbVar = sVar.t;
                            z zVar = sVar.s;
                            gdb.a aVar2 = bVarN.c;
                            z zVarE = xVar.e(zVar);
                            MediaSession.Token tokenF = sVar.f();
                            e47<a> e47Var = bVarN.d;
                            if (e47Var == null) {
                                e47Var = sVar.z;
                            }
                            e47<a> e47Var2 = e47Var;
                            e47<a> e47Var3 = bVarN.e;
                            if (e47Var3 == null) {
                                e47Var3 = sVar.A;
                            }
                            e47<a> e47Var4 = sVar.r;
                            w8e w8eVar = bVarN.b;
                            gdb.a aVarV = vdbVar.V();
                            Bundle extras = sVar.j.a.getExtras();
                            Bundle bundle = bVarN.f;
                            if (bundle == null) {
                                bundle = sVar.B;
                            }
                            try {
                                c cVar = new c(1008000300, 5, xVar, null, e47Var2, e47Var3, e47Var4, w8eVar, aVar2, aVarV, extras, bundle, zVarE, tokenF);
                                if (sVar.k()) {
                                    boa.p(fVar2);
                                    return;
                                }
                                try {
                                    int iB = a0VarJ.b();
                                    fVar = fVar2;
                                    try {
                                        if (fVar instanceof m) {
                                            bundleB = new Bundle();
                                            bundleB.putBinder(c.B, cVar.new a());
                                        } else {
                                            bundleB = cVar.b(dVar.c);
                                        }
                                        fVar.s(iB, bundleB);
                                    } catch (RemoteException unused) {
                                        z = false;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    break;
                                } catch (RemoteException unused2) {
                                    fVar = fVar2;
                                }
                                if (z) {
                                    try {
                                        if (!sVar.y || !s.l(dVar)) {
                                            sVar.e.getClass();
                                            break;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        z2 = z;
                                    }
                                }
                                if (z) {
                                    return;
                                }
                                boa.p(fVar);
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                fVar = fVar2;
                            }
                            if (!z2) {
                                boa.p(fVar);
                            }
                            throw th;
                        }
                        zkd.T("MediaSessionStub", "Ignoring connection request from unknown controller info");
                    }
                }
                boa.p(fVar2);
                return;
        }
    }

    public /* synthetic */ no2(x xVar, r.d dVar, s sVar, f fVar) {
        this.b = xVar;
        this.c = dVar;
        this.d = sVar;
        this.e = fVar;
    }
}
