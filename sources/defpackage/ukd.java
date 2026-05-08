package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ukd {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final tkd e;

    public ukd(Map<String, ? extends Object> map) {
        map.getClass();
        this.a = new LinkedHashMap(map);
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new tkd(this);
    }

    public final void a(Object obj, String str) {
        str.getClass();
        this.a.put(str, obj);
        h4a h4aVar = (h4a) this.c.get(str);
        if (h4aVar != null) {
            h4aVar.setValue(obj);
        }
        h4a h4aVar2 = (h4a) this.d.get(str);
        if (h4aVar2 != null) {
            h4aVar2.setValue(obj);
        }
    }
}
