package androidx.media3.exoplayer.video;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.common.a;
import androidx.media3.exoplayer.video.VideoSink;
import androidx.media3.exoplayer.video.c;
import defpackage.d82;
import defpackage.dmf;
import defpackage.e47;
import defpackage.fdb;
import defpackage.fze;
import defpackage.gie;
import defpackage.h54;
import defpackage.ha2;
import defpackage.hy1;
import defpackage.ka2;
import defpackage.ky1;
import defpackage.kze;
import defpackage.my0;
import defpackage.or3;
import defpackage.qyc;
import defpackage.rng;
import defpackage.sf6;
import defpackage.sng;
import defpackage.tog;
import defpackage.vjg;
import defpackage.x25;
import defpackage.xn0;
import defpackage.xng;
import defpackage.z3;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d implements xng.b {
    public static final or3 s = new or3();
    public final Context a;
    public final f b;
    public final SparseArray<c> c;
    public final boolean d;
    public final androidx.media3.exoplayer.video.a e;
    public final d82 f;
    public final CopyOnWriteArraySet<InterfaceC0055d> g;
    public dmf<g> h = new dmf<>();
    public final androidx.media3.common.a i;
    public sf6 j;
    public rng k;
    public Pair<Surface, gie> l;
    public int m;
    public int n;
    public long o;
    public boolean p;
    public int q;
    public int r;

    public static final class a {
        public final Context a;
        public final androidx.media3.exoplayer.video.e b;
        public f c;
        public boolean d;
        public d82 e = d82.a;
        public boolean f;

        public a(Context context, androidx.media3.exoplayer.video.e eVar) {
            this.a = context.getApplicationContext();
            this.b = eVar;
        }
    }

    public final class b implements VideoSink.a {
        public b() {
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public final void a(tog togVar) {
            Iterator<InterfaceC0055d> it = d.this.g.iterator();
            while (it.hasNext()) {
                it.next().a(togVar);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public final void f() {
            Iterator<InterfaceC0055d> it = d.this.g.iterator();
            while (it.hasNext()) {
                it.next().f();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public final void onFirstFrameRendered() {
            Iterator<InterfaceC0055d> it = d.this.g.iterator();
            while (it.hasNext()) {
                it.next().onFirstFrameRendered();
            }
        }
    }

    public final class c implements VideoSink, InterfaceC0055d {
        public final int a;
        public e47<Object> b;
        public androidx.media3.common.a c;
        public long d;
        public long e;
        public VideoSink.a f;
        public Executor g;
        public boolean h;

        public c(Context context) {
            this.a = vjg.K(context) ? 1 : 5;
            e47.b bVar = e47.b;
            this.b = qyc.e;
            this.e = -9223372036854775807L;
            this.f = VideoSink.a.a;
            this.g = d.s;
        }

        @Override // androidx.media3.exoplayer.video.d.InterfaceC0055d
        public final void a(tog togVar) {
            this.g.execute(new my0(3, this.f, togVar));
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void b() {
            if (this.h) {
                d.a(d.this, false);
                throw null;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final boolean c() {
            if (!this.h) {
                return false;
            }
            d dVar = d.this;
            return dVar.m == 0 && dVar.p && dVar.e.c();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final boolean d() {
            return this.h;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final Surface e() {
            ka2.q(this.h);
            throw null;
        }

        @Override // androidx.media3.exoplayer.video.d.InterfaceC0055d
        public final void f() {
            VideoSink.a aVar = this.f;
            Executor executor = this.g;
            Objects.requireNonNull(aVar);
            executor.execute(new xn0(aVar, 7));
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void g(long j) {
            this.d = j;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void h(float f) {
            d.this.e.h(f);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void i(long j, long j2) throws VideoSink.VideoSinkException {
            d.this.e.i(j + this.d, j2);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void j() {
            long j = this.e;
            d dVar = d.this;
            if (dVar.o >= j) {
                dVar.e.j();
                dVar.p = true;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void k(androidx.media3.common.a aVar, long j, int i, List list) {
            ka2.q(this.h);
            this.b = e47.j(list);
            this.c = aVar;
            d dVar = d.this;
            dVar.p = false;
            z(aVar);
            long j2 = this.e;
            boolean z = j2 == -9223372036854775807L;
            if (dVar.d || z) {
                long j3 = z ? -4611686018427387904L : j2 + 1;
                dVar.h.a(new g(j + this.d, i, j3), j3);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void l(List<Object> list) {
            if (this.b.equals(list)) {
                return;
            }
            this.b = e47.j(list);
            androidx.media3.common.a aVar = this.c;
            if (aVar != null) {
                z(aVar);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final boolean m(boolean z) {
            boolean z2 = false;
            boolean z3 = z && this.h;
            d dVar = d.this;
            androidx.media3.exoplayer.video.a aVar = dVar.e;
            if (z3 && dVar.m == 0) {
                z2 = true;
            }
            return aVar.a.b(z2);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void n(Surface surface, gie gieVar) {
            d dVar = d.this;
            Pair<Surface, gie> pair = dVar.l;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((gie) dVar.l.second).equals(gieVar)) {
                return;
            }
            dVar.l = Pair.create(surface, gieVar);
            dVar.b(surface, gieVar.a, gieVar.b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
        /* JADX WARN: Type inference failed for: r7v1, types: [fdb] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // androidx.media3.exoplayer.video.VideoSink
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean o(androidx.media3.common.a r19) throws androidx.media3.exoplayer.video.VideoSink.VideoSinkException {
            /*
                r18 = this;
                r0 = r18
                r1 = r19
                boolean r2 = r0.h
                r3 = 1
                r2 = r2 ^ r3
                defpackage.ka2.q(r2)
                java.lang.String r2 = "Color transfer "
                androidx.media3.exoplayer.video.d r0 = androidx.media3.exoplayer.video.d.this
                int r4 = r0.n
                r5 = 0
                if (r4 != 0) goto L16
                r4 = r3
                goto L17
            L16:
                r4 = r5
            L17:
                defpackage.ka2.q(r4)
                ha2 r4 = r1.D
                if (r4 == 0) goto L25
                boolean r6 = r4.d()
                if (r6 == 0) goto L25
                goto L27
            L25:
                ha2 r4 = defpackage.ha2.h
            L27:
                int r6 = r4.c
                java.lang.String r7 = "EGL_EXT_gl_colorspace_bt2020_pq"
                r8 = 33
                r9 = 7
                if (r6 != r9) goto L57
                int r10 = android.os.Build.VERSION.SDK_INT     // Catch: androidx.media3.common.util.GlUtil.GlException -> L55
                r11 = 34
                if (r10 >= r11) goto L57
                if (r10 < r8) goto L57
                boolean r10 = androidx.media3.common.util.GlUtil.e(r7)     // Catch: androidx.media3.common.util.GlUtil.GlException -> L55
                if (r10 != 0) goto L3f
                goto L57
            L3f:
                int r12 = r4.a     // Catch: androidx.media3.common.util.GlUtil.GlException -> L55
                int r13 = r4.b     // Catch: androidx.media3.common.util.GlUtil.GlException -> L55
                byte[] r2 = r4.d     // Catch: androidx.media3.common.util.GlUtil.GlException -> L55
                int r15 = r4.e     // Catch: androidx.media3.common.util.GlUtil.GlException -> L55
                int r3 = r4.f     // Catch: androidx.media3.common.util.GlUtil.GlException -> L55
                ha2 r11 = new ha2     // Catch: androidx.media3.common.util.GlUtil.GlException -> L55
                r14 = 6
                r17 = r2
                r16 = r3
                r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch: androidx.media3.common.util.GlUtil.GlException -> L55
                r4 = r11
                goto L98
            L55:
                r0 = move-exception
                goto L92
            L57:
                r10 = 6
                if (r6 != r10) goto L67
                int r9 = android.os.Build.VERSION.SDK_INT     // Catch: androidx.media3.common.util.GlUtil.GlException -> L55
                if (r9 < r8) goto L65
                boolean r7 = androidx.media3.common.util.GlUtil.e(r7)     // Catch: androidx.media3.common.util.GlUtil.GlException -> L55
                if (r7 == 0) goto L65
                goto L6f
            L65:
                r3 = r5
                goto L6f
            L67:
                if (r6 != r9) goto L6f
                java.lang.String r3 = "EGL_EXT_gl_colorspace_bt2020_hlg"
                boolean r3 = androidx.media3.common.util.GlUtil.e(r3)     // Catch: androidx.media3.common.util.GlUtil.GlException -> L55
            L6f:
                if (r3 != 0) goto L98
                int r3 = android.os.Build.VERSION.SDK_INT     // Catch: androidx.media3.common.util.GlUtil.GlException -> L55
                r5 = 29
                if (r3 < r5) goto L98
                java.lang.String r3 = "PlaybackVidGraphWrapper"
                java.util.Locale r4 = java.util.Locale.US     // Catch: androidx.media3.common.util.GlUtil.GlException -> L55
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: androidx.media3.common.util.GlUtil.GlException -> L55
                r4.<init>(r2)     // Catch: androidx.media3.common.util.GlUtil.GlException -> L55
                r4.append(r6)     // Catch: androidx.media3.common.util.GlUtil.GlException -> L55
                java.lang.String r2 = " is not supported. Falling back to OpenGl tone mapping."
                r4.append(r2)     // Catch: androidx.media3.common.util.GlUtil.GlException -> L55
                java.lang.String r2 = r4.toString()     // Catch: androidx.media3.common.util.GlUtil.GlException -> L55
                defpackage.zkd.T(r3, r2)     // Catch: androidx.media3.common.util.GlUtil.GlException -> L55
                ha2 r4 = defpackage.ha2.h     // Catch: androidx.media3.common.util.GlUtil.GlException -> L55
                goto L98
            L92:
                androidx.media3.exoplayer.video.VideoSink$VideoSinkException r2 = new androidx.media3.exoplayer.video.VideoSink$VideoSinkException
                r2.<init>(r0, r1)
                throw r2
            L98:
                d82 r2 = r0.f
                android.os.Looper r3 = android.os.Looper.myLooper()
                defpackage.ka2.r(r3)
                r5 = 0
                t2f r2 = r2.c(r3, r5)
                r0.j = r2
                androidx.media3.exoplayer.video.d$f r3 = r0.b     // Catch: androidx.media3.common.VideoFrameProcessingException -> Lb8
                android.content.Context r6 = r0.a     // Catch: androidx.media3.common.VideoFrameProcessingException -> Lb8
                fdb r7 = new fdb     // Catch: androidx.media3.common.VideoFrameProcessingException -> Lb8
                r7.<init>()     // Catch: androidx.media3.common.VideoFrameProcessingException -> Lb8
                r3.a(r6, r4, r0, r7)     // Catch: androidx.media3.common.VideoFrameProcessingException -> Lb8
                r5.h()     // Catch: androidx.media3.common.VideoFrameProcessingException -> Lb8
                throw r5
            Lb8:
                r0 = move-exception
                androidx.media3.exoplayer.video.VideoSink$VideoSinkException r2 = new androidx.media3.exoplayer.video.VideoSink$VideoSinkException
                r2.<init>(r0, r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.d.c.o(androidx.media3.common.a):boolean");
        }

        @Override // androidx.media3.exoplayer.video.d.InterfaceC0055d
        public final void onFirstFrameRendered() {
            VideoSink.a aVar = this.f;
            Executor executor = this.g;
            Objects.requireNonNull(aVar);
            executor.execute(new ky1(aVar, 6));
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void p() {
            d dVar = d.this;
            androidx.media3.exoplayer.video.a aVar = dVar.e;
            if (dVar.h.h() == 0) {
                aVar.p();
                return;
            }
            dmf<g> dmfVar = new dmf<>();
            boolean z = true;
            while (dVar.h.h() > 0) {
                g gVarE = dVar.h.e();
                gVarE.getClass();
                if (z) {
                    int i = gVarE.b;
                    if (i == 0 || i == 1) {
                        gVarE = new g(gVarE.a, 0, gVarE.c);
                    } else {
                        aVar.p();
                    }
                    z = false;
                }
                dmfVar.a(gVarE, gVarE.c);
            }
            dVar.h = dmfVar;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final boolean q(long j, c.a aVar) {
            ka2.q(this.h);
            d dVar = d.this;
            int i = dVar.q;
            if (i == -1 || i != dVar.r) {
                return false;
            }
            throw null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void r() {
            d dVar = d.this;
            if (dVar.d) {
                dVar.e.r();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void release() {
            d dVar = d.this;
            if (dVar.n == 2) {
                return;
            }
            sf6 sf6Var = dVar.j;
            if (sf6Var != null) {
                sf6Var.d();
            }
            dVar.l = null;
            dVar.n = 2;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void s(androidx.media3.exoplayer.video.b bVar) {
            this.f = bVar;
            this.g = h54.a;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void t() {
            d dVar = d.this;
            if (dVar.d) {
                dVar.e.t();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void u(int i) {
            d.this.e.u(i);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void v() {
            gie gieVar = gie.c;
            int i = gieVar.a;
            int i2 = gieVar.b;
            d dVar = d.this;
            dVar.b(null, i, i2);
            dVar.l = null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void w(boolean z) {
            if (this.h) {
                throw null;
            }
            this.e = -9223372036854775807L;
            d.a(d.this, z);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void x(boolean z) {
            d dVar = d.this;
            if (dVar.d) {
                dVar.e.x(z);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void y(rng rngVar) {
            d dVar = d.this;
            dVar.k = rngVar;
            dVar.e.i = rngVar;
        }

        public final void z(androidx.media3.common.a aVar) {
            a.C0036a c0036aA = aVar.a();
            ha2 ha2Var = aVar.D;
            if (ha2Var == null || !ha2Var.d()) {
                ha2Var = ha2.h;
            }
            c0036aA.C = ha2Var;
            new androidx.media3.common.a(c0036aA);
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.video.d$d, reason: collision with other inner class name */
    public interface InterfaceC0055d {
        default void a(tog togVar) {
        }

        default void f() {
        }

        default void onFirstFrameRendered() {
        }
    }

    public static final class e implements sng.b {
        public static final fze<Class<?>> a = kze.a(new x25(1));
    }

    public static final class f implements xng.a {
        public final e a = new e();

        @Override // xng.a
        public final xng a(Context context, ha2 ha2Var, xng.b bVar, fdb fdbVar) {
            try {
                return ((xng.a) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(sng.b.class).newInstance(this.a)).a(context, ha2Var, bVar, fdbVar);
            } catch (Exception e) {
                z3.q(e);
                return null;
            }
        }
    }

    public static final class g {
        public final long a;
        public final int b;
        public final long c;

        public g(long j, int i, long j2) {
            this.a = j;
            this.b = i;
            this.c = j2;
        }
    }

    public d(a aVar) {
        this.a = aVar.a;
        f fVar = aVar.c;
        ka2.r(fVar);
        this.b = fVar;
        this.c = new SparseArray<>();
        e47.b bVar = e47.b;
        qyc qycVar = qyc.e;
        this.d = aVar.d;
        d82 d82Var = aVar.e;
        this.f = d82Var;
        this.e = new androidx.media3.exoplayer.video.a(aVar.b, d82Var);
        this.g = new CopyOnWriteArraySet<>();
        this.i = new androidx.media3.common.a(new a.C0036a());
        this.o = -9223372036854775807L;
        this.q = -1;
        this.n = 0;
    }

    public static void a(d dVar, boolean z) {
        dmf<g> dmfVar;
        androidx.media3.exoplayer.video.a aVar = dVar.e;
        if (dVar.n == 1) {
            dVar.m++;
            aVar.w(z);
            while (true) {
                int iH = dVar.h.h();
                dmfVar = dVar.h;
                if (iH <= 1) {
                    break;
                } else {
                    dmfVar.e();
                }
            }
            if (dmfVar.h() == 1) {
                g gVarE = dVar.h.e();
                gVarE.getClass();
                long j = gVarE.a;
                int i = gVarE.b;
                androidx.media3.common.a aVar2 = dVar.i;
                e47.b bVar = e47.b;
                aVar.k(aVar2, j, i, qyc.e);
            }
            dVar.o = -9223372036854775807L;
            dVar.p = false;
            sf6 sf6Var = dVar.j;
            ka2.r(sf6Var);
            sf6Var.i(new hy1(dVar, 3));
        }
    }

    public final void b(Surface surface, int i, int i2) {
    }
}
