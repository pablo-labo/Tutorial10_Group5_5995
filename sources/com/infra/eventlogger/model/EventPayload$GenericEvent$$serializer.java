package com.infra.eventlogger.model;

import com.infra.eventlogger.model.EventPayload;
import defpackage.b0;
import defpackage.sw5;
import defpackage.sy3;
import defpackage.ul2;
import defpackage.vl2;
import defpackage.ypd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/infra/eventlogger/model/EventPayload.GenericEvent.$serializer", "Lsw5;", "Lcom/infra/eventlogger/model/EventPayload$GenericEvent;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/infra/eventlogger/model/EventPayload$GenericEvent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lj6g;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/infra/eventlogger/model/EventPayload$GenericEvent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@sy3
public final class EventPayload$GenericEvent$$serializer implements sw5<EventPayload.GenericEvent> {
    public static final EventPayload$GenericEvent$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        EventPayload$GenericEvent$$serializer eventPayload$GenericEvent$$serializer = new EventPayload$GenericEvent$$serializer();
        INSTANCE = eventPayload$GenericEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.infra.eventlogger.model.EventPayload.GenericEvent", eventPayload$GenericEvent$$serializer, 1);
        pluginGeneratedSerialDescriptor.k("6460aaadf1b93d39", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EventPayload$GenericEvent$$serializer() {
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{EventPayload$GenericEvent$GenericEventData$$serializer.INSTANCE};
    }

    @Override // defpackage.i04
    public EventPayload.GenericEvent deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = get$$serialDesc();
        ul2 ul2VarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        Object objZ = null;
        while (z) {
            int iP = ul2VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    b0.m(iP);
                    return null;
                }
                objZ = ul2VarB.z(serialDescriptor, 0, EventPayload$GenericEvent$GenericEventData$$serializer.INSTANCE, objZ);
                i = 1;
            }
        }
        ul2VarB.c(serialDescriptor);
        return new EventPayload.GenericEvent(i, (EventPayload.GenericEvent.GenericEventData) objZ);
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public SerialDescriptor get$$serialDesc() {
        return descriptor;
    }

    @Override // defpackage.r7e
    public void serialize(Encoder encoder, EventPayload.GenericEvent value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = get$$serialDesc();
        vl2 vl2VarB = encoder.b(serialDescriptor);
        vl2VarB.y(serialDescriptor, 0, EventPayload$GenericEvent$GenericEventData$$serializer.INSTANCE, value.b);
        vl2VarB.c(serialDescriptor);
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] typeParametersSerializers() {
        return ypd.V;
    }
}
