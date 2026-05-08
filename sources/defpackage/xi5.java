package defpackage;

import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: loaded from: classes3.dex */
public final class xi5<T> extends vpd<T> {
    @Override // defpackage.d78
    public final boolean y(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return q(th);
    }
}
