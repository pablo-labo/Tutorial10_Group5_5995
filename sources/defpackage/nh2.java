package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class nh2 {
    public static final ah2 a;

    public static final class a implements wu5<Function2<? super androidx.compose.runtime.b, ? super Integer, ? extends j6g>, androidx.compose.runtime.b, Integer, j6g> {
        public static final a a = new a();

        @Override // defpackage.wu5
        public final j6g q(Function2<? super androidx.compose.runtime.b, ? super Integer, ? extends j6g> function2, androidx.compose.runtime.b bVar, Integer num) {
            Function2<? super androidx.compose.runtime.b, ? super Integer, ? extends j6g> function22 = function2;
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= bVar2.x(function22) ? 4 : 2;
            }
            if (bVar2.o(iIntValue & 1, (iIntValue & 19) != 18)) {
                function22.invoke(bVar2, Integer.valueOf(iIntValue & 14));
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static final class b implements wu5<Function2<? super androidx.compose.runtime.b, ? super Integer, ? extends j6g>, androidx.compose.runtime.b, Integer, j6g> {
        public static final b a = new b();

        @Override // defpackage.wu5
        public final j6g q(Function2<? super androidx.compose.runtime.b, ? super Integer, ? extends j6g> function2, androidx.compose.runtime.b bVar, Integer num) {
            Function2<? super androidx.compose.runtime.b, ? super Integer, ? extends j6g> function22 = function2;
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= bVar2.x(function22) ? 4 : 2;
            }
            if (bVar2.o(iIntValue & 1, (iIntValue & 19) != 18)) {
                function22.invoke(bVar2, Integer.valueOf(iIntValue & 14));
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    static {
        new ah2(759698998, b.a, false);
        a = new ah2(486633673, a.a, false);
    }
}
