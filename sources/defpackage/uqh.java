package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class uqh implements Iterable {
    public final /* synthetic */ Object a;

    public uqh(Object obj) {
        this.a = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new arh(this);
    }
}
