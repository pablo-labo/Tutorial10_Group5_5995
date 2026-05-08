package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ax1;

/* JADX INFO: loaded from: classes.dex */
public interface gb4 extends iy3 {
    static /* synthetic */ void E0(gb4 gb4Var, v5b v5bVar, long j, float f, bwe bweVar, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        ib4 ib4Var = bweVar;
        if ((i & 8) != 0) {
            ib4Var = ib5.a;
        }
        gb4Var.D(v5bVar, j, f2, ib4Var);
    }

    static /* synthetic */ void M1(gb4 gb4Var, sn1 sn1Var, long j, long j2, float f, ib4 ib4Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = n1(gb4Var.c(), j3);
        }
        gb4Var.B0(sn1Var, j3, j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? ib5.a : ib4Var);
    }

    static /* synthetic */ void i0(gb4 gb4Var, v5b v5bVar, sn1 sn1Var, float f, bwe bweVar, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        ib4 ib4Var = bweVar;
        if ((i & 8) != 0) {
            ib4Var = ib5.a;
        }
        gb4Var.m1(v5bVar, sn1Var, f2, ib4Var, (i & 32) != 0 ? 3 : 0);
    }

    static /* synthetic */ void k0(ss2 ss2Var, sn1 sn1Var, long j, long j2, long j3, ib4 ib4Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        ss2Var.q1(sn1Var, j4, (i & 4) != 0 ? n1(ss2Var.c(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? ib5.a : ib4Var);
    }

    static long n1(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    static /* synthetic */ void o1(gb4 gb4Var, long j, long j2, long j3, float f, ga2 ga2Var, int i) {
        long j4 = (i & 2) != 0 ? 0L : j2;
        gb4Var.D1(j, j4, (i & 4) != 0 ? n1(gb4Var.c(), j4) : j3, (i & 8) != 0 ? 1.0f : f, ib5.a, (i & 32) != 0 ? null : ga2Var, (i & 64) != 0 ? 3 : 0);
    }

    static /* synthetic */ void q0(gb4 gb4Var, long j, float f, long j2, ib4 ib4Var, int i) {
        if ((i & 4) != 0) {
            j2 = gb4Var.F1();
        }
        long j3 = j2;
        if ((i & 16) != 0) {
            ib4Var = ib5.a;
        }
        gb4Var.h1(j, f, j3, ib4Var);
    }

    static void y1(gb4 gb4Var, m07 m07Var, long j, long j2, long j3, long j4, float f, ib4 ib4Var, ga2 ga2Var, int i, int i2, int i3) {
        gb4Var.X0(m07Var, (i3 & 2) != 0 ? 0L : j, j2, (i3 & 8) != 0 ? 0L : j3, (i3 & 16) != 0 ? j2 : j4, (i3 & 32) != 0 ? 1.0f : f, (i3 & 64) != 0 ? ib5.a : ib4Var, ga2Var, (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 3 : i, (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? 1 : i2);
    }

    void B0(sn1 sn1Var, long j, long j2, float f, ib4 ib4Var);

    void D(v5b v5bVar, long j, float f, ib4 ib4Var);

    void D1(long j, long j2, long j3, float f, ib4 ib4Var, ga2 ga2Var, int i);

    default long F1() {
        return oie.j(w1().d());
    }

    void Q(long j, float f, float f2, long j2, long j3, float f3, ib4 ib4Var);

    void W(long j, long j2, long j3, float f, int i);

    default void X0(m07 m07Var, long j, long j2, long j3, long j4, float f, ib4 ib4Var, ga2 ga2Var, int i, int i2) {
        y1(this, m07Var, j, j2, j3, j4, f, ib4Var, ga2Var, i, 0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
    }

    default long c() {
        return w1().d();
    }

    vl8 getLayoutDirection();

    void h1(long j, float f, long j2, ib4 ib4Var);

    void m1(v5b v5bVar, sn1 sn1Var, float f, ib4 ib4Var, int i);

    void o0(m07 m07Var, ib4 ib4Var, ih1 ih1Var);

    void p0(long j, long j2, long j3, long j4, ib4 ib4Var);

    void q1(sn1 sn1Var, long j, long j2, long j3, float f, ib4 ib4Var);

    void s1(kne kneVar, long j, long j2, float f, float f2);

    ax1.b w1();
}
