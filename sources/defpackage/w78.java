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
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vs0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class w78 {
    public static final void a(final String str, final String str2, final gu5 gu5Var, final gu5 gu5Var2, final List list, final fv6 fv6Var, b bVar, final int i) {
        int i2;
        str.getClass();
        str2.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        fv6Var.getClass();
        c cVarH = bVar.h(-1771642880);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.d(R.drawable.ic_idl_jobs_24) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.x(gu5Var2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= cVarH.x(list) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= cVarH.d(fv6Var.ordinal()) ? 1048576 : 524288;
        }
        int i3 = 0;
        if (cVarH.o(i2 & 1, (599187 & i2) != 599186)) {
            List list2 = list;
            int i4 = i2 >> 6;
            mv.c(str2, gu5Var, Integer.valueOf(R.drawable.ic_idl_jobs_24), !(list2 == null || list2.isEmpty()), fv6Var, bh2.c(-441723299, new u78(i3, str, list, gu5Var2), cVarH), cVarH, (i2 & 896) | 196608 | ((i2 >> 3) & 14) | (i4 & 112) | (57344 & i4), 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: v78
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w78.a(str, str2, gu5Var, gu5Var2, list, fv6Var, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(String str, List list, gu5 gu5Var, b bVar, int i) {
        boolean z;
        c cVarF = q6.f(1097976843, gu5Var, bVar, str);
        int i2 = i | (cVarF.K(str) ? 4 : 2) | (cVarF.x(list) ? 32 : 16) | (cVarF.x(gu5Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
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
            if (list == null) {
                cVarF.L(-417782217);
                z = false;
            } else {
                z = false;
                cVarF.L(-417782216);
                List list2 = list;
                ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    c cVar = cVarF;
                    fif.b(((sjb) it.next()).b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.f, 0L, 0L, to5.d0, null, null, 0L, 0, 0L, null, null, 0, 16777211), cVar, 0, 0, 65534);
                    cVarF = cVar;
                    arrayList.add(j6g.a);
                }
            }
            cVarF.U(z);
            cVarF.U(true);
            rq6.b(gu5Var, androidx.compose.ui.platform.f.a(g.n(aVar, 24.0f), "EditButton"), false, null, null, w74.d, cVarF, ((i2 >> 6) & 14) | 196656, 28);
            cVarF.U(true);
        } else {
            cVarF.D();
        }
        i iVarW = cVarF.W();
        if (iVarW != null) {
            iVarW.d = new ic(str, list, gu5Var, i, 2);
        }
    }
}
