package defpackage;

import android.os.Build;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ax1;
import defpackage.jwa;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class bd6 implements qxa {
    public boolean V;
    public float[] X;
    public boolean Y;
    public xc6 a;
    public final wc6 b;
    public final AndroidComposeView c;
    public int c0;
    public Function2<? super ww1, ? super xc6, j6g> d;
    public gu5<j6g> e;
    public jwa e0;
    public boolean f0;
    public boolean g0;
    public boolean i0;
    public long f = 9223372034707292159L;
    public final float[] W = if9.a();
    public iy3 Z = q92.b();
    public vl8 a0 = vl8.a;
    public final ax1 b0 = new ax1();
    public long d0 = mrf.b;
    public boolean h0 = true;
    public final a j0 = new a();

    public static final class a extends mj8 implements Function1<gb4, j6g> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(gb4 gb4Var) {
            gb4 gb4Var2 = gb4Var;
            bd6 bd6Var = bd6.this;
            ww1 ww1VarA = gb4Var2.w1().a();
            Function2<? super ww1, ? super xc6, j6g> function2 = bd6Var.d;
            if (function2 != null) {
                function2.invoke(ww1VarA, gb4Var2.w1().b);
            }
            return j6g.a;
        }
    }

    public bd6(xc6 xc6Var, wc6 wc6Var, AndroidComposeView androidComposeView, Function2<? super ww1, ? super xc6, j6g> function2, gu5<j6g> gu5Var) {
        this.a = xc6Var;
        this.b = wc6Var;
        this.c = androidComposeView;
        this.d = function2;
        this.e = gu5Var;
    }

    @Override // defpackage.qxa
    public final void a(float[] fArr) {
        if9.e(fArr, m());
    }

    @Override // defpackage.qxa
    public final void b(y3a y3aVar, boolean z) {
        float[] fArrL = z ? l() : m();
        if (this.h0) {
            return;
        }
        if (fArrL != null) {
            if9.c(fArrL, y3aVar);
            return;
        }
        y3aVar.a = 0.0f;
        y3aVar.b = 0.0f;
        y3aVar.c = 0.0f;
        y3aVar.d = 0.0f;
    }

    @Override // defpackage.qxa
    public final void c(pad padVar) {
        long j;
        gu5<j6g> gu5Var;
        gu5<j6g> gu5Var2;
        int i = padVar.a | this.c0;
        this.a0 = padVar.f0;
        this.Z = padVar.e0;
        int i2 = i & 4096;
        if (i2 != 0) {
            this.d0 = padVar.a0;
        }
        if ((i & 1) != 0) {
            xc6 xc6Var = this.a;
            float f = padVar.b;
            zc6 zc6Var = xc6Var.a;
            if (zc6Var.J() != f) {
                zc6Var.m(f);
            }
        }
        if ((i & 2) != 0) {
            xc6 xc6Var2 = this.a;
            float f2 = padVar.c;
            zc6 zc6Var2 = xc6Var2.a;
            if (zc6Var2.T() != f2) {
                zc6Var2.u(f2);
            }
        }
        if ((i & 4) != 0) {
            this.a.f(padVar.d);
        }
        if ((i & 8) != 0) {
            xc6 xc6Var3 = this.a;
            float f3 = padVar.e;
            zc6 zc6Var3 = xc6Var3.a;
            if (zc6Var3.P() != f3) {
                zc6Var3.x(f3);
            }
        }
        if ((i & 16) != 0) {
            xc6 xc6Var4 = this.a;
            float f4 = padVar.f;
            zc6 zc6Var4 = xc6Var4.a;
            if (zc6Var4.N() != f4) {
                zc6Var4.e(f4);
            }
        }
        boolean z = true;
        if ((i & 32) != 0) {
            xc6 xc6Var5 = this.a;
            float f5 = padVar.V;
            zc6 zc6Var5 = xc6Var5.a;
            if (zc6Var5.S() != f5) {
                zc6Var5.s(f5);
                xc6Var5.g = true;
                xc6Var5.a();
            }
            if (padVar.V > 0.0f && !this.i0 && (gu5Var2 = this.e) != null) {
                gu5Var2.invoke();
            }
        }
        if ((i & 64) != 0) {
            xc6 xc6Var6 = this.a;
            long j2 = padVar.W;
            zc6 zc6Var6 = xc6Var6.a;
            if (!da2.c(j2, zc6Var6.E())) {
                zc6Var6.j(j2);
            }
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            xc6 xc6Var7 = this.a;
            long j3 = padVar.X;
            zc6 zc6Var7 = xc6Var7.a;
            if (!da2.c(j3, zc6Var7.F())) {
                zc6Var7.o(j3);
            }
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
            xc6 xc6Var8 = this.a;
            float f6 = padVar.Y;
            zc6 zc6Var8 = xc6Var8.a;
            if (zc6Var8.D() != f6) {
                zc6Var8.t(f6);
            }
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            zc6 zc6Var9 = this.a.a;
            if (zc6Var9.Q() != 0.0f) {
                zc6Var9.h();
            }
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            zc6 zc6Var10 = this.a.a;
            if (zc6Var10.B() != 0.0f) {
                zc6Var10.i();
            }
        }
        if ((i & 2048) != 0) {
            xc6 xc6Var9 = this.a;
            float f7 = padVar.Z;
            zc6 zc6Var11 = xc6Var9.a;
            if (zc6Var11.G() != f7) {
                zc6Var11.q(f7);
            }
        }
        if (i2 != 0) {
            boolean zA = mrf.a(this.d0, mrf.b);
            xc6 xc6Var10 = this.a;
            if (zA) {
                if (!ooa.c(xc6Var10.v, 9205357640488583168L)) {
                    xc6Var10.v = 9205357640488583168L;
                    xc6Var10.a.M(9205357640488583168L);
                }
                j = 4294967295L;
            } else {
                j = 4294967295L;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.d0 & 4294967295L)) * ((int) (this.f & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.d0 >> 32)) * ((int) (this.f >> 32)))) << 32);
                if (!ooa.c(xc6Var10.v, jFloatToRawIntBits)) {
                    xc6Var10.v = jFloatToRawIntBits;
                    xc6Var10.a.M(jFloatToRawIntBits);
                }
            }
        } else {
            j = 4294967295L;
        }
        if ((i & 16384) != 0) {
            xc6 xc6Var11 = this.a;
            boolean z2 = padVar.c0;
            if (xc6Var11.w != z2) {
                xc6Var11.w = z2;
                xc6Var11.g = true;
                xc6Var11.a();
            }
        }
        if ((131072 & i) != 0) {
            zc6 zc6Var12 = this.a.a;
        }
        if ((262144 & i) != 0) {
            zc6 zc6Var13 = this.a.a;
            if (!wl7.b(zc6Var13.g(), null)) {
                zc6Var13.l();
            }
        }
        if ((524288 & i) != 0) {
            xc6 xc6Var12 = this.a;
            int i3 = padVar.g0;
            zc6 zc6Var14 = xc6Var12.a;
            if (zc6Var14.I() != i3) {
                zc6Var14.f(i3);
            }
        }
        if ((32768 & i) != 0) {
            zc6 zc6Var15 = this.a.a;
            if (zc6Var15.z() != 0) {
                zc6Var15.R(0);
            }
        }
        if ((i & 7963) != 0) {
            this.f0 = true;
            this.g0 = true;
        }
        if (wl7.b(this.e0, padVar.h0)) {
            z = false;
        } else {
            jwa jwaVar = padVar.h0;
            this.e0 = jwaVar;
            if (jwaVar != null) {
                xc6 xc6Var13 = this.a;
                if (jwaVar instanceof jwa.b) {
                    qtc qtcVar = ((jwa.b) jwaVar).a;
                    float f8 = qtcVar.a;
                    float f9 = qtcVar.b;
                    xc6Var13.g((((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f9)) & j), (((long) Float.floatToRawIntBits(qtcVar.c - qtcVar.a)) << 32) | (((long) Float.floatToRawIntBits(qtcVar.d - f9)) & j), 0.0f);
                } else if (jwaVar instanceof jwa.a) {
                    v5b v5bVar = ((jwa.a) jwaVar).a;
                    xc6Var13.k = null;
                    xc6Var13.i = 9205357640488583168L;
                    xc6Var13.h = 0L;
                    xc6Var13.j = 0.0f;
                    xc6Var13.g = true;
                    xc6Var13.n = false;
                    xc6Var13.l = v5bVar;
                    xc6Var13.a();
                } else {
                    if (!(jwaVar instanceof jwa.c)) {
                        l.g();
                        return;
                    }
                    jwa.c cVar = (jwa.c) jwaVar;
                    m80 m80Var = cVar.b;
                    if (m80Var != null) {
                        xc6Var13.k = null;
                        xc6Var13.i = 9205357640488583168L;
                        xc6Var13.h = 0L;
                        xc6Var13.j = 0.0f;
                        xc6Var13.g = true;
                        xc6Var13.n = false;
                        xc6Var13.l = m80Var;
                        xc6Var13.a();
                    } else {
                        zfd zfdVar = cVar.a;
                        xc6Var13.g((((long) Float.floatToRawIntBits(zfdVar.a)) << 32) | (((long) Float.floatToRawIntBits(zfdVar.b)) & j), (((long) Float.floatToRawIntBits(zfdVar.b())) << 32) | (((long) Float.floatToRawIntBits(zfdVar.a())) & j), Float.intBitsToFloat((int) (zfdVar.h >> 32)));
                    }
                }
                if ((jwaVar instanceof jwa.a) && Build.VERSION.SDK_INT < 33 && (gu5Var = this.e) != null) {
                    gu5Var.invoke();
                }
            }
        }
        this.c0 = padVar.a;
        if (i != 0 || z) {
            AndroidComposeView androidComposeView = this.c;
            ViewParent parent = androidComposeView.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(androidComposeView, androidComposeView);
            }
            if (androidComposeView.f) {
                androidComposeView.u(0.0f);
            }
        }
    }

    @Override // defpackage.qxa
    public final long d(long j, boolean z) {
        float[] fArrM;
        if (z) {
            fArrM = l();
            if (fArrM == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrM = m();
        }
        return this.h0 ? j : if9.b(j, fArrM);
    }

    @Override // defpackage.qxa
    public final void destroy() {
        j4a j4aVar;
        Reference referencePoll;
        this.d = null;
        this.e = null;
        this.V = true;
        boolean z = this.Y;
        AndroidComposeView androidComposeView = this.c;
        if (z) {
            this.Y = false;
            ArrayList arrayList = androidComposeView.r0;
            if (!androidComposeView.t0) {
                arrayList.remove(this);
                ArrayList arrayList2 = androidComposeView.s0;
                if (arrayList2 != null) {
                    arrayList2.remove(this);
                }
            }
        }
        wc6 wc6Var = this.b;
        if (wc6Var != null) {
            wc6Var.a(this.a);
            by3 by3Var = androidComposeView.l1;
            do {
                ReferenceQueue referenceQueue = (ReferenceQueue) by3Var.b;
                j4aVar = (j4a) by3Var.a;
                referencePoll = referenceQueue.poll();
                if (referencePoll != null) {
                    j4aVar.j(referencePoll);
                }
            } while (referencePoll != null);
            j4aVar.b(new WeakReference(this, (ReferenceQueue) by3Var.b));
            androidComposeView.r0.remove(this);
        }
    }

    @Override // defpackage.qxa
    public final void e(long j) {
        if (th7.b(j, this.f)) {
            return;
        }
        AndroidComposeView androidComposeView = this.c;
        if (androidComposeView.f) {
            androidComposeView.u(-4.0f);
        }
        this.f = j;
        if (this.Y || this.V) {
            return;
        }
        androidComposeView.invalidate();
        if (true != this.Y) {
            this.Y = true;
            ArrayList arrayList = androidComposeView.r0;
            if (!androidComposeView.t0) {
                arrayList.add(this);
                return;
            }
            ArrayList arrayList2 = androidComposeView.s0;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                androidComposeView.s0 = arrayList2;
            }
            arrayList2.add(this);
        }
    }

    @Override // defpackage.qxa
    public final void f(ww1 ww1Var, xc6 xc6Var) {
        k();
        this.i0 = this.a.a.S() > 0.0f;
        ax1 ax1Var = this.b0;
        ax1.b bVar = ax1Var.b;
        bVar.e(ww1Var);
        bVar.b = xc6Var;
        ad6.a(ax1Var, this.a);
    }

    @Override // defpackage.qxa
    public final boolean g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        xc6 xc6Var = this.a;
        if (!xc6Var.w) {
            return true;
        }
        jwa jwaVarD = xc6Var.d();
        if (jwaVarD instanceof jwa.b) {
            qtc qtcVar = ((jwa.b) jwaVarD).a;
            if (qtcVar.a <= fIntBitsToFloat && fIntBitsToFloat < qtcVar.c && qtcVar.b <= fIntBitsToFloat2 && fIntBitsToFloat2 < qtcVar.d) {
                return true;
            }
        } else {
            if (!(jwaVarD instanceof jwa.c)) {
                if (jwaVarD instanceof jwa.a) {
                    return gce.a(fIntBitsToFloat, fIntBitsToFloat2, ((jwa.a) jwaVarD).a);
                }
                l.g();
                return false;
            }
            zfd zfdVar = ((jwa.c) jwaVarD).a;
            float f = zfdVar.a;
            long j2 = zfdVar.f;
            long j3 = zfdVar.h;
            long j4 = zfdVar.g;
            float f2 = zfdVar.d;
            float f3 = zfdVar.b;
            float f4 = zfdVar.c;
            long j5 = zfdVar.e;
            if (fIntBitsToFloat >= f && fIntBitsToFloat < f4 && fIntBitsToFloat2 >= f3 && fIntBitsToFloat2 < f2) {
                int i = (int) (j5 >> 32);
                float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                int i2 = (int) (j2 >> 32);
                if (Float.intBitsToFloat(i2) + fIntBitsToFloat3 <= zfdVar.b()) {
                    int i3 = (int) (j3 >> 32);
                    float fIntBitsToFloat4 = Float.intBitsToFloat(i3);
                    int i4 = (int) (j4 >> 32);
                    if (Float.intBitsToFloat(i4) + fIntBitsToFloat4 <= zfdVar.b()) {
                        int i5 = (int) (j5 & 4294967295L);
                        int i6 = (int) (j3 & 4294967295L);
                        if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= zfdVar.a()) {
                            int i7 = (int) (j2 & 4294967295L);
                            int i8 = (int) (j4 & 4294967295L);
                            if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= zfdVar.a()) {
                                float fIntBitsToFloat5 = Float.intBitsToFloat(i) + f;
                                float fIntBitsToFloat6 = Float.intBitsToFloat(i5) + f3;
                                float fIntBitsToFloat7 = f4 - Float.intBitsToFloat(i2);
                                float fIntBitsToFloat8 = Float.intBitsToFloat(i7) + f3;
                                float fIntBitsToFloat9 = f4 - Float.intBitsToFloat(i4);
                                float fIntBitsToFloat10 = f2 - Float.intBitsToFloat(i8);
                                float fIntBitsToFloat11 = f2 - Float.intBitsToFloat(i6);
                                float fIntBitsToFloat12 = Float.intBitsToFloat(i3) + f;
                                if (fIntBitsToFloat < fIntBitsToFloat5 && fIntBitsToFloat2 < fIntBitsToFloat6) {
                                    return gce.b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, zfdVar.e);
                                }
                                if (fIntBitsToFloat < fIntBitsToFloat12 && fIntBitsToFloat2 > fIntBitsToFloat11) {
                                    return gce.b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat12, fIntBitsToFloat11, zfdVar.h);
                                }
                                if (fIntBitsToFloat > fIntBitsToFloat7 && fIntBitsToFloat2 < fIntBitsToFloat8) {
                                    return gce.b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, zfdVar.f);
                                }
                                if (fIntBitsToFloat <= fIntBitsToFloat9 || fIntBitsToFloat2 <= fIntBitsToFloat10) {
                                    return true;
                                }
                                return gce.b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat9, fIntBitsToFloat10, zfdVar.g);
                            }
                        }
                    }
                }
                m80 m80VarA = p80.a();
                m80VarA.o(zfdVar);
                return gce.a(fIntBitsToFloat, fIntBitsToFloat2, m80VarA);
            }
        }
        return false;
    }

    @Override // defpackage.qxa
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    public final float[] mo14getUnderlyingMatrixsQKQjiQ() {
        return m();
    }

    @Override // defpackage.qxa
    public final void h(float[] fArr) {
        float[] fArrL = l();
        if (fArrL != null) {
            if9.e(fArr, fArrL);
        }
    }

    @Override // defpackage.qxa
    public final void i(Function2<? super ww1, ? super xc6, j6g> function2, gu5<j6g> gu5Var) {
        wc6 wc6Var = this.b;
        if (wc6Var == null) {
            throw l6.k("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.a.s) {
            ae7.a("layer should have been released before reuse");
        }
        this.a = wc6Var.b();
        this.V = false;
        this.d = function2;
        this.e = gu5Var;
        this.f0 = false;
        this.g0 = false;
        this.h0 = true;
        if9.d(this.W);
        float[] fArr = this.X;
        if (fArr != null) {
            if9.d(fArr);
        }
        this.d0 = mrf.b;
        this.i0 = false;
        this.f = 9223372034707292159L;
        this.e0 = null;
        this.c0 = 0;
    }

    @Override // defpackage.qxa
    public final void invalidate() {
        if (this.Y || this.V) {
            return;
        }
        AndroidComposeView androidComposeView = this.c;
        androidComposeView.invalidate();
        if (true != this.Y) {
            this.Y = true;
            ArrayList arrayList = androidComposeView.r0;
            if (!androidComposeView.t0) {
                arrayList.add(this);
                return;
            }
            ArrayList arrayList2 = androidComposeView.s0;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                androidComposeView.s0 = arrayList2;
            }
            arrayList2.add(this);
        }
    }

    @Override // defpackage.qxa
    public final void j(long j) {
        AndroidComposeView androidComposeView = this.c;
        if (androidComposeView.f) {
            androidComposeView.u(-4.0f);
        }
        xc6 xc6Var = this.a;
        if (!lh7.b(xc6Var.t, j)) {
            xc6Var.t = j;
            xc6Var.a.A((int) (j >> 32), (int) (j & 4294967295L), xc6Var.u);
        }
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }

    @Override // defpackage.qxa
    public final void k() {
        if (this.Y) {
            if (!mrf.a(this.d0, mrf.b) && !th7.b(this.a.u, this.f)) {
                xc6 xc6Var = this.a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.d0 >> 32)) * ((int) (this.f >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.d0 & 4294967295L)) * ((int) (this.f & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (!ooa.c(xc6Var.v, jFloatToRawIntBits)) {
                    xc6Var.v = jFloatToRawIntBits;
                    xc6Var.a.M(jFloatToRawIntBits);
                }
            }
            xc6 xc6Var2 = this.a;
            iy3 iy3Var = this.Z;
            vl8 vl8Var = this.a0;
            long j = this.f;
            long j2 = xc6Var2.u;
            zc6 zc6Var = xc6Var2.a;
            if (!th7.b(j2, j)) {
                xc6Var2.u = j;
                long j3 = xc6Var2.t;
                zc6Var.A((int) (j3 >> 32), (int) (4294967295L & j3), j);
                if (xc6Var2.i == 9205357640488583168L) {
                    xc6Var2.g = true;
                    xc6Var2.a();
                }
            }
            xc6Var2.b = iy3Var;
            xc6Var2.c = vl8Var;
            xc6Var2.d = this.j0;
            zc6Var.O(iy3Var, vl8Var, xc6Var2, xc6Var2.e);
            if (this.Y) {
                this.Y = false;
                AndroidComposeView androidComposeView = this.c;
                ArrayList arrayList = androidComposeView.r0;
                if (androidComposeView.t0) {
                    return;
                }
                arrayList.remove(this);
                ArrayList arrayList2 = androidComposeView.s0;
                if (arrayList2 != null) {
                    arrayList2.remove(this);
                }
            }
        }
    }

    public final float[] l() {
        float[] fArrA = this.X;
        if (fArrA == null) {
            fArrA = if9.a();
            this.X = fArrA;
        }
        if (this.g0) {
            this.g0 = false;
            float[] fArrM = m();
            if (this.h0) {
                return fArrM;
            }
            if (!jh2.w(fArrM, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] m() {
        boolean z = this.f0;
        float[] fArr = this.W;
        if (z) {
            xc6 xc6Var = this.a;
            long j = xc6Var.v;
            zc6 zc6Var = xc6Var.a;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = oie.j(hh1.Y(this.f));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float fP = zc6Var.P();
            float fN = zc6Var.N();
            float fQ = zc6Var.Q();
            float fB = zc6Var.B();
            float fD = zc6Var.D();
            float fJ = zc6Var.J();
            float fT = zc6Var.T();
            double d = ((double) fQ) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = -fSin;
            float f2 = (fN * fCos) - (1.0f * fSin);
            float f3 = (1.0f * fCos) + (fN * fSin);
            double d2 = ((double) fB) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = -fSin2;
            float f5 = fSin * fSin2;
            float f6 = fSin * fCos2;
            float f7 = fCos * fSin2;
            float f8 = fCos * fCos2;
            float f9 = (f3 * fSin2) + (fP * fCos2);
            float f10 = (f3 * fCos2) + ((-fP) * fSin2);
            double d3 = ((double) fD) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f11 = -fSin3;
            float f12 = (fCos3 * f5) + (f11 * fCos2);
            float f13 = (f5 * fSin3) + (fCos2 * fCos3);
            float f14 = fSin3 * fCos;
            float f15 = f13 * fJ;
            float f16 = f14 * fJ;
            float f17 = ((fSin3 * f6) + (fCos3 * f4)) * fJ;
            float f18 = f12 * fT;
            float f19 = fCos * fCos3 * fT;
            float f20 = ((fCos3 * f6) + (f11 * f4)) * fT;
            float f21 = f7 * 1.0f;
            float f22 = f * 1.0f;
            float f23 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f15;
                fArr[1] = f16;
                fArr[2] = f17;
                fArr[3] = 0.0f;
                fArr[4] = f18;
                fArr[5] = f19;
                fArr[6] = f20;
                fArr[7] = 0.0f;
                fArr[8] = f21;
                fArr[9] = f22;
                fArr[10] = f23;
                fArr[11] = 0.0f;
                float f24 = -fIntBitsToFloat;
                fArr[12] = ((f15 * f24) - (fIntBitsToFloat2 * f18)) + f9 + fIntBitsToFloat;
                fArr[13] = ((f16 * f24) - (fIntBitsToFloat2 * f19)) + f2 + fIntBitsToFloat2;
                fArr[14] = ((f24 * f17) - (fIntBitsToFloat2 * f20)) + f10;
                fArr[15] = 1.0f;
            }
            this.f0 = false;
            this.h0 = boa.C(fArr);
        }
        return fArr;
    }
}
