package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.j2h;
import defpackage.pm8;
import defpackage.vs0;
import java.util.Locale;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class f2h {
    static {
        v1c.c.getClass();
    }

    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.content.Context, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static final void a(final j2h j2hVar, String str, final Locale locale, b bVar, final int i) {
        final String str2;
        gl2.a.d dVar;
        o97 o97Var;
        gl2.a.e eVar;
        gl2.a.C0251a c0251a;
        pm8.a aVar;
        gl2.a.f fVar;
        boolean z;
        ghd ghdVar;
        e.a aVar2;
        e.a aVar3;
        Object obj;
        ?? r3;
        e.a aVar4;
        c cVarH = bVar.h(1220955399);
        int i2 = i | (cVarH.K(j2hVar) ? 4 : 2) | (cVarH.K(str) ? 32 : 16) | (cVarH.x(locale) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            o97 o97Var2 = (o97) cVarH.M(p97.a);
            e.a aVar5 = e.a.b;
            e eVarF = f.f(g.f(aVar5, 1.0f), 16.0f);
            ehd ehdVarA = chd.a(vs0.g, c20.a.k, cVarH, 54);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarF);
            gl2.j.getClass();
            pm8.a aVar6 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar6);
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
            vs0.i iVar = new vs0.i(2.0f, true, new us0(0));
            ghd ghdVar2 = ghd.a;
            e eVarA = ghdVar2.a(aVar5, 3.0f);
            ob2 ob2VarA = mb2.a(iVar, c20.a.m, cVarH, 6);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarA);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar6);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, dVar2);
            ygg.y(cVarH, t8bVarP2, fVar2);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a2);
            }
            ygg.y(cVarH, eVarC2, eVar2);
            String str3 = j2hVar.b;
            if (str3 == null) {
                cVarH.L(-1998732703);
                cVarH.U(false);
                dVar = dVar2;
                o97Var = o97Var2;
                eVar = eVar2;
                c0251a = c0251a2;
                aVar = aVar6;
                fVar = fVar2;
                z = false;
                ghdVar = ghdVar2;
                aVar2 = aVar5;
            } else {
                cVarH.L(-1998732702);
                if (zve.U(str3)) {
                    dVar = dVar2;
                    o97Var = o97Var2;
                    eVar = eVar2;
                    c0251a = c0251a2;
                    aVar = aVar6;
                    fVar = fVar2;
                    z = false;
                    ghdVar = ghdVar2;
                    aVar2 = aVar5;
                    cVarH.L(-355813889);
                } else {
                    cVarH.L(-353941799);
                    aVar = aVar6;
                    dVar = dVar2;
                    eVar = eVar2;
                    ghdVar = ghdVar2;
                    aVar2 = aVar5;
                    fVar = fVar2;
                    c0251a = c0251a2;
                    z = false;
                    o97Var = o97Var2;
                    cif.c(v1c.j(str3), null, eu6.k, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tjf.a(o97Var2.j.f, 0L, 0L, o97Var2.f.c, null, null, 0L, 0, 0L, null, null, 0, 16777211), cVarH, 0, 0, 131066);
                    cVarH = cVarH;
                }
                cVarH.U(z);
                j6g j6gVar = j6g.a;
                cVarH.U(z);
            }
            String str4 = j2hVar.c;
            if (str4 == null) {
                cVarH.L(-1998313366);
            } else {
                cVarH.L(-1998313365);
                if (zve.U(str4)) {
                    cVarH.L(1320868520);
                } else {
                    cVarH.L(1323159947);
                    c cVar = cVarH;
                    cif.b(str4, androidx.compose.ui.platform.f.a(aVar2, "WorkExpDataChipCompany"), eu6.k, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.g, cVar, 48, 0, 65528);
                    cVarH = cVar;
                }
                cVarH.U(z);
                j6g j6gVar2 = j6g.a;
            }
            cVarH.U(z);
            j2h.b bVar2 = j2hVar.d;
            String str5 = bVar2 != null ? bVar2.b : null;
            String str6 = bVar2 != null ? bVar2.c : null;
            if (v1c.h(str5)) {
                str6 = str5;
            } else if (!v1c.h(str6)) {
                str6 = null;
            }
            if (str6 == null) {
                cVarH.L(-1997538583);
                cVarH.U(z);
                aVar3 = aVar2;
                r3 = 0;
            } else {
                cVarH.L(-1997538582);
                if (zve.U(str6)) {
                    aVar3 = aVar2;
                    obj = null;
                    cVarH.L(-1773732185);
                } else {
                    cVarH.L(-1770665975);
                    tjf tjfVar = o97Var.j.g;
                    c cVar2 = cVarH;
                    long j = eu6.k;
                    e eVarA2 = androidx.compose.ui.platform.f.a(aVar2, "WorkExpDataChipLocation");
                    aVar3 = aVar2;
                    obj = null;
                    cif.b(str6, eVarA2, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, cVar2, 48, 0, 65528);
                    cVarH = cVar2;
                }
                cVarH.U(z);
                j6g j6gVar3 = j6g.a;
                cVarH.U(z);
                r3 = obj;
            }
            j2h.a aVar7 = j2hVar.e;
            if (aVar7 == null) {
                cVarH.L(-1997147890);
                cVarH.U(z);
                aVar4 = aVar3;
            } else {
                cVarH.L(-1997147889);
                String strE = v1c.e(aVar7.b, locale, r3, cVarH, 4);
                if (strE == null) {
                    cVarH.L(741392597);
                    cVarH.U(z);
                    aVar4 = aVar3;
                } else {
                    cVarH.L(741392598);
                    if (zve.U(strE)) {
                        aVar4 = aVar3;
                        cVarH.L(-634950084);
                    } else {
                        cVarH.L(-631299617);
                        tjf tjfVar2 = o97Var.j.g;
                        c cVar3 = cVarH;
                        aVar4 = aVar3;
                        cif.b(strE, androidx.compose.ui.platform.f.a(aVar3, "WorkExpDataChipDateRange"), eu6.k, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar2, cVar3, 48, 0, 65528);
                        cVarH = cVar3;
                    }
                    cVarH.U(z);
                    j6g j6gVar4 = j6g.a;
                    cVarH.U(z);
                }
                cVarH.U(z);
            }
            String str7 = j2hVar.f;
            if (str7 == null) {
                cVarH.L(-1996520822);
            } else {
                cVarH.L(-1996520821);
                if (zve.U(str7)) {
                    cVarH.L(627532709);
                } else {
                    cVarH.L(631639744);
                    r35.a(str7, null, "WorkExpDataChipDescription", cVarH, 3456, 18);
                }
                cVarH.U(z);
                j6g j6gVar5 = j6g.a;
            }
            cVarH.U(z);
            cVarH.U(true);
            ghd ghdVar3 = ghdVar;
            e eVarA3 = ghdVar3.a(aVar4, 1.0f);
            af1.b bVar3 = c20.a.j;
            e eVarB = ghdVar3.b(eVarA3, bVar3);
            ehd ehdVarA2 = chd.a(vs0.b, bVar3, cVarH, 6);
            int iHashCode3 = Long.hashCode(cVarH.T);
            t8b t8bVarP3 = cVarH.P();
            e eVarC3 = androidx.compose.ui.c.c(cVarH, eVarB);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA2, dVar);
            ygg.y(cVarH, t8bVarP3, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode3))) {
                ja.h(iHashCode3, cVarH, iHashCode3, c0251a);
            }
            ygg.y(cVarH, eVarC3, eVar);
            str2 = str;
            lvb.a(str2, R.drawable.ic_idl_occupation_24, r3, cVarH, (i2 >> 3) & 14);
            cVarH.U(true);
            cVarH.U(true);
        } else {
            str2 = str;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(str2, locale, i) { // from class: e2h
                public final /* synthetic */ String b;
                public final /* synthetic */ Locale c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iL = ka2.L(1);
                    f2h.a(this.a, this.b, this.c, (b) obj2, iL);
                    return j6g.a;
                }
            };
        }
    }
}
