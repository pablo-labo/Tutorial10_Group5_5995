package defpackage;

import defpackage.vmb;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xmb<Element, Array, Builder extends vmb<Array>> extends n92<Element, Array, Builder> {
    public final wmb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmb(KSerializer<Element> kSerializer) {
        super(kSerializer);
        kSerializer.getClass();
        this.b = new wmb(kSerializer.getDescriptor());
    }

    @Override // defpackage.m1
    public final Object a() {
        return g(j());
    }

    @Override // defpackage.m1
    public final int b(Object obj) {
        vmb vmbVar = (vmb) obj;
        vmbVar.getClass();
        return vmbVar.d();
    }

    @Override // defpackage.m1
    public final Iterator<Element> c(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.m1, defpackage.i04
    public final Array deserialize(Decoder decoder) {
        return (Array) e(decoder);
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // defpackage.m1
    public final Object h(Object obj) {
        vmb vmbVar = (vmb) obj;
        vmbVar.getClass();
        return vmbVar.a();
    }

    @Override // defpackage.n92
    public final void i(int i, Object obj, Object obj2) {
        ((vmb) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Array j();

    public abstract void k(vl2 vl2Var, Array array, int i);

    @Override // defpackage.n92, defpackage.r7e
    public final void serialize(Encoder encoder, Array array) {
        int iD = d(array);
        wmb wmbVar = this.b;
        vl2 vl2VarB = encoder.B(wmbVar);
        k(vl2VarB, array, iD);
        vl2VarB.c(wmbVar);
    }
}
