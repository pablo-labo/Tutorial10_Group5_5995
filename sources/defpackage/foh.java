package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class foh extends AbstractMap<String, Object> implements Cloneable {
    public Map<String, Object> a;
    public final xmh b;

    public final class a extends AbstractSet<Map.Entry<String, Object>> {
        public final znh a;

        public a() {
            this.a = new znh(new bnh(foh.this, foh.this.b.b));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            foh.this.a.clear();
            this.a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<String, Object>> iterator() {
            return new b(foh.this, this.a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.a.size() + foh.this.a.size();
        }
    }

    public final class b implements Iterator<Map.Entry<String, Object>> {
        public boolean a;
        public final onh b;
        public final Iterator<Map.Entry<String, Object>> c;

        public b(foh fohVar, znh znhVar) {
            this.b = (onh) znhVar.iterator();
            this.c = fohVar.a.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b.hasNext() || this.c.hasNext();
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Map.Entry<String, Object> next() {
            if (!this.a) {
                onh onhVar = this.b;
                if (onhVar.hasNext()) {
                    return onhVar.next();
                }
                this.a = true;
            }
            return this.c.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.a) {
                this.c.remove();
            }
            this.b.remove();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c a;
        public static final /* synthetic */ c[] b;

        static {
            c cVar = new c("IGNORE_CASE", 0);
            a = cVar;
            b = new c[]{cVar};
        }

        public c() {
            throw null;
        }

        public static c[] values() {
            return (c[]) b.clone();
        }
    }

    public foh() {
        EnumSet enumSetNoneOf = EnumSet.noneOf(c.class);
        this.a = new kmh();
        this.b = xmh.a(getClass(), enumSetNoneOf.contains(c.a));
    }

    @Override // java.util.AbstractMap
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public foh clone() {
        try {
            foh fohVar = (foh) super.clone();
            lnh.b(this, fohVar);
            fohVar.a = (Map) lnh.a(this.a);
            return fohVar;
        } catch (CloneNotSupportedException e) {
            z3.q(e);
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<String, Object>> entrySet() {
        return new a();
    }

    public void f(Object obj, String str) {
        xmh xmhVar = this.b;
        hoh hohVarB = xmhVar.b(str);
        if (hohVarB != null) {
            hohVarB.c(this, obj);
            return;
        }
        if (xmhVar.b) {
            str = str.toLowerCase(Locale.US);
        }
        this.a.put(str, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String lowerCase = (String) obj;
        xmh xmhVar = this.b;
        hoh hohVarB = xmhVar.b(lowerCase);
        if (hohVarB != null) {
            return hoh.a(this, hohVarB.b);
        }
        if (xmhVar.b) {
            lowerCase = lowerCase.toLowerCase(Locale.US);
        }
        return this.a.get(lowerCase);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        String lowerCase = (String) obj;
        xmh xmhVar = this.b;
        hoh hohVarB = xmhVar.b(lowerCase);
        if (hohVarB != null) {
            Object objA = hoh.a(this, hohVarB.b);
            hohVarB.c(this, obj2);
            return objA;
        }
        if (xmhVar.b) {
            lowerCase = lowerCase.toLowerCase(Locale.US);
        }
        return this.a.put(lowerCase, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends String, ?> map) {
        for (Map.Entry<? extends String, ?> entry : map.entrySet()) {
            f(entry.getValue(), entry.getKey());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String lowerCase = (String) obj;
        xmh xmhVar = this.b;
        if (xmhVar.b(lowerCase) != null) {
            b0.l();
            return null;
        }
        if (xmhVar.b) {
            lowerCase = lowerCase.toLowerCase(Locale.US);
        }
        return this.a.remove(lowerCase);
    }
}
