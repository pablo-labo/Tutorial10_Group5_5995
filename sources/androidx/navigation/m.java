package androidx.navigation;

import android.os.Bundle;
import defpackage.luc;
import defpackage.mj8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class m extends mj8 implements Function1<String, Boolean> {
    final /* synthetic */ luc<Bundle> $args;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(luc<Bundle> lucVar) {
        super(1);
        this.$args = lucVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        String str2 = str;
        str2.getClass();
        Bundle bundle = this.$args.element;
        boolean z = true;
        if (bundle != null && bundle.containsKey(str2)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
