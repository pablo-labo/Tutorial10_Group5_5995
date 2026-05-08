package defpackage;

import defpackage.z5c;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes2.dex */
public final class gw0 implements z5c {
    public final int a;

    public gw0(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return z5c.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5c)) {
            return false;
        }
        z5c z5cVar = (z5c) obj;
        return this.a == z5cVar.tag() && z5c.a.a.equals(z5cVar.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (z5c.a.a.hashCode() ^ 2041407134);
    }

    @Override // defpackage.z5c
    public final z5c.a intEncoding() {
        return z5c.a.a;
    }

    @Override // defpackage.z5c
    public final int tag() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + z5c.a.a + ')';
    }
}
