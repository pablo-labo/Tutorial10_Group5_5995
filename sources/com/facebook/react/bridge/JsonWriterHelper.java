package com.facebook.react.bridge;

import android.util.JsonWriter;
import defpackage.j6g;
import defpackage.l;
import defpackage.l5;
import defpackage.r6;
import defpackage.t40;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\bJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0013\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/bridge/JsonWriterHelper;", "", "<init>", "()V", "Landroid/util/JsonWriter;", "writer", "value", "Lj6g;", "(Landroid/util/JsonWriter;Ljava/lang/Object;)V", "Lcom/facebook/react/bridge/Dynamic;", "dynamicValue", "(Landroid/util/JsonWriter;Lcom/facebook/react/bridge/Dynamic;)V", "Lcom/facebook/react/bridge/ReadableMap;", "readableMapValue", "(Landroid/util/JsonWriter;Lcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/bridge/ReadableArray;", "readableArrayValue", "(Landroid/util/JsonWriter;Lcom/facebook/react/bridge/ReadableArray;)V", "", "map", "mapValue", "(Landroid/util/JsonWriter;Ljava/util/Map;)V", "", "list", "listValue", "(Landroid/util/JsonWriter;Ljava/util/List;)V", "objectValue", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JsonWriterHelper {
    public static final JsonWriterHelper INSTANCE = new JsonWriterHelper();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private JsonWriterHelper() {
    }

    private final void dynamicValue(JsonWriter writer, Dynamic value) throws IOException {
        switch (WhenMappings.$EnumSwitchMapping$0[value.getType().ordinal()]) {
            case 1:
                writer.nullValue();
                break;
            case 2:
                writer.value(value.asBoolean());
                break;
            case 3:
                writer.value(value.asDouble());
                break;
            case 4:
                writer.value(value.asString());
                break;
            case 5:
                ReadableMap readableMapAsMap = value.asMap();
                if (readableMapAsMap == null) {
                    r6.g("Required value was null.");
                } else {
                    readableMapValue(writer, readableMapAsMap);
                    j6g j6gVar = j6g.a;
                }
                break;
            case 6:
                ReadableArray readableArrayAsArray = value.asArray();
                if (readableArrayAsArray == null) {
                    r6.g("Required value was null.");
                } else {
                    readableArrayValue(writer, readableArrayAsArray);
                    j6g j6gVar2 = j6g.a;
                }
                break;
            default:
                l.g();
                break;
        }
    }

    private final void listValue(JsonWriter writer, List<?> list) throws IOException {
        writer.beginArray();
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            objectValue(writer, it.next());
        }
        writer.endArray();
    }

    private final void mapValue(JsonWriter writer, Map<?, ?> map) throws IOException {
        writer.beginObject();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            writer.name(String.valueOf(key));
            value(writer, value);
        }
        writer.endObject();
    }

    private final void objectValue(JsonWriter writer, Object value) throws IOException {
        if (value == null) {
            writer.nullValue();
            return;
        }
        if (value instanceof String) {
            writer.value((String) value);
            return;
        }
        if (value instanceof Number) {
            writer.value((Number) value);
        } else if (value instanceof Boolean) {
            writer.value(((Boolean) value).booleanValue());
        } else {
            l5.q(t40.i(value, "Unknown value: "));
        }
    }

    public static final void readableArrayValue(JsonWriter writer, ReadableArray value) throws IOException {
        writer.getClass();
        value.getClass();
        writer.beginArray();
        try {
            int size = value.size();
            for (int i = 0; i < size; i++) {
                switch (WhenMappings.$EnumSwitchMapping$0[value.getType(i).ordinal()]) {
                    case 1:
                        writer.nullValue();
                        break;
                    case 2:
                        writer.value(value.getBoolean(i));
                        break;
                    case 3:
                        writer.value(value.getDouble(i));
                        break;
                    case 4:
                        writer.value(value.getString(i));
                        break;
                    case 5:
                        ReadableMap map = value.getMap(i);
                        JsonWriterHelper jsonWriterHelper = INSTANCE;
                        if (map == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        jsonWriterHelper.readableMapValue(writer, map);
                        j6g j6gVar = j6g.a;
                        break;
                        break;
                    case 6:
                        ReadableArray array = value.getArray(i);
                        if (array == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        readableArrayValue(writer, array);
                        j6g j6gVar2 = j6g.a;
                        break;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            writer.endArray();
        } catch (Throwable th) {
            writer.endArray();
            throw th;
        }
    }

    private final void readableMapValue(JsonWriter writer, ReadableMap value) throws IOException {
        writer.beginObject();
        try {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = value.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                writer.name(strNextKey);
                switch (WhenMappings.$EnumSwitchMapping$0[value.getType(strNextKey).ordinal()]) {
                    case 1:
                        writer.nullValue();
                        break;
                    case 2:
                        writer.value(value.getBoolean(strNextKey));
                        break;
                    case 3:
                        writer.value(value.getDouble(strNextKey));
                        break;
                    case 4:
                        writer.value(value.getString(strNextKey));
                        break;
                    case 5:
                        ReadableMap map = value.getMap(strNextKey);
                        if (map == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        readableMapValue(writer, map);
                        j6g j6gVar = j6g.a;
                        break;
                        break;
                    case 6:
                        ReadableArray array = value.getArray(strNextKey);
                        if (array == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        readableArrayValue(writer, array);
                        j6g j6gVar2 = j6g.a;
                        break;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            writer.endObject();
        } catch (Throwable th) {
            writer.endObject();
            throw th;
        }
    }

    public static final void value(JsonWriter writer, Object value) throws IOException {
        writer.getClass();
        if (value instanceof Map) {
            INSTANCE.mapValue(writer, (Map) value);
            return;
        }
        if (value instanceof List) {
            INSTANCE.listValue(writer, (List) value);
            return;
        }
        if (value instanceof ReadableMap) {
            INSTANCE.readableMapValue(writer, (ReadableMap) value);
            return;
        }
        if (value instanceof ReadableArray) {
            readableArrayValue(writer, (ReadableArray) value);
        } else if (value instanceof Dynamic) {
            INSTANCE.dynamicValue(writer, (Dynamic) value);
        } else {
            INSTANCE.objectValue(writer, value);
        }
    }
}
