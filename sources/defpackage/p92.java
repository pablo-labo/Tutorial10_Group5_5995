package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p92<E, C extends Collection<? extends E>, B> extends n92<E, C, B> {
    @Override // defpackage.m1
    public final Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // defpackage.m1
    public final int d(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }
}
