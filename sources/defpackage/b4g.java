package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.ft2;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.saa;
import defpackage.sp7;
import defpackage.vs0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class b4g {
    public static final jte a = new jte(new k7(20));

    public static final void a(final int i, final gu5 gu5Var, b bVar, final String str, final boolean z) {
        c cVarH = bVar.h(1620406812);
        int i2 = (cVarH.a(z) ? 4 : 2) | i | (cVarH.K(str) ? 32 : 16) | 384 | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            String strK = z3.k(cVarH, -1862172997, R.string.uip_topnav_back_arrow_a11y_description, cVarH, false);
            e eVarA = f.a(e.a.b, "BackButton");
            boolean z2 = (i2 & 7168) == 2048;
            Object objV = cVarH.v();
            if (z2 || objV == b.a.a) {
                objV = new ta(8, gu5Var);
                cVarH.p(objV);
            }
            o(eVarA, str, "BackButton", (gu5) objV, z, strK, null, mk2.a, cVarH, (i2 & 112) | 12583302 | ((i2 << 12) & 57344), 64);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(i, gu5Var, str, z) { // from class: n3g
                public final /* synthetic */ boolean a;
                public final /* synthetic */ String b;
                public final /* synthetic */ gu5 c;

                {
                    this.a = z;
                    this.b = str;
                    this.c = gu5Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b4g.a(ka2.L(1), this.c, (b) obj, this.b, this.a);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(int i, gu5 gu5Var, b bVar, String str, boolean z) {
        c cVarH = bVar.h(-421773049);
        int i2 = (cVarH.a(z) ? 4 : 2) | i | (cVarH.K(str) ? 32 : 16) | 384 | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            String strK = z3.k(cVarH, -1596967288, R.string.uip_topnav_close_button_a11y_description, cVarH, false);
            e eVarA = f.a(e.a.b, "CloseButton");
            boolean z2 = (i2 & 7168) == 2048;
            Object objV = cVarH.v();
            if (z2 || objV == b.a.a) {
                objV = new js(7, gu5Var);
                cVarH.p(objV);
            }
            o(eVarA, str, "CloseButton", (gu5) objV, z, strK, null, mk2.b, cVarH, (i2 & 112) | 12583302 | ((i2 << 12) & 57344), 64);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new h5a(i, gu5Var, str, z);
        }
    }

    public static final void c(String str, Bitmap bitmap, String str2, gu5 gu5Var, boolean z, Integer num, b bVar, int i) {
        c cVarH = bVar.h(-1570025081);
        int i2 = i | (cVarH.K(str) ? 4 : 2) | (cVarH.x(bitmap) ? 32 : 16) | (cVarH.K(str2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.a(z) ? 16384 : 8192) | (cVarH.K(num) ? 131072 : 65536) | 1572864;
        if (cVarH.o(i2 & 1, (599187 & i2) != 599186)) {
            int i3 = (int) (24.0f * ((Context) cVarH.M(AndroidCompositionLocals_androidKt.b)).getResources().getDisplayMetrics().density);
            o(f.a(e.a.b, l5.l("CustomButton-", str)), str2, str, gu5Var, z, str, num, bh2.c(-1236242491, new ed(Bitmap.createScaledBitmap(bitmap, i3, i3, true), 13), cVarH), cVarH, ((i2 >> 3) & 112) | 12582912 | ((i2 << 6) & 896) | (i2 & 7168) | (57344 & i2) | ((i2 << 15) & 458752) | ((i2 << 3) & 3670016), 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new uqb(str, bitmap, str2, gu5Var, z, num, i);
        }
    }

    public static final void d(final String str, final int i, final String str2, final gu5 gu5Var, final boolean z, final Integer num, b bVar, final int i2) {
        c cVarH = bVar.h(-2075425496);
        int i3 = i2 | (cVarH.K(str) ? 4 : 2) | (cVarH.d(i) ? 32 : 16) | (cVarH.K(str2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.a(z) ? 16384 : 8192) | (cVarH.K(num) ? 131072 : 65536) | 1572864;
        if (cVarH.o(i3 & 1, (599187 & i3) != 599186)) {
            o(f.a(e.a.b, l5.l("CustomIconButton-", str)), str2, str, gu5Var, z, str, num, bh2.c(-318099798, new Function2() { // from class: v3g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    b bVar2 = (b) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                        vq6.b(z2b.a(i, 0, bVar2), null, g.n(e.a.b, 24.0f), 0L, bVar2, 432, 8);
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, ((i3 >> 3) & 112) | 12582912 | ((i3 << 6) & 896) | (i3 & 7168) | (57344 & i3) | ((i3 << 15) & 458752) | ((i3 << 3) & 3670016), 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(str, i, str2, gu5Var, z, num, i2) { // from class: w3g
                public final /* synthetic */ String a;
                public final /* synthetic */ int b;
                public final /* synthetic */ String c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ Integer f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    b4g.d(this.a, this.b, this.c, this.d, this.e, this.f, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void e(final String str, fv6 fv6Var, final String str2, final gu5 gu5Var, final long j, final boolean z, final Integer num, final String str3, b bVar, final int i) {
        final fv6 fv6Var2;
        c cVar;
        c cVarH = bVar.h(-1410140244);
        int i2 = i | (cVarH.K(str) ? 4 : 2) | (cVarH.d(fv6Var.ordinal()) ? 32 : 16) | (cVarH.K(str2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.e(j) ? 16384 : 8192) | (cVarH.a(z) ? 131072 : 65536) | (cVarH.K(num) ? 1048576 : 524288) | (cVarH.K(str3) ? 8388608 : 4194304);
        if (cVarH.o(i2 & 1, (4793491 & i2) != 4793490)) {
            fv6Var2 = fv6Var;
            int i3 = i2 >> 3;
            cVar = cVarH;
            o(f.a(e.a.b, l5.l("CustomIdlIconButton-", str3 == null ? str : str3)), str2, str, gu5Var, z, str, num, bh2.c(928006762, new Function2() { // from class: r3g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    b bVar2 = (b) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ev6.a(fv6Var2, null, null, null, j, "", null, bVar2, 196608, 78);
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVar, (i3 & 57344) | (i3 & 112) | 12582912 | ((i2 << 6) & 896) | (i2 & 7168) | ((i2 << 15) & 458752) | (i2 & 3670016), 0);
        } else {
            fv6Var2 = fv6Var;
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            final fv6 fv6Var3 = fv6Var2;
            iVarW.d = new Function2(str, fv6Var3, str2, gu5Var, j, z, num, str3, i) { // from class: s3g
                public final /* synthetic */ Integer V;
                public final /* synthetic */ String W;
                public final /* synthetic */ String a;
                public final /* synthetic */ fv6 b;
                public final /* synthetic */ String c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ long e;
                public final /* synthetic */ boolean f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    b4g.e(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void f(int i, gu5 gu5Var, b bVar, String str, boolean z) {
        boolean z2;
        c cVarH = bVar.h(369093425);
        int i2 = (cVarH.a(z) ? 4 : 2) | i | (cVarH.K(str) ? 32 : 16) | (cVarH.x(gu5Var) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            String strI = ak2.I(R.string.uip_topnav_indeed_logo_description, cVarH);
            e eVarA = f.a(g.c(g.r(e.a.b, 75.0f), 1.0f), "LogoButton");
            boolean z3 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objV = cVarH.v();
            if (z3 || objV == b.a.a) {
                objV = new ti(12, str, gu5Var);
                cVarH.p(objV);
            }
            z2 = z;
            rq6.b((gu5) objV, eVarA, z2, null, null, bh2.c(-25387980, new pj(strI, 15), cVarH), cVarH, ((i2 << 6) & 896) | 196656, 24);
        } else {
            z2 = z;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new to0(i, gu5Var, str, z2);
        }
    }

    public static final void g(final boolean z, final Integer num, final String str, final gu5<j6g> gu5Var, b bVar, final int i) {
        c cVarH = bVar.h(-1933592586);
        int i2 = i | (cVarH.a(z) ? 4 : 2) | (cVarH.K(num) ? 32 : 16) | (cVarH.K(str) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            o(f.a(e.a.b, "ProfileButton"), str, "ProfileButton", gu5Var, z, ak2.I(R.string.uip_topnav_profile_icon_description, cVarH), num, mk2.c, cVarH, ((i2 >> 3) & 112) | 12583302 | (i2 & 7168) | ((i2 << 12) & 57344) | ((i2 << 15) & 3670016), 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, num, str, gu5Var, i) { // from class: q3g
                public final /* synthetic */ boolean a;
                public final /* synthetic */ Integer b;
                public final /* synthetic */ String c;
                public final /* synthetic */ gu5 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    b4g.g(this.a, this.b, this.c, this.d, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void h(List<raa> list, b bVar, int i) {
        c cVarH = bVar.h(652342950);
        int i2 = (cVarH.x(list) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            raa raaVar = null;
            Object obj = null;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (wl7.b(((raa) next).a, saa.a.a)) {
                        obj = next;
                        break;
                    }
                }
                raaVar = (raa) obj;
            }
            if (raaVar == null) {
                cVarH.L(-778038615);
            } else {
                cVarH.L(-778038614);
                a(0, raaVar.f, cVarH, raaVar.b, raaVar.e);
            }
            cVarH.U(false);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new v02(list, i, 9);
        }
    }

    public static final void i(List<raa> list, b bVar, int i) {
        c cVarH = bVar.h(941807);
        int i2 = (cVarH.x(list) ? 4 : 2) | i;
        int i3 = 1;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            raa raaVar = null;
            Object obj = null;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (wl7.b(((raa) next).a, saa.b.a)) {
                        obj = next;
                        break;
                    }
                }
                raaVar = (raa) obj;
            }
            if (raaVar == null) {
                cVarH.L(-2007244261);
            } else {
                cVarH.L(-2007244260);
                b(0, raaVar.f, cVarH, raaVar.b, raaVar.e);
            }
            cVarH.U(false);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new xve(list, i, i3);
        }
    }

    public static final void j(raa raaVar, b bVar, int i) {
        c cVar;
        gu5<j6g> gu5Var;
        c cVar2;
        String str;
        c cVarH = bVar.h(1138007595);
        int i2 = (cVarH.K(raaVar) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            saa saaVar = raaVar.a;
            boolean z = raaVar.e;
            gu5<j6g> gu5Var2 = raaVar.f;
            String str2 = raaVar.c;
            boolean z2 = saaVar instanceof saa.f;
            e.a aVar = e.a.b;
            af1.b bVar2 = c20.a.j;
            vs0.j jVar = vs0.a;
            if (z2) {
                cVarH.L(-2087378103);
                e eVarJ = androidx.compose.foundation.layout.f.j(aVar, 22.0f, 0.0f, 0.0f, 0.0f, 14);
                ehd ehdVarA = chd.a(jVar, bVar2, cVarH, 0);
                int iG = cVarH.G();
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
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                    ja.h(iG, cVarH, iG, c0251a);
                }
                ygg.y(cVarH, eVarC, gl2.a.d);
                f(0, gu5Var2, cVarH, raaVar.b, z);
                cVarH.U(true);
                cVarH.U(false);
            } else {
                boolean z3 = saaVar instanceof saa.c;
                b.a.C0020a c0020a = b.a.a;
                if (z3) {
                    cVarH.L(-2087062027);
                    String str3 = str2 == null ? "" : str2;
                    String str4 = raaVar.b;
                    if (gu5Var2 == null) {
                        cVarH.L(-2086864619);
                        Object objV = cVarH.v();
                        if (objV == c0020a) {
                            objV = new lz(22);
                            cVarH.p(objV);
                        }
                        gu5Var2 = (gu5) objV;
                    } else {
                        cVarH.L(-1591339363);
                    }
                    cVarH.U(false);
                    c(str3, null, str4, gu5Var2, raaVar.e, raaVar.d, cVarH, 0);
                    cVarH.U(false);
                } else if (saaVar instanceof saa.d) {
                    cVarH.L(-2086697901);
                    if (str2 == null) {
                        str2 = "";
                    }
                    int i3 = ((saa.d) saaVar).a;
                    String str5 = raaVar.b;
                    if (gu5Var2 == null) {
                        cVarH.L(-2086498571);
                        Object objV2 = cVarH.v();
                        if (objV2 == c0020a) {
                            objV2 = new mz(17);
                            cVarH.p(objV2);
                        }
                        gu5Var2 = (gu5) objV2;
                    } else {
                        cVarH.L(-1591327555);
                    }
                    cVarH.U(false);
                    d(str2, i3, str5, gu5Var2, raaVar.e, raaVar.d, cVarH, 0);
                    cVarH.U(false);
                } else if (saaVar instanceof saa.e) {
                    cVarH.L(-2086324909);
                    String str6 = str2 == null ? ((saa.e) saaVar).b : str2;
                    saa.e eVar = (saa.e) saaVar;
                    fv6 fv6Var = eVar.a;
                    long j = eVar.c;
                    String str7 = raaVar.b;
                    if (gu5Var2 == null) {
                        cVarH.L(-2086058123);
                        Object objV3 = cVarH.v();
                        if (objV3 == c0020a) {
                            objV3 = new cp0(19);
                            cVarH.p(objV3);
                        }
                        gu5Var2 = (gu5) objV3;
                    } else {
                        cVarH.L(-1591313347);
                    }
                    cVarH.U(false);
                    boolean z4 = raaVar.e;
                    Integer num = raaVar.d;
                    if (str2 == null) {
                        cVar2 = cVarH;
                        str = eVar.d;
                    } else {
                        cVar2 = cVarH;
                        str = str2;
                    }
                    e(str6, fv6Var, str7, gu5Var2, j, z4, num, str, cVar2, 0);
                    cVarH = cVar2;
                    cVarH.U(false);
                } else if (saaVar instanceof saa.h) {
                    cVarH.L(-2085830366);
                    String str8 = str2 == null ? "" : str2;
                    saa.h hVar = (saa.h) saaVar;
                    String str9 = hVar.a;
                    int i4 = hVar.b;
                    int i5 = hVar.c;
                    float f = hVar.d;
                    String str10 = raaVar.b;
                    if (gu5Var2 == null) {
                        cVarH.L(-2085498635);
                        Object objV4 = cVarH.v();
                        if (objV4 == c0020a) {
                            objV4 = new dp0(13);
                            cVarH.p(objV4);
                        }
                        cVarH.U(false);
                        cVar = cVarH;
                        gu5Var = (gu5) objV4;
                    } else {
                        cVarH.L(-1591295299);
                        cVarH.U(false);
                        cVar = cVarH;
                        gu5Var = gu5Var2;
                    }
                    k(str8, str9, i4, i5, f, str10, gu5Var, false, cVar, 0);
                    cVarH = cVar;
                    cVarH.U(false);
                } else if (saaVar instanceof saa.g) {
                    cVarH.L(-2085423336);
                    g(raaVar.e, raaVar.d, raaVar.b, raaVar.f, cVarH, 0);
                    cVarH.U(false);
                } else if (saaVar instanceof saa.j) {
                    cVarH.L(-2085161231);
                    o97.g gVar = o97Var.i;
                    e eVarJ2 = androidx.compose.foundation.layout.f.j(aVar, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                    ehd ehdVarA2 = chd.a(jVar, bVar2, cVarH, 0);
                    int iG2 = cVarH.G();
                    t8b t8bVarP2 = cVarH.P();
                    e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarJ2);
                    gl2.j.getClass();
                    pm8.a aVar3 = gl2.a.b;
                    cVarH.B();
                    if (cVarH.S) {
                        cVarH.y(aVar3);
                    } else {
                        cVarH.n();
                    }
                    ygg.y(cVarH, ehdVarA2, gl2.a.g);
                    ygg.y(cVarH, t8bVarP2, gl2.a.f);
                    gl2.a.C0251a c0251a2 = gl2.a.j;
                    if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG2))) {
                        ja.h(iG2, cVarH, iG2, c0251a2);
                    }
                    ygg.y(cVarH, eVarC2, gl2.a.d);
                    m(0, gu5Var2, cVarH, z);
                    cVarH.U(true);
                    cVarH.U(false);
                } else if (saaVar instanceof saa.i) {
                    cVarH.L(-2084895964);
                    cVarH.U(false);
                } else if (saaVar instanceof saa.a) {
                    cVarH.L(-2084744901);
                    cVarH.U(false);
                } else {
                    if (!(saaVar instanceof saa.b)) {
                        cVarH.L(-1591355137);
                        cVarH.U(false);
                        l.g();
                        return;
                    }
                    cVarH.L(-2084645701);
                    cVarH.U(false);
                }
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new xd(raaVar, i, 20);
        }
    }

    public static final void k(final String str, final String str2, final int i, final int i2, final float f, final String str3, final gu5 gu5Var, boolean z, b bVar, final int i3) {
        boolean z2;
        c cVarF = q6.f(-1267661517, gu5Var, bVar, str2);
        int i4 = i3 | (cVarF.K(str) ? 4 : 2) | (cVarF.K(str2) ? 32 : 16) | (cVarF.d(i) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarF.d(i2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarF.c(f) ? 16384 : 8192) | (cVarF.K(str3) ? 131072 : 65536) | (cVarF.x(gu5Var) ? 1048576 : 524288) | 918552576;
        if (cVarF.o(i4 & 1, (306783379 & i4) != 306783378)) {
            z2 = true;
            o(f.a(e.a.b, "CustomIconButton-".concat(str)), str3, str, gu5Var, true, str, null, bh2.c(-813832335, new Function2() { // from class: o3g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    b bVar2 = (b) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                        kv0 kv0VarA = mv0.a(str2, aie.a((Context) bVar2.M(AndroidCompositionLocals_androidKt.b)), kv0.j0, null, ft2.a.b, bVar2, 0, 0);
                        float f2 = i;
                        float f3 = f;
                        f17.a(kv0VarA, null, g.h(g.r(e.a.b, f2 * f3), i2 * f3), null, null, 0.0f, null, bVar2, 48, 120);
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarF), cVarF, ((i4 << 15) & 458752) | ((i4 >> 12) & 112) | 12582912 | ((i4 << 6) & 896) | ((i4 >> 9) & 7168) | 24576 | 1572864, 0);
        } else {
            cVarF.D();
            z2 = z;
        }
        i iVarW = cVarF.W();
        if (iVarW != null) {
            final boolean z3 = z2;
            iVarW.d = new Function2(str, str2, i, i2, f, str3, gu5Var, z3, i3) { // from class: p3g
                public final /* synthetic */ gu5 V;
                public final /* synthetic */ boolean W;
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ float e;
                public final /* synthetic */ String f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    b4g.k(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void l(e eVar, boolean z, String str, gu5<j6g> gu5Var, b bVar, int i, int i2) {
        e eVar2;
        int i3;
        c cVar;
        c cVarH = bVar.h(598217106);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            eVar2 = eVar;
        } else {
            eVar2 = eVar;
            i3 = i | (cVarH.K(eVar2) ? 4 : 2);
        }
        int i5 = i3 | (cVarH.a(z) ? 32 : 16) | (cVarH.K(str) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i5 & 1, (i5 & 1171) != 1170)) {
            e.a aVar = e.a.b;
            e eVar3 = i4 != 0 ? aVar : eVar2;
            o97 o97Var = (o97) cVarH.M(p97.a);
            o97.f fVar = o97Var.h;
            o97.a aVar2 = o97Var.c;
            o97.a.e eVar4 = aVar2.a;
            fgd fgdVarA = ggd.a(fVar.b);
            String strI = ak2.I(R.string.uip_topnav_find_jobs, cVarH);
            e eVarA = ti1.a(ygg.h(g.h(g.f(eVar3, 1.0f), 44.0f), fgdVarA), 1.0f, aVar2.c.b, fgdVarA);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = v40.a(cVarH);
            }
            d3a d3aVar = (d3a) objV;
            udd uddVarB = rdd.b(0L, 7, 0.0f);
            qed qedVar = new qed(0);
            boolean z2 = ((i5 & 7168) == 2048) | ((i5 & 896) == 256);
            Object objV2 = cVarH.v();
            if (z2 || objV2 == c0020a) {
                objV2 = new pa0(12, str, gu5Var);
                cVarH.p(objV2);
            }
            e eVarA2 = androidx.compose.foundation.b.a(eVarA, d3aVar, uddVarB, z, strI, qedVar, (gu5) objV2);
            boolean zK = cVarH.K(strI);
            Object objV3 = cVarH.v();
            if (zK || objV3 == c0020a) {
                objV3 = new qz4(strI, 3);
                cVarH.p(objV3);
            }
            e eVarA3 = f.a(ygg.g(b5e.b(eVarA2, false, (Function1) objV3), z ? 1.0f : 0.4f), "SearchBarButton");
            ehd ehdVarA = chd.a(vs0.a, c20.a.k, cVarH, 48);
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarA3);
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
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            ev6.a(fv6.C8, androidx.compose.foundation.layout.f.j(aVar, 12.0f, 0.0f, 6.0f, 0.0f, 10), null, null, eVar4.c, "", null, cVarH, 196614, 76);
            cif.b(strI, null, eVar4.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.f, cVarH, 0, 0, 65530);
            cVar = cVarH;
            cVar.U(true);
            eVar2 = eVar3;
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new xha(eVar2, z, str, gu5Var, i, i2);
        }
    }

    public static final void m(final int i, final gu5 gu5Var, b bVar, final boolean z) {
        c cVarH = bVar.h(810617288);
        int i2 = (cVarH.a(z) ? 4 : 2) | i | 48 | (cVarH.x(gu5Var) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            String strK = z3.k(cVarH, 1614141360, R.string.uip_topnav_reg_promo_sign_in_button_description, cVarH, false);
            boolean z2 = (i2 & 896) == 256;
            Object objV = cVarH.v();
            if (z2 || objV == b.a.a) {
                objV = new di(13, gu5Var);
                cVarH.p(objV);
            }
            gt6.h(strK, (gu5) objV, null, null, !z, false, fv6.o7, null, "SignInButton", cVarH, 102236160, 172);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(i, gu5Var, z) { // from class: u3g
                public final /* synthetic */ boolean a;
                public final /* synthetic */ gu5 b;

                {
                    this.a = z;
                    this.b = gu5Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b4g.m(ka2.L(1), this.b, (b) obj, this.a);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void n(final sof sofVar, final List list, final List list2, final long j, final mzg mzgVar, final String str, b bVar, final int i) {
        int i2;
        c cVar;
        vmf vmfVar;
        raa raaVar;
        int i3;
        Object next;
        c cVarH = bVar.h(571846500);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(sofVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(list2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.e(j) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.K(mzgVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.K(str) ? 131072 : 65536;
        }
        if (cVarH.o(i2 & 1, (74899 & i2) != 74898)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            final boolean zBooleanValue = ((Boolean) cVarH.M(uf7.a)).booleanValue();
            boolean zA = cVarH.a(zBooleanValue);
            Object objV = cVarH.v();
            if (zA || objV == b.a.a) {
                objV = new Function1() { // from class: m3g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        String str2 = (String) obj;
                        str2.getClass();
                        if (zBooleanValue) {
                            Log.w("UIPTopNavBar", str2);
                        } else {
                            ArrayList arrayList = lz2.a;
                            lz2.h("UIPTopNavBar", str2, null, 12);
                        }
                        return j6g.a;
                    }
                };
                cVarH.p(objV);
            }
            Function1 function1 = (Function1) objV;
            String str2 = str == null ? "TopNavBarContent" : str;
            if (sofVar == null || (vmfVar = sofVar.b) == null) {
                vmfVar = vmf.b;
            }
            Object obj = null;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (wl7.b(((raa) next).a, saa.i.a)) {
                            break;
                        }
                    }
                }
                raaVar = (raa) next;
            } else {
                raaVar = null;
            }
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        i3 = i2;
                        break;
                    }
                    Object next2 = it2.next();
                    i3 = i2;
                    if (wl7.b(((raa) next2).a, saa.i.a)) {
                        obj = next2;
                        break;
                    }
                    i2 = i3;
                }
                obj = (raa) obj;
            } else {
                i3 = i2;
            }
            raa raaVar2 = raaVar == null ? obj : raaVar;
            vmf vmfVar2 = vmf.a;
            e.a aVar = e.a.b;
            int i4 = 3;
            if (vmfVar != vmfVar2 || sofVar == null) {
                cVar = cVarH;
                cVar.L(2043166579);
                qi0.a(bh2.c(739139131, new vxb(raaVar2, o97Var, sofVar), cVar), f.a(aVar, str2.concat("-CenteredTitle")), bh2.c(1344913913, new fr2(list, 10), cVar), bh2.c(-1827499216, new qy4(o97Var, list2, function1, 2), cVar), 0.0f, mzgVar, r(j, cVar, (i3 >> 9) & 14), cVar, ((i3 << 3) & 458752) | 3462, 144);
                cVar.U(false);
            } else {
                cVarH.L(2039840496);
                qi0.c(bh2.c(203586477, new va(i4, o97Var, raaVar2, sofVar), cVarH), f.a(aVar, str2.concat("-LeadingTitle")), bh2.c(-1719663953, new ct(list, 15), cVarH), bh2.c(101567960, new m1c(1, o97Var, list2, function1), cVarH), 0.0f, mzgVar, r(j, cVarH, (i3 >> 9) & 14), cVarH, ((i3 << 3) & 458752) | 3462, 144);
                cVar = cVarH;
                cVar.U(false);
            }
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: l3g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    b4g.n(sofVar, list, list2, j, mzgVar, str, (b) obj2, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void o(final e eVar, String str, String str2, gu5 gu5Var, final boolean z, final String str3, Integer num, final ah2 ah2Var, b bVar, final int i, final int i2) {
        int i3;
        final boolean z2;
        Integer num2;
        c cVar;
        final Integer num3;
        boolean z3;
        final e eVar2 = eVar;
        final String str4 = str;
        final String str5 = str2;
        final gu5 gu5Var2 = gu5Var;
        c cVarH = bVar.h(-1821093611);
        if ((i & 6) == 0) {
            i3 = (cVarH.K(eVar2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cVarH.K(str4) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cVarH.K(str5) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i3 |= cVarH.x(gu5Var2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i3 |= cVarH.a(z2) ? 16384 : 8192;
        } else {
            z2 = z;
        }
        if ((i & 196608) == 0) {
            i3 |= cVarH.K(str3) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 != 0) {
            i3 |= 1572864;
            num2 = num;
        } else {
            num2 = num;
            if ((i & 1572864) == 0) {
                i3 |= cVarH.K(num2) ? 1048576 : 524288;
            }
        }
        if ((i & 12582912) == 0) {
            i3 |= cVarH.x(ah2Var) ? 8388608 : 4194304;
        }
        if (cVarH.o(i3 & 1, (i3 & 4793491) != 4793490)) {
            if (i4 != 0) {
                num2 = null;
            }
            Integer num4 = num2;
            final o97 o97Var = (o97) cVarH.M(p97.a);
            e eVarB = e.a.b;
            b.a.C0020a c0020a = b.a.a;
            if (str3 != null) {
                cVarH.L(1827499290);
                boolean z4 = (458752 & i3) == 131072;
                Object objV = cVarH.v();
                if (z4 || objV == c0020a) {
                    objV = new s54(str3, 1);
                    cVarH.p(objV);
                }
                z3 = false;
                eVarB = b5e.b(eVarB, false, (Function1) objV);
                cVarH.U(false);
            } else {
                z3 = false;
                cVarH.L(1827585749);
                cVarH.U(false);
            }
            if (num4 == null || num4.intValue() <= 0) {
                cVar = cVarH;
                boolean z5 = z3;
                cVar.L(1828287062);
                boolean z6 = ((i3 & 896) == 256 ? true : z5) | ((i3 & 112) == 32 ? true : z5) | ((i3 & 7168) == 2048 ? true : z5);
                Object objV2 = cVar.v();
                if (z6 || objV2 == c0020a) {
                    objV2 = new kl4(2, str4, str5, gu5Var2);
                    cVar.p(objV2);
                }
                rq6.b((gu5) objV2, eVar2.o(eVarB), z, pq6.a(0L, o97Var.c.a.c, 0L, 0L, cVar, 13), null, bh2.c(1724806900, new bu6(ah2Var), cVar), cVar, ((i3 >> 6) & 896) | 196608, 16);
                cVar.U(z5);
            } else {
                cVarH.L(1827675525);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(-10.0f)) << 32) | (((long) Float.floatToRawIntBits(10.0f)) & 4294967295L);
                final e eVar3 = eVarB;
                wu5 wu5Var = new wu5() { // from class: x3g
                    @Override // defpackage.wu5
                    public final Object q(Object obj, Object obj2, Object obj3) {
                        b bVar2 = (b) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((ml1) obj).getClass();
                        if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                            String str6 = str4;
                            boolean zK = bVar2.K(str6);
                            String str7 = str5;
                            boolean zK2 = zK | bVar2.K(str7);
                            gu5 gu5Var3 = gu5Var2;
                            boolean zK3 = zK2 | bVar2.K(gu5Var3);
                            Object objV3 = bVar2.v();
                            if (zK3 || objV3 == b.a.a) {
                                objV3 = new v6a(3, str6, str7, gu5Var3);
                                bVar2.p(objV3);
                            }
                            rq6.b((gu5) objV3, eVar.o(eVar3), z2, pq6.a(0L, o97Var.c.a.c, 0L, 0L, bVar2, 13), null, bh2.c(141023069, new ir9(ah2Var, 1), bVar2), bVar2, 196608, 16);
                        } else {
                            bVar2.D();
                        }
                        return j6g.a;
                    }
                };
                str4 = str4;
                eVar2 = eVar;
                gu5Var2 = gu5Var2;
                str5 = str5;
                cs6.c(null, true, jFloatToRawIntBits, null, bh2.c(-192228224, wu5Var, cVarH), cVarH, 25008, 9);
                cVar = cVarH;
                cVar.U(false);
            }
            num3 = num4;
        } else {
            cVar = cVarH;
            cVar.D();
            num3 = num2;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: y3g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b4g.o(eVar2, str4, str5, gu5Var2, z, str3, num3, ah2Var, (b) obj, ka2.L(i | 1), i2);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void p(java.util.List r29, final java.util.List r30, defpackage.sof r31, defpackage.da2 r32, boolean r33, androidx.compose.runtime.b r34, final int r35, final int r36) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b4g.p(java.util.List, java.util.List, sof, da2, boolean, androidx.compose.runtime.b, int, int):void");
    }

    public static final void q(String str, String str2) {
        tp7 tp7Var = (tp7) cr8.p(tp7.class);
        if (str == null) {
            str = "UIPTopNavBar";
        }
        tp7Var.b(new sp7.g(str, str2, null, null, 12));
    }

    public static final snf r(long j, b bVar, int i) {
        long j2 = ((o97) bVar.M(p97.a)).c.a.c;
        return tnf.a(j, j, j2, j2, j2, bVar, 0);
    }
}
