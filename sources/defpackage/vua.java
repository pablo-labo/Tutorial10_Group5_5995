package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vua implements sx4 {
    public final String a;
    public final Map<String, Object> b;

    public vua(String str, Map<String, ? extends Object> map) {
        this.a = str;
        this.b = map;
    }

    @Override // defpackage.sx4
    public final String getId() {
        return this.a;
    }
}
