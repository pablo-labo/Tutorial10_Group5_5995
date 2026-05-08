package defpackage;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wrc implements oug {
    public final LinkedHashMap<MemoryCache.Key, ArrayList<a>> a = new LinkedHashMap<>();
    public int b;

    public static final class a {
        public final int a;
        public final WeakReference<Bitmap> b;
        public final Map<String, Object> c;
        public final int d;

        public a(int i, WeakReference<Bitmap> weakReference, Map<String, ? extends Object> map, int i2) {
            this.a = i;
            this.b = weakReference;
            this.c = map;
            this.d = i2;
        }
    }

    @Override // defpackage.oug
    public final synchronized void a(int i) {
        if (i >= 10 && i != 20) {
            d();
        }
    }

    @Override // defpackage.oug
    public final synchronized MemoryCache.a b(MemoryCache.Key key) {
        try {
            ArrayList<a> arrayList = this.a.get(key);
            MemoryCache.a aVar = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                a aVar2 = arrayList.get(i);
                Bitmap bitmap = aVar2.b.get();
                MemoryCache.a aVar3 = bitmap != null ? new MemoryCache.a(bitmap, aVar2.c) : null;
                if (aVar3 != null) {
                    aVar = aVar3;
                    break;
                }
                i++;
            }
            int i2 = this.b;
            this.b = i2 + 1;
            if (i2 >= 10) {
                d();
            }
            return aVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.oug
    public final synchronized void c(MemoryCache.Key key, Bitmap bitmap, Map<String, ? extends Object> map, int i) {
        try {
            LinkedHashMap<MemoryCache.Key, ArrayList<a>> linkedHashMap = this.a;
            ArrayList<a> arrayList = linkedHashMap.get(key);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(key, arrayList);
            }
            ArrayList<a> arrayList2 = arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            a aVar = new a(iIdentityHashCode, new WeakReference(bitmap), map, i);
            int size = arrayList2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    arrayList2.add(aVar);
                    break;
                }
                a aVar2 = arrayList2.get(i2);
                if (i < aVar2.d) {
                    i2++;
                } else if (aVar2.a == iIdentityHashCode && aVar2.b.get() == bitmap) {
                    arrayList2.set(i2, aVar);
                } else {
                    arrayList2.add(i2, aVar);
                }
            }
            int i3 = this.b;
            this.b = i3 + 1;
            if (i3 >= 10) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        this.b = 0;
        Iterator<ArrayList<a>> it = this.a.values().iterator();
        while (it.hasNext()) {
            ArrayList<a> next = it.next();
            if (next.size() <= 1) {
                a aVar = (a) z92.Q0(next);
                if ((aVar != null ? aVar.b.get() : null) == null) {
                    it.remove();
                }
            } else {
                int size = next.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (next.get(i3).b.get() == null) {
                        next.remove(i3);
                        i++;
                    }
                }
                if (next.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
