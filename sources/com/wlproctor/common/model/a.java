package com.wlproctor.common.model;

import defpackage.z6b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements KSerializer<Payload> {
    public static final a a = new a();
    public static final SerialDescriptor b = PayloadSurrogate.INSTANCE.serializer().getDescriptor();

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        PayloadSurrogate payloadSurrogate = (PayloadSurrogate) decoder.B(PayloadSurrogate.INSTANCE.serializer());
        Double d = payloadSurrogate.a;
        List<Double> list = payloadSurrogate.b;
        Long l = payloadSurrogate.c;
        List<Long> list2 = payloadSurrogate.d;
        String str = payloadSurrogate.e;
        List<String> list3 = payloadSurrogate.f;
        JsonObject jsonObject = payloadSurrogate.g;
        LinkedHashMap linkedHashMapE = jsonObject != null ? z6b.e(jsonObject) : null;
        JsonObject jsonObject2 = payloadSurrogate.h;
        return new Payload(d, list, l, list2, str, list3, linkedHashMapE, jsonObject2 != null ? z6b.e(jsonObject2) : null);
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        Payload payload = (Payload) obj;
        payload.getClass();
        Double doubleValue = payload.getDoubleValue();
        List<Double> doubleArray = payload.getDoubleArray();
        Long longValue = payload.getLongValue();
        List<Long> longArray = payload.getLongArray();
        String stringValue = payload.getStringValue();
        List<String> stringArray = payload.getStringArray();
        Map<String, Object> map = payload.getMap();
        JsonObject jsonObjectB = map != null ? z6b.b(map) : null;
        Map<String, Object> json = payload.getJson();
        encoder.t(PayloadSurrogate.INSTANCE.serializer(), new PayloadSurrogate(doubleValue, doubleArray, longValue, longArray, stringValue, stringArray, jsonObjectB, json != null ? z6b.b(json) : null));
    }
}
