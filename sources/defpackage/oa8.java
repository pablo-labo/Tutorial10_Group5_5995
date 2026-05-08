package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class oa8 implements SerialDescriptor {
    public final d2f a;

    public oa8(gu5<? extends SerialDescriptor> gu5Var) {
        this.a = new d2f(gu5Var);
    }

    public final SerialDescriptor a() {
        return (SerialDescriptor) this.a.getValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        str.getClass();
        return a().c(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return a().d();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i) {
        return a().e(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final m7e f() {
        return a().f();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List<Annotation> g(int i) {
        return a().g(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i) {
        return a().h(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String i() {
        return a().i();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i) {
        return a().j(i);
    }
}
