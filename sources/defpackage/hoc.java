package defpackage;

import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hoc implements Predicate {
    public final /* synthetic */ wi a;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return ((Boolean) this.a.invoke(obj)).booleanValue();
    }
}
