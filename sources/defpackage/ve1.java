package defpackage;

import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ve1 implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return BeanSerializerFactory.lambda$removeSetterlessGetters$0((BeanPropertyDefinition) obj);
    }
}
