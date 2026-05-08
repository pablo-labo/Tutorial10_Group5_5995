package defpackage;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;

/* JADX INFO: loaded from: classes2.dex */
public final class fna extends hd0 {
    public final d9a e;
    public final JavaOnlyMap f;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

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
            a = iArr;
        }
    }

    public fna(ReadableMap readableMap, d9a d9aVar) {
        this.e = d9aVar;
        this.f = JavaOnlyMap.INSTANCE.deepClone(readableMap);
    }

    @Override // defpackage.hd0
    public final String d() {
        return "ObjectAnimatedNode[" + this.d + "]: mConfig: " + this.f;
    }

    public final void f(String str, JavaOnlyMap javaOnlyMap) {
        str.getClass();
        javaOnlyMap.getClass();
        JavaOnlyMap javaOnlyMap2 = this.f;
        ReadableType type = javaOnlyMap2.getType("value");
        if (type == ReadableType.Map) {
            javaOnlyMap.putMap(str, h(javaOnlyMap2.getMap("value")));
        } else if (type == ReadableType.Array) {
            javaOnlyMap.putArray(str, g(javaOnlyMap2.getArray("value")));
        } else {
            l5.q("Invalid value type for ObjectAnimatedNode");
        }
    }

    public final JavaOnlyArray g(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            switch (a.a[readableArray.getType(i).ordinal()]) {
                case 1:
                    javaOnlyArray.pushNull();
                    break;
                case 2:
                    javaOnlyArray.pushBoolean(readableArray.getBoolean(i));
                    break;
                case 3:
                    javaOnlyArray.pushDouble(readableArray.getDouble(i));
                    break;
                case 4:
                    javaOnlyArray.pushString(readableArray.getString(i));
                    break;
                case 5:
                    ReadableMap map = readableArray.getMap(i);
                    if (map != null && map.hasKey("nodeTag") && map.getType("nodeTag") == ReadableType.Number) {
                        hd0 hd0VarJ = this.e.j(map.getInt("nodeTag"));
                        if (hd0VarJ == null) {
                            l5.q("Mapped value node does not exist");
                            return null;
                        }
                        if (hd0VarJ instanceof elg) {
                            elg elgVar = (elg) hd0VarJ;
                            Object objF = elgVar.f();
                            if (objF instanceof Integer) {
                                javaOnlyArray.pushInt(((Number) objF).intValue());
                            } else if (objF instanceof String) {
                                javaOnlyArray.pushString((String) objF);
                            } else {
                                javaOnlyArray.pushDouble(elgVar.g());
                            }
                        } else if (hd0VarJ instanceof ea2) {
                            javaOnlyArray.pushInt(((ea2) hd0VarJ).f());
                        }
                    } else {
                        javaOnlyArray.pushMap(h(readableArray.getMap(i)));
                    }
                    break;
                case 6:
                    javaOnlyArray.pushArray(g(readableArray.getArray(i)));
                    break;
                default:
                    l.g();
                    return null;
            }
        }
        return javaOnlyArray;
    }

    public final JavaOnlyMap h(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            switch (a.a[readableMap.getType(strNextKey).ordinal()]) {
                case 1:
                    javaOnlyMap.putNull(strNextKey);
                    break;
                case 2:
                    javaOnlyMap.putBoolean(strNextKey, readableMap.getBoolean(strNextKey));
                    break;
                case 3:
                    javaOnlyMap.putDouble(strNextKey, readableMap.getDouble(strNextKey));
                    break;
                case 4:
                    javaOnlyMap.putString(strNextKey, readableMap.getString(strNextKey));
                    break;
                case 5:
                    ReadableMap map = readableMap.getMap(strNextKey);
                    if (map != null && map.hasKey("nodeTag") && map.getType("nodeTag") == ReadableType.Number) {
                        hd0 hd0VarJ = this.e.j(map.getInt("nodeTag"));
                        if (hd0VarJ == null) {
                            l5.q("Mapped value node does not exist");
                            return null;
                        }
                        if (hd0VarJ instanceof elg) {
                            elg elgVar = (elg) hd0VarJ;
                            Object objF = elgVar.f();
                            if (objF instanceof Integer) {
                                javaOnlyMap.putInt(strNextKey, ((Number) objF).intValue());
                            } else if (!(objF instanceof String)) {
                                javaOnlyMap.putDouble(strNextKey, elgVar.g());
                            } else {
                                javaOnlyMap.putString(strNextKey, (String) objF);
                            }
                        } else if (hd0VarJ instanceof ea2) {
                            javaOnlyMap.putInt(strNextKey, ((ea2) hd0VarJ).f());
                        }
                    } else {
                        javaOnlyMap.putMap(strNextKey, h(map));
                    }
                    break;
                case 6:
                    javaOnlyMap.putArray(strNextKey, g(readableMap.getArray(strNextKey)));
                    break;
                default:
                    l.g();
                    return null;
            }
        }
        return javaOnlyMap;
    }
}
