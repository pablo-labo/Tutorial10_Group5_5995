package defpackage;

import defpackage.cfe;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class vib implements Function1 {
    public final /* synthetic */ int a;
    public final Serializable b;

    public /* synthetic */ vib(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                String str = (String) serializable;
                cfe.a.C0106a c0106a = (cfe.a.C0106a) obj;
                c0106a.getClass();
                rw7 rw7Var = zib.b;
                c0106a.a(str, rw7Var);
                c0106a.a(str, rw7Var);
                c0106a.c(str, zib.a);
                return j6g.a;
            case 1:
                cfe.a.C0106a c0106a2 = (cfe.a.C0106a) obj;
                c0106a2.getClass();
                c0106a2.c((String) serializable, zib.b);
                return j6g.a;
            default:
                ((ArrayList) serializable).get(((Number) obj).intValue());
                return null;
        }
    }
}
