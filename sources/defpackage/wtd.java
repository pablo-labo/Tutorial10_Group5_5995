package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.f;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jsmappservices.bridge.SearchType;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class wtd {
    public static final void a(final SearchType searchType, final String str, final String str2, final String str3, final Function1 function1, final Function1 function12, final gu5 gu5Var, final gu5 gu5Var2, final Function1 function13, final fh8 fh8Var, boolean z, final String str4, b bVar, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        final boolean z2;
        int i6;
        searchType.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        function1.getClass();
        function12.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        function13.getClass();
        c cVarH = bVar.h(-1494811338);
        if ((i & 6) == 0) {
            i3 = (cVarH.d(searchType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cVarH.K(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cVarH.K(str2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i3 |= cVarH.K(str3) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i3 |= cVarH.x(function1) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= cVarH.x(function12) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= cVarH.x(gu5Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= cVarH.x(gu5Var2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= cVarH.x(function13) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= cVarH.K(fh8Var) ? 536870912 : 268435456;
        }
        int i7 = i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        if (i7 != 0) {
            i5 = 390;
            i4 = 384;
        } else {
            i4 = 384;
            i5 = 384 | (cVarH.a(z) ? 4 : 2);
        }
        int i8 = i5 | 48;
        int i9 = i3;
        if (cVarH.o(i9 & 1, ((i9 & 306783379) == 306783378 && (i8 & 147) == 146) ? false : true)) {
            boolean z3 = i7 != 0 ? false : z;
            boolean z4 = searchType == SearchType.b;
            boolean z5 = searchType == SearchType.c;
            o97 o97Var = (o97) cVarH.M(p97.a);
            o97.h hVar = o97Var.j;
            boolean z6 = z5;
            o97.c cVar = o97Var.f;
            o97.a aVar = o97Var.c;
            o97.a.b bVar2 = aVar.c;
            o97.a.e eVar = aVar.a;
            tjf tjfVarA = tjf.a(hVar.f, eVar.c, 0L, cVar.c, null, null, 0L, 0, 0L, null, null, 0, 16777210);
            tjf tjfVarA2 = tjf.a(o97Var.j.g, eVar.c, 0L, cVar.a, null, null, 0L, 0, 0L, null, null, 0, 16777210);
            long j = z3 ? bVar2.g.c.b : bVar2.d;
            fgd fgdVarA = ggd.a(o97Var.h.c);
            e.a aVar2 = e.a.b;
            e eVarA = f.a(g.f(ti1.a(aVar2, 2.0f, j, fgdVarA), 1.0f), str4);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarA);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
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
            fv6 fv6Var = fv6.C8;
            ar6 ar6Var = ar6.Stroke;
            ar6 ar6Var2 = ar6.Filled;
            ar6 ar6Var3 = z4 ? ar6Var2 : ar6Var;
            zq6 zq6Var = zq6.Md;
            zq6 zq6Var2 = zq6.Sm;
            zq6 zq6Var3 = z4 ? zq6Var : zq6Var2;
            tjf tjfVar = z4 ? tjfVarA : tjfVarA2;
            int i10 = i9 & 234881024;
            boolean z7 = i10 == 67108864;
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (z7 || objV == c0020a) {
                i6 = 234881024;
                objV = new ej4(function13, 4);
                cVarH.p(objV);
            } else {
                i6 = 234881024;
            }
            int i11 = ((i9 >> 3) & 14) | i4;
            int i12 = i9 >> 6;
            int i13 = i12 & 112;
            int i14 = i9 << 6;
            int i15 = i14 & i6;
            int i16 = i14 & 1879048192;
            int i17 = i11 | i13 | (i14 & 3670016) | i15 | i16;
            int i18 = ((i9 >> 24) & 112) | 196608 | ((i8 << 6) & 896) | 3072;
            f(str, str3, fv6Var, ar6Var3, zq6Var3, tjfVar, function1, (Function1) objV, gu5Var, gu5Var2, ak2.I(R.string.search_overlay_what_text_field_label, cVarH), fh8Var, z3, z4, false, z4, str4.concat("_WhatSearch"), cVarH, i17, i18, 0);
            cVarH = cVarH;
            a84.b(1.0f, 48, 0, bVar2.b, cVarH, androidx.compose.foundation.layout.f.h(aVar2, 16.0f, 0.0f, 2));
            fv6 fv6Var2 = fv6.Y4;
            ar6 ar6Var4 = z6 ? ar6Var2 : ar6Var;
            zq6 zq6Var4 = z6 ? zq6Var : zq6Var2;
            tjf tjfVar2 = z6 ? tjfVarA : tjfVarA2;
            boolean z8 = i10 == 67108864;
            Object objV2 = cVarH.v();
            if (z8 || objV2 == c0020a) {
                objV2 = new ze(function13, 3);
                cVarH.p(objV2);
            }
            f(str2, str3, fv6Var2, ar6Var4, zq6Var4, tjfVar2, function12, (Function1) objV2, gu5Var, gu5Var2, ak2.I(R.string.search_overlay_where_text_field_label, cVarH), fh8Var, z3, z6, false, z6, str4.concat("_WhereSearch"), cVarH, (i12 & 14) | 384 | i13 | ((i9 << 3) & 3670016) | i15 | i16, i18, 0);
            cVarH.U(true);
            z2 = z3;
        } else {
            cVarH.D();
            z2 = z;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: ptd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    wtd.a(searchType, str, str2, str3, function1, function12, gu5Var, gu5Var2, function13, fh8Var, z2, str4, (b) obj, iL, i2);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(final int i, gu5 gu5Var, b bVar, String str, String str2) {
        int i2;
        final gu5 gu5Var2;
        final String str3;
        final String str4;
        gl2.a.C0251a c0251a;
        c cVarF = q6.f(57556503, gu5Var, bVar, str);
        if ((i & 6) == 0) {
            i2 = i | (cVarF.K(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarF.x(gu5Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        int i4 = 0;
        if (cVarF.o(i3 & 1, (i3 & 147) != 146)) {
            o97 o97Var = (o97) cVarF.M(p97.a);
            e.a aVar = e.a.b;
            e eVarA = f.a(aVar, "ProfileLocationSuggestionItem");
            Object objV = cVarF.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = v40.a(cVarF);
            }
            e eVarB = androidx.compose.foundation.b.b(eVarA, (d3a) objV, ka3.a, false, null, null, gu5Var, 28);
            o97.g gVar = o97Var.i;
            o97.h hVar = o97Var.j;
            e eVarF = g.f(androidx.compose.foundation.layout.f.g(eVarB, 16.0f, 4.0f), 1.0f);
            ehd ehdVarA = chd.a(new vs0.i(6.0f, true, new us0(i4)), c20.a.k, cVarF, 48);
            int iHashCode = Long.hashCode(cVarF.T);
            t8b t8bVarP = cVarF.P();
            e eVarC = androidx.compose.ui.c.c(cVarF, eVarF);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarF.B();
            if (cVarF.S) {
                cVarF.y(aVar2);
            } else {
                cVarF.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarF, ehdVarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarF, t8bVarP, fVar);
            gl2.a.C0251a c0251a2 = gl2.a.j;
            if (cVarF.S || !wl7.b(cVarF.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarF, iHashCode, c0251a2);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarF, eVarC, eVar);
            boolean z = (i3 & 112) == 32;
            Object objV2 = cVarF.v();
            if (z || objV2 == c0020a) {
                objV2 = new af(6, gu5Var);
                cVarF.p(objV2);
            }
            e eVarD = androidx.compose.foundation.b.d(aVar, false, null, null, (gu5) objV2, 15);
            ehd ehdVarA2 = chd.a(vs0.a, c20.a.j, cVarF, 0);
            int iHashCode2 = Long.hashCode(cVarF.T);
            t8b t8bVarP2 = cVarF.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarF, eVarD);
            cVarF.B();
            if (cVarF.S) {
                cVarF.y(aVar2);
            } else {
                cVarF.n();
            }
            ygg.y(cVarF, ehdVarA2, dVar);
            ygg.y(cVarF, t8bVarP2, fVar);
            if (cVarF.S || !wl7.b(cVarF.v(), Integer.valueOf(iHashCode2))) {
                c0251a = c0251a2;
                ja.h(iHashCode2, cVarF, iHashCode2, c0251a);
            } else {
                c0251a = c0251a2;
            }
            ygg.y(cVarF, eVarC2, eVar);
            ev6.b(fv6.i4, f.a(androidx.compose.foundation.layout.f.h(aVar, 0.0f, 4.0f, 1), "ProfileLocationSuggestionItem_Icon"), ar6.Stroke, null, 0L, null, cVarF, 390, 56);
            e eVarH = androidx.compose.foundation.layout.f.h(aVar, 6.0f, 0.0f, 2);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarF, 0);
            int iHashCode3 = Long.hashCode(cVarF.T);
            t8b t8bVarP3 = cVarF.P();
            e eVarC3 = androidx.compose.ui.c.c(cVarF, eVarH);
            cVarF.B();
            if (cVarF.S) {
                cVarF.y(aVar2);
            } else {
                cVarF.n();
            }
            ygg.y(cVarF, ob2VarA, dVar);
            ygg.y(cVarF, t8bVarP3, fVar);
            if (cVarF.S || !wl7.b(cVarF.v(), Integer.valueOf(iHashCode3))) {
                ja.h(iHashCode3, cVarF, iHashCode3, c0251a);
            }
            ygg.y(cVarF, eVarC3, eVar);
            cif.b(ak2.I(R.string.search_overlay_profile_location_label, cVarF), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, hVar.f, cVarF, 0, 0, 65534);
            str3 = str;
            gu5Var2 = gu5Var;
            cif.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, hVar.h, cVarF, i3 & 14, 48, 63486);
            cVarF = cVarF;
            o6.j(cVarF, true, true, true);
            str4 = "ProfileLocationSuggestionItem";
        } else {
            gu5Var2 = gu5Var;
            str3 = str;
            cVarF.D();
            str4 = str2;
        }
        i iVarW = cVarF.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: otd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wtd.b(ka2.L(i | 1), gu5Var2, (b) obj, str3, str4);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final boolean r21, boolean r22, final defpackage.gu5 r23, final defpackage.ah2 r24, androidx.compose.runtime.b r25, final int r26, final int r27) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wtd.c(boolean, boolean, gu5, ah2, androidx.compose.runtime.b, int, int):void");
    }

    public static final void d(gu5 gu5Var, String str, fv6 fv6Var, gu5 gu5Var2, String str2, b bVar, int i) {
        int i2;
        gu5Var.getClass();
        str.getClass();
        gu5Var2.getClass();
        str2.getClass();
        c cVarH = bVar.h(1199411273);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.d(fv6Var == null ? -1 : fv6Var.ordinal()) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.K("TryAgainButton") ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.x(gu5Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.K(str2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= cVarH.K("EnterLocationButton") ? 1048576 : 524288;
        }
        if (cVarH.o(i2 & 1, (599187 & i2) != 599186)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar = e.a.b;
            e eVarD = g.d(aVar, 1.0f);
            ehd ehdVarA = chd.a(vs0.e, c20.a.j, cVarH, 54);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarD);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            int i3 = i2;
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
            e eVarF = g.f(aVar, 1.0f);
            o97.g gVar = o97Var.i;
            e eVarF2 = androidx.compose.foundation.layout.f.f(eVarF, 16.0f);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.n, cVarH, 54);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarF2);
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
            f17.a(z2b.a(R.drawable.ic_something_wrong, 0, cVarH), ak2.I(R.string.something_went_wrong, cVarH), g.n(aVar, ((Configuration) cVarH.M(AndroidCompositionLocals_androidKt.a)).screenHeightDp / 3.0f), null, null, 0.0f, null, cVarH, 0, 120);
            cif.b(ak2.I(R.string.search_overlay_current_location_error_heading, cVarH), androidx.compose.foundation.layout.f.j(aVar, 0.0f, 0.0f, 0.0f, 8.0f, 7), 0L, o97Var.e.e, null, o97Var.f.c, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, cVarH, 0, 0, 131028);
            cif.b(ak2.I(R.string.search_overlay_current_location_error_message, cVarH), androidx.compose.foundation.layout.f.j(aVar, 0.0f, 0.0f, 0.0f, 16.0f, 7), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.f, cVarH, 0, 0, 65532);
            gt6.h(str, gu5Var, f.a(androidx.compose.foundation.layout.f.j(aVar, 0.0f, 0.0f, 0.0f, 16.0f, 7), "TryAgainButton"), null, false, false, fv6Var, null, null, cVarH, ((i3 >> 3) & 14) | ((i3 << 3) & 112) | ((i3 << 12) & 3670016), 440);
            gt6.j(str2, gu5Var2, f.a(androidx.compose.foundation.layout.f.j(aVar, 0.0f, 0.0f, 0.0f, 16.0f, 7), "EnterLocationButton"), null, false, false, null, null, null, cVarH, ((i3 >> 15) & 14) | ((i3 >> 9) & 112), DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
            cVarH = cVarH;
            cVarH.U(true);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new jtd(gu5Var, str, fv6Var, gu5Var2, str2, i);
        }
    }

    public static final void e(final boolean z, final e eVar, final gu5 gu5Var, boolean z2, b bVar, final int i) {
        int i2;
        final boolean z3;
        gu5Var.getClass();
        c cVarH = bVar.h(452255359);
        if ((i & 6) == 0) {
            i2 = (cVarH.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(gu5Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.a(z2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            final o97 o97Var = (o97) cVarH.M(p97.a);
            Object objV = cVarH.v();
            int i3 = 9;
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = new kd(i3);
                cVarH.p(objV);
            }
            mv4 mv4VarK = ku4.k((Function1) objV, 1);
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = new kd(i3);
                cVarH.p(objV2);
            }
            androidx.compose.animation.i.e(z2, null, mv4VarK, ku4.m((Function1) objV2, 1), null, bh2.c(1326993751, new wu5() { // from class: mtd
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    b bVar2 = (b) obj2;
                    ((Integer) obj3).getClass();
                    ((qd0) obj).getClass();
                    e eVarF = g.f(eVar, 1.0f);
                    o97.g gVar = o97Var.i;
                    gt6.h(ak2.I(R.string.search_overlay_search_button_text, bVar2), gu5Var, f.a(androidx.compose.foundation.layout.f.f(eVarF, 8.0f), "SearchOverlaySearchButton"), null, !z, false, fv6.C8, null, null, bVar2, 1572864, 424);
                    return j6g.a;
                }
            }, cVarH), cVarH, ((i2 >> 9) & 14) | 200064, 18);
            z3 = z2;
        } else {
            z3 = z2;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: ntd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wtd.e(z, eVar, gu5Var, z3, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(final java.lang.String r56, final java.lang.String r57, final defpackage.fv6 r58, defpackage.ar6 r59, defpackage.zq6 r60, defpackage.tjf r61, final kotlin.jvm.functions.Function1 r62, kotlin.jvm.functions.Function1 r63, final defpackage.gu5 r64, final defpackage.gu5 r65, java.lang.String r66, final defpackage.fh8 r67, final boolean r68, boolean r69, boolean r70, boolean r71, final java.lang.String r72, androidx.compose.runtime.b r73, final int r74, final int r75, final int r76) {
        /*
            Method dump skipped, instruction units count: 1251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wtd.f(java.lang.String, java.lang.String, fv6, ar6, zq6, tjf, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, gu5, gu5, java.lang.String, fh8, boolean, boolean, boolean, boolean, java.lang.String, androidx.compose.runtime.b, int, int, int):void");
    }
}
