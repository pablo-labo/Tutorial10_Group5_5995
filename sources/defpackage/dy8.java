package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class dy8<E> extends p92<E, Set<? extends E>, LinkedHashSet<E>> {
    public final cy8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy8(KSerializer<E> kSerializer) {
        super(kSerializer);
        kSerializer.getClass();
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        descriptor.getClass();
        this.b = new cy8(descriptor);
    }

    @Override // defpackage.m1
    public final Object a() {
        return new LinkedHashSet();
    }

    @Override // defpackage.m1
    public final int b(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        linkedHashSet.getClass();
        return linkedHashSet.size();
    }

    @Override // defpackage.m1
    public final Object g(Object obj) {
        throw null;
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // defpackage.m1
    public final Object h(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        linkedHashSet.getClass();
        return linkedHashSet;
    }

    @Override // defpackage.n92
    public final void i(int i, Object obj, Object obj2) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        linkedHashSet.getClass();
        linkedHashSet.add(obj2);
    }
}
