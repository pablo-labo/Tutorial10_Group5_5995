package defpackage;

import defpackage.yfb;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class rd6<K extends yfb, V> {
    public final a<K, V> a = new a<>();
    public final HashMap b = new HashMap();

    public final V a(K k) {
        a aVar;
        HashMap map = this.b;
        a aVar2 = (a) map.get(k);
        if (aVar2 == null) {
            a aVar3 = new a(k);
            map.put(k, aVar3);
            aVar = aVar3;
        } else {
            k.a();
            aVar = aVar2;
        }
        a<K, V> aVar4 = aVar.d;
        aVar4.c = aVar.c;
        aVar.c.d = aVar4;
        a<K, V> aVar5 = this.a;
        aVar.d = aVar5;
        a<K, V> aVar6 = aVar5.c;
        aVar.c = aVar6;
        aVar6.d = aVar;
        aVar.d.c = aVar;
        ArrayList arrayList = aVar.b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return (V) aVar.b.remove(size - 1);
        }
        return null;
    }

    public final void b(K k, V v) {
        HashMap map = this.b;
        a aVar = (a) map.get(k);
        if (aVar == null) {
            aVar = new a(k);
            aVar.c = aVar;
            aVar.d = aVar;
            a<K, V> aVar2 = this.a;
            aVar.d = aVar2.d;
            aVar.c = aVar2;
            aVar2.d = aVar;
            aVar.d.c = aVar;
            map.put(k, aVar);
        } else {
            k.a();
        }
        if (aVar.b == null) {
            aVar.b = new ArrayList();
        }
        aVar.b.add(v);
    }

    public final V c() {
        a<K, V> aVar = this.a;
        a aVar2 = aVar.d;
        while (true) {
            boolean zEquals = aVar2.equals(aVar);
            Object obj = aVar2.a;
            V v = null;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = aVar2.b;
            int size = arrayList != null ? arrayList.size() : 0;
            if (size > 0) {
                v = (V) aVar2.b.remove(size - 1);
            }
            if (v != null) {
                return v;
            }
            a<K, V> aVar3 = aVar2.d;
            aVar3.c = aVar2.c;
            aVar2.c.d = aVar3;
            this.b.remove(obj);
            ((yfb) obj).a();
            aVar2 = aVar2.d;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a<K, V> aVar = this.a;
        a aVar2 = aVar.c;
        boolean z = false;
        while (!aVar2.equals(aVar)) {
            sb.append('{');
            sb.append(aVar2.a);
            sb.append(':');
            ArrayList arrayList = aVar2.b;
            sb.append(arrayList != null ? arrayList.size() : 0);
            sb.append("}, ");
            aVar2 = aVar2.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    public static class a<K, V> {
        public final K a;
        public ArrayList b;
        public a<K, V> c;
        public a<K, V> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(yfb yfbVar) {
            this.d = this;
            this.c = this;
            this.a = yfbVar;
        }

        public a() {
            this(null);
        }
    }
}
