package defpackage;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class kba extends mj8 implements Function1<Bundle, iba> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kba(Context context) {
        super(1);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final iba invoke(Bundle bundle) {
        iba ibaVarC = q92.c(this.$context);
        ibaVarC.x(bundle);
        return ibaVarC;
    }
}
