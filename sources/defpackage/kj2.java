package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class kj2 {
    public static final ah2 a = new ah2(-1524796689, a.a, false);
    public static final ah2 b = new ah2(2066864887, b.a, false);

    public static final class a extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        public static final a a = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                gk1.a.a(null, 0.0f, 0.0f, null, 0L, bVar2, 196608, 31);
            }
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        public static final b a = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                gk1.a.a(null, 0.0f, 0.0f, null, 0L, bVar2, 196608, 31);
            }
            return j6g.a;
        }
    }
}
