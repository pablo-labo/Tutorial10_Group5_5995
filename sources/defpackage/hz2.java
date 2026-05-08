package defpackage;

import androidx.media3.exoplayer.drm.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class hz2<E> implements Iterable<E> {
    public final Object a = new Object();
    public final HashMap b = new HashMap();
    public Set<E> c = Collections.EMPTY_SET;
    public List<E> d = Collections.EMPTY_LIST;

    public final int a(a.C0043a c0043a) {
        int iIntValue;
        synchronized (this.a) {
            try {
                iIntValue = this.b.containsKey(c0043a) ? ((Integer) this.b.get(c0043a)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.a) {
            it = this.d.iterator();
        }
        return it;
    }
}
