package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class z10 extends mj8 implements Function1<s5e, j6g> {
    final /* synthetic */ String $dialogPaneDescription;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z10(String str) {
        super(1);
        this.$dialogPaneDescription = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(s5e s5eVar) {
        o5e.h(s5eVar, this.$dialogPaneDescription);
        return j6g.a;
    }
}
