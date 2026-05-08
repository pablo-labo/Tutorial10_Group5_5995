package defpackage;

import android.content.res.Resources;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class t50 extends mj8 implements Function1<f5e, Boolean> {
    final /* synthetic */ Resources $resources;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t50(Resources resources) {
        super(1);
        this.$resources = resources;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(f5e f5eVar) {
        return Boolean.valueOf(u50.b(f5eVar, this.$resources));
    }
}
