package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t3<T> implements KSerializer<T> {
    public i04<T> a(ul2 ul2Var, String str) {
        return ul2Var.a().a0(c(), str);
    }

    public r7e<T> b(Encoder encoder, T t) {
        t.getClass();
        return encoder.a().b0(c(), t);
    }

    public abstract yd8<T> c();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.i04
    public final T deserialize(Decoder decoder) {
        SerialDescriptor descriptor = get$$serialDesc();
        ul2 ul2VarB = decoder.b(descriptor);
        luc lucVar = new luc();
        T t = null;
        while (true) {
            int iP = ul2VarB.p(get$$serialDesc());
            if (iP == -1) {
                if (t != null) {
                    ul2VarB.c(descriptor);
                    return t;
                }
                v40.n((String) lucVar.element, "Polymorphic value has not been read for class ");
                return null;
            }
            if (iP != 0) {
                T t2 = lucVar.element;
                if (iP != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) t2;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb.append(str);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(iP);
                    throw new SerializationException(sb.toString());
                }
                if (t2 == 0) {
                    l5.q("Cannot read polymorphic value before its type token");
                    return null;
                }
                lucVar.element = t2;
                t = (T) ul2VarB.z(get$$serialDesc(), iP, ie7.k(this, ul2VarB, (String) t2), null);
            } else {
                lucVar.element = (T) ul2VarB.o(get$$serialDesc(), iP);
            }
        }
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, T t) {
        t.getClass();
        r7e<? super T> r7eVarL = ie7.l(this, encoder, t);
        SerialDescriptor descriptor = get$$serialDesc();
        vl2 vl2VarB = encoder.b(descriptor);
        vl2VarB.x(get$$serialDesc(), 0, r7eVarL.get$$serialDesc().getA());
        vl2VarB.y(get$$serialDesc(), 1, r7eVarL, t);
        vl2VarB.c(descriptor);
    }
}
