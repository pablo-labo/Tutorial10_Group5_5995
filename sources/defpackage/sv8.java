package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class sv8 extends t4e {
    public final HashMap<String, Object> b;

    public sv8(boolean z) {
        super("iglu:com.snowplowanalytics.mobile/application_lifecycle/jsonschema/1-0-0");
        HashMap<String, Object> map = new HashMap<>();
        this.b = map;
        map.put("isVisible", Boolean.valueOf(z));
        a(map);
    }
}
