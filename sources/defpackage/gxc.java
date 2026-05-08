package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.ft2;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class gxc {
    public static final void a(gu5<j6g> gu5Var, e eVar, b bVar, int i) {
        c cVarH = bVar.h(-1109971766);
        int i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            String strI = ak2.I(R.string.reg_promo_create_account_button_text, cVarH);
            o97.a aVar = o97Var.c;
            long j = aVar.c.b;
            o97.a.C0340a c0340a = aVar.b;
            long j2 = c0340a.a;
            long j3 = c0340a.f.a;
            boolean z = (i2 & 14) == 4;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new oy(5, gu5Var);
                cVarH.p(objV);
            }
            g(strI, j2, j, j3, (gu5) objV, "regPromoCreateAccountButton", eVar, cVarH, 1769472);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new fu(gu5Var, i, 3, eVar);
        }
    }

    public static final void b(final gu5 gu5Var, final gu5 gu5Var2, final gu5 gu5Var3, gu5 gu5Var4, final gu5 gu5Var5, final boolean z, b bVar, final int i) {
        int i2;
        final gu5 gu5Var6;
        c cVarH = bVar.h(-1344132270);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(gu5Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(gu5Var3) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.x(gu5Var4) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.x(gu5Var5) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.a(z) ? 131072 : 65536;
        }
        if (cVarH.o(i2 & 1, (74899 & i2) != 74898)) {
            final o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar = e.a.b;
            fif.b(ak2.I(R.string.reg_promo_footer_text_first_line, cVarH), g.f(aVar, 1.0f), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.h, cVarH, 48, 0, 65532);
            cVarH = cVarH;
            e eVarF = g.f(aVar, 1.0f);
            ah2 ah2VarC = bh2.c(443498701, new n0c(gu5Var, gu5Var2, gu5Var3, o97Var), cVarH);
            vs0.j jVar = vs0.a;
            zk5.a(eVarF, jVar, null, null, 0, 0, ah2VarC, cVarH, 1572918, 60);
            gu5Var6 = gu5Var4;
            zk5.a(g.f(aVar, 1.0f), jVar, null, null, 0, 0, bh2.c(981664374, new wu5(gu5Var5, o97Var, z) { // from class: fxc
                public final /* synthetic */ boolean b;
                public final /* synthetic */ gu5 c;

                {
                    this.b = z;
                }

                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((il5) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        gxc.h(R.string.reg_promo_footer_your_privacy_choices, this.a, "regPromoFooterLineThree", f.j(e.a.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), bVar2, 384, 0);
                        if (this.b) {
                            bVar2.L(331350986);
                            gxc.h(R.string.reg_promo_footer_text_secrecy_of_communications, this.c, "regPromoFooterSecrecyOfCommunications", null, bVar2, 384, 8);
                        } else {
                            bVar2.L(317541292);
                        }
                        bVar2.F();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, 1572918, 60);
        } else {
            gu5Var6 = gu5Var4;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            final gu5 gu5Var7 = gu5Var6;
            iVarW.d = new Function2() { // from class: axc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gxc.b(gu5Var, gu5Var2, gu5Var3, gu5Var7, gu5Var5, z, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void c(int i, String str, b bVar, int i2) {
        c cVarH = bVar.h(1012917042);
        int i3 = i2 | (cVarH.d(i) ? 4 : 2) | (cVarH.K(str) ? 32 : 16);
        if (cVarH.o(i3 & 1, (i3 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            int i4 = ((Configuration) cVarH.M(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
            tjf tjfVar = i4 < 360 ? o97Var.j.h : i4 < 400 ? o97Var.j.g : o97Var.j.f;
            o97.g gVar = o97Var.i;
            e.a aVar = e.a.b;
            e eVarF = f.f(aVar, 8.0f);
            ehd ehdVarA = chd.a(vs0.a, c20.a.k, cVarH, 48);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarF);
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
            f17.a(z2b.a(i, i3 & 14, cVarH), null, g.o(aVar, 30.0f, 24.0f), null, null, 0.0f, null, cVarH, 432, 120);
            jh2.f(cVarH, g.r(aVar, 16.0f));
            fif.b(str, null, o97Var.c.a.c, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(tjfVar, 0L, 0L, o97Var.f.c, null, null, 0L, 0, 0L, null, null, 132098, 14680059), cVarH, (i3 >> 3) & 14, 0, 65530);
            cVarH = cVarH;
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new dk7(i, i2, str);
        }
    }

    public static final void d(gu5 gu5Var, gu5 gu5Var2, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(-472935232);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(gu5Var2) ? 32 : 16;
        }
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar = e.a.b;
            e eVarF = g.f(aVar, 1.0f);
            o97.g gVar = o97Var.i;
            ob2 ob2VarA = mb2.a(new vs0.i(8.0f, true, new us0(0)), c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarF);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
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
            e eVarF2 = g.f(aVar, 1.0f);
            boolean z = (i2 & 14) == 4;
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (z || objV == c0020a) {
                objV = new ni(7, gu5Var);
                cVarH.p(objV);
            }
            k((gu5) objV, eVarF2, cVarH, 48);
            boolean z2 = (i2 & 112) == 32;
            Object objV2 = cVarH.v();
            if (z2 || objV2 == c0020a) {
                objV2 = new xa(8, gu5Var2);
                cVarH.p(objV2);
            }
            a((gu5) objV2, eVarF2, cVarH, 48);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new oe0(gu5Var, i, 2, gu5Var2);
        }
    }

    public static final void e(int i, b bVar) {
        c cVarH = bVar.h(571287201);
        if (cVarH.o(i & 1, i != 0)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            boolean z = ((Configuration) cVarH.M(AndroidCompositionLocals_androidKt.a)).screenWidthDp < 360;
            e.a aVar = e.a.b;
            e eVarB = a.b(g.f(aVar, 1.0f), da2.e, ggd.a(16.0f));
            o97.g gVar = o97Var.i;
            e eVarG = f.g(eVarB, 20.0f, 16.0f);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.n, cVarH, 48);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarG);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
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
            f17.a(z2b.a(R.drawable.indeed_logo_katakana, 0, cVarH), ak2.I(R.string.reg_promo_indeed_logo_content_description, cVarH), g.h(g.r(androidx.compose.ui.platform.f.a(aVar, "indeedLogo"), 113.0f), 30.0f), null, ft2.a.b, 0.0f, null, cVarH, 24960, 104);
            jh2.f(cVarH, g.h(aVar, 12.0f));
            o97.h hVar = o97Var.j;
            fif.b(ak2.I(R.string.reg_promo_jp_title, cVarH), null, o97Var.c.a.c, 0L, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, tjf.a(z ? hVar.g : hVar.e, 0L, 0L, o97Var.f.c, null, null, 0L, 0, 0L, null, null, 0, 16777211), cVarH, 0, 0, 65018);
            cVarH = cVarH;
            jh2.f(cVarH, g.h(aVar, 24.0f));
            e eVarC2 = d.c(aVar);
            ob2 ob2VarA2 = mb2.a(new vs0.i(8.0f, true, new us0(0)), c20.a.m, cVarH, 48);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC3 = androidx.compose.ui.c.c(cVarH, eVarC2);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA2, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC3, eVar);
            c(R.drawable.reg_promo_jp_search, ak2.I(R.string.reg_promo_jp_value_prop_1, cVarH), cVarH, 0);
            c(R.drawable.reg_promo_jp_profile, ak2.I(R.string.reg_promo_jp_value_prop_2, cVarH), cVarH, 0);
            c(R.drawable.reg_promo_jp_bill, ak2.I(R.string.reg_promo_jp_value_prop_3, cVarH), cVarH, 0);
            cVarH.U(true);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new fj2(i);
        }
    }

    public static final void f(int i, b bVar) {
        c cVarH = bVar.h(350763824);
        if (cVarH.o(i & 1, i != 0)) {
            Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            Configuration configuration = (Configuration) cVarH.M(AndroidCompositionLocals_androidKt.a);
            Drawable drawableA = pnb.A(context, R.drawable.reg_promo_jp_bg);
            f17.a(z2b.a(R.drawable.reg_promo_jp_bg, 0, cVarH), null, g.c(g.f(e.a.b, 1.0f), 1.0f), null, ((double) configuration.screenWidthDp) / Math.max((double) configuration.screenHeightDp, 1.0d) < ((double) (drawableA != null ? drawableA.getIntrinsicWidth() : 0)) / Math.max((double) (drawableA != null ? drawableA.getIntrinsicHeight() : 1), 1.0d) ? ft2.a.c : ft2.a.d, 0.0f, null, cVarH, 432, 104);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new dm0(i);
        }
    }

    public static final void g(final String str, final long j, final long j2, final long j3, final gu5<j6g> gu5Var, final String str2, final e eVar, b bVar, final int i) {
        int i2;
        long j4;
        c cVar;
        c cVarH = bVar.h(-280715589);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j4 = j;
            i2 |= cVarH.e(j4) ? 32 : 16;
        } else {
            j4 = j;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.e(j2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.e(j3) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.x(gu5Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.K(str2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= cVarH.K(eVar) ? 1048576 : 524288;
        }
        if (cVarH.o(i2 & 1, (599187 & i2) != 599186)) {
            final o97 o97Var = (o97) cVarH.M(p97.a);
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVar);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            int i3 = i2;
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            e eVarB = g.b(g.f(androidx.compose.ui.platform.f.a(e.a.b, str2), 1.0f), 52.0f, 1);
            bj1 bj1VarF = ee3.f(j2, 1.0f);
            wl3 wl3VarA = iq1.a(j4, 0L, cVarH, (i3 >> 3) & 14, 14);
            o97.g gVar = o97Var.i;
            fgd fgdVarA = ggd.a(8.0f);
            boolean z = (i3 & 57344) == 16384;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new qy(2, gu5Var);
                cVarH.p(objV);
            }
            sq1.b((gu5) objV, eVarB, fgdVarA, bj1VarF, wl3VarA, null, bh2.c(326439347, new wu5() { // from class: cxc
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((fhd) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        e eVarJ = f.j(g.f(e.a.b, 1.0f), 8.0f, 0.0f, 8.0f, 0.0f, 10);
                        ehd ehdVarA = chd.a(vs0.e, c20.a.k, bVar2, 54);
                        int iHashCode2 = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC2 = androidx.compose.ui.c.c(bVar2, eVarJ);
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
                        ygg.y(bVar2, ehdVarA, gl2.a.g);
                        ygg.y(bVar2, t8bVarM, gl2.a.f);
                        gl2.a.C0251a c0251a2 = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                            uz.g(iHashCode2, bVar2, iHashCode2, c0251a2);
                        }
                        ygg.y(bVar2, eVarC2, gl2.a.d);
                        o97 o97Var2 = o97Var;
                        fif.b(str, null, j3, 0L, o97Var2.f.c, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, o97Var2.j.f, bVar2, 0, 0, 64986);
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, 805306368, 284);
            cVar = cVarH;
            cVar.U(true);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: exc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gxc.g(str, j, j2, j3, gu5Var, str2, eVar, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void h(final int i, final gu5<j6g> gu5Var, final String str, e eVar, b bVar, final int i2, final int i3) {
        e eVar2;
        int i4;
        c cVar;
        final e eVar3;
        c cVarH = bVar.h(717603132);
        int i5 = i2 | (cVarH.d(i) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16);
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 = i5 | 3072;
            eVar2 = eVar;
        } else {
            eVar2 = eVar;
            i4 = i5 | (cVarH.K(eVar2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        }
        if (cVarH.o(i4 & 1, (i4 & 1171) != 1170)) {
            e.a aVar = e.a.b;
            e eVar4 = i6 != 0 ? aVar : eVar2;
            o97 o97Var = (o97) cVarH.M(p97.a);
            qed qedVar = new qed(0);
            boolean z = (i4 & 112) == 32;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new di(9, gu5Var);
                cVarH.p(objV);
            }
            e eVar5 = eVar4;
            e eVarJ = g.j(androidx.compose.foundation.c.b(androidx.compose.foundation.b.d(eVar4, false, null, qedVar, (gu5) objV, 11), false, 3), 25.0f, 0.0f, 2);
            ag9 ag9VarD = hl1.d(c20.a.d, false);
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
            ygg.y(cVarH, ag9VarD, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            fif.c(new le0(zve.s0(ak2.I(i, cVarH)).toString()), androidx.compose.ui.platform.f.a(aVar, str), o97Var.c.a.g.f.a, 0L, null, 0L, odf.c, 0L, 0, false, 0, 0, null, null, o97Var.j.h, cVarH, 100663296, 0, 130808);
            cVar = cVarH;
            cVar.U(true);
            eVar3 = eVar5;
        } else {
            cVar = cVarH;
            cVar.D();
            eVar3 = eVar2;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(i, gu5Var, str, eVar3, i2, i3) { // from class: bxc
                public final /* synthetic */ int a;
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ String c;
                public final /* synthetic */ e d;
                public final /* synthetic */ int e;

                {
                    this.e = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(385);
                    gxc.h(this.a, this.b, this.c, this.d, (b) obj, iL, this.e);
                    return j6g.a;
                }
            };
        }
    }

    public static final void i(final gu5 gu5Var, final gu5 gu5Var2, final gu5 gu5Var3, final gu5 gu5Var4, final gu5 gu5Var5, final gu5 gu5Var6, final gu5 gu5Var7, final boolean z, b bVar, final int i) {
        c cVarH = bVar.h(-60527493);
        int i2 = i | (cVarH.x(gu5Var) ? 4 : 2) | (cVarH.x(gu5Var2) ? 32 : 16) | (cVarH.x(gu5Var3) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var4) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(gu5Var5) ? 16384 : 8192) | (cVarH.x(gu5Var6) ? 131072 : 65536) | (cVarH.x(gu5Var7) ? 1048576 : 524288) | (cVarH.a(z) ? 8388608 : 4194304);
        if (cVarH.o(i2 & 1, (4793491 & i2) != 4793490)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            boolean z2 = ((Configuration) cVarH.M(AndroidCompositionLocals_androidKt.a)).screenHeightDp < 700;
            e.a aVar = e.a.b;
            e eVarD = g.d(aVar, 1.0f);
            ag9 ag9VarD = hl1.d(c20.a.a, false);
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
            ygg.y(cVarH, ag9VarD, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            f(0, cVarH);
            af1 af1Var = c20.a.h;
            androidx.compose.foundation.layout.b bVar2 = androidx.compose.foundation.layout.b.a;
            j(bVar2.h(aVar, af1Var), z2, cVarH, 0);
            e eVarH = bVar2.h(pnb.M(g.c(aVar, 1.0f), pnb.L(0, 1, cVarH), true), c20.a.e);
            o97.g gVar = o97Var.i;
            e eVarQ = g.q(f.h(eVarH, 24.0f, 0.0f, 2), 0.0f, 0.0f, 420.0f, 0.0f, 11);
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = new mc(10);
                cVarH.p(objV);
            }
            e eVarB = b5e.b(eVarQ, false, (Function1) objV);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.n, cVarH, 48);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarB);
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
            jh2.f(cVarH, g.h(aVar, z2 ? 32.0f : 120.0f));
            e(0, cVarH);
            jh2.f(cVarH, new LayoutWeightElement(1.0f, true));
            jh2.f(cVarH, g.h(aVar, 12.0f));
            d(gu5Var, gu5Var2, cVarH, i2 & 126);
            jh2.f(cVarH, g.h(aVar, 16.0f));
            b(gu5Var3, gu5Var4, gu5Var5, gu5Var6, gu5Var7, z, cVarH, (i2 >> 6) & 524286);
            jh2.f(cVarH, g.h(aVar, 48.0f));
            cVarH.U(true);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(gu5Var2, gu5Var3, gu5Var4, gu5Var5, gu5Var6, gu5Var7, z, i) { // from class: dxc
                public final /* synthetic */ gu5 V;
                public final /* synthetic */ boolean W;
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ gu5 e;
                public final /* synthetic */ gu5 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    gxc.i(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void j(e eVar, boolean z, b bVar, int i) {
        c cVarH = bVar.h(-142740018);
        int i2 = (cVarH.K(eVar) ? 4 : 2) | i | (cVarH.a(z) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            Configuration configuration = (Configuration) cVarH.M(AndroidCompositionLocals_androidKt.a);
            iy3 iy3Var = (iy3) cVarH.M(um2.h);
            Drawable drawableA = pnb.A(context, R.drawable.reg_promo_jp_wave);
            ft2 ft2Var = ((int) iy3Var.k1(drawableA != null ? drawableA.getIntrinsicWidth() : 0)) < configuration.screenWidthDp ? ft2.a.g : z ? ft2.a.c : ft2.a.f;
            double intrinsicHeight = drawableA != null ? drawableA.getIntrinsicHeight() : 0;
            if (z) {
                intrinsicHeight *= 0.8d;
            }
            f17.a(z2b.a(R.drawable.reg_promo_jp_wave, 0, cVarH), null, g.f(g.q(e.a.b, 0.0f, 0.0f, 0.0f, iy3Var.k1((int) intrinsicHeight), 7), 1.0f).o(eVar), null, ft2Var, 0.0f, null, cVarH, 48, 104);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new w03(eVar, z, i);
        }
    }

    public static final void k(gu5<j6g> gu5Var, e eVar, b bVar, int i) {
        c cVarH = bVar.h(-1017983971);
        int i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            String strI = ak2.I(R.string.reg_promo_sign_in_button_text, cVarH);
            o97.a.C0340a c0340a = o97Var.c.b;
            long j = c0340a.f.a;
            long j2 = c0340a.a;
            boolean z = (i2 & 14) == 4;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new af(5, gu5Var);
                cVarH.p(objV);
            }
            g(strI, j, j, j2, (gu5) objV, "regPromoSignInButton", eVar, cVarH, 1769472);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new gu(gu5Var, i, 4, eVar);
        }
    }
}
