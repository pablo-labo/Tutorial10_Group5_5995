package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class eyg implements gu5<j6g> {
    public final /* synthetic */ Function2<String, Integer, j6g> a;
    public final /* synthetic */ lsc b;
    public final /* synthetic */ int c;

    /* JADX WARN: Multi-variable type inference failed */
    public eyg(Function2<? super String, ? super Integer, j6g> function2, lsc lscVar, int i) {
        this.a = function2;
        this.b = lscVar;
        this.c = i;
    }

    @Override // defpackage.gu5
    public final j6g invoke() {
        this.a.invoke(this.b.a, Integer.valueOf(this.c));
        return j6g.a;
    }
}
