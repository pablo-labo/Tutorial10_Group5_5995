package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k3<E> extends AbstractCollection<E> implements Collection<E>, bf8 {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }
}
