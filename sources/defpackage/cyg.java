package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class cyg implements gu5<j6g> {
    public final /* synthetic */ Function1<Integer, j6g> a;
    public final /* synthetic */ int b;

    /* JADX WARN: Multi-variable type inference failed */
    public cyg(Function1<? super Integer, j6g> function1, int i) {
        this.a = function1;
        this.b = i;
    }

    @Override // defpackage.gu5
    public final j6g invoke() {
        this.a.invoke(Integer.valueOf(this.b));
        return j6g.a;
    }
}
