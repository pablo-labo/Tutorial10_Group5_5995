package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class q5e extends mj8 implements Function2<Object, Object, Object> {
    public static final q5e a = new q5e(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return obj == null ? obj2 : obj;
    }
}
