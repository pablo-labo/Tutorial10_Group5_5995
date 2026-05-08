package defpackage;

import defpackage.hbe;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class iq3 implements obe {
    public static hbe b(ojh ojhVar) {
        return new hbe(System.currentTimeMillis() + 3600000, new hbe.b(8), new hbe.a(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override // defpackage.obe
    public final hbe a(ojh ojhVar, JSONObject jSONObject) {
        return b(ojhVar);
    }
}
