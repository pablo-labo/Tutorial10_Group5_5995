package defpackage;

import defpackage.ere;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class eyf implements Function1<mq5, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(mq5 mq5Var) {
        if (mq5Var != null) {
            return Boolean.valueOf(!r1.equals(ere.a.y));
        }
        l5.q("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
        return null;
    }
}
