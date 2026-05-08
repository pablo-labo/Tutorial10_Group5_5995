package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class az6 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ fv6 a;
    public final /* synthetic */ ar6 b;
    public final /* synthetic */ String c;

    public az6(fv6 fv6Var, ar6 ar6Var, String str) {
        this.a = fv6Var;
        this.b = ar6Var;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        if ((num.intValue() & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            ar6 ar6Var = this.b;
            if (ar6Var == null) {
                ar6Var = ar6.Filled;
            }
            ev6.b(this.a, null, ar6Var, null, 0L, this.c.concat("_LeadingIcon"), bVar2, 0, 26);
        }
        return j6g.a;
    }
}
