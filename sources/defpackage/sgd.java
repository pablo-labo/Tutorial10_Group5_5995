package defpackage;

import androidx.navigation.r;
import java.util.LinkedHashMap;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class sgd<T> extends ka6 {
    public final KSerializer<T> d;
    public final LinkedHashMap e;
    public final n7e f = i8e.a;
    public final LinkedHashMap g = new LinkedHashMap();
    public int h = -1;

    public sgd(KSerializer kSerializer, LinkedHashMap linkedHashMap) {
        this.d = kSerializer;
        this.e = linkedHashMap;
    }

    public final void J1(Object obj) {
        String strE = this.d.get$$serialDesc().e(this.h);
        r rVar = (r) this.e.get(strE);
        if (rVar != null) {
            this.g.put(strE, rVar instanceof o92 ? ((o92) rVar).i(obj) : u63.Z(rVar.f(obj)));
        } else {
            akb.n(l5.m("Cannot find NavType for argument ", strE, ". Please provide NavType through typeMap."));
        }
    }

    @Override // defpackage.ka6
    public final void Y(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        this.h = i;
    }

    @Override // defpackage.ka6
    public final void Z(Object obj) {
        obj.getClass();
        J1(obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final v1 a() {
        return this.f;
    }

    @Override // defpackage.ka6, kotlinx.serialization.encoding.Encoder
    public final Encoder i(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (ygd.d(serialDescriptor)) {
            this.h = 0;
        }
        return this;
    }

    @Override // defpackage.ka6, kotlinx.serialization.encoding.Encoder
    public final void n() {
        J1(null);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final <T> void t(r7e<? super T> r7eVar, T t) {
        r7eVar.getClass();
        J1(t);
    }
}
