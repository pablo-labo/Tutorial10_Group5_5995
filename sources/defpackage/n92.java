package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n92<Element, Collection, Builder> extends m1<Element, Collection, Builder> {
    public final KSerializer<Element> a;

    public n92(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    @Override // defpackage.m1
    public void f(ul2 ul2Var, int i, Object obj) {
        i(i, obj, ul2Var.z(getDescriptor(), i, this.a, null));
    }

    public abstract void i(int i, Object obj, Object obj2);

    @Override // defpackage.r7e
    public void serialize(Encoder encoder, Collection collection) {
        int iD = d(collection);
        SerialDescriptor descriptor = getDescriptor();
        vl2 vl2VarB = encoder.B(descriptor);
        Iterator<Element> itC = c(collection);
        for (int i = 0; i < iD; i++) {
            vl2VarB.y(getDescriptor(), i, this.a, itC.next());
        }
        vl2VarB.c(descriptor);
    }
}
