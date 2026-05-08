package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface o9b<E> extends Set, Collection, ze8 {
    @Override // java.util.Set, defpackage.o9b
    k9b add(Object obj);

    @Override // java.util.Set, defpackage.o9b
    o9b<E> addAll(Collection<? extends E> collection);

    l9b builder();

    @Override // java.util.Set, defpackage.o9b
    k9b remove(Object obj);

    @Override // java.util.Set, defpackage.o9b
    o9b<E> removeAll(Collection<? extends E> collection);
}
