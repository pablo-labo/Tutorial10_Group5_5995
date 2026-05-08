package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class cz6 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ Function1<String, j6g> a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public cz6(String str, String str2, Function1 function1) {
        this.a = function1;
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        if ((num.intValue() & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            bVar2.L(5004770);
            Function1<String, j6g> function1 = this.a;
            boolean zK = bVar2.K(function1);
            Object objV = bVar2.v();
            b.a.C0020a c0020a = b.a.a;
            if (zK || objV == c0020a) {
                objV = new bz6(function1, 0);
                bVar2.p(objV);
            }
            gu5 gu5Var = (gu5) objV;
            bVar2.F();
            String str = this.b;
            e eVarA = f.a(e.a.b, str.concat("_ClearButton"));
            bVar2.L(5004770);
            String str2 = this.c;
            boolean zK2 = bVar2.K(str2);
            Object objV2 = bVar2.v();
            if (zK2 || objV2 == c0020a) {
                objV2 = new wz4(str2, 2);
                bVar2.p(objV2);
            }
            bVar2.F();
            rq6.b(gu5Var, b5e.b(eVarA, false, (Function1) objV2), false, null, null, bh2.c(-830381234, new q10(str, 1), bVar2), bVar2, 196608, 28);
        }
        return j6g.a;
    }
}
