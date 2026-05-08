package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.f68;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vs0;

/* JADX INFO: loaded from: classes3.dex */
public final class olb {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f68.values().length];
            try {
                f68.a aVar = f68.a;
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68.a aVar2 = f68.a;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68.a aVar3 = f68.a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68.a aVar4 = f68.a;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68.a aVar5 = f68.a;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f68.a aVar6 = f68.a;
                iArr[3] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f68.a aVar7 = f68.a;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    public static final void a(int i, gu5 gu5Var, b bVar, String str, String str2) {
        String str3;
        String str4;
        gu5 gu5Var2 = gu5Var;
        c cVarF = q6.f(-418471225, gu5Var2, bVar, str);
        int i2 = i | (cVarF.K(str) ? 4 : 2) | (cVarF.K(str2) ? 32 : 16) | (cVarF.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarF.o(i2 & 1, (i2 & 147) != 146)) {
            o97 o97Var = (o97) cVarF.M(p97.a);
            e.a aVar = e.a.b;
            e eVarF = g.f(aVar, 1.0f);
            ehd ehdVarA = chd.a(vs0.g, c20.a.j, cVarF, 54);
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
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarF.S || !wl7.b(cVarF.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarF, iHashCode, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarF, eVarC, eVar);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            ob2 ob2VarA = mb2.a(new vs0.i(12.0f, true, new us0(0)), c20.a.m, cVarF, 6);
            int iHashCode2 = Long.hashCode(cVarF.T);
            t8b t8bVarP2 = cVarF.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarF, layoutWeightElement);
            cVarF.B();
            if (cVarF.S) {
                cVarF.y(aVar2);
            } else {
                cVarF.n();
            }
            ygg.y(cVarF, ob2VarA, dVar);
            ygg.y(cVarF, t8bVarP2, fVar);
            if (cVarF.S || !wl7.b(cVarF.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarF, iHashCode2, c0251a);
            }
            ygg.y(cVarF, eVarC2, eVar);
            fif.b(str, f.j(aVar, 0.0f, 0.0f, 0.0f, 4.0f, 7), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.f, cVarF, (i2 & 14) | 48, 0, 65532);
            cVarF = cVarF;
            if (str2 == null) {
                cVarF.L(-1225238221);
                cVarF.U(false);
                str4 = str2;
            } else {
                cVarF.L(-1225238220);
                fif.b(str2, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.f, 0L, 0L, to5.d0, null, null, 0L, 0, f07.d, null, null, 0, 16646139), cVarF, (i2 >> 3) & 14, 0, 65534);
                str4 = str2;
                cVarF = cVarF;
                j6g j6gVar = j6g.a;
                cVarF.U(false);
            }
            cVarF.U(true);
            gu5Var2 = gu5Var;
            str3 = str;
            rq6.b(gu5Var2, androidx.compose.ui.platform.f.a(g.n(aVar, 24.0f), "EditButton"), false, null, null, jh2.e, cVarF, ((i2 >> 6) & 14) | 196656, 28);
            cVarF.U(true);
        } else {
            str3 = str;
            str4 = str2;
            cVarF.D();
        }
        i iVarW = cVarF.W();
        if (iVarW != null) {
            iVarW.d = new lx(i, gu5Var2, str3, str4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.lang.String r17, final java.lang.String r18, final defpackage.gu5 r19, final defpackage.gu5 r20, java.lang.String r21, final defpackage.fv6 r22, androidx.compose.runtime.b r23, final int r24, final int r25) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.olb.b(java.lang.String, java.lang.String, gu5, gu5, java.lang.String, fv6, androidx.compose.runtime.b, int, int):void");
    }

    public static final int c(f68 f68Var) {
        switch (f68Var == null ? -1 : a.a[f68Var.ordinal()]) {
            case -1:
            case 6:
            case 7:
                return -1;
            case 0:
            default:
                l.g();
                return 0;
            case 1:
                return R.string.per_year;
            case 2:
                return R.string.per_hour;
            case 3:
                return R.string.per_week;
            case 4:
                return R.string.per_day;
            case 5:
                return R.string.per_month;
        }
    }
}
