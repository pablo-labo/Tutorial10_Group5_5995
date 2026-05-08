package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class i1b implements b.a {
    public final Function1<Integer, Object> a;
    public final xu5<u1b, Integer, androidx.compose.runtime.b, Integer, j6g> b;

    /* JADX WARN: Multi-variable type inference failed */
    public i1b(Function1<? super Integer, ? extends Object> function1, xu5<? super u1b, ? super Integer, ? super androidx.compose.runtime.b, ? super Integer, j6g> xu5Var) {
        this.a = function1;
        this.b = xu5Var;
    }

    @Override // androidx.compose.foundation.lazy.layout.b.a
    public final Function1<Integer, Object> getKey() {
        return this.a;
    }
}
