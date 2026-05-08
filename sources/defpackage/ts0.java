package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ts0 extends ArrayList<dwf> implements cwf {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof dwf) {
            return super.contains((dwf) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof dwf) {
            return super.indexOf((dwf) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof dwf) {
            return super.lastIndexOf((dwf) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof dwf) {
            return super.remove((dwf) obj);
        }
        return false;
    }
}
