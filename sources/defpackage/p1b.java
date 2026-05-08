package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class p1b extends b<i1b> {
    public final xu5<u1b, Integer, androidx.compose.runtime.b, Integer, j6g> a;
    public final Function1<Integer, Object> b;
    public final f3a c;

    /* JADX WARN: Multi-variable type inference failed */
    public p1b(xu5<? super u1b, ? super Integer, ? super androidx.compose.runtime.b, ? super Integer, j6g> xu5Var, Function1<? super Integer, ? extends Object> function1, int i) {
        this.a = xu5Var;
        this.b = function1;
        f3a f3aVar = new f3a();
        f3aVar.a(i, new i1b(function1, xu5Var));
        this.c = f3aVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.b
    public final f3a f() {
        return this.c;
    }
}
