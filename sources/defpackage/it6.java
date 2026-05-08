package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class it6 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ fv6 a;
    public final /* synthetic */ String b;

    public it6(fv6 fv6Var, String str) {
        this.a = fv6Var;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        if ((num.intValue() & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            gt6.p(false, true, bh2.c(-260689930, new ht6(this.a, this.b), bVar2), bVar2, 432, 0);
        }
        return j6g.a;
    }
}
