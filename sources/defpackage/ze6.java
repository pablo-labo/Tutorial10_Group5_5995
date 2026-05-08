package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class ze6 {
    public static final void a(final af6 af6Var, gu5 gu5Var, final gu5 gu5Var2, final gu5 gu5Var3, final boolean z, final gu5 gu5Var4, final ah2 ah2Var, b bVar, final int i) {
        gu5 gu5Var5;
        af6Var.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        gu5Var4.getClass();
        c cVarH = bVar.h(1763661804);
        int i2 = i | (cVarH.d(af6Var.ordinal()) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var3) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.a(z) ? 16384 : 8192) | (cVarH.x(gu5Var4) ? 131072 : 65536);
        if (cVarH.o(i2 & 1, (599187 & i2) != 599186)) {
            String strI = ak2.I(R.string.desc_close, cVarH);
            o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar = e.a.b;
            e eVarB = a.b(g.d(aVar, 1.0f), o97Var.c.a.f, ytc.a);
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarB);
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
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            e eVarD = g.d(aVar, 1.0f);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarD);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar);
            gu5Var5 = gu5Var;
            iv6.a(ie7.c, f.a(aVar, "HamburgerMenuTopBar"), false, null, false, null, null, bh2.c(759246510, new hr4(1, gu5Var5, strI), cVarH), cVarH, 100663350, 252);
            cVarH = cVarH;
            int iOrdinal = af6Var.ordinal();
            if (iOrdinal == 0) {
                cVarH.L(1634208193);
                ah2Var.invoke(cVarH, 6);
                cVarH.U(false);
                j6g j6gVar = j6g.a;
            } else if (iOrdinal == 1) {
                cVarH.L(1633147156);
                bxg.a(0, cVarH);
                cVarH.U(false);
                j6g j6gVar2 = j6g.a;
            } else {
                if (iOrdinal != 2) {
                    cVarH.L(-224413318);
                    cVarH.U(false);
                    l.g();
                    return;
                }
                cVarH.L(1633280766);
                dx4 dx4Var = new dx4(ex4.c, 64);
                Object objV = cVarH.v();
                if (objV == b.a.a) {
                    objV = new l7(6);
                    cVarH.p(objV);
                }
                kl6.c(dx4Var, gu5Var3, gu5Var2, (gu5) objV, false, cVarH, ((i2 >> 6) & 112) | 27648 | (i2 & 896), 0);
                cVarH.U(false);
                j6g j6gVar3 = j6g.a;
            }
            cVarH.U(true);
            cVarH.U(true);
            if (z) {
                cVarH.L(916327066);
                tz6.a(((i2 << 6) & 29360128) | 390, 888, null, gu5Var4, fv6.q4, cVarH, null, ak2.I(R.string.failed_to_find_email_app, cVarH), null, null, null, true);
            } else {
                cVarH.L(912302646);
            }
            cVarH.U(false);
        } else {
            gu5Var5 = gu5Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            final gu5 gu5Var6 = gu5Var5;
            iVarW.d = new Function2(gu5Var6, gu5Var2, gu5Var3, z, gu5Var4, ah2Var, i) { // from class: ye6
                public final /* synthetic */ ah2 V;
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ gu5 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1572865);
                    ze6.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
