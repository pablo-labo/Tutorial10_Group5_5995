package androidx.compose.animation;

import defpackage.mj8;
import defpackage.wl7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class d extends mj8 implements Function1<Object, Boolean> {
    final /* synthetic */ Object $stateForContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Object obj) {
        super(1);
        this.$stateForContent = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(wl7.b(obj, this.$stateForContent));
    }
}
