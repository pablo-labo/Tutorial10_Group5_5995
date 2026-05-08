package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qkd {
    public final LinkedHashMap a;
    public final ukd b;

    public static final class a<T> extends g3a<T> {
        public String l;
        public qkd m;

        @Override // defpackage.pz8
        public final void j(T t) {
            ukd ukdVar;
            qkd qkdVar = this.m;
            if (qkdVar != null && (ukdVar = qkdVar.b) != null) {
                ukdVar.a(t, this.l);
            }
            super.j(t);
        }
    }

    public qkd() {
        this.a = new LinkedHashMap();
        this.b = new ukd(bs4.a);
    }

    public final a a(String str) {
        a aVar;
        ukd ukdVar = this.b;
        LinkedHashMap linkedHashMap = ukdVar.d;
        LinkedHashMap linkedHashMap2 = ukdVar.a;
        if (linkedHashMap.containsKey(str)) {
            h5.k(l5.m("StateFlow and LiveData are mutually exclusive for the same key. Please use either 'getMutableStateFlow' or 'getLiveData' for key '", str, "', but not both."));
            return null;
        }
        LinkedHashMap linkedHashMap3 = this.a;
        Object obj = linkedHashMap3.get(str);
        Object obj2 = obj;
        if (obj == null) {
            if (linkedHashMap2.containsKey(str)) {
                a aVar2 = new a(linkedHashMap2.get(str));
                aVar2.l = str;
                aVar2.m = this;
                aVar = aVar2;
            } else {
                a aVar3 = new a();
                aVar3.l = str;
                aVar3.m = this;
                aVar = aVar3;
            }
            linkedHashMap3.put(str, aVar);
            obj2 = aVar;
        }
        return (a) obj2;
    }

    public qkd(hb9 hb9Var) {
        this.a = new LinkedHashMap();
        this.b = new ukd(hb9Var);
    }
}
