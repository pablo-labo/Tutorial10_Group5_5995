package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class bmh extends cmh implements NavigableMap {
    public static final bmh V;
    public static final umh f;
    public final transient rnh c;
    public final transient gkh d;
    public final transient bmh e;

    static {
        umh umhVar = umh.a;
        f = umhVar;
        rnh rnhVarN = gmh.n(umhVar);
        ujh ujhVar = gkh.b;
        V = new bmh(rnhVarN, enh.e, null);
    }

    public bmh(rnh rnhVar, gkh gkhVar, bmh bmhVar) {
        this.c = rnhVar;
        this.d = gkhVar;
        this.e = bmhVar;
    }

    public static bmh b(TreeMap treeMap) {
        Comparator comparator = treeMap.comparator();
        int i = 1;
        final umh umhVar = f;
        boolean zEquals = comparator == null ? true : umhVar.equals(comparator);
        Collection collectionEntrySet = treeMap.entrySet();
        if (!(collectionEntrySet instanceof Collection)) {
            Iterator it = collectionEntrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collectionEntrySet = arrayList;
        }
        Map.Entry[] entryArr = (Map.Entry[]) collectionEntrySet.toArray(klh.b);
        int length = entryArr.length;
        if (length == 0) {
            return d(umhVar);
        }
        int i2 = 0;
        if (length == 1) {
            Map.Entry entry = entryArr[0];
            entry.getClass();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object[] objArr = {key};
            for (int i3 = 0; i3 < 1; i3++) {
                if (objArr[i3] == null) {
                    ja.k(p6.c(i3, "at index "));
                    return null;
                }
            }
            rnh rnhVar = new rnh(gkh.i(1, objArr), umhVar);
            Object[] objArr2 = {value};
            while (i2 < 1) {
                if (objArr2[i2] == null) {
                    ja.k(p6.c(i2, "at index "));
                    return null;
                }
                i2++;
            }
            return new bmh(rnhVar, gkh.i(1, objArr2), null);
        }
        Object[] objArr3 = new Object[length];
        Object[] objArr4 = new Object[length];
        if (zEquals) {
            while (i2 < length) {
                Map.Entry entry2 = entryArr[i2];
                entry2.getClass();
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                kjh.a(key2, value2);
                objArr3[i2] = key2;
                objArr4[i2] = value2;
                i2++;
            }
        } else {
            Arrays.sort(entryArr, 0, length, new Comparator() { // from class: vlh
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Map.Entry entry3 = (Map.Entry) obj;
                    Map.Entry entry4 = (Map.Entry) obj2;
                    umh umhVar2 = bmh.f;
                    entry3.getClass();
                    entry4.getClass();
                    return umhVar.compare(entry3.getKey(), entry4.getKey());
                }
            });
            Map.Entry entry3 = entryArr[0];
            entry3.getClass();
            Object key3 = entry3.getKey();
            objArr3[0] = key3;
            Object value3 = entry3.getValue();
            objArr4[0] = value3;
            kjh.a(objArr3[0], value3);
            while (i < length) {
                Map.Entry entry4 = entryArr[i - 1];
                entry4.getClass();
                Map.Entry entry5 = entryArr[i];
                entry5.getClass();
                Object key4 = entry5.getKey();
                Object value4 = entry5.getValue();
                kjh.a(key4, value4);
                objArr3[i] = key4;
                objArr4[i] = value4;
                if (umhVar.compare(key3, key4) == 0) {
                    l5.q(t40.l("Multiple entries with same key: ", String.valueOf(entry4), " and ", String.valueOf(entry5)));
                    return null;
                }
                i++;
                key3 = key4;
            }
        }
        return new bmh(new rnh(gkh.i(length, objArr3), umhVar), gkh.i(length, objArr4), null);
    }

    public static bmh d(Comparator comparator) {
        if (umh.a.equals(comparator)) {
            return V;
        }
        rnh rnhVarN = gmh.n(comparator);
        ujh ujhVar = gkh.b;
        return new bmh(rnhVarN, enh.e, null);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        Map.Entry entryCeilingEntry = ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return entryCeilingEntry.getKey();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.c.c;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.c.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        bmh bmhVar = this.e;
        if (bmhVar != null) {
            return bmhVar;
        }
        boolean zIsEmpty = isEmpty();
        rnh rnhVar = this.c;
        if (!zIsEmpty) {
            return new bmh((rnh) rnhVar.descendingSet(), this.d.f(), this);
        }
        Comparator comparator = rnhVar.c;
        return d((comparator instanceof anh ? (anh) comparator : new mjh(comparator)).a());
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final bmh headMap(Object obj, boolean z) {
        obj.getClass();
        return i(0, this.c.o(obj, z));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().j().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.c.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        Map.Entry entryFloorEntry = floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return entryFloorEntry.getKey();
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final bmh subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.c.c.compare(obj, obj2) <= 0) {
            return headMap(obj2, z2).tailMap(obj, z);
        }
        l5.q(ejh.a("expected fromKey <= toKey but %s > %s", obj, obj2));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005  */
    @Override // defpackage.klh, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            rnh r0 = r3.c
            r1 = -1
            if (r4 != 0) goto L7
        L5:
            r4 = r1
            goto L12
        L7:
            gkh r2 = r0.e     // Catch: java.lang.ClassCastException -> L5
            java.util.Comparator r0 = r0.c     // Catch: java.lang.ClassCastException -> L5
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L5
            if (r4 >= 0) goto L12
            goto L5
        L12:
            if (r4 != r1) goto L16
            r3 = 0
            return r3
        L16:
            gkh r3 = r3.d
            java.lang.Object r3 = r3.get(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmh.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final bmh tailMap(Object obj, boolean z) {
        obj.getClass();
        return i(this.c.q(obj, z), this.d.size());
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        Map.Entry entryHigherEntry = higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return entryHigherEntry.getKey();
    }

    public final bmh i(int i, int i2) {
        gkh gkhVar = this.d;
        if (i == 0) {
            if (i2 == gkhVar.size()) {
                return this;
            }
            i = 0;
        }
        rnh rnhVar = this.c;
        return i == i2 ? d(rnhVar.c) : new bmh(rnhVar.r(i, i2), gkhVar.subList(i, i2), null);
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Set keySet() {
        return this.c;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().j().get(this.d.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.c.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        Map.Entry entryLowerEntry = lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return entryLowerEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.c;
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.d.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Collection values() {
        return this.d;
    }
}
