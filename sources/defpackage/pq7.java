package defpackage;

import com.facebook.react.bridge.WritableMap;
import defpackage.s98;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class pq7 {
    public static final WritableMap a(oq7 oq7Var) {
        oq7Var.getClass();
        s98.a aVar = s98.d;
        aVar.getClass();
        JsonElement jsonElementE = aVar.e(oq7.Companion.serializer(), oq7Var);
        if (jsonElementE instanceof JsonObject) {
            return t98.d((JsonObject) jsonElementE);
        }
        return null;
    }
}
