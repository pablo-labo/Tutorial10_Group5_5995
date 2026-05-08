package defpackage;

import defpackage.gwe;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class nuf<A, B, C> implements KSerializer<muf<? extends A, ? extends B, ? extends C>> {
    public final KSerializer<A> a;
    public final KSerializer<B> b;
    public final KSerializer<C> c;
    public final f7e d;

    public nuf(KSerializer<A> kSerializer, KSerializer<B> kSerializer2, KSerializer<C> kSerializer3) {
        f7e f7eVar;
        kSerializer.getClass();
        kSerializer2.getClass();
        kSerializer3.getClass();
        this.a = kSerializer;
        this.b = kSerializer2;
        this.c = kSerializer3;
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        hg hgVar = new hg(this, 11);
        if (zve.U("kotlin.Triple")) {
            l5.q("Blank serial names are prohibited");
            f7eVar = null;
        } else {
            j62 j62Var = new j62("kotlin.Triple");
            hgVar.invoke(j62Var);
            f7eVar = new f7e("kotlin.Triple", gwe.a.a, j62Var.c.size(), ut0.E0(serialDescriptorArr), j62Var);
        }
        this.d = f7eVar;
    }

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        f7e f7eVar = this.d;
        ul2 ul2VarB = decoder.b(f7eVar);
        Object obj = ewa.Z;
        Object objZ = obj;
        Object objZ2 = objZ;
        Object objZ3 = objZ2;
        while (true) {
            int iP = ul2VarB.p(f7eVar);
            if (iP == -1) {
                ul2VarB.c(f7eVar);
                if (objZ == obj) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objZ2 == obj) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objZ3 != obj) {
                    return new muf(objZ, objZ2, objZ3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iP == 0) {
                objZ = ul2VarB.z(f7eVar, 0, this.a, null);
            } else if (iP == 1) {
                objZ2 = ul2VarB.z(f7eVar, 1, this.b, null);
            } else {
                if (iP != 2) {
                    throw new SerializationException(p6.c(iP, "Unexpected index "));
                }
                objZ3 = ul2VarB.z(f7eVar, 2, this.c, null);
            }
        }
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor get$$serialDesc() {
        return this.d;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        muf mufVar = (muf) obj;
        mufVar.getClass();
        f7e f7eVar = this.d;
        vl2 vl2VarB = encoder.b(f7eVar);
        vl2VarB.y(f7eVar, 0, this.a, mufVar.d());
        vl2VarB.y(f7eVar, 1, this.b, mufVar.e());
        vl2VarB.y(f7eVar, 2, this.c, mufVar.f());
        vl2VarB.c(f7eVar);
    }
}
