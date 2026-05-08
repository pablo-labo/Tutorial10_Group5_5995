package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", l = {22}, m = "toCollection")
public final class ij5<T, C extends Collection<? super T>> extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return wg2.b0(null, null, this);
    }
}
