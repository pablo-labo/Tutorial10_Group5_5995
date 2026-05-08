package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes.dex */
public final class hk2 {
    public static final ah2 a = new ah2(1890101041, a.a, false);

    public static final class a implements wu5<qke, b, Integer, j6g> {
        public static final a a = new a();

        @Override // defpackage.wu5
        public final j6g q(qke qkeVar, b bVar, Integer num) {
            qke qkeVar2 = qkeVar;
            b bVar2 = bVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= (iIntValue & 8) == 0 ? bVar2.K(qkeVar2) : bVar2.x(qkeVar2) ? 4 : 2;
            }
            if (bVar2.o(iIntValue & 1, (iIntValue & 19) != 18)) {
                ile.c(qkeVar2, null, null, 0L, 0L, 0L, 0.0f, bVar2, iIntValue & 14);
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }
}
