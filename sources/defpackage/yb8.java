package defpackage;

import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final class yb8 extends ub8 {
    public String h;
    public boolean i;

    @Override // defpackage.ub8, defpackage.t2
    public final JsonElement W() {
        return new JsonObject(this.g);
    }

    @Override // defpackage.ub8, defpackage.t2
    public final void X(String str, JsonElement jsonElement) {
        str.getClass();
        jsonElement.getClass();
        if (!this.i) {
            String str2 = this.h;
            if (str2 == null) {
                wl7.g("tag");
                throw null;
            }
            this.g.put(str2, jsonElement);
            this.i = true;
            return;
        }
        if (jsonElement instanceof JsonPrimitive) {
            this.h = ((JsonPrimitive) jsonElement).a();
            this.i = false;
        } else {
            if (jsonElement instanceof JsonObject) {
                throw boa.c(db8.b);
            }
            if (jsonElement instanceof JsonArray) {
                throw boa.c(x98.b);
            }
            l.g();
        }
    }
}
