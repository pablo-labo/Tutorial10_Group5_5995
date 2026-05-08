package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class qjc {
    public static final WritableMap a(Map<?, ?> map) {
        String string;
        map.getClass();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && (string = key.toString()) != null) {
                if (value instanceof Map) {
                    writableMapCreateMap.putMap(string, a((Map) value));
                } else if (value instanceof Object[]) {
                    writableMapCreateMap.putArray(string, t98.b((Object[]) value));
                } else if (value instanceof List) {
                    writableMapCreateMap.putArray(string, t98.b(((Collection) value).toArray(new Object[0])));
                } else if (value instanceof Boolean) {
                    writableMapCreateMap.putBoolean(string, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    writableMapCreateMap.putInt(string, ((Number) value).intValue());
                } else if (value instanceof Double) {
                    writableMapCreateMap.putDouble(string, ((Number) value).doubleValue());
                } else if (value instanceof String) {
                    writableMapCreateMap.putString(string, (String) value);
                } else if (value == null) {
                    writableMapCreateMap.putNull(string);
                } else {
                    writableMapCreateMap.putString(string, value.toString());
                }
            }
        }
        return writableMapCreateMap;
    }
}
