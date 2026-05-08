package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.lyg;
import defpackage.o97;
import defpackage.pm8;
import defpackage.rsc;
import defpackage.vs0;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class jyg {
    public static final List<zye> a = u63.a0(new zye(0, 0, "work from home"), new zye(0, 0, "part time"), new zye(0, 0, "hiring immediately"), new zye(0, 0, "remote"), new zye(0, 0, "initial suggestion 1"), new zye(0, 0, "initial suggestion 2"), new zye(0, 0, "initial suggestion 3"), new zye(0, 0, "initial suggestion 4"), new zye(0, 0, "initial suggestion 5"), new zye(0, 0, "initial suggestion 6"), new zye(0, 0, "initial suggestion 7"), new zye(0, 0, "initial suggestion 8"));
    public static final List<zye> b = u63.a0(new zye(0, 2, "nurse practitioner"), new zye(0, 2, "nursing home"), new zye(0, 2, "nursing assistant"), new zye(0, 2, "nurse manager"), new zye(0, 0, "found suggestion 1"), new zye(0, 0, "found suggestion 2"), new zye(0, 0, "found suggestion 3"), new zye(0, 0, "found suggestion 4"), new zye(0, 0, "found suggestion 5"), new zye(0, 0, "found suggestion 6"), new zye(0, 0, "found suggestion 7"), new zye(0, 0, "found suggestion 8"), new zye(0, 0, "found suggestion 9"), new zye(0, 0, "found suggestion 10"), new zye(0, 0, "found suggestion 11"), new zye(0, 0, "found suggestion 12"), new zye(0, 0, "found suggestion 13"), new zye(0, 0, "found suggestion 14"), new zye(0, 0, "found suggestion 15"), new zye(0, 0, "found suggestion 16"));

    static {
        List listA0 = u63.a0(new lsc("1", new jud("nurse", "Washington, DC"), 0L, (Integer) 64, 16), new lsc("2", new jud("customer service representative", "Washington, DC"), 0L, (Integer) null, 24), new lsc("3", new jud("", "Washington, DC"), 0L, (Integer) 2000, 16), new lsc("4", new jud("", "Washington, DC"), 0L, (Integer) null, 24), new lsc("5", new jud("recent search 1", ""), 0L, (Integer) 1, 16), new lsc("6", new jud("recent search 2", ""), 0L, (Integer) null, 24), new lsc("7", new jud("recent search 3", "Washington, DC"), 0L, (Integer) 3, 16), new lsc("8", new jud("recent search 4", "Washington, DC"), 0L, (Integer) 4, 16), new lsc("9", new jud("recent search 5", "Washington, DC"), 0L, (Integer) 5, 16), new lsc("10", new jud("recent search 6", "Washington, DC"), 0L, (Integer) 6, 16), new lsc("11", new jud("recent search 7", "Washington, DC"), 0L, (Integer) 7, 16), new lsc("12", new jud("recent search 8", "Washington, DC"), 0L, (Integer) 8, 16), new lsc("13", new jud("recent search 9", "Washington, DC"), 0L, (Integer) 9, 16), new lsc("14", new jud("recent search 10", "Washington, DC"), 0L, (Integer) 10, 16));
        int iV = kc9.V(t92.r0(listA0, 10));
        if (iV < 16) {
            iV = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iV);
        for (Object obj : listA0) {
            linkedHashMap.put(((lsc) obj).a, obj);
        }
        List listA02 = u63.a0(new lsc("15", new jud("nurse", "Washington, DC"), 0L, (Integer) 64, true), new lsc("16", new jud("product manager", "Washington, DC"), 0L, (Integer) 76, true), new lsc("17", new jud("Sales", "Washington, DC"), 0L, (Integer) 2000, 16));
        int iV2 = kc9.V(t92.r0(listA02, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iV2 >= 16 ? iV2 : 16);
        for (Object obj2 : listA02) {
            linkedHashMap2.put(((lsc) obj2).a, obj2);
        }
    }

    public static final void a(Integer num, String str, String str2, String str3, b bVar, int i) {
        c cVar;
        int i2;
        e.a aVar;
        boolean z;
        c cVarH = bVar.h(-1278791221);
        int i3 = i | (cVarH.K(num) ? 4 : 2) | (cVarH.K(str) ? 32 : 16) | (cVarH.K(str2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.K(str3) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i3 & 1, (i3 & 1171) != 1170)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            ehd ehdVarA = chd.a(vs0.a, c20.a.j, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e.a aVar2 = e.a.b;
            e eVarC = androidx.compose.ui.c.c(cVarH, aVar2);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
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
            if (num == null) {
                cVarH.L(-265343283);
                cVarH.U(false);
                cVar = cVarH;
                z = false;
                i2 = 1;
                aVar = aVar2;
            } else {
                cVarH.L(-265343282);
                i2 = 1;
                aVar = aVar2;
                z = false;
                cif.b(String.format(ak2.I(R.string.search_overlay_new_jobs_what, cVarH), Arrays.copyOf(new Object[]{Integer.valueOf(num.intValue())}, 1)), f.a(aVar2, str3.concat("NewJobs")), o97Var.c.a.e, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.h, cVarH, 0, 0, 65528);
                cVar = cVarH;
                cVar.U(false);
            }
            if ((!zve.U(str)) && (!zve.U(str2))) {
                cVar.L(-264987619);
                c cVar2 = cVar;
                cif.b(" ".concat(String.format(ak2.I(R.string.search_overlay_new_jobs_where, cVar), Arrays.copyOf(new Object[]{str2}, i2))), f.a(aVar, str3.concat("Where")), o97Var.c.a.a, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, o97Var.j.h, cVar2, 0, 3120, 55288);
                cVar = cVar2;
            } else {
                cVar.L(-279342789);
            }
            cVar.U(z);
            cVar.U(true);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new fu9(num, str, str2, str3, i);
        }
    }

    public static final void b(lsc lscVar, gu5<j6g> gu5Var, gu5<j6g> gu5Var2, String str, b bVar, int i) {
        c cVarH = bVar.h(1204015784);
        int i2 = i | (cVarH.x(lscVar) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.K(str) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar = e.a.b;
            e eVarF = g.f(aVar, 1.0f);
            o97.g gVar = o97Var.i;
            e eVarJ = androidx.compose.foundation.layout.f.j(eVarF, 16.0f, 16.0f, 0.0f, 0.0f, 12);
            boolean z = (i2 & 112) == 32;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new wc(9, gu5Var);
                cVarH.p(objV);
            }
            e eVarA = f.a(androidx.compose.foundation.b.d(eVarJ, false, null, null, (gu5) objV, 15), str);
            ehd ehdVarA = chd.a(vs0.a, c20.a.j, cVarH, 0);
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
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ehdVarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            ev6.b(fv6.I7, null, null, null, 0L, null, cVarH, 6, 62);
            e eVarJ2 = androidx.compose.foundation.layout.f.j(new LayoutWeightElement(1.0f, true), 8.0f, 0.0f, 0.0f, 0.0f, 14);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarJ2);
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
            e eVarA2 = f.a(aVar, str.concat("FirstLine"));
            jud judVar = lscVar.b;
            String str2 = judVar.a;
            if (zve.U(str2)) {
                str2 = judVar.b;
            }
            cif.b(str2, eVarA2, 0L, 0L, null, to5.d0, null, 0L, null, null, 0L, 2, false, 1, 0, null, o97Var.j.f, cVarH, 196608, 3120, 55260);
            a(lscVar.d, judVar.a, judVar.b, str, cVarH, i2 & 7168);
            cVarH = cVarH;
            cVarH.U(true);
            e eVarD = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.f.j(aVar, 0.0f, 0.0f, 12.0f, 0.0f, 11).o(new VerticalAlignElement(c20.a.k)), false, null, null, gu5Var2, 15);
            ev6.a(fv6.W1, eVarD, ar6.Stroke, zq6.Md, o97Var.c.a.b, ak2.I(R.string.search_overlay_delete_recent_search_desc, cVarH), str.concat("DeleteButton"), cVarH, 3462, 0);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ktd(lscVar, gu5Var, gu5Var2, str, i);
        }
    }

    public static final void c(final String str, final kyg kygVar, final lyg lygVar, final rsc rscVar, final boolean z, final boolean z2, final Function1 function1, final gu5 gu5Var, final gu5 gu5Var2, final gu5 gu5Var3, final gu5 gu5Var4, final gu5 gu5Var5, final Function1 function12, final Function2 function2, final Function1 function13, b bVar, final int i) {
        str.getClass();
        lygVar.getClass();
        rscVar.getClass();
        function1.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        gu5Var4.getClass();
        gu5Var5.getClass();
        function12.getClass();
        function2.getClass();
        function13.getClass();
        c cVarH = bVar.h(1346608876);
        int i2 = i | (cVarH.K(str) ? 4 : 2) | (cVarH.d(kygVar.ordinal()) ? 32 : 16) | (cVarH.K(lygVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.K(rscVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.a(z) ? 16384 : 8192) | (cVarH.a(z2) ? 131072 : 65536) | (cVarH.x(function1) ? 1048576 : 524288) | (cVarH.x(gu5Var) ? 8388608 : 4194304) | (cVarH.x(gu5Var2) ? 67108864 : 33554432) | (cVarH.x(gu5Var3) ? 536870912 : 268435456);
        if (cVarH.o(i2 & 1, ((i2 & 306783379) == 306783378 && ((((((cVarH.x(gu5Var4) ? (char) 4 : (char) 2) | (cVarH.x(gu5Var5) ? ' ' : (char) 16)) | (cVarH.x(function12) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT)) | (cVarH.x(function2) ? (char) 2048 : (char) 1024)) | (cVarH.x(function13) ? (char) 16384 : (char) 8192)) & 9363) == 9362) ? false : true)) {
            final o97 o97Var = (o97) cVarH.M(p97.a);
            final String strI = ak2.I(R.string.error_icon_content_description, cVarH);
            ah2 ah2VarC = bh2.c(719675749, new wu5() { // from class: yxg
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    gl2.a.C0251a c0251a;
                    yxg yxgVar;
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((pb2) obj).getClass();
                    int i3 = 0;
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        ehd ehdVarA = chd.a(vs0.a, c20.a.l, bVar2, 48);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e.a aVar = e.a.b;
                        e eVarC = androidx.compose.ui.c.c(bVar2, aVar);
                        gl2.j.getClass();
                        pm8.a aVar2 = gl2.a.b;
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar2);
                        } else {
                            bVar2.n();
                        }
                        gl2.a.d dVar = gl2.a.g;
                        ygg.y(bVar2, ehdVarA, dVar);
                        gl2.a.f fVar = gl2.a.f;
                        ygg.y(bVar2, t8bVarM, fVar);
                        gl2.a.C0251a c0251a2 = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a2);
                        }
                        gl2.a.e eVar = gl2.a.d;
                        ygg.y(bVar2, eVarC, eVar);
                        vs0.k kVar = vs0.c;
                        af1.a aVar3 = c20.a.m;
                        ob2 ob2VarA = mb2.a(kVar, aVar3, bVar2, 0);
                        int iHashCode2 = Long.hashCode(bVar2.k());
                        t8b t8bVarM2 = bVar2.m();
                        e eVarC2 = androidx.compose.ui.c.c(bVar2, aVar);
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar2);
                        } else {
                            bVar2.n();
                        }
                        ygg.y(bVar2, ob2VarA, dVar);
                        ygg.y(bVar2, t8bVarM2, fVar);
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                            uz.g(iHashCode2, bVar2, iHashCode2, c0251a2);
                        }
                        ygg.y(bVar2, eVarC2, eVar);
                        gt6.o(fv6.o0, gu5Var3, null, ak2.I(R.string.close, bVar2), null, "SearchOverlayTopBarBackButton", bVar2, 12582918, 116);
                        bVar2.q();
                        ob2 ob2VarA2 = mb2.a(kVar, aVar3, bVar2, 0);
                        int iHashCode3 = Long.hashCode(bVar2.k());
                        t8b t8bVarM3 = bVar2.m();
                        e eVarC3 = androidx.compose.ui.c.c(bVar2, aVar);
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar2);
                        } else {
                            bVar2.n();
                        }
                        ygg.y(bVar2, ob2VarA2, dVar);
                        ygg.y(bVar2, t8bVarM3, fVar);
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode3))) {
                            c0251a = c0251a2;
                            uz.g(iHashCode3, bVar2, iHashCode3, c0251a);
                        } else {
                            c0251a = c0251a2;
                        }
                        ygg.y(bVar2, eVarC3, eVar);
                        String strI2 = ak2.I(R.string.search_overlay_what_text_field_label, bVar2);
                        o97 o97Var2 = o97Var;
                        o97.g gVar = o97Var2.i;
                        o97.a.e eVar2 = o97Var2.c.a;
                        kv6.a(strI2, androidx.compose.foundation.layout.f.f(aVar, 8.0f), null, null, false, "WhatTextFieldHeader", bVar2, 1572864, 60);
                        fh8 fh8Var = new fh8((Boolean) null, 0, 3, 119);
                        boolean z3 = z;
                        boolean z4 = !z3;
                        String strI3 = ak2.I(R.string.search_overlay_clear_contents, bVar2);
                        fv6 fv6Var = fv6.C8;
                        String str2 = str;
                        gl2.a.C0251a c0251a3 = c0251a;
                        wtd.f(str2, strI3, fv6Var, null, null, null, function1, null, gu5Var, gu5Var2, null, fh8Var, z4, false, false, false, "WhatTextField", bVar2, 384, 12582960, 124088);
                        b bVar3 = bVar2;
                        bVar3.q();
                        bVar3.q();
                        if (z3) {
                            yxgVar = this;
                            bVar3.L(-619569443);
                        } else {
                            bVar3.L(-615102498);
                            e eVarJ = androidx.compose.foundation.layout.f.j(aVar, 8.0f, 4.0f, 0.0f, 0.0f, 12);
                            ehd ehdVarA2 = chd.a(new vs0.i(4.0f, true, new us0(i3)), c20.a.k, bVar3, 48);
                            int iHashCode4 = Long.hashCode(bVar3.k());
                            t8b t8bVarM4 = bVar3.m();
                            e eVarC4 = androidx.compose.ui.c.c(bVar3, eVarJ);
                            if (bVar3.j() == null) {
                                pg8.B();
                                throw null;
                            }
                            bVar3.B();
                            if (bVar3.f()) {
                                bVar3.y(aVar2);
                            } else {
                                bVar3.n();
                            }
                            ygg.y(bVar3, ehdVarA2, dVar);
                            ygg.y(bVar3, t8bVarM4, fVar);
                            if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode4))) {
                                uz.g(iHashCode4, bVar3, iHashCode4, c0251a3);
                            }
                            ygg.y(bVar3, eVarC4, eVar);
                            fv6 fv6Var2 = fv6.o3;
                            long j = eVar2.h.c.a;
                            e eVarJ2 = androidx.compose.foundation.layout.f.j(aVar, 12.0f, 0.0f, 0.0f, 0.0f, 14);
                            String str3 = strI;
                            boolean zK = bVar3.K(str3);
                            Object objV = bVar3.v();
                            if (zK || objV == b.a.a) {
                                objV = new bbd(str3, 1);
                                bVar3.p(objV);
                            }
                            ev6.b(fv6Var2, b5e.b(eVarJ2, false, (Function1) objV), null, zq6.Sm, j, null, bVar3, 3078, 36);
                            yxgVar = this;
                            cif.b(ak2.I(R.string.search_overlay_add_a_valid_search_term, bVar3), androidx.compose.foundation.layout.f.j(aVar, 4.0f, 0.0f, 0.0f, 0.0f, 14), eVar2.h.c.a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var2.j.g, bVar3, 0, 0, 65528);
                            bVar3 = bVar3;
                            bVar3.q();
                        }
                        bVar3.F();
                        jyg.e(kygVar, rscVar, lygVar, str2, function12, gu5Var5, function2, function13, gu5Var4, "WhatSuggestions", bVar3, 805306368);
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH);
            int i3 = i2 >> 12;
            wtd.c(z, z2, gu5Var2, ah2VarC, cVarH, (i3 & 112) | (i3 & 14) | 3072 | ((i2 >> 18) & 896), 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(str, kygVar, lygVar, rscVar, z, z2, function1, gu5Var, gu5Var2, gu5Var3, gu5Var4, gu5Var5, function12, function2, function13, i) { // from class: zxg
                public final /* synthetic */ Function1 V;
                public final /* synthetic */ gu5 W;
                public final /* synthetic */ gu5 X;
                public final /* synthetic */ gu5 Y;
                public final /* synthetic */ gu5 Z;
                public final /* synthetic */ String a;
                public final /* synthetic */ gu5 a0;
                public final /* synthetic */ kyg b;
                public final /* synthetic */ Function1 b0;
                public final /* synthetic */ lyg c;
                public final /* synthetic */ Function2 c0;
                public final /* synthetic */ rsc d;
                public final /* synthetic */ Function1 d0;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    jyg.c(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X, this.Y, this.Z, this.a0, this.b0, this.c0, this.d0, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void d(zye zyeVar, String str, gu5<j6g> gu5Var, String str2, b bVar, int i) {
        zyeVar.getClass();
        str.getClass();
        gu5Var.getClass();
        c cVarH = bVar.h(-1553075844);
        int i2 = i | (cVarH.K(zyeVar) ? 4 : 2) | (cVarH.K(str) ? 32 : 16) | (cVarH.x(gu5Var) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.K(str2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            ux6 ux6Var = new ux6(zyeVar.c, zlg.a, fv6.C8, 240);
            boolean z = (i2 & 896) == 256;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new qy(5, gu5Var);
                cVarH.p(objV);
            }
            zx6.a(ux6Var, (gu5) objV, null, str, str2, cVarH, ((i2 << 6) & 7168) | ((i2 << 3) & 57344), 4);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new dx(zyeVar, str, gu5Var, str2, i, 2);
        }
    }

    public static final void e(final kyg kygVar, final rsc rscVar, final lyg lygVar, final String str, final Function1 function1, final gu5 gu5Var, final Function2 function2, final Function1 function12, final gu5 gu5Var2, final String str2, b bVar, final int i) {
        rscVar.getClass();
        lygVar.getClass();
        str.getClass();
        function1.getClass();
        gu5Var.getClass();
        function2.getClass();
        function12.getClass();
        gu5Var2.getClass();
        c cVarH = bVar.h(1185463219);
        int i2 = i | (cVarH.d(kygVar.ordinal()) ? 4 : 2) | (cVarH.K(rscVar) ? 32 : 16) | (cVarH.K(lygVar) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.K(str) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(function1) ? 16384 : 8192) | (cVarH.x(gu5Var) ? 131072 : 65536) | (cVarH.x(function2) ? 1048576 : 524288) | (cVarH.x(function12) ? 8388608 : 4194304) | (cVarH.x(gu5Var2) ? 67108864 : 33554432);
        if (cVarH.o(i2 & 1, (i2 & 306783379) != 306783378)) {
            o97.g gVar = ((o97) cVarH.M(p97.a)).i;
            e eVarA = f.a(androidx.compose.foundation.layout.f.j(e.a.b, 8.0f, 8.0f, 0.0f, 0.0f, 12), str2);
            boolean z = ((i2 & 14) == 4) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((i2 & 112) == 32) | ((458752 & i2) == 131072) | ((3670016 & i2) == 1048576) | ((29360128 & i2) == 8388608) | ((i2 & 234881024) == 67108864);
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                Function1 function13 = new Function1() { // from class: ayg
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean z2;
                        boolean z3;
                        ls8 ls8Var = (ls8) obj;
                        ls8Var.getClass();
                        kyg kygVar2 = kyg.c;
                        List listQ1 = zr4.a;
                        kyg kygVar3 = kygVar;
                        lyg lygVar2 = lygVar;
                        rsc rscVar2 = rscVar;
                        String str3 = str;
                        Function1 function14 = function1;
                        Function2 function22 = function2;
                        Function1 function15 = function12;
                        int i3 = 1;
                        if (kygVar3 != kygVar2 || (lygVar2 instanceof lyg.d)) {
                            if (kygVar3 == kyg.b) {
                                List<lsc> listA = rscVar2.a();
                                boolean z4 = rscVar2 instanceof rsc.a;
                                if (z4) {
                                    rsc.a aVar = (rsc.a) rscVar2;
                                    int i4 = aVar.b;
                                    Map<String, lsc> map = aVar.a;
                                    if (map.size() > i4 && !(z2 = aVar.c)) {
                                        listA = z92.q1(listA, z2 ? map.size() : Math.min(map.size(), i4));
                                    }
                                }
                                ls8Var.c(listA.size(), null, new k14(listA, i3), new ah2(2039820996, new iyg(listA, function22, function15), true));
                                if (z4) {
                                    rsc.a aVar2 = (rsc.a) rscVar2;
                                    if (aVar2.a.size() > aVar2.b && !aVar2.c) {
                                        ls8.e(ls8Var, null, new ah2(863789346, new byb(2, gu5Var2), true), 3);
                                    }
                                }
                            }
                            lygVar2.getClass();
                            if (lygVar2 instanceof lyg.b) {
                                listQ1 = ((lyg.b) lygVar2).a;
                            }
                            ls8Var.c(listQ1.size(), null, new oz3(listQ1, 4), new ah2(2039820996, new fyg(str3, listQ1, function14), true));
                        } else {
                            lygVar2.getClass();
                            boolean z5 = lygVar2 instanceof lyg.b;
                            if (z5) {
                                listQ1 = ((lyg.b) lygVar2).a;
                            }
                            if (z5) {
                                lyg.b bVar2 = (lyg.b) lygVar2;
                                int i5 = bVar2.b;
                                List<zye> list = bVar2.a;
                                if (list.size() > i5 && !(z3 = bVar2.c)) {
                                    listQ1 = z92.q1(listQ1, z3 ? list.size() : Math.min(list.size(), i5));
                                }
                            }
                            ls8Var.c(listQ1.size(), null, new y4(listQ1, i3), new ah2(2039820996, new gyg(str3, listQ1, function14), true));
                            if ((rscVar2 instanceof rsc.a) && !((rsc.a) rscVar2).a.isEmpty()) {
                                if (z5) {
                                    lyg.b bVar3 = (lyg.b) lygVar2;
                                    if (bVar3.a.size() > bVar3.b && !bVar3.c) {
                                        ls8.e(ls8Var, null, new ah2(1024671321, new f9f(i3, gu5Var), true), 3);
                                    }
                                }
                                List<lsc> listA2 = rscVar2.a();
                                ls8Var.c(listA2.size(), null, new z4(listA2, 1), new ah2(2039820996, new hyg(listA2, function22, function15), true));
                            }
                        }
                        return j6g.a;
                    }
                };
                cVarH.p(function13);
                objV = function13;
            }
            hn8.b(eVarA, null, null, false, null, null, null, false, null, (Function1) objV, cVarH, 0, 510);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(rscVar, lygVar, str, function1, gu5Var, function2, function12, gu5Var2, str2, i) { // from class: byg
                public final /* synthetic */ Function2 V;
                public final /* synthetic */ Function1 W;
                public final /* synthetic */ gu5 X;
                public final /* synthetic */ String Y;
                public final /* synthetic */ rsc b;
                public final /* synthetic */ lyg c;
                public final /* synthetic */ String d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ gu5 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(805306369);
                    jyg.e(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X, this.Y, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
