package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.ft2;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class w39 {
    public static final void a(final String str, final String str2, final String str3, final String str4, final String str5, final x2b x2bVar, final gu5<j6g> gu5Var, b bVar, final int i) {
        int i2;
        o97.c cVar;
        e.a aVar;
        o97.d dVar;
        int i3;
        e eVar;
        e.a aVar2;
        boolean z;
        str2.getClass();
        str4.getClass();
        str5.getClass();
        x2bVar.getClass();
        gu5Var.getClass();
        c cVarH = bVar.h(-1381603525);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | (cVarH.K(str2) ? 32 : 16);
        if ((i & 384) == 0) {
            i4 |= cVarH.K(str3) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        int i5 = i4 | (cVarH.K(str4) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.K(str5) ? 16384 : 8192) | (cVarH.x(x2bVar) ? 131072 : 65536) | (cVarH.x(gu5Var) ? 1048576 : 524288);
        if (cVarH.o(i5 & 1, (i5 & 599187) != 599186)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            ne4 ne4Var = cif.a;
            tjf tjfVar = (tjf) cVarH.M(ne4Var);
            o97.h hVar = o97Var.j;
            o97.c cVar2 = o97Var.f;
            o97.d dVar2 = o97Var.d;
            tjf tjfVarD = tjfVar.d(hVar.d);
            tjf tjfVarD2 = ((tjf) cVarH.M(ne4Var)).d(hVar.f);
            tjf tjfVarD3 = ((tjf) cVarH.M(ne4Var)).d(hVar.g);
            e.a aVar3 = e.a.b;
            e eVarM = pnb.M(f.h(a.b(g.d(aVar3, 1.0f), o97Var.c.b.a, ytc.a), 0.0f, 16.0f, 1), pnb.L(0, 1, cVarH), true);
            ob2 ob2VarA = mb2.a(new vs0.i(16.0f, true, new us0(0)), c20.a.n, cVarH, 48);
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarM);
            gl2.j.getClass();
            pm8.a aVar4 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar4);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            if (str != null) {
                cVarH.L(-1880945958);
                aVar = aVar3;
                dVar = dVar2;
                cVar = cVar2;
                cif.b(str, f.h(g.f(aVar3, 1.0f), 16.0f, 0.0f, 2), 0L, 0L, null, cVar2.c, dVar2.a, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarD, cVarH, i5 & 14, 0, 65436);
                cVarH = cVarH;
                cVarH.U(false);
            } else {
                cVar = cVar2;
                aVar = aVar3;
                dVar = dVar2;
                cVarH.L(-1883767919);
                cVarH.U(false);
            }
            e.a aVar5 = aVar;
            e eVarH = f.h(aVar5, 0.0f, 16.0f, 1);
            e eVarH2 = g.h(aVar5, 0.0f);
            eVarH.getClass();
            eVarH2.getClass();
            int i6 = ((Configuration) cVarH.M(AndroidCompositionLocals_androidKt.a)).orientation;
            if (i6 != 1) {
                i3 = 2;
                eVar = i6 != 2 ? aVar5 : eVarH2;
            } else {
                i3 = 2;
                eVar = eVarH;
            }
            int i7 = i5 >> 15;
            c cVar3 = cVarH;
            f17.a(x2bVar, null, eVar, null, ft2.a.e, 0.0f, null, cVar3, (i7 & 14) | 24624, 104);
            o97.d dVar3 = dVar;
            cif.b(str2, f.h(g.f(aVar5, 1.0f), 32.0f, 0.0f, i3), 0L, 0L, null, cVar.c, dVar.a, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, tjfVarD2, cVar3, (i5 >> 3) & 14, 0, 64924);
            cVarH = cVar3;
            if (str3 != null) {
                cVarH.L(-1879698084);
                aVar2 = aVar5;
                cif.b(str3, f.h(g.f(aVar5, 1.0f), 32.0f, 0.0f, 2), 0L, 0L, null, null, dVar3.a, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, tjfVarD3, cVarH, (i5 >> 6) & 14, 0, 64956);
                cVarH = cVarH;
                z = false;
            } else {
                aVar2 = aVar5;
                z = false;
                cVarH.L(-1883767919);
            }
            cVarH.U(z);
            jh2.f(cVarH, new LayoutWeightElement(1.0f, true));
            e.a aVar6 = aVar2;
            int i8 = i7 & 112;
            gt6.j(str4, gu5Var, f.h(g.f(aVar6, 1.0f), 32.0f, 0.0f, 2), null, false, false, null, null, null, cVarH, ((i5 >> 9) & 14) | i8, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
            gt6.h(str5, gu5Var, f.h(g.f(aVar6, 1.0f), 32.0f, 0.0f, 2), null, false, false, null, null, null, cVarH, ((i5 >> 12) & 14) | i8, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: v39
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w39.a(str, str2, str3, str4, str5, x2bVar, gu5Var, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }
}
