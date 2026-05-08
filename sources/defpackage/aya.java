package defpackage;

import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aya implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((AnnotatedMethod) obj).getFullName();
    }
}
