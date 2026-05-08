package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class u6e implements r6e<Object> {
    public final /* synthetic */ Function2 a;

    public u6e(Function2 function2) {
        this.a = function2;
    }

    @Override // defpackage.r6e
    public final Iterator<Object> iterator() {
        return q92.w(this.a);
    }
}
