package defpackage;

import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n3<E> extends AbstractSet<E> implements Set<E>, jf8 {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
