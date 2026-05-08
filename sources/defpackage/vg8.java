package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vg8<K, V, R> implements KSerializer<R> {
    public final KSerializer<K> a;
    public final KSerializer<V> b;

    public vg8(KSerializer kSerializer, KSerializer kSerializer2) {
        this.a = kSerializer;
        this.b = kSerializer2;
    }

    public abstract K a(R r);

    public abstract V b(R r);

    public abstract R c(K k, V v);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.i04
    public final R deserialize(Decoder decoder) {
        Object obj = ewa.Z;
        SerialDescriptor serialDescriptor = get$$serialDesc();
        ul2 ul2VarB = decoder.b(serialDescriptor);
        Object objZ = obj;
        Object objZ2 = objZ;
        while (true) {
            int iP = ul2VarB.p(get$$serialDesc());
            if (iP == -1) {
                if (objZ == obj) {
                    throw new SerializationException("Element 'key' is missing");
                }
                if (objZ2 == obj) {
                    throw new SerializationException("Element 'value' is missing");
                }
                R r = (R) c(objZ, objZ2);
                ul2VarB.c(serialDescriptor);
                return r;
            }
            if (iP == 0) {
                objZ = ul2VarB.z(get$$serialDesc(), 0, this.a, null);
            } else {
                if (iP != 1) {
                    throw new SerializationException(p6.c(iP, "Invalid index: "));
                }
                objZ2 = ul2VarB.z(get$$serialDesc(), 1, this.b, null);
            }
        }
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, R r) {
        vl2 vl2VarB = encoder.b(get$$serialDesc());
        vl2VarB.y(get$$serialDesc(), 0, this.a, a(r));
        vl2VarB.y(get$$serialDesc(), 1, this.b, b(r));
        vl2VarB.c(get$$serialDesc());
    }
}
