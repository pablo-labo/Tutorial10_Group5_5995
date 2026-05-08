package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class yh2 {
    public static final ah2 a = new ah2(-355168742, a.a, false);

    public static final class a implements wu5<st2, b, Integer, j6g> {
        public static final a a = new a();

        @Override // defpackage.wu5
        public final j6g q(st2 st2Var, b bVar, Integer num) {
            st2 st2Var2 = st2Var;
            b bVar2 = bVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= bVar2.K(st2Var2) ? 4 : 2;
            }
            if (bVar2.o(iIntValue & 1, (iIntValue & 19) != 18)) {
                hl1.a(androidx.compose.foundation.a.b(g.h(g.f(f.h(e.a.b, 0.0f, wt2.g, 1), 1.0f), wt2.f), st2Var2.c, ytc.a), bVar2, 0);
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }
}
