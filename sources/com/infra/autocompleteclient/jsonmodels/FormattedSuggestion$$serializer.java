package com.infra.autocompleteclient.jsonmodels;

import defpackage.b0;
import defpackage.gt0;
import defpackage.mve;
import defpackage.sw5;
import defpackage.sy3;
import defpackage.ul2;
import defpackage.vl2;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0017\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ&\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0013HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"com/infra/autocompleteclient/jsonmodels/FormattedSuggestion.$serializer", "PayloadType", "Lsw5;", "Lcom/infra/autocompleteclient/jsonmodels/FormattedSuggestion;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "(Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lj6g;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/infra/autocompleteclient/jsonmodels/FormattedSuggestion;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/infra/autocompleteclient/jsonmodels/FormattedSuggestion;", "", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "typeParametersSerializers", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "autocomplete-client_release"}, k = 1, mv = {1, 4, 2})
@sy3
public final class FormattedSuggestion$$serializer<PayloadType> implements sw5<FormattedSuggestion<PayloadType>> {
    private final /* synthetic */ SerialDescriptor $$serialDesc;
    private /* synthetic */ KSerializer typeSerial0;

    @sy3
    public /* synthetic */ FormattedSuggestion$$serializer(KSerializer<PayloadType> kSerializer) {
        kSerializer.getClass();
        this.typeSerial0 = kSerializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.infra.autocompleteclient.jsonmodels.FormattedSuggestion", this, 3);
        pluginGeneratedSerialDescriptor.k("matches", false);
        pluginGeneratedSerialDescriptor.k("suggestion", false);
        pluginGeneratedSerialDescriptor.k("payload", false);
        this.$$serialDesc = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{new gt0(Match$$serializer.INSTANCE, 0), mve.a, this.typeSerial0};
    }

    @Override // defpackage.i04
    public FormattedSuggestion<PayloadType> deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = this.$$serialDesc;
        ul2 ul2VarB = decoder.b(serialDescriptor);
        int i = 0;
        List list = null;
        String strO = null;
        Object objZ = null;
        while (true) {
            int iP = ul2VarB.p(serialDescriptor);
            if (iP == -1) {
                ul2VarB.c(serialDescriptor);
                return new FormattedSuggestion<>(i, list, strO, objZ);
            }
            if (iP == 0) {
                list = (List) ul2VarB.z(serialDescriptor, 0, new gt0(Match$$serializer.INSTANCE, 0), list);
                i |= 1;
            } else if (iP == 1) {
                strO = ul2VarB.o(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    b0.m(iP);
                    return null;
                }
                objZ = ul2VarB.z(serialDescriptor, 2, this.typeSerial0, objZ);
                i |= 4;
            }
        }
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor, reason: from getter */
    public SerialDescriptor get$$serialDesc() {
        return this.$$serialDesc;
    }

    @Override // defpackage.r7e
    public void serialize(Encoder encoder, FormattedSuggestion<PayloadType> value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = this.$$serialDesc;
        vl2 vl2VarB = encoder.b(serialDescriptor);
        KSerializer kSerializer = this.typeSerial0;
        kSerializer.getClass();
        vl2VarB.y(serialDescriptor, 0, new gt0(Match$$serializer.INSTANCE, 0), value.a);
        vl2VarB.x(serialDescriptor, 1, value.b);
        vl2VarB.y(serialDescriptor, 2, kSerializer, value.c);
        vl2VarB.c(serialDescriptor);
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] typeParametersSerializers() {
        return new KSerializer[]{this.typeSerial0};
    }

    private FormattedSuggestion$$serializer() {
    }
}
