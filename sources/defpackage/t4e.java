package defpackage;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class t4e {
    public final HashMap<String, Object> a;

    public t4e(rqf rqfVar) {
        HashMap<String, Object> map = new HashMap<>();
        this.a = map;
        b("iglu:com.snowplowanalytics.mobile/screen/jsonschema/1-0-0");
        map.put("data", rqfVar.b);
    }

    public final void a(Object obj) {
        if (obj != null) {
            this.a.put("data", obj);
        }
    }

    public final void b(String str) {
        str.getClass();
        if (str.length() > 0) {
            this.a.put("schema", str);
        } else {
            l5.q("schema cannot be empty");
        }
    }

    public final String toString() {
        String string = new JSONObject(this.a).toString();
        string.getClass();
        return string;
    }

    public t4e(Object obj, String str) {
        str.getClass();
        obj.getClass();
        this.a = new HashMap<>();
        b(str);
        a(obj);
    }

    public t4e(String str) {
        this.a = new HashMap<>();
        b(str);
        a(new HashMap());
    }
}
