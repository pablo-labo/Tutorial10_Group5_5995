package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import defpackage.jc7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class c3c {
    public static final l83 a = new l83(0.2f, 0.0f, 0.8f, 1.0f);
    public static final l83 b = new l83(0.4f, 0.0f, 1.0f, 1.0f);
    public static final l83 c = new l83(0.0f, 0.0f, 0.65f, 1.0f);
    public static final l83 d = new l83(0.1f, 0.0f, 0.45f, 1.0f);
    public static final l83 e = new l83(0.4f, 0.0f, 0.2f, 1.0f);

    public static final void a(final e eVar, final long j, final float f, long j2, int i, b bVar, final int i2) {
        c cVar;
        final long j3;
        final int i3;
        int i4;
        long j4;
        int i5;
        e eVar2;
        final long j5;
        c cVarH = bVar.h(-1119119072);
        int i6 = i2 | (cVarH.e(j) ? 32 : 16) | 11264;
        if (cVarH.o(i6 & 1, (i6 & 9363) != 9362)) {
            cVarH.v0();
            if ((i2 & 1) == 0 || cVarH.c0()) {
                i4 = i6 & (-57345);
                j4 = da2.h;
                i5 = 2;
            } else {
                cVarH.D();
                i4 = i6 & (-57345);
                j4 = j2;
                i5 = i;
            }
            cVarH.V();
            final bwe bweVar = new bwe(((iy3) cVarH.M(um2.h)).t1(f), 0.0f, i5, 0, null, 26);
            jc7 jc7VarC = lc7.c(null, cVarH, 1);
            mvf mvfVar = q92.d0;
            l5 l5Var = bf4.c;
            final jc7.a aVarB = lc7.b(jc7VarC, 0, 5, mvfVar, zd0.a(zd0.d(6660, 0, l5Var, 2), 6), null, cVarH, 33208, 16);
            final jc7.a aVarA = lc7.a(jc7VarC, 286.0f, zd0.a(zd0.d(1332, 0, l5Var, 2), 6), null, cVarH, 4536, 8);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = new he(12);
                cVarH.p(objV);
            }
            final jc7.a aVarA2 = lc7.a(jc7VarC, 290.0f, zd0.a(zd0.b((Function1) objV), 6), null, cVarH, 4536, 8);
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = new iq0(10);
                cVarH.p(objV2);
            }
            final jc7.a aVarA3 = lc7.a(jc7VarC, 290.0f, zd0.a(zd0.b((Function1) objV2), 6), null, cVarH, 4536, 8);
            e eVarN = g.n(b5e.b(eVar, true, new xi(11)), 40.0f);
            boolean zX = cVarH.x(bweVar) | cVarH.K(aVarB) | cVarH.K(aVarA2) | cVarH.K(aVarA3) | cVarH.K(aVarA) | ((((i4 & 112) ^ 48) > 32 && cVarH.e(j)) || (i4 & 48) == 32);
            Object objV3 = cVarH.v();
            if (zX || objV3 == c0020a) {
                eVar2 = eVarN;
                cVar = cVarH;
                j5 = j4;
                Function1 function1 = new Function1() { // from class: v2c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        gb4 gb4Var = (gb4) obj;
                        long j6 = j5;
                        bwe bweVar2 = bweVar;
                        c3c.c(gb4Var, 0.0f, 360.0f, j6, bweVar2);
                        float fIntValue = (((Number) aVarB.getValue()).intValue() * 216.0f) % 360.0f;
                        float fFloatValue = ((Number) aVarA2.getValue()).floatValue();
                        ese eseVar = aVarA3;
                        c3c.c(gb4Var, ((Number) eseVar.getValue()).floatValue() + ((Number) aVarA.getValue()).floatValue() + (fIntValue - 90.0f) + (bweVar2.c == 0 ? 0.0f : ((f / 20.0f) * 57.29578f) / 2.0f), Math.max(Math.abs(fFloatValue - ((Number) eseVar.getValue()).floatValue()), 0.1f), j, bweVar2);
                        return j6g.a;
                    }
                };
                cVar.p(function1);
                objV3 = function1;
            } else {
                cVar = cVarH;
                eVar2 = eVarN;
                j5 = j4;
            }
            w74.a(eVar2, (Function1) objV3, cVar, 0);
            j3 = j5;
            i3 = i5;
        } else {
            cVar = cVarH;
            cVar.D();
            j3 = j2;
            i3 = i;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(j, f, j3, i3, i2) { // from class: w2c
                public final /* synthetic */ long b;
                public final /* synthetic */ float c;
                public final /* synthetic */ long d;
                public final /* synthetic */ int e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(391);
                    c3c.a(this.a, this.b, this.c, this.d, this.e, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c A[PHI: r0 r4
  0x006c: PHI (r0v20 int) = (r0v8 int), (r0v22 int) binds: [B:40:0x007e, B:34:0x006a] A[DONT_GENERATE, DONT_INLINE]
  0x006c: PHI (r4v12 long) = (r4v5 long), (r4v3 long) binds: [B:40:0x007e, B:34:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.ui.e r21, final long r22, long r24, androidx.compose.runtime.b r26, final int r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c3c.b(androidx.compose.ui.e, long, long, androidx.compose.runtime.b, int, int):void");
    }

    public static final void c(gb4 gb4Var, float f, float f2, long j, bwe bweVar) {
        float f3 = bweVar.a / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (gb4Var.c() >> 32)) - (2.0f * f3);
        gb4Var.Q(j, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (832 & 64) != 0 ? 1.0f : 0.0f, bweVar);
    }

    public static final void d(gb4 gb4Var, float f, float f2, long j, float f3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (gb4Var.c() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (gb4Var.c() & 4294967295L)) / 2.0f;
        boolean z = gb4Var.getLayoutDirection() == vl8.a;
        float f4 = (z ? f : 1.0f - f2) * fIntBitsToFloat;
        gb4Var.W(j, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), (((long) Float.floatToRawIntBits((z ? f2 : 1.0f - f) * fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), f3, (496 & 16) != 0 ? 0 : 0);
    }
}
