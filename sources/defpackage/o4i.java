package defpackage;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class o4i extends AbstractMap {
    public static final /* synthetic */ int V = 0;
    public Object[] a;
    public int b;
    public Map c;
    public boolean d;
    public volatile j4i e;
    public Map f;

    public void a() {
        if (this.d) {
            return;
        }
        this.c = this.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.c);
        this.f = this.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f);
        this.d = true;
    }

    public final Set b() {
        return this.c.isEmpty() ? Collections.EMPTY_SET : this.c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        j();
        if (this.b != 0) {
            this.a = null;
            this.b = 0;
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return g(comparable) >= 0 || this.c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        j();
        int iG = g(comparable);
        if (iG >= 0) {
            return ((s3i) this.a[iG]).setValue(obj);
        }
        j();
        if (this.a == null) {
            this.a = new Object[16];
        }
        int i = -(iG + 1);
        if (i >= 16) {
            return i().put(comparable, obj);
        }
        if (this.b == 16) {
            s3i s3iVar = (s3i) this.a[15];
            this.b = 15;
            i().put(s3iVar.a, s3iVar.b);
        }
        Object[] objArr = this.a;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.a[i] = new s3i(this, comparable, obj);
        this.b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.e == null) {
            this.e = new j4i(this);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4i)) {
            return super.equals(obj);
        }
        o4i o4iVar = (o4i) obj;
        int size = size();
        if (size == o4iVar.size()) {
            int i = this.b;
            if (i != o4iVar.b) {
                return entrySet().equals(o4iVar.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (f(i2).equals(o4iVar.f(i2))) {
                }
            }
            if (i != size) {
                return this.c.equals(o4iVar.c);
            }
            return true;
        }
        return false;
    }

    public final s3i f(int i) {
        if (i < this.b) {
            return (s3i) this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final int g(Comparable comparable) {
        int i = this.b;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int iCompareTo = comparable.compareTo(((s3i) this.a[i2]).a);
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int iCompareTo2 = comparable.compareTo(((s3i) this.a[i4]).a);
            if (iCompareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        return iG >= 0 ? ((s3i) this.a[iG]).b : this.c.get(comparable);
    }

    public final Object h(int i) {
        j();
        Object[] objArr = this.a;
        Object obj = ((s3i) objArr[i]).b;
        System.arraycopy(objArr, i + 1, objArr, i, (this.b - i) - 1);
        this.b--;
        if (!this.c.isEmpty()) {
            Iterator it = i().entrySet().iterator();
            Object[] objArr2 = this.a;
            int i2 = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new s3i(this, (Comparable) entry.getKey(), entry.getValue());
            this.b++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.a[i2].hashCode();
        }
        return this.c.size() > 0 ? this.c.hashCode() + iHashCode : iHashCode;
    }

    public final SortedMap i() {
        j();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    public final void j() {
        if (this.d) {
            b0.l();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        j();
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        if (iG >= 0) {
            return h(iG);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size() + this.b;
    }
}
