package defpackage;

import defpackage.ymb;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class ua8 implements KSerializer<ta8> {
    public static final ua8 a = new ua8();
    public static final anb b = i7e.a("kotlinx.serialization.json.JsonLiteral", ymb.i.a);

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        JsonElement jsonElementI = ie7.g(decoder).i();
        if (jsonElementI instanceof ta8) {
            return (ta8) jsonElementI;
        }
        StringBuilder sb = new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ");
        throw boa.f(-1, ia.m(fwc.a, jsonElementI.getClass(), sb), jsonElementI.toString());
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor get$$serialDesc() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        ta8 ta8Var = (ta8) obj;
        ta8Var.getClass();
        String str = ta8Var.c;
        ie7.f(encoder);
        if (ta8Var.a) {
            encoder.E(str);
            return;
        }
        SerialDescriptor serialDescriptor = ta8Var.b;
        if (serialDescriptor != null) {
            encoder.i(serialDescriptor).E(str);
            return;
        }
        Long lC = vve.C(str);
        if (lC != null) {
            encoder.j(lC.longValue());
            return;
        }
        l4g l4gVarK = jh2.K(str);
        if (l4gVarK != null) {
            encoder.i(p4g.b).j(l4gVarK.a);
            return;
        }
        Double dA = vve.A(str);
        if (dA != null) {
            encoder.d(dA.doubleValue());
            return;
        }
        Boolean bool = str.equals("true") ? Boolean.TRUE : str.equals("false") ? Boolean.FALSE : null;
        if (bool != null) {
            encoder.p(bool.booleanValue());
        } else {
            encoder.E(str);
        }
    }
}
