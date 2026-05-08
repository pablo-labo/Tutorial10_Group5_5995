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
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class sj8 {
    public static final void a(final List<wj8> list, final Function1<? super wj8, j6g> function1, final Function1<? super String, j6g> function12, final Function1<? super String, j6g> function13, final gu5<j6g> gu5Var, final gu5<j6g> gu5Var2, final gu5<j6g> gu5Var3, b bVar, final int i) {
        list.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        gu5Var.getClass();
        c cVarC = ja.c(gu5Var2, gu5Var3, bVar, -1772135548);
        int i2 = i | (cVarC.x(list) ? 4 : 2) | (cVarC.x(function1) ? 32 : 16) | (cVarC.x(function12) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarC.x(function13) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarC.x(gu5Var) ? 16384 : 8192) | (cVarC.x(gu5Var2) ? 131072 : 65536) | (cVarC.x(gu5Var3) ? 1048576 : 524288);
        if (cVarC.o(i2 & 1, (599187 & i2) != 599186)) {
            o97 o97Var = (o97) cVarC.M(p97.a);
            zrd zrdVarL = pnb.L(0, 1, cVarC);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarC, 0);
            int iHashCode = Long.hashCode(cVarC.T);
            t8b t8bVarP = cVarC.P();
            e.a aVar = e.a.b;
            e eVarC = androidx.compose.ui.c.c(cVarC, aVar);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarC.B();
            if (cVarC.S) {
                cVarC.y(aVar2);
            } else {
                cVarC.n();
            }
            ygg.y(cVarC, ob2VarA, gl2.a.g);
            ygg.y(cVarC, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarC.S || !wl7.b(cVarC.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarC, iHashCode, c0251a);
            }
            ygg.y(cVarC, eVarC, gl2.a.d);
            String strI = ak2.I(R.string.edit_language, cVarC);
            boolean z = (i2 & 458752) == 131072;
            Object objV = cVarC.v();
            if (z || objV == b.a.a) {
                objV = new ec(7, gu5Var2);
                cVarC.p(objV);
            }
            dxb.a((gu5) objV, strI, gu5Var3, true, cVarC, ((i2 >> 12) & 896) | 3072, 16);
            l0f.a(f.a(androidx.compose.foundation.layout.f.g(a.b(g.d(aVar, 1.0f), o97Var.c.b.a, ytc.a), 19.0f, 24.0f), "ListSheetContent"), null, 0L, 0L, 0.0f, 0.0f, null, bh2.c(-1775944045, new qj8(o97Var, zrdVarL, list, gu5Var, function13, function1, function12), cVarC), cVarC, 12582912, 126);
            cVarC = cVarC;
            cVarC.U(true);
        } else {
            cVarC.D();
        }
        i iVarW = cVarC.W();
        if (iVarW != null) {
            iVarW.d = new Function2(list, function1, function12, function13, gu5Var, gu5Var2, gu5Var3, i) { // from class: rj8
                public final /* synthetic */ gu5 V;
                public final /* synthetic */ List a;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ gu5 e;
                public final /* synthetic */ gu5 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    sj8.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
