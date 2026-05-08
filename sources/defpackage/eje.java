package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class eje {
    public static final void a(final List list, final String str, final Function1 function1, final Function2 function2, final Function1 function12, final gu5 gu5Var, final gu5 gu5Var2, final boolean z, b bVar, final int i) {
        list.getClass();
        function1.getClass();
        function2.getClass();
        function12.getClass();
        gu5Var2.getClass();
        c cVarH = bVar.h(-284678458);
        int i2 = i | (cVarH.x(list) ? 4 : 2) | (cVarH.K(str) ? 32 : 16) | (cVarH.x(function1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(function2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(function12) ? 16384 : 8192) | (cVarH.x(gu5Var2) ? 1048576 : 524288) | (cVarH.a(z) ? 8388608 : 4194304);
        if (cVarH.o(i2 & 1, (4793491 & i2) != 4793490)) {
            final o97 o97Var = (o97) cVarH.M(p97.a);
            final zrd zrdVarL = pnb.L(0, 1, cVarH);
            ArrayList arrayListY = ka2.y(list);
            final ArrayList arrayList = new ArrayList();
            Iterator it = arrayListY.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                yie yieVar = ((zie) next).j;
                String str2 = yieVar != null ? yieVar.a : null;
                if (str2 == null) {
                    str2 = "";
                }
                if (str2.equals(str)) {
                    arrayList.add(next);
                }
            }
            j6g j6gVar = j6g.a;
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = new dje(2, null);
                cVarH.p(objV);
            }
            to4.d(cVarH, j6gVar, (Function2) objV);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e.a aVar = e.a.b;
            e eVarC = androidx.compose.ui.c.c(cVarH, aVar);
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
            String strI = ak2.I(R.string.edit_skills_set, cVarH);
            boolean z2 = (i2 & 3670016) == 1048576;
            Object objV2 = cVarH.v();
            if (z2 || objV2 == c0020a) {
                objV2 = new af(7, gu5Var2);
                cVarH.p(objV2);
            }
            dxb.a((gu5) objV2, strI, null, true, cVarH, 3072, 20);
            l0f.a(f.a(androidx.compose.foundation.layout.f.g(a.b(g.d(aVar, 1.0f), o97Var.c.b.a, ytc.a), 16.0f, 24.0f), "ListSheetContent"), null, 0L, 0L, 0.0f, 0.0f, null, bh2.c(-2074462889, new Function2() { // from class: bje
                /* JADX WARN: Removed duplicated region for block: B:101:0x034a  */
                /* JADX WARN: Removed duplicated region for block: B:104:0x0366 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:105:0x0368  */
                /* JADX WARN: Removed duplicated region for block: B:134:0x0474  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x00dd  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0299  */
                /* JADX WARN: Removed duplicated region for block: B:78:0x029e  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x02d9  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x02e8  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x02eb  */
                /* JADX WARN: Removed duplicated region for block: B:89:0x02f1  */
                /* JADX WARN: Removed duplicated region for block: B:94:0x0317  */
                /* JADX WARN: Removed duplicated region for block: B:96:0x0324  */
                @Override // kotlin.jvm.functions.Function2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r41, java.lang.Object r42) {
                    /*
                        Method dump skipped, instruction units count: 1154
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.bje.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, cVarH), cVarH, 12582912, 126);
            cVarH = cVarH;
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(list, str, function1, function2, function12, gu5Var, gu5Var2, z, i) { // from class: cje
                public final /* synthetic */ gu5 V;
                public final /* synthetic */ boolean W;
                public final /* synthetic */ List a;
                public final /* synthetic */ String b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function2 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ gu5 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(196609);
                    eje.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
