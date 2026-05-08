package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class x39 {
    public final hb9 a;

    public x39(hb9 hb9Var, Function1 function1) {
        hb9 hb9Var2 = new hb9();
        hb9Var2.putAll(hb9Var);
        function1.invoke(hb9Var2);
        this.a = hb9Var2.j();
    }

    public x39(Function1<? super Map<String, String>, j6g> function1) {
        hb9 hb9Var = new hb9();
        function1.invoke(hb9Var);
        this.a = hb9Var.j();
    }
}
