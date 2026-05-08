package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.a;
import androidx.media3.exoplayer.e;
import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.j;
import androidx.media3.exoplayer.source.h;
import defpackage.adb;
import defpackage.ak3;
import defpackage.akb;
import defpackage.al3;
import defpackage.ayd;
import defpackage.bg;
import defpackage.bh5;
import defpackage.c35;
import defpackage.cdb;
import defpackage.cw1;
import defpackage.d35;
import defpackage.dk3;
import defpackage.dqf;
import defpackage.dz1;
import defpackage.e35;
import defpackage.e47;
import defpackage.emf;
import defpackage.f35;
import defpackage.fpe;
import defpackage.fqf;
import defpackage.fzg;
import defpackage.g35;
import defpackage.g9;
import defpackage.gdb;
import defpackage.gie;
import defpackage.gqf;
import defpackage.hr3;
import defpackage.i35;
import defpackage.i47;
import defpackage.i73;
import defpackage.ij9;
import defpackage.im9;
import defpackage.jj9;
import defpackage.jl3;
import defpackage.jmf;
import defpackage.js9;
import defpackage.k35;
import defpackage.k81;
import defpackage.ka2;
import defpackage.l35;
import defpackage.l5;
import defpackage.lz8;
import defpackage.m20;
import defpackage.m35;
import defpackage.ma1;
import defpackage.n2f;
import defpackage.n60;
import defpackage.oj9;
import defpackage.ox0;
import defpackage.p35;
import defpackage.q20;
import defpackage.q83;
import defpackage.qic;
import defpackage.qng;
import defpackage.qyc;
import defpackage.r20;
import defpackage.r40;
import defpackage.r6;
import defpackage.r6g;
import defpackage.rng;
import defpackage.rp2;
import defpackage.s34;
import defpackage.sdb;
import defpackage.sf6;
import defpackage.sk3;
import defpackage.sn2;
import defpackage.t91;
import defpackage.tf2;
import defpackage.tog;
import defpackage.u91;
import defpackage.vjg;
import defpackage.w1d;
import defpackage.wee;
import defpackage.wk3;
import defpackage.wqf;
import defpackage.xdb;
import defpackage.xpf;
import defpackage.xtg;
import defpackage.yk3;
import defpackage.yp3;
import defpackage.yy1;
import defpackage.z25;
import defpackage.z71;
import defpackage.zkd;
import defpackage.zsd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class d extends ma1 implements ExoPlayer {
    public final b A;
    public final androidx.media3.exoplayer.a B;
    public final xtg C;
    public final fzg D;
    public final long E;
    public final z71<Integer> F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public i47<Integer> M;
    public final zsd N;
    public wee O;
    public gdb.a P;
    public oj9 Q;
    public oj9 R;
    public Object S;
    public Surface T;
    public SurfaceHolder U;
    public fpe V;
    public boolean W;
    public TextureView X;
    public final int Y;
    public gie Z;
    public ox0 a0;
    public final gqf b;
    public float b0;
    public final gdb.a c;
    public boolean c0;
    public final sn2 d = new sn2();
    public q83 d0;
    public final Context e;
    public final boolean e0;
    public final d f;
    public boolean f0;
    public final k[] g;
    public final int g0;
    public final k[] h;
    public boolean h0;
    public final fqf i;
    public final s34 i0;
    public final sf6 j;
    public tog j0;
    public final q20 k;
    public oj9 k0;
    public final e l;
    public adb l0;
    public final lz8<gdb.c> m;
    public int m0;
    public final CopyOnWriteArraySet<ExoPlayer.a> n;
    public long n0;
    public final emf.b o;
    public final ArrayList p;
    public final boolean q;
    public final h.a r;
    public final m20 s;
    public final Looper t;
    public final k81 u;
    public final long v;
    public final long w;
    public final long x;
    public final n2f y;
    public final a z;

    public final class a implements androidx.media3.exoplayer.video.g, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, fpe.b, a.b, ExoPlayer.a {
        public a() {
        }

        @Override // androidx.media3.exoplayer.video.g
        public final void a(tog togVar) {
            d dVar = d.this;
            dVar.j0 = togVar;
            dVar.m.f(25, new yk3(togVar, 1));
        }

        @Override // androidx.media3.exoplayer.video.g
        public final void b(ak3 ak3Var) {
            d.this.s.b(ak3Var);
        }

        @Override // androidx.media3.exoplayer.video.g
        public final void c(androidx.media3.common.a aVar, dk3 dk3Var) {
            d.this.s.c(aVar, dk3Var);
        }

        @Override // androidx.media3.exoplayer.video.g
        public final void d(String str) {
            d.this.s.d(str);
        }

        @Override // androidx.media3.exoplayer.video.g
        public final void e(long j, String str, long j2) {
            d.this.s.e(j, str, j2);
        }

        @Override // androidx.media3.exoplayer.video.g
        public final void f(Exception exc) {
            d.this.s.f(exc);
        }

        @Override // fpe.b
        public final void g(Surface surface) {
            d.this.s1(surface);
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.a
        public final void h() {
            d.this.x1();
        }

        @Override // androidx.media3.exoplayer.video.g
        public final void i(int i, long j) {
            d.this.s.i(i, j);
        }

        @Override // androidx.media3.exoplayer.video.g
        public final void j(ak3 ak3Var) {
            d.this.s.j(ak3Var);
        }

        @Override // androidx.media3.exoplayer.video.g
        public final void k(int i, long j) {
            d.this.s.k(i, j);
        }

        @Override // androidx.media3.exoplayer.video.g
        public final void l(Object obj, long j) {
            d dVar = d.this;
            dVar.s.l(obj, j);
            if (dVar.S == obj) {
                dVar.m.f(26, new r40(10));
            }
        }

        @Override // fpe.b
        public final void m() {
            d.this.s1(null);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Surface surface = new Surface(surfaceTexture);
            d dVar = d.this;
            dVar.s1(surface);
            dVar.T = surface;
            dVar.m1(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            d dVar = d.this;
            dVar.s1(null);
            dVar.m1(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            d.this.m1(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            d.this.m1(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            d dVar = d.this;
            if (dVar.W) {
                dVar.s1(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            d dVar = d.this;
            if (dVar.W) {
                dVar.s1(null);
            }
            dVar.m1(0, 0);
        }
    }

    public static final class b implements rng, cw1, j.b {
        public rng a;
        public cw1 b;
        public rng c;
        public cw1 d;

        @Override // defpackage.cw1
        public final void a(long j, float[] fArr) {
            cw1 cw1Var = this.d;
            if (cw1Var != null) {
                cw1Var.a(j, fArr);
            }
            cw1 cw1Var2 = this.b;
            if (cw1Var2 != null) {
                cw1Var2.a(j, fArr);
            }
        }

        @Override // defpackage.cw1
        public final void d() {
            cw1 cw1Var = this.d;
            if (cw1Var != null) {
                cw1Var.d();
            }
            cw1 cw1Var2 = this.b;
            if (cw1Var2 != null) {
                cw1Var2.d();
            }
        }

        @Override // defpackage.rng
        public final void e(long j, long j2, androidx.media3.common.a aVar, MediaFormat mediaFormat) {
            rng rngVar = this.c;
            if (rngVar != null) {
                rngVar.e(j, j2, aVar, mediaFormat);
            }
            rng rngVar2 = this.a;
            if (rngVar2 != null) {
                rngVar2.e(j, j2, aVar, mediaFormat);
            }
        }

        @Override // androidx.media3.exoplayer.j.b
        public final void m(int i, Object obj) {
            if (i == 7) {
                this.a = (rng) obj;
                return;
            }
            if (i == 8) {
                this.b = (cw1) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            fpe fpeVar = (fpe) obj;
            if (fpeVar == null) {
                this.c = null;
                this.d = null;
            } else {
                this.c = fpeVar.getVideoFrameMetadataListener();
                this.d = fpeVar.getCameraMotionListener();
            }
        }
    }

    public static final class c implements im9 {
        public final Object a;
        public final androidx.media3.exoplayer.source.f b;
        public emf c;

        public c(Object obj, androidx.media3.exoplayer.source.f fVar) {
            this.a = obj;
            this.b = fVar;
            this.c = fVar.o;
        }

        @Override // defpackage.im9
        public final Object a() {
            return this.a;
        }

        @Override // defpackage.im9
        public final emf b() {
            return this.c;
        }
    }

    static {
        jj9.a("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public d(ExoPlayer.b bVar) {
        Integer num = 0;
        try {
            zkd.D("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + vjg.a + "]");
            Context context = bVar.a;
            n2f n2fVar = bVar.b;
            this.e = context.getApplicationContext();
            bVar.h.getClass();
            this.s = new al3(n2fVar);
            this.g0 = bVar.j;
            this.a0 = bVar.k;
            this.Y = bVar.l;
            this.c0 = false;
            this.E = bVar.u;
            a aVar = new a();
            this.z = aVar;
            this.A = new b();
            Handler handler = new Handler(bVar.i);
            yp3 yp3Var = bVar.c.a;
            k[] kVarArrA = yp3Var.a(handler, aVar, aVar, aVar, aVar);
            this.g = kVarArrA;
            ka2.q(kVarArrA.length > 0);
            this.h = new k[kVarArrA.length];
            int i = 0;
            while (true) {
                k[] kVarArr = this.h;
                if (i >= kVarArr.length) {
                    break;
                }
                yp3Var.b(this.g[i]);
                kVarArr[i] = null;
                i++;
            }
            fqf fqfVar = (fqf) bVar.e.get();
            this.i = fqfVar;
            this.r = (h.a) bVar.d.get();
            k81 k81Var = (k81) bVar.g.get();
            this.u = k81Var;
            this.q = bVar.m;
            ayd aydVar = bVar.n;
            this.v = bVar.p;
            this.w = bVar.q;
            this.x = bVar.r;
            zsd zsdVar = bVar.o;
            this.N = zsdVar;
            Looper looper = bVar.i;
            this.t = looper;
            this.y = n2fVar;
            this.f = this;
            this.m = new lz8<>(looper, n2fVar, new l5(this, 13));
            CopyOnWriteArraySet<ExoPlayer.a> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
            this.n = copyOnWriteArraySet;
            this.p = new ArrayList();
            this.O = new wee.a();
            k[] kVarArr2 = this.g;
            boolean z = true;
            gqf gqfVar = new gqf(new w1d[kVarArr2.length], new p35[kVarArr2.length], wqf.b, (Object) null);
            this.b = gqfVar;
            this.o = new emf.b();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            int length = iArr.length;
            int i2 = 0;
            while (i2 < length) {
                k81 k81Var2 = k81Var;
                int i3 = iArr[i2];
                ka2.q(!false);
                sparseBooleanArray.append(i3, z);
                i2++;
                k81Var = k81Var2;
                num = num;
                z = true;
            }
            k81 k81Var3 = k81Var;
            Integer num2 = num;
            if (fqfVar instanceof hr3) {
                ka2.q(!false);
                sparseBooleanArray.append(29, true);
            }
            ka2.q(!false);
            bh5 bh5Var = new bh5(sparseBooleanArray);
            this.c = new gdb.a(bh5Var);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i4 = 0; i4 < bh5Var.a.size(); i4++) {
                int iB = bh5Var.b(i4);
                ka2.q(!false);
                sparseBooleanArray2.append(iB, true);
            }
            ka2.q(!false);
            sparseBooleanArray2.append(4, true);
            ka2.q(!false);
            sparseBooleanArray2.append(10, true);
            ka2.q(!false);
            this.P = new gdb.a(new bh5(sparseBooleanArray2));
            this.j = n2fVar.c(looper, null);
            q20 q20Var = new q20(this, 2);
            this.k = q20Var;
            this.l0 = adb.k(gqfVar);
            this.s.q(this, looper);
            sdb sdbVar = new sdb(bVar.x);
            e eVar = new e(this.e, this.g, this.h, fqfVar, gqfVar, bVar.f.get(), k81Var3, this.G, this.H, this.s, aydVar, bVar.s, bVar.t, looper, n2fVar, q20Var, sdbVar, this.A);
            sf6 sf6Var = eVar.W;
            this.l = eVar;
            Looper looper2 = eVar.Y;
            this.b0 = 1.0f;
            this.G = 0;
            oj9 oj9Var = oj9.K;
            this.Q = oj9Var;
            this.R = oj9Var;
            this.k0 = oj9Var;
            this.m0 = -1;
            this.d0 = q83.d;
            this.e0 = true;
            Z(this.s);
            k81Var3.d(new Handler(looper), this.s);
            copyOnWriteArraySet.add(this.z);
            if (Build.VERSION.SDK_INT >= 31) {
                n2fVar.c(eVar.Y, null).i(new m35(this.e, bVar.v, this, sdbVar));
            }
            z71<Integer> z71Var = new z71<>(num2, looper2, looper, n2fVar, new r20(this, 3));
            this.F = z71Var;
            z71Var.a(new f35(this, 0));
            androidx.media3.exoplayer.a aVar2 = new androidx.media3.exoplayer.a(bVar.a, looper2, bVar.i, this.z, n2fVar);
            this.B = aVar2;
            aVar2.a();
            xtg xtgVar = new xtg();
            context.getApplicationContext();
            n2fVar.c(looper2, null);
            this.C = xtgVar;
            fzg fzgVar = new fzg();
            context.getApplicationContext();
            n2fVar.c(looper2, null);
            this.D = fzgVar;
            this.i0 = s34.e;
            this.j0 = tog.d;
            this.Z = gie.c;
            sf6Var.e(38, zsdVar).b();
            sf6Var.b(this.a0, 31, 0, 0).b();
            p1(this.a0, 1, 3);
            p1(Integer.valueOf(this.Y), 2, 4);
            p1(num2, 2, 5);
            p1(Boolean.valueOf(this.c0), 1, 9);
            p1(this.A, 6, 8);
            p1(Integer.valueOf(this.g0), -1, 16);
            this.d.d();
        } catch (Throwable th) {
            this.d.d();
            throw th;
        }
    }

    public static long i1(adb adbVar) {
        emf.d dVar = new emf.d();
        emf.b bVar = new emf.b();
        adbVar.a.g(adbVar.b.a, bVar);
        long j = adbVar.c;
        return j == -9223372036854775807L ? adbVar.a.m(bVar.c, dVar, 0L).k : bVar.e + j;
    }

    public static adb j1(adb adbVar, int i) {
        adb adbVarH = adbVar.h(i);
        return (i == 1 || i == 4) ? adbVarH.b(false) : adbVarH;
    }

    @Override // defpackage.gdb
    public final void A(boolean z) {
        y1();
        v1(1, z);
    }

    @Override // defpackage.gdb
    public final void A0(int i, int i2, int i3) {
        y1();
        ka2.l(i >= 0 && i <= i2 && i3 >= 0);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int iMin = Math.min(i2, size);
        int iMin2 = Math.min(i3, size - (iMin - i));
        if (i >= size || i == iMin || i == iMin2) {
            return;
        }
        emf emfVarM = M();
        this.I++;
        vjg.N(i, iMin, iMin2, arrayList);
        this.O = this.O.d();
        xdb xdbVar = new xdb(arrayList, this.O);
        adb adbVar = this.l0;
        adb adbVarK1 = k1(adbVar, xdbVar, h1(emfVarM, xdbVar, g1(adbVar), e1(this.l0)));
        wee weeVar = this.O;
        e eVar = this.l;
        eVar.getClass();
        eVar.W.e(19, new e.c(i, iMin, iMin2, weeVar)).b();
        w1(adbVarK1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.gdb
    public final void C(int i) {
        y1();
    }

    @Override // defpackage.gdb
    public final boolean C0() {
        y1();
        return false;
    }

    @Override // defpackage.gdb
    public final wqf D() {
        y1();
        return (wqf) this.l0.i.d;
    }

    @Override // defpackage.gdb
    public final boolean D0() {
        y1();
        return this.H;
    }

    @Override // defpackage.gdb
    public final q83 E() {
        y1();
        return this.d0;
    }

    @Override // defpackage.gdb
    public final long E0() {
        y1();
        if (this.l0.a.p()) {
            return this.n0;
        }
        adb adbVar = this.l0;
        if (adbVar.k.d != adbVar.b.d) {
            return vjg.c0(adbVar.a.m(v0(), this.a, 0L).l);
        }
        long j = adbVar.q;
        if (this.l0.k.b()) {
            adb adbVar2 = this.l0;
            emf.b bVarG = adbVar2.a.g(adbVar2.k.a, this.o);
            long jD = bVarG.d(this.l0.k.b);
            j = jD == Long.MIN_VALUE ? bVarG.d : jD;
        }
        adb adbVar3 = this.l0;
        emf emfVar = adbVar3.a;
        Object obj = adbVar3.k.a;
        emf.b bVar = this.o;
        emfVar.g(obj, bVar);
        return vjg.c0(j + bVar.e);
    }

    @Override // defpackage.gdb
    public final void F(ox0 ox0Var, boolean z) {
        y1();
        if (this.h0) {
            return;
        }
        boolean zEquals = Objects.equals(this.a0, ox0Var);
        lz8<gdb.c> lz8Var = this.m;
        if (!zEquals) {
            this.a0 = ox0Var;
            p1(ox0Var, 1, 3);
            lz8Var.c(20, new i73(ox0Var, 1));
        }
        this.l.W.b(this.a0, 31, z ? 1 : 0, 0).b();
        lz8Var.b();
    }

    @Override // defpackage.gdb
    @Deprecated
    public final void F0(int i) {
        y1();
    }

    @Override // defpackage.gdb
    public final void G(oj9 oj9Var) {
        y1();
        if (oj9Var.equals(this.R)) {
            return;
        }
        this.R = oj9Var;
        this.m.f(15, new i35(this, 0));
    }

    @Override // defpackage.gdb
    public final int H() {
        y1();
        if (k()) {
            return this.l0.b.b;
        }
        return -1;
    }

    @Override // defpackage.gdb
    @Deprecated
    public final void I(boolean z) {
        y1();
    }

    @Override // defpackage.gdb
    public final oj9 I0() {
        y1();
        return this.Q;
    }

    @Override // defpackage.gdb
    public final void J0(List list) {
        y1();
        ArrayList arrayListC1 = c1(list);
        y1();
        q1(arrayListC1, -1, -9223372036854775807L, true);
    }

    @Override // defpackage.gdb
    public final void K(List list, int i, int i2) {
        y1();
        ka2.l(i >= 0 && i2 >= i);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        if (i > size) {
            return;
        }
        int iMin = Math.min(i2, size);
        if (iMin - i == list.size()) {
            for (int i3 = i; i3 < iMin; i3++) {
                if (((c) arrayList.get(i3)).b.k.a((ij9) list.get(i3 - i))) {
                }
            }
            this.I++;
            this.l.W.b(list, 27, i, iMin).b();
            for (int i4 = i; i4 < iMin; i4++) {
                c cVar = (c) arrayList.get(i4);
                cVar.c = new jmf(cVar.c, (ij9) list.get(i4 - i));
            }
            w1(this.l0.j(new xdb(arrayList, this.O)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList arrayListC1 = c1(list);
        if (!arrayList.isEmpty()) {
            adb adbVarN1 = n1(Z0(this.l0, iMin, arrayListC1), i, iMin);
            w1(adbVarN1, 0, !adbVarN1.b.a.equals(this.l0.b.a), 4, f1(adbVarN1), -1, false);
        } else {
            boolean z = this.m0 == -1;
            y1();
            q1(arrayListC1, -1, -9223372036854775807L, z);
        }
    }

    @Override // defpackage.gdb
    public final long K0() {
        y1();
        return vjg.c0(f1(this.l0));
    }

    @Override // defpackage.gdb
    public final int L() {
        y1();
        return this.l0.n;
    }

    @Override // defpackage.gdb
    public final long L0() {
        y1();
        return this.v;
    }

    @Override // defpackage.gdb
    public final emf M() {
        y1();
        return this.l0.a;
    }

    @Override // defpackage.gdb
    public final gie N0() {
        y1();
        return this.Z;
    }

    @Override // defpackage.gdb
    @Deprecated
    public final void O() {
        y1();
    }

    @Override // defpackage.gdb
    public final dqf P() {
        y1();
        dqf dqfVarA = this.i.a();
        return this.L ? dqfVarA.a().g(this.M).b() : dqfVarA;
    }

    @Override // defpackage.gdb
    public final Looper Q0() {
        return this.t;
    }

    @Override // defpackage.gdb
    public final void R(TextureView textureView) {
        y1();
        if (textureView == null) {
            b1();
            return;
        }
        o1();
        this.X = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            zkd.T("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.z);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            s1(null);
            m1(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            s1(surface);
            this.T = surface;
            m1(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // defpackage.gdb
    public final int S() {
        y1();
        return 0;
    }

    @Override // defpackage.ma1
    public final void U0(int i, long j, boolean z) {
        y1();
        if (i == -1) {
            return;
        }
        ka2.l(i >= 0);
        emf emfVar = this.l0.a;
        if (emfVar.p() || i < emfVar.o()) {
            this.s.t();
            this.I++;
            int i2 = 3;
            if (k()) {
                zkd.T("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                e.C0046e c0046e = new e.C0046e(this.l0);
                c0046e.a(1);
                d dVar = (d) this.k.b;
                dVar.j.i(new n60(i2, dVar, c0046e));
                return;
            }
            adb adbVarH = this.l0;
            int i3 = adbVarH.e;
            if (i3 == 3 || (i3 == 4 && !emfVar.p())) {
                adbVarH = this.l0.h(2);
            }
            int iV0 = v0();
            adb adbVarK1 = k1(adbVarH, emfVar, l1(emfVar, i, j));
            this.l.W.e(3, new e.g(emfVar, i, vjg.O(j))).b();
            w1(adbVarK1, 0, true, 1, f1(adbVarK1), iV0, z);
        }
    }

    @Override // defpackage.gdb
    public final gdb.a V() {
        y1();
        return this.P;
    }

    @Override // defpackage.gdb
    public final boolean W() {
        y1();
        return this.l0.l;
    }

    @Override // defpackage.gdb
    public final void X(boolean z) {
        y1();
        if (this.H != z) {
            this.H = z;
            this.l.W.g(12, z ? 1 : 0, 0).b();
            d35 d35Var = new d35(0, z);
            lz8<gdb.c> lz8Var = this.m;
            lz8Var.c(9, d35Var);
            u1();
            lz8Var.b();
        }
    }

    @Override // defpackage.gdb
    public final long Y() {
        y1();
        return this.x;
    }

    public final ArrayList Y0(int i, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            i.c cVar = new i.c((androidx.media3.exoplayer.source.h) list.get(i2), this.q);
            arrayList.add(cVar);
            c cVar2 = new c(cVar.b, cVar.a);
            this.p.add(i2 + i, cVar2);
        }
        this.O = this.O.h(i, arrayList.size());
        return arrayList;
    }

    @Override // defpackage.gdb
    public final void Z(gdb.c cVar) {
        cVar.getClass();
        this.m.a(cVar);
    }

    public final adb Z0(adb adbVar, int i, ArrayList arrayList) {
        emf emfVar = adbVar.a;
        this.I++;
        ArrayList arrayListY0 = Y0(i, arrayList);
        xdb xdbVar = new xdb(this.p, this.O);
        adb adbVarK1 = k1(adbVar, xdbVar, h1(emfVar, xdbVar, g1(adbVar), e1(adbVar)));
        this.l.W.b(new e.b(arrayListY0, this.O, -1, -9223372036854775807L), 18, i, 0).b();
        return adbVarK1;
    }

    @Override // defpackage.gdb
    public final ExoPlaybackException a() {
        y1();
        return this.l0.f;
    }

    public final oj9 a1() {
        emf emfVarM = M();
        if (emfVarM.p()) {
            return this.k0;
        }
        ij9 ij9Var = emfVarM.m(v0(), this.a, 0L).b;
        oj9.a aVarA = this.k0.a();
        oj9 oj9Var = ij9Var.d;
        if (oj9Var != null) {
            e47<String> e47Var = oj9Var.J;
            byte[] bArr = oj9Var.k;
            CharSequence charSequence = oj9Var.a;
            if (charSequence != null) {
                aVarA.a = charSequence;
            }
            CharSequence charSequence2 = oj9Var.b;
            if (charSequence2 != null) {
                aVarA.b = charSequence2;
            }
            CharSequence charSequence3 = oj9Var.c;
            if (charSequence3 != null) {
                aVarA.c = charSequence3;
            }
            CharSequence charSequence4 = oj9Var.d;
            if (charSequence4 != null) {
                aVarA.d = charSequence4;
            }
            CharSequence charSequence5 = oj9Var.e;
            if (charSequence5 != null) {
                aVarA.e = charSequence5;
            }
            CharSequence charSequence6 = oj9Var.f;
            if (charSequence6 != null) {
                aVarA.f = charSequence6;
            }
            CharSequence charSequence7 = oj9Var.g;
            if (charSequence7 != null) {
                aVarA.g = charSequence7;
            }
            Long l = oj9Var.h;
            if (l != null) {
                aVarA.c(l);
            }
            qic qicVar = oj9Var.i;
            if (qicVar != null) {
                aVarA.i = qicVar;
            }
            qic qicVar2 = oj9Var.j;
            if (qicVar2 != null) {
                aVarA.j = qicVar2;
            }
            Uri uri = oj9Var.m;
            if (uri != null || bArr != null) {
                aVarA.m = uri;
                aVarA.b(bArr, oj9Var.l);
            }
            Integer num = oj9Var.n;
            if (num != null) {
                aVarA.n = num;
            }
            Integer num2 = oj9Var.o;
            if (num2 != null) {
                aVarA.o = num2;
            }
            Integer num3 = oj9Var.p;
            if (num3 != null) {
                aVarA.p = num3;
            }
            Boolean bool = oj9Var.q;
            if (bool != null) {
                aVarA.q = bool;
            }
            Boolean bool2 = oj9Var.r;
            if (bool2 != null) {
                aVarA.r = bool2;
            }
            Integer num4 = oj9Var.s;
            if (num4 != null) {
                aVarA.s = num4;
            }
            Integer num5 = oj9Var.t;
            if (num5 != null) {
                aVarA.s = num5;
            }
            Integer num6 = oj9Var.u;
            if (num6 != null) {
                aVarA.t = num6;
            }
            Integer num7 = oj9Var.v;
            if (num7 != null) {
                aVarA.u = num7;
            }
            Integer num8 = oj9Var.w;
            if (num8 != null) {
                aVarA.v = num8;
            }
            Integer num9 = oj9Var.x;
            if (num9 != null) {
                aVarA.w = num9;
            }
            Integer num10 = oj9Var.y;
            if (num10 != null) {
                aVarA.x = num10;
            }
            CharSequence charSequence8 = oj9Var.z;
            if (charSequence8 != null) {
                aVarA.y = charSequence8;
            }
            CharSequence charSequence9 = oj9Var.A;
            if (charSequence9 != null) {
                aVarA.z = charSequence9;
            }
            CharSequence charSequence10 = oj9Var.B;
            if (charSequence10 != null) {
                aVarA.A = charSequence10;
            }
            Integer num11 = oj9Var.C;
            if (num11 != null) {
                aVarA.B = num11;
            }
            Integer num12 = oj9Var.D;
            if (num12 != null) {
                aVarA.C = num12;
            }
            CharSequence charSequence11 = oj9Var.E;
            if (charSequence11 != null) {
                aVarA.D = charSequence11;
            }
            CharSequence charSequence12 = oj9Var.F;
            if (charSequence12 != null) {
                aVarA.E = charSequence12;
            }
            CharSequence charSequence13 = oj9Var.G;
            if (charSequence13 != null) {
                aVarA.F = charSequence13;
            }
            Integer num13 = oj9Var.H;
            if (num13 != null) {
                aVarA.G = num13;
            }
            Bundle bundle = oj9Var.I;
            if (bundle != null) {
                aVarA.H = bundle;
            }
            if (!e47Var.isEmpty()) {
                aVarA.I = e47.j(e47Var);
            }
        }
        return new oj9(aVarA);
    }

    @Override // defpackage.gdb
    public final int b() {
        y1();
        return this.l0.e;
    }

    @Override // defpackage.gdb
    public final int b0() {
        y1();
        if (this.l0.a.p()) {
            return 0;
        }
        adb adbVar = this.l0;
        return adbVar.a.b(adbVar.b.a);
    }

    public final void b1() {
        y1();
        o1();
        s1(null);
        m1(0, 0);
    }

    @Override // defpackage.gdb
    public final void c0(TextureView textureView) {
        y1();
        if (textureView == null || textureView != this.X) {
            return;
        }
        b1();
    }

    public final ArrayList c1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.r.a((ij9) list.get(i)));
        }
        return arrayList;
    }

    @Override // defpackage.gdb
    public final boolean d() {
        y1();
        return this.l0.g;
    }

    @Override // defpackage.gdb
    public final tog d0() {
        y1();
        return this.j0;
    }

    public final j d1(j.b bVar) {
        int iG1 = g1(this.l0);
        emf emfVar = this.l0.a;
        if (iG1 == -1) {
            iG1 = 0;
        }
        n2f n2fVar = this.y;
        e eVar = this.l;
        return new j(eVar, bVar, emfVar, iG1, n2fVar, eVar.Y);
    }

    @Override // defpackage.gdb
    public final cdb e() {
        y1();
        return this.l0.o;
    }

    @Override // defpackage.gdb
    public final float e0() {
        y1();
        return this.b0;
    }

    public final long e1(adb adbVar) {
        h.b bVar = adbVar.b;
        long j = adbVar.c;
        emf emfVar = adbVar.a;
        if (!bVar.b()) {
            return vjg.c0(f1(adbVar));
        }
        Object obj = adbVar.b.a;
        emf.b bVar2 = this.o;
        emfVar.g(obj, bVar2);
        if (j == -9223372036854775807L) {
            return vjg.c0(emfVar.m(g1(adbVar), this.a, 0L).k);
        }
        return vjg.c0(j) + vjg.c0(bVar2.e);
    }

    @Override // defpackage.gdb
    public final void f() {
        y1();
        adb adbVar = this.l0;
        if (adbVar.e != 1) {
            return;
        }
        adb adbVarF = adbVar.f(null);
        adb adbVarJ1 = j1(adbVarF, adbVarF.a.p() ? 4 : 2);
        this.I++;
        this.l.W.c(29).b();
        w1(adbVarJ1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.gdb
    public final ox0 f0() {
        y1();
        return this.a0;
    }

    public final long f1(adb adbVar) {
        if (adbVar.a.p()) {
            return vjg.O(this.n0);
        }
        long jL = adbVar.p ? adbVar.l() : adbVar.s;
        if (adbVar.b.b()) {
            return jL;
        }
        emf emfVar = adbVar.a;
        Object obj = adbVar.b.a;
        emf.b bVar = this.o;
        emfVar.g(obj, bVar);
        return jL + bVar.e;
    }

    @Override // defpackage.gdb
    public final void g(cdb cdbVar) {
        y1();
        if (cdbVar == null) {
            cdbVar = cdb.d;
        }
        if (this.l0.o.equals(cdbVar)) {
            return;
        }
        adb adbVarG = this.l0.g(cdbVar);
        this.I++;
        this.l.W.e(4, cdbVar).b();
        w1(adbVarG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.gdb
    public final s34 g0() {
        y1();
        return this.i0;
    }

    public final int g1(adb adbVar) {
        return adbVar.a.p() ? this.m0 : adbVar.a.g(adbVar.b.a, this.o).c;
    }

    @Override // defpackage.gdb
    public final long getDuration() {
        y1();
        if (!k()) {
            return a0();
        }
        adb adbVar = this.l0;
        h.b bVar = adbVar.b;
        emf emfVar = adbVar.a;
        Object obj = bVar.a;
        emf.b bVar2 = this.o;
        emfVar.g(obj, bVar2);
        return vjg.c0(bVar2.a(bVar.b, bVar.c));
    }

    @Override // defpackage.gdb
    public final void h0(int i, int i2) {
        y1();
    }

    public final Pair h1(emf emfVar, xdb xdbVar, int i, long j) {
        if (emfVar.p() || xdbVar.p()) {
            boolean z = !emfVar.p() && xdbVar.p();
            return l1(xdbVar, z ? -1 : i, z ? -9223372036854775807L : j);
        }
        Pair<Object, Long> pairI = emfVar.i(this.a, this.o, i, vjg.O(j));
        Object obj = pairI.first;
        if (xdbVar.b(obj) != -1) {
            return pairI;
        }
        int iT = e.T(this.a, this.o, this.G, this.H, obj, emfVar, xdbVar);
        if (iT == -1) {
            return l1(xdbVar, -1, -9223372036854775807L);
        }
        emf.d dVar = this.a;
        xdbVar.m(iT, dVar, 0L);
        return l1(xdbVar, iT, vjg.c0(dVar.k));
    }

    @Override // defpackage.gdb
    public final int i() {
        y1();
        return this.G;
    }

    @Override // defpackage.gdb
    public final int i0() {
        y1();
        if (k()) {
            return this.l0.b.c;
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        y1();
        return this.L;
    }

    @Override // defpackage.gdb
    public final void j(Surface surface) {
        y1();
        o1();
        s1(surface);
        int i = surface == null ? 0 : -1;
        m1(i, i);
    }

    @Override // defpackage.gdb
    public final boolean k() {
        y1();
        return this.l0.b.b();
    }

    @Override // defpackage.gdb
    public final void k0(float f) {
        y1();
        final float fH = vjg.h(f, 0.0f, 1.0f);
        if (this.b0 == fH) {
            return;
        }
        this.b0 = fH;
        this.l.W.e(32, Float.valueOf(fH)).b();
        this.m.f(22, new lz8.a() { // from class: a35
            @Override // lz8.a
            public final void invoke(Object obj) {
                ((gdb.c) obj).W(fH);
            }
        });
    }

    public final adb k1(adb adbVar, emf emfVar, Pair<Object, Long> pair) {
        List<js9> list;
        ka2.l(emfVar.p() || pair != null);
        emf emfVar2 = adbVar.a;
        long jE1 = e1(adbVar);
        adb adbVarJ = adbVar.j(emfVar);
        if (emfVar.p()) {
            h.b bVar = adb.u;
            long jO = vjg.O(this.n0);
            adb adbVarC = adbVarJ.d(bVar, jO, jO, jO, 0L, xpf.d, this.b, qyc.e).c(bVar);
            adbVarC.q = adbVarC.s;
            return adbVarC;
        }
        Object obj = adbVarJ.b.a;
        String str = vjg.a;
        boolean zEquals = obj.equals(pair.first);
        h.b bVar2 = !zEquals ? new h.b(pair.first) : adbVarJ.b;
        long jLongValue = ((Long) pair.second).longValue();
        long jO2 = vjg.O(jE1);
        if (!emfVar2.p()) {
            jO2 -= emfVar2.g(obj, this.o).e;
        }
        if (!zEquals || jLongValue < jO2) {
            h.b bVar3 = bVar2;
            ka2.q(!bVar3.b());
            xpf xpfVar = !zEquals ? xpf.d : adbVarJ.h;
            gqf gqfVar = !zEquals ? this.b : adbVarJ.i;
            if (zEquals) {
                list = adbVarJ.j;
            } else {
                e47.b bVar4 = e47.b;
                list = qyc.e;
            }
            adb adbVarC2 = adbVarJ.d(bVar3, jLongValue, jLongValue, jLongValue, 0L, xpfVar, gqfVar, list).c(bVar3);
            adbVarC2.q = jLongValue;
            return adbVarC2;
        }
        if (jLongValue != jO2) {
            h.b bVar5 = bVar2;
            ka2.q(!bVar5.b());
            long jMax = Math.max(0L, adbVarJ.r - (jLongValue - jO2));
            long j = adbVarJ.q;
            if (adbVarJ.k.equals(adbVarJ.b)) {
                j = jLongValue + jMax;
            }
            adb adbVarD = adbVarJ.d(bVar5, jLongValue, jLongValue, jLongValue, jMax, adbVarJ.h, adbVarJ.i, adbVarJ.j);
            adbVarD.q = j;
            return adbVarD;
        }
        int iB = emfVar.b(adbVarJ.k.a);
        if (iB != -1 && emfVar.f(iB, this.o, false).c == emfVar.g(bVar2.a, this.o).c) {
            return adbVarJ;
        }
        emfVar.g(bVar2.a, this.o);
        boolean zB = bVar2.b();
        emf.b bVar6 = this.o;
        long jA = zB ? bVar6.a(bVar2.b, bVar2.c) : bVar6.d;
        h.b bVar7 = bVar2;
        adb adbVarC3 = adbVarJ.d(bVar7, adbVarJ.s, adbVarJ.s, adbVarJ.d, jA - adbVarJ.s, adbVarJ.h, adbVarJ.i, adbVarJ.j).c(bVar7);
        adbVarC3.q = jA;
        return adbVarC3;
    }

    @Override // defpackage.gdb
    public final long l() {
        y1();
        return vjg.c0(this.l0.r);
    }

    @Override // defpackage.gdb
    public final void l0(List<ij9> list, int i, long j) {
        y1();
        ArrayList arrayListC1 = c1(list);
        y1();
        q1(arrayListC1, i, j, false);
    }

    public final Pair<Object, Long> l1(emf emfVar, int i, long j) {
        if (emfVar.p()) {
            this.m0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.n0 = j;
            return null;
        }
        if (i == -1 || i >= emfVar.o()) {
            i = emfVar.a(this.H);
            j = vjg.c0(emfVar.m(i, this.a, 0L).k);
        }
        return emfVar.i(this.a, this.o, i, vjg.O(j));
    }

    public final void m1(final int i, final int i2) {
        gie gieVar = this.Z;
        if (i == gieVar.a && i2 == gieVar.b) {
            return;
        }
        this.Z = new gie(i, i2);
        this.m.f(24, new lz8.a() { // from class: b35
            @Override // lz8.a
            public final void invoke(Object obj) {
                ((gdb.c) obj).Q(i, i2);
            }
        });
        p1(new gie(i, i2), 2, 14);
    }

    @Override // defpackage.gdb
    public final long n0() {
        y1();
        return this.w;
    }

    public final adb n1(adb adbVar, int i, int i2) {
        int iG1 = g1(adbVar);
        long jE1 = e1(adbVar);
        emf emfVar = adbVar.a;
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        this.I++;
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            arrayList.remove(i3);
        }
        this.O = this.O.a(i, i2);
        xdb xdbVar = new xdb(arrayList, this.O);
        adb adbVarK1 = k1(adbVar, xdbVar, h1(emfVar, xdbVar, iG1, jE1));
        int i4 = adbVarK1.e;
        if (i4 != 1 && i4 != 4 && i < i2 && i2 == size && iG1 >= adbVarK1.a.o()) {
            adbVarK1 = j1(adbVarK1, 4);
        }
        this.l.W.b(this.O, 20, i, i2).b();
        return adbVarK1;
    }

    public final void o1() {
        fpe fpeVar = this.V;
        a aVar = this.z;
        if (fpeVar != null) {
            j jVarD1 = d1(this.A);
            ka2.q(!jVarD1.f);
            jVarD1.c = 10000;
            ka2.q(!jVarD1.f);
            jVarD1.d = null;
            jVarD1.b();
            this.V.a.remove(aVar);
            this.V = null;
        }
        TextureView textureView = this.X;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != aVar) {
                zkd.T("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.X.setSurfaceTextureListener(null);
            }
            this.X = null;
        }
        SurfaceHolder surfaceHolder = this.U;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(aVar);
            this.U = null;
        }
    }

    @Override // defpackage.gdb
    public final long p0() {
        y1();
        return e1(this.l0);
    }

    public final void p1(Object obj, int i, int i2) {
        for (k kVar : this.g) {
            if (i == -1 || kVar.p() == i) {
                j jVarD1 = d1(kVar);
                ka2.q(!jVarD1.f);
                jVarD1.c = i2;
                ka2.q(!jVarD1.f);
                jVarD1.d = obj;
                jVarD1.b();
            }
        }
        for (k kVar2 : this.h) {
            if (kVar2 != null && (i == -1 || kVar2.p() == i)) {
                j jVarD12 = d1(kVar2);
                ka2.q(!jVarD12.f);
                jVarD12.c = i2;
                ka2.q(!jVarD12.f);
                jVarD12.d = obj;
                jVarD12.b();
            }
        }
    }

    @Override // defpackage.gdb
    public final void q0(int i, List<ij9> list) {
        y1();
        ArrayList arrayListC1 = c1(list);
        y1();
        ka2.l(i >= 0);
        ArrayList arrayList = this.p;
        int iMin = Math.min(i, arrayList.size());
        if (!arrayList.isEmpty()) {
            w1(Z0(this.l0, iMin, arrayListC1), 0, false, 5, -9223372036854775807L, -1, false);
            return;
        }
        boolean z = this.m0 == -1;
        y1();
        q1(arrayListC1, -1, -9223372036854775807L, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q1(java.util.List<androidx.media3.exoplayer.source.h> r16, int r17, long r18, boolean r20) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.d.q1(java.util.List, int, long, boolean):void");
    }

    @Override // defpackage.gdb
    public final void r(int i, boolean z) {
        y1();
    }

    @Override // defpackage.gdb
    public final long r0() {
        y1();
        if (!k()) {
            return E0();
        }
        adb adbVar = this.l0;
        return adbVar.k.equals(adbVar.b) ? vjg.c0(this.l0.q) : getDuration();
    }

    public final void r1(SurfaceHolder surfaceHolder) {
        this.W = false;
        this.U = surfaceHolder;
        surfaceHolder.addCallback(this.z);
        Surface surface = this.U.getSurface();
        if (surface == null || !surface.isValid()) {
            m1(0, 0);
        } else {
            Rect surfaceFrame = this.U.getSurfaceFrame();
            m1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // defpackage.gdb
    @Deprecated
    public final void s() {
        y1();
    }

    @Override // defpackage.gdb
    public final oj9 s0() {
        y1();
        return this.R;
    }

    public final void s1(Object obj) {
        Object obj2 = this.S;
        boolean zC = true;
        boolean z = (obj2 == null || obj2 == obj) ? false : true;
        long j = z ? this.E : -9223372036854775807L;
        e eVar = this.l;
        if (!eVar.x0 && eVar.Y.getThread().isAlive()) {
            sn2 sn2Var = new sn2(eVar.f0);
            eVar.W.e(30, new Pair(obj, sn2Var)).b();
            if (j != -9223372036854775807L) {
                zC = sn2Var.c(j);
            }
        }
        if (z) {
            Object obj3 = this.S;
            Surface surface = this.T;
            if (obj3 == surface) {
                surface.release();
                this.T = null;
            }
        }
        this.S = obj;
        if (zC) {
            return;
        }
        t1(new ExoPlaybackException(2, new ExoTimeoutException(3), 1003));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        y1();
        p1(imageOutput, 4, 15);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z) {
        dqf dqfVarB;
        y1();
        if (z == this.L) {
            return;
        }
        this.L = z;
        zsd zsdVar = this.N;
        if (!zsdVar.a.isEmpty()) {
            fqf fqfVar = this.i;
            fqfVar.getClass();
            if (fqfVar instanceof hr3) {
                dqf dqfVarA = fqfVar.a();
                if (z) {
                    this.M = dqfVarA.E;
                    i47<Integer> i47Var = zsdVar.a;
                    dqf.b bVarA = dqfVarA.a();
                    r6g<Integer> it = i47Var.iterator();
                    while (it.hasNext()) {
                        bVarA.m(it.next().intValue(), true);
                    }
                    dqfVarB = bVarA.b();
                } else {
                    dqfVarB = dqfVarA.a().g(this.M).b();
                    this.M = null;
                }
                if (!dqfVarB.equals(dqfVarA)) {
                    fqfVar.g(dqfVarB);
                }
            }
        }
        this.l.W.e(36, Boolean.valueOf(z)).b();
        adb adbVar = this.l0;
        v1(adbVar.m, adbVar.l);
    }

    @Override // defpackage.gdb
    public final void stop() {
        y1();
        t1(null);
        this.d0 = new q83(this.l0.s, qyc.e);
    }

    @Override // defpackage.gdb
    public final void t(int i) {
        y1();
    }

    public final void t1(ExoPlaybackException exoPlaybackException) {
        adb adbVar = this.l0;
        adb adbVarC = adbVar.c(adbVar.b);
        adbVarC.q = adbVarC.s;
        adbVarC.r = 0L;
        adb adbVarJ1 = j1(adbVarC, 1);
        if (exoPlaybackException != null) {
            adbVarJ1 = adbVarJ1.f(exoPlaybackException);
        }
        this.I++;
        this.l.W.c(6).b();
        w1(adbVarJ1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.gdb
    public final void u(SurfaceView surfaceView) {
        y1();
        if (surfaceView instanceof qng) {
            o1();
            s1(surfaceView);
            r1(surfaceView.getHolder());
            return;
        }
        boolean z = surfaceView instanceof fpe;
        a aVar = this.z;
        if (z) {
            o1();
            this.V = (fpe) surfaceView;
            j jVarD1 = d1(this.A);
            ka2.q(!jVarD1.f);
            jVarD1.c = 10000;
            fpe fpeVar = this.V;
            ka2.q(true ^ jVarD1.f);
            jVarD1.d = fpeVar;
            jVarD1.b();
            this.V.a.add(aVar);
            s1(this.V.getVideoSurface());
            r1(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        y1();
        if (holder == null) {
            b1();
            return;
        }
        o1();
        this.W = true;
        this.U = holder;
        holder.addCallback(aVar);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            s1(null);
            m1(0, 0);
        } else {
            s1(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            m1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void u1() {
        gdb.a aVar = this.P;
        String str = vjg.a;
        d dVar = this.f;
        boolean zK = dVar.k();
        boolean zR0 = dVar.R0();
        boolean zO0 = dVar.o0();
        boolean zX = dVar.x();
        boolean zS0 = dVar.S0();
        boolean zP0 = dVar.P0();
        boolean zP = dVar.M().p();
        gdb.a.C0248a c0248a = new gdb.a.C0248a();
        bh5 bh5Var = this.c.a;
        bh5.a aVar2 = c0248a.a;
        aVar2.b(bh5Var);
        boolean z = !zK;
        c0248a.a(4, z);
        boolean z2 = false;
        c0248a.a(5, zR0 && !zK);
        c0248a.a(6, zO0 && !zK);
        c0248a.a(7, !zP && (zO0 || !zS0 || zR0) && !zK);
        c0248a.a(8, zX && !zK);
        c0248a.a(9, !zP && (zX || (zS0 && zP0)) && !zK);
        c0248a.a(10, z);
        c0248a.a(11, zR0 && !zK);
        if (zR0 && !zK) {
            z2 = true;
        }
        c0248a.a(12, z2);
        gdb.a aVar3 = new gdb.a(aVar2.d());
        this.P = aVar3;
        if (aVar3.equals(aVar)) {
            return;
        }
        this.m.c(13, new g35(this));
    }

    @Override // defpackage.gdb
    public final void v(dqf dqfVar) {
        dqf dqfVarB;
        y1();
        fqf fqfVar = this.i;
        fqfVar.getClass();
        if (fqfVar instanceof hr3) {
            dqf dqfVarP = P();
            int i = 1;
            if (this.L) {
                this.M = dqfVar.E;
                i47<Integer> i47Var = this.N.a;
                dqf.b bVarA = dqfVar.a();
                r6g<Integer> it = i47Var.iterator();
                while (it.hasNext()) {
                    bVarA.m(it.next().intValue(), true);
                }
                dqfVarB = bVarA.b();
            } else {
                dqfVarB = dqfVar;
            }
            if (!dqfVarB.equals(fqfVar.a())) {
                fqfVar.g(dqfVarB);
            }
            if (dqfVarP.equals(dqfVar)) {
                return;
            }
            this.m.f(19, new wk3(dqfVar, i));
        }
    }

    @Override // defpackage.gdb
    public final int v0() {
        y1();
        int iG1 = g1(this.l0);
        if (iG1 == -1) {
            return 0;
        }
        return iG1;
    }

    public final void v1(int i, boolean z) {
        int i2 = this.L ? 4 : (this.l0.n != 1 || z) ? 0 : 1;
        adb adbVarA = this.l0;
        if (adbVarA.l == z && adbVarA.n == i2 && adbVarA.m == i) {
            return;
        }
        this.I++;
        if (adbVarA.p) {
            adbVarA = adbVarA.a();
        }
        adb adbVarE = adbVarA.e(i, i2, z);
        this.l.W.g(1, z ? 1 : 0, i | (i2 << 4)).b();
        w1(adbVarE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.gdb
    public final void w0(int i) {
        y1();
        if (this.G != i) {
            this.G = i;
            this.l.W.g(11, i, 0).b();
            c35 c35Var = new c35(i);
            lz8<gdb.c> lz8Var = this.m;
            lz8Var.c(8, c35Var);
            u1();
            lz8Var.b();
        }
    }

    public final void w1(adb adbVar, int i, boolean z, final int i2, long j, int i3, boolean z2) {
        Pair pair;
        int i4;
        ij9 ij9Var;
        boolean z3;
        boolean z4;
        boolean z5;
        int i5;
        int i6;
        int i7;
        int i8;
        Object obj;
        ij9 ij9Var2;
        Object obj2;
        int i9;
        long j2;
        long j3;
        long jI1;
        long jI12;
        Object obj3;
        ij9 ij9Var3;
        Object obj4;
        int i10;
        adb adbVar2 = this.l0;
        this.l0 = adbVar;
        boolean zEquals = adbVar2.a.equals(adbVar.a);
        emf.d dVar = this.a;
        emf.b bVar = this.o;
        emf emfVar = adbVar2.a;
        h.b bVar2 = adbVar2.b;
        emf emfVar2 = adbVar.a;
        h.b bVar3 = adbVar.b;
        if (emfVar2.p() && emfVar.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (emfVar2.p() != emfVar.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (emfVar.m(emfVar.g(bVar2.a, bVar).c, dVar, 0L).a.equals(emfVar2.m(emfVar2.g(bVar3.a, bVar).c, dVar, 0L).a)) {
            pair = (z && i2 == 0 && bVar2.d < bVar3.d) ? new Pair(Boolean.TRUE, 0) : (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z && i2 == 0) {
                i4 = 1;
            } else if (z && i2 == 1) {
                i4 = 2;
            } else {
                if (zEquals) {
                    bg.h();
                    return;
                }
                i4 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            ij9Var = !adbVar.a.p() ? adbVar.a.m(adbVar.a.g(adbVar.b.a, this.o).c, this.a, 0L).b : null;
            this.k0 = oj9.K;
        } else {
            ij9Var = null;
        }
        if (zBooleanValue || !adbVar2.j.equals(adbVar.j)) {
            oj9.a aVarA = this.k0.a();
            List<js9> list = adbVar.j;
            for (int i11 = 0; i11 < list.size(); i11++) {
                js9 js9Var = list.get(i11);
                int i12 = 0;
                while (true) {
                    js9.a[] aVarArr = js9Var.a;
                    if (i12 < aVarArr.length) {
                        aVarArr[i12].b(aVarA);
                        i12++;
                    }
                }
            }
            this.k0 = new oj9(aVarA);
        }
        oj9 oj9VarA1 = a1();
        boolean zEquals2 = oj9VarA1.equals(this.Q);
        this.Q = oj9VarA1;
        boolean z6 = adbVar2.l != adbVar.l;
        boolean z7 = adbVar2.e != adbVar.e;
        if (z7 || z6) {
            x1();
        }
        boolean z8 = adbVar2.g != adbVar.g;
        if (!zEquals) {
            this.m.c(0, new e35(adbVar, i));
        }
        if (z) {
            emf.b bVar4 = new emf.b();
            if (adbVar2.a.p()) {
                z3 = zBooleanValue;
                z4 = zEquals2;
                z5 = z7;
                i8 = i3;
                obj = null;
                ij9Var2 = null;
                obj2 = null;
                i9 = -1;
            } else {
                Object obj5 = adbVar2.b.a;
                adbVar2.a.g(obj5, bVar4);
                int i13 = bVar4.c;
                int iB = adbVar2.a.b(obj5);
                z3 = zBooleanValue;
                z4 = zEquals2;
                z5 = z7;
                obj = adbVar2.a.m(i13, this.a, 0L).a;
                ij9Var2 = this.a.b;
                obj2 = obj5;
                i8 = i13;
                i9 = iB;
            }
            h.b bVar5 = adbVar2.b;
            if (i2 == 0) {
                boolean zB = bVar5.b();
                h.b bVar6 = adbVar2.b;
                if (zB) {
                    jI1 = bVar4.a(bVar6.b, bVar6.c);
                    jI12 = i1(adbVar2);
                } else if (bVar6.e != -1) {
                    jI1 = i1(this.l0);
                    jI12 = jI1;
                } else {
                    j2 = bVar4.e;
                    j3 = bVar4.d;
                    jI1 = j2 + j3;
                    jI12 = jI1;
                }
            } else if (bVar5.b()) {
                jI1 = adbVar2.s;
                jI12 = i1(adbVar2);
            } else {
                j2 = bVar4.e;
                j3 = adbVar2.s;
                jI1 = j2 + j3;
                jI12 = jI1;
            }
            long jC0 = vjg.c0(jI1);
            long jC02 = vjg.c0(jI12);
            h.b bVar7 = adbVar2.b;
            final gdb.d dVar2 = new gdb.d(obj, i8, ij9Var2, obj2, i9, jC0, jC02, bVar7.b, bVar7.c);
            emf.d dVar3 = this.a;
            int iV0 = v0();
            if (this.l0.a.p()) {
                obj3 = null;
                ij9Var3 = null;
                obj4 = null;
                i10 = -1;
            } else {
                adb adbVar3 = this.l0;
                Object obj6 = adbVar3.b.a;
                adbVar3.a.g(obj6, this.o);
                int iB2 = this.l0.a.b(obj6);
                Object obj7 = this.l0.a.m(iV0, dVar3, 0L).a;
                ij9Var3 = dVar3.b;
                i10 = iB2;
                obj4 = obj6;
                obj3 = obj7;
            }
            long jC03 = vjg.c0(j);
            long jC04 = this.l0.b.b() ? vjg.c0(i1(this.l0)) : jC03;
            h.b bVar8 = this.l0.b;
            final gdb.d dVar4 = new gdb.d(obj3, iV0, ij9Var3, obj4, i10, jC03, jC04, bVar8.b, bVar8.c);
            this.m.c(11, new lz8.a() { // from class: j35
                @Override // lz8.a
                public final void invoke(Object obj8) {
                    gdb.c cVar = (gdb.c) obj8;
                    int i14 = i2;
                    cVar.h(i14);
                    cVar.B(i14, dVar2, dVar4);
                }
            });
        } else {
            z3 = zBooleanValue;
            z4 = zEquals2;
            z5 = z7;
        }
        if (z3) {
            this.m.c(1, new k35(ij9Var, iIntValue));
        }
        if (adbVar2.f != adbVar.f) {
            this.m.c(10, new l35(adbVar, 0));
            if (adbVar.f != null) {
                this.m.c(10, new rp2(adbVar, 1));
            }
        }
        gqf gqfVar = adbVar2.i;
        gqf gqfVar2 = adbVar.i;
        if (gqfVar != gqfVar2) {
            this.i.c(gqfVar2.e);
            this.m.c(2, new z25(adbVar, 0));
        }
        if (z4) {
            i5 = 1;
        } else {
            i5 = 1;
            this.m.c(14, new jl3(this.Q, i5));
        }
        if (z8) {
            this.m.c(3, new yy1(adbVar, i5));
        }
        if (z5 || z6) {
            i6 = 2;
            this.m.c(-1, new g9(adbVar, i6));
        } else {
            i6 = 2;
        }
        if (z5) {
            this.m.c(4, new dz1(adbVar, i6));
        }
        if (z6 || adbVar2.m != adbVar.m) {
            this.m.c(5, new t91(adbVar, 2));
        }
        if (adbVar2.n != adbVar.n) {
            this.m.c(6, new u91(adbVar, 3));
        }
        if (adbVar2.m() != adbVar.m()) {
            i7 = 1;
            this.m.c(7, new tf2(adbVar, i7));
        } else {
            i7 = 1;
        }
        if (!adbVar2.o.equals(adbVar.o)) {
            this.m.c(12, new sk3(adbVar, i7));
        }
        u1();
        this.m.b();
        if (adbVar2.p != adbVar.p) {
            Iterator<ExoPlayer.a> it = this.n.iterator();
            while (it.hasNext()) {
                it.next().h();
            }
        }
    }

    @Override // defpackage.gdb
    public final void x0(gdb.c cVar) {
        y1();
        cVar.getClass();
        this.m.e(cVar);
    }

    public final void x1() {
        int iB = b();
        fzg fzgVar = this.D;
        xtg xtgVar = this.C;
        boolean z = false;
        if (iB != 1) {
            if (iB == 2 || iB == 3) {
                y1();
                boolean z2 = this.l0.p;
                if (W() && !z2) {
                    z = true;
                }
                xtgVar.a(z);
                fzgVar.a(W());
                return;
            }
            if (iB != 4) {
                bg.h();
                return;
            }
        }
        xtgVar.a(false);
        fzgVar.a(false);
    }

    @Override // defpackage.gdb
    public final void y(int i, int i2) {
        y1();
        ka2.l(i >= 0 && i2 >= i);
        int size = this.p.size();
        int iMin = Math.min(i2, size);
        if (i >= size || i == iMin) {
            return;
        }
        adb adbVarN1 = n1(this.l0, i, iMin);
        w1(adbVarN1, 0, !adbVarN1.b.a.equals(this.l0.b.a), 4, f1(adbVarN1), -1, false);
    }

    @Override // defpackage.gdb
    public final void y0(SurfaceView surfaceView) {
        y1();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        y1();
        if (holder == null || holder != this.U) {
            return;
        }
        b1();
    }

    public final void y1() {
        this.d.b();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.t;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = vjg.a;
            Locale locale = Locale.US;
            String strK = akb.k("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.e0) {
                r6.g(strK);
            } else {
                zkd.U("ExoPlayerImpl", strK, this.f0 ? null : new IllegalStateException());
                this.f0 = true;
            }
        }
    }
}
