package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class lg6<K, V> extends xb9<K, V, Map<K, ? extends V>, HashMap<K, V>> {
    public final kg6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg6(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2);
        kSerializer.getClass();
        kSerializer2.getClass();
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        SerialDescriptor descriptor2 = kSerializer2.getDescriptor();
        descriptor.getClass();
        descriptor2.getClass();
        this.c = new kg6("kotlin.collections.HashMap", descriptor, descriptor2);
    }

    @Override // defpackage.m1
    public final Object a() {
        return new HashMap();
    }

    @Override // defpackage.m1
    public final int b(Object obj) {
        HashMap map = (HashMap) obj;
        map.getClass();
        return map.size() * 2;
    }

    @Override // defpackage.m1
    public final Iterator c(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.entrySet().iterator();
    }

    @Override // defpackage.m1
    public final int d(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.size();
    }

    @Override // defpackage.m1
    public final Object g(Object obj) {
        throw null;
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return this.c;
    }

    @Override // defpackage.m1
    public final Object h(Object obj) {
        HashMap map = (HashMap) obj;
        map.getClass();
        return map;
    }
}
