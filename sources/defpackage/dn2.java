package defpackage;

import androidx.compose.runtime.h;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class dn2<T> extends h<T> {
    public final en2<T> b;

    public dn2(Function1<? super mm2, ? extends T> function1) {
        super(new l7(3));
        this.b = new en2<>(function1);
    }

    @Override // androidx.compose.runtime.h
    public final i6c<T> a(T t) {
        return new i6c<>(this, t, t == null, null, true);
    }

    @Override // androidx.compose.runtime.h
    public final olg b() {
        return this.b;
    }
}
