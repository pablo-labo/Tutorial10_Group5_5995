package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class kff extends mj8 implements Function1<s5e, j6g> {
    final /* synthetic */ String $defaultErrorMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kff(String str) {
        super(1);
        this.$defaultErrorMessage = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(s5e s5eVar) {
        o5e.a(s5eVar, this.$defaultErrorMessage);
        return j6g.a;
    }
}
