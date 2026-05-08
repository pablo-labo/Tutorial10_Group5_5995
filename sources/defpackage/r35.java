package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class r35 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, gza gzaVar, final String str2, b bVar, final int i, final int i2) {
        final gza gzaVar2;
        boolean z;
        str.getClass();
        c cVarH = bVar.h(-1480676395);
        int i3 = (cVarH.K(str) ? 4 : 2) | i;
        int i4 = i3 | 48;
        if ((i2 & 8) != 0) {
            i4 = i3 | 3120;
        } else if ((i & 3072) == 0) {
            i4 |= cVarH.a(false) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        int i5 = i4 | 24576;
        if (cVarH.o(i5 & 1, (i5 & 9363) != 9362)) {
            hza hzaVarA = f.a(0.0f, 8.0f, 1);
            le0 le0VarJ = v1c.j(str);
            int i6 = 0;
            for (int i7 = 0; i7 < str.length(); i7++) {
                if (str.charAt(i7) == '\n') {
                    i6++;
                }
            }
            boolean z2 = i6 >= 2;
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(false);
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar = e.a.b;
            e eVarE = f.e(androidx.compose.ui.platform.f.a(aVar, str2), hzaVarA);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            boolean z3 = z2;
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarE);
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
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            if (z3) {
                cVarH.L(1747579526);
                ehd ehdVarA = chd.a(vs0.a, c20.a.j, cVarH, 6);
                int iHashCode2 = Long.hashCode(cVarH.T);
                t8b t8bVarP2 = cVarH.P();
                e eVarC2 = androidx.compose.ui.c.c(cVarH, aVar);
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
                ygg.y(cVarH, eVarC2, eVar);
                z = true;
                cif.c(((Boolean) g4aVar.getValue()).booleanValue() ? le0VarJ : v1c.j(z92.W0(z92.q1(zve.X(str), 2), "\n", null, null, null, 62).concat("...")), null, eu6.n, 0L, null, null, null, 0L, null, null, 0L, 0, false, ((Boolean) g4aVar.getValue()).booleanValue() ? Integer.MAX_VALUE : 2, 0, null, null, o97Var.j.g, cVarH, 0, 0, 122874);
                cVarH = cVarH;
                cVarH.L(1610116866);
                cVarH.U(false);
                cVarH.U(true);
                cVarH.L(1748735671);
                boolean zBooleanValue = ((Boolean) g4aVar.getValue()).booleanValue();
                vt6 vt6Var = vt6.Sm;
                if (zBooleanValue) {
                    cVarH.L(1748768221);
                    String strI = ak2.I(R.string.description_expand_less, cVarH);
                    Object objV2 = cVarH.v();
                    if (objV2 == c0020a) {
                        objV2 = new gd1(3, g4aVar);
                        cVarH.p(objV2);
                    }
                    gt6.m(strI, (gu5) objV2, null, vt6Var, false, null, null, cVarH, 3120, 500);
                    cVarH.U(false);
                } else {
                    cVarH.L(1749097534);
                    String strI2 = ak2.I(R.string.description_expand_more, cVarH);
                    Object objV3 = cVarH.v();
                    if (objV3 == c0020a) {
                        objV3 = new xf4(2, g4aVar);
                        cVarH.p(objV3);
                    }
                    gt6.m(strI2, (gu5) objV3, null, vt6Var, false, null, null, cVarH, 3120, 500);
                    cVarH.U(false);
                }
                cVarH.U(false);
                cVarH.U(false);
            } else {
                z = true;
                cVarH.L(1749832916);
                cif.c(le0VarJ, null, eu6.n, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, o97Var.j.g, cVarH, 0, 0, 131066);
                cVarH = cVarH;
                cVarH.U(false);
            }
            cVarH.U(z);
            gzaVar2 = hzaVarA;
        } else {
            cVarH.D();
            gzaVar2 = gzaVar;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: q35
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r35.a(str, gzaVar2, str2, (b) obj, ka2.L(i | 1), i2);
                    return j6g.a;
                }
            };
        }
    }
}
