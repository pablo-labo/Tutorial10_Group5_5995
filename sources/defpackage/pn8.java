package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class pn8 implements b.a {
    public final Function2<yn8, Integer, ld6> a;
    public final k4f b;
    public final ah2 c;

    public pn8(Function2 function2, k4f k4fVar, ah2 ah2Var) {
        this.a = function2;
        this.b = k4fVar;
        this.c = ah2Var;
    }

    @Override // androidx.compose.foundation.lazy.layout.b.a
    public final Function1<Integer, Object> getKey() {
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.b.a
    public final Function1<Integer, Object> getType() {
        return this.b;
    }
}
