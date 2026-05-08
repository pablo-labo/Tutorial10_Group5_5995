package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gmh extends rlh implements NavigableSet, joh {
    public final transient Comparator c;
    public transient gmh d;

    public gmh(Comparator comparator) {
        this.c = comparator;
    }

    public static rnh n(Comparator comparator) {
        if (umh.a.equals(comparator)) {
            return rnh.f;
        }
        ujh ujhVar = gkh.b;
        return new rnh(enh.e, comparator);
    }

    @Override // java.util.SortedSet, defpackage.joh
    public final Comparator comparator() {
        return this.c;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        rnh rnhVar = (rnh) this;
        return rnhVar.r(0, rnhVar.o(obj, false));
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final gmh descendingSet() {
        gmh gmhVarN = this.d;
        if (gmhVarN == null) {
            rnh rnhVar = (rnh) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(rnhVar.c);
            gmhVarN = rnhVar.isEmpty() ? n(comparatorReverseOrder) : new rnh(rnhVar.e.f(), comparatorReverseOrder);
            this.d = gmhVarN;
            gmhVarN.d = this;
        }
        return gmhVarN;
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final rnh subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.c.compare(obj, obj2) > 0) {
            o6.h();
            return null;
        }
        rnh rnhVar = (rnh) this;
        rnh rnhVarR = rnhVar.r(rnhVar.q(obj, z), rnhVar.e.size());
        return rnhVarR.r(0, rnhVarR.o(obj2, z2));
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        rnh rnhVar = (rnh) this;
        return rnhVar.r(rnhVar.q(obj, true), rnhVar.e.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        rnh rnhVar = (rnh) this;
        return rnhVar.r(0, rnhVar.o(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        rnh rnhVar = (rnh) this;
        return rnhVar.r(rnhVar.q(obj, z), rnhVar.e.size());
    }
}
