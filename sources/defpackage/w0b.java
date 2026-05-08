package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class w0b extends u3 {
    public final String b;
    public String c;
    public String d;

    public w0b(String str) {
        if (str.length() > 0) {
            this.b = str;
        } else {
            l5.q("pageUrl cannot be empty");
            throw null;
        }
    }

    @Override // defpackage.rx4
    public final Map<String, Object> a() {
        HashMap map = new HashMap();
        map.put("url", this.b);
        String str = this.c;
        if (str != null) {
            map.put("page", str);
        }
        String str2 = this.d;
        if (str2 != null) {
            map.put("refr", str2);
        }
        return map;
    }

    @Override // defpackage.u3
    public final String d() {
        return "pv";
    }
}
