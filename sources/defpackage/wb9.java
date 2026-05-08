package defpackage;

import defpackage.gwe;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wb9 implements SerialDescriptor {
    public final String a;
    public final SerialDescriptor b;
    public final SerialDescriptor c;

    public wb9(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.a = str;
        this.b = serialDescriptor;
        this.c = serialDescriptor2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        str.getClass();
        Integer numB = vve.B(10, str);
        if (numB != null) {
            return numB.intValue();
        }
        l5.q(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb9)) {
            return false;
        }
        wb9 wb9Var = (wb9) obj;
        return this.a.equals(wb9Var.a) && this.b.equals(wb9Var.b) && this.c.equals(wb9Var.c);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final m7e f() {
        return gwe.c.a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List<Annotation> g(int i) {
        if (i >= 0) {
            return zr4.a;
        }
        h5.k(l6.i(o6.g(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i) {
        if (i < 0) {
            h5.k(l6.i(o6.g(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.b;
        }
        if (i2 == 1) {
            return this.c;
        }
        r6.g("Unreached");
        return null;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String i() {
        return this.a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        h5.k(l6.i(o6.g(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
        return false;
    }

    public final String toString() {
        return this.a + '(' + this.b + ", " + this.c + ')';
    }
}
