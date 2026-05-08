package androidx.navigation;

import defpackage.mj8;
import defpackage.wl7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class i extends mj8 implements Function1<String, Boolean> {
    final /* synthetic */ String $backStackId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str) {
        super(1);
        this.$backStackId = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        return Boolean.valueOf(wl7.b(str, this.$backStackId));
    }
}
