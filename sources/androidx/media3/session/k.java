package androidx.media3.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.PlaybackException;
import androidx.media3.session.a0;
import androidx.media3.session.g;
import androidx.media3.session.h;
import androidx.media3.session.j;
import androidx.media3.session.k;
import androidx.media3.session.legacy.c;
import androidx.media3.session.m;
import androidx.media3.session.z;
import defpackage.a73;
import defpackage.aae;
import defpackage.ah9;
import defpackage.aw5;
import defpackage.ba;
import defpackage.bh5;
import defpackage.bh9;
import defpackage.c97;
import defpackage.cdb;
import defpackage.d82;
import defpackage.dh9;
import defpackage.dqf;
import defpackage.dz1;
import defpackage.e47;
import defpackage.eh9;
import defpackage.ei9;
import defpackage.emf;
import defpackage.fi9;
import defpackage.g7;
import defpackage.g9;
import defpackage.gdb;
import defpackage.gh9;
import defpackage.gi9;
import defpackage.gie;
import defpackage.h5;
import defpackage.hi9;
import defpackage.hz8;
import defpackage.i35;
import defpackage.i47;
import defpackage.i73;
import defpackage.ih9;
import defpackage.ij9;
import defpackage.jl3;
import defpackage.k91;
import defpackage.ka2;
import defpackage.kh9;
import defpackage.l35;
import defpackage.lz8;
import defpackage.mh9;
import defpackage.ob3;
import defpackage.oh9;
import defpackage.oj9;
import defpackage.ot0;
import defpackage.ox0;
import defpackage.p20;
import defpackage.q20;
import defpackage.q83;
import defpackage.q9;
import defpackage.qyc;
import defpackage.r20;
import defpackage.r91;
import defpackage.rh9;
import defpackage.rp2;
import defpackage.ryc;
import defpackage.s34;
import defpackage.sh9;
import defpackage.sk3;
import defpackage.sm3;
import defpackage.t91;
import defpackage.tf2;
import defpackage.th9;
import defpackage.ti9;
import defpackage.tk3;
import defpackage.tog;
import defpackage.u91;
import defpackage.uh9;
import defpackage.uw8;
import defpackage.v8e;
import defpackage.v9e;
import defpackage.vh6;
import defpackage.vh9;
import defpackage.vjg;
import defpackage.vk3;
import defpackage.w8e;
import defpackage.wg9;
import defpackage.wk3;
import defpackage.wqf;
import defpackage.x65;
import defpackage.x9e;
import defpackage.xk3;
import defpackage.yh9;
import defpackage.yk3;
import defpackage.yo2;
import defpackage.z25;
import defpackage.z3;
import defpackage.zkd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class k implements j.b {
    public SurfaceHolder A;
    public TextureView B;
    public g D;
    public MediaController E;
    public long F;
    public long G;
    public z H;
    public Bundle I;
    public final j a;
    public final a0 b;
    public final m c;
    public final v d;
    public final aae e;
    public final Bundle f;
    public final dh9 g;
    public final e h;
    public final lz8<gdb.c> i;
    public final a j;
    public final ot0<Integer> k;
    public final Handler l;
    public aae m;
    public d n;
    public boolean o;
    public PendingIntent q;
    public e47<androidx.media3.session.a> r;
    public e47<androidx.media3.session.a> s;
    public qyc t;
    public qyc u;
    public gdb.a w;
    public gdb.a x;
    public gdb.a y;
    public Surface z;
    public z p = z.F;
    public gie C = gie.c;
    public w8e v = w8e.b;

    public class a {
        public final Handler a;

        public a(Looper looper) {
            this.a = new Handler(looper, new Handler.Callback() { // from class: wi9
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    k.a aVar = this.a;
                    if (message.what == 1) {
                        try {
                            k kVar = k.this;
                            kVar.D.I0(kVar.c);
                        } catch (RemoteException unused) {
                            zkd.T("MCImplBase", "Error in sending flushCommandQueue");
                        }
                    }
                    return true;
                }
            });
        }
    }

    public static final class b {
        public final int a;
        public final long b;

        public b(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    public interface c {
        void h(g gVar, int i);
    }

    public class d implements ServiceConnection {
        public final Bundle a;

        public d(Bundle bundle) {
            this.a = bundle;
        }

        @Override // android.content.ServiceConnection
        public final void onBindingDied(ComponentName componentName) {
            k kVar = k.this;
            j jVarZ0 = kVar.Z0();
            j jVarZ02 = kVar.Z0();
            Objects.requireNonNull(jVarZ02);
            jVarZ0.U0(new sm3(jVarZ02, 1));
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            j jVarZ0;
            sm3 sm3Var;
            k kVar = k.this;
            aae aaeVar = kVar.e;
            int i = 1;
            try {
                try {
                    if (aaeVar.a.e().equals(componentName.getPackageName())) {
                        h hVarC = h.a.c(iBinder);
                        if (hVarC != null) {
                            String packageName = kVar.d.getPackageName();
                            int iMyPid = Process.myPid();
                            Bundle bundle = this.a;
                            kVar.a.getClass();
                            hVarC.s0(kVar.c, new yo2(packageName, iMyPid, bundle).b());
                            return;
                        }
                        zkd.w("MCImplBase", "Service interface is missing.");
                        jVarZ0 = kVar.Z0();
                        j jVarZ02 = kVar.Z0();
                        Objects.requireNonNull(jVarZ02);
                        sm3Var = new sm3(jVarZ02, i);
                    } else {
                        zkd.w("MCImplBase", "Expected connection to " + aaeVar.a.e() + " but is connected to " + componentName);
                        jVarZ0 = kVar.Z0();
                        j jVarZ03 = kVar.Z0();
                        Objects.requireNonNull(jVarZ03);
                        sm3Var = new sm3(jVarZ03, i);
                    }
                } catch (RemoteException unused) {
                    zkd.T("MCImplBase", "Service " + componentName + " has died prematurely");
                    jVarZ0 = kVar.Z0();
                    j jVarZ04 = kVar.Z0();
                    Objects.requireNonNull(jVarZ04);
                    sm3Var = new sm3(jVarZ04, i);
                }
                jVarZ0.U0(sm3Var);
            } catch (Throwable th) {
                j jVarZ05 = kVar.Z0();
                j jVarZ06 = kVar.Z0();
                Objects.requireNonNull(jVarZ06);
                jVarZ05.U0(new sm3(jVarZ06, i));
                throw th;
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            k kVar = k.this;
            j jVarZ0 = kVar.Z0();
            j jVarZ02 = kVar.Z0();
            Objects.requireNonNull(jVarZ02);
            jVarZ0.U0(new sm3(jVarZ02, 1));
        }
    }

    public class e implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
        public e() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            k kVar = k.this;
            TextureView textureView = kVar.B;
            if (textureView == null || textureView.getSurfaceTexture() != surfaceTexture) {
                return;
            }
            kVar.z = new Surface(surfaceTexture);
            kVar.X0(new t91(this, 7));
            kVar.i1(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            k kVar = k.this;
            TextureView textureView = kVar.B;
            if (textureView != null && textureView.getSurfaceTexture() == surfaceTexture) {
                kVar.z = null;
                kVar.X0(new u91(this, 10));
                kVar.i1(0, 0);
            }
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            k kVar = k.this;
            TextureView textureView = kVar.B;
            if (textureView == null || textureView.getSurfaceTexture() != surfaceTexture) {
                return;
            }
            kVar.i1(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            k kVar = k.this;
            if (kVar.A != surfaceHolder) {
                return;
            }
            kVar.i1(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            k kVar = k.this;
            if (kVar.A != surfaceHolder) {
                return;
            }
            kVar.z = surfaceHolder.getSurface();
            kVar.X0(new i35(this, 4));
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            kVar.i1(surfaceFrame.width(), surfaceFrame.height());
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            k kVar = k.this;
            if (kVar.A != surfaceHolder) {
                return;
            }
            kVar.z = null;
            kVar.X0(new i73(this, 7));
            kVar.i1(0, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [dh9] */
    public k(v vVar, j jVar, aae aaeVar, Bundle bundle, Looper looper) {
        qyc qycVar = qyc.e;
        this.r = qycVar;
        this.s = qycVar;
        this.t = qycVar;
        this.u = qycVar;
        ryc rycVar = ryc.V;
        gdb.a aVar = gdb.a.b;
        this.w = aVar;
        this.x = aVar;
        this.y = T0(aVar, aVar);
        this.i = new lz8<>(looper, d82.a, new h5(this));
        this.l = new Handler(looper);
        this.a = jVar;
        ka2.o(aaeVar, "token must not be null");
        this.d = vVar;
        this.b = new a0();
        this.c = new m(this);
        this.k = new ot0<>(0);
        this.e = aaeVar;
        this.f = bundle;
        this.g = new IBinder.DeathRecipient() { // from class: dh9
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                k kVar = this.a;
                j jVarZ0 = kVar.Z0();
                j jVarZ02 = kVar.Z0();
                Objects.requireNonNull(jVarZ02);
                jVarZ0.U0(new sm3(jVarZ02, 1));
            }
        };
        this.h = new e();
        this.I = Bundle.EMPTY;
        this.n = aaeVar.a.getType() == 0 ? null : new d(bundle);
        this.j = new a(looper);
        this.F = -9223372036854775807L;
        this.G = -9223372036854775807L;
    }

    public static gdb.a T0(gdb.a aVar, gdb.a aVar2) {
        gdb.a aVarD = y.d(aVar, aVar2);
        if (aVarD.a(32)) {
            return aVarD;
        }
        bh5.a aVar3 = new bh5.a();
        aVar3.b(aVarD.a);
        aVar3.a(32);
        return new gdb.a(aVar3.d());
    }

    public static emf.c U0(ArrayList arrayList, ArrayList arrayList2) {
        e47.a aVar = new e47.a();
        aVar.d(arrayList);
        qyc qycVarF = aVar.f();
        e47.a aVar2 = new e47.a();
        aVar2.d(arrayList2);
        qyc qycVarF2 = aVar2.f();
        int size = arrayList.size();
        c.a aVar3 = y.a;
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = i;
        }
        return new emf.c(qycVarF, qycVarF2, iArr);
    }

    public static int Y0(z zVar) {
        int i = zVar.c.a.b;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public static z e1(z zVar, int i, List<ij9> list, long j, long j2) {
        int size;
        emf emfVar = zVar.j;
        v9e v9eVar = zVar.c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size2 = 0;
        for (int i2 = 0; i2 < emfVar.o(); i2++) {
            arrayList.add(emfVar.m(i2, new emf.d(), 0L));
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            ij9 ij9Var = list.get(i3);
            emf.d dVar = new emf.d();
            dVar.b(0, ij9Var, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, -1, -1, 0L);
            arrayList.add(i3 + i, dVar);
        }
        m1(emfVar, arrayList, arrayList2);
        emf.c cVarU0 = U0(arrayList, arrayList2);
        if (zVar.j.p()) {
            size = 0;
        } else {
            int i4 = v9eVar.a.b;
            size2 = i4 >= i ? list.size() + i4 : i4;
            int i5 = v9eVar.a.e;
            size = i5 >= i ? list.size() + i5 : i5;
        }
        return g1(zVar, cVarU0, size2, size, j, j2, 5);
    }

    public static z f1(z zVar, int i, int i2, boolean z, long j, long j2) {
        int i3;
        int iA;
        int i4;
        z zVarG1;
        emf emfVar = zVar.j;
        boolean z2 = zVar.i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i5 = 0; i5 < emfVar.o(); i5++) {
            if (i5 < i || i5 >= i2) {
                arrayList.add(emfVar.m(i5, new emf.d(), 0L));
            }
        }
        m1(emfVar, arrayList, arrayList2);
        emf.c cVarU0 = U0(arrayList, arrayList2);
        int iY0 = Y0(zVar);
        int i6 = zVar.c.a.e;
        emf.d dVar = new emf.d();
        boolean z3 = iY0 >= i && iY0 < i2;
        if (cVarU0.p()) {
            i6 = 0;
            iA = -1;
            i3 = 1;
        } else {
            if (z3) {
                int i7 = zVar.h;
                int iO = emfVar.o();
                iA = iY0;
                i3 = 1;
                for (int i8 = 0; i8 < iO; i8++) {
                    iA = emfVar.e(iA, i7, z2);
                    if (iA == -1) {
                        break;
                    }
                    if (iA < i || iA >= i2) {
                        break;
                    }
                }
                iA = -1;
                if (iA == -1) {
                    iA = cVarU0.a(z2);
                } else if (iA >= i2) {
                    iA -= i2 - i;
                }
                cVarU0.m(iA, dVar, 0L);
                i4 = dVar.m;
            } else {
                i3 = 1;
                if (iY0 >= i2) {
                    iA = iY0 - (i2 - i);
                    if (i6 != -1) {
                        for (int i9 = i; i9 < i2; i9++) {
                            emf.d dVar2 = new emf.d();
                            emfVar.n(i9, dVar2);
                            i6 -= (dVar2.n - dVar2.m) + 1;
                        }
                    }
                    i4 = i6;
                } else {
                    iA = iY0;
                }
            }
            i6 = i4;
        }
        if (!z3) {
            zVarG1 = g1(zVar, cVarU0, iA, i6, j, j2, 4);
        } else if (iA == -1) {
            zVarG1 = h1(zVar, cVarU0, v9e.k, v9e.l, 4);
        } else if (z) {
            zVarG1 = g1(zVar, cVarU0, iA, i6, j, j2, 4);
        } else {
            int i10 = iA;
            emf.d dVar3 = new emf.d();
            cVarU0.m(i10, dVar3, 0L);
            long jC0 = vjg.c0(dVar3.k);
            long jC02 = vjg.c0(dVar3.l);
            gdb.d dVar4 = new gdb.d(null, i10, dVar3.b, null, i6, jC0, jC0, -1, -1);
            zVarG1 = h1(zVar, cVarU0, dVar4, new v9e(dVar4, false, SystemClock.elapsedRealtime(), jC02, jC0, y.b(jC0, jC02), 0L, -9223372036854775807L, jC02, jC0), 4);
        }
        int i11 = zVarG1.y;
        return (i11 == i3 || i11 == 4 || i >= i2 || i2 != emfVar.o() || iY0 < i) ? zVarG1 : zVarG1.f(4, null);
    }

    public static z g1(z zVar, emf.c cVar, int i, int i2, long j, long j2, int i3) {
        emf.d dVar = new emf.d();
        cVar.m(i, dVar, 0L);
        ij9 ij9Var = dVar.b;
        gdb.d dVar2 = zVar.c.a;
        gdb.d dVar3 = new gdb.d(null, i, ij9Var, null, i2, j, j2, dVar2.h, dVar2.i);
        v9e v9eVar = zVar.c;
        return h1(zVar, cVar, dVar3, new v9e(dVar3, v9eVar.b, SystemClock.elapsedRealtime(), v9eVar.d, v9eVar.e, v9eVar.f, v9eVar.g, v9eVar.h, v9eVar.i, v9eVar.j), i3);
    }

    public static z h1(z zVar, emf emfVar, gdb.d dVar, v9e v9eVar, int i) {
        v9e v9eVar2;
        dqf dqfVar;
        wqf wqfVar;
        boolean z;
        PlaybackException playbackException = zVar.a;
        int i2 = zVar.b;
        v9e v9eVar3 = zVar.c;
        cdb cdbVar = zVar.g;
        int i3 = zVar.h;
        boolean z2 = zVar.i;
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
        boolean z6 = zVar.w;
        int i7 = zVar.x;
        int i8 = zVar.y;
        oj9 oj9Var2 = zVar.z;
        long j = zVar.A;
        long j2 = zVar.B;
        long j3 = zVar.C;
        wqf wqfVar2 = zVar.D;
        dqf dqfVar2 = zVar.E;
        gdb.d dVar2 = v9eVar3.a;
        if (!emfVar.p()) {
            v9eVar2 = v9eVar;
            dqfVar = dqfVar2;
            wqfVar = wqfVar2;
            if (v9eVar2.a.b >= emfVar.o()) {
                z = false;
            }
            ka2.q(z);
            return new z(playbackException, i2, v9eVar2, dVar2, dVar, i, cdbVar, i3, z2, togVar, emfVar, i4, oj9Var, f, ox0Var, q83Var, s34Var, i5, z3, z4, i6, i7, i8, z5, z6, oj9Var2, j, j2, j3, wqfVar, dqfVar);
        }
        v9eVar2 = v9eVar;
        dqfVar = dqfVar2;
        wqfVar = wqfVar2;
        z = true;
        ka2.q(z);
        return new z(playbackException, i2, v9eVar2, dVar2, dVar, i, cdbVar, i3, z2, togVar, emfVar, i4, oj9Var, f, ox0Var, q83Var, s34Var, i5, z3, z4, i6, i7, i8, z5, z6, oj9Var2, j, j2, j3, wqfVar, dqfVar);
    }

    public static void m1(emf emfVar, ArrayList arrayList, ArrayList arrayList2) {
        for (int i = 0; i < arrayList.size(); i++) {
            emf.d dVar = (emf.d) arrayList.get(i);
            int i2 = dVar.m;
            int i3 = dVar.n;
            if (i2 == -1 || i3 == -1) {
                dVar.m = arrayList2.size();
                dVar.n = arrayList2.size();
                emf.b bVar = new emf.b();
                bVar.i(null, null, i, -9223372036854775807L, 0L, ba.f, true);
                arrayList2.add(bVar);
            } else {
                dVar.m = arrayList2.size();
                dVar.n = (i3 - i2) + arrayList2.size();
                while (i2 <= i3) {
                    emf.b bVar2 = new emf.b();
                    emfVar.f(i2, bVar2, false);
                    bVar2.c = i;
                    arrayList2.add(bVar2);
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.qyc p1(defpackage.qyc r2, java.util.List r3, android.os.Bundle r4, defpackage.w8e r5, gdb.a r6) {
        /*
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Lb
            qyc r2 = androidx.media3.session.a.c(r3, r5, r6)
            return r2
        Lb:
            java.lang.String r3 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS"
            boolean r3 = r4.getBoolean(r3)
            r5 = 0
            r0 = 1
            if (r3 != 0) goto L25
            r3 = 6
            r1 = 7
            int[] r3 = new int[]{r3, r1}
            bh5 r1 = r6.a
            boolean r3 = r1.a(r3)
            if (r3 != 0) goto L25
            r3 = r0
            goto L26
        L25:
            r3 = r5
        L26:
            java.lang.String r1 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT"
            boolean r4 = r4.getBoolean(r1)
            if (r4 != 0) goto L3f
            r4 = 8
            r1 = 9
            int[] r4 = new int[]{r4, r1}
            bh5 r6 = r6.a
            boolean r4 = r6.a(r4)
            if (r4 != 0) goto L3f
            r5 = r0
        L3f:
            qyc r2 = androidx.media3.session.a.e(r3, r2, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.k.p1(qyc, java.util.List, android.os.Bundle, w8e, gdb$a):qyc");
    }

    public static qyc q1(List list, List list2, w8e w8eVar, gdb.a aVar, Bundle bundle) {
        if (list.isEmpty()) {
            list = androidx.media3.session.a.f(list2, aVar, bundle);
        }
        return androidx.media3.session.a.c(list, w8eVar, aVar);
    }

    @Override // androidx.media3.session.j.b
    public final void A(final boolean z) {
        if (d1(1)) {
            W0(new c() { // from class: hh9
                @Override // androidx.media3.session.k.c
                public final void h(g gVar, int i) {
                    gVar.U0(this.a.c, i, z);
                }
            });
            u1(z);
        } else if (z) {
            zkd.T("MCImplBase", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        }
    }

    @Override // androidx.media3.session.j.b
    public final void A0(final int i, final int i2, final int i3) {
        if (d1(20)) {
            ka2.l(i >= 0 && i <= i2 && i3 >= 0);
            W0(new c() { // from class: ci9
                @Override // androidx.media3.session.k.c
                public final void h(g gVar, int i4) {
                    gVar.v0(this.a.c, i4, i, i2, i3);
                }
            });
            j1(i, i2, i3);
        }
    }

    @Override // androidx.media3.session.j.b
    public final void B() {
        if (d1(8)) {
            W0(new wg9(this, 2));
            if (a1() != -1) {
                r1(a1(), -9223372036854775807L);
            }
        }
    }

    @Override // androidx.media3.session.j.b
    public final void B0(final List<ij9> list) {
        if (d1(20)) {
            W0(new c() { // from class: vi9
                @Override // androidx.media3.session.k.c
                public final void h(g gVar, int i) {
                    m mVar = this.a.c;
                    e47.b bVar = e47.b;
                    e47.a aVar = new e47.a();
                    int i2 = 0;
                    while (true) {
                        List list2 = list;
                        if (i2 >= list2.size()) {
                            gVar.l0(mVar, i, new bq1(aVar.f()));
                            return;
                        } else {
                            aVar.c(((ij9) list2.get(i2)).b(true));
                            i2++;
                        }
                    }
                }
            });
            Q0(this.p.j.o(), list);
        }
    }

    @Override // androidx.media3.session.j.b
    public final void C(final int i) {
        if (d1(34)) {
            W0(new c() { // from class: nh9
                @Override // androidx.media3.session.k.c
                public final void h(g gVar, int i2) {
                    gVar.Z(this.a.c, i2, i);
                }
            });
            z zVar = this.p;
            int i2 = zVar.r - 1;
            if (i2 >= zVar.q.b) {
                this.p = zVar.c(i2, zVar.s);
                oh9 oh9Var = new oh9(this, i2);
                lz8<gdb.c> lz8Var = this.i;
                lz8Var.c(30, oh9Var);
                lz8Var.b();
            }
        }
    }

    @Override // androidx.media3.session.j.b
    public final boolean C0() {
        return this.p.s;
    }

    @Override // androidx.media3.session.j.b
    public final wqf D() {
        return this.p.D;
    }

    @Override // androidx.media3.session.j.b
    public final boolean D0() {
        return this.p.i;
    }

    @Override // androidx.media3.session.j.b
    public final q83 E() {
        return this.p.p;
    }

    @Override // androidx.media3.session.j.b
    public final long E0() {
        return this.p.c.j;
    }

    @Override // androidx.media3.session.j.b
    public final void F(final ox0 ox0Var, final boolean z) {
        if (d1(35)) {
            W0(new c() { // from class: qi9
                @Override // androidx.media3.session.k.c
                public final void h(g gVar, int i) {
                    gVar.B(this.a.c, i, ox0Var.c(), z);
                }
            });
            if (this.p.o.equals(ox0Var)) {
                return;
            }
            this.p = this.p.a(ox0Var);
            vk3 vk3Var = new vk3(ox0Var, 3);
            lz8<gdb.c> lz8Var = this.i;
            lz8Var.c(20, vk3Var);
            lz8Var.b();
        }
    }

    @Override // androidx.media3.session.j.b
    @Deprecated
    public final void F0(final int i) {
        if (d1(25)) {
            W0(new c() { // from class: oi9
                @Override // androidx.media3.session.k.c
                public final void h(g gVar, int i2) {
                    gVar.D(this.a.c, i2, i);
                }
            });
            z zVar = this.p;
            s34 s34Var = zVar.q;
            if (zVar.r == i || s34Var.b > i) {
                return;
            }
            int i2 = s34Var.c;
            if (i2 == 0 || i <= i2) {
                this.p = zVar.c(i, zVar.s);
                lz8.a<gdb.c> aVar = new lz8.a() { // from class: pi9
                    @Override // lz8.a
                    public final void invoke(Object obj) {
                        ((gdb.c) obj).z(i, this.a.p.s);
                    }
                };
                lz8<gdb.c> lz8Var = this.i;
                lz8Var.c(30, aVar);
                lz8Var.b();
            }
        }
    }

    @Override // androidx.media3.session.j.b
    public final void G(final oj9 oj9Var) {
        if (d1(19)) {
            W0(new c() { // from class: ph9
                @Override // androidx.media3.session.k.c
                public final void h(g gVar, int i) {
                    gVar.A0(this.a.c, i, oj9Var.c());
                }
            });
            if (this.p.m.equals(oj9Var)) {
                return;
            }
            this.p = this.p.g(oj9Var);
            g9 g9Var = new g9(oj9Var, 5);
            lz8<gdb.c> lz8Var = this.i;
            lz8Var.c(15, g9Var);
            lz8Var.b();
        }
    }

    @Override // androidx.media3.session.j.b
    public final void G0() {
        if (d1(12)) {
            W0(new eh9(this, 1));
            s1(this.p.B);
        }
    }

    @Override // androidx.media3.session.j.b
    public final int H() {
        return this.p.c.a.h;
    }

    @Override // androidx.media3.session.j.b
    public final void H0() {
        if (d1(11)) {
            W0(new q20(this, 6));
            s1(-this.p.A);
        }
    }

    @Override // androidx.media3.session.j.b
    @Deprecated
    public final void I(final boolean z) {
        if (d1(26)) {
            W0(new c() { // from class: ii9
                @Override // androidx.media3.session.k.c
                public final void h(g gVar, int i) {
                    gVar.o0(this.a.c, i, z);
                }
            });
            z zVar = this.p;
            if (zVar.s != z) {
                this.p = zVar.c(zVar.r, z);
                lz8.a<gdb.c> aVar = new lz8.a() { // from class: ji9
                    @Override // lz8.a
                    public final void invoke(Object obj) {
                        ((gdb.c) obj).z(this.a.p.r, z);
                    }
                };
                lz8<gdb.c> lz8Var = this.i;
                lz8Var.c(30, aVar);
                lz8Var.b();
            }
        }
    }

    @Override // androidx.media3.session.j.b
    public final oj9 I0() {
        return this.p.z;
    }

    @Override // androidx.media3.session.j.b
    public final void J(ij9 ij9Var) {
        if (d1(31)) {
            W0(new c97(this, ij9Var));
            t1(Collections.singletonList(ij9Var), -1, -9223372036854775807L, true);
        }
    }

    @Override // androidx.media3.session.j.b
    public final void J0(List list) {
        if (d1(20)) {
            W0(new ti9(this, list));
            t1(list, -1, -9223372036854775807L, true);
        }
    }

    @Override // androidx.media3.session.j.b
    public final void K(final List list, final int i, final int i2) {
        if (d1(20)) {
            ka2.l(i >= 0 && i <= i2);
            W0(new c() { // from class: xg9
                @Override // androidx.media3.session.k.c
                public final void h(g gVar, int i3) {
                    e47.b bVar = e47.b;
                    e47.a aVar = new e47.a();
                    int i4 = 0;
                    while (true) {
                        List list2 = list;
                        if (i4 >= list2.size()) {
                            break;
                        }
                        aVar.c(((ij9) list2.get(i4)).b(true));
                        i4++;
                    }
                    bq1 bq1Var = new bq1(aVar.f());
                    k kVar = this.a;
                    aae aaeVar = kVar.m;
                    aaeVar.getClass();
                    int iD = aaeVar.a.d();
                    m mVar = kVar.c;
                    int i5 = i;
                    int i6 = i2;
                    if (iD >= 2) {
                        gVar.S0(mVar, i3, i5, i6, bq1Var);
                    } else {
                        gVar.z0(mVar, i3, i6, bq1Var);
                        gVar.J0(kVar.c, i3, i5, i6);
                    }
                }
            });
            o1(list, i, i2);
        }
    }

    @Override // androidx.media3.session.j.b
    public final long K0() {
        long jC = y.c(this.p, this.F, this.G, Z0().f);
        this.F = jC;
        return jC;
    }

    @Override // androidx.media3.session.j.b
    public final int L() {
        return this.p.x;
    }

    @Override // androidx.media3.session.j.b
    public final long L0() {
        return this.p.A;
    }

    @Override // androidx.media3.session.j.b
    public final emf M() {
        return this.p.j;
    }

    @Override // androidx.media3.session.j.b
    public final w8e M0() {
        return this.v;
    }

    @Override // androidx.media3.session.j.b
    public final void N(final int i, final ij9 ij9Var) {
        if (d1(20)) {
            ka2.l(i >= 0);
            W0(new c() { // from class: zg9
                @Override // androidx.media3.session.k.c
                public final void h(g gVar, int i2) {
                    k kVar = this.a;
                    aae aaeVar = kVar.m;
                    aaeVar.getClass();
                    int iD = aaeVar.a.d();
                    m mVar = kVar.c;
                    int i3 = i;
                    ij9 ij9Var2 = ij9Var;
                    if (iD >= 2) {
                        gVar.j0(mVar, i2, i3, ij9Var2.b(true));
                    } else {
                        gVar.m0(mVar, i2, i3 + 1, ij9Var2.b(true));
                        gVar.c0(mVar, i2, i3);
                    }
                }
            });
            o1(e47.n(ij9Var), i, i + 1);
        }
    }

    @Override // androidx.media3.session.j.b
    public final e47<androidx.media3.session.a> N0() {
        return this.t;
    }

    @Override // androidx.media3.session.j.b
    @Deprecated
    public final void O() {
        if (d1(26)) {
            W0(new gh9(this, 1));
            z zVar = this.p;
            int i = zVar.r + 1;
            int i2 = zVar.q.c;
            if (i2 == 0 || i <= i2) {
                this.p = zVar.c(i, zVar.s);
                ei9 ei9Var = new ei9(this, i);
                lz8<gdb.c> lz8Var = this.i;
                lz8Var.c(30, ei9Var);
                lz8Var.b();
            }
        }
    }

    @Override // androidx.media3.session.j.b
    public final Bundle O0() {
        return this.f;
    }

    @Override // androidx.media3.session.j.b
    public final dqf P() {
        return this.p.E;
    }

    @Override // androidx.media3.session.j.b
    public final hz8 P0(v8e v8eVar) {
        g gVar;
        Bundle bundle = Bundle.EMPTY;
        vh9 vh9Var = new vh9(this, v8eVar);
        ka2.l(v8eVar.a == 0);
        if (this.v.a.contains(v8eVar)) {
            gVar = this.D;
        } else {
            zkd.T("MCImplBase", "Controller isn't allowed to call custom session command:" + v8eVar.b);
            gVar = null;
        }
        return V0(gVar, vh9Var, false);
    }

    @Override // androidx.media3.session.j.b
    public final void Q() {
        if (d1(9)) {
            W0(new l35(this, 4));
            emf emfVar = this.p.j;
            if (emfVar.p() || k()) {
                return;
            }
            if (a1() != -1) {
                r1(a1(), -9223372036854775807L);
                return;
            }
            emf.d dVarM = emfVar.m(Y0(this.p), new emf.d(), 0L);
            if (dVarM.h && dVarM.a()) {
                r1(Y0(this.p), -9223372036854775807L);
            }
        }
    }

    public final void Q0(int i, List<ij9> list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.p.j.p()) {
            t1(list, -1, -9223372036854775807L, false);
        } else {
            v1(e1(this.p, Math.min(i, this.p.j.o()), list, K0(), p0()), 0, null, null, this.p.j.p() ? 3 : null);
        }
    }

    @Override // androidx.media3.session.j.b
    public final void R(TextureView textureView) {
        if (d1(27)) {
            if (textureView == null) {
                S0();
                return;
            }
            if (this.B == textureView) {
                return;
            }
            R0();
            this.B = textureView;
            textureView.setSurfaceTextureListener(this.h);
            SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
            if (surfaceTexture == null) {
                X0(new tf2(this, 5));
                i1(0, 0);
            } else {
                this.z = new Surface(surfaceTexture);
                X0(new sk3(this, 4));
                i1(textureView.getWidth(), textureView.getHeight());
            }
        }
    }

    public final void R0() {
        TextureView textureView = this.B;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(null);
            this.B = null;
        }
        SurfaceHolder surfaceHolder = this.A;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.h);
            this.A = null;
        }
        if (this.z != null) {
            this.z = null;
        }
    }

    @Override // androidx.media3.session.j.b
    public final int S() {
        return this.p.r;
    }

    public final void S0() {
        if (d1(27)) {
            R0();
            X0(new wg9(this, 1));
            i1(0, 0);
        }
    }

    @Override // androidx.media3.session.j.b
    public final long T() {
        return this.p.c.h;
    }

    @Override // androidx.media3.session.j.b
    public final void U(final int i, final long j) {
        if (d1(10)) {
            ka2.l(i >= 0);
            W0(new c() { // from class: fh9
                @Override // androidx.media3.session.k.c
                public final void h(g gVar, int i2) {
                    gVar.q0(this.a.c, i2, i, j);
                }
            });
            r1(i, j);
        }
    }

    @Override // androidx.media3.session.j.b
    public final gdb.a V() {
        return this.y;
    }

    public final hz8<x9e> V0(g gVar, c cVar, boolean z) {
        if (gVar == null) {
            return aw5.K1(new x9e(-4));
        }
        x9e x9eVar = new x9e(1);
        a0 a0Var = this.b;
        a0.a aVarA = a0Var.a(x9eVar);
        int i = aVarA.W;
        ot0<Integer> ot0Var = this.k;
        if (z) {
            if (ot0Var.isEmpty()) {
                this.H = this.p;
            }
            ot0Var.add(Integer.valueOf(i));
        }
        try {
            cVar.h(gVar, i);
            return aVarA;
        } catch (RemoteException e2) {
            zkd.U("MCImplBase", "Cannot connect to the service or the session is gone", e2);
            ot0Var.remove(Integer.valueOf(i));
            a0Var.d(i, new x9e(-100));
            return aVarA;
        }
    }

    @Override // androidx.media3.session.j.b
    public final boolean W() {
        return this.p.t;
    }

    public final void W0(c cVar) {
        a aVar = this.j;
        Handler handler = aVar.a;
        if (k.this.D != null && !handler.hasMessages(1)) {
            handler.sendEmptyMessage(1);
        }
        V0(this.D, cVar, true);
    }

    @Override // androidx.media3.session.j.b
    public final void X(final boolean z) {
        if (d1(14)) {
            W0(new bh9(this, z));
            z zVar = this.p;
            if (zVar.i != z) {
                this.p = zVar.k(z);
                lz8.a<gdb.c> aVar = new lz8.a() { // from class: ch9
                    @Override // lz8.a
                    public final void invoke(Object obj) {
                        ((gdb.c) obj).v(z);
                    }
                };
                lz8<gdb.c> lz8Var = this.i;
                lz8Var.c(9, aVar);
                lz8Var.b();
            }
        }
    }

    public final void X0(c cVar) {
        a aVar = this.j;
        Handler handler = aVar.a;
        if (k.this.D != null && !handler.hasMessages(1)) {
            handler.sendEmptyMessage(1);
        }
        hz8<x9e> hz8VarV0 = V0(this.D, cVar, true);
        try {
            LegacyConversions.v(hz8VarV0);
        } catch (ExecutionException e2) {
            z3.q(e2);
        } catch (TimeoutException e3) {
            if (hz8VarV0 instanceof a0.a) {
                int i = ((a0.a) hz8VarV0).W;
                this.k.remove(Integer.valueOf(i));
                this.b.d(i, new x9e(-1));
            }
            zkd.U("MCImplBase", "Synchronous command takes too long on the session side.", e3);
        }
    }

    @Override // androidx.media3.session.j.b
    public final long Y() {
        return this.p.C;
    }

    @Override // androidx.media3.session.j.b
    public final void Z(gdb.c cVar) {
        this.i.a(cVar);
    }

    public j Z0() {
        return this.a;
    }

    @Override // androidx.media3.session.j.b
    public final PlaybackException a() {
        return this.p.a;
    }

    @Override // androidx.media3.session.j.b
    public final long a0() {
        return this.p.c.i;
    }

    public final int a1() {
        if (this.p.j.p()) {
            return -1;
        }
        z zVar = this.p;
        emf emfVar = zVar.j;
        int iY0 = Y0(zVar);
        z zVar2 = this.p;
        int i = zVar2.h;
        if (i == 1) {
            i = 0;
        }
        return emfVar.e(iY0, i, zVar2.i);
    }

    @Override // androidx.media3.session.j.b
    public final int b() {
        return this.p.y;
    }

    @Override // androidx.media3.session.j.b
    public final int b0() {
        return this.p.c.a.e;
    }

    public final b b1(emf emfVar, int i, long j) {
        if (emfVar.p()) {
            return null;
        }
        emf.d dVar = new emf.d();
        emf.b bVar = new emf.b();
        if (i == -1 || i >= emfVar.o()) {
            i = emfVar.a(this.p.i);
            j = vjg.c0(emfVar.m(i, dVar, 0L).k);
        }
        long jO = vjg.O(j);
        ka2.m(i, emfVar.o());
        emfVar.n(i, dVar);
        if (jO == -9223372036854775807L) {
            jO = dVar.k;
            if (jO == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = dVar.m;
        emfVar.f(i2, bVar, false);
        while (i2 < dVar.n && bVar.e != jO) {
            int i3 = i2 + 1;
            if (emfVar.f(i3, bVar, false).e > jO) {
                break;
            }
            i2 = i3;
        }
        emfVar.f(i2, bVar, false);
        return new b(i2, jO - bVar.e);
    }

    @Override // androidx.media3.session.j.b
    public final void c() {
        if (d1(1)) {
            W0(new eh9(this, 0));
            u1(false);
        }
    }

    @Override // androidx.media3.session.j.b
    public final void c0(TextureView textureView) {
        if (d1(27) && textureView != null && this.B == textureView) {
            S0();
        }
    }

    public final int c1() {
        if (this.p.j.p()) {
            return -1;
        }
        z zVar = this.p;
        emf emfVar = zVar.j;
        int iY0 = Y0(zVar);
        z zVar2 = this.p;
        int i = zVar2.h;
        if (i == 1) {
            i = 0;
        }
        return emfVar.k(iY0, i, zVar2.i);
    }

    @Override // androidx.media3.session.j.b
    public final boolean d() {
        return this.p.w;
    }

    @Override // androidx.media3.session.j.b
    public final tog d0() {
        return this.p.l;
    }

    public final boolean d1(int i) {
        if (this.y.a(i)) {
            return true;
        }
        g7.j(i, "Controller isn't allowed to call command= ", "MCImplBase");
        return false;
    }

    @Override // androidx.media3.session.j.b
    public final cdb e() {
        return this.p.g;
    }

    @Override // androidx.media3.session.j.b
    public final float e0() {
        return this.p.n;
    }

    @Override // androidx.media3.session.j.b
    public final void f() {
        if (d1(2)) {
            W0(new gh9(this, 0));
            z zVar = this.p;
            if (zVar.y == 1) {
                v1(zVar.f(zVar.j.p() ? 4 : 2, null), null, null, null, null);
            }
        }
    }

    @Override // androidx.media3.session.j.b
    public final ox0 f0() {
        return this.p.o;
    }

    @Override // androidx.media3.session.j.b
    public final void g(cdb cdbVar) {
        if (d1(13)) {
            W0(new mh9(this, cdbVar));
            if (this.p.g.equals(cdbVar)) {
                return;
            }
            this.p = this.p.e(cdbVar);
            th9 th9Var = new th9(cdbVar, 0);
            lz8<gdb.c> lz8Var = this.i;
            lz8Var.c(12, th9Var);
            lz8Var.b();
        }
    }

    @Override // androidx.media3.session.j.b
    public final s34 g0() {
        return this.p.q;
    }

    @Override // androidx.media3.session.j.b
    public final long getDuration() {
        return this.p.c.d;
    }

    @Override // androidx.media3.session.j.b
    public final void h(final float f) {
        if (d1(13)) {
            W0(new c() { // from class: zh9
                @Override // androidx.media3.session.k.c
                public final void h(g gVar, int i) {
                    gVar.i0(this.a.c, i, f);
                }
            });
            cdb cdbVar = this.p.g;
            if (cdbVar.a != f) {
                cdb cdbVar2 = new cdb(f, cdbVar.b);
                this.p = this.p.e(cdbVar2);
                th9 th9Var = new th9(cdbVar2, 1);
                lz8<gdb.c> lz8Var = this.i;
                lz8Var.c(12, th9Var);
                lz8Var.b();
            }
        }
    }

    @Override // androidx.media3.session.j.b
    public final void h0(final int i, final int i2) {
        if (d1(33)) {
            W0(new c() { // from class: xh9
                @Override // androidx.media3.session.k.c
                public final void h(g gVar, int i3) {
                    gVar.n0(this.a.c, i3, i, i2);
                }
            });
            z zVar = this.p;
            s34 s34Var = zVar.q;
            if (zVar.r == i || s34Var.b > i) {
                return;
            }
            int i3 = s34Var.c;
            if (i3 == 0 || i <= i3) {
                this.p = zVar.c(i, zVar.s);
                yh9 yh9Var = new yh9(this, i, 0);
                lz8<gdb.c> lz8Var = this.i;
                lz8Var.c(30, yh9Var);
                lz8Var.b();
            }
        }
    }

    @Override // androidx.media3.session.j.b
    public final int i() {
        return this.p.h;
    }

    @Override // androidx.media3.session.j.b
    public final int i0() {
        return this.p.c.a.i;
    }

    public final void i1(final int i, final int i2) {
        gie gieVar = this.C;
        if (gieVar.a == i && gieVar.b == i2) {
            return;
        }
        this.C = new gie(i, i2);
        this.i.f(24, new lz8.a() { // from class: mi9
            @Override // lz8.a
            public final void invoke(Object obj) {
                ((gdb.c) obj).Q(i, i2);
            }
        });
    }

    @Override // androidx.media3.session.j.b
    public final void j(Surface surface) {
        if (d1(27)) {
            R0();
            this.z = surface;
            X0(new xk3(this, surface));
            int i = surface == null ? 0 : -1;
            i1(i, i);
        }
    }

    @Override // androidx.media3.session.j.b
    public final void j0(final long j) {
        if (d1(5)) {
            W0(new c() { // from class: wh9
                @Override // androidx.media3.session.k.c
                public final void h(g gVar, int i) {
                    gVar.e0(this.a.c, i, j);
                }
            });
            r1(Y0(this.p), j);
        }
    }

    public final void j1(int i, int i2, int i3) {
        int i4;
        int i5;
        emf emfVar = this.p.j;
        int iO = emfVar.o();
        int iMin = Math.min(i2, iO);
        int i6 = iMin - i;
        int iMin2 = Math.min(i3, iO - i6);
        if (i >= iO || i == iMin || i == iMin2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < iO; i7++) {
            arrayList.add(emfVar.m(i7, new emf.d(), 0L));
        }
        vjg.N(i, iMin, iMin2, arrayList);
        m1(emfVar, arrayList, arrayList2);
        emf.c cVarU0 = U0(arrayList, arrayList2);
        if (cVarU0.p()) {
            return;
        }
        int iY0 = Y0(this.p);
        if (iY0 >= i && iY0 < iMin) {
            i5 = (iY0 - i) + iMin2;
        } else if (iMin <= iY0 && iMin2 > iY0) {
            i5 = iY0 - i6;
        } else {
            if (iMin <= iY0 || iMin2 > iY0) {
                i4 = iY0;
                emf.d dVar = new emf.d();
                int i8 = this.p.c.a.e - emfVar.m(iY0, dVar, 0L).m;
                cVarU0.m(i4, dVar, 0L);
                v1(g1(this.p, cVarU0, i4, dVar.m + i8, K0(), p0(), 5), 0, null, null, null);
            }
            i5 = iY0 + i6;
        }
        i4 = i5;
        emf.d dVar2 = new emf.d();
        int i82 = this.p.c.a.e - emfVar.m(iY0, dVar2, 0L).m;
        cVarU0.m(i4, dVar2, 0L);
        v1(g1(this.p, cVarU0, i4, dVar2.m + i82, K0(), p0(), 5), 0, null, null, null);
    }

    @Override // androidx.media3.session.j.b
    public final boolean k() {
        return this.p.c.b;
    }

    @Override // androidx.media3.session.j.b
    public final void k0(final float f) {
        if (d1(24)) {
            W0(new c() { // from class: ki9
                @Override // androidx.media3.session.k.c
                public final void h(g gVar, int i) {
                    gVar.f0(this.a.c, i, f);
                }
            });
            z zVar = this.p;
            if (zVar.n != f) {
                this.p = zVar.p(f);
                lz8.a<gdb.c> aVar = new lz8.a() { // from class: li9
                    @Override // lz8.a
                    public final void invoke(Object obj) {
                        ((gdb.c) obj).W(f);
                    }
                };
                lz8<gdb.c> lz8Var = this.i;
                lz8Var.c(22, aVar);
                lz8Var.b();
            }
        }
    }

    public final void k1(z zVar, z zVar2, Integer num, Integer num2, Integer num3, Integer num4) {
        int i = 0;
        lz8<gdb.c> lz8Var = this.i;
        if (num != null) {
            lz8Var.c(0, new rh9(zVar2, num, i));
        }
        if (num3 != null) {
            lz8Var.c(11, new vh9(zVar2, num3));
        }
        ij9 ij9VarS = zVar2.s();
        int i2 = 1;
        if (num4 != null) {
            lz8Var.c(1, new uw8(ij9VarS, num4));
        }
        PlaybackException playbackException = zVar.a;
        PlaybackException playbackException2 = zVar2.a;
        int i3 = 5;
        int i4 = 2;
        if (playbackException != playbackException2 && (playbackException == null || !playbackException.a(playbackException2))) {
            lz8Var.c(10, new l35(playbackException2, i3));
            if (playbackException2 != null) {
                lz8Var.c(10, new rp2(playbackException2, i4));
            }
        }
        if (!zVar.D.equals(zVar2.D)) {
            lz8Var.c(2, new z25(zVar2, i4));
        }
        int i5 = 4;
        if (!zVar.z.equals(zVar2.z)) {
            lz8Var.c(14, new jl3(zVar2, i5));
        }
        int i6 = 3;
        int i7 = 6;
        if (zVar.w != zVar2.w) {
            lz8Var.c(3, new g9(zVar2, i7));
        }
        if (zVar.y != zVar2.y) {
            lz8Var.c(4, new dz1(zVar2, i3));
        }
        if (num2 != null) {
            lz8Var.c(5, new rh9(zVar2, num2, i2));
        }
        if (zVar.x != zVar2.x) {
            lz8Var.c(6, new yk3(zVar2, i6));
        }
        int i8 = 7;
        if (zVar.v != zVar2.v) {
            lz8Var.c(7, new sh9(zVar2, i));
        }
        if (!zVar.g.equals(zVar2.g)) {
            lz8Var.c(12, new x65(zVar2));
        }
        int i9 = 8;
        if (zVar.h != zVar2.h) {
            lz8Var.c(8, new r91(zVar2));
        }
        if (zVar.i != zVar2.i) {
            lz8Var.c(9, new p20(zVar2));
        }
        if (!zVar.m.equals(zVar2.m)) {
            lz8Var.c(15, new q20(zVar2, i8));
        }
        if (zVar.n != zVar2.n) {
            lz8Var.c(22, new r20(zVar2, i7));
        }
        if (!zVar.o.equals(zVar2.o)) {
            lz8Var.c(20, new a73(zVar2, i4));
        }
        if (!zVar.p.a.equals(zVar2.p.a)) {
            lz8Var.c(27, new wk3(zVar2, i6));
            lz8Var.c(27, new uh9(zVar2, i));
        }
        if (!zVar.q.equals(zVar2.q)) {
            lz8Var.c(29, new k91(zVar2));
        }
        if (zVar.r != zVar2.r || zVar.s != zVar2.s) {
            lz8Var.c(30, new i35(zVar2, i6));
        }
        if (!zVar.l.equals(zVar2.l)) {
            lz8Var.c(25, new t91(zVar2, i7));
        }
        if (zVar.A != zVar2.A) {
            lz8Var.c(16, new u91(zVar2, i9));
        }
        if (zVar.B != zVar2.B) {
            lz8Var.c(17, new tf2(zVar2, i7));
        }
        if (zVar.C != zVar2.C) {
            lz8Var.c(18, new sk3(zVar2, i3));
        }
        if (!zVar.E.equals(zVar2.E)) {
            lz8Var.c(19, new vh6(zVar2, i4));
        }
        lz8Var.b();
    }

    @Override // androidx.media3.session.j.b
    public final long l() {
        return this.p.c.g;
    }

    @Override // androidx.media3.session.j.b
    public final void l0(final List<ij9> list, final int i, final long j) {
        if (d1(20)) {
            W0(new c() { // from class: si9
                @Override // androidx.media3.session.k.c
                public final void h(g gVar, int i2) {
                    m mVar = this.a.c;
                    e47.b bVar = e47.b;
                    e47.a aVar = new e47.a();
                    int i3 = 0;
                    while (true) {
                        List list2 = list;
                        if (i3 >= list2.size()) {
                            gVar.h1(mVar, i2, new bq1(aVar.f()), i, j);
                            return;
                        } else {
                            aVar.c(((ij9) list2.get(i3)).b(true));
                            i3++;
                        }
                    }
                }
            });
            t1(list, i, j, false);
        }
    }

    public final void l1(z zVar, z.a aVar) {
        if (o0()) {
            z zVar2 = this.H;
            if (zVar2 != null) {
                this.H = y.e(zVar2, zVar, aVar, this.y);
                if (!this.k.isEmpty()) {
                    return;
                }
                zVar = this.H;
                aVar = z.a.c;
                this.H = null;
            }
            z zVar3 = this.p;
            z zVarE = y.e(zVar3, zVar, aVar, this.y);
            this.p = zVarE;
            Integer numValueOf = (zVar3.d.equals(zVar.d) && zVar3.e.equals(zVar.e)) ? null : Integer.valueOf(zVarE.f);
            Integer numValueOf2 = !Objects.equals(zVar3.s(), zVarE.s()) ? Integer.valueOf(zVarE.b) : null;
            Integer numValueOf3 = !zVar3.j.equals(zVarE.j) ? Integer.valueOf(zVarE.k) : null;
            int i = zVar3.u;
            int i2 = zVarE.u;
            k1(zVar3, zVarE, numValueOf3, (i == i2 && zVar3.t == zVarE.t) ? null : Integer.valueOf(i2), numValueOf, numValueOf2);
        }
    }

    @Override // androidx.media3.session.j.b
    public final void m(final ij9 ij9Var, final long j) {
        if (d1(31)) {
            W0(new c() { // from class: ri9
                @Override // androidx.media3.session.k.c
                public final void h(g gVar, int i) {
                    gVar.b0(this.a.c, i, ij9Var.b(true), j);
                }
            });
            t1(Collections.singletonList(ij9Var), -1, j, false);
        }
    }

    @Override // androidx.media3.session.j.b
    public final void m0(final int i) {
        if (d1(10)) {
            ka2.l(i >= 0);
            W0(new c() { // from class: lh9
                @Override // androidx.media3.session.k.c
                public final void h(g gVar, int i2) {
                    gVar.p0(this.a.c, i2, i);
                }
            });
            r1(i, -9223372036854775807L);
        }
    }

    @Override // androidx.media3.session.j.b
    public final void n() {
        if (d1(20)) {
            W0(new uh9(this, 1));
            n1(0, Integer.MAX_VALUE);
        }
    }

    @Override // androidx.media3.session.j.b
    public final long n0() {
        return this.p.B;
    }

    public final void n1(int i, int i2) {
        int iO = this.p.j.o();
        int iMin = Math.min(i2, iO);
        if (i >= iO || i == iMin || iO == 0) {
            return;
        }
        boolean z = Y0(this.p) >= i && Y0(this.p) < iMin;
        z zVarF1 = f1(this.p, i, iMin, false, K0(), p0());
        int i3 = this.p.c.a.b;
        v1(zVarF1, 0, null, z ? 4 : null, i3 >= i && i3 < iMin ? 3 : null);
    }

    @Override // androidx.media3.session.j.b
    public final int o() {
        return this.p.c.f;
    }

    @Override // androidx.media3.session.j.b
    public final boolean o0() {
        return this.D != null;
    }

    public final void o1(List list, int i, int i2) {
        int iO = this.p.j.o();
        if (i > iO) {
            return;
        }
        if (this.p.j.p()) {
            t1(list, -1, -9223372036854775807L, false);
            return;
        }
        int iMin = Math.min(i2, iO);
        z zVarF1 = f1(e1(this.p, iMin, list, K0(), p0()), i, iMin, true, K0(), p0());
        int i3 = this.p.c.a.b;
        boolean z = i3 >= i && i3 < iMin;
        v1(zVarF1, 0, null, z ? 4 : null, z ? 3 : null);
    }

    @Override // androidx.media3.session.j.b
    public final void p() {
        if (d1(6)) {
            W0(new tk3(this, 3));
            if (c1() != -1) {
                r1(c1(), -9223372036854775807L);
            }
        }
    }

    @Override // androidx.media3.session.j.b
    public final long p0() {
        v9e v9eVar = this.p.c;
        return !v9eVar.b ? K0() : v9eVar.a.g;
    }

    @Override // androidx.media3.session.j.b
    public final void q() {
        if (d1(4)) {
            W0(new ah9(this, 0));
            r1(Y0(this.p), -9223372036854775807L);
        }
    }

    @Override // androidx.media3.session.j.b
    public final void q0(final int i, final List<ij9> list) {
        if (d1(20)) {
            ka2.l(i >= 0);
            W0(new c() { // from class: ui9
                @Override // androidx.media3.session.k.c
                public final void h(g gVar, int i2) {
                    m mVar = this.a.c;
                    e47.b bVar = e47.b;
                    e47.a aVar = new e47.a();
                    int i3 = 0;
                    while (true) {
                        List list2 = list;
                        if (i3 >= list2.size()) {
                            gVar.z0(mVar, i2, i, new bq1(aVar.f()));
                            return;
                        } else {
                            aVar.c(((ij9) list2.get(i3)).b(true));
                            i3++;
                        }
                    }
                }
            });
            Q0(i, list);
        }
    }

    @Override // androidx.media3.session.j.b
    public final void r(final int i, final boolean z) {
        if (d1(34)) {
            W0(new c() { // from class: ai9
                @Override // androidx.media3.session.k.c
                public final void h(g gVar, int i2) {
                    gVar.f1(this.a.c, i2, z, i);
                }
            });
            z zVar = this.p;
            if (zVar.s != z) {
                this.p = zVar.c(zVar.r, z);
                lz8.a<gdb.c> aVar = new lz8.a() { // from class: bi9
                    @Override // lz8.a
                    public final void invoke(Object obj) {
                        ((gdb.c) obj).z(this.a.p.r, z);
                    }
                };
                lz8<gdb.c> lz8Var = this.i;
                lz8Var.c(30, aVar);
                lz8Var.b();
            }
        }
    }

    @Override // androidx.media3.session.j.b
    public final long r0() {
        return this.p.c.e;
    }

    public final void r1(int i, long j) {
        int i2;
        int i3;
        z zVarH1;
        emf emfVar = this.p.j;
        if ((emfVar.p() || i < emfVar.o()) && !k()) {
            z zVar = this.p;
            z zVarF = zVar.f(zVar.y == 1 ? 1 : 2, zVar.a);
            b bVarB1 = b1(emfVar, i, j);
            if (bVarB1 == null) {
                long j2 = 0;
                long j3 = j != -9223372036854775807L ? j : 0L;
                if (j != -9223372036854775807L) {
                    j2 = j;
                }
                i2 = 1;
                i3 = 2;
                gdb.d dVar = new gdb.d(null, i, null, null, i, j3, j2, -1, -1);
                z zVar2 = this.p;
                emf emfVar2 = zVar2.j;
                boolean z = this.p.c.b;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                v9e v9eVar = this.p.c;
                zVarH1 = h1(zVar2, emfVar2, dVar, new v9e(dVar, z, jElapsedRealtime, v9eVar.d, j == -9223372036854775807L ? 0L : j, 0, 0L, v9eVar.h, v9eVar.i, j == -9223372036854775807L ? 0L : j), 1);
            } else {
                i2 = 1;
                i3 = 2;
                v9e v9eVar2 = zVarF.c;
                gdb.d dVar2 = v9eVar2.a;
                gdb.d dVar3 = v9eVar2.a;
                int i4 = dVar2.e;
                int i5 = bVarB1.a;
                emf.b bVar = new emf.b();
                emfVar.f(i4, bVar, false);
                emf.b bVar2 = new emf.b();
                emfVar.f(i5, bVar2, false);
                boolean z2 = i4 != i5;
                long j4 = bVarB1.b;
                long jO = vjg.O(K0()) - bVar.e;
                if (z2 || j4 != jO) {
                    ka2.q(dVar3.h == -1);
                    gdb.d dVar4 = new gdb.d(null, bVar.c, dVar3.c, null, i4, vjg.c0(bVar.e + jO), vjg.c0(bVar.e + jO), -1, -1);
                    emfVar.f(i5, bVar2, false);
                    emf.d dVar5 = new emf.d();
                    emfVar.n(bVar2.c, dVar5);
                    long jC0 = vjg.c0(bVar2.e + j4);
                    gdb.d dVar6 = new gdb.d(null, bVar2.c, dVar5.b, null, i5, jC0, jC0, -1, -1);
                    z zVarH = zVarF.h(1, dVar4, dVar6);
                    if (z2 || j4 < jO) {
                        zVarF = zVarH.j(new v9e(dVar6, false, SystemClock.elapsedRealtime(), vjg.c0(dVar5.l), jC0, y.b(jC0, vjg.c0(dVar5.l)), 0L, -9223372036854775807L, -9223372036854775807L, jC0));
                    } else {
                        long jMax = Math.max(0L, vjg.O(zVarH.c.g) - (j4 - jO));
                        long jC02 = vjg.c0(bVar2.e + j4 + jMax);
                        zVarF = zVarH.j(new v9e(dVar6, false, SystemClock.elapsedRealtime(), vjg.c0(dVar5.l), jC02, y.b(jC02, vjg.c0(dVar5.l)), vjg.c0(jMax), -9223372036854775807L, -9223372036854775807L, jC02));
                    }
                }
                zVarH1 = zVarF;
            }
            v9e v9eVar3 = zVarH1.c;
            int i6 = (this.p.j.p() || v9eVar3.a.b == this.p.c.a.b) ? 0 : i2;
            if (i6 == 0 && v9eVar3.a.f == this.p.c.a.f) {
                return;
            }
            v1(zVarH1, null, null, Integer.valueOf(i2), i6 != 0 ? Integer.valueOf(i3) : null);
        }
    }

    @Override // androidx.media3.session.j.b
    public final void release() {
        g gVar = this.D;
        if (this.o) {
            return;
        }
        this.o = true;
        this.m = null;
        this.l.removeCallbacksAndMessages(null);
        a aVar = this.j;
        Handler handler = aVar.a;
        if (handler.hasMessages(1)) {
            try {
                k kVar = k.this;
                kVar.D.I0(kVar.c);
            } catch (RemoteException unused) {
                zkd.T("MCImplBase", "Error in sending flushCommandQueue");
            }
        }
        handler.removeCallbacksAndMessages(null);
        this.D = null;
        if (gVar != null) {
            int iB = this.b.b();
            try {
                gVar.asBinder().unlinkToDeath(this.g, 0);
                gVar.t(this.c, iB);
            } catch (RemoteException unused2) {
            }
        }
        this.i.d();
        a0 a0Var = this.b;
        q9 q9Var = new q9(this, 3);
        synchronized (a0Var.a) {
            try {
                Handler handlerP = vjg.p(null);
                a0Var.e = handlerP;
                a0Var.d = q9Var;
                if (a0Var.c.isEmpty()) {
                    a0Var.c();
                } else {
                    handlerP.postDelayed(new sm3(a0Var, 5), 30000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.session.j.b
    @Deprecated
    public final void s() {
        if (d1(26)) {
            W0(new ob3(this, 4));
            z zVar = this.p;
            int i = 1;
            int i2 = zVar.r - 1;
            if (i2 >= zVar.q.b) {
                this.p = zVar.c(i2, zVar.s);
                yh9 yh9Var = new yh9(this, i2, i);
                lz8<gdb.c> lz8Var = this.i;
                lz8Var.c(30, yh9Var);
                lz8Var.b();
            }
        }
    }

    @Override // androidx.media3.session.j.b
    public final oj9 s0() {
        return this.p.m;
    }

    public final void s1(long j) {
        long jK0 = K0() + j;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            jK0 = Math.min(jK0, duration);
        }
        r1(Y0(this.p), Math.max(jK0, 0L));
    }

    @Override // androidx.media3.session.j.b
    public final void stop() {
        if (d1(3)) {
            W0(new u91(this, 9));
            z zVar = this.p;
            v9e v9eVar = this.p.c;
            gdb.d dVar = v9eVar.a;
            boolean z = v9eVar.b;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            v9e v9eVar2 = this.p.c;
            long j = v9eVar2.d;
            long j2 = v9eVar2.a.f;
            int iB = y.b(j2, j);
            v9e v9eVar3 = this.p.c;
            z zVarJ = zVar.j(new v9e(dVar, z, jElapsedRealtime, j, j2, iB, 0L, v9eVar3.h, v9eVar3.i, v9eVar3.a.f));
            this.p = zVarJ;
            if (zVarJ.y != 1) {
                this.p = zVarJ.f(1, zVarJ.a);
                defpackage.l lVar = new defpackage.l(10);
                lz8<gdb.c> lz8Var = this.i;
                lz8Var.c(4, lVar);
                lz8Var.b();
            }
        }
    }

    @Override // androidx.media3.session.j.b
    public final void t(int i) {
        if (d1(34)) {
            W0(new fi9(this, i));
            z zVar = this.p;
            int i2 = zVar.r + 1;
            int i3 = zVar.q.c;
            if (i3 == 0 || i2 <= i3) {
                this.p = zVar.c(i2, zVar.s);
                gi9 gi9Var = new gi9(this, i2);
                lz8<gdb.c> lz8Var = this.i;
                lz8Var.c(30, gi9Var);
                lz8Var.b();
            }
        }
    }

    @Override // androidx.media3.session.j.b
    public final boolean t0() {
        return this.p.v;
    }

    public final void t1(List<ij9> list, int i, long j, boolean z) {
        int iA;
        gdb.d dVar;
        v9e v9eVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z2 = false;
        int i2 = 0;
        while (i2 < list.size()) {
            ij9 ij9Var = list.get(i2);
            i47<String> i47Var = LegacyConversions.a;
            emf.d dVar2 = new emf.d();
            int i3 = i2;
            dVar2.b(0, ij9Var, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, i3, i3, 0L);
            arrayList.add(dVar2);
            emf.b bVar = new emf.b();
            bVar.i(null, null, i3, -9223372036854775807L, 0L, ba.f, true);
            arrayList2.add(bVar);
            i2 = i3 + 1;
        }
        emf.c cVarU0 = U0(arrayList, arrayList2);
        e47<emf.d> e47Var = cVarU0.e;
        if (!cVarU0.p() && i >= e47Var.size()) {
            throw new IllegalSeekPositionException(cVarU0, i, j);
        }
        long j2 = j;
        if (z) {
            iA = cVarU0.a(this.p.i);
            j2 = -9223372036854775807L;
        } else if (i == -1) {
            gdb.d dVar3 = this.p.c.a;
            int i4 = dVar3.b;
            long j3 = dVar3.f;
            if (cVarU0.p() || i4 < e47Var.size()) {
                iA = i4;
                j2 = j3;
            } else {
                iA = cVarU0.a(this.p.i);
                j2 = -9223372036854775807L;
                z2 = true;
            }
        } else {
            iA = i;
        }
        b bVarB1 = b1(cVarU0, iA, j2);
        if (bVarB1 == null) {
            dVar = new gdb.d(null, iA, null, null, iA, j2 == -9223372036854775807L ? 0L : j2, j2 == -9223372036854775807L ? 0L : j2, -1, -1);
            v9eVar = new v9e(dVar, false, SystemClock.elapsedRealtime(), -9223372036854775807L, j2 == -9223372036854775807L ? 0L : j2, 0, 0L, -9223372036854775807L, -9223372036854775807L, j2 == -9223372036854775807L ? 0L : j2);
        } else {
            long j4 = bVarB1.b;
            dVar = new gdb.d(null, iA, list.get(iA), null, bVarB1.a, vjg.c0(j4), vjg.c0(j4), -1, -1);
            v9eVar = new v9e(dVar, false, SystemClock.elapsedRealtime(), -9223372036854775807L, vjg.c0(j4), 0, 0L, -9223372036854775807L, -9223372036854775807L, vjg.c0(j4));
        }
        z zVarH1 = h1(this.p, cVarU0, dVar, v9eVar, 4);
        int i5 = zVarH1.y;
        if (iA != -1 && i5 != 1) {
            i5 = (cVarU0.p() || z2) ? 4 : 2;
        }
        z zVarF = zVarH1.f(i5, this.p.a);
        v1(zVarF, 0, null, !this.p.j.p() ? 4 : null, (this.p.j.p() && zVarF.j.p()) ? null : 3);
    }

    @Override // androidx.media3.session.j.b
    public final void u(SurfaceView surfaceView) {
        if (d1(27)) {
            SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
            if (d1(27)) {
                if (holder == null) {
                    S0();
                    return;
                }
                if (this.A == holder) {
                    return;
                }
                R0();
                this.A = holder;
                holder.addCallback(this.h);
                Surface surface = holder.getSurface();
                if (surface == null || !surface.isValid()) {
                    this.z = null;
                    X0(new ah9(this, 1));
                    i1(0, 0);
                } else {
                    this.z = surface;
                    X0(new hi9(this, surface));
                    Rect surfaceFrame = holder.getSurfaceFrame();
                    i1(surfaceFrame.width(), surfaceFrame.height());
                }
            }
        }
    }

    @Override // androidx.media3.session.j.b
    public final void u0() {
        MediaController mediaController;
        if (!d1(1)) {
            zkd.T("MCImplBase", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
            return;
        }
        if (Build.VERSION.SDK_INT >= 31 && (mediaController = this.E) != null) {
            mediaController.getTransportControls().sendCustomAction("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST", (Bundle) null);
        }
        W0(new wk3(this, 2));
        u1(true);
    }

    public final void u1(boolean z) {
        z zVar = this.p;
        int i = zVar.x;
        int i2 = i == 1 ? 0 : i;
        if (zVar.t == z && i == i2) {
            return;
        }
        this.F = y.c(zVar, this.F, this.G, Z0().f);
        this.G = SystemClock.elapsedRealtime();
        v1(this.p.d(1, i2, z), null, 1, null, null);
    }

    @Override // androidx.media3.session.j.b
    public final void v(dqf dqfVar) {
        if (d1(29)) {
            W0(new kh9(this, dqfVar));
            z zVar = this.p;
            if (dqfVar != zVar.E) {
                this.p = zVar.o(dqfVar);
                u91 u91Var = new u91(dqfVar, 7);
                lz8<gdb.c> lz8Var = this.i;
                lz8Var.c(19, u91Var);
                lz8Var.b();
            }
        }
    }

    @Override // androidx.media3.session.j.b
    public final int v0() {
        return Y0(this.p);
    }

    public final void v1(z zVar, Integer num, Integer num2, Integer num3, Integer num4) {
        z zVar2 = this.p;
        this.p = zVar;
        k1(zVar2, zVar, num, num2, num3, num4);
    }

    @Override // androidx.media3.session.j.b
    public final void w(final int i) {
        if (d1(20)) {
            ka2.l(i >= 0);
            W0(new c() { // from class: di9
                @Override // androidx.media3.session.k.c
                public final void h(g gVar, int i2) {
                    gVar.c0(this.a.c, i2, i);
                }
            });
            n1(i, i + 1);
        }
    }

    @Override // androidx.media3.session.j.b
    public final void w0(final int i) {
        if (d1(15)) {
            W0(new ih9(this, i));
            z zVar = this.p;
            if (zVar.h != i) {
                this.p = zVar.i(i);
                lz8.a<gdb.c> aVar = new lz8.a() { // from class: jh9
                    @Override // lz8.a
                    public final void invoke(Object obj) {
                        ((gdb.c) obj).m(i);
                    }
                };
                lz8<gdb.c> lz8Var = this.i;
                lz8Var.c(8, aVar);
                lz8Var.b();
            }
        }
    }

    @Override // androidx.media3.session.j.b
    public final void x() {
        g gVar;
        aae aaeVar = this.e;
        aae.a aVar = aaeVar.a;
        aae.a aVar2 = aaeVar.a;
        int type = aVar.getType();
        int i = 1;
        v vVar = this.d;
        Bundle bundle = this.f;
        if (type == 0) {
            this.n = null;
            Object objB = aVar2.b();
            ka2.r(objB);
            IBinder iBinder = (IBinder) objB;
            int i2 = g.a.a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof g)) {
                g.a.C0059a c0059a = new g.a.C0059a();
                c0059a.a = iBinder;
                gVar = c0059a;
            } else {
                gVar = (g) iInterfaceQueryLocalInterface;
            }
            int iB = this.b.b();
            String packageName = vVar.getPackageName();
            int iMyPid = Process.myPid();
            this.a.getClass();
            try {
                gVar.P(this.c, iB, new yo2(packageName, iMyPid, bundle).b());
                return;
            } catch (RemoteException e2) {
                zkd.U("MCImplBase", "Failed to call connection request.", e2);
            }
        } else {
            this.n = new d(bundle);
            int i3 = Build.VERSION.SDK_INT >= 29 ? 4097 : 1;
            Intent intent = new Intent("androidx.media3.session.MediaSessionService");
            intent.setClassName(aVar2.e(), aVar2.c());
            try {
                if (vVar.bindService(intent, this.n, i3)) {
                    return;
                }
                zkd.T("MCImplBase", "bind to " + aaeVar + " failed");
            } catch (SecurityException e3) {
                zkd.U("MCImplBase", "bind to " + aaeVar + " not allowed", e3);
            }
        }
        j jVarZ0 = Z0();
        j jVarZ02 = Z0();
        Objects.requireNonNull(jVarZ02);
        jVarZ0.U0(new sm3(jVarZ02, i));
    }

    @Override // androidx.media3.session.j.b
    public final void x0(gdb.c cVar) {
        this.i.e(cVar);
    }

    @Override // androidx.media3.session.j.b
    public final void y(final int i, final int i2) {
        if (d1(20)) {
            ka2.l(i >= 0 && i2 >= i);
            W0(new c() { // from class: qh9
                @Override // androidx.media3.session.k.c
                public final void h(g gVar, int i3) {
                    gVar.J0(this.a.c, i3, i, i2);
                }
            });
            n1(i, i2);
        }
    }

    @Override // androidx.media3.session.j.b
    public final void y0(SurfaceView surfaceView) {
        if (d1(27)) {
            SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
            if (d1(27) && holder != null && this.A == holder) {
                S0();
            }
        }
    }

    @Override // androidx.media3.session.j.b
    public final void z() {
        if (d1(7)) {
            W0(new vk3(this, 2));
            emf emfVar = this.p.j;
            if (emfVar.p() || k()) {
                return;
            }
            boolean z = c1() != -1;
            emf.d dVarM = emfVar.m(Y0(this.p), new emf.d(), 0L);
            if (dVarM.h && dVarM.a()) {
                if (z) {
                    r1(c1(), -9223372036854775807L);
                }
            } else if (!z || K0() > this.p.C) {
                r1(Y0(this.p), 0L);
            } else {
                r1(c1(), -9223372036854775807L);
            }
        }
    }

    @Override // androidx.media3.session.j.b
    public final void z0(final int i, final int i2) {
        if (d1(20)) {
            ka2.l(i >= 0 && i2 >= 0);
            W0(new c() { // from class: ni9
                @Override // androidx.media3.session.k.c
                public final void h(g gVar, int i3) {
                    gVar.h0(this.a.c, i3, i, i2);
                }
            });
            j1(i, i + 1, i2);
        }
    }
}
