package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.u;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.jc7;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class rx6 {
    public static final void a(xie xieVar, final e eVar, wie wieVar, vie vieVar, uie uieVar, int i, b bVar, final int i2) {
        xie xieVar2;
        wie wieVar2;
        final vie vieVar2;
        final uie uieVar2;
        final int i3;
        c cVarH = bVar.h(1771110686);
        if (((((i2 & 48) == 0 ? i2 | (cVarH.K(eVar) ? 32 : 16) : i2) | 1797504) & 599187) == 599186 && cVarH.i()) {
            cVarH.D();
            xieVar2 = xieVar;
            wieVar2 = wieVar;
            vieVar2 = vieVar;
            uieVar2 = uieVar;
            i3 = i;
        } else {
            o97 o97Var = (o97) cVarH.M(p97.a);
            cVarH.L(-1746271574);
            boolean zX = cVarH.x(o97Var);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                xieVar2 = xieVar;
                objV = new yi(xieVar2, o97Var);
                cVarH.p(objV);
            } else {
                xieVar2 = xieVar;
            }
            gu5 gu5Var = (gu5) objV;
            int i4 = 0;
            cVarH.U(false);
            cVarH.L(5004770);
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = new ao0(3);
                cVarH.p(objV2);
            }
            gu5 gu5Var2 = (gu5) objV2;
            cVarH.U(false);
            cVarH.L(1849434622);
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = r.f(new th7(0L));
                cVarH.p(objV3);
            }
            g4a g4aVar = (g4a) objV3;
            cVarH.U(false);
            o97.g gVar = o97Var.i;
            float f = o97Var.h.a;
            vs0.i iVar = new vs0.i(8.0f, true, new us0(i4));
            c20.b bVar2 = (c20.b) gu5Var2.invoke();
            e eVarF = g.f(eVar, 1.0f);
            cVarH.L(5004770);
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = new zd(2, g4aVar);
                cVarH.p(objV4);
            }
            cVarH.U(false);
            e eVarA = f.a(u.a(eVarF, (Function1) objV4), "IdlSkeleton");
            ob2 ob2VarA = mb2.a(iVar, bVar2, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarA);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            int iOrdinal = xieVar2.ordinal();
            e.a aVar2 = e.a.b;
            if (iOrdinal == 0) {
                cVarH.L(1126700299);
                b(ygg.h(g.n(aVar2, ((j94) gu5Var.invoke()).a), ggd.a), o97Var, cVarH, 384);
                cVarH.U(false);
            } else if (iOrdinal == 1) {
                cVarH.L(1126956669);
                for (int i5 = 0; i5 < 1; i5++) {
                    b(f.a(ygg.h(g.f(g.h(aVar2, ((j94) gu5Var.invoke()).a), 1.0f), ggd.a(f)), "IdlSkeleton_Text_" + i5), o97Var, cVarH, 384);
                }
                cVarH.U(false);
            } else if (iOrdinal == 2) {
                cVarH.L(1127645489);
                b(ygg.h(g.n(aVar2, ((j94) gu5Var.invoke()).a), ggd.a(f)), o97Var, cVarH, 384);
                cVarH.U(false);
            } else if (iOrdinal != 3) {
                cVarH.L(174892101);
                cVarH.U(false);
                l.g();
                return;
            } else {
                cVarH.L(1127917607);
                b(ygg.h(g.h(g.f(aVar2, 1.0f), ((j94) gu5Var.invoke()).a), ggd.a(f)), o97Var, cVarH, 384);
                cVarH.U(false);
            }
            cVarH.U(true);
            wieVar2 = wie.Md;
            vieVar2 = vie.Normal;
            uieVar2 = uie.a;
            i3 = 1;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            final xie xieVar3 = xieVar2;
            final wie wieVar3 = wieVar2;
            iVarW.d = new Function2() { // from class: ox6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rx6.a(xieVar3, eVar, wieVar3, vieVar2, uieVar2, i3, (b) obj, ka2.L(i2 | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(final e eVar, final o97 o97Var, b bVar, final int i) {
        int i2;
        c cVarH = bVar.h(1000083677);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(o97Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.d(2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i2 & 147) == 146 && cVarH.i()) {
            cVarH.D();
        } else {
            hl1.a(c(eVar, o97Var, cVarH, 0), cVarH, 0);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: px6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    rx6.b(eVar, o97Var, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final e c(e eVar, o97 o97Var, b bVar, int i) {
        eVar.getClass();
        bVar.L(-1328272062);
        if ((i & 1) != 0) {
            o97Var = (o97) bVar.M(p97.a);
        }
        e eVarB = a.b(e.a.b, o97Var.c.b.d, ytc.a);
        bVar.L(1218740505);
        o97 o97Var2 = (o97) bVar.M(p97.a);
        jc7.a aVarA = lc7.a(lc7.c("shimmer transition", bVar, 0), 2.0f, zd0.a(zd0.d(vie.Normal.a(), 0, bf4.c, 2), 6), "shimmer offset", bVar, 29112, 0);
        float fFloatValue = ((Number) aVarA.getValue()).floatValue();
        bVar.L(5004770);
        boolean zC = bVar.c(fFloatValue);
        Object objV = bVar.v();
        if (zC || objV == b.a.a) {
            objV = new qx6(o97Var2, aVarA);
            bVar.p(objV);
        }
        bVar.F();
        bVar.F();
        e eVarO = eVar.o(a.a(eVarB, (qx6) objV, null, 6));
        bVar.F();
        return eVarO;
    }
}
