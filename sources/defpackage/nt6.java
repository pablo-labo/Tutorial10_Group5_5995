package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class nt6 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ fv6 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public nt6(fv6 fv6Var, String str, String str2) {
        this.a = fv6Var;
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        if ((num.intValue() & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            gt6.p(false, false, bh2.c(1701778725, new mt6(this.a, this.b, this.c), bVar2), bVar2, 384, 2);
        }
        return j6g.a;
    }
}
