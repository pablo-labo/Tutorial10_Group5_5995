package defpackage;

import com.facebook.react.bridge.ReadableMap;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class ooc {
    public static final d2f a = new d2f(new pl0(12));

    public static final ReadableMap a(noc nocVar) {
        try {
            Object obj = getBackingMapField().get(nocVar);
            obj.getClass();
            return (ReadableMap) obj;
        } catch (ReflectiveOperationException e) {
            l6.p("Unable to access internal_backingMap via reflection", e);
            return null;
        }
    }

    private static final Field getBackingMapField() {
        Object value = a.getValue();
        value.getClass();
        return (Field) value;
    }
}
