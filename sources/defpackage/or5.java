package defpackage;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class or5 extends mj8 implements Function1<Pair<? extends String, ? extends Boolean>, Boolean> {
    final /* synthetic */ String $id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or5(String str) {
        super(1);
        this.$id = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Pair<? extends String, ? extends Boolean> pair) {
        Pair<? extends String, ? extends Boolean> pair2 = pair;
        pair2.getClass();
        return Boolean.valueOf(wl7.b(pair2.d(), this.$id));
    }
}
