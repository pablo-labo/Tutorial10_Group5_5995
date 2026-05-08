package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.jo4;
import defpackage.pm8;
import defpackage.vs0;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class fo4 {
    static {
        u63.Z(new jo4.b("Bachelor of Science", "Computer Science", "id", null, null));
        v1c.c.getClass();
    }

    public static final void a(jo4 jo4Var, Locale locale, b bVar, int i) {
        c cVar;
        o97 o97Var;
        gl2.a.f fVar;
        pm8.a aVar;
        gl2.a.e eVar;
        gl2.a.d dVar;
        gl2.a.C0251a c0251a;
        e.a aVar2;
        boolean z;
        ghd ghdVar;
        boolean z2;
        String str = jo4Var.b;
        List<jo4.b> list = jo4Var.c;
        c cVarH = bVar.h(-1108673279);
        int i2 = i | (cVarH.x(jo4Var) ? 4 : 2) | (cVarH.x(locale) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            o97 o97Var2 = (o97) cVarH.M(p97.a);
            e.a aVar3 = e.a.b;
            e eVarF = f.f(g.f(aVar3, 1.0f), 16.0f);
            ehd ehdVarA = chd.a(vs0.g, c20.a.k, cVarH, 54);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarF);
            gl2.j.getClass();
            pm8.a aVar4 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar4);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar2 = gl2.a.g;
            ygg.y(cVarH, ehdVarA, dVar2);
            gl2.a.f fVar2 = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar2);
            gl2.a.C0251a c0251a2 = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a2);
            }
            gl2.a.e eVar2 = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar2);
            String str2 = str;
            vs0.i iVar = new vs0.i(2.0f, true, new us0(0));
            ghd ghdVar2 = ghd.a;
            e eVarA = ghdVar2.a(aVar3, 3.0f);
            ob2 ob2VarA = mb2.a(iVar, c20.a.m, cVarH, 6);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarA);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar4);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, dVar2);
            ygg.y(cVarH, t8bVarP2, fVar2);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a2);
            }
            ygg.y(cVarH, eVarC2, eVar2);
            jo4.b bVar2 = (jo4.b) z92.Q0(list);
            String strJ = bVar2 != null ? bVar2.a : null;
            if (strJ == null) {
                cVarH.L(1228397083);
                cVarH.U(false);
                z = false;
                o97Var = o97Var2;
                fVar = fVar2;
                aVar = aVar4;
                eVar = eVar2;
                dVar = dVar2;
                c0251a = c0251a2;
                aVar2 = aVar3;
                cVar = cVarH;
                ghdVar = ghdVar2;
            } else {
                cVarH.L(1228397084);
                if (zve.U(strJ)) {
                    o97Var = o97Var2;
                    fVar = fVar2;
                    aVar = aVar4;
                    eVar = eVar2;
                    dVar = dVar2;
                    c0251a = c0251a2;
                    aVar2 = aVar3;
                    z = false;
                    cVar = cVarH;
                    ghdVar = ghdVar2;
                    cVar.L(408452965);
                } else {
                    cVarH.L(410322017);
                    jo4.b bVar3 = (jo4.b) z92.Q0(list);
                    String str3 = bVar3 != null ? bVar3.b : null;
                    if (str3 == null) {
                        cVarH.L(410430578);
                        z2 = false;
                    } else {
                        z2 = false;
                        cVarH.L(410430579);
                        if (zve.U(str3)) {
                            cVarH.L(354265026);
                        } else {
                            cVarH.L(356302501);
                            strJ = ak2.J(R.string.degree_in_field, new Object[]{strJ, str3}, cVarH);
                        }
                        cVarH.U(false);
                        j6g j6gVar = j6g.a;
                    }
                    cVarH.U(z2);
                    tjf tjfVarD = v1c.d(o97Var2, true);
                    aVar = aVar4;
                    String str4 = strJ;
                    o97Var = o97Var2;
                    dVar = dVar2;
                    aVar2 = aVar3;
                    eVar = eVar2;
                    z = z2;
                    fVar = fVar2;
                    c0251a = c0251a2;
                    ghdVar = ghdVar2;
                    cif.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarD, cVarH, 0, 0, 65534);
                    cVar = cVarH;
                }
                cVar.U(z);
                j6g j6gVar2 = j6g.a;
                cVar.U(z);
            }
            if (v1c.h(str2)) {
                cVar.L(1229146850);
                if (str2 == null) {
                    str2 = "";
                }
                c cVar2 = cVar;
                cif.b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, v1c.d(o97Var, z), cVar2, 0, 0, 65534);
                cVar = cVar2;
            } else {
                cVar.L(1226582375);
            }
            cVar.U(z);
            jo4.c cVar3 = jo4Var.d;
            String str5 = cVar3 != null ? cVar3.b : null;
            String str6 = cVar3 != null ? cVar3.c : null;
            if (v1c.h(str5)) {
                str6 = str5;
            } else if (!v1c.h(str6)) {
                str6 = null;
            }
            if (str6 == null) {
                cVar.L(1229740282);
            } else {
                cVar.L(1229740283);
                if (zve.U(str6)) {
                    cVar.L(-1650093906);
                } else {
                    cVar.L(-1646895109);
                    c cVar4 = cVar;
                    cif.b(str6, androidx.compose.ui.platform.f.a(aVar2, "EducationDataChipLocation"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, v1c.d(o97Var, z), cVar4, 48, 0, 65532);
                    cVar = cVar4;
                }
                cVar.U(z);
                j6g j6gVar3 = j6g.a;
            }
            cVar.U(z);
            jo4.a aVar5 = jo4Var.e;
            if (aVar5 == null) {
                cVar.L(1230084227);
            } else {
                cVar.L(1230084228);
                String strE = v1c.e(aVar5.b, locale, null, cVar, 4);
                if (strE == null) {
                    cVar.L(-1294961269);
                } else {
                    cVar.L(-1294961268);
                    if (zve.U(strE)) {
                        cVar.L(1333557795);
                    } else {
                        cVar.L(1337294101);
                        c cVar5 = cVar;
                        cif.b(strE, androidx.compose.ui.platform.f.a(aVar2, "EducationDataChipDateRange"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, v1c.d(o97Var, z), cVar5, 48, 0, 65532);
                        cVar = cVar5;
                    }
                    cVar.U(z);
                    j6g j6gVar4 = j6g.a;
                }
                cVar.U(z);
                j6g j6gVar5 = j6g.a;
            }
            cVar.U(z);
            cVar.U(true);
            e eVarA2 = ghdVar.a(aVar2, 1.0f);
            af1.b bVar4 = c20.a.j;
            e eVarB = ghdVar.b(eVarA2, bVar4);
            ehd ehdVarA2 = chd.a(vs0.b, bVar4, cVar, 6);
            int iHashCode3 = Long.hashCode(cVar.T);
            t8b t8bVarP3 = cVar.P();
            e eVarC3 = androidx.compose.ui.c.c(cVar, eVarB);
            cVar.B();
            if (cVar.S) {
                cVar.y(aVar);
            } else {
                cVar.n();
            }
            ygg.y(cVar, ehdVarA2, dVar);
            ygg.y(cVar, t8bVarP3, fVar);
            if (cVar.S || !wl7.b(cVar.v(), Integer.valueOf(iHashCode3))) {
                ja.h(iHashCode3, cVar, iHashCode3, c0251a);
            }
            ygg.y(cVar, eVarC3, eVar);
            lvb.a(null, R.drawable.ic_idl_education_24, null, cVar, 6);
            cVar.U(true);
            cVar.U(true);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new fq0(jo4Var, i, 2, locale);
        }
    }
}
