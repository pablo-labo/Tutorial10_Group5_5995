package expo.modules.kotlin.types.folly;

import android.util.ArrayMap;
import defpackage.wve;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter;", "", "<init>", "()V", "a", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FollyDynamicExtensionConverter {
    public static final a a = new a();
    public static final ArrayMap<Integer, Object> b = new ArrayMap<>();
    public static int c;

    public static final class a {
        public final synchronized Object get(String str) {
            str.getClass();
            if (!wve.K(str, "__expo_dynamic_extension__#", false)) {
                throw new InvalidDynamicExtensionFormatException();
            }
            return FollyDynamicExtensionConverter.b.remove(Integer.valueOf(Integer.parseInt(str.substring(27))));
        }

        public final synchronized String put(Object obj) {
            int i;
            obj.getClass();
            i = FollyDynamicExtensionConverter.c;
            FollyDynamicExtensionConverter.c = i + 1;
            FollyDynamicExtensionConverter.b.put(Integer.valueOf(i), obj);
            return "__expo_dynamic_extension__#" + i;
        }
    }

    public static final synchronized Object get(String str) {
        return a.get(str);
    }

    public static final synchronized String put(Object obj) {
        return a.put(obj);
    }
}
