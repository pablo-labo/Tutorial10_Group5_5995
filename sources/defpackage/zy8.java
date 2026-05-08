package defpackage;

import defpackage.gwe;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zy8 implements SerialDescriptor {
    public final SerialDescriptor a;

    public zy8(SerialDescriptor serialDescriptor) {
        this.a = serialDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        str.getClass();
        Integer numB = vve.B(10, str);
        if (numB != null) {
            return numB.intValue();
        }
        l5.q(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy8)) {
            return false;
        }
        zy8 zy8Var = (zy8) obj;
        return wl7.b(this.a, zy8Var.a) && wl7.b(i(), zy8Var.i());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final m7e f() {
        return gwe.b.a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List<Annotation> g(int i) {
        if (i >= 0) {
            return zr4.a;
        }
        w20.q(o6.g(i, "Illegal index ", ", "), i(), " expects only non-negative indices");
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i) {
        if (i >= 0) {
            return this.a;
        }
        w20.q(o6.g(i, "Illegal index ", ", "), i(), " expects only non-negative indices");
        return null;
    }

    public final int hashCode() {
        return i().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        w20.q(o6.g(i, "Illegal index ", ", "), i(), " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return i() + '(' + this.a + ')';
    }
}
