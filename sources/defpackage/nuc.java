package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class nuc<ElementKlass, Element extends ElementKlass> extends n92<Element, Element[], ArrayList<Element>> {
    public final yd8<ElementKlass> b;
    public final ys0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nuc(yd8<ElementKlass> yd8Var, KSerializer<Element> kSerializer) {
        super(kSerializer);
        kSerializer.getClass();
        this.b = yd8Var;
        SerialDescriptor descriptor = kSerializer.get$$serialDesc();
        descriptor.getClass();
        this.c = new ys0(descriptor);
    }

    @Override // defpackage.m1
    public final Object a() {
        return new ArrayList();
    }

    @Override // defpackage.m1
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // defpackage.m1
    public final Iterator c(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new ct0(objArr);
    }

    @Override // defpackage.m1
    public final int d(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // defpackage.m1
    public final Object g(Object obj) {
        throw null;
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor get$$serialDesc() {
        return this.c;
    }

    @Override // defpackage.m1
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        Object objNewInstance = Array.newInstance((Class<?>) jh2.p(this.b), arrayList.size());
        objNewInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        array.getClass();
        return array;
    }

    @Override // defpackage.n92
    public final void i(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
