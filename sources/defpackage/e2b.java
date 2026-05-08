package defpackage;

import androidx.compose.runtime.p;
import androidx.compose.runtime.r;
import defpackage.mr8;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class e2b implements nsd {
    public final lr8 A;
    public final g4a<j6g> B;
    public final g4a<j6g> C;
    public final g4a D;
    public final g4a E;
    public final g4a<Boolean> F;
    public final g4a<Boolean> G;
    public boolean a;
    public t1b b;
    public final g4a c;
    public final w1b d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public final hq3 k;
    public final boolean l;
    public int m;
    public mr8.b n;
    public boolean o;
    public final g4a<t1b> p;
    public iy3 q;
    public final e3a r;
    public final c3a s;
    public final c3a t;
    public final mr8 u;
    public final zp8 v;
    public final i61 w;
    public final g4a x;
    public final c2b y;
    public long z;

    @uh3(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {638, 643}, m = "scroll$suspendImpl")
    public static final class a extends pu2 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public a(lu2<? super a> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e2b.u(e2b.this, null, null, this);
        }
    }

    public e2b(float f, int i) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            de7.a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.c = r.f(new ooa(0L));
        this.d = new w1b(i, f, this);
        this.e = i;
        this.g = Long.MAX_VALUE;
        this.k = new hq3(new q2(this, 18));
        this.l = true;
        this.m = -1;
        this.p = r.e(h2b.a, zkd.f);
        this.q = h2b.b;
        this.r = new e3a();
        this.s = p.a(-1);
        this.t = p.a(i);
        wab wabVar = wab.a0;
        int i2 = 16;
        r.d(new fy(this, i2), wabVar);
        r.d(new i30(this, 12), wabVar);
        this.u = new mr8(null, new a3(this, i2));
        this.v = new zp8();
        this.w = new i61();
        this.x = r.f(null);
        this.y = new c2b(this);
        this.z = mq2.b(0, 0, 15);
        this.A = new lr8();
        this.B = boa.k();
        this.C = boa.k();
        Boolean bool = Boolean.FALSE;
        this.D = r.f(bool);
        this.E = r.f(bool);
        this.F = r.f(bool);
        this.G = r.f(bool);
    }

    public static int i(boolean z, t1b t1bVar) {
        List<hg9> list = t1bVar.a;
        int i = t1bVar.h;
        if (!z) {
            return (((k0b) z92.O0(list)).getIndex() - i) - 1;
        }
        int i2 = i + 1;
        if (i2 < 0) {
            return Integer.MAX_VALUE;
        }
        return ((k0b) z92.Y0(list)).getIndex() + i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r9.a(r7, r8, r0) == r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object u(defpackage.e2b r6, defpackage.n4a r7, kotlin.jvm.functions.Function2<? super defpackage.xrd, ? super defpackage.lu2<? super defpackage.j6g>, ? extends java.lang.Object> r8, defpackage.lu2<? super defpackage.j6g> r9) {
        /*
            boolean r0 = r9 instanceof e2b.a
            if (r0 == 0) goto L13
            r0 = r9
            e2b$a r0 = (e2b.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            e2b$a r0 = new e2b$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L47
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            java.lang.Object r6 = r0.L$0
            e2b r6 = (defpackage.e2b) r6
            defpackage.r7d.b(r9)
            goto L84
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r2
        L35:
            java.lang.Object r6 = r0.L$2
            r8 = r6
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            java.lang.Object r6 = r0.L$1
            r7 = r6
            n4a r7 = (defpackage.n4a) r7
            java.lang.Object r6 = r0.L$0
            e2b r6 = (defpackage.e2b) r6
            defpackage.r7d.b(r9)
            goto L60
        L47:
            defpackage.r7d.b(r9)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.label = r4
            i61 r9 = r6.w
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r5) goto L5b
            goto L5d
        L5b:
            j6g r9 = defpackage.j6g.a
        L5d:
            if (r9 != r5) goto L60
            goto L83
        L60:
            hq3 r9 = r6.k
            boolean r9 = r9.b()
            if (r9 != 0) goto L73
            int r9 = r6.k()
            c3a r1 = r6.t
            dme r1 = (defpackage.dme) r1
            r1.h(r9)
        L73:
            hq3 r9 = r6.k
            r0.L$0 = r6
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r7 = r9.a(r7, r8, r0)
            if (r7 != r5) goto L84
        L83:
            return r5
        L84:
            c3a r6 = r6.s
            dme r6 = (defpackage.dme) r6
            r7 = -1
            r6.h(r7)
            j6g r6 = defpackage.j6g.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e2b.u(e2b, n4a, kotlin.jvm.functions.Function2, lu2):java.lang.Object");
    }

    public static Object v(e2b e2bVar, int i, lu2 lu2Var) {
        e2bVar.getClass();
        Object objA = e2bVar.a(n4a.a, new f2b(e2bVar, 0.0f, i, null), lu2Var);
        return objA == g13.a ? objA : j6g.a;
    }

    @Override // defpackage.nsd
    public final Object a(n4a n4aVar, Function2<? super xrd, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super j6g> lu2Var) {
        return u(this, n4aVar, function2, lu2Var);
    }

    @Override // defpackage.nsd
    public final boolean b() {
        return this.k.b();
    }

    @Override // defpackage.nsd
    public final boolean c() {
        return ((Boolean) ((gme) this.E).getValue()).booleanValue();
    }

    @Override // defpackage.nsd
    public final boolean d() {
        return ((Boolean) ((gme) this.D).getValue()).booleanValue();
    }

    @Override // defpackage.nsd
    public final float e(float f) {
        return this.k.e(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (a(defpackage.n4a.a, r6, r0) == r5) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(int r13, defpackage.vpe r14, defpackage.lu2 r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.a2b
            if (r0 == 0) goto L13
            r0 = r15
            a2b r0 = (defpackage.a2b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            a2b r0 = new a2b
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L32
            if (r1 != r3) goto L2c
            defpackage.r7d.b(r15)
            goto Lb7
        L2c:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r12)
            return r2
        L32:
            float r13 = r0.F$0
            int r14 = r0.I$0
            java.lang.Object r1 = r0.L$0
            yd0 r1 = (defpackage.yd0) r1
            defpackage.r7d.b(r15)
            r10 = r1
            goto L74
        L3f:
            defpackage.r7d.b(r15)
            int r15 = r12.k()
            r1 = 0
            if (r13 != r15) goto L52
            float r15 = r12.l()
            int r15 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r15 != 0) goto L52
            goto L58
        L52:
            int r15 = r12.o()
            if (r15 != 0) goto L5b
        L58:
            j6g r12 = defpackage.j6g.a
            return r12
        L5b:
            r0.L$0 = r14
            r0.I$0 = r13
            r0.F$0 = r1
            r0.label = r4
            i61 r15 = r12.w
            java.lang.Object r15 = r15.a(r0)
            if (r15 != r5) goto L6c
            goto L6e
        L6c:
            j6g r15 = defpackage.j6g.a
        L6e:
            if (r15 != r5) goto L71
            goto Lb6
        L71:
            r10 = r14
            r14 = r13
            r13 = r1
        L74:
            double r6 = (double) r13
            r8 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r15 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r15 > 0) goto L82
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r15 > 0) goto L82
            goto L98
        L82:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r1 = "pageOffsetFraction "
            r15.<init>(r1)
            r15.append(r13)
            java.lang.String r1 = " is not within the range -0.5 to 0.5"
            r15.append(r1)
            java.lang.String r15 = r15.toString()
            defpackage.de7.a(r15)
        L98:
            int r8 = r12.j(r14)
            int r14 = r12.q()
            float r14 = (float) r14
            float r9 = r13 * r14
            b2b r6 = new b2b
            r11 = 0
            r7 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r0.L$0 = r2
            r0.label = r3
            n4a r12 = defpackage.n4a.a
            java.lang.Object r12 = r7.a(r12, r6, r0)
            if (r12 != r5) goto Lb7
        Lb6:
            return r5
        Lb7:
            j6g r12 = defpackage.j6g.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e2b.f(int, vpe, lu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x012f A[Catch: all -> 0x016f, TryCatch #0 {all -> 0x016f, blocks: (B:53:0x00cb, B:57:0x00db, B:60:0x00e4, B:63:0x00f1, B:65:0x00ff, B:77:0x013a, B:71:0x012f, B:68:0x0117), top: B:89:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013a A[Catch: all -> 0x016f, TRY_LEAVE, TryCatch #0 {all -> 0x016f, blocks: (B:53:0x00cb, B:57:0x00db, B:60:0x00e4, B:63:0x00f1, B:65:0x00ff, B:77:0x013a, B:71:0x012f, B:68:0x0117), top: B:89:0x00cb }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(defpackage.t1b r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e2b.h(t1b, boolean, boolean):void");
    }

    public final int j(int i) {
        if (o() > 0) {
            return nic.C(i, 0, o() - 1);
        }
        return 0;
    }

    public final int k() {
        return ((dme) this.d.b).e();
    }

    public final float l() {
        return ((cme) this.d.c).g();
    }

    public final boolean m() {
        return ((Boolean) ((gme) this.F).getValue()).booleanValue();
    }

    public final o1b n() {
        return (o1b) ((gme) this.p).getValue();
    }

    public abstract int o();

    public final int p() {
        return ((t1b) ((gme) this.p).getValue()).b;
    }

    public final int q() {
        return ((t1b) ((gme) this.p).getValue()).c + p();
    }

    public final long r() {
        return ((ooa) ((gme) this.c).getValue()).a;
    }

    public final boolean s() {
        return ((int) Float.intBitsToFloat((int) (r() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (r() & 4294967295L))) == 0;
    }

    public final void t(float f, t1b t1bVar) {
        mr8.b bVar;
        mr8.b bVar2;
        mr8.b bVar3;
        List<hg9> list = t1bVar.a;
        if (this.l && !list.isEmpty()) {
            boolean z = f > 0.0f;
            int i = i(z, t1bVar);
            if (i < 0 || i >= o()) {
                return;
            }
            if (i != this.m) {
                if (this.o != z && (bVar3 = this.n) != null) {
                    bVar3.cancel();
                }
                this.o = z;
                this.m = i;
                this.n = this.u.a(i, this.z, true, null);
            }
            if (z) {
                if ((((k0b) z92.Y0(list)).getOffset() + (t1bVar.c + t1bVar.b)) - t1bVar.g >= f || (bVar2 = this.n) == null) {
                    return;
                }
                bVar2.c();
                return;
            }
            if (t1bVar.f - ((k0b) z92.O0(list)).getOffset() >= (-f) || (bVar = this.n) == null) {
                return;
            }
            bVar.c();
        }
    }

    public final void w(float f, int i, boolean z) {
        w1b w1bVar = this.d;
        ((dme) w1bVar.b).h(i);
        w1bVar.f.i(i);
        ((cme) w1bVar.c).q(f);
        w1bVar.e = null;
        if (!z) {
            this.C.setValue(j6g.a);
            return;
        }
        zzc zzcVar = (zzc) ((gme) this.x).getValue();
        if (zzcVar != null) {
            zzcVar.e();
        }
    }

    public e2b() {
        this(0.0f, 0);
    }
}
