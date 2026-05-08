package com.indeed.android.messaging.data.events;

import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.b0;
import defpackage.i04;
import defpackage.mve;
import defpackage.qp1;
import defpackage.sw5;
import defpackage.sy3;
import defpackage.ul2;
import defpackage.vl2;
import defpackage.ypd;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/indeed/android/messaging/data/events/EventRecord.Attachment.$serializer", "Lsw5;", "Lcom/indeed/android/messaging/data/events/EventRecord$Attachment;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lj6g;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/indeed/android/messaging/data/events/EventRecord$Attachment;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/indeed/android/messaging/data/events/EventRecord$Attachment;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@sy3
public final /* synthetic */ class EventRecord$Attachment$$serializer implements sw5<EventRecord.Attachment> {
    public static final int $stable;
    public static final EventRecord$Attachment$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        EventRecord$Attachment$$serializer eventRecord$Attachment$$serializer = new EventRecord$Attachment$$serializer();
        INSTANCE = eventRecord$Attachment$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.messaging.data.events.EventRecord.Attachment", eventRecord$Attachment$$serializer, 5);
        pluginGeneratedSerialDescriptor.k("contentHash", false);
        pluginGeneratedSerialDescriptor.k("fileName", false);
        pluginGeneratedSerialDescriptor.k("fileExtension", false);
        pluginGeneratedSerialDescriptor.k("status", true);
        pluginGeneratedSerialDescriptor.k("fileUri", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private EventRecord$Attachment$$serializer() {
    }

    @Override // defpackage.sw5
    public final KSerializer<?>[] childSerializers() {
        Lazy[] lazyArr = EventRecord.Attachment.$childSerializers;
        mve mveVar = mve.a;
        return new KSerializer[]{mveVar, mveVar, mveVar, qp1.b((KSerializer) lazyArr[3].getValue()), qp1.b(mveVar)};
    }

    @Override // defpackage.i04
    public final EventRecord.Attachment deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ul2 ul2VarB = decoder.b(serialDescriptor);
        Lazy[] lazyArr = EventRecord.Attachment.$childSerializers;
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        EventRecord.AttachmentSentStatus attachmentSentStatus = null;
        String str = null;
        while (z) {
            int iP = ul2VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strO = ul2VarB.o(serialDescriptor, 0);
                i |= 1;
            } else if (iP == 1) {
                strO2 = ul2VarB.o(serialDescriptor, 1);
                i |= 2;
            } else if (iP == 2) {
                strO3 = ul2VarB.o(serialDescriptor, 2);
                i |= 4;
            } else if (iP == 3) {
                attachmentSentStatus = (EventRecord.AttachmentSentStatus) ul2VarB.h(serialDescriptor, 3, (i04) lazyArr[3].getValue(), attachmentSentStatus);
                i |= 8;
            } else {
                if (iP != 4) {
                    b0.m(iP);
                    return null;
                }
                str = (String) ul2VarB.h(serialDescriptor, 4, mve.a, str);
                i |= 16;
            }
        }
        ul2VarB.c(serialDescriptor);
        return new EventRecord.Attachment(i, strO, strO2, strO3, attachmentSentStatus, str, null);
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor get$$serialDesc() {
        return descriptor;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, EventRecord.Attachment value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vl2 vl2VarB = encoder.b(serialDescriptor);
        EventRecord.Attachment.write$Self$messaging_release(value, vl2VarB, serialDescriptor);
        vl2VarB.c(serialDescriptor);
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] typeParametersSerializers() {
        return ypd.V;
    }
}
