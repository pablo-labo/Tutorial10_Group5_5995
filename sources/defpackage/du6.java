package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class du6 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final fv6 fv6Var, final gu5 gu5Var, final e eVar, xbf xbfVar, boolean z, final nq6 nq6Var, b bVar, final int i) {
        c cVar;
        final xbf xbfVar2;
        final boolean z2;
        c cVar2;
        nq6 nq6Var2;
        fv6Var.getClass();
        gu5Var.getClass();
        c cVarH = bVar.h(-452258269);
        int i2 = i | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.K(eVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | 224256 | (cVarH.K(nq6Var) ? 1048576 : 524288);
        if (cVarH.o(i2 & 1, (599187 & i2) != 599186)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = v40.a(cVarH);
            }
            d3a d3aVar = (d3a) objV;
            o97.a aVar = o97Var.c;
            o97.a.e eVar2 = aVar.a;
            long j = aVar.b.g.c;
            g4a g4aVarH = r03.h(d3aVar, cVarH);
            xbf xbfVar3 = xbf.Md;
            e eVarH = ygg.h(androidx.compose.foundation.e.a(ygg.h(g.a(eVar, xbfVar3.a(), xbfVar3.a()), ggd.a(8.0f)), d3aVar, sdd.a(j, 1, 1000.0f)), ggd.a(8.0f));
            if (nq6Var == null) {
                cVarH.L(-828464106);
                cVar2 = cVarH;
                nq6 nq6VarA = pq6.a(0L, ((Boolean) g4aVarH.getValue()).booleanValue() ? eVar2.g.f.c : eVar2.g.f.a, 0L, da2.b(eVar2.g.f.a, 0.4f), cVar2, 5);
                cVar2.U(false);
                nq6Var2 = nq6VarA;
            } else {
                cVar2 = cVarH;
                cVar2.L(-828465377);
                cVar2.U(false);
                nq6Var2 = nq6Var;
            }
            c cVar3 = cVar2;
            rq6.b(gu5Var, eVarH, true, nq6Var2, d3aVar, bh2.c(1096973350, new kh(fv6Var, 5), cVar2), cVar3, ((i2 >> 3) & 14) | 221568, 0);
            cVar = cVar3;
            z2 = true;
            xbfVar2 = xbfVar3;
        } else {
            cVar = cVarH;
            cVar.D();
            xbfVar2 = xbfVar;
            z2 = z;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(gu5Var, eVar, xbfVar2, z2, nq6Var, i) { // from class: cu6
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ e c;
                public final /* synthetic */ xbf d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ nq6 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(7);
                    du6.a(this.a, this.b, this.c, this.d, this.e, this.f, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(ah2 ah2Var, b bVar, int i) {
        gl2.a.C0251a c0251a;
        c cVarH = bVar.h(958622836);
        int i2 = (cVarH.a(false) ? 4 : 2) | i | 48;
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            ese eseVarB = vc0.b(1.0f, null, "", cVarH, 3072, 22);
            ese eseVarB2 = vc0.b(0.0f, null, "", cVarH, 3072, 22);
            ag9 ag9VarD = hl1.d(c20.a.e, false);
            int iHashCode = Long.hashCode(cVarH.T);
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
            ygg.y(cVarH, ag9VarD, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a2 = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a2);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            boolean zK = cVarH.K(eseVarB2);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zK || objV == c0020a) {
                objV = new na(eseVarB2, 8);
                cVarH.p(objV);
            }
            tx6.a(a.a(aVar, (Function1) objV), "", false, null, cVarH, 432, 8);
            cVarH = cVarH;
            boolean zK2 = cVarH.K(eseVarB);
            Object objV2 = cVarH.v();
            if (zK2 || objV2 == c0020a) {
                objV2 = new m91(eseVarB, 4);
                cVarH.p(objV2);
            }
            e eVarA = a.a(aVar, (Function1) objV2);
            ag9 ag9VarD2 = hl1.d(c20.a.a, false);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarA);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD2, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                c0251a = c0251a2;
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            } else {
                c0251a = c0251a2;
            }
            ygg.y(cVarH, eVarC2, eVar);
            ehd ehdVarA = chd.a(vs0.e, c20.a.k, cVarH, 54);
            int iHashCode3 = Long.hashCode(cVarH.T);
            t8b t8bVarP3 = cVarH.P();
            e eVarC3 = androidx.compose.ui.c.c(cVarH, aVar);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, dVar);
            ygg.y(cVarH, t8bVarP3, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode3))) {
                ja.h(iHashCode3, cVarH, iHashCode3, c0251a);
            }
            ygg.y(cVarH, eVarC3, eVar);
            ah2Var.q(ghd.a, cVarH, 54);
            cVarH.U(true);
            cVarH.U(true);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new bu6(ah2Var, i);
        }
    }
}
