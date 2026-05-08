package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class qv6 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ jhf a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function1<jhf, j6g> c;

    public qv6(jhf jhfVar, String str, Function1 function1) {
        this.a = jhfVar;
        this.b = str;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        if ((num.intValue() & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else if (this.a.a.b.length() > 0) {
            bVar2.L(5004770);
            String str = this.b;
            boolean zK = bVar2.K(str);
            Object objV = bVar2.v();
            b.a.C0020a c0020a = b.a.a;
            if (zK || objV == c0020a) {
                objV = new pv6(str, 0);
                bVar2.p(objV);
            }
            bVar2.F();
            e eVarB = b5e.b(e.a.b, false, (Function1) objV);
            bVar2.L(5004770);
            Function1<jhf, j6g> function1 = this.c;
            boolean zK2 = bVar2.K(function1);
            Object objV2 = bVar2.v();
            if (zK2 || objV2 == c0020a) {
                objV2 = new iz1(function1, 1);
                bVar2.p(objV2);
            }
            bVar2.F();
            rq6.b((gu5) objV2, eVarB, true, null, null, wi2.a, bVar2, 196608, 24);
        }
        return j6g.a;
    }
}
