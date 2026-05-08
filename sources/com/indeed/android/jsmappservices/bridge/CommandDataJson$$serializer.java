package com.indeed.android.jsmappservices.bridge;

import defpackage.b0;
import defpackage.sw5;
import defpackage.sy3;
import defpackage.ul2;
import defpackage.vl2;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0013¢\u0006\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"com/indeed/android/jsmappservices/bridge/CommandDataJson.$serializer", "D", "Lsw5;", "Lcom/indeed/android/jsmappservices/bridge/CommandDataJson;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "(Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lj6g;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/indeed/android/jsmappservices/bridge/CommandDataJson;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/indeed/android/jsmappservices/bridge/CommandDataJson;", "", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "typeParametersSerializers", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@sy3
public final /* synthetic */ class CommandDataJson$$serializer<D> implements sw5<CommandDataJson<D>> {
    public static final int $stable = 8;
    private final SerialDescriptor descriptor;
    private final /* synthetic */ KSerializer<?> typeSerial0;

    private CommandDataJson$$serializer() {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.jsmappservices.bridge.CommandDataJson", this, 1);
        pluginGeneratedSerialDescriptor.k("data", false);
        this.descriptor = pluginGeneratedSerialDescriptor;
    }

    private final /* synthetic */ KSerializer getTypeSerial0() {
        return this.typeSerial0;
    }

    @Override // defpackage.sw5
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{this.typeSerial0};
    }

    @Override // defpackage.i04
    public final CommandDataJson<D> deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = this.descriptor;
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
                objZ = ul2VarB.z(serialDescriptor, 0, this.typeSerial0, objZ);
                i = 1;
            }
        }
        ul2VarB.c(serialDescriptor);
        return new CommandDataJson<>(i, objZ);
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, CommandDataJson<D> value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = this.descriptor;
        vl2 vl2VarB = encoder.b(serialDescriptor);
        vl2VarB.y(serialDescriptor, 0, this.typeSerial0, value.a);
        vl2VarB.c(serialDescriptor);
    }

    @Override // defpackage.sw5
    public final KSerializer<?>[] typeParametersSerializers() {
        return new KSerializer[]{this.typeSerial0};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CommandDataJson$$serializer(KSerializer<D> kSerializer) {
        this();
        kSerializer.getClass();
        this.typeSerial0 = kSerializer;
    }
}
