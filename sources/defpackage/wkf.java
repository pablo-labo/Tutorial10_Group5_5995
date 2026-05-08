package defpackage;

import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public final class wkf extends ThreadLocal<Object> {
    public final /* synthetic */ Supplier a;

    public wkf(Supplier supplier) {
        this.a = supplier;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return this.a.get();
    }
}
