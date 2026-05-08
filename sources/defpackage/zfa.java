package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class zfa {
    public static final void a(final String str, final String str2, final String str3, final gu5<j6g> gu5Var, b bVar, final int i) {
        int i2;
        str.getClass();
        str2.getClass();
        str3.getClass();
        gu5Var.getClass();
        c cVarH = bVar.h(1267704886);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.K(str3) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            e.a aVar = e.a.b;
            e eVarD = g.d(aVar, 1.0f);
            vs0.k kVar = vs0.c;
            af1.a aVar2 = c20.a.m;
            ob2 ob2VarA = mb2.a(kVar, aVar2, cVarH, 0);
            int i3 = i2;
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarD);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
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
            o97 o97Var = (o97) cVarH.M(p97.a);
            o97.g gVar = o97Var.i;
            o97.h hVar = o97Var.j;
            e eVarH = f.h(g.f(new LayoutWeightElement(1.0f, true), 1.0f), 48.0f, 0.0f, 2);
            ehd ehdVarA = chd.a(vs0.f, c20.a.k, cVarH, 54);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarH);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar);
            f17.a(z2b.a(R.drawable.ic_something_wrong, 0, cVarH), ak2.I(R.string.something_went_wrong, cVarH), null, null, null, 0.0f, null, cVarH, 0, 124);
            e eVarF = f.f(aVar, 16.0f);
            ob2 ob2VarA2 = mb2.a(vs0.g, aVar2, cVarH, 6);
            int iHashCode3 = Long.hashCode(cVarH.T);
            t8b t8bVarP3 = cVarH.P();
            e eVarC3 = androidx.compose.ui.c.c(cVarH, eVarF);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA2, dVar);
            ygg.y(cVarH, t8bVarP3, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode3))) {
                ja.h(iHashCode3, cVarH, iHashCode3, c0251a);
            }
            ygg.y(cVarH, eVarC3, eVar);
            tjf tjfVarA = tjf.a(hVar.e, 0L, 0L, to5.d0, null, null, 0L, 0, 0L, null, null, 0, 16777211);
            Object objV = cVarH.v();
            int i4 = 5;
            if (objV == b.a.a) {
                objV = new od2(i4);
                cVarH.p(objV);
            }
            fif.b(str, b5e.b(aVar, false, (Function1) objV), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarA, cVarH, i3 & 14, 0, 65532);
            jh2.f(cVarH, g.h(aVar, 8.0f));
            fif.b(str2, null, 0L, 0L, null, null, 0L, null, new dcf(5), 0L, 0, false, 0, 0, null, hVar.g, cVarH, (i3 >> 3) & 14, 0, 65022);
            int i5 = i3 >> 6;
            gt6.h(str3, gu5Var, androidx.compose.ui.platform.f.a(f.h(aVar, 0.0f, 16.0f, 1), "ErrorScreenPrimaryButton"), null, false, false, fv6.M7, null, null, cVarH, (i5 & 14) | 1572864 | (i5 & 112), 440);
            cVarH = cVarH;
            o6.j(cVarH, true, true, true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: yfa
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    zfa.a(str, str2, str3, gu5Var, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(final String str, final String str2, final String str3, final gu5<j6g> gu5Var, b bVar, final int i) {
        int i2;
        String str4;
        String str5;
        gu5<j6g> gu5Var2;
        str.getClass();
        str2.getClass();
        str3.getClass();
        gu5Var.getClass();
        c cVarH = bVar.h(-64629594);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str4 = str2;
            i2 |= cVarH.K(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i & 384) == 0) {
            str5 = str3;
            i2 |= cVarH.K(str5) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        } else {
            str5 = str3;
        }
        if ((i & 3072) == 0) {
            gu5Var2 = gu5Var;
            i2 |= cVarH.x(gu5Var2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        } else {
            gu5Var2 = gu5Var;
        }
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            e.a aVar = e.a.b;
            e eVarD = g.d(aVar, 1.0f);
            ob2 ob2VarA = mb2.a(vs0.e, c20.a.n, cVarH, 54);
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
            ygg.y(cVarH, ob2VarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            o97 o97Var = (o97) cVarH.M(p97.a);
            int i3 = i2;
            f17.a(z2b.a(R.drawable.ic_something_wrong, 0, cVarH), ak2.I(R.string.something_went_wrong, cVarH), null, null, null, 0.0f, null, cVarH, 0, 124);
            o97.g gVar = o97Var.i;
            o97.h hVar = o97Var.j;
            jh2.f(cVarH, g.n(aVar, 48.0f));
            tjf tjfVarA = tjf.a(hVar.e, 0L, 0L, to5.d0, null, null, 0L, 0, 0L, null, null, 0, 16777211);
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = new gb(5);
                cVarH.p(objV);
            }
            fif.b(str, b5e.b(aVar, false, (Function1) objV), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarA, cVarH, i3 & 14, 0, 65532);
            fif.b(str4, f.f(aVar, 16.0f), 0L, 0L, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, hVar.g, cVarH, (i3 >> 3) & 14, 0, 65020);
            int i4 = i3 >> 6;
            gt6.h(str5, gu5Var2, androidx.compose.ui.platform.f.a(f.f(aVar, 16.0f), "ErrorScreenPrimaryButton"), null, false, false, fv6.M7, null, null, cVarH, (i4 & 14) | 1572864 | (i4 & 112), 440);
            cVarH = cVarH;
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: xfa
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    zfa.b(str, str2, str3, gu5Var, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void c(gu5<j6g> gu5Var, b bVar, final int i) {
        int i2;
        final gu5<j6g> gu5Var2;
        gu5Var.getClass();
        c cVarH = bVar.h(1379046820);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            gu5Var2 = gu5Var;
            cVarH.D();
        } else if (((Configuration) cVarH.M(AndroidCompositionLocals_androidKt.a)).orientation == 1) {
            cVarH.L(1821749251);
            gu5Var2 = gu5Var;
            b(ak2.I(R.string.no_internet_connection_title, cVarH), ak2.I(R.string.no_internet_connection_subtitle, cVarH), ak2.I(R.string.refresh, cVarH), gu5Var2, cVarH, (i2 << 9) & 7168);
            cVarH.U(false);
        } else {
            cVarH.L(1822099458);
            gu5Var2 = gu5Var;
            a(ak2.I(R.string.no_internet_connection_title, cVarH), ak2.I(R.string.no_internet_connection_subtitle, cVarH), ak2.I(R.string.refresh, cVarH), gu5Var2, cVarH, (i2 << 9) & 7168);
            cVarH.U(false);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: wfa
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iL = ka2.L(i | 1);
                    zfa.c(gu5Var2, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
