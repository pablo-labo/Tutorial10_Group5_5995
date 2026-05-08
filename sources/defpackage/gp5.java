package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class gp5 extends e4 {
    public Integer b;

    @Override // defpackage.rx4
    public final Map<String, Object> a() {
        HashMap map = new HashMap();
        Integer num = this.b;
        if (num != null) {
            map.put("foregroundIndex", Integer.valueOf(num.intValue()));
        }
        return map;
    }

    @Override // defpackage.e4
    public final String d() {
        return "iglu:com.snowplowanalytics.snowplow/application_foreground/jsonschema/1-0-0";
    }
}
