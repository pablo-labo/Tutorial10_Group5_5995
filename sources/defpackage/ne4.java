package defpackage;

import androidx.compose.runtime.h;

/* JADX INFO: loaded from: classes.dex */
public final class ne4<T> extends h<T> {
    public final hme<T> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne4(gu5 gu5Var) {
        super(gu5Var);
        wab wabVar = wab.a0;
        this.b = wabVar;
    }

    @Override // androidx.compose.runtime.h
    public final i6c<T> a(T t) {
        return new i6c<>(this, t, t == null, this.b, true);
    }
}
