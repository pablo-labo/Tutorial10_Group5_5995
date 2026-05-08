package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class i15<RowType> {
    public final Function1<wpe, RowType> a;

    /* JADX WARN: Multi-variable type inference failed */
    public i15(Function1<? super wpe, ? extends RowType> function1) {
        this.a = function1;
    }
}
