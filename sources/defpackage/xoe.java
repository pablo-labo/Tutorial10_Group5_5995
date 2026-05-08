package defpackage;

import java.lang.reflect.Field;
import java.util.function.Function;
import org.apache.avro.AvroRuntimeException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xoe implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Class cls = (Class) obj;
        try {
            Field declaredField = cls.getDeclaredField("MODEL$");
            declaredField.setAccessible(true);
            return (zoe) declaredField.get(null);
        } catch (IllegalAccessException e) {
            throw new AvroRuntimeException(l5.l("while trying to access field MODEL$ on ", cls.getCanonicalName()), e);
        } catch (NoSuchFieldException unused) {
            return zoe.o;
        }
    }
}
