package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class dh2 {
    public static final ah2 a = new ah2(210148896, a.a, false);

    public static final class a extends mj8 implements Function2<b, Integer, j6g> {
        public static final a a = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(b bVar, Integer num) {
            b bVar2 = bVar;
            int iIntValue = num.intValue();
            if (!bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                bVar2.D();
            }
            return j6g.a;
        }
    }
}
