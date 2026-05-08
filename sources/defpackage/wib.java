package defpackage;

import defpackage.cfe;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class wib implements Function1 {
    public final String a;
    public final String b;

    public wib(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cfe.a.C0106a c0106a = (cfe.a.C0106a) obj;
        c0106a.getClass();
        rw7 rw7Var = zib.b;
        String str = this.a;
        c0106a.a(str, rw7Var);
        rw7 rw7Var2 = zib.c;
        c0106a.a(str, rw7Var2);
        rw7 rw7Var3 = zib.a;
        c0106a.a(this.b, rw7Var, rw7Var2, rw7Var2, rw7Var3);
        c0106a.c(str, rw7Var3);
        return j6g.a;
    }
}
