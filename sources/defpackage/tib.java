package defpackage;

import defpackage.cfe;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class tib implements Function1 {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ tib(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.b;
        cfe.a.C0106a c0106a = (cfe.a.C0106a) obj;
        switch (i) {
            case 0:
                c0106a.getClass();
                rw7 rw7Var = zib.b;
                c0106a.a(str, rw7Var, rw7Var, rw7Var);
                break;
            default:
                c0106a.getClass();
                c0106a.a(str, zib.b);
                break;
        }
        return j6g.a;
    }
}
