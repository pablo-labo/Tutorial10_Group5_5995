package defpackage;

import defpackage.cfe;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class yib implements Function1 {
    public final String a;
    public final String b;

    public yib(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cfe.a.C0106a c0106a = (cfe.a.C0106a) obj;
        c0106a.getClass();
        c0106a.a(this.a, zib.a);
        c0106a.c(this.b, zib.b, zib.c);
        return j6g.a;
    }
}
