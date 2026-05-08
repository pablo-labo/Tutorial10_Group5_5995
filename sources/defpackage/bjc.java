package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class bjc implements Function1 {
    public static final bjc a = new bjc();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        return "(raw) ".concat(str);
    }
}
