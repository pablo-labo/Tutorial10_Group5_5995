package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ax1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class c7c {
    public static final fgd a = ggd.a;
    public static final float b = 7.5f;
    public static final float c = 2.5f;
    public static final float d = 10.0f;
    public static final float e = 5.0f;
    public static final float f = 6.0f;
    public static final dvf<Float> g = zd0.d(300, 0, bf4.c, 2);

    public static final void a(final g7c g7cVar, final long j, e eVar, b bVar, final int i) {
        e eVar2;
        c cVar;
        c cVarH = bVar.h(-486016981);
        int i2 = i | (cVarH.x(g7cVar) ? 4 : 2) | (cVarH.e(j) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            Object obj = objV;
            if (objV == c0020a) {
                m80 m80VarA = p80.a();
                m80VarA.e(1);
                cVarH.p(m80VarA);
                obj = m80VarA;
            }
            final v5b v5bVar = (v5b) obj;
            boolean zK = cVarH.K(g7cVar);
            Object objV2 = cVarH.v();
            if (zK || objV2 == c0020a) {
                objV2 = r.c(new qa(g7cVar, 20));
                cVarH.p(objV2);
            }
            final ese eseVarB = vc0.b(((Number) ((ese) objV2).getValue()).floatValue(), g, null, cVarH, 48, 28);
            c cVar2 = cVarH;
            Object objV3 = cVar2.v();
            if (objV3 == c0020a) {
                objV3 = new bj(6);
                cVar2.p(objV3);
            }
            eVar2 = eVar;
            e eVarB = b5e.b(eVar2, false, (Function1) objV3);
            boolean zX = cVar2.x(g7cVar) | cVar2.K(eseVarB) | ((i2 & 112) == 32) | cVar2.x(v5bVar);
            Object objV4 = cVar2.v();
            if (zX || objV4 == c0020a) {
                Function1 function1 = new Function1() { // from class: x6c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) throws Throwable {
                        long j2;
                        ax1.b bVar2;
                        float f2;
                        qtc qtcVar;
                        long j3 = j;
                        v5b v5bVar2 = v5bVar;
                        gb4 gb4Var = (gb4) obj2;
                        g7c g7cVar2 = g7cVar;
                        float fA = g7cVar2.a() / g7cVar2.b();
                        float fMax = (Math.max(Math.min(1.0f, fA) - 0.4f, 0.0f) * 5.0f) / 3.0f;
                        float fAbs = Math.abs(fA) - 1.0f;
                        float f3 = fAbs >= 0.0f ? fAbs : 0.0f;
                        if (f3 > 2.0f) {
                            f3 = 2.0f;
                        }
                        float fPow = (((0.4f * fMax) - 0.25f) + (f3 - (((float) Math.pow(f3, 2.0d)) / 4.0f))) * 0.5f;
                        float f4 = fPow * 360.0f;
                        float f5 = ((0.8f * fMax) + fPow) * 360.0f;
                        xt0 xt0Var = new xt0(fPow, f4, f5, Math.min(1.0f, fMax));
                        float fFloatValue = ((Number) eseVarB.getValue()).floatValue();
                        long jF1 = gb4Var.F1();
                        ax1.b bVarW1 = gb4Var.w1();
                        long jD = bVarW1.d();
                        bVarW1.a().o();
                        try {
                            bVarW1.a.f(jF1, fPow);
                            float fT1 = gb4Var.t1(c7c.b);
                            f2 = c7c.c;
                            float fT12 = (gb4Var.t1(f2) / 2.0f) + fT1;
                            qtcVar = new qtc(Float.intBitsToFloat((int) (oie.j(gb4Var.c()) >> 32)) - fT12, Float.intBitsToFloat((int) (oie.j(gb4Var.c()) & 4294967295L)) - fT12, Float.intBitsToFloat((int) (oie.j(gb4Var.c()) >> 32)) + fT12, Float.intBitsToFloat((int) (oie.j(gb4Var.c()) & 4294967295L)) + fT12);
                            bVar2 = bVarW1;
                            j2 = jD;
                        } catch (Throwable th) {
                            th = th;
                            j2 = jD;
                            bVar2 = bVarW1;
                        }
                        try {
                            gb4Var.Q(j3, f4, f5 - f4, qtcVar.d(), qtcVar.c(), (832 & 64) != 0 ? 1.0f : fFloatValue, new bwe(gb4Var.t1(f2), 0.0f, 2, 0, null, 26));
                            c7c.c(gb4Var, v5bVar2, qtcVar, j3, fFloatValue, xt0Var);
                            g7.k(bVar2, j2);
                            return j6g.a;
                        } catch (Throwable th2) {
                            th = th2;
                            g7.k(bVar2, j2);
                            throw th;
                        }
                    }
                };
                cVar2.p(function1);
                objV4 = function1;
            }
            w74.a(eVarB, (Function1) objV4, cVar2, 0);
            cVar = cVar2;
        } else {
            eVar2 = eVar;
            c cVar3 = cVarH;
            cVar3.D();
            cVar = cVar3;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            final e eVar3 = eVar2;
            iVarW.d = new Function2(j, eVar3, i) { // from class: y6c
                public final /* synthetic */ long b;
                public final /* synthetic */ e c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iL = ka2.L(385);
                    c7c.a(this.a, this.b, this.c, (b) obj2, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final g7c g7cVar, final e eVar, long j, long j2, b bVar, final int i) {
        final long j3;
        final long j4;
        int i2;
        long j5;
        long jB;
        long j6;
        long j7;
        da2 da2Var;
        c cVarH = bVar.h(308716636);
        int i3 = i | (cVarH.a(z) ? 4 : 2) | (cVarH.x(g7cVar) ? 32 : 16) | (cVarH.K(eVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | 205824;
        if (cVarH.o(i3 & 1, (74899 & i3) != 74898)) {
            cVarH.v0();
            if ((i & 1) == 0 || cVarH.c0()) {
                long jF = ((kb2) cVarH.M(lb2.a)).f();
                i2 = i3 & (-64513);
                j5 = jF;
                jB = lb2.b(jF, cVarH);
            } else {
                cVarH.D();
                i2 = i3 & (-64513);
                j5 = j;
                jB = j2;
            }
            cVarH.V();
            int i4 = i2 & 14;
            boolean zK = (i4 == 4) | cVarH.K(g7cVar);
            Object objV = cVarH.v();
            if (zK || objV == b.a.a) {
                objV = r.c(new z6c(0, g7cVar, z));
                cVarH.p(objV);
            }
            ese eseVar = (ese) objV;
            mp4 mp4Var = (mp4) cVarH.M(np4.a);
            if (mp4Var == null) {
                cVarH.L(1453247536);
                cVarH.U(false);
                j7 = j5;
                j6 = jB;
                da2Var = null;
            } else {
                cVarH.L(323973617);
                j6 = jB;
                long jA = mp4Var.a(j5, f, cVarH, 48);
                j7 = j5;
                cVarH.U(false);
                da2Var = new da2(jA);
            }
            long j8 = da2Var != null ? da2Var.a : j7;
            e eVarA = a.a(androidx.compose.ui.draw.a.c(g.n(eVar, 40.0f), new rg(12)), new fj(g7cVar, 15));
            float f2 = ((Boolean) eseVar.getValue()).booleanValue() ? f : 0.0f;
            fgd fgdVar = a;
            e eVarB = androidx.compose.foundation.a.b(ojd.i(eVarA, f2, fgdVar, true, 24), j8, fgdVar);
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarB);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            long j9 = j6;
            n73.b(Boolean.valueOf(z), null, zd0.d(100, 0, null, 6), null, bh2.c(1853731063, new b7c(j9, g7cVar), cVarH), cVarH, i4 | 24960, 10);
            cVarH = cVarH;
            cVarH.U(true);
            j4 = j9;
            j3 = j7;
        } else {
            cVarH.D();
            j3 = j;
            j4 = j2;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, g7cVar, eVar, j3, j4, i) { // from class: a7c
                public final /* synthetic */ boolean a;
                public final /* synthetic */ g7c b;
                public final /* synthetic */ e c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(65);
                    c7c.b(this.a, this.b, this.c, this.d, this.e, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void c(gb4 gb4Var, v5b v5bVar, qtc qtcVar, long j, float f2, xt0 xt0Var) {
        v5bVar.reset();
        v5bVar.j(0.0f, 0.0f);
        float f3 = d;
        float fT1 = gb4Var.t1(f3);
        float f4 = xt0Var.b;
        v5bVar.n(fT1 * f4, 0.0f);
        v5bVar.n((gb4Var.t1(f3) * f4) / 2.0f, gb4Var.t1(e) * f4);
        float fMin = Math.min(qtcVar.c - qtcVar.a, qtcVar.d - qtcVar.b) / 2.0f;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (qtcVar.b() >> 32)) + fMin) - ((gb4Var.t1(f3) * f4) / 2.0f);
        float fT12 = (gb4Var.t1(c) / 2.0f) + Float.intBitsToFloat((int) (qtcVar.b() & 4294967295L));
        v5bVar.g((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fT12)) & 4294967295L));
        v5bVar.close();
        float f5 = xt0Var.a;
        long jF1 = gb4Var.F1();
        ax1.b bVarW1 = gb4Var.w1();
        long jD = bVarW1.d();
        bVarW1.a().o();
        try {
            bVarW1.a.f(jF1, f5);
            gb4.E0(gb4Var, v5bVar, j, f2, null, 56);
        } finally {
            g7.k(bVarW1, jD);
        }
    }
}
