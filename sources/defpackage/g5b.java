package defpackage;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import androidx.compose.ui.viewinterop.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.webview.modal.ModalWebview;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.xzg;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class g5b {
    @SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
    public static final void a(final boolean z, final boolean z2, ex4 ex4Var, final gu5<j6g> gu5Var, final gu5<j6g> gu5Var2, final gu5<j6g> gu5Var3, final ModalWebview modalWebview, final boolean z3, final boolean z4, final gu5<j6g> gu5Var4, b bVar, final int i, final int i2) {
        int i3;
        boolean z5;
        int i4;
        gu5<j6g> gu5Var5;
        gu5<j6g> gu5Var6;
        boolean z6;
        gu5<j6g> gu5Var7;
        final ex4 ex4Var2;
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        gu5Var4.getClass();
        c cVarH = bVar.h(-1453277098);
        if ((i & 6) == 0) {
            i3 = (cVarH.a(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            z5 = z2;
            i3 |= cVarH.a(z5) ? 32 : 16;
        } else {
            z5 = z2;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 = i3 | 384;
        } else {
            i4 = i3 | (cVarH.d(ex4Var == null ? -1 : ex4Var.ordinal()) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        }
        if ((i & 3072) == 0) {
            i4 |= cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            gu5Var5 = gu5Var2;
            i4 |= cVarH.x(gu5Var5) ? 16384 : 8192;
        } else {
            gu5Var5 = gu5Var2;
        }
        if ((196608 & i) == 0) {
            gu5Var6 = gu5Var3;
            i4 |= cVarH.x(gu5Var6) ? 131072 : 65536;
        } else {
            gu5Var6 = gu5Var3;
        }
        int i6 = i4 | (cVarH.x(modalWebview) ? 1048576 : 524288);
        if ((12582912 & i) == 0) {
            z6 = z3;
            i6 |= cVarH.a(z6) ? 8388608 : 4194304;
        } else {
            z6 = z3;
        }
        if ((100663296 & i) == 0) {
            i6 |= cVarH.a(z4) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            gu5Var7 = gu5Var4;
            i6 |= cVarH.x(gu5Var7) ? 536870912 : 268435456;
        } else {
            gu5Var7 = gu5Var4;
        }
        if (cVarH.o(i6 & 1, (306783379 & i6) != 306783378)) {
            final ex4 ex4Var3 = i5 != 0 ? ex4.c : ex4Var;
            final o97 o97Var = (o97) cVarH.M(p97.a);
            WeakHashMap<View, xzg> weakHashMap = xzg.v;
            final float fK1 = ((iy3) cVarH.M(um2.h)).k1(xzg.a.c(cVarH).f.e().b);
            final boolean z7 = z5;
            final gu5<j6g> gu5Var8 = gu5Var5;
            final gu5<j6g> gu5Var9 = gu5Var6;
            final boolean z8 = z6;
            ex4 ex4Var4 = ex4Var3;
            pmd.a(null, null, bh2.c(1240917787, new Function2() { // from class: d5b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    b bVar2 = (b) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                        o97 o97Var2 = o97Var;
                        ri0.c(f.a(androidx.compose.foundation.layout.f.j(g.f(e.a.b, 1.0f), 0.0f, fK1, 0.0f, 0.0f, 13), "TopAppBar"), yid.b, bh2.c(-1790118324, new wl1(2, gu5Var, o97Var2), bVar2), o97Var2.c.b.a, 0L, 0.0f, bVar2, 1576326);
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), null, null, null, 0, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, bh2.c(-759632620, new wu5() { // from class: e5b
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    gza gzaVar = (gza) obj;
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    gzaVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= bVar2.K(gzaVar) ? 4 : 2;
                    }
                    if (bVar2.o(iIntValue & 1, (iIntValue & 19) != 18)) {
                        e eVarE = androidx.compose.foundation.layout.f.e(e.a.b, gzaVar);
                        ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC = androidx.compose.ui.c.c(bVar2, eVarE);
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
                        b3c.a(z8, bVar2, 0);
                        if (z) {
                            bVar2.L(1523343991);
                            g5b.b(modalWebview, bVar2, 0);
                        } else {
                            bVar2.L(1517656824);
                        }
                        bVar2.F();
                        if (z7) {
                            bVar2.L(1523464240);
                            dx4 dx4Var = new dx4(ex4Var3, 95);
                            Object objV = bVar2.v();
                            if (objV == b.a.a) {
                                objV = new qr0(11);
                                bVar2.p(objV);
                            }
                            ee3.g(dx4Var, gu5Var9, gu5Var8, (gu5) objV, false, bVar2, 27648);
                        } else {
                            bVar2.L(1517656824);
                        }
                        bVar2.F();
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, 384, 131067);
            if (z4) {
                cVarH.L(-1304976846);
                tz6.a(((i6 >> 6) & 29360128) | 390, 888, null, gu5Var7, fv6.q4, cVarH, null, ak2.I(R.string.failed_to_find_email_app, cVarH), null, null, null, true);
            } else {
                cVarH.L(-1311265940);
            }
            cVarH.U(false);
            ex4Var2 = ex4Var4;
        } else {
            cVarH.D();
            ex4Var2 = ex4Var;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: f5b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g5b.a(z, z2, ex4Var2, gu5Var, gu5Var2, gu5Var3, modalWebview, z3, z4, gu5Var4, (b) obj, ka2.L(i | 1), i2);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(ModalWebview modalWebview, b bVar, int i) {
        c cVarH = bVar.h(1636199316);
        int i2 = (cVarH.x(modalWebview) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            boolean zX = cVarH.x(modalWebview);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                objV = new hp0(modalWebview, 11);
                cVarH.p(objV);
            }
            a.a((Function1) objV, f.a(androidx.compose.foundation.a.b(g.c(g.f(e.a.b, 1.0f), 1.0f), o97Var.c.a.c, ytc.a), "PassportSignInModalWebview"), null, cVarH, 0, 4);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new kh(modalWebview, i, 8);
        }
    }
}
