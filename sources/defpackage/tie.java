package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class tie implements sie {
    public final Function2<th7, th7, jf5<th7>> a;

    public tie(Function2 function2) {
        this.a = function2;
    }

    @Override // defpackage.sie
    public final boolean a() {
        return true;
    }

    @Override // defpackage.sie
    public final jf5<th7> b(long j, long j2) {
        return this.a.invoke(new th7(j), new th7(j2));
    }
}
