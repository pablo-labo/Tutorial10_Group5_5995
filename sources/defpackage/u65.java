package defpackage;

import defpackage.e75;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u65 implements e75.b {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u65(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.wg3
    public Object j(Object obj, ka6 ka6Var) {
        return ((Function) this.a).apply((String) ((e75.b) this.b).j(null, ka6Var));
    }
}
