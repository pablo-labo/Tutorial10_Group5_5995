package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class hwe extends u3 {
    public final String b;
    public final String c;
    public String d;
    public String e;
    public Double f;

    public hwe(String str, String str2) {
        if (str.length() <= 0) {
            l5.q("category cannot be empty");
            throw null;
        }
        if (str2.length() <= 0) {
            l5.q("action cannot be empty");
            throw null;
        }
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.rx4
    public final Map<String, Object> a() {
        HashMap map = new HashMap(5);
        map.put("se_ca", this.b);
        map.put("se_ac", this.c);
        String str = this.d;
        if (str != null) {
            map.put("se_la", str);
        }
        String str2 = this.e;
        if (str2 != null) {
            map.put("se_pr", str2);
        }
        Double d = this.f;
        if (d != null) {
            map.put("se_va", String.valueOf(d.doubleValue()));
        }
        return map;
    }

    @Override // defpackage.u3
    public final String d() {
        return "se";
    }
}
