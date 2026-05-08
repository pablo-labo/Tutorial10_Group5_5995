package defpackage;

import defpackage.cfe;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class ez9 implements Function1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ez9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((List) obj2).get(((Number) obj).intValue());
                return null;
            default:
                String str = (String) obj2;
                cfe.a.C0106a c0106a = (cfe.a.C0106a) obj;
                c0106a.getClass();
                rw7 rw7Var = zib.b;
                c0106a.a(str, rw7Var);
                c0106a.a(str, rw7Var);
                c0106a.a(str, rw7Var);
                c0106a.b(md8.BOOLEAN);
                return j6g.a;
        }
    }
}
