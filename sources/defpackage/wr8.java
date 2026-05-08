package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class wr8 implements b.a {
    public final Function1<Integer, Object> a;
    public final Function1<Integer, Object> b;
    public final ah2 c;

    public wr8(Function1 function1, Function1 function12, ah2 ah2Var) {
        this.a = function1;
        this.b = function12;
        this.c = ah2Var;
    }

    @Override // androidx.compose.foundation.lazy.layout.b.a
    public final Function1<Integer, Object> getKey() {
        return this.a;
    }

    @Override // androidx.compose.foundation.lazy.layout.b.a
    public final Function1<Integer, Object> getType() {
        return this.b;
    }
}
