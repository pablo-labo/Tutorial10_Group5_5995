package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class xj2 {
    public static final ah2 a = new ah2(-426398407, a.a, false);

    public static final class a implements Function2<b, Integer, j6g> {
        public static final a a = new a();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(b bVar, Integer num) {
            b bVar2 = bVar;
            int iIntValue = num.intValue();
            if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                fif.d(null, 0L, 0L, 0L, 0L, 0, false, 0, null, null, bVar2, 6);
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }
}
