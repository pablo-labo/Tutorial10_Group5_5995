package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.auto.value.AutoValue;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class sed {
    public static final i62 a;

    static {
        ea8 ea8Var = new ea8();
        g11 g11Var = g11.a;
        ea8Var.a(sed.class, g11Var);
        ea8Var.a(l31.class, g11Var);
        a = new i62(ea8Var);
    }

    public static l31 a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
        }
        return new l31(string, string2, string3, string4, j);
    }

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract long e();

    public abstract String f();
}
