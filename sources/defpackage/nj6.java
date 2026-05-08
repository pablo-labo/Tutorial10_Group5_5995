package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.o97;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class nj6 {
    public static final void a(final boolean z, final boolean z2, final boolean z3, final gu5 gu5Var, final gu5 gu5Var2, final gu5 gu5Var3, final gu5 gu5Var4, final int i, final gu5 gu5Var5, b bVar, final int i2) {
        int i3;
        gu5 gu5Var6;
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        gu5Var4.getClass();
        gu5Var5.getClass();
        c cVarH = bVar.h(1224549791);
        if ((i2 & 6) == 0) {
            i3 = (cVarH.a(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= cVarH.a(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= cVarH.a(z3) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i2 & 3072) == 0) {
            gu5Var6 = gu5Var;
            i3 |= cVarH.x(gu5Var6) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        } else {
            gu5Var6 = gu5Var;
        }
        if ((i2 & 24576) == 0) {
            i3 |= cVarH.x(gu5Var2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= cVarH.x(gu5Var3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= cVarH.x(gu5Var4) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= cVarH.d(i) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= cVarH.x(gu5Var5) ? 67108864 : 33554432;
        }
        if (!cVarH.o(i3 & 1, (38347923 & i3) != 38347922)) {
            cVarH.D();
        } else if (z2) {
            cVarH.L(-889044255);
            if (z3) {
                cVarH.L(-889020509);
                int i4 = i3 >> 15;
                e(i, ((i3 >> 9) & 112) | (i4 & 14) | (i4 & 896), gu5Var3, gu5Var2, cVarH);
                cVarH.U(false);
            } else {
                cVarH.L(-888919511);
                int i5 = i3 >> 9;
                f(gu5Var6, true, gu5Var3, null, cVarH, (i5 & 14) | 48 | (i5 & 896), 8);
                cVarH.U(false);
            }
            cVarH.U(false);
        } else if (z) {
            cVarH.L(-888781685);
            if (z3) {
                cVarH.L(-888487805);
                qof.a(gu5Var3, gu5Var4, false, cVarH, (i3 >> 15) & 126, 4);
                cVarH = cVarH;
                cVarH.U(false);
            } else {
                cVarH.L(-888756172);
                int i6 = i3 >> 9;
                f(gu5Var, true, gu5Var3, null, cVarH, (i6 & 14) | 48 | (i6 & 896), 8);
                cVarH.U(false);
            }
            cVarH.U(false);
        } else {
            cVarH.L(-888405717);
            if (z3) {
                cVarH.L(-888383800);
                int i7 = (i3 >> 12) & 14;
                int i8 = i3 >> 18;
                c(i, i7 | (i8 & 112) | (i8 & 896), gu5Var2, gu5Var5, cVarH);
                cVarH.U(false);
            } else {
                cVarH.L(-888285778);
                f(gu5Var, false, null, gu5Var5, cVarH, ((i3 >> 9) & 14) | ((i3 >> 15) & 7168), 6);
                cVarH.U(false);
            }
            cVarH.U(false);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: gj6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nj6.a(z, z2, z3, gu5Var, gu5Var2, gu5Var3, gu5Var4, i, gu5Var5, (b) obj, ka2.L(i2 | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(gu5<j6g> gu5Var, b bVar, int i) {
        gu5<j6g> gu5Var2;
        c cVarH = bVar.h(-179568513);
        int i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            gu5Var2 = gu5Var;
            gt6.h(ak2.I(R.string.reg_promo_sign_in_button_text, cVarH), gu5Var2, f.a(e.a.b, "TopNavSignInButton"), null, false, false, fv6.o7, null, null, cVarH, ((i2 << 3) & 112) | 1573248, 440);
        } else {
            gu5Var2 = gu5Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new y02(i, gu5Var2);
        }
    }

    public static final void c(final int i, final int i2, final gu5 gu5Var, final gu5 gu5Var2, b bVar) {
        int i3;
        c cVarH = bVar.h(220887655);
        if ((i2 & 6) == 0) {
            i3 = (cVarH.x(gu5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= cVarH.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= cVarH.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarH.o(i3 & 1, (i3 & 147) != 146)) {
            final String strI = ak2.I(R.string.desc_notifications_icon, cVarH);
            iv6.a(hh2.c, f.a(e.a.b, "DetailsTopBar"), false, null, false, null, hh2.d, bh2.c(109659045, new wu5() { // from class: kj6
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((fhd) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        b bVar3 = bVar2;
                        nof.b(gu5Var, fv6.s6, "TopNavNotificationsButton", strI, i, null, ar6.Stroke, bVar3, 1573296);
                        if (((h2g) cr8.p(h2g.class)).a()) {
                            bVar3.L(-1617048292);
                            nof.c(gu5Var2, R.drawable.ic_idl_profile_24, fv6.o7, ak2.I(R.string.bottom_nav_top_bar_title_profile, bVar3), "TopNavProfileButton", null, bVar3, 24960, 96);
                            bVar3 = bVar3;
                        } else {
                            bVar3.L(-1624350435);
                        }
                        bVar3.F();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, 113246262, 124);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: lj6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iL = ka2.L(i2 | 1);
                    nj6.c(i, iL, gu5Var, gu5Var2, (b) obj);
                    return j6g.a;
                }
            };
        }
    }

    public static final void d(int i, b bVar) {
        c cVarH = bVar.h(1793626537);
        if (cVarH.o(i & 1, i != 0)) {
            o97.g gVar = ((o97) cVarH.M(p97.a)).i;
            x2b x2bVarA = z2b.a(2131232539, 0, cVarH);
            long j = da2.i;
            String strI = ak2.I(R.string.reg_promo_indeed_logo_content_description, cVarH);
            e eVarA = f.a(g.h(androidx.compose.foundation.layout.f.j(g.r(e.a.b, 82.0f), 12.0f, 0.0f, 0.0f, 0.0f, 14), 24.0f), "TopNavIndeedLogo");
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = new nf(13);
                cVarH.p(objV);
            }
            vq6.b(x2bVarA, strI, b5e.b(eVarA, false, (Function1) objV), j, cVarH, 3072, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new im0(i);
        }
    }

    public static final void e(final int i, final int i2, final gu5 gu5Var, final gu5 gu5Var2, b bVar) {
        int i3;
        c cVarH = bVar.h(629108441);
        if ((i2 & 6) == 0) {
            i3 = (cVarH.x(gu5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= cVarH.x(gu5Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= cVarH.d(i) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        int i4 = 1;
        if (cVarH.o(i3 & 1, (i3 & 147) != 146)) {
            final String strI = ak2.I(R.string.desc_notifications_icon, cVarH);
            iv6.a(hh2.e, f.a(e.a.b, "DetailsTopBar"), false, null, false, null, bh2.c(-1185670826, new vr2(i4, gu5Var), cVarH), bh2.c(-2070406633, new wu5() { // from class: mj6
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((fhd) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        nof.b(gu5Var2, fv6.s6, "TopNavNotificationsButton", strI, i, null, ar6.Stroke, bVar2, 1573296);
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, 113246262, 124);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: hj6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iL = ka2.L(i2 | 1);
                    nj6.e(i, iL, gu5Var, gu5Var2, (b) obj);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(final defpackage.gu5<defpackage.j6g> r17, boolean r18, defpackage.gu5<defpackage.j6g> r19, defpackage.gu5<defpackage.j6g> r20, androidx.compose.runtime.b r21, final int r22, final int r23) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nj6.f(gu5, boolean, gu5, gu5, androidx.compose.runtime.b, int, int):void");
    }
}
