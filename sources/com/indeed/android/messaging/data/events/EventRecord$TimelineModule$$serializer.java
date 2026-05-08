package com.indeed.android.messaging.data.events;

import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.b0;
import defpackage.mve;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/indeed/android/messaging/data/events/EventRecord.TimelineModule.$serializer", "Lsw5;", "Lcom/indeed/android/messaging/data/events/EventRecord$TimelineModule;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lj6g;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/indeed/android/messaging/data/events/EventRecord$TimelineModule;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/indeed/android/messaging/data/events/EventRecord$TimelineModule;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@sy3
public final /* synthetic */ class EventRecord$TimelineModule$$serializer implements sw5<EventRecord.TimelineModule> {
    public static final int $stable;
    public static final EventRecord$TimelineModule$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        EventRecord$TimelineModule$$serializer eventRecord$TimelineModule$$serializer = new EventRecord$TimelineModule$$serializer();
        INSTANCE = eventRecord$TimelineModule$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.messaging.data.events.EventRecord.TimelineModule", eventRecord$TimelineModule$$serializer, 2);
        pluginGeneratedSerialDescriptor.k("telContent", false);
        pluginGeneratedSerialDescriptor.k("timelineModuleType", false);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private EventRecord$TimelineModule$$serializer() {
    }

    @Override // defpackage.sw5
    public final KSerializer<?>[] childSerializers() {
        mve mveVar = mve.a;
        return new KSerializer[]{mveVar, mveVar};
    }

    @Override // defpackage.i04
    public final EventRecord.TimelineModule deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ul2 ul2VarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        while (z) {
            int iP = ul2VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strO = ul2VarB.o(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    b0.m(iP);
                    return null;
                }
                strO2 = ul2VarB.o(serialDescriptor, 1);
                i |= 2;
            }
        }
        ul2VarB.c(serialDescriptor);
        return new EventRecord.TimelineModule(i, strO, strO2, null);
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor get$$serialDesc() {
        return descriptor;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, EventRecord.TimelineModule value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vl2 vl2VarB = encoder.b(serialDescriptor);
        EventRecord.TimelineModule.write$Self$messaging_release(value, vl2VarB, serialDescriptor);
        vl2VarB.c(serialDescriptor);
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] typeParametersSerializers() {
        return ypd.V;
    }
}
