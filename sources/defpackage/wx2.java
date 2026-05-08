package defpackage;

import defpackage.cfe;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class wx2 implements Function1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ wx2(Object obj, int i) {
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
                cfe.a.C0106a c0106a = (cfe.a.C0106a) obj;
                c0106a.getClass();
                c0106a.a((String) obj2, zib.b);
                return j6g.a;
        }
    }
}
