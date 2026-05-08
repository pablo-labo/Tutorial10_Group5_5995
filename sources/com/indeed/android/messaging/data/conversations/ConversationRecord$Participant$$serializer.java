package com.indeed.android.messaging.data.conversations;

import com.indeed.android.messaging.data.conversations.ConversationRecord;
import defpackage.b0;
import defpackage.gy2;
import defpackage.i04;
import defpackage.mve;
import defpackage.ni1;
import defpackage.p7e;
import defpackage.qp1;
import defpackage.rh7;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/indeed/android/messaging/data/conversations/ConversationRecord.Participant.$serializer", "Lsw5;", "Lcom/indeed/android/messaging/data/conversations/ConversationRecord$Participant;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lj6g;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/indeed/android/messaging/data/conversations/ConversationRecord$Participant;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/indeed/android/messaging/data/conversations/ConversationRecord$Participant;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@sy3
public final /* synthetic */ class ConversationRecord$Participant$$serializer implements sw5<ConversationRecord.Participant> {
    public static final int $stable;
    public static final ConversationRecord$Participant$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ConversationRecord$Participant$$serializer conversationRecord$Participant$$serializer = new ConversationRecord$Participant$$serializer();
        INSTANCE = conversationRecord$Participant$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.messaging.data.conversations.ConversationRecord.Participant", conversationRecord$Participant$$serializer, 7);
        pluginGeneratedSerialDescriptor.k("role", false);
        pluginGeneratedSerialDescriptor.k("accountKey", false);
        pluginGeneratedSerialDescriptor.k("participantName", false);
        pluginGeneratedSerialDescriptor.k("removed", true);
        pluginGeneratedSerialDescriptor.k("anonymousEmployerId", true);
        pluginGeneratedSerialDescriptor.k("anonymousGuestEmailId", true);
        pluginGeneratedSerialDescriptor.k("advertiserKey", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private ConversationRecord$Participant$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sw5
    public final KSerializer<?>[] childSerializers() {
        mve mveVar = mve.a;
        rh7 rh7Var = rh7.a;
        return new KSerializer[]{ConversationRecord.Participant.$childSerializers[0].getValue(), qp1.b(mveVar), qp1.b(mveVar), ni1.a, qp1.b(rh7Var), qp1.b(rh7Var), qp1.b(mveVar)};
    }

    @Override // defpackage.i04
    public final ConversationRecord.Participant deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ul2 ul2VarB = decoder.b(serialDescriptor);
        Lazy[] lazyArr = ConversationRecord.Participant.$childSerializers;
        ConversationRecord.Participant participant = null;
        boolean z = true;
        int i = 0;
        boolean zE = false;
        gy2 gy2Var = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        String str3 = null;
        while (z) {
            int iP = ul2VarB.p(serialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    gy2Var = (gy2) ul2VarB.z(serialDescriptor, 0, (i04) lazyArr[0].getValue(), gy2Var);
                    i |= 1;
                    break;
                case 1:
                    str = (String) ul2VarB.h(serialDescriptor, 1, mve.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) ul2VarB.h(serialDescriptor, 2, mve.a, str2);
                    i |= 4;
                    break;
                case 3:
                    zE = ul2VarB.E(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) ul2VarB.h(serialDescriptor, 4, rh7.a, num);
                    i |= 16;
                    break;
                case 5:
                    num2 = (Integer) ul2VarB.h(serialDescriptor, 5, rh7.a, num2);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) ul2VarB.h(serialDescriptor, 6, mve.a, str3);
                    i |= 64;
                    break;
                default:
                    b0.m(iP);
                    return participant;
            }
            participant = null;
        }
        ul2VarB.c(serialDescriptor);
        return new ConversationRecord.Participant(i, gy2Var, str, str2, zE, num, num2, str3, (p7e) null);
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor get$$serialDesc() {
        return descriptor;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, ConversationRecord.Participant value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vl2 vl2VarB = encoder.b(serialDescriptor);
        ConversationRecord.Participant.write$Self$messaging_release(value, vl2VarB, serialDescriptor);
        vl2VarB.c(serialDescriptor);
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] typeParametersSerializers() {
        return ypd.V;
    }
}
