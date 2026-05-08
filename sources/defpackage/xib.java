package defpackage;

import defpackage.cfe;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class xib implements Function1 {
    public final String a;

    public xib(String str) {
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cfe.a.C0106a c0106a = (cfe.a.C0106a) obj;
        c0106a.getClass();
        rw7 rw7Var = zib.b;
        String str = this.a;
        c0106a.a(str, rw7Var);
        c0106a.a(str, rw7Var);
        c0106a.c(str, zib.a);
        return j6g.a;
    }
}
