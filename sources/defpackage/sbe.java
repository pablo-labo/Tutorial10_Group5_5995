package defpackage;

import defpackage.hbe;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class sbe implements obe {
    @Override // defpackage.obe
    public final hbe a(ojh ojhVar, JSONObject jSONObject) throws JSONException {
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        hbe.b bVar = jSONObject.has("session") ? new hbe.b(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new hbe.b(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new hbe(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (((long) iOptInt) * 1000) + System.currentTimeMillis(), bVar, new hbe.a(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), dOptDouble, dOptDouble2, iOptInt2);
    }
}
