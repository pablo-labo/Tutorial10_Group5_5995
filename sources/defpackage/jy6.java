package defpackage;

import androidx.compose.runtime.b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class jy6 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ List<dy6> a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function1<Integer, j6g> d;

    public jy6(int i, String str, List list, Function1 function1) {
        this.a = list;
        this.b = i;
        this.c = str;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        if ((num.intValue() & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            int i = 0;
            for (Object obj : z92.q1(this.a, 5)) {
                int i2 = i + 1;
                if (i < 0) {
                    u63.o0();
                    throw null;
                }
                dy6 dy6Var = (dy6) obj;
                boolean z = this.b == i;
                String str = this.c + "_Tab_" + i;
                bVar2.L(-1633490746);
                Function1<Integer, j6g> function1 = this.d;
                boolean zK = bVar2.K(function1) | bVar2.d(i);
                Object objV = bVar2.v();
                if (zK || objV == b.a.a) {
                    objV = new jj3(function1, i);
                    bVar2.p(objV);
                }
                bVar2.F();
                ky6.b(dy6Var, null, z, str, (gu5) objV, bVar2, 0);
                i = i2;
            }
        }
        return j6g.a;
    }
}
