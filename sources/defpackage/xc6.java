package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import defpackage.ax1;
import defpackage.jwa;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xc6 {
    public final zc6 a;
    public Outline f;
    public float j;
    public jwa k;
    public v5b l;
    public m80 m;
    public boolean n;
    public ax1 o;
    public f80 p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public iy3 b = pyd.X;
    public vl8 c = vl8.a;
    public Function1<? super gb4, j6g> d = b.a;
    public final a e = new a();
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final f42 r = new f42();

    public static final class a extends mj8 implements Function1<gb4, j6g> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(gb4 gb4Var) {
            gb4 gb4Var2 = gb4Var;
            xc6 xc6Var = xc6.this;
            v5b v5bVar = xc6Var.l;
            if (xc6Var.n && xc6Var.w && v5bVar != null) {
                ax1.b bVarW1 = gb4Var2.w1();
                long jD = bVarW1.d();
                bVarW1.a().o();
                try {
                    bVarW1.a.b(v5bVar);
                    xc6Var.c(gb4Var2);
                } finally {
                    g7.k(bVarW1, jD);
                }
            } else {
                xc6Var.c(gb4Var2);
            }
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function1<gb4, j6g> {
        public static final b a = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ j6g invoke(gb4 gb4Var) {
            return j6g.a;
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    public xc6(zc6 zc6Var) {
        this.a = zc6Var;
        zc6Var.n(false);
        this.t = 0L;
        this.u = 0L;
        this.v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.w;
            Outline outline2 = null;
            zc6 zc6Var = this.a;
            if (z || zc6Var.S() > 0.0f) {
                v5b v5bVar = this.l;
                if (v5bVar != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    boolean z2 = v5bVar instanceof m80;
                    if (!z2) {
                        b0.u("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = ((m80) v5bVar).a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            nwa.a(outline, v5bVar);
                        } else {
                            if (!z2) {
                                b0.u("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(path);
                        }
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = v5bVar;
                    if (outline != null) {
                        outline.setAlpha(zc6Var.a());
                        outline2 = outline;
                    }
                    zc6Var.K(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.n && this.w) {
                        zc6Var.n(false);
                        zc6Var.y();
                    } else {
                        zc6Var.n(this.w);
                    }
                } else {
                    zc6Var.n(this.w);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jY = hh1.Y(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        jY = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (jY >> 32);
                    int i5 = (int) (jY & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i5) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(zc6Var.a());
                    zc6Var.K(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i5)))) | (((long) Math.round(Float.intBitsToFloat(i4))) << 32));
                }
            } else {
                zc6Var.n(false);
                zc6Var.K(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r15 = this;
            boolean r0 = r15.s
            if (r0 == 0) goto L65
            int r0 = r15.q
            if (r0 != 0) goto L65
            f42 r0 = r15.r
            xc6 r1 = r0.a
            if (r1 == 0) goto L14
            r1.e()
            r1 = 0
            r0.a = r1
        L14:
            a4a<xc6> r0 = r0.c
            if (r0 == 0) goto L60
            java.lang.Object[] r1 = r0.b
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5d
            r4 = 0
            r5 = r4
        L23:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L58
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L3d:
            if (r10 >= r8) goto L56
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L52
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            xc6 r11 = (defpackage.xc6) r11
            r11.e()
        L52:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L3d
        L56:
            if (r8 != r9) goto L5d
        L58:
            if (r5 == r3) goto L5d
            int r5 = r5 + 1
            goto L23
        L5d:
            r0.e()
        L60:
            zc6 r15 = r15.a
            r15.y()
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc6.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.gb4 r14) {
        /*
            r13 = this;
            f42 r0 = r13.r
            xc6 r1 = r0.a
            r0.b = r1
            a4a<xc6> r1 = r0.c
            if (r1 == 0) goto L20
            boolean r2 = r1.c()
            if (r2 == 0) goto L20
            a4a<xc6> r2 = r0.d
            if (r2 != 0) goto L1a
            a4a r2 = defpackage.nnd.a()
            r0.d = r2
        L1a:
            r2.j(r1)
            r1.e()
        L20:
            r1 = 1
            r0.e = r1
            kotlin.jvm.functions.Function1<? super gb4, j6g> r13 = r13.d
            r13.invoke(r14)
            r13 = 0
            r0.e = r13
            xc6 r14 = r0.b
            if (r14 == 0) goto L32
            r14.e()
        L32:
            a4a<xc6> r14 = r0.d
            if (r14 == 0) goto L83
            boolean r0 = r14.c()
            if (r0 == 0) goto L83
            java.lang.Object[] r0 = r14.b
            long[] r1 = r14.a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L80
            r3 = r13
        L46:
            r4 = r1[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L7b
            int r6 = r3 - r2
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r13
        L60:
            if (r8 >= r6) goto L79
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.32E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L75
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            xc6 r9 = (defpackage.xc6) r9
            r9.e()
        L75:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L60
        L79:
            if (r6 != r7) goto L80
        L7b:
            if (r3 == r2) goto L80
            int r3 = r3 + 1
            goto L46
        L80:
            r14.e()
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc6.c(gb4):void");
    }

    public final jwa d() {
        jwa bVar;
        jwa jwaVar = this.k;
        v5b v5bVar = this.l;
        if (jwaVar != null) {
            return jwaVar;
        }
        if (v5bVar != null) {
            jwa.a aVar = new jwa.a(v5bVar);
            this.k = aVar;
            return aVar;
        }
        long jY = hh1.Y(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            jY = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jY >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jY & 4294967295L)) + fIntBitsToFloat2;
        float f = this.j;
        if (f > 0.0f) {
            bVar = new jwa.c(ak2.e(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            bVar = new jwa.b(new qtc(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = bVar;
        return bVar;
    }

    public final void e() {
        this.q--;
        b();
    }

    public final void f(float f) {
        zc6 zc6Var = this.a;
        if (zc6Var.a() == f) {
            return;
        }
        zc6Var.b(f);
    }

    public final void g(long j, long j2, float f) {
        if (ooa.c(this.h, j) && kie.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = j;
        this.i = j2;
        this.j = f;
        a();
    }
}
