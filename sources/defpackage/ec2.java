package defpackage;

import androidx.compose.animation.i;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jsmappservices.bridge.SearchType;
import defpackage.af1;
import defpackage.azg;
import defpackage.c20;
import defpackage.gl2;
import defpackage.lyg;
import defpackage.o97;
import defpackage.pm8;
import defpackage.rsc;
import defpackage.vs0;
import defpackage.ytc;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class ec2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final SearchType searchType, final String str, final lyg lygVar, final kyg kygVar, final String str2, final azg azgVar, final zyg zygVar, final String str3, final rsc rscVar, boolean z, final boolean z2, final Function1 function1, final Function1 function12, final Function1 function13, final Function1 function14, final Function1 function15, final gu5 gu5Var, gu5 gu5Var2, final gu5 gu5Var3, final gu5 gu5Var4, final gu5 gu5Var5, final Function2 function2, final Function1 function16, final gu5 gu5Var6, final gu5 gu5Var7, final gu5 gu5Var8, b bVar, final int i) {
        final boolean z3;
        final gu5 gu5Var9;
        e.a aVar;
        c cVar;
        o97 o97Var;
        b.a.C0020a c0020a;
        boolean zBooleanValue;
        searchType.getClass();
        str.getClass();
        lygVar.getClass();
        str2.getClass();
        zygVar.getClass();
        rscVar.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        function14.getClass();
        function15.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        gu5Var4.getClass();
        gu5Var5.getClass();
        function2.getClass();
        function16.getClass();
        c cVarH = bVar.h(11386317);
        int i2 = i | (cVarH.d(searchType.ordinal()) ? 4 : 2) | (cVarH.K(str) ? 32 : 16) | (cVarH.K(lygVar) ? 256 : 128) | (cVarH.d(kygVar.ordinal()) ? 2048 : 1024) | (cVarH.K(str2) ? 16384 : 8192) | (cVarH.K(azgVar) ? 131072 : 65536) | (cVarH.d(zygVar.ordinal()) ? 1048576 : 524288) | (cVarH.K(str3) ? 8388608 : 4194304) | (cVarH.K(rscVar) ? 67108864 : 33554432) | (cVarH.a(z) ? 536870912 : 268435456);
        int i3 = (cVarH.a(z2) ? 4 : 2) | (cVarH.x(function1) ? 32 : 16) | (cVarH.x(function12) ? 256 : 128) | (cVarH.x(function13) ? 2048 : 1024) | (cVarH.x(function14) ? 16384 : 8192) | (cVarH.x(function15) ? 131072 : 65536) | (cVarH.x(gu5Var) ? 1048576 : 524288) | (cVarH.x(gu5Var2) ? 8388608 : 4194304) | (cVarH.x(gu5Var3) ? 67108864 : 33554432) | (cVarH.x(gu5Var4) ? 536870912 : 268435456);
        if (cVarH.o(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 306783379) == 306783378 && (74899 & ((((((cVarH.x(gu5Var5) ? (char) 4 : (char) 2) | (cVarH.x(function2) ? ' ' : (char) 16)) | (cVarH.x(function16) ? (char) 256 : (char) 128)) | (cVarH.x(gu5Var6) ? (char) 2048 : (char) 1024)) | (cVarH.x(gu5Var7) ? (char) 16384 : (char) 8192)) | (cVarH.x(gu5Var8) ? (char) 0 : (char) 0))) == 74898) ? false : true)) {
            o97 o97Var2 = (o97) cVarH.M(p97.a);
            String strI = ak2.I(R.string.error_icon_content_description, cVarH);
            Object objV = cVarH.v();
            b.a.C0020a c0020a2 = b.a.a;
            if (objV == c0020a2) {
                objV = r.f(Boolean.FALSE);
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a2) {
                objV2 = r.f(Boolean.FALSE);
                cVarH.p(objV2);
            }
            g4a g4aVar2 = (g4a) objV2;
            boolean z4 = azgVar instanceof azg.a;
            boolean z5 = (z4 || (azgVar instanceof azg.e) || (azgVar instanceof azg.c) || (azgVar instanceof azg.b)) ? false : true;
            boolean z6 = (z4 || (azgVar instanceof azg.e) || (azgVar instanceof azg.j) || (azgVar instanceof azg.i)) ? false : true;
            boolean z7 = (lygVar instanceof lyg.b) || (lygVar instanceof lyg.a);
            boolean z8 = (azgVar instanceof azg.d) || (azgVar instanceof azg.c);
            boolean z9 = rscVar instanceof rsc.a;
            Boolean boolValueOf = Boolean.valueOf(z7);
            Boolean boolValueOf2 = Boolean.valueOf(z9);
            boolean zA = cVarH.a(z7) | cVarH.a(z9);
            Object objV3 = cVarH.v();
            if (zA || objV3 == c0020a2) {
                objV3 = new cc2(z7, z9, g4aVar, null);
                cVarH.p(objV3);
            }
            to4.f(boolValueOf, boolValueOf2, (Function2) objV3, cVarH);
            Boolean boolValueOf3 = Boolean.valueOf(z8);
            boolean zA2 = cVarH.a(z8);
            Object objV4 = cVarH.v();
            if (zA2 || objV4 == c0020a2) {
                objV4 = new dc2(z8, g4aVar2, null);
                cVarH.p(objV4);
            }
            to4.d(cVarH, boolValueOf3, (Function2) objV4);
            Object objV5 = cVarH.v();
            if (objV5 == c0020a2) {
                objV5 = new tb(3);
                cVarH.p(objV5);
            }
            e.a aVar2 = e.a.b;
            e eVarD = g.d(b5e.b(aVar2, false, (Function1) objV5), 1.0f);
            Object objV6 = cVarH.v();
            if (objV6 == c0020a2) {
                objV6 = v40.a(cVarH);
            }
            d3a d3aVar = (d3a) objV6;
            Object objV7 = cVarH.v();
            if (objV7 == c0020a2) {
                objV7 = new vm1(1);
                cVarH.p(objV7);
            }
            e eVarB = androidx.compose.foundation.b.b(eVarD, d3aVar, null, false, null, null, (gu5) objV7, 28);
            o97.a aVar3 = o97Var2.c;
            o97.a aVar4 = o97Var2.c;
            long j = aVar3.b.a;
            ytc.a aVar5 = ytc.a;
            e eVarB2 = a.b(eVarB, j, aVar5);
            vs0.k kVar = vs0.c;
            af1.a aVar6 = c20.a.m;
            ob2 ob2VarA = mb2.a(kVar, aVar6, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.k());
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarB2);
            gl2.j.getClass();
            pm8.a aVar7 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar7);
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
            e eVarB3 = a.b(f.j(g.d(aVar2, 1.0f), 8.0f, 8.0f, 0.0f, 0.0f, 12), aVar4.b.a, aVar5);
            qb2 qb2Var = qb2.a;
            e eVarA = qb2Var.a(eVarB3, false);
            ob2 ob2VarA2 = mb2.a(kVar, aVar6, cVarH, 0);
            int iHashCode2 = Long.hashCode(cVarH.k());
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarA);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar7);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA2, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar);
            ehd ehdVarA = chd.a(vs0.a, c20.a.j, cVarH, 0);
            int iHashCode3 = Long.hashCode(cVarH.k());
            t8b t8bVarP3 = cVarH.P();
            e eVarC3 = androidx.compose.ui.c.c(cVarH, aVar2);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar7);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, dVar);
            ygg.y(cVarH, t8bVarP3, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode3))) {
                ja.h(iHashCode3, cVarH, iHashCode3, c0251a);
            }
            ygg.y(cVarH, eVarC3, eVar);
            e eVarJ = f.j(aVar2, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            ob2 ob2VarA3 = mb2.a(kVar, aVar6, cVarH, 0);
            int iHashCode4 = Long.hashCode(cVarH.k());
            t8b t8bVarP4 = cVarH.P();
            e eVarC4 = androidx.compose.ui.c.c(cVarH, eVarJ);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar7);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA3, dVar);
            ygg.y(cVarH, t8bVarP4, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode4))) {
                ja.h(iHashCode4, cVarH, iHashCode4, c0251a);
            }
            ygg.y(cVarH, eVarC4, eVar);
            gt6.o(fv6.o0, gu5Var3, null, ak2.I(R.string.close, cVarH), null, "SearchOverlayTopBarBackButton", cVarH, ((i3 >> 21) & 112) | 12582918, 116);
            c cVar2 = cVarH;
            cVar2.U(true);
            e eVarJ2 = f.j(aVar2, 0.0f, 8.0f, 16.0f, 8.0f, 1);
            ob2 ob2VarA4 = mb2.a(kVar, aVar6, cVar2, 0);
            int iHashCode5 = Long.hashCode(cVar2.k());
            t8b t8bVarP5 = cVar2.P();
            e eVarC5 = androidx.compose.ui.c.c(cVar2, eVarJ2);
            cVar2.B();
            if (cVar2.S) {
                cVar2.y(aVar7);
            } else {
                cVar2.n();
            }
            ygg.y(cVar2, ob2VarA4, dVar);
            ygg.y(cVar2, t8bVarP5, fVar);
            if (cVar2.S || !wl7.b(cVar2.v(), Integer.valueOf(iHashCode5))) {
                ja.h(iHashCode5, cVar2, iHashCode5, c0251a);
            }
            ygg.y(cVar2, eVarC5, eVar);
            if (z5) {
                cVar2.L(477706329);
                int i4 = i3 << 9;
                aVar = aVar2;
                wtd.a(searchType, str, str2, ak2.I(R.string.search_overlay_clear_contents, cVar2), function1, function13, gu5Var, gu5Var2, function15, new fh8((Boolean) null, 0, 3, 119), !z, "CombinedSearchOverlayTextInput", cVar2, (i2 & 14) | 805306368 | (i2 & 112) | ((i2 >> 6) & 896) | (57344 & i4) | ((i3 << 6) & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i4 & 234881024), 2048);
                cVar2 = cVar2;
                cVar2.U(false);
            } else {
                aVar = aVar2;
                cVar2.L(478600059);
                jh2.f(cVar2, g.h(aVar, 48.0f));
                cVar2.U(false);
            }
            cVar2.U(true);
            cVar2.U(true);
            if (z) {
                cVar = cVar2;
                o97Var = o97Var2;
                c0020a = c0020a2;
                cVar.L(1063831937);
            } else {
                cVar2.L(1071885954);
                e.a aVar8 = aVar;
                e eVarJ3 = f.j(aVar8, 8.0f, 4.0f, 0.0f, 0.0f, 12);
                ehd ehdVarA2 = chd.a(new vs0.i(4.0f, true, new us0(0)), c20.a.k, cVar2, 48);
                int iHashCode6 = Long.hashCode(cVar2.k());
                t8b t8bVarP6 = cVar2.P();
                e eVarC6 = androidx.compose.ui.c.c(cVar2, eVarJ3);
                cVar2.B();
                if (cVar2.S) {
                    cVar2.y(aVar7);
                } else {
                    cVar2.n();
                }
                ygg.y(cVar2, ehdVarA2, dVar);
                ygg.y(cVar2, t8bVarP6, fVar);
                if (cVar2.S || !wl7.b(cVar2.v(), Integer.valueOf(iHashCode6))) {
                    ja.h(iHashCode6, cVar2, iHashCode6, c0251a);
                }
                ygg.y(cVar2, eVarC6, eVar);
                fv6 fv6Var = fv6.o3;
                long j2 = aVar4.a.h.c.a;
                e eVarJ4 = f.j(aVar8, 12.0f, 0.0f, 0.0f, 0.0f, 14);
                boolean zK = cVar2.K(strI);
                Object objV8 = cVar2.v();
                if (zK) {
                    c0020a = c0020a2;
                } else {
                    c0020a = c0020a2;
                    if (objV8 == c0020a) {
                    }
                    c cVar3 = cVar2;
                    ev6.b(fv6Var, b5e.b(eVarJ4, false, (Function1) objV8), null, zq6.Sm, j2, null, cVar3, 3078, 36);
                    o97Var = o97Var2;
                    cif.b(ak2.I(R.string.search_overlay_add_a_valid_search_term, cVar3), f.j(aVar8, 4.0f, 0.0f, 0.0f, 0.0f, 14), aVar4.a.h.c.a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.g, cVar3, 0, 0, 65528);
                    cVar = cVar3;
                    cVar.U(true);
                }
                objV8 = new ir(strI, 2);
                cVar2.p(objV8);
                c cVar32 = cVar2;
                ev6.b(fv6Var, b5e.b(eVarJ4, false, (Function1) objV8), null, zq6.Sm, j2, null, cVar32, 3078, 36);
                o97Var = o97Var2;
                cif.b(ak2.I(R.string.search_overlay_add_a_valid_search_term, cVar32), f.j(aVar8, 4.0f, 0.0f, 0.0f, 0.0f, 14), aVar4.a.h.c.a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.g, cVar32, 0, 0, 65528);
                cVar = cVar32;
                cVar.U(true);
            }
            cVar.U(false);
            int iOrdinal = searchType.ordinal();
            if (iOrdinal == 0) {
                zBooleanValue = ((Boolean) g4aVar.getValue()).booleanValue();
            } else {
                if (iOrdinal != 1) {
                    l.g();
                    return;
                }
                zBooleanValue = ((Boolean) g4aVar2.getValue()).booleanValue();
            }
            boolean z10 = zBooleanValue;
            mv4 mv4VarD = ku4.d(null, 3);
            Object objV9 = cVar.v();
            if (objV9 == c0020a) {
                objV9 = new li(3);
                cVar.p(objV9);
            }
            mv4 mv4VarB = mv4VarD.b(ku4.k((Function1) objV9, 1));
            s25 s25VarE = ku4.e(null, 3);
            Object objV10 = cVar.v();
            if (objV10 == c0020a) {
                objV10 = new li(3);
                cVar.p(objV10);
            }
            final o97 o97Var3 = o97Var;
            b.a.C0020a c0020a3 = c0020a;
            final boolean z11 = z6;
            cVarH = cVar;
            i.b(qb2Var, z10, null, mv4VarB, s25VarE.b(ku4.m((Function1) objV10, 1)), null, bh2.c(1882041993, new wu5() { // from class: bc2
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    b bVar2 = (b) obj2;
                    ((Integer) obj3).getClass();
                    ((qd0) obj).getClass();
                    e eVarF = g.f(e.a.b, 1.0f);
                    ob2 ob2VarA5 = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                    int iHashCode7 = Long.hashCode(bVar2.k());
                    t8b t8bVarM = bVar2.m();
                    e eVarC7 = androidx.compose.ui.c.c(bVar2, eVarF);
                    gl2.j.getClass();
                    pm8.a aVar9 = gl2.a.b;
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar9);
                    } else {
                        bVar2.n();
                    }
                    ygg.y(bVar2, ob2VarA5, gl2.a.g);
                    ygg.y(bVar2, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a2 = gl2.a.j;
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode7))) {
                        uz.g(iHashCode7, bVar2, iHashCode7, c0251a2);
                    }
                    ygg.y(bVar2, eVarC7, gl2.a.d);
                    int iOrdinal2 = searchType.ordinal();
                    if (iOrdinal2 == 0) {
                        bVar2.L(135094914);
                        jyg.e(kygVar, rscVar, lygVar, str, function12, gu5Var5, function2, function16, gu5Var4, "WhatSuggestions", bVar2, 805306368);
                        bVar2.F();
                    } else {
                        if (iOrdinal2 != 1) {
                            bVar2.L(-411285144);
                            bVar2.F();
                            l.g();
                            return null;
                        }
                        bVar2.L(135977577);
                        yyg.f(zygVar, azgVar, str2, str3, z11, gu5Var6, gu5Var, function14, gu5Var7, gu5Var8, bVar2, 0);
                        bVar2.F();
                    }
                    bVar2.q();
                    return j6g.a;
                }
            }, cVarH), cVarH, 1600518, 18);
            cVarH.U(true);
            Object objV11 = cVarH.v();
            if (objV11 == c0020a3) {
                objV11 = new kd(9);
                cVarH.p(objV11);
            }
            mv4 mv4VarK = ku4.k((Function1) objV11, 1);
            Object objV12 = cVarH.v();
            if (objV12 == c0020a3) {
                objV12 = new kd(9);
                cVarH.p(objV12);
            }
            z3 = z;
            gu5Var9 = gu5Var2;
            i.b(qb2Var, z2, null, mv4VarK, ku4.m((Function1) objV12, 1), null, bh2.c(1253308607, new wu5(gu5Var9, o97Var3, z3) { // from class: zb2
                public final /* synthetic */ boolean a;
                public final /* synthetic */ gu5 b;

                {
                    this.a = z3;
                }

                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    b bVar2 = (b) obj2;
                    ((Integer) obj3).getClass();
                    ((qd0) obj).getClass();
                    gt6.h(ak2.I(R.string.search_overlay_search_button_text, bVar2), this.b, f.f(g.f(e.a.b, 1.0f), 4.0f), null, !this.a, false, fv6.C8, null, "SearchOverlaySearchButton", bVar2, 102236160, 168);
                    return j6g.a;
                }
            }, cVarH), cVarH, 1600518 | ((i3 << 3) & 112), 18);
            cVarH.U(true);
        } else {
            z3 = z;
            gu5Var9 = gu5Var2;
            cVarH.D();
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            final boolean z12 = z3;
            final gu5 gu5Var10 = gu5Var9;
            iVarW.d = new Function2(str, lygVar, kygVar, str2, azgVar, zygVar, str3, rscVar, z12, z2, function1, function12, function13, function14, function15, gu5Var, gu5Var10, gu5Var3, gu5Var4, gu5Var5, function2, function16, gu5Var6, gu5Var7, gu5Var8, i) { // from class: ac2
                public final /* synthetic */ zyg V;
                public final /* synthetic */ String W;
                public final /* synthetic */ rsc X;
                public final /* synthetic */ boolean Y;
                public final /* synthetic */ boolean Z;
                public final /* synthetic */ Function1 a0;
                public final /* synthetic */ String b;
                public final /* synthetic */ Function1 b0;
                public final /* synthetic */ lyg c;
                public final /* synthetic */ Function1 c0;
                public final /* synthetic */ kyg d;
                public final /* synthetic */ Function1 d0;
                public final /* synthetic */ String e;
                public final /* synthetic */ Function1 e0;
                public final /* synthetic */ azg f;
                public final /* synthetic */ gu5 f0;
                public final /* synthetic */ gu5 g0;
                public final /* synthetic */ gu5 h0;
                public final /* synthetic */ gu5 i0;
                public final /* synthetic */ gu5 j0;
                public final /* synthetic */ Function2 k0;
                public final /* synthetic */ Function1 l0;
                public final /* synthetic */ gu5 m0;
                public final /* synthetic */ gu5 n0;
                public final /* synthetic */ gu5 o0;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    ec2.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X, this.Y, this.Z, this.a0, this.b0, this.c0, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, this.n0, this.o0, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
