package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class xh2 {
    public static final ah2 a = new ah2(954879418, b.a, false);
    public static final ah2 b = new ah2(1918065384, a.a, false);

    public static final class a implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        public static final a a = new a();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            if (!bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static final class b implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        public static final b a = new b();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            if (!bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                bVar2.D();
            }
            return j6g.a;
        }
    }
}
