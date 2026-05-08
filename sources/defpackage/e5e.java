package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class e5e extends mj8 implements Function1<s5e, j6g> {
    final /* synthetic */ String $contentDescription;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5e(String str) {
        super(1);
        this.$contentDescription = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(s5e s5eVar) {
        o5e.f(s5eVar, this.$contentDescription);
        return j6g.a;
    }
}
