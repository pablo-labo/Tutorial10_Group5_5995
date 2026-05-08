package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import defpackage.gl2;
import defpackage.le0;
import defpackage.pm8;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class qe0 {
    public static final Pair<List<le0.c<sab>>, List<le0.c<wu5<String, b, Integer, j6g>>>> a;

    public static final class a implements ag9 {
        public static final a a = new a();

        @Override // defpackage.ag9
        public final bg9 c(q qVar, List<? extends vf9> list, long j) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i).R(j));
            }
            return qVar.Y0(iq2.h(j), iq2.g(j), bs4.a, new pe0(arrayList, 0));
        }
    }

    static {
        zr4 zr4Var = zr4.a;
        a = new Pair<>(zr4Var, zr4Var);
    }

    public static final void a(le0 le0Var, List<le0.c<wu5<String, b, Integer, j6g>>> list, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(-1794596951);
        int i3 = (i & 6) == 0 ? (cVarH.K(le0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= cVarH.x(list) ? 32 : 16;
        }
        if (cVarH.o(i3 & 1, (i3 & 19) != 18)) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                le0.c<wu5<String, b, Integer, j6g>> cVar = list.get(i4);
                wu5<String, b, Integer, j6g> wu5Var = cVar.a;
                int i5 = cVar.b;
                int i6 = cVar.c;
                Object objV = cVarH.v();
                if (objV == b.a.a) {
                    objV = a.a;
                    cVarH.p(objV);
                }
                ag9 ag9Var = (ag9) objV;
                int iHashCode = Long.hashCode(cVarH.T);
                t8b t8bVarP = cVarH.P();
                e eVarC = androidx.compose.ui.c.c(cVarH, e.a.b);
                gl2.j.getClass();
                pm8.a aVar = gl2.a.b;
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ag9Var, gl2.a.g);
                ygg.y(cVarH, t8bVarP, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                    ja.h(iHashCode, cVarH, iHashCode, c0251a);
                }
                ygg.y(cVarH, eVarC, gl2.a.d);
                wu5Var.q(le0Var.subSequence(i5, i6).b, cVarH, 0);
                cVarH.U(true);
            }
            i2 = 0;
        } else {
            i2 = 0;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new oe0(le0Var, i, i2, list);
        }
    }
}
