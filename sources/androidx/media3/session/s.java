package androidx.media3.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseBooleanArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.session.legacy.MediaSessionCompat;
import androidx.media3.session.r;
import androidx.media3.session.t;
import androidx.media3.session.v;
import com.datadog.android.rum.metric.interactiontonextview.TimeBasedInteractionIdentifier;
import defpackage.aae;
import defpackage.akb;
import defpackage.aw5;
import defpackage.b0;
import defpackage.bh5;
import defpackage.cdb;
import defpackage.dqf;
import defpackage.e47;
import defpackage.ebe;
import defpackage.emf;
import defpackage.gdb;
import defpackage.gg2;
import defpackage.gy0;
import defpackage.hy1;
import defpackage.hz8;
import defpackage.ij9;
import defpackage.jj9;
import defpackage.ka2;
import defpackage.n6;
import defpackage.o6;
import defpackage.oj9;
import defpackage.ox0;
import defpackage.oy0;
import defpackage.q83;
import defpackage.qyc;
import defpackage.r20;
import defpackage.r6;
import defpackage.s34;
import defpackage.tog;
import defpackage.u37;
import defpackage.v7;
import defpackage.v8e;
import defpackage.v9e;
import defpackage.vdb;
import defpackage.vjg;
import defpackage.w8e;
import defpackage.wqf;
import defpackage.ws1;
import defpackage.wu0;
import defpackage.x9e;
import defpackage.xf3;
import defpackage.xk9;
import defpackage.yi0;
import defpackage.yv5;
import defpackage.z3;
import defpackage.zkd;
import defpackage.zng;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class s {
    public static final x9e C = new x9e(1);
    public final e47<androidx.media3.session.a> A;
    public Bundle B;
    public final Object a = new Object();
    public final Uri b;
    public final c c;
    public final b d;
    public final zng e;
    public final Context f;
    public final x g;
    public final t h;
    public final String i;
    public final aae j;
    public final r k;
    public final Handler l;
    public final ws1 m;
    public final v7 n;
    public final Handler o;
    public final boolean p;
    public final boolean q;
    public final e47<androidx.media3.session.a> r;
    public z s;
    public vdb t;
    public d u;
    public v.b v;
    public boolean w;
    public final long x;
    public boolean y;
    public final e47<androidx.media3.session.a> z;

    public class a implements yv5<r.e> {
        public final /* synthetic */ r.d a;
        public final /* synthetic */ boolean b;

        public a(r.d dVar, boolean z, gdb.a aVar) {
            this.a = dVar;
            this.b = z;
        }

        @Override // defpackage.yv5
        public final void onSuccess(r.e eVar) {
            s sVar = s.this;
            y.f(sVar.t, eVar);
            vjg.G(sVar.t);
            if (this.b) {
                sVar.s(this.a);
            }
        }

        @Override // defpackage.yv5
        public final void t(Throwable th) {
            if (th instanceof UnsupportedOperationException) {
                zkd.U("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
            } else {
                zkd.x("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
            }
            s sVar = s.this;
            vjg.G(sVar.t);
            if (this.b) {
                sVar.s(this.a);
            }
        }
    }

    public class b extends Handler {
        public oy0 a;

        public b(Looper looper) {
            super(looper);
        }
    }

    public class c extends Handler {
        public boolean a;
        public boolean b;

        public c(Looper looper) {
            super(looper);
            this.a = true;
            this.b = true;
        }

        public final void a(boolean z, boolean z2) {
            boolean z3 = false;
            this.a = this.a && z;
            if (this.b && z2) {
                z3 = true;
            }
            this.b = z3;
            if (hasMessages(1)) {
                return;
            }
            sendEmptyMessage(1);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            r.d dVar;
            int iB;
            r.c cVar;
            z zVar;
            s sVar = s.this;
            x xVar = sVar.g;
            if (message.what != 1) {
                o6.i(message.what, "Invalid message what=");
                return;
            }
            z zVarN = sVar.s.n(sVar.t.U0(), sVar.t.o0(), sVar.s.k);
            sVar.s = zVarN;
            boolean z = this.a;
            boolean z2 = this.b;
            z zVarE = xVar.e(zVarN);
            androidx.media3.session.b<IBinder> bVar = xVar.c;
            e47<r.d> e47VarF = bVar.f();
            for (int i = 0; i < e47VarF.size(); i++) {
                r.d dVar2 = e47VarF.get(i);
                try {
                    a0 a0VarJ = bVar.j(dVar2);
                    if (a0VarJ != null) {
                        iB = a0VarJ.b();
                    } else if (!sVar.i(dVar2)) {
                        break;
                    } else {
                        iB = 0;
                    }
                    z zVarI = bVar.i(dVar2);
                    if (zVarI == null) {
                        bVar.h(dVar2);
                        gdb.a aVarD = y.d(bVar.e(dVar2), sVar.t.V());
                        try {
                            cVar = dVar2.e;
                            ka2.r(cVar);
                            if (zVarI == null) {
                                dVar = dVar2;
                                zVar = zVarE;
                            } else {
                                dVar = dVar2;
                                zVar = zVarI;
                            }
                        } catch (DeadObjectException unused) {
                            dVar = dVar2;
                        } catch (RemoteException e) {
                            e = e;
                            dVar = dVar2;
                        }
                        try {
                            cVar.c(iB, zVar, aVarD, z, z2);
                        } catch (DeadObjectException unused2) {
                            xVar.c.o(dVar);
                        } catch (RemoteException e2) {
                            e = e2;
                            zkd.U("MediaSessionImpl", "Exception in " + dVar, e);
                        }
                    }
                } catch (DeadObjectException unused3) {
                    dVar = dVar2;
                } catch (RemoteException e3) {
                    e = e3;
                    dVar = dVar2;
                }
            }
            this.a = true;
            this.b = true;
        }
    }

    public static class d implements gdb.c {
        public final WeakReference<s> a;
        public final WeakReference<vdb> b;

        public d(s sVar, vdb vdbVar) {
            this.a = new WeakReference<>(sVar);
            this.b = new WeakReference<>(vdbVar);
        }

        @Override // gdb.c
        public final void A(long j) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            if (this.b.get() == null) {
                return;
            }
            z zVar = sVarX.s;
            PlaybackException playbackException = zVar.a;
            int i = zVar.b;
            v9e v9eVar = zVar.c;
            gdb.d dVar = zVar.d;
            gdb.d dVar2 = zVar.e;
            int i2 = zVar.f;
            cdb cdbVar = zVar.g;
            int i3 = zVar.h;
            boolean z = zVar.i;
            emf emfVar = zVar.j;
            int i4 = zVar.k;
            tog togVar = zVar.l;
            oj9 oj9Var = zVar.m;
            float f = zVar.n;
            ox0 ox0Var = zVar.o;
            q83 q83Var = zVar.p;
            s34 s34Var = zVar.q;
            int i5 = zVar.r;
            boolean z2 = zVar.s;
            boolean z3 = zVar.t;
            int i6 = zVar.u;
            boolean z4 = zVar.v;
            boolean z5 = zVar.w;
            int i7 = zVar.x;
            int i8 = zVar.y;
            oj9 oj9Var2 = zVar.z;
            long j2 = zVar.B;
            long j3 = zVar.C;
            wqf wqfVar = zVar.D;
            dqf dqfVar = zVar.E;
            ka2.q(emfVar.p() || v9eVar.a.b < emfVar.o());
            sVarX.s = new z(playbackException, i, v9eVar, dVar, dVar2, i2, cdbVar, i3, z, togVar, emfVar, i4, oj9Var, f, ox0Var, q83Var, s34Var, i5, z2, z3, i6, i7, i8, z4, z5, oj9Var2, j, j2, j3, wqfVar, dqfVar);
            sVarX.c.a(true, true);
            try {
                sVarX.h.i.getClass();
            } catch (RemoteException e) {
                zkd.x("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }

        @Override // gdb.c
        public final void B(int i, gdb.d dVar, gdb.d dVar2) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            if (this.b.get() == null) {
                return;
            }
            sVarX.s = sVarX.s.h(i, dVar, dVar2);
            sVarX.c.a(true, true);
            try {
                t tVar = t.this;
                tVar.M(tVar.g.t);
            } catch (RemoteException e) {
                zkd.x("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }

        @Override // gdb.c
        public final void E(oj9 oj9Var) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            sVarX.s = sVarX.s.g(oj9Var);
            sVarX.c.a(true, true);
            try {
                sVarX.h.i.n(oj9Var);
            } catch (RemoteException e) {
                zkd.x("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }

        @Override // gdb.c
        public final void H() {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            androidx.media3.session.b<IBinder> bVar = sVarX.g.c;
            e47<r.d> e47VarF = bVar.f();
            for (int i = 0; i < e47VarF.size(); i++) {
                r.d dVar = e47VarF.get(i);
                bVar.h(dVar);
                sVarX.c(dVar, new n6(7));
            }
        }

        @Override // gdb.c
        public final void N(s34 s34Var) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            if (this.b.get() == null) {
                return;
            }
            z zVar = sVarX.s;
            PlaybackException playbackException = zVar.a;
            int i = zVar.b;
            v9e v9eVar = zVar.c;
            gdb.d dVar = zVar.d;
            gdb.d dVar2 = zVar.e;
            int i2 = zVar.f;
            cdb cdbVar = zVar.g;
            int i3 = zVar.h;
            boolean z = zVar.i;
            emf emfVar = zVar.j;
            int i4 = zVar.k;
            tog togVar = zVar.l;
            oj9 oj9Var = zVar.m;
            float f = zVar.n;
            ox0 ox0Var = zVar.o;
            q83 q83Var = zVar.p;
            int i5 = zVar.r;
            boolean z2 = zVar.s;
            boolean z3 = zVar.t;
            int i6 = zVar.u;
            boolean z4 = zVar.v;
            boolean z5 = zVar.w;
            int i7 = zVar.x;
            int i8 = zVar.y;
            oj9 oj9Var2 = zVar.z;
            long j = zVar.A;
            long j2 = zVar.B;
            long j3 = zVar.C;
            wqf wqfVar = zVar.D;
            dqf dqfVar = zVar.E;
            ka2.q(emfVar.p() || v9eVar.a.b < emfVar.o());
            sVarX.s = new z(playbackException, i, v9eVar, dVar, dVar2, i2, cdbVar, i3, z, togVar, emfVar, i4, oj9Var, f, ox0Var, q83Var, s34Var, i5, z2, z3, i6, i7, i8, z4, z5, oj9Var2, j, j2, j3, wqfVar, dqfVar);
            sVarX.c.a(true, true);
            try {
                sVarX.h.i.k();
            } catch (RemoteException e) {
                zkd.x("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }

        @Override // gdb.c
        public final void S(ox0 ox0Var) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            if (this.b.get() == null) {
                return;
            }
            sVarX.s = sVarX.s.a(ox0Var);
            sVarX.c.a(true, true);
            try {
                sVarX.h.i.j(ox0Var);
            } catch (RemoteException e) {
                zkd.x("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }

        @Override // gdb.c
        public final void T(dqf dqfVar) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            if (this.b.get() == null) {
                return;
            }
            sVarX.s = sVarX.s.o(dqfVar);
            sVarX.c.a(true, true);
            sVarX.d(new b0(dqfVar, 17));
        }

        @Override // gdb.c
        public final void U(boolean z) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            if (this.b.get() == null) {
                return;
            }
            z zVar = sVarX.s;
            PlaybackException playbackException = zVar.a;
            int i = zVar.b;
            v9e v9eVar = zVar.c;
            gdb.d dVar = zVar.d;
            gdb.d dVar2 = zVar.e;
            int i2 = zVar.f;
            cdb cdbVar = zVar.g;
            int i3 = zVar.h;
            boolean z2 = zVar.i;
            emf emfVar = zVar.j;
            int i4 = zVar.k;
            tog togVar = zVar.l;
            oj9 oj9Var = zVar.m;
            float f = zVar.n;
            ox0 ox0Var = zVar.o;
            q83 q83Var = zVar.p;
            s34 s34Var = zVar.q;
            int i5 = zVar.r;
            boolean z3 = zVar.s;
            boolean z4 = zVar.t;
            int i6 = zVar.u;
            boolean z5 = zVar.v;
            int i7 = zVar.x;
            int i8 = zVar.y;
            oj9 oj9Var2 = zVar.z;
            long j = zVar.A;
            long j2 = zVar.B;
            long j3 = zVar.C;
            wqf wqfVar = zVar.D;
            dqf dqfVar = zVar.E;
            ka2.q(emfVar.p() || v9eVar.a.b < emfVar.o());
            sVarX.s = new z(playbackException, i, v9eVar, dVar, dVar2, i2, cdbVar, i3, z2, togVar, emfVar, i4, oj9Var, f, ox0Var, q83Var, s34Var, i5, z3, z4, i6, i7, i8, z5, z, oj9Var2, j, j2, j3, wqfVar, dqfVar);
            sVarX.c.a(true, true);
            try {
                sVarX.h.i.getClass();
            } catch (RemoteException e) {
                zkd.x("MediaSessionImpl", "Exception in using media1 API", e);
            }
            sVarX.w();
        }

        @Override // gdb.c
        public final void V(int i, boolean z) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            if (this.b.get() == null) {
                return;
            }
            z zVar = sVarX.s;
            sVarX.s = zVar.d(i, zVar.x, z);
            sVarX.c.a(true, true);
            try {
                t tVar = t.this;
                tVar.M(tVar.g.t);
            } catch (RemoteException e) {
                zkd.x("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }

        @Override // gdb.c
        public final void W(float f) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            sVarX.s = sVarX.s.p(f);
            sVarX.c.a(true, true);
            try {
                sVarX.h.i.getClass();
            } catch (RemoteException e) {
                zkd.x("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }

        @Override // gdb.c
        public final void X(int i, ij9 ij9Var) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            if (this.b.get() == null) {
                return;
            }
            z zVar = sVarX.s;
            PlaybackException playbackException = zVar.a;
            v9e v9eVar = zVar.c;
            gdb.d dVar = zVar.d;
            gdb.d dVar2 = zVar.e;
            int i2 = zVar.f;
            cdb cdbVar = zVar.g;
            int i3 = zVar.h;
            boolean z = zVar.i;
            emf emfVar = zVar.j;
            int i4 = zVar.k;
            tog togVar = zVar.l;
            oj9 oj9Var = zVar.m;
            float f = zVar.n;
            ox0 ox0Var = zVar.o;
            q83 q83Var = zVar.p;
            s34 s34Var = zVar.q;
            int i5 = zVar.r;
            boolean z2 = zVar.s;
            boolean z3 = zVar.t;
            int i6 = zVar.u;
            boolean z4 = zVar.v;
            boolean z5 = zVar.w;
            int i7 = zVar.x;
            int i8 = zVar.y;
            oj9 oj9Var2 = zVar.z;
            long j = zVar.A;
            long j2 = zVar.B;
            long j3 = zVar.C;
            wqf wqfVar = zVar.D;
            dqf dqfVar = zVar.E;
            ka2.q(emfVar.p() || v9eVar.a.b < emfVar.o());
            sVarX.s = new z(playbackException, i, v9eVar, dVar, dVar2, i2, cdbVar, i3, z, togVar, emfVar, i4, oj9Var, f, ox0Var, q83Var, s34Var, i5, z2, z3, i6, i7, i8, z4, z5, oj9Var2, j, j2, j3, wqfVar, dqfVar);
            sVarX.c.a(true, true);
            try {
                sVarX.h.i.l(ij9Var);
            } catch (RemoteException e) {
                zkd.x("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }

        @Override // gdb.c
        public final void a(tog togVar) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            z zVar = sVarX.s;
            PlaybackException playbackException = zVar.a;
            int i = zVar.b;
            v9e v9eVar = zVar.c;
            gdb.d dVar = zVar.d;
            gdb.d dVar2 = zVar.e;
            int i2 = zVar.f;
            cdb cdbVar = zVar.g;
            int i3 = zVar.h;
            boolean z = zVar.i;
            emf emfVar = zVar.j;
            int i4 = zVar.k;
            oj9 oj9Var = zVar.m;
            float f = zVar.n;
            ox0 ox0Var = zVar.o;
            q83 q83Var = zVar.p;
            s34 s34Var = zVar.q;
            int i5 = zVar.r;
            boolean z2 = zVar.s;
            boolean z3 = zVar.t;
            int i6 = zVar.u;
            boolean z4 = zVar.v;
            boolean z5 = zVar.w;
            int i7 = zVar.x;
            int i8 = zVar.y;
            oj9 oj9Var2 = zVar.z;
            long j = zVar.A;
            long j2 = zVar.B;
            long j3 = zVar.C;
            wqf wqfVar = zVar.D;
            dqf dqfVar = zVar.E;
            ka2.q(emfVar.p() || v9eVar.a.b < emfVar.o());
            sVarX.s = new z(playbackException, i, v9eVar, dVar, dVar2, i2, cdbVar, i3, z, togVar, emfVar, i4, oj9Var, f, ox0Var, q83Var, s34Var, i5, z2, z3, i6, i7, i8, z4, z5, oj9Var2, j, j2, j3, wqfVar, dqfVar);
            sVarX.c.a(true, true);
            try {
                sVarX.h.i.getClass();
            } catch (RemoteException e) {
                zkd.x("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }

        @Override // gdb.c
        public final void b0(q83 q83Var) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            if (this.b.get() == null) {
                return;
            }
            z zVar = sVarX.s;
            PlaybackException playbackException = zVar.a;
            int i = zVar.b;
            v9e v9eVar = zVar.c;
            gdb.d dVar = zVar.d;
            gdb.d dVar2 = zVar.e;
            int i2 = zVar.f;
            cdb cdbVar = zVar.g;
            int i3 = zVar.h;
            boolean z = zVar.i;
            emf emfVar = zVar.j;
            int i4 = zVar.k;
            tog togVar = zVar.l;
            oj9 oj9Var = zVar.m;
            float f = zVar.n;
            ox0 ox0Var = zVar.o;
            s34 s34Var = zVar.q;
            int i5 = zVar.r;
            boolean z2 = zVar.s;
            boolean z3 = zVar.t;
            int i6 = zVar.u;
            boolean z4 = zVar.v;
            boolean z5 = zVar.w;
            int i7 = zVar.x;
            int i8 = zVar.y;
            oj9 oj9Var2 = zVar.z;
            long j = zVar.A;
            long j2 = zVar.B;
            long j3 = zVar.C;
            wqf wqfVar = zVar.D;
            dqf dqfVar = zVar.E;
            ka2.q(emfVar.p() || v9eVar.a.b < emfVar.o());
            sVarX.s = new z(playbackException, i, v9eVar, dVar, dVar2, i2, cdbVar, i3, z, togVar, emfVar, i4, oj9Var, f, ox0Var, q83Var, s34Var, i5, z2, z3, i6, i7, i8, z4, z5, oj9Var2, j, j2, j3, wqfVar, dqfVar);
            sVarX.c.a(true, true);
        }

        @Override // gdb.c
        public final void f0(wqf wqfVar) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            if (this.b.get() == null) {
                return;
            }
            sVarX.s = sVarX.s.b(wqfVar);
            sVarX.c.a(true, false);
            sVarX.d(new akb());
        }

        @Override // gdb.c
        public final void g(PlaybackException playbackException) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            if (this.b.get() == null) {
                return;
            }
            z zVar = sVarX.s;
            int i = zVar.b;
            v9e v9eVar = zVar.c;
            gdb.d dVar = zVar.d;
            gdb.d dVar2 = zVar.e;
            int i2 = zVar.f;
            cdb cdbVar = zVar.g;
            int i3 = zVar.h;
            boolean z = zVar.i;
            emf emfVar = zVar.j;
            int i4 = zVar.k;
            tog togVar = zVar.l;
            oj9 oj9Var = zVar.m;
            float f = zVar.n;
            ox0 ox0Var = zVar.o;
            q83 q83Var = zVar.p;
            s34 s34Var = zVar.q;
            int i5 = zVar.r;
            boolean z2 = zVar.s;
            boolean z3 = zVar.t;
            int i6 = zVar.u;
            boolean z4 = zVar.v;
            boolean z5 = zVar.w;
            int i7 = zVar.x;
            int i8 = zVar.y;
            oj9 oj9Var2 = zVar.z;
            long j = zVar.A;
            long j2 = zVar.B;
            long j3 = zVar.C;
            wqf wqfVar = zVar.D;
            dqf dqfVar = zVar.E;
            ka2.q(emfVar.p() || v9eVar.a.b < emfVar.o());
            sVarX.s = new z(playbackException, i, v9eVar, dVar, dVar2, i2, cdbVar, i3, z, togVar, emfVar, i4, oj9Var, f, ox0Var, q83Var, s34Var, i5, z2, z3, i6, i7, i8, z4, z5, oj9Var2, j, j2, j3, wqfVar, dqfVar);
            sVarX.c.a(true, true);
            try {
                t tVar = t.this;
                tVar.M(tVar.g.t);
            } catch (RemoteException e) {
                zkd.x("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }

        @Override // gdb.c
        public final void h0(oj9 oj9Var) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            if (this.b.get() == null) {
                return;
            }
            z zVar = sVarX.s;
            PlaybackException playbackException = zVar.a;
            int i = zVar.b;
            v9e v9eVar = zVar.c;
            gdb.d dVar = zVar.d;
            gdb.d dVar2 = zVar.e;
            int i2 = zVar.f;
            cdb cdbVar = zVar.g;
            int i3 = zVar.h;
            boolean z = zVar.i;
            emf emfVar = zVar.j;
            int i4 = zVar.k;
            tog togVar = zVar.l;
            oj9 oj9Var2 = zVar.m;
            float f = zVar.n;
            ox0 ox0Var = zVar.o;
            q83 q83Var = zVar.p;
            s34 s34Var = zVar.q;
            int i5 = zVar.r;
            boolean z2 = zVar.s;
            boolean z3 = zVar.t;
            int i6 = zVar.u;
            boolean z4 = zVar.v;
            boolean z5 = zVar.w;
            int i7 = zVar.x;
            int i8 = zVar.y;
            long j = zVar.A;
            long j2 = zVar.B;
            long j3 = zVar.C;
            wqf wqfVar = zVar.D;
            dqf dqfVar = zVar.E;
            ka2.q(emfVar.p() || v9eVar.a.b < emfVar.o());
            sVarX.s = new z(playbackException, i, v9eVar, dVar, dVar2, i2, cdbVar, i3, z, togVar, emfVar, i4, oj9Var2, f, ox0Var, q83Var, s34Var, i5, z2, z3, i6, i7, i8, z4, z5, oj9Var, j, j2, j3, wqfVar, dqfVar);
            sVarX.c.a(true, true);
            try {
                sVarX.h.i.r();
            } catch (RemoteException e) {
                zkd.x("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }

        @Override // gdb.c
        public final void i0(long j) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            if (this.b.get() == null) {
                return;
            }
            z zVar = sVarX.s;
            PlaybackException playbackException = zVar.a;
            int i = zVar.b;
            v9e v9eVar = zVar.c;
            gdb.d dVar = zVar.d;
            gdb.d dVar2 = zVar.e;
            int i2 = zVar.f;
            cdb cdbVar = zVar.g;
            int i3 = zVar.h;
            boolean z = zVar.i;
            emf emfVar = zVar.j;
            int i4 = zVar.k;
            tog togVar = zVar.l;
            oj9 oj9Var = zVar.m;
            float f = zVar.n;
            ox0 ox0Var = zVar.o;
            q83 q83Var = zVar.p;
            s34 s34Var = zVar.q;
            int i5 = zVar.r;
            boolean z2 = zVar.s;
            boolean z3 = zVar.t;
            int i6 = zVar.u;
            boolean z4 = zVar.v;
            boolean z5 = zVar.w;
            int i7 = zVar.x;
            int i8 = zVar.y;
            oj9 oj9Var2 = zVar.z;
            long j2 = zVar.A;
            long j3 = zVar.C;
            wqf wqfVar = zVar.D;
            dqf dqfVar = zVar.E;
            ka2.q(emfVar.p() || v9eVar.a.b < emfVar.o());
            sVarX.s = new z(playbackException, i, v9eVar, dVar, dVar2, i2, cdbVar, i3, z, togVar, emfVar, i4, oj9Var, f, ox0Var, q83Var, s34Var, i5, z2, z3, i6, i7, i8, z4, z5, oj9Var2, j2, j, j3, wqfVar, dqfVar);
            sVarX.c.a(true, true);
            try {
                sVarX.h.i.getClass();
            } catch (RemoteException e) {
                zkd.x("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }

        @Override // gdb.c
        public final void j0(emf emfVar, int i) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            vdb vdbVar = this.b.get();
            if (vdbVar == null) {
                return;
            }
            sVarX.s = sVarX.s.n(emfVar, vdbVar.o0(), i);
            sVarX.c.a(false, true);
            try {
                sVarX.h.i.q(emfVar);
            } catch (RemoteException e) {
                zkd.x("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }

        @Override // gdb.c
        public final void m(int i) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            if (this.b.get() == null) {
                return;
            }
            sVarX.s = sVarX.s.i(i);
            sVarX.c.a(true, true);
            try {
                sVarX.h.i.o(i);
            } catch (RemoteException e) {
                zkd.x("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }

        @Override // gdb.c
        public final void n(int i) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            if (this.b.get() == null) {
                return;
            }
            z zVar = sVarX.s;
            sVarX.s = zVar.d(zVar.u, i, zVar.t);
            sVarX.c.a(true, true);
            try {
                t tVar = t.this;
                tVar.M(tVar.g.t);
            } catch (RemoteException e) {
                zkd.x("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }

        @Override // gdb.c
        public final void o0(cdb cdbVar) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            if (this.b.get() == null) {
                return;
            }
            sVarX.s = sVarX.s.e(cdbVar);
            sVarX.c.a(true, true);
            try {
                t tVar = t.this;
                tVar.M(tVar.g.t);
            } catch (RemoteException e) {
                zkd.x("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }

        @Override // gdb.c
        public final void p0(gdb.a aVar) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            if (this.b.get() == null) {
                return;
            }
            sVarX.g(aVar);
        }

        @Override // gdb.c
        public final void r0(long j) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            if (this.b.get() == null) {
                return;
            }
            z zVar = sVarX.s;
            PlaybackException playbackException = zVar.a;
            int i = zVar.b;
            v9e v9eVar = zVar.c;
            gdb.d dVar = zVar.d;
            gdb.d dVar2 = zVar.e;
            int i2 = zVar.f;
            cdb cdbVar = zVar.g;
            int i3 = zVar.h;
            boolean z = zVar.i;
            emf emfVar = zVar.j;
            int i4 = zVar.k;
            tog togVar = zVar.l;
            oj9 oj9Var = zVar.m;
            float f = zVar.n;
            ox0 ox0Var = zVar.o;
            q83 q83Var = zVar.p;
            s34 s34Var = zVar.q;
            int i5 = zVar.r;
            boolean z2 = zVar.s;
            boolean z3 = zVar.t;
            int i6 = zVar.u;
            boolean z4 = zVar.v;
            boolean z5 = zVar.w;
            int i7 = zVar.x;
            int i8 = zVar.y;
            oj9 oj9Var2 = zVar.z;
            long j2 = zVar.A;
            long j3 = zVar.B;
            wqf wqfVar = zVar.D;
            dqf dqfVar = zVar.E;
            ka2.q(emfVar.p() || v9eVar.a.b < emfVar.o());
            sVarX.s = new z(playbackException, i, v9eVar, dVar, dVar2, i2, cdbVar, i3, z, togVar, emfVar, i4, oj9Var, f, ox0Var, q83Var, s34Var, i5, z2, z3, i6, i7, i8, z4, z5, oj9Var2, j2, j3, j, wqfVar, dqfVar);
            sVarX.c.a(true, true);
        }

        @Override // gdb.c
        public final void s(int i) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            vdb vdbVar = this.b.get();
            if (vdbVar == null) {
                return;
            }
            sVarX.s = sVarX.s.f(i, vdbVar.a());
            sVarX.c.a(true, true);
            try {
                t.e eVar = sVarX.h.i;
                vdbVar.a();
                t tVar = t.this;
                tVar.M(tVar.g.t);
            } catch (RemoteException e) {
                zkd.x("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }

        @Override // gdb.c
        public final void v(boolean z) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            if (this.b.get() == null) {
                return;
            }
            sVarX.s = sVarX.s.k(z);
            sVarX.c.a(true, true);
            try {
                sVarX.h.i.p(z);
            } catch (RemoteException e) {
                zkd.x("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }

        @Override // gdb.c
        public final void v0(boolean z) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            if (this.b.get() == null) {
                return;
            }
            z zVar = sVarX.s;
            PlaybackException playbackException = zVar.a;
            int i = zVar.b;
            v9e v9eVar = zVar.c;
            gdb.d dVar = zVar.d;
            gdb.d dVar2 = zVar.e;
            int i2 = zVar.f;
            cdb cdbVar = zVar.g;
            int i3 = zVar.h;
            boolean z2 = zVar.i;
            emf emfVar = zVar.j;
            int i4 = zVar.k;
            tog togVar = zVar.l;
            oj9 oj9Var = zVar.m;
            float f = zVar.n;
            ox0 ox0Var = zVar.o;
            q83 q83Var = zVar.p;
            s34 s34Var = zVar.q;
            int i5 = zVar.r;
            boolean z3 = zVar.s;
            boolean z4 = zVar.t;
            int i6 = zVar.u;
            boolean z5 = zVar.w;
            int i7 = zVar.x;
            int i8 = zVar.y;
            oj9 oj9Var2 = zVar.z;
            long j = zVar.A;
            long j2 = zVar.B;
            long j3 = zVar.C;
            wqf wqfVar = zVar.D;
            dqf dqfVar = zVar.E;
            ka2.q(emfVar.p() || v9eVar.a.b < emfVar.o());
            sVarX.s = new z(playbackException, i, v9eVar, dVar, dVar2, i2, cdbVar, i3, z2, togVar, emfVar, i4, oj9Var, f, ox0Var, q83Var, s34Var, i5, z3, z4, i6, i7, i8, z, z5, oj9Var2, j, j2, j3, wqfVar, dqfVar);
            sVarX.c.a(true, true);
            try {
                t tVar = t.this;
                tVar.M(tVar.g.t);
            } catch (RemoteException e) {
                zkd.x("MediaSessionImpl", "Exception in using media1 API", e);
            }
            sVarX.w();
        }

        public final s x() {
            return this.a.get();
        }

        @Override // gdb.c
        public final void z(int i, boolean z) {
            s sVarX = x();
            if (sVarX == null) {
                return;
            }
            sVarX.x();
            if (this.b.get() == null) {
                return;
            }
            sVarX.s = sVarX.s.c(i, z);
            sVarX.c.a(true, true);
            try {
                xk9 xk9Var = t.this.n;
                if (xk9Var != null) {
                    if (z) {
                        i = 0;
                    }
                    xk9Var.d = i;
                    xk9Var.a().setCurrentVolume(i);
                }
            } catch (RemoteException e) {
                zkd.x("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    public interface e {
        void i(r.c cVar, int i);
    }

    public s(r rVar, Context context, String str, gdb gdbVar, e47 e47Var, e47 e47Var2, e47 e47Var3, zng zngVar, Bundle bundle, Bundle bundle2, ws1 ws1Var) {
        zkd.D("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + vjg.a + "]");
        this.k = rVar;
        this.f = context;
        this.i = str;
        this.z = e47Var;
        this.A = e47Var2;
        this.r = e47Var3;
        this.e = zngVar;
        this.B = bundle2;
        this.m = ws1Var;
        this.p = true;
        this.q = true;
        x xVar = new x(this);
        this.g = xVar;
        this.o = new Handler(Looper.getMainLooper());
        Looper looperQ0 = gdbVar.Q0();
        Handler handler = new Handler(looperQ0);
        this.l = handler;
        this.s = z.F;
        this.c = new c(looperQ0);
        this.d = new b(looperQ0);
        Uri uriBuild = new Uri.Builder().scheme(s.class.getName()).appendPath(str).appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.b = uriBuild;
        t tVar = new t(this, uriBuild, handler, bundle, e47Var, e47Var2, r.b.g, r.b.h, bundle2);
        this.h = tVar;
        this.j = new aae(Process.myUid(), 1008000300, 5, context.getPackageName(), xVar, bundle, tVar.k.a.c.b);
        vdb vdbVar = new vdb(gdbVar);
        this.t = vdbVar;
        vjg.T(handler, new yi0(5, this, vdbVar));
        this.x = TimeBasedInteractionIdentifier.DEFAULT_TIME_THRESHOLD_MS;
        this.n = new v7(this, 4);
        vjg.T(handler, new hy1(this, 2));
    }

    public static void a(s sVar) {
        synchronized (sVar.a) {
            try {
                if (sVar.w) {
                    return;
                }
                final v9e v9eVarO0 = sVar.t.o0();
                if (!sVar.c.hasMessages(1) && y.a(v9eVarO0, sVar.s.c)) {
                    androidx.media3.session.b<IBinder> bVar = sVar.g.c;
                    e47<r.d> e47VarF = bVar.f();
                    for (int i = 0; i < e47VarF.size(); i++) {
                        final r.d dVar = e47VarF.get(i);
                        bVar.h(dVar);
                        final boolean zL = bVar.l(dVar, 16);
                        final boolean zL2 = bVar.l(dVar, 17);
                        sVar.c(dVar, new e() { // from class: gk9
                            @Override // androidx.media3.session.s.e
                            public final void i(r.c cVar, int i2) {
                                cVar.g(i2, v9eVarO0, zL, zL2, dVar.c);
                            }
                        });
                    }
                    try {
                        sVar.h.i.g(0, v9eVarO0, true, true, 0);
                    } catch (RemoteException e2) {
                        zkd.x("MediaSessionImpl", "Exception in using media1 API", e2);
                    }
                }
                sVar.w();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean l(r.d dVar) {
        return dVar != null && Objects.equals(dVar.a.a.a, "com.android.systemui");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.KeyEvent r5, boolean r6, final boolean r7) {
        /*
            r4 = this;
            androidx.media3.session.r r0 = r4.k
            androidx.media3.session.s r0 = r0.a
            androidx.media3.session.r$d r0 = r0.e()
            r0.getClass()
            int r5 = r5.getKeyCode()
            r1 = 85
            if (r5 == r1) goto L17
            r1 = 79
            if (r5 != r1) goto L1b
        L17:
            if (r6 == 0) goto L1b
            r5 = 87
        L1b:
            r6 = 126(0x7e, float:1.77E-43)
            r1 = 1
            if (r5 == r6) goto L6c
            r6 = 127(0x7f, float:1.78E-43)
            r2 = 2
            if (r5 == r6) goto L66
            r6 = 272(0x110, float:3.81E-43)
            if (r5 == r6) goto L60
            r6 = 273(0x111, float:3.83E-43)
            r3 = 3
            if (r5 == r6) goto L5a
            r6 = 0
            switch(r5) {
                case 85: goto L45;
                case 86: goto L3f;
                case 87: goto L60;
                case 88: goto L5a;
                case 89: goto L39;
                case 90: goto L33;
                default: goto L32;
            }
        L32:
            return r6
        L33:
            xf3 r5 = new xf3
            r5.<init>(r2, r4, r0)
            goto L72
        L39:
            p9 r5 = new p9
            r5.<init>(r3, r4, r0)
            goto L72
        L3f:
            ek9 r5 = new ek9
            r5.<init>(r6, r4, r0)
            goto L72
        L45:
            vdb r5 = r4.t
            boolean r5 = r5.W()
            if (r5 == 0) goto L53
            jy0 r5 = new jy0
            r5.<init>(r3, r4, r0)
            goto L72
        L53:
            ky0 r5 = new ky0
            r6 = 4
            r5.<init>(r6, r4, r0)
            goto L72
        L5a:
            yb3 r5 = new yb3
            r5.<init>(r3, r4, r0)
            goto L72
        L60:
            ny0 r5 = new ny0
            r5.<init>(r1, r4, r0)
            goto L72
        L66:
            my0 r5 = new my0
            r5.<init>(r2, r4, r0)
            goto L72
        L6c:
            tm1 r5 = new tm1
            r6 = 5
            r5.<init>(r6, r4, r0)
        L72:
            fk9 r6 = new fk9
            r6.<init>()
            android.os.Handler r4 = r4.l
            defpackage.vjg.T(r4, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.s.b(android.view.KeyEvent, boolean, boolean):boolean");
    }

    public final void c(r.d dVar, e eVar) {
        int iB;
        x xVar = this.g;
        try {
            a0 a0VarJ = xVar.c.j(dVar);
            if (a0VarJ != null) {
                iB = a0VarJ.b();
            } else if (!i(dVar)) {
                return;
            } else {
                iB = 0;
            }
            r.c cVar = dVar.e;
            if (cVar != null) {
                eVar.i(cVar, iB);
            }
        } catch (DeadObjectException unused) {
            xVar.c.o(dVar);
        } catch (RemoteException e2) {
            zkd.U("MediaSessionImpl", "Exception in " + dVar, e2);
        }
    }

    public void d(e eVar) {
        e47<r.d> e47VarF = this.g.c.f();
        for (int i = 0; i < e47VarF.size(); i++) {
            c(e47VarF.get(i), eVar);
        }
        try {
            eVar.i(this.h.i, 0);
        } catch (RemoteException e2) {
            zkd.x("MediaSessionImpl", "Exception in using media1 API", e2);
        }
    }

    public final r.d e() {
        e47<r.d> e47VarF = this.g.c.f();
        for (int i = 0; i < e47VarF.size(); i++) {
            r.d dVar = e47VarF.get(i);
            if (j(dVar)) {
                return dVar;
            }
        }
        return null;
    }

    public final MediaSession.Token f() {
        return this.h.k.a.c.b;
    }

    public final void g(gdb.a aVar) {
        this.c.a(false, false);
        d(new r20(aVar, 8));
        try {
            t.e eVar = this.h.i;
            s34 s34Var = this.s.q;
            eVar.k();
        } catch (RemoteException e2) {
            zkd.x("MediaSessionImpl", "Exception in using media1 API", e2);
        }
    }

    public final void h(r.d dVar, boolean z) {
        if (r()) {
            boolean z2 = this.t.O0(16) && this.t.M0() != null;
            boolean z3 = this.t.O0(31) || this.t.O0(20);
            r.d dVarV = v(dVar);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            ka2.q(!false);
            sparseBooleanArray.append(1, true);
            ka2.q(!false);
            gdb.a aVar = new gdb.a(new bh5(sparseBooleanArray));
            if (z2 || !z3) {
                if (!z2) {
                    zkd.T("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                }
                vjg.G(this.t);
                if (z) {
                    s(dVarV);
                    return;
                }
                return;
            }
            this.e.getClass();
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            u37.a aVar2 = new u37.a();
            aVar2.m(unsupportedOperationException);
            aVar2.a(new aw5.a(aVar2, new a(dVarV, z, aVar)), new Executor() { // from class: hk9
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    vjg.T(this.a.l, runnable);
                }
            });
        }
    }

    public boolean i(r.d dVar) {
        return this.g.c.k(dVar) || this.h.f.k(dVar);
    }

    public final boolean j(r.d dVar) {
        return Objects.equals(dVar.a.a.a, this.f.getPackageName()) && dVar.b != 0 && new Bundle(dVar.f).getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    public final boolean k() {
        boolean z;
        synchronized (this.a) {
            z = this.w;
        }
        return z;
    }

    public final hz8<List<ij9>> m(r.d dVar, List<ij9> list) {
        v(dVar);
        this.e.getClass();
        return r.a.b(list);
    }

    public final r.b n(r.d dVar) {
        r.b bVar;
        boolean z = this.y;
        t tVar = this.h;
        if (z && l(dVar)) {
            tVar.getClass();
            w8e w8eVar = r.b.g;
            w8e w8eVar2 = tVar.v;
            w8eVar2.getClass();
            gdb.a aVar = tVar.w;
            aVar.getClass();
            e47<androidx.media3.session.a> e47Var = tVar.t;
            e47 e47VarJ = e47Var == null ? null : e47.j(e47Var);
            e47<androidx.media3.session.a> e47Var2 = tVar.u;
            return new r.b(true, w8eVar2, aVar, e47VarJ, e47Var2 != null ? e47.j(e47Var2) : null, null);
        }
        this.e.getClass();
        r rVar = this.k;
        rVar.getClass();
        s sVar = rVar.a;
        dVar.getClass();
        try {
            gdb.a aVar2 = r.b.h;
            aVar2.getClass();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            bh5 bh5Var = aVar2.a;
            for (int i = 0; i < bh5Var.a.size(); i++) {
                int iB = bh5Var.b(i);
                ka2.q(!false);
                sparseBooleanArray.append(iB, true);
            }
            ka2.q(!false);
            sparseBooleanArray.append(12, true);
            ka2.q(!false);
            sparseBooleanArray.append(11, true);
            ka2.q(!false);
            gdb.a aVar3 = new gdb.a(new bh5(sparseBooleanArray));
            w8e w8eVar3 = r.b.g;
            w8eVar3.getClass();
            HashSet hashSet = new HashSet(w8eVar3.a);
            Bundle bundle = Bundle.EMPTY;
            hashSet.add(new v8e("SEEK_REWIND", bundle));
            hashSet.add(new v8e("SEEK_FORWARD", bundle));
            bVar = new r.b(true, new w8e(hashSet), aVar3, null, null, null);
        } catch (Exception unused) {
            w8e w8eVar4 = w8e.b;
            gdb.a aVar4 = gdb.a.b;
            qyc qycVar = qyc.e;
            bVar = new r.b(false, w8eVar4, aVar4, qycVar, qycVar, Bundle.EMPTY);
        }
        if (j(dVar) && bVar.a) {
            this.y = true;
            e47<androidx.media3.session.a> e47Var3 = bVar.e;
            if (e47Var3 == null) {
                e47Var3 = sVar.A;
            }
            if (e47Var3.isEmpty()) {
                e47<androidx.media3.session.a> e47Var4 = bVar.d;
                if (e47Var4 == null) {
                    e47Var4 = sVar.z;
                }
                tVar.t = e47Var4;
            } else {
                tVar.u = e47Var3;
                boolean z2 = tVar.s.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z3 = tVar.s.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                tVar.L();
                if (tVar.s.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z2 || tVar.s.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z3) {
                    tVar.k.a.a.setExtras(tVar.s);
                }
            }
            boolean zA = tVar.w.a(17);
            gdb.a aVar5 = bVar.c;
            boolean z4 = zA != aVar5.a(17);
            tVar.v = bVar.b;
            tVar.w = aVar5;
            if (!tVar.u.isEmpty()) {
                boolean z5 = tVar.s.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z6 = tVar.s.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                tVar.L();
                if (tVar.s.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z5 || tVar.s.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z6) {
                    tVar.k.a.a.setExtras(tVar.s);
                }
            }
            s sVar2 = tVar.g;
            if (z4) {
                vjg.T(sVar2.l, new xf3(3, tVar, sVar2.t));
                return bVar;
            }
            tVar.M(sVar2.t);
        }
        return bVar;
    }

    public final hz8<x9e> o(r.d dVar, v8e v8eVar, Bundle bundle) {
        return this.e.a(this.k, v(dVar), v8eVar, bundle);
    }

    public void p(r.d dVar) {
        if (this.y) {
            if (l(dVar)) {
                return;
            }
            if (j(dVar)) {
                this.y = false;
            }
        }
        this.e.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(androidx.media3.session.r.d r11, android.content.Intent r12) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.s.q(androidx.media3.session.r$d, android.content.Intent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ebe ebeVar = new ebe();
            this.o.post(new gy0(3, this, ebeVar));
            try {
                return ((Boolean) ebeVar.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e2) {
                z3.q(e2);
                return false;
            }
        }
        v.b bVar = this.v;
        if (bVar != null) {
            v vVar = v.this;
            int i = Build.VERSION.SDK_INT;
            if (i >= 31 && i < 33 && !vVar.a().Z) {
                return vVar.f(this.k, true);
            }
        }
        return true;
    }

    public final void s(r.d dVar) {
        v(dVar);
        this.e.getClass();
    }

    public final hz8<r.e> t(r.d dVar, List<ij9> list, final int i, final long j) {
        v(dVar);
        this.e.getClass();
        return vjg.b0(r.a.b(list), new wu0() { // from class: ck9
            @Override // defpackage.wu0
            public final hz8 apply(Object obj) {
                return aw5.K1(new r.e((List) obj, i, j));
            }
        });
    }

    public final void u() {
        String str;
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
        zkd.D("MediaSessionImpl", sb.toString());
        synchronized (this.a) {
            try {
                if (this.w) {
                    return;
                }
                this.w = true;
                b bVar = this.d;
                oy0 oy0Var = bVar.a;
                if (oy0Var != null) {
                    bVar.removeCallbacks(oy0Var);
                    bVar.a = null;
                }
                this.l.removeCallbacksAndMessages(null);
                try {
                    vjg.T(this.l, new gg2(this, 7));
                } catch (Exception e2) {
                    zkd.U("MediaSessionImpl", "Exception thrown while closing", e2);
                }
                t tVar = this.h;
                ComponentName componentName = tVar.m;
                s sVar = tVar.g;
                MediaSessionCompat mediaSessionCompat = tVar.k;
                int i = Build.VERSION.SDK_INT;
                if (i < 31) {
                    if (componentName == null) {
                        mediaSessionCompat.a.f(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", sVar.b);
                        intent.setComponent(componentName);
                        mediaSessionCompat.a.f(PendingIntent.getBroadcast(sVar.f, 0, intent, t.x));
                    }
                }
                t.f fVar = tVar.l;
                if (fVar != null) {
                    sVar.f.unregisterReceiver(fVar);
                }
                MediaSessionCompat.e eVar = mediaSessionCompat.a;
                MediaSession mediaSession = eVar.a;
                eVar.f.kill();
                if (i == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e3) {
                        Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e3);
                    }
                }
                mediaSession.setCallback(null);
                eVar.b.b.clear();
                mediaSession.release();
                x xVar = this.g;
                Set<r.d> set = xVar.d;
                androidx.media3.session.b<IBinder> bVar2 = xVar.c;
                for (r.d dVar : bVar2.f()) {
                    bVar2.o(dVar);
                    r.c cVar = dVar.e;
                    if (cVar != null) {
                        cVar.f();
                    }
                }
                Iterator<r.d> it = set.iterator();
                while (it.hasNext()) {
                    r.c cVar2 = it.next().e;
                    if (cVar2 != null) {
                        cVar2.f();
                    }
                }
                set.clear();
                xVar.b.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final r.d v(r.d dVar) {
        if (!this.y || !l(dVar)) {
            return dVar;
        }
        r.d dVarE = e();
        dVarE.getClass();
        return dVarE;
    }

    public final void w() {
        Handler handler = this.l;
        v7 v7Var = this.n;
        handler.removeCallbacks(v7Var);
        if (this.q) {
            long j = this.x;
            if (j > 0) {
                if (this.t.t0() || this.t.d()) {
                    handler.postDelayed(v7Var, j);
                }
            }
        }
    }

    public final void x() {
        if (Looper.myLooper() == this.l.getLooper()) {
            return;
        }
        r6.g("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
