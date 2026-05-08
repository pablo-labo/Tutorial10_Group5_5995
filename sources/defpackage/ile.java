package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.h;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ile {
    public static final void a(ah2 ah2Var, Function2 function2, b bVar, int i) {
        c cVarH = bVar.h(1302703572);
        int i2 = (cVarH.x(ah2Var) ? 4 : 2) | i | (cVarH.x(function2) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            e.a aVar = e.a.b;
            e eVarJ = f.j(aVar, 16.0f, 0.0f, 8.0f, 0.0f, 10);
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = new ele();
                cVarH.p(objV);
            }
            ag9 ag9Var = (ag9) objV;
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarJ);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ag9Var, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            e eVarH = f.h(h.b(aVar, "text"), 0.0f, 6.0f, 1);
            af1 af1Var = c20.a.a;
            ag9 ag9VarD = hl1.d(af1Var, false);
            int iG2 = cVarH.G();
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarH);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG2))) {
                ja.h(iG2, cVarH, iG2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar);
            ah2Var.invoke(cVarH, Integer.valueOf(i2 & 14));
            cVarH.U(true);
            e eVarB = h.b(aVar, RumEventDeserializer.EVENT_TYPE_ACTION);
            ag9 ag9VarD2 = hl1.d(af1Var, false);
            int iG3 = cVarH.G();
            t8b t8bVarP3 = cVarH.P();
            e eVarC3 = androidx.compose.ui.c.c(cVarH, eVarB);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD2, dVar);
            ygg.y(cVarH, t8bVarP3, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG3))) {
                ja.h(iG3, cVarH, iG3, c0251a);
            }
            ygg.y(cVarH, eVarC3, eVar);
            function2.invoke(cVarH, Integer.valueOf((i2 >> 3) & 14));
            cVarH.U(true);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new gt(ah2Var, i, 7, function2);
        }
    }

    public static final void b(final e eVar, final Function2 function2, final dce dceVar, final long j, final long j2, final float f, final ah2 ah2Var, b bVar, final int i) {
        int i2;
        c cVar;
        c cVarH = bVar.h(-662779944);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.a(false) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.K(dceVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.e(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.e(j2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= cVarH.c(f) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= cVarH.x(ah2Var) ? 8388608 : 4194304;
        }
        if (cVarH.o(i2 & 1, (4793491 & i2) != 4793490)) {
            cVarH.v0();
            if ((i & 1) != 0 && !cVarH.c0()) {
                cVarH.D();
            }
            cVarH.V();
            int i3 = i2 >> 6;
            cVar = cVarH;
            m0f.a(eVar, dceVar, j, j2, null, f, bh2.c(-1429068516, new lmd(function2, ah2Var), cVarH), cVar, 1572864 | (i2 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | ((i2 >> 3) & 458752), 16);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: cle
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ile.b(eVar, function2, dceVar, j, j2, f, ah2Var, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void c(final qke qkeVar, e eVar, dce dceVar, long j, long j2, long j3, float f, b bVar, final int i) {
        int i2;
        c cVar;
        final e eVar2;
        final dce dceVar2;
        final long j4;
        final long j5;
        final long j6;
        final float f2;
        int i3;
        int i4;
        long jX;
        int i5;
        e eVar3;
        long j7;
        long j8;
        float f3;
        dce dceVar3;
        ah2 ah2VarC;
        c cVarH = bVar.h(258660814);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? cVarH.K(qkeVar) : cVarH.x(qkeVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 432;
        if ((i & 3072) == 0) {
            i6 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i6 |= 8192;
        }
        if ((196608 & i) == 0) {
            i6 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i6 |= 524288;
        }
        int i7 = i6 | 12582912;
        int i8 = 1;
        if (cVarH.o(i7 & 1, (4793491 & i7) != 4793490)) {
            cVarH.v0();
            if ((i & 1) == 0 || cVarH.c0()) {
                p03 p03Var = ((ede) cVarH.M(gde.a)).a;
                jte jteVar = lb2.a;
                long jX2 = pnb.x(da2.b(((kb2) cVarH.M(jteVar)).c(), 0.8f), ((kb2) cVarH.M(jteVar)).f());
                long jF = ((kb2) cVarH.M(jteVar)).f();
                kb2 kb2Var = (kb2) cVarH.M(jteVar);
                if (kb2Var.g()) {
                    i3 = 12582912;
                    i4 = i7;
                    jX = pnb.x(da2.b(kb2Var.f(), 0.6f), kb2Var.d());
                } else {
                    i3 = 12582912;
                    i4 = i7;
                    jX = ((da2) ((gme) kb2Var.b).getValue()).a;
                }
                i5 = i4 & (-4193281);
                eVar3 = e.a.b;
                j7 = jX2;
                j8 = jF;
                f3 = 6.0f;
                dceVar3 = p03Var;
            } else {
                cVarH.D();
                eVar3 = eVar;
                dceVar3 = dceVar;
                j7 = j;
                j8 = j2;
                f3 = f;
                i3 = 12582912;
                i5 = i7 & (-4193281);
                jX = j3;
            }
            cVarH.V();
            String strA = qkeVar.a();
            if (strA != null) {
                cVarH.L(593509092);
                ah2VarC = bh2.c(1843479216, new gle(jX, qkeVar, strA), cVarH);
                cVarH.U(false);
            } else {
                cVarH.L(593808056);
                cVarH.U(false);
                ah2VarC = null;
            }
            cVar = cVarH;
            b(f.f(eVar3, 12.0f), ah2VarC, dceVar3, j7, j8, f3, bh2.c(-261845785, new df9(qkeVar, i8), cVarH), cVar, (i5 & 896) | i3 | ((i5 >> 3) & 3670016));
            long j9 = jX;
            eVar2 = eVar3;
            j6 = j9;
            dceVar2 = dceVar3;
            j4 = j7;
            j5 = j8;
            f2 = f3;
        } else {
            cVar = cVarH;
            cVar.D();
            eVar2 = eVar;
            dceVar2 = dceVar;
            j4 = j;
            j5 = j2;
            j6 = j3;
            f2 = f;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: ble
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ile.c(qkeVar, eVar2, dceVar2, j4, j5, j6, f2, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void d(ah2 ah2Var, b bVar, int i) {
        c cVarH = bVar.h(343813818);
        int i2 = (cVarH.x(ah2Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = hle.a;
                cVarH.p(objV);
            }
            ag9 ag9Var = (ag9) objV;
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e.a aVar = e.a.b;
            e eVarC = androidx.compose.ui.c.c(cVarH, aVar);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ag9Var, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            e eVarG = f.g(aVar, 16.0f, 6.0f);
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iG2 = cVarH.G();
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarG);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG2))) {
                ja.h(iG2, cVarH, iG2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar);
            ah2Var.invoke(cVarH, Integer.valueOf(i2 & 14));
            cVarH.U(true);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new t5(ah2Var, i, 7);
        }
    }
}
