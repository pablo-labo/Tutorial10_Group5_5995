package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xb9<Key, Value, Collection, Builder extends Map<Key, Value>> extends m1<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {
    public final KSerializer<Key> a;
    public final KSerializer<Value> b;

    public xb9(KSerializer kSerializer, KSerializer kSerializer2) {
        this.a = kSerializer;
        this.b = kSerializer2;
    }

    @Override // defpackage.m1
    public final void f(ul2 ul2Var, int i, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        Object objZ = ul2Var.z(getDescriptor(), i, this.a, null);
        int iP = ul2Var.p(getDescriptor());
        if (iP != i + 1) {
            h5.k(k20.l("Value must follow key in a map, index for key: ", i, iP, ", returned index for value: "));
            return;
        }
        boolean zContainsKey = map.containsKey(objZ);
        KSerializer<Value> kSerializer = this.b;
        map.put(objZ, (!zContainsKey || (kSerializer.getDescriptor().f() instanceof ymb)) ? ul2Var.z(getDescriptor(), iP, kSerializer, null) : ul2Var.z(getDescriptor(), iP, kSerializer, lc9.Y(objZ, map)));
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Collection collection) {
        d(collection);
        SerialDescriptor descriptor = getDescriptor();
        vl2 vl2VarB = encoder.B(descriptor);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itC = c(collection);
        int i = 0;
        while (itC.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itC.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i2 = i + 1;
            vl2VarB.y(getDescriptor(), i, this.a, key);
            i += 2;
            vl2VarB.y(getDescriptor(), i2, this.b, value);
        }
        vl2VarB.c(descriptor);
    }
}
