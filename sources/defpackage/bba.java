package defpackage;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class bba extends mj8 implements Function1<String, Boolean> {
    final /* synthetic */ Bundle $bundle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bba(Bundle bundle) {
        super(1);
        this.$bundle = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        str.getClass();
        return Boolean.valueOf(!this.$bundle.containsKey(r1));
    }
}
