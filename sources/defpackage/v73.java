package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class v73 {
    public static final void a(final x73 x73Var, final String str, final Function2 function2, b bVar, final int i) {
        zv6[] zv6VarArr;
        List<y73> list;
        w73 w73Var;
        x73Var.getClass();
        str.getClass();
        c cVarH = bVar.h(-459470384);
        int i2 = (cVarH.x(x73Var) ? 4 : 2) | i | (cVarH.K(str) ? 32 : 16) | (cVarH.x(function2) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            z73 z73Var = x73Var.b;
            if (z73Var == null || (list = z73Var.b) == null) {
                zv6VarArr = null;
            } else {
                List<y73> list2 = list;
                ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
                for (y73 y73Var : list2) {
                    w73 w73Var2 = y73Var.a;
                    String str2 = w73Var2 != null ? w73Var2.b : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    a83 a83Var = y73Var.b;
                    arrayList.add(new zv6(str2, str.equals((a83Var == null || (w73Var = a83Var.a) == null) ? null : w73Var.a)));
                }
                zv6VarArr = (zv6[]) arrayList.toArray(new zv6[0]);
            }
            o97.g gVar = o97Var.i;
            e eVarG = f.g(e.a.b, 16.0f, 16.0f);
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarG);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
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
            zv6VarArr.getClass();
            w73 w73Var3 = x73Var.a;
            String str3 = w73Var3 != null ? w73Var3.b : null;
            String str4 = str3 != null ? str3 : "";
            boolean zX = cVarH.x(x73Var) | ((i2 & 896) == 256);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                objV = new jh(2, function2, x73Var);
                cVarH.p(objV);
            }
            fw6.c(str4, null, null, null, false, zv6VarArr, (Function2) objV, null, cVarH, 0, 318);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(str, function2, i) { // from class: u73
                public final /* synthetic */ String b;
                public final /* synthetic */ Function2 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    v73.a(this.a, this.b, this.c, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
