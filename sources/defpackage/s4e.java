package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class s4e extends e4 {
    public final Map<String, Object> b;
    public final String c;

    public s4e(t4e t4eVar) {
        HashMap<String, Object> map = t4eVar.a;
        Object obj = map.get("data");
        obj.getClass();
        this.b = (Map) obj;
        Object obj2 = map.get("schema");
        obj2.getClass();
        this.c = (String) obj2;
    }

    @Override // defpackage.rx4
    public final Map<String, Object> a() {
        return this.b;
    }

    @Override // defpackage.e4
    public final String d() {
        return this.c;
    }

    public s4e(String str, HashMap map) {
        this.c = str;
        this.b = map;
        new t4e(map, str);
    }
}
