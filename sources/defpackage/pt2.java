package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class pt2 implements SerialDescriptor {
    public final f7e a;
    public final yd8<?> b;
    public final String c;

    public pt2(f7e f7eVar, yd8 yd8Var) {
        yd8Var.getClass();
        this.a = f7eVar;
        this.b = yd8Var;
        this.c = f7eVar.a + '<' + yd8Var.r() + '>';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        str.getClass();
        return this.a.c(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: d */
    public final int getC() {
        return this.a.c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i) {
        return this.a.f[i];
    }

    public final boolean equals(Object obj) {
        pt2 pt2Var = obj instanceof pt2 ? (pt2) obj : null;
        return pt2Var != null && this.a.equals(pt2Var.a) && wl7.b(pt2Var.b, this.b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final m7e f() {
        return this.a.b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List<Annotation> g(int i) {
        return this.a.h[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List<Annotation> getAnnotations() {
        return this.a.d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i) {
        return this.a.g[i];
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final String getA() {
        return this.c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i) {
        return this.a.i[i];
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }
}
