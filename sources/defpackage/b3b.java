package defpackage;

import defpackage.gwe;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class b3b<K, V> extends vg8<K, V, Pair<? extends K, ? extends V>> {
    public final f7e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3b(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2);
        kSerializer.getClass();
        kSerializer2.getClass();
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        if (zve.U("kotlin.Pair")) {
            l5.q("Blank serial names are prohibited");
            throw null;
        }
        j62 j62Var = new j62("kotlin.Pair");
        j62.a(j62Var, "first", kSerializer.get$$serialDesc());
        j62.a(j62Var, "second", kSerializer2.get$$serialDesc());
        j6g j6gVar = j6g.a;
        this.c = new f7e("kotlin.Pair", gwe.a.a, j62Var.c.size(), ut0.E0(serialDescriptorArr), j62Var);
    }

    @Override // defpackage.vg8
    public final Object a(Object obj) {
        Pair pair = (Pair) obj;
        pair.getClass();
        return pair.d();
    }

    @Override // defpackage.vg8
    public final Object b(Object obj) {
        Pair pair = (Pair) obj;
        pair.getClass();
        return pair.e();
    }

    @Override // defpackage.vg8
    public final Object c(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor get$$serialDesc() {
        return this.c;
    }
}
