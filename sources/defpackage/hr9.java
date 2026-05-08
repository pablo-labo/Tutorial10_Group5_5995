package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hr9 {
    public static final void a(lx7 lx7Var, b bVar, int i) {
        long j;
        long j2;
        boolean z;
        lx7Var.getClass();
        hx7 hx7Var = lx7Var.b;
        c cVarH = bVar.h(647380525);
        int i2 = (cVarH.K(lx7Var) ? 4 : 2) | i | 48;
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            int iOrdinal = hx7Var.ordinal();
            if (iOrdinal == 0) {
                j = o97Var.c.a.h.d.a;
            } else if (iOrdinal == 1) {
                j = o97Var.c.a.h.a.a;
            } else {
                if (iOrdinal != 2) {
                    l.g();
                    return;
                }
                j = o97Var.c.a.h.e.a;
            }
            long j3 = j;
            o97.g gVar = o97Var.i;
            o97.h hVar = o97Var.j;
            o97.a.C0340a c0340a = o97Var.c.b;
            vs0.i iVar = new vs0.i(4.0f, true, new us0(0));
            fgd fgdVarA = ggd.a(o97Var.h.a);
            e.a aVar = e.a.b;
            e eVarH = ygg.h(aVar, fgdVarA);
            int iOrdinal2 = hx7Var.ordinal();
            if (iOrdinal2 == 0) {
                j2 = c0340a.i.d.c;
            } else if (iOrdinal2 == 1) {
                j2 = c0340a.i.a.c;
            } else {
                if (iOrdinal2 != 2) {
                    l.g();
                    return;
                }
                j2 = c0340a.i.e.c;
            }
            e eVarA = f.a(androidx.compose.foundation.layout.f.g(a.b(eVarH, j2, ytc.a), 8.0f, 3.0f), "JobCardAttributeChip");
            ehd ehdVarA = chd.a(iVar, c20.a.k, cVarH, 48);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarA);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            cif.b(lx7Var.a, f.a(aVar, "JobCardAttributeChip".concat("_Text")), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(hVar.g, j3, 0L, to5.d0, null, null, 0L, 0, 0L, null, null, 0, 16777210), cVarH, 0, 0, 65532);
            cVarH = cVarH;
            if (hx7Var != hx7.b) {
                cVarH.L(-859412773);
                ev6.b(hx7Var == hx7.a ? fv6.c4 : fv6.C0, f.a(h4.w(aVar, 0.85f), "JobCardAttributeChip".concat("_Icon")), null, zq6.Xs, j3, null, cVarH, 3072, 36);
                z = false;
            } else {
                z = false;
                cVarH.L(-863672359);
            }
            cVarH.U(z);
            cVarH.L(-858962158);
            cVarH.U(z);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new b52(lx7Var, i, 6);
        }
    }

    public static final void b(final String str, final boolean z, final String str2, final Float f, final String str3, final wu5 wu5Var, final String str4, final String str5, final String str6, List list, final List list2, gu5 gu5Var, wu5 wu5Var2, final bj1 bj1Var, fgd fgdVar, e eVar, b bVar, int i) {
        c cVar;
        List list3;
        wu5 wu5Var3;
        fgd fgdVar2;
        List list4;
        final wu5 wu5Var4;
        fgd fgdVar3;
        int i2;
        tjf tjfVar;
        bj1 bj1VarF;
        c cVarH = bVar.h(385195145);
        int i3 = i | (cVarH.K(str) ? 4 : 2) | (cVarH.K(str2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        boolean zK = cVarH.K(f);
        int i4 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        int i5 = i3 | (zK ? 2048 : 1024) | (cVarH.K(str3) ? 16384 : 8192) | (cVarH.x(wu5Var) ? 131072 : 65536) | (cVarH.K(str4) ? 1048576 : 524288) | (cVarH.K(str5) ? 8388608 : 4194304) | (cVarH.K(str6) ? 67108864 : 33554432) | 805306368;
        int i6 = (cVarH.x(list2) ? 4 : 2) | 1572864 | (cVarH.x(gu5Var) ? 32 : 16) | 384;
        if (cVarH.K(bj1Var)) {
            i4 = 2048;
        }
        int i7 = i6 | i4 | 90112;
        if (cVarH.o(i5 & 1, ((306783379 & i5) == 306783378 && (599187 & i7) == 599186) ? false : true)) {
            cVarH.v0();
            if ((i & 1) == 0 || cVarH.c0()) {
                fgd fgdVarA = ggd.a(16.0f);
                list4 = zr4.a;
                wu5Var4 = jj2.a;
                fgdVar3 = fgdVarA;
                i2 = i7 & (-458753);
            } else {
                cVarH.D();
                list4 = list;
                wu5Var4 = wu5Var2;
                fgdVar3 = fgdVar;
                i2 = i7 & (-458753);
            }
            cVarH.V();
            final o97 o97Var = (o97) cVarH.M(p97.a);
            o97.h hVar = o97Var.j;
            o97.a aVar = o97Var.c;
            tjf tjfVarA = tjf.a(hVar.f, 0L, 0L, o97Var.f.c, null, null, 0L, 0, 0L, null, null, 0, 16777211);
            if (bj1Var == null) {
                tjfVar = tjfVarA;
                bj1VarF = ee3.f(aVar.c.a, 1.0f);
            } else {
                tjfVar = tjfVarA;
                bj1VarF = bj1Var;
            }
            ux1 ux1VarD = wx1.d(aVar.b.a, cVarH);
            final List list5 = list4;
            final tjf tjfVar2 = tjfVar;
            list3 = list5;
            wu5Var3 = wu5Var4;
            cVar = cVarH;
            fgd fgdVar4 = fgdVar3;
            ay1.c(gu5Var, eVar, false, fgdVar4, ux1VarD, null, bj1VarF, null, bh2.c(-833251086, new wu5() { // from class: fr9
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    pm8.a aVar2;
                    gl2.a.C0251a c0251a;
                    fr9 fr9Var;
                    pm8.a aVar3;
                    tjf tjfVar3;
                    gl2.a.C0251a c0251a2;
                    gl2.a.d dVar;
                    gl2.a.f fVar;
                    gl2.a.e eVar2;
                    o97.d dVar2;
                    tjf tjfVar4;
                    o97.a.e eVar3;
                    o97.a.e eVar4;
                    o97.d dVar3;
                    o97.a.e eVar5;
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((pb2) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        e.a aVar4 = e.a.b;
                        e eVarE = androidx.compose.foundation.layout.f.e(g.f(aVar4, 1.0f), new hza(12.0f, 12.0f, 12.0f, 12.0f));
                        vs0.j jVar = vs0.a;
                        af1.b bVar3 = c20.a.k;
                        ehd ehdVarA = chd.a(jVar, bVar3, bVar2, 48);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC = androidx.compose.ui.c.c(bVar2, eVarE);
                        gl2.j.getClass();
                        pm8.a aVar5 = gl2.a.b;
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar5);
                        } else {
                            bVar2.n();
                        }
                        gl2.a.d dVar4 = gl2.a.g;
                        ygg.y(bVar2, ehdVarA, dVar4);
                        gl2.a.f fVar2 = gl2.a.f;
                        ygg.y(bVar2, t8bVarM, fVar2);
                        gl2.a.C0251a c0251a3 = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a3);
                        }
                        gl2.a.e eVar6 = gl2.a.d;
                        ygg.y(bVar2, eVarC, eVar6);
                        o97 o97Var2 = o97Var;
                        o97.h hVar2 = o97Var2.j;
                        tjf tjfVar5 = hVar2.g;
                        o97.a aVar6 = o97Var2.c;
                        o97.a.e eVar7 = aVar6.a;
                        o97.d dVar5 = o97Var2.d;
                        vs0.i iVarE = vs0.e(4.0f);
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                        af1.a aVar7 = c20.a.m;
                        ob2 ob2VarA = mb2.a(iVarE, aVar7, bVar2, 0);
                        int iHashCode2 = Long.hashCode(bVar2.k());
                        t8b t8bVarM2 = bVar2.m();
                        e eVarC2 = androidx.compose.ui.c.c(bVar2, layoutWeightElement);
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar5);
                        } else {
                            bVar2.n();
                        }
                        ygg.y(bVar2, ob2VarA, dVar4);
                        ygg.y(bVar2, t8bVarM2, fVar2);
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                            uz.g(iHashCode2, bVar2, iHashCode2, c0251a3);
                        }
                        ygg.y(bVar2, eVarC2, eVar6);
                        pn5 pn5Var = dVar5.a;
                        String str7 = str;
                        tjf tjfVar6 = tjfVar2;
                        o97 o97Var3 = o97Var2;
                        cif.b(str7, null, 0L, 0L, null, null, pn5Var, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar6, bVar2, 0, 0, 65470);
                        b bVar4 = bVar2;
                        ehd ehdVarA2 = chd.a(vs0.e(4.0f), c20.a.j, bVar4, 0);
                        int iHashCode3 = Long.hashCode(bVar4.k());
                        t8b t8bVarM3 = bVar4.m();
                        e eVarC3 = androidx.compose.ui.c.c(bVar4, aVar4);
                        if (bVar4.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar4.B();
                        if (bVar4.f()) {
                            aVar2 = aVar5;
                            bVar4.y(aVar2);
                        } else {
                            aVar2 = aVar5;
                            bVar4.n();
                        }
                        ygg.y(bVar4, ehdVarA2, dVar4);
                        ygg.y(bVar4, t8bVarM3, fVar2);
                        if (bVar4.f() || !wl7.b(bVar4.v(), Integer.valueOf(iHashCode3))) {
                            c0251a = c0251a3;
                            uz.g(iHashCode3, bVar4, iHashCode3, c0251a);
                        } else {
                            c0251a = c0251a3;
                        }
                        ygg.y(bVar4, eVarC3, eVar6);
                        wu5 wu5Var5 = wu5Var;
                        if (wu5Var5 == null) {
                            bVar4.L(57818121);
                            bVar4.F();
                            fr9Var = this;
                        } else {
                            bVar4.L(57818122);
                            bj1 bj1VarF2 = bj1Var;
                            if (bj1VarF2 == null) {
                                bj1VarF2 = ee3.f(aVar6.c.a, 1.0f);
                            }
                            fgd fgdVarA2 = ggd.a(o97Var3.h.b);
                            ux1 ux1VarD2 = wx1.d(aVar6.b.a, bVar4);
                            e eVarN = g.n(aVar4, 40.0f);
                            o97Var3 = o97Var3;
                            fr9Var = this;
                            aVar4 = aVar4;
                            ay1.d(eVarN, fgdVarA2, ux1VarD2, null, bj1VarF2, bh2.c(1296716281, new mp0(wu5Var5, 1), bVar4), bVar4, 196614, 8);
                            bVar4 = bVar4;
                            j6g j6gVar = j6g.a;
                            bVar4.F();
                        }
                        ob2 ob2VarA2 = mb2.a(vs0.c, aVar7, bVar4, 0);
                        int iHashCode4 = Long.hashCode(bVar4.k());
                        t8b t8bVarM4 = bVar4.m();
                        e eVarC4 = androidx.compose.ui.c.c(bVar4, aVar4);
                        if (bVar4.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar4.B();
                        if (bVar4.f()) {
                            bVar4.y(aVar2);
                        } else {
                            bVar4.n();
                        }
                        ygg.y(bVar4, ob2VarA2, dVar4);
                        ygg.y(bVar4, t8bVarM4, fVar2);
                        if (bVar4.f() || !wl7.b(bVar4.v(), Integer.valueOf(iHashCode4))) {
                            uz.g(iHashCode4, bVar4, iHashCode4, c0251a);
                        }
                        ygg.y(bVar4, eVarC4, eVar6);
                        ehd ehdVarA3 = chd.a(jVar, bVar3, bVar4, 48);
                        int iHashCode5 = Long.hashCode(bVar4.k());
                        t8b t8bVarM5 = bVar4.m();
                        e eVarC5 = androidx.compose.ui.c.c(bVar4, aVar4);
                        if (bVar4.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar4.B();
                        if (bVar4.f()) {
                            bVar4.y(aVar2);
                        } else {
                            bVar4.n();
                        }
                        ygg.y(bVar4, ehdVarA3, dVar4);
                        ygg.y(bVar4, t8bVarM5, fVar2);
                        if (bVar4.f() || !wl7.b(bVar4.v(), Integer.valueOf(iHashCode5))) {
                            uz.g(iHashCode5, bVar4, iHashCode5, c0251a);
                        }
                        ygg.y(bVar4, eVarC5, eVar6);
                        String str8 = str2;
                        if (str8 == null) {
                            bVar4.L(-70277582);
                            bVar4.F();
                            aVar3 = aVar2;
                            dVar = dVar4;
                            fVar = fVar2;
                            c0251a2 = c0251a;
                            eVar2 = eVar6;
                            tjfVar3 = tjfVar5;
                            dVar2 = dVar5;
                        } else {
                            bVar4.L(-70277581);
                            e.a aVar8 = aVar4;
                            b bVar5 = bVar4;
                            aVar3 = aVar2;
                            aVar4 = aVar8;
                            tjfVar3 = tjfVar5;
                            c0251a2 = c0251a;
                            dVar = dVar4;
                            fVar = fVar2;
                            eVar2 = eVar6;
                            dVar2 = dVar5;
                            cif.b(str8, androidx.compose.foundation.layout.f.j(aVar8, 0.0f, 0.0f, 8.0f, 0.0f, 11), 0L, 0L, null, null, dVar5.a, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar3, bVar5, 0, 0, 65468);
                            bVar4 = bVar5;
                            j6g j6gVar2 = j6g.a;
                            bVar4.F();
                        }
                        Float f2 = f;
                        if (f2 == null) {
                            bVar4.L(-69848976);
                            bVar4.F();
                            tjfVar4 = tjfVar3;
                            eVar3 = eVar7;
                        } else {
                            bVar4.L(-69848975);
                            tjfVar4 = tjfVar3;
                            b bVar6 = bVar4;
                            cif.b(f2.toString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(tjfVar4, 0L, 0L, to5.d0, null, null, 0L, 0, 0L, null, null, 0, 16777211), bVar6, 0, 0, 65534);
                            eVar3 = eVar7;
                            bVar4 = bVar6;
                            ev6.b(fv6.o9, h4.w(aVar4, 0.56f), null, zq6.Xs, eVar3.a, null, bVar4, 3126, 36);
                            j6g j6gVar3 = j6g.a;
                            bVar4.F();
                        }
                        bVar4.q();
                        String str9 = str3;
                        if (str9 == null) {
                            bVar4.L(306635837);
                            bVar4.F();
                            eVar4 = eVar3;
                        } else {
                            bVar4.L(306635838);
                            b bVar7 = bVar4;
                            eVar4 = eVar3;
                            cif.b(str9, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar4, bVar7, 0, 0, 65534);
                            bVar4 = bVar7;
                            j6g j6gVar4 = j6g.a;
                            bVar4.F();
                        }
                        bVar4.q();
                        bVar4.q();
                        String str10 = str4;
                        if (str10 == null) {
                            bVar4.L(-1249862814);
                            bVar4.F();
                            dVar3 = dVar2;
                        } else {
                            bVar4.L(-1249862813);
                            ehd ehdVarA4 = chd.a(vs0.e(4.0f), c20.a.l, bVar4, 48);
                            int iHashCode6 = Long.hashCode(bVar4.k());
                            t8b t8bVarM6 = bVar4.m();
                            e eVarC6 = androidx.compose.ui.c.c(bVar4, aVar4);
                            if (bVar4.j() == null) {
                                pg8.B();
                                throw null;
                            }
                            bVar4.B();
                            if (bVar4.f()) {
                                bVar4.y(aVar3);
                            } else {
                                bVar4.n();
                            }
                            ygg.y(bVar4, ehdVarA4, dVar);
                            ygg.y(bVar4, t8bVarM6, fVar);
                            if (bVar4.f() || !wl7.b(bVar4.v(), Integer.valueOf(iHashCode6))) {
                                uz.g(iHashCode6, bVar4, iHashCode6, c0251a2);
                            }
                            ygg.y(bVar4, eVarC6, eVar2);
                            dVar3 = dVar2;
                            b bVar8 = bVar4;
                            cif.b(str10, null, 0L, 0L, null, null, dVar3.a, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar6, bVar8, 0, 0, 65470);
                            bVar4 = bVar8;
                            String str11 = str5;
                            if (str11 == null) {
                                bVar4.L(-1630105951);
                            } else {
                                bVar4.L(-1630105950);
                                cif.b(str11, null, 0L, 0L, null, null, dVar3.a, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar4, bVar4, 0, 0, 65470);
                                bVar4 = bVar4;
                                j6g j6gVar5 = j6g.a;
                            }
                            bVar4.F();
                            bVar4.q();
                            j6g j6gVar6 = j6g.a;
                            bVar4.F();
                        }
                        List list6 = list5;
                        if (list6.isEmpty()) {
                            bVar4.L(-1260584566);
                        } else {
                            bVar4.L(-1249176659);
                            zk5.a(null, vs0.e(4.0f), vs0.e(4.0f), null, 0, 0, bh2.c(1787009496, new n1c(2, list6, o97Var3), bVar4), bVar4, 1572864, 57);
                        }
                        bVar4.F();
                        List list7 = list2;
                        if (list7.isEmpty()) {
                            bVar4.L(-1260584566);
                        } else {
                            bVar4.L(-1248472215);
                            zk5.a(null, vs0.e(4.0f), vs0.e(4.0f), null, 0, 0, bh2.c(-1381225215, new gr9(list7, 0), bVar4), bVar4, 1572864, 57);
                        }
                        bVar4.F();
                        wu5Var4.q(qb2.a, bVar4, 6);
                        String str12 = str6;
                        if (str12 == null) {
                            bVar4.L(-1248008363);
                            bVar4.F();
                            eVar5 = eVar4;
                        } else {
                            bVar4.L(-1248008362);
                            tjf tjfVar7 = hVar2.h;
                            pn5 pn5Var2 = dVar3.a;
                            eVar5 = eVar4;
                            b bVar9 = bVar4;
                            cif.b(str12, null, eVar5.b, 0L, null, null, pn5Var2, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar7, bVar9, 0, 0, 65466);
                            bVar4 = bVar9;
                            j6g j6gVar7 = j6g.a;
                            bVar4.F();
                        }
                        bVar4.q();
                        if (z) {
                            bVar4.L(-1371910036);
                            ev6.b(fv6.I1, null, null, zq6.Md, eVar5.a, null, bVar4, 3078, 38);
                        } else {
                            bVar4.L(-1384804300);
                        }
                        bVar4.F();
                        bVar4.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVar), cVar, ((i2 >> 3) & 14) | 100663344, 164);
            fgdVar2 = fgdVar4;
        } else {
            cVar = cVarH;
            cVar.D();
            list3 = list;
            wu5Var3 = wu5Var2;
            fgdVar2 = fgdVar;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new vm4(str, z, str2, f, str3, wu5Var, str4, str5, str6, list3, list2, gu5Var, wu5Var3, bj1Var, fgdVar2, eVar, i);
        }
    }
}
