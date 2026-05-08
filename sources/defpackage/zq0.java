package defpackage;

import defpackage.cfe;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class zq0 implements Function1 {
    public final /* synthetic */ int a;
    public final Serializable b;

    public /* synthetic */ zq0(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                ((ArrayList) serializable).get(((Number) obj).intValue());
                return null;
            default:
                cfe.a.C0106a c0106a = (cfe.a.C0106a) obj;
                c0106a.getClass();
                rw7 rw7Var = zib.b;
                c0106a.a((String) serializable, rw7Var, rw7Var);
                c0106a.b(md8.BOOLEAN);
                return j6g.a;
        }
    }
}
