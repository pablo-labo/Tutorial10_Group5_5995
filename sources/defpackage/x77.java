package defpackage;

import android.annotation.SuppressLint;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.webview.modal.ModalWebview;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class x77 {
    public static final void a(gu5<j6g> gu5Var, b bVar, int i) {
        gu5<j6g> gu5Var2;
        gu5Var.getClass();
        c cVarH = bVar.h(913326191);
        int i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            gu5Var2 = gu5Var;
            sq6.a(gu5Var2, f.a(g.n(e.a.b, 48.0f), "BackButton"), false, ka2.b, cVarH, (i2 & 14) | 24624, 12);
        } else {
            gu5Var2 = gu5Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new e24(i, 1, gu5Var2);
        }
    }

    @SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
    public static final void b(final boolean z, final boolean z2, final boolean z3, final boolean z4, ex4 ex4Var, final gu5<j6g> gu5Var, final gu5<j6g> gu5Var2, final gu5<j6g> gu5Var3, final gu5<j6g> gu5Var4, final gu5<j6g> gu5Var5, final ModalWebview modalWebview, final boolean z5, final boolean z6, final gu5<j6g> gu5Var6, b bVar, final int i, final int i2, final int i3) {
        int i4;
        gu5<j6g> gu5Var7;
        int i5;
        c cVar;
        final ex4 ex4Var2;
        boolean z7;
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        gu5Var4.getClass();
        gu5Var5.getClass();
        gu5Var6.getClass();
        c cVarH = bVar.h(-995207514);
        if ((i & 6) == 0) {
            i4 = (cVarH.a(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= cVarH.a(z2) ? 32 : 16;
        }
        int i6 = i & 384;
        int i7 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i6 == 0) {
            i4 |= cVarH.a(z3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= cVarH.a(z4) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        int i8 = i3 & 16;
        if (i8 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= cVarH.d(ex4Var == null ? -1 : ex4Var.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            gu5Var7 = gu5Var;
            i4 |= cVarH.x(gu5Var7) ? 131072 : 65536;
        } else {
            gu5Var7 = gu5Var;
        }
        if ((i & 1572864) == 0) {
            i4 |= cVarH.x(gu5Var2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= cVarH.x(gu5Var3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= cVarH.x(gu5Var4) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i5 = i4 | (cVarH.x(gu5Var5) ? 536870912 : 268435456);
        } else {
            i5 = i4;
        }
        int i9 = i2 | (cVarH.x(modalWebview) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i9 |= cVarH.a(z5) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (cVarH.a(z6)) {
                i7 = 256;
            }
            i9 |= i7;
        }
        if ((i2 & 3072) == 0) {
            i9 |= cVarH.x(gu5Var6) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        int i10 = i9;
        if (cVarH.o(i5 & 1, ((i5 & 306783379) == 306783378 && (i10 & 1171) == 1170) ? false : true)) {
            final ex4 ex4Var3 = i8 != 0 ? ex4.c : ex4Var;
            final o97 o97Var = (o97) cVarH.M(p97.a);
            final gu5<j6g> gu5Var8 = gu5Var7;
            ex4 ex4Var4 = ex4Var3;
            pmd.a(androidx.compose.ui.c.a(e.a.b, tf7.a, new b0h()), null, bh2.c(-2014013631, new Function2() { // from class: u77
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i11;
                    int i12;
                    b bVar2 = (b) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                        e.a aVar = e.a.b;
                        e eVarA = f.a(a.b(g.f(aVar, 1.0f), o97Var.c.b.a, ytc.a), "TopAppBar");
                        ag9 ag9VarD = hl1.d(c20.a.a, false);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC = androidx.compose.ui.c.c(bVar2, eVarA);
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
                        ygg.y(bVar2, ag9VarD, dVar);
                        gl2.a.f fVar = gl2.a.f;
                        ygg.y(bVar2, t8bVarM, fVar);
                        gl2.a.C0251a c0251a = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a);
                        }
                        gl2.a.e eVar = gl2.a.d;
                        ygg.y(bVar2, eVarC, eVar);
                        e eVarJ = androidx.compose.foundation.layout.f.j(g.f(aVar, 1.0f), 4.0f, 0.0f, 12.0f, 0.0f, 10);
                        boolean z8 = z;
                        ehd ehdVarA = chd.a(z8 ? vs0.g : vs0.b, c20.a.k, bVar2, 48);
                        int iHashCode2 = Long.hashCode(bVar2.k());
                        t8b t8bVarM2 = bVar2.m();
                        e eVarC2 = androidx.compose.ui.c.c(bVar2, eVarJ);
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
                        ygg.y(bVar2, ehdVarA, dVar);
                        ygg.y(bVar2, t8bVarM2, fVar);
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                            uz.g(iHashCode2, bVar2, iHashCode2, c0251a);
                        }
                        ygg.y(bVar2, eVarC2, eVar);
                        if (z8) {
                            bVar2.L(-2071100124);
                            x77.a(gu5Var8, bVar2, 0);
                        } else {
                            bVar2.L(-2076953141);
                        }
                        bVar2.F();
                        boolean z9 = z2;
                        if (z9) {
                            i11 = -620993664;
                            i12 = R.string.common_done;
                        } else {
                            i11 = -620992097;
                            i12 = R.string.webview_modal_cancel;
                        }
                        String strE = l.e(bVar2, i11, i12, bVar2);
                        boolean zA = bVar2.a(z9);
                        gu5 gu5Var9 = gu5Var3;
                        boolean zK = zA | bVar2.K(gu5Var9);
                        gu5 gu5Var10 = gu5Var2;
                        boolean zK2 = zK | bVar2.K(gu5Var10);
                        Object objV = bVar2.v();
                        if (zK2 || objV == b.a.a) {
                            objV = new qn4(z9, gu5Var9, gu5Var10, 2);
                            bVar2.p(objV);
                        }
                        gt6.m(strE, (gu5) objV, g.v(androidx.compose.foundation.layout.f.h(aVar, 4.0f, 0.0f, 2), c20.a.d, 2), vt6.Md, false, null, null, bVar2, 3072, 496);
                        bVar2.q();
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), null, null, null, 0, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, bh2.c(-819981784, new wu5() { // from class: v77
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((gza) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC = androidx.compose.ui.c.c(bVar2, e.a.b);
                        gl2.j.getClass();
                        pm8.a aVar = gl2.a.b;
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar);
                        } else {
                            bVar2.n();
                        }
                        ygg.y(bVar2, ob2VarA, gl2.a.g);
                        ygg.y(bVar2, t8bVarM, gl2.a.f);
                        gl2.a.C0251a c0251a = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a);
                        }
                        ygg.y(bVar2, eVarC, gl2.a.d);
                        b3c.a(z5, bVar2, 0);
                        if (z3) {
                            bVar2.L(692471311);
                            x77.c(modalWebview, bVar2, 0);
                        } else {
                            bVar2.L(685566960);
                        }
                        bVar2.F();
                        if (z4) {
                            bVar2.L(692589886);
                            dx4 dx4Var = new dx4(ex4Var3, 95);
                            Object objV = bVar2.v();
                            if (objV == b.a.a) {
                                objV = new zw(7);
                                bVar2.p(objV);
                            }
                            ee3.g(dx4Var, gu5Var5, gu5Var4, (gu5) objV, false, bVar2, 27648);
                        } else {
                            bVar2.L(685566960);
                        }
                        bVar2.F();
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, 384, 131066);
            cVar = cVarH;
            if (z6) {
                cVar.L(-64828416);
                tz6.a(((i10 << 12) & 29360128) | 390, 888, null, gu5Var6, fv6.q4, cVar, null, ak2.I(R.string.failed_to_find_email_app, cVar), null, null, null, true);
                z7 = false;
            } else {
                z7 = false;
                cVar.L(-72281188);
            }
            cVar.U(z7);
            ex4Var2 = ex4Var4;
        } else {
            cVar = cVarH;
            cVar.D();
            ex4Var2 = ex4Var;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: w77
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    int iL2 = ka2.L(i2);
                    x77.b(z, z2, z3, z4, ex4Var2, gu5Var, gu5Var2, gu5Var3, gu5Var4, gu5Var5, modalWebview, z5, z6, gu5Var6, (b) obj, iL, iL2, i3);
                    return j6g.a;
                }
            };
        }
    }

    public static final void c(ModalWebview modalWebview, b bVar, int i) {
        c cVarH = bVar.h(1318062600);
        int i2 = (cVarH.x(modalWebview) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            boolean zX = cVarH.x(modalWebview);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                objV = new tv(modalWebview, 12);
                cVarH.p(objV);
            }
            androidx.compose.ui.viewinterop.a.a((Function1) objV, f.a(a.b(g.c(g.f(e.a.b, 1.0f), 1.0f), pa2.a(R.color.ijs_aurora_neutral_background_200, cVarH), ytc.a), "IndeedApplyWebView"), null, cVarH, 0, 4);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new rj4(modalWebview, i, 4);
        }
    }
}
