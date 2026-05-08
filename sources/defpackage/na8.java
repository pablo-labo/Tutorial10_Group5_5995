package defpackage;

import defpackage.kfb;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final class na8 implements KSerializer<JsonElement> {
    public static final na8 a = new na8();
    public static final f7e b = i7e.b("kotlinx.serialization.json.JsonElement", kfb.b.a, new SerialDescriptor[0], new xr(6));

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        return ie7.g(decoder).i();
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor get$$serialDesc() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        JsonElement jsonElement = (JsonElement) obj;
        jsonElement.getClass();
        ie7.f(encoder);
        if (jsonElement instanceof JsonPrimitive) {
            encoder.t(ib8.a, jsonElement);
            return;
        }
        if (jsonElement instanceof JsonObject) {
            encoder.t(db8.a, jsonElement);
        } else if (jsonElement instanceof JsonArray) {
            encoder.t(x98.a, jsonElement);
        } else {
            l.g();
        }
    }
}
