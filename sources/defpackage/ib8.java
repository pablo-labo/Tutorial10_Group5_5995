package defpackage;

import defpackage.ymb;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final class ib8 implements KSerializer<JsonPrimitive> {
    public static final ib8 a = new ib8();
    public static final f7e b = i7e.c("kotlinx.serialization.json.JsonPrimitive", ymb.i.a, new SerialDescriptor[0]);

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        JsonElement jsonElementI = ie7.g(decoder).i();
        if (jsonElementI instanceof JsonPrimitive) {
            return (JsonPrimitive) jsonElementI;
        }
        StringBuilder sb = new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
        throw boa.f(-1, ia.m(fwc.a, jsonElementI.getClass(), sb), jsonElementI.toString());
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor get$$serialDesc() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        jsonPrimitive.getClass();
        ie7.f(encoder);
        if (jsonPrimitive instanceof JsonNull) {
            encoder.t(ya8.a, JsonNull.INSTANCE);
        } else {
            encoder.t(ua8.a, (ta8) jsonPrimitive);
        }
    }
}
