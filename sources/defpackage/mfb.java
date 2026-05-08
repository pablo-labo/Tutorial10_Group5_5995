package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class mfb<T> extends t3<T> {
    public final yd8<T> a;
    public final List<? extends Annotation> b;
    public final Lazy c;

    public mfb(yd8<T> yd8Var) {
        yd8Var.getClass();
        this.a = yd8Var;
        this.b = zr4.a;
        this.c = boa.E(qt8.b, new oa(this, 18));
    }

    @Override // defpackage.t3
    public final yd8<T> c() {
        return this.a;
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor get$$serialDesc() {
        return (SerialDescriptor) this.c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mfb(yd8<T> yd8Var, Annotation[] annotationArr) {
        this(yd8Var);
        yd8Var.getClass();
        List<? extends Annotation> listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.b = listAsList;
    }
}
