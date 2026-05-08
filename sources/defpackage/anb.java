package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class anb implements SerialDescriptor {
    public final String a;
    public final ymb b;

    public anb(String str, ymb ymbVar) {
        ymbVar.getClass();
        this.a = str;
        this.b = ymbVar;
    }

    public final void a() {
        throw new IllegalStateException(l6.i(new StringBuilder("Primitive descriptor "), this.a, " does not have elements"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        str.getClass();
        a();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: d */
    public final int getC() {
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i) {
        a();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anb)) {
            return false;
        }
        anb anbVar = (anb) obj;
        return this.a.equals(anbVar.a) && wl7.b(this.b, anbVar.b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final m7e f() {
        return this.b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List<Annotation> g(int i) {
        a();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i) {
        a();
        throw null;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final String getA() {
        return this.a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i) {
        a();
        throw null;
    }

    public final String toString() {
        return w40.f(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
