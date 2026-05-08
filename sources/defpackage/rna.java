package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class rna<T> implements KSerializer<T> {
    public final T a;
    public final List<? extends Annotation> b;
    public final Lazy c;

    /* JADX WARN: Multi-variable type inference failed */
    public rna(Object obj, String str) {
        obj.getClass();
        this.a = obj;
        this.b = zr4.a;
        this.c = boa.E(qt8.b, new yp0(7, str, this));
    }

    @Override // defpackage.i04
    public final T deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        ul2 ul2VarB = decoder.b(descriptor);
        int iP = ul2VarB.p(getDescriptor());
        if (iP != -1) {
            throw new SerializationException(p6.c(iP, "Unexpected index "));
        }
        j6g j6gVar = j6g.a;
        ul2VarB.c(descriptor);
        return this.a;
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.c.getValue();
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, T t) {
        t.getClass();
        encoder.b(getDescriptor()).c(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rna(String str, T t, Annotation[] annotationArr) {
        this(t, str);
        t.getClass();
        List<? extends Annotation> listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.b = listAsList;
    }
}
