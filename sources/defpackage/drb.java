package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class drb implements goa, ev5 {
    public final /* synthetic */ Function1 a;

    public drb(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.ev5
    public final vu5<?> c() {
        return this.a;
    }

    @Override // defpackage.goa
    public final /* synthetic */ void d(Object obj) {
        this.a.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof goa) || !(obj instanceof ev5)) {
            return false;
        }
        return this.a.equals(((ev5) obj).c());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
