package defpackage;

import android.webkit.WebView;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.viewinterop.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class qw9 {
    public static final void a(final gu5<? extends WebView> gu5Var, final gu5<j6g> gu5Var2, final gu5<j6g> gu5Var3, final gu5<j6g> gu5Var4, final twg twgVar, final boolean z, final gu5<j6g> gu5Var5, b bVar, final int i) {
        gu5<j6g> gu5Var6;
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        gu5Var4.getClass();
        twgVar.getClass();
        gu5Var5.getClass();
        c cVarH = bVar.h(693018626);
        int i2 = 2;
        int i3 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= cVarH.x(gu5Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            gu5Var6 = gu5Var3;
            i3 |= cVarH.x(gu5Var6) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        } else {
            gu5Var6 = gu5Var3;
        }
        if ((i & 3072) == 0) {
            i3 |= cVarH.x(gu5Var4) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        int i4 = i3 | (cVarH.x(twgVar) ? 16384 : 8192);
        if ((196608 & i) == 0) {
            i4 |= cVarH.a(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= cVarH.x(gu5Var5) ? 1048576 : 524288;
        }
        int i5 = i4;
        if (cVarH.o(i5 & 1, (i5 & 599187) != 599186)) {
            final o97 o97Var = (o97) cVarH.M(p97.a);
            float f = o97Var.h.a;
            e eVarH = ygg.h(e.a.b, ggd.b(f, f, 0.0f, 0.0f));
            ah2 ah2VarC = bh2.c(940339015, new ax4(i2, o97Var, twgVar, gu5Var2), cVarH);
            final gu5<j6g> gu5Var7 = gu5Var6;
            pmd.a(eVarH, null, ah2VarC, null, null, null, 0, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, bh2.c(736137152, new wu5() { // from class: ow9
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
                        e.a aVar = e.a.b;
                        e eVarE = f.e(g.d(aVar, 1.0f), gzaVar);
                        ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC = androidx.compose.ui.c.c(bVar2, eVarE);
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
                        ygg.y(bVar2, ob2VarA, gl2.a.g);
                        ygg.y(bVar2, t8bVarM, gl2.a.f);
                        gl2.a.C0251a c0251a = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a);
                        }
                        ygg.y(bVar2, eVarC, gl2.a.d);
                        twg twgVar2 = twgVar;
                        boolean z2 = twgVar2.g().b;
                        b.a.C0020a c0020a = b.a.a;
                        if (z2) {
                            bVar2.L(333394278);
                            dx4 dx4Var = new dx4(twgVar2.g().c, 95);
                            Object objV = bVar2.v();
                            if (objV == c0020a) {
                                objV = new l7(14);
                                bVar2.p(objV);
                            }
                            ee3.g(dx4Var, gu5Var7, gu5Var4, (gu5) objV, false, bVar2, 27648);
                            bVar2 = bVar2;
                            bVar2.F();
                        } else {
                            bVar2.L(333878188);
                            gu5 gu5Var8 = gu5Var;
                            boolean zK = bVar2.K(gu5Var8);
                            Object objV2 = bVar2.v();
                            if (zK || objV2 == c0020a) {
                                objV2 = new j91(gu5Var8, 11);
                                bVar2.p(objV2);
                            }
                            a.a((Function1) objV2, androidx.compose.ui.platform.f.a(androidx.compose.foundation.a.b(g.d(aVar, 1.0f), o97Var.c.b.g.a, ytc.a), "WebViewContainer"), null, bVar2, 0, 4);
                            bVar2.F();
                        }
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, 384, 131066);
            cVarH = cVarH;
            if (z) {
                cVarH.L(-186019164);
                tz6.a(((i5 << 3) & 29360128) | 390, 888, null, gu5Var5, fv6.q4, cVarH, null, ak2.I(R.string.failed_to_find_email_app, cVarH), null, null, null, true);
            } else {
                cVarH.L(-192348992);
            }
            cVarH.U(false);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: pw9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qw9.a(gu5Var, gu5Var2, gu5Var3, gu5Var4, twgVar, z, gu5Var5, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }
}
