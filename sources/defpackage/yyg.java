package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.azg;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class yyg {
    public static final List<zye> a = u63.a0(new zye(0, 3, "Longview, TX"), new zye(0, 3, "Long Beach, CA"), new zye(0, 3, "Long Island, NY"), new zye(0, 3, "Longmont, CO"), new zye(0, 0, "Found suggestion 1"), new zye(0, 0, "Found suggestion 2"), new zye(0, 0, "Found suggestion 3"), new zye(0, 0, "Found suggestion 4"), new zye(0, 0, "Found suggestion 5"), new zye(0, 0, "Found suggestion 6"), new zye(0, 0, "Found suggestion 7"), new zye(0, 0, "Found suggestion 8"), new zye(0, 0, "Found suggestion 9"), new zye(0, 0, "Found suggestion 10"), new zye(0, 0, "Found suggestion 11"), new zye(0, 0, "Found suggestion 12"), new zye(0, 0, "Found suggestion 13"), new zye(0, 0, "Found suggestion 14"), new zye(0, 0, "Found suggestion 15"));

    public static final void a(gu5<j6g> gu5Var, b bVar, final int i) {
        int i2;
        final gu5<j6g> gu5Var2;
        c cVarH = bVar.h(-1048406118);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            ux6 ux6Var = new ux6(ak2.I(R.string.search_overlay_current_location, cVarH), zlg.b, fv6.q2, 248);
            o97.g gVar = o97Var.i;
            gu5Var2 = gu5Var;
            zx6.a(ux6Var, gu5Var2, f.h(e.a.b, 0.0f, 4.0f, 1), "", "CurrentLocationSuggestionItem", cVarH, 27648 | ((i2 << 3) & 112), 0);
        } else {
            gu5Var2 = gu5Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: nyg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iL = ka2.L(i | 1);
                    yyg.a(gu5Var2, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(final gu5<j6g> gu5Var, b bVar, final int i) {
        int i2;
        c cVarH = bVar.h(-1012382220);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar = e.a.b;
            e eVarD = g.d(aVar, 1.0f);
            af1.b bVar2 = c20.a.j;
            vs0.c cVar = vs0.e;
            ehd ehdVarA = chd.a(cVar, bVar2, cVarH, 54);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarD);
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
            ob2 ob2VarA = mb2.a(cVar, c20.a.n, cVarH, 54);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, aVar);
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
            o97.g gVar = o97Var.i;
            tx6.a(g.n(aVar, 24.0f), "DetectingLocationSpinner", false, "Spinner", cVarH, 3120, 4);
            cif.b(ak2.I(R.string.search_overlay_location_getting_current_location, cVarH), f.j(aVar, 0.0f, 16.0f, 0.0f, 0.0f, 13), 0L, 0L, new mo5(1), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.h, cVarH, 0, 0, 65516);
            gt6.m(ak2.I(R.string.cancel, cVarH), gu5Var, androidx.compose.ui.platform.f.a(aVar, "CancelButton"), null, false, null, null, cVarH, ((i2 << 3) & 112) | 384, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
            cVarH = cVarH;
            cVarH.U(true);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: tyg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iL = ka2.L(i | 1);
                    yyg.b(gu5Var, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void c(final azg.d dVar, final String str, final String str2, final boolean z, final gu5 gu5Var, final Function1 function1, final gu5 gu5Var2, b bVar, final int i) {
        int i2;
        c cVar;
        c cVarH = bVar.h(1323629419);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.K(str2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.a(z) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.x(gu5Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.x(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= cVarH.x(gu5Var2) ? 1048576 : 524288;
        }
        if (cVarH.o(i2 & 1, (599187 & i2) != 599186)) {
            int i3 = i2 >> 3;
            int i4 = i2 << 3;
            cVar = cVarH;
            g(dVar.a, str2, str, z, gu5Var, gu5Var2, function1, null, null, cVar, (i2 & 57344) | (i3 & 112) | (i4 & 896) | (i2 & 7168) | (i3 & 458752) | (3670016 & i4));
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: vyg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yyg.c(dVar, str, str2, z, gu5Var, function1, gu5Var2, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void d(final gu5<j6g> gu5Var, b bVar, final int i) {
        int i2;
        c cVarH = bVar.h(451359616);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            a(gu5Var, cVarH, i2 & 14);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: uyg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iL = ka2.L(i | 1);
                    yyg.d(gu5Var, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void e(final zyg zygVar, final azg azgVar, final String str, final String str2, final boolean z, final boolean z2, final Function1 function1, final gu5 gu5Var, final gu5 gu5Var2, final gu5 gu5Var3, final gu5 gu5Var4, final Function1 function12, final gu5 gu5Var5, final gu5 gu5Var6, b bVar, final int i) {
        c cVar;
        str.getClass();
        c cVarH = bVar.h(1175177022);
        int i2 = i | (cVarH.d(zygVar == null ? -1 : zygVar.ordinal()) ? 4 : 2) | (cVarH.K(azgVar) ? 32 : 16) | (cVarH.K(str) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.K(str2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.a(z) ? 16384 : 8192) | (cVarH.a(z2) ? 131072 : 65536) | (cVarH.x(function1) ? 1048576 : 524288) | (cVarH.x(gu5Var) ? 8388608 : 4194304) | (cVarH.x(gu5Var2) ? 67108864 : 33554432) | (cVarH.x(gu5Var3) ? 536870912 : 268435456);
        char c = 256;
        int i3 = (cVarH.x(gu5Var4) ? (char) 4 : (char) 2) | (cVarH.x(function12) ? ' ' : (char) 16);
        if (!cVarH.x(gu5Var5)) {
            c = 128;
        }
        if (cVarH.o(i2 & 1, ((i2 & 306783379) == 306783378 && (((i3 | c) | (cVarH.x(gu5Var6) ? (char) 2048 : (char) 1024)) & 1171) == 1170) ? false : true)) {
            final o97 o97Var = (o97) cVarH.M(p97.a);
            boolean z3 = azgVar instanceof azg.a;
            final boolean z4 = (z3 || (azgVar instanceof azg.e) || (azgVar instanceof azg.c) || (azgVar instanceof azg.b)) ? false : true;
            final boolean z5 = z4 || z3;
            final boolean z6 = (z3 || (azgVar instanceof azg.e) || (azgVar instanceof azg.j) || (azgVar instanceof azg.i)) ? false : true;
            cVar = cVarH;
            int i4 = i2 >> 12;
            wtd.c(z, z2, gu5Var3, bh2.c(2078535013, new wu5() { // from class: myg
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) throws Throwable {
                    gl2.a.C0251a c0251a;
                    o97 o97Var2;
                    pm8.a aVar;
                    myg mygVar;
                    gl2.a.C0251a c0251a2;
                    gl2.a.f fVar;
                    boolean z7;
                    String str3;
                    gl2.a.d dVar;
                    gl2.a.e eVar;
                    e.a aVar2;
                    myg mygVar2;
                    Throwable th;
                    o97 o97Var3;
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((pb2) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        ehd ehdVarA = chd.a(vs0.a, c20.a.l, bVar2, 48);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e.a aVar3 = e.a.b;
                        e eVarC = androidx.compose.ui.c.c(bVar2, aVar3);
                        gl2.j.getClass();
                        pm8.a aVar4 = gl2.a.b;
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar4);
                        } else {
                            bVar2.n();
                        }
                        gl2.a.d dVar2 = gl2.a.g;
                        ygg.y(bVar2, ehdVarA, dVar2);
                        gl2.a.f fVar2 = gl2.a.f;
                        ygg.y(bVar2, t8bVarM, fVar2);
                        gl2.a.C0251a c0251a3 = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a3);
                        }
                        gl2.a.e eVar2 = gl2.a.d;
                        ygg.y(bVar2, eVarC, eVar2);
                        vs0.k kVar = vs0.c;
                        af1.a aVar5 = c20.a.m;
                        ob2 ob2VarA = mb2.a(kVar, aVar5, bVar2, 0);
                        int iHashCode2 = Long.hashCode(bVar2.k());
                        t8b t8bVarM2 = bVar2.m();
                        e eVarC2 = androidx.compose.ui.c.c(bVar2, aVar3);
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar4);
                        } else {
                            bVar2.n();
                        }
                        ygg.y(bVar2, ob2VarA, dVar2);
                        ygg.y(bVar2, t8bVarM2, fVar2);
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                            uz.g(iHashCode2, bVar2, iHashCode2, c0251a3);
                        }
                        ygg.y(bVar2, eVarC2, eVar2);
                        gt6.o(fv6.o0, gu5Var4, null, ak2.I(R.string.close, bVar2), null, "SearchOverlayTopBarBackButton", bVar2, 12582918, 116);
                        bVar2.q();
                        ob2 ob2VarA2 = mb2.a(kVar, aVar5, bVar2, 0);
                        int iHashCode3 = Long.hashCode(bVar2.k());
                        t8b t8bVarM3 = bVar2.m();
                        e eVarC3 = androidx.compose.ui.c.c(bVar2, aVar3);
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar4);
                        } else {
                            bVar2.n();
                        }
                        ygg.y(bVar2, ob2VarA2, dVar2);
                        ygg.y(bVar2, t8bVarM3, fVar2);
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode3))) {
                            c0251a = c0251a3;
                            uz.g(iHashCode3, bVar2, iHashCode3, c0251a);
                        } else {
                            c0251a = c0251a3;
                        }
                        ygg.y(bVar2, eVarC3, eVar2);
                        o97 o97Var4 = o97Var;
                        if (z5) {
                            bVar2.L(1707877796);
                            String strI = ak2.I(R.string.search_overlay_where_text_field_label, bVar2);
                            o97.g gVar = o97Var4.i;
                            aVar = aVar4;
                            o97Var2 = o97Var4;
                            mygVar = this;
                            kv6.a(strI, f.f(aVar3, 8.0f), null, null, false, null, bVar2, 0, 124);
                        } else {
                            o97Var2 = o97Var4;
                            aVar = aVar4;
                            mygVar = this;
                            bVar2.L(1703201198);
                        }
                        bVar2.F();
                        boolean z8 = z;
                        String str4 = str;
                        gu5 gu5Var7 = gu5Var2;
                        if (z4) {
                            bVar2.L(1708164174);
                            boolean z9 = !z8;
                            str3 = str4;
                            th = null;
                            z7 = z8;
                            c0251a2 = c0251a;
                            fVar = fVar2;
                            aVar2 = aVar3;
                            eVar = eVar2;
                            dVar = dVar2;
                            mygVar2 = this;
                            wtd.f(str3, ak2.I(R.string.search_overlay_clear_contents, bVar2), fv6.Y4, null, null, null, function1, null, gu5Var7, gu5Var3, null, new fh8((Boolean) null, 0, 3, 119), z9, false, false, false, "WhereTextField", bVar2, 384, 12582960, 124088);
                            bVar2 = bVar2;
                            bVar2.F();
                            o97Var3 = o97Var2;
                        } else {
                            c0251a2 = c0251a;
                            fVar = fVar2;
                            z7 = z8;
                            str3 = str4;
                            dVar = dVar2;
                            eVar = eVar2;
                            aVar2 = aVar3;
                            mygVar2 = mygVar;
                            th = null;
                            bVar2.L(1708818367);
                            o97Var3 = o97Var2;
                            o97.g gVar2 = o97Var3.i;
                            jh2.f(bVar2, g.h(aVar2, 48.0f));
                            bVar2.F();
                        }
                        bVar2.q();
                        bVar2.q();
                        azg azgVar2 = azgVar;
                        if (z7) {
                            bVar2.L(1088903421);
                        } else {
                            bVar2.L(1094666476);
                            o97.g gVar3 = o97Var3.i;
                            e eVarJ = f.j(aVar2, 0.0f, 6.0f, 0.0f, 0.0f, 13);
                            ehd ehdVarA2 = chd.a(new vs0.i(6.0f, true, new us0(0)), c20.a.k, bVar2, 48);
                            int iHashCode4 = Long.hashCode(bVar2.k());
                            t8b t8bVarM4 = bVar2.m();
                            e eVarC4 = androidx.compose.ui.c.c(bVar2, eVarJ);
                            if (bVar2.j() == null) {
                                pg8.B();
                                throw th;
                            }
                            bVar2.B();
                            if (bVar2.f()) {
                                bVar2.y(aVar);
                            } else {
                                bVar2.n();
                            }
                            ygg.y(bVar2, ehdVarA2, dVar);
                            ygg.y(bVar2, t8bVarM4, fVar);
                            if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode4))) {
                                uz.g(iHashCode4, bVar2, iHashCode4, c0251a2);
                            }
                            ygg.y(bVar2, eVarC4, eVar);
                            yyg.h(azgVar2, bVar2, 0);
                            bVar2.q();
                        }
                        bVar2.F();
                        yyg.f(zygVar, azgVar2, str3, str2, z6, gu5Var, gu5Var7, function12, gu5Var5, gu5Var6, bVar2, 0);
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVar), cVar, (i4 & 112) | (i4 & 14) | 3072 | ((i2 >> 21) & 896), 0);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(azgVar, str, str2, z, z2, function1, gu5Var, gu5Var2, gu5Var3, gu5Var4, function12, gu5Var5, gu5Var6, i) { // from class: qyg
                public final /* synthetic */ Function1 V;
                public final /* synthetic */ gu5 W;
                public final /* synthetic */ gu5 X;
                public final /* synthetic */ gu5 Y;
                public final /* synthetic */ gu5 Z;
                public final /* synthetic */ Function1 a0;
                public final /* synthetic */ azg b;
                public final /* synthetic */ gu5 b0;
                public final /* synthetic */ String c;
                public final /* synthetic */ gu5 c0;
                public final /* synthetic */ String d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    yyg.e(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X, this.Y, this.Z, this.a0, this.b0, this.c0, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(final zyg zygVar, final azg azgVar, final String str, final String str2, final boolean z, final gu5 gu5Var, final gu5 gu5Var2, final Function1 function1, final gu5 gu5Var3, final gu5 gu5Var4, b bVar, final int i) {
        str.getClass();
        c cVarH = bVar.h(980968652);
        int i2 = i | (cVarH.K(azgVar) ? 32 : 16) | (cVarH.K(str) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.K(str2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.a(z) ? 16384 : 8192) | (cVarH.x(gu5Var) ? 131072 : 65536) | (cVarH.x(gu5Var2) ? 1048576 : 524288) | (cVarH.x(function1) ? 8388608 : 4194304) | (cVarH.x(gu5Var3) ? 67108864 : 33554432) | (cVarH.x(gu5Var4) ? 536870912 : 268435456);
        if (cVarH.o(i2 & 1, (306783377 & i2) != 306783376)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            if (azgVar instanceof azg.f) {
                cVarH.L(1080280905);
                d(gu5Var, cVarH, (i2 >> 15) & 14);
                cVarH.U(false);
            } else if (azgVar instanceof azg.d) {
                cVarH.L(1080431224);
                int i3 = i2 >> 6;
                int i4 = (i3 & 112) | (i2 & 896);
                int i5 = i2 >> 3;
                c((azg.d) azgVar, str2, str, z, gu5Var, function1, gu5Var3, cVarH, (i3 & 3670016) | (i5 & 57344) | i4 | (i5 & 7168) | (458752 & i3));
                cVarH = cVarH;
                cVarH.U(false);
            } else if (azgVar instanceof azg.i) {
                cVarH.L(1080973569);
                o97.g gVar = o97Var.i;
                e.a aVar = e.a.b;
                e eVarJ = f.j(aVar, 12.0f, 4.0f, 0.0f, 0.0f, 12);
                ehd ehdVarA = chd.a(vs0.a, c20.a.j, cVarH, 0);
                int iHashCode = Long.hashCode(cVarH.T);
                t8b t8bVarP = cVarH.P();
                e eVarC = androidx.compose.ui.c.c(cVarH, eVarJ);
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
                ev6.b(fv6.ia, f.j(aVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), null, zq6.Sm, o97Var.c.a.h.e.a, null, cVarH, 3078, 36);
                cif.b(ak2.I(R.string.search_overlay_location_no_results_found, cVarH), androidx.compose.ui.platform.f.a(f.j(aVar, 4.0f, 0.0f, 0.0f, 0.0f, 14), "NoResultsFoundText"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.g, cVarH, 0, 0, 65532);
                cVarH = cVarH;
                cVarH.U(true);
                cVarH.U(false);
            } else {
                boolean z2 = true;
                if (azgVar instanceof azg.c) {
                    cVarH.L(1081845692);
                    wtd.d(((azg.c) azgVar).a, ak2.I(R.string.retry, cVarH), fv6.M7, gu5Var2, ak2.I(R.string.search_overlay_location_enter_location, cVarH), cVarH, ((i2 >> 6) & 57344) | 1576320);
                    cVarH.U(false);
                } else if (azgVar instanceof azg.a) {
                    cVarH.L(1082426136);
                    b(gu5Var2, cVarH, (i2 >> 18) & 14);
                    cVarH.U(false);
                } else if (azgVar instanceof azg.b) {
                    cVarH.L(1082598620);
                    wtd.d(((azg.b) azgVar).a, ak2.I(R.string.retry, cVarH), fv6.M7, gu5Var2, ak2.I(R.string.search_overlay_location_enter_location, cVarH), cVarH, ((i2 >> 6) & 57344) | 1576320);
                    cVarH.U(false);
                } else if (azgVar instanceof azg.g) {
                    cVarH.L(1083210095);
                    Object objV = cVarH.v();
                    b.a.C0020a c0020a = b.a.a;
                    if (objV == c0020a) {
                        objV = r.f(Boolean.TRUE);
                        cVarH.p(objV);
                    }
                    g4a g4aVar = (g4a) objV;
                    a(gu5Var, cVarH, (i2 >> 15) & 14);
                    boolean zBooleanValue = ((Boolean) g4aVar.getValue()).booleanValue();
                    String strI = ak2.I(R.string.search_overlay_allow_location_access, cVarH);
                    fv6 fv6Var = fv6.ia;
                    String strI2 = ak2.I(R.string.search_overlay_settings, cVarH);
                    String strI3 = ak2.I(R.string.search_overlay_dismiss, cVarH);
                    if ((1879048192 & i2) != 536870912) {
                        z2 = false;
                    }
                    Object objV2 = cVarH.v();
                    if (z2 || objV2 == c0020a) {
                        objV2 = new ryg(gu5Var4, g4aVar, 0);
                        cVarH.p(objV2);
                    }
                    gu5 gu5Var5 = (gu5) objV2;
                    Object objV3 = cVarH.v();
                    if (objV3 == c0020a) {
                        objV3 = new uu(5, g4aVar);
                        cVarH.p(objV3);
                    }
                    tz6.a(12583296, 266, gu5Var5, (gu5) objV3, fv6Var, cVarH, null, null, strI, strI2, strI3, zBooleanValue);
                    cVarH = cVarH;
                    cVarH.U(false);
                } else {
                    cVarH.L(1084034323);
                    cVarH.U(false);
                }
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(azgVar, str, str2, z, gu5Var, gu5Var2, function1, gu5Var3, gu5Var4, i) { // from class: syg
                public final /* synthetic */ gu5 V;
                public final /* synthetic */ Function1 W;
                public final /* synthetic */ gu5 X;
                public final /* synthetic */ gu5 Y;
                public final /* synthetic */ azg b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ gu5 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    yyg.f(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X, this.Y, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void g(final List list, final String str, final String str2, final boolean z, final gu5 gu5Var, final gu5 gu5Var2, final Function1 function1, e eVar, String str3, b bVar, final int i) {
        int i2;
        final String str4;
        boolean z2;
        gu5 gu5Var3;
        gu5 gu5Var4;
        Function1 function12;
        c cVar;
        final e eVar2;
        final String str5;
        list.getClass();
        str.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        function1.getClass();
        c cVarH = bVar.h(1836251776);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str4 = str2;
            i2 |= cVarH.K(str4) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        } else {
            str4 = str2;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= cVarH.a(z2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            gu5Var3 = gu5Var;
            i2 |= cVarH.x(gu5Var3) ? 16384 : 8192;
        } else {
            gu5Var3 = gu5Var;
        }
        if ((196608 & i) == 0) {
            gu5Var4 = gu5Var2;
            i2 |= cVarH.x(gu5Var4) ? 131072 : 65536;
        } else {
            gu5Var4 = gu5Var2;
        }
        if ((1572864 & i) == 0) {
            function12 = function1;
            i2 |= cVarH.x(function12) ? 1048576 : 524288;
        } else {
            function12 = function1;
        }
        int i3 = i2 | 113246208;
        if (cVarH.o(i3 & 1, (i3 & 38347923) != 38347922)) {
            e.a aVar = e.a.b;
            e eVarA = androidx.compose.ui.platform.f.a(aVar, "WhereSuggestionsLazyColumn");
            boolean zX = ((i3 & 896) == 256) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | cVarH.x(list) | ((i3 & 112) == 32) | ((i3 & 3670016) == 1048576);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                final gu5 gu5Var5 = gu5Var3;
                final Function1 function13 = function12;
                str5 = "WhereSuggestionsLazyColumn";
                final boolean z3 = z2;
                final gu5 gu5Var6 = gu5Var4;
                Function1 function14 = new Function1() { // from class: oyg
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ls8 ls8Var = (ls8) obj;
                        ls8Var.getClass();
                        if (z3) {
                            ls8.e(ls8Var, null, new ah2(-224401584, new frb(gu5Var5, 1), true), 3);
                        }
                        String str6 = str4;
                        if (str6 != null && str6.length() != 0) {
                            ls8.e(ls8Var, null, new ah2(-1560759239, new bm4(str6, 1, gu5Var6), true), 3);
                        }
                        List list2 = list;
                        ls8Var.c(list2.size(), null, new ql2(list2, 5), new ah2(2039820996, new xyg(str, list2, function13), true));
                        return j6g.a;
                    }
                };
                cVarH.p(function14);
                objV = function14;
            } else {
                str5 = "WhereSuggestionsLazyColumn";
            }
            cVar = cVarH;
            hn8.b(eVarA, null, null, false, null, null, null, false, null, (Function1) objV, cVar, 0, 510);
            eVar2 = aVar;
        } else {
            cVar = cVarH;
            cVar.D();
            eVar2 = eVar;
            str5 = str3;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: pyg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yyg.g(list, str, str2, z, gu5Var, gu5Var2, function1, eVar2, str5, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void h(azg azgVar, b bVar, int i) {
        c cVarH = bVar.h(-1265095067);
        int i2 = (cVarH.K(azgVar) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            String strI = ak2.I(R.string.error_icon_content_description, cVarH);
            if (azgVar instanceof azg.c) {
                cVarH.L(-108816965);
                cVarH.U(false);
            } else if (azgVar instanceof azg.a) {
                cVarH.L(-108755461);
                cVarH.U(false);
            } else if (azgVar instanceof azg.b) {
                cVarH.L(-108688997);
                cVarH.U(false);
            } else if (azgVar instanceof azg.e) {
                cVarH.L(-108631461);
                cVarH.U(false);
            } else {
                cVarH.L(-108582326);
                o97.g gVar = o97Var.i;
                o97.a.e eVar = o97Var.c.a;
                e.a aVar = e.a.b;
                e eVarJ = f.j(aVar, 8.0f, 4.0f, 0.0f, 0.0f, 12);
                ehd ehdVarA = chd.a(vs0.a, c20.a.j, cVarH, 0);
                int iHashCode = Long.hashCode(cVarH.T);
                t8b t8bVarP = cVarH.P();
                e eVarC = androidx.compose.ui.c.c(cVarH, eVarJ);
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
                fv6 fv6Var = fv6.o3;
                long j = eVar.h.c.a;
                e eVarJ2 = f.j(aVar, 12.0f, 0.0f, 0.0f, 0.0f, 14);
                boolean zK = cVarH.K(strI);
                Object objV = cVarH.v();
                if (zK || objV == b.a.a) {
                    objV = new wq9(strI, 3);
                    cVarH.p(objV);
                }
                ev6.b(fv6Var, b5e.b(eVarJ2, false, (Function1) objV), null, zq6.Sm, j, null, cVarH, 3078, 36);
                cif.b(ak2.I(R.string.search_overlay_add_a_valid_city_and_state, cVarH), f.j(aVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.g, eVar.h.c.a, 0L, null, null, null, 0L, 0, 0L, null, null, 0, 16777214), cVarH, 0, 0, 65532);
                cVarH = cVarH;
                cVarH.U(true);
                cVarH.U(false);
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new rj4(azgVar, i, 9);
        }
    }
}
