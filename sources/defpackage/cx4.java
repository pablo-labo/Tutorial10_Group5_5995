package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.le0;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class cx4 {
    public static final void a(gx4 gx4Var, b bVar, int i) {
        int i2;
        boolean z;
        c cVarH = bVar.h(-720693714);
        int i3 = i | (cVarH.x(gx4Var) ? 4 : 2);
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            vs0.i iVar = new vs0.i(16.0f, false, new pa(c20.a.k, 1));
            e.a aVar = e.a.b;
            e eVarM = pnb.M(f.f(g.c(g.f(aVar, 1.0f), 1.0f), 32.0f), pnb.L(0, 1, cVarH), true);
            ob2 ob2VarA = mb2.a(iVar, c20.a.n, cVarH, 54);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarM);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
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
            f17.a(gx4Var.a, gx4Var.b, null, null, null, 0.0f, null, cVarH, 0, 124);
            String str = gx4Var.c;
            tjf tjfVar = hz6.g;
            o97.a aVar3 = o97Var.c;
            long j = o97Var.e.d;
            i2 = 0;
            fif.b(str, null, aVar3.a.c, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, cVarH, 0, 0, 65530);
            fif.b(gx4Var.d, null, o97Var.c.a.a, 0L, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, o97Var.j.g, cVarH, 0, 0, 65018);
            cVarH = cVarH;
            if (gx4Var.h != null) {
                cVarH.L(-1433603969);
                boolean zO = i6a.o();
                b.a.C0020a c0020a = b.a.a;
                if (zO) {
                    cVarH.L(369397534);
                    String str2 = gx4Var.h;
                    boolean zX = cVarH.x(gx4Var);
                    Object objV = cVarH.v();
                    if (zX || objV == c0020a) {
                        objV = new a1(gx4Var, 10);
                        cVarH.p(objV);
                    }
                    gt6.h(str2, (gu5) objV, null, null, false, false, fv6.M7, null, null, cVarH, 1572864, 444);
                    cVarH.U(false);
                    z = true;
                } else {
                    cVarH.L(-1433401508);
                    hza hzaVar = iq1.a;
                    wl3 wl3VarA = iq1.a(eu6.c, eu6.u, cVarH, 0, 12);
                    e eVarJ = f.j(aVar, 0.0f, bkf.c(j), 0.0f, bkf.c(j), 5);
                    fgd fgdVarA = ggd.a(8.0f);
                    boolean zX2 = cVarH.x(gx4Var);
                    Object objV2 = cVarH.v();
                    if (zX2 || objV2 == c0020a) {
                        objV2 = new le(gx4Var, 4);
                        cVarH.p(objV2);
                    }
                    z = true;
                    sq1.a((gu5) objV2, eVarJ, false, null, fgdVarA, null, wl3VarA, null, bh2.c(-1276562221, new dl4(gx4Var, true ? 1 : 0), cVarH), cVarH, 805306368, 348);
                    cVarH.U(false);
                }
            } else {
                z = true;
                cVarH.L(-1436869602);
            }
            cVarH.U(false);
            b(0, gx4Var.g, cVarH, gx4Var.f, gx4Var.e);
            cVarH.U(z);
        } else {
            i2 = 0;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new zw4(gx4Var, i, i2);
        }
    }

    public static final void b(int i, gu5 gu5Var, b bVar, String str, String str2) {
        boolean z;
        c cVarH = bVar.h(-1882030832);
        int i2 = i | (cVarH.K(str) ? 4 : 2) | (cVarH.K(str2) ? 32 : 16) | (cVarH.x(gu5Var) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                m74 m74Var = to4.a;
                objV = v40.b(cVarH.l(), cVarH);
            }
            e13 e13Var = (e13) objV;
            Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            o97 o97Var = (o97) cVarH.M(p97.a);
            le0.b bVar2 = new le0.b();
            int iK = bVar2.k(new foe(o97Var.c.a.a, 0L, (to5) null, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65534));
            try {
                bVar2.f(str);
                bVar2.g(" ");
                j6g j6gVar = j6g.a;
                bVar2.i(iK);
                String string = context.getString(R.string.contact_us);
                string.getClass();
                bVar2.j("contactUs", string);
                iK = bVar2.k(new foe(o97Var.c.a.d, 0L, (to5) null, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, odf.c, (vbe) null, 61438));
                try {
                    bVar2.f(str2);
                    bVar2.i(iK);
                    bVar2.h();
                    le0 le0VarL = bVar2.l();
                    tjf tjfVar = hz6.c;
                    int i3 = i2 & 896;
                    boolean zX = cVarH.x(e13Var) | (i3 == 256);
                    Object objV2 = cVarH.v();
                    if (zX || objV2 == c0020a) {
                        z = true;
                        objV2 = new oa0(1, e13Var, gu5Var);
                        cVarH.p(objV2);
                    } else {
                        z = true;
                    }
                    e eVarD = androidx.compose.foundation.b.d(e.a.b, false, null, null, (gu5) objV2, 15);
                    boolean zK = cVarH.K(le0VarL);
                    if (i3 != 256) {
                        z = false;
                    }
                    boolean z2 = zK | z;
                    Object objV3 = cVarH.v();
                    if (z2 || objV3 == c0020a) {
                        objV3 = new ed1(2, le0VarL, gu5Var);
                        cVarH.p(objV3);
                    }
                    p72.a(le0VarL, eVarD, tjfVar, false, 0, 0, null, (Function1) objV3, cVarH, 0, 120);
                } finally {
                }
            } finally {
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ax4(str, str2, gu5Var, i, 0);
        }
    }
}
