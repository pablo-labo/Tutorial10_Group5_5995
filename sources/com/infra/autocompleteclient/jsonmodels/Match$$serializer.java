package com.infra.autocompleteclient.jsonmodels;

import defpackage.b0;
import defpackage.rh7;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000fHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/infra/autocompleteclient/jsonmodels/Match.$serializer", "Lsw5;", "Lcom/infra/autocompleteclient/jsonmodels/Match;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lj6g;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/infra/autocompleteclient/jsonmodels/Match;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/infra/autocompleteclient/jsonmodels/Match;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "autocomplete-client_release"}, k = 1, mv = {1, 4, 2})
@sy3
public final class Match$$serializer implements sw5<Match> {
    private static final /* synthetic */ SerialDescriptor $$serialDesc;
    public static final Match$$serializer INSTANCE;

    static {
        Match$$serializer match$$serializer = new Match$$serializer();
        INSTANCE = match$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.infra.autocompleteclient.jsonmodels.Match", match$$serializer, 2);
        pluginGeneratedSerialDescriptor.k("start", false);
        pluginGeneratedSerialDescriptor.k("end", false);
        $$serialDesc = pluginGeneratedSerialDescriptor;
    }

    private Match$$serializer() {
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] childSerializers() {
        rh7 rh7Var = rh7.a;
        return new KSerializer[]{rh7Var, rh7Var};
    }

    @Override // defpackage.i04
    public Match deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = $$serialDesc;
        ul2 ul2VarB = decoder.b(serialDescriptor);
        int i = 0;
        int iM = 0;
        int iM2 = 0;
        while (true) {
            int iP = ul2VarB.p(serialDescriptor);
            if (iP == -1) {
                ul2VarB.c(serialDescriptor);
                return new Match(i, iM, iM2);
            }
            if (iP == 0) {
                iM = ul2VarB.m(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    b0.m(iP);
                    return null;
                }
                iM2 = ul2VarB.m(serialDescriptor, 1);
                i |= 2;
            }
        }
    }

    @Override // defpackage.r7e, defpackage.i04
    public SerialDescriptor getDescriptor() {
        return $$serialDesc;
    }

    @Override // defpackage.r7e
    public void serialize(Encoder encoder, Match value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = $$serialDesc;
        vl2 vl2VarB = encoder.b(serialDescriptor);
        vl2VarB.r(0, value.a, serialDescriptor);
        vl2VarB.r(1, value.b, serialDescriptor);
        vl2VarB.c(serialDescriptor);
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] typeParametersSerializers() {
        return ypd.V;
    }
}
