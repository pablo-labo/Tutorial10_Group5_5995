package defpackage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class lla {
    public static final HashMap a;
    public static final WeakHashMap<a, b> b;

    public static abstract class a {
        public abstract void a(HashMap map);
    }

    public static final class b extends WeakReference<a> {
        public boolean a;
    }

    static {
        new lla();
        a = new HashMap();
        b = new WeakHashMap<>();
    }

    public static final synchronized void a(String str, a aVar) {
        try {
            b bVar = new b(aVar);
            bVar.a = true;
            b bVarPut = b.put(aVar, bVar);
            if (bVarPut != null) {
                synchronized (bVarPut) {
                    bVarPut.a = false;
                    bVarPut.clear();
                }
            }
            HashMap map = a;
            List linkedList = (List) map.get(str);
            if (linkedList == null) {
                linkedList = new LinkedList();
                map.put(str, linkedList);
            }
            linkedList.add(bVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static final synchronized void b(String str, HashMap map) {
        boolean z;
        try {
            List list = (List) a.get(str);
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    synchronized (bVar) {
                        z = bVar.a && bVar.get() != null;
                    }
                    if (z) {
                        HashMap map2 = new HashMap(map);
                        a aVar = bVar.get();
                        if (aVar != null) {
                            aVar.a(map2);
                        }
                    } else {
                        synchronized (lla.class) {
                            it.remove();
                            j6g j6gVar = j6g.a;
                        }
                    }
                }
                list.isEmpty();
            }
        } finally {
        }
    }

    public static final synchronized void c(a aVar) {
        aVar.getClass();
        b bVarRemove = b.remove(aVar);
        if (bVarRemove != null) {
            synchronized (bVarRemove) {
                bVarRemove.a = false;
                bVarRemove.clear();
            }
        }
    }
}
