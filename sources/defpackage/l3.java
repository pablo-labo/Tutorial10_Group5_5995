package defpackage;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l3<E> extends AbstractList<E> implements List<E>, bf8 {
    public abstract int a();

    public abstract E b(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return b(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
