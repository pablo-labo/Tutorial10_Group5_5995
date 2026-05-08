package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class aka {
    public static final void a(int i, e eVar, gu5<j6g> gu5Var, b bVar, int i2) {
        eVar.getClass();
        gu5Var.getClass();
        c cVarH = bVar.h(-2138624913);
        int i3 = (cVarH.d(i) ? 4 : 2) | i2 | (cVarH.K(eVar) ? 32 : 16) | (cVarH.x(gu5Var) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i3 & 1, (i3 & 147) != 146)) {
            boolean zO = i6a.o();
            b.a.C0020a c0020a = b.a.a;
            if (zO) {
                cVarH.L(2070798971);
                String strI = ak2.I(i, cVarH);
                boolean z = (i3 & 896) == 256;
                Object objV = cVarH.v();
                if (z || objV == c0020a) {
                    objV = new ib1(4, gu5Var);
                    cVarH.p(objV);
                }
                gt6.j(strI, (gu5) objV, eVar, null, false, false, null, null, null, cVarH, (i3 << 3) & 896, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                cVarH.U(false);
            } else {
                cVarH.L(-229597776);
                e eVarH = ygg.h(eVar, ggd.a(8.0f));
                boolean z2 = (i3 & 896) == 256;
                Object objV2 = cVarH.v();
                if (z2 || objV2 == c0020a) {
                    objV2 = new cl6(3, gu5Var);
                    cVarH.p(objV2);
                }
                e eVarG = f.g(ti1.b(androidx.compose.foundation.b.d(eVarH, false, null, null, (gu5) objV2, 15), 1.0f, new kne(eu6.q), ggd.a(8.0f)), 16.0f, 9.0f);
                af1.a aVar = c20.a.m;
                vs0.c cVar = vs0.e;
                ob2 ob2VarA = mb2.a(cVar, aVar, cVarH, 6);
                int iHashCode = Long.hashCode(cVarH.T);
                t8b t8bVarP = cVarH.P();
                e eVarC = androidx.compose.ui.c.c(cVarH, eVarG);
                gl2.j.getClass();
                pm8.a aVar2 = gl2.a.b;
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar2);
                } else {
                    cVarH.n();
                }
                gl2.a.d dVar = gl2.a.g;
                ygg.y(cVarH, ob2VarA, dVar);
                gl2.a.f fVar = gl2.a.f;
                ygg.y(cVarH, t8bVarP, fVar);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                    ja.h(iHashCode, cVarH, iHashCode, c0251a);
                }
                gl2.a.e eVar2 = gl2.a.d;
                ygg.y(cVarH, eVarC, eVar2);
                e eVarF = g.f(e.a.b, 1.0f);
                ehd ehdVarA = chd.a(cVar, c20.a.k, cVarH, 54);
                int iHashCode2 = Long.hashCode(cVarH.T);
                t8b t8bVarP2 = cVarH.P();
                e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarF);
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar2);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ehdVarA, dVar);
                ygg.y(cVarH, t8bVarP2, fVar);
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                    ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
                }
                ygg.y(cVarH, eVarC2, eVar2);
                cif.b(ak2.I(i, cVarH), null, eu6.c, 0L, null, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, hz6.f, cVarH, 0, 0, 65018);
                o6.j(cVarH, true, true, false);
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new zja(i, eVar, gu5Var, i2);
        }
    }

    public static final void b(bka bkaVar, b bVar, int i) {
        int i2;
        c cVar;
        bkaVar.getClass();
        c cVarH = bVar.h(644670781);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(bkaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e eVarE = f.e(g.f(e.a.b, 1.0f), new hza(4.0f, 8.0f, 4.0f, 8.0f));
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = new tr(12);
                cVarH.p(objV);
            }
            ay1.b(b5e.b(eVarE, false, (Function1) objV), ggd.a(8.0f), wx1.a(o97Var.c.b.a, 0L, 0L, 0L, cVarH, 14), null, ee3.f(eu6.r, 1.0f), bh2.c(704648367, new xja(bkaVar, i3), cVarH), cVarH, 196608, 8);
            cVar = cVarH;
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new yja(bkaVar, i, i3);
        }
    }
}
