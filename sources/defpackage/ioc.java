package defpackage;

import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ioc implements Predicate {
    public final /* synthetic */ hg a;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return ((Boolean) this.a.invoke(obj)).booleanValue();
    }
}
