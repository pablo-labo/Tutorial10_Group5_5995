package com.microsoft.codepush.react;

import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import defpackage.akb;
import defpackage.c0h;
import defpackage.l5;
import defpackage.t40;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            a = iArr;
            try {
                iArr[ReadableType.Map.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ReadableType.Array.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ReadableType.String.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ReadableType.Number.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ReadableType.Boolean.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ReadableType.Null.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static String a(String str, String str2) {
        return new File(str, str2).getAbsolutePath();
    }

    public static WritableArray b(JSONArray jSONArray) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONObject) {
                    writableArrayCreateArray.pushMap(c((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    writableArrayCreateArray.pushArray(b((JSONArray) obj));
                } else if (obj instanceof String) {
                    writableArrayCreateArray.pushString((String) obj);
                } else if (obj instanceof Double) {
                    writableArrayCreateArray.pushDouble(((Double) obj).doubleValue());
                } else if (obj instanceof Integer) {
                    writableArrayCreateArray.pushInt(((Integer) obj).intValue());
                } else if (obj instanceof Boolean) {
                    writableArrayCreateArray.pushBoolean(((Boolean) obj).booleanValue());
                } else {
                    if (obj != null) {
                        throw new CodePushUnknownException(t40.i(obj, "Unrecognized object: "));
                    }
                    writableArrayCreateArray.pushNull();
                }
            } catch (JSONException e) {
                throw new CodePushUnknownException(i + " should be within bounds of array " + jSONArray.toString(), e);
            }
        }
        return writableArrayCreateArray;
    }

    public static WritableMap c(JSONObject jSONObject) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = !jSONObject.isNull(next) ? jSONObject.get(next) : null;
                if (obj instanceof JSONObject) {
                    writableMapCreateMap.putMap(next, c((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    writableMapCreateMap.putArray(next, b((JSONArray) obj));
                } else if (obj instanceof String) {
                    writableMapCreateMap.putString(next, (String) obj);
                } else if (obj instanceof Double) {
                    writableMapCreateMap.putDouble(next, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    writableMapCreateMap.putDouble(next, ((Long) obj).doubleValue());
                } else if (obj instanceof Integer) {
                    writableMapCreateMap.putInt(next, ((Integer) obj).intValue());
                } else if (obj instanceof Boolean) {
                    writableMapCreateMap.putBoolean(next, ((Boolean) obj).booleanValue());
                } else {
                    if (obj != null) {
                        throw new CodePushUnknownException(t40.i(obj, "Unrecognized object: "));
                    }
                    writableMapCreateMap.putNull(next);
                }
            } catch (JSONException e) {
                StringBuilder sbM = akb.m("Key ", next, " should exist in ");
                sbM.append(jSONObject.toString());
                sbM.append(".");
                throw new CodePushUnknownException(sbM.toString(), e);
            }
        }
        return writableMapCreateMap;
    }

    public static JSONArray d(ReadableArray readableArray) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < readableArray.size(); i++) {
            switch (a.a[readableArray.getType(i).ordinal()]) {
                case 1:
                    jSONArray.put(e(readableArray.getMap(i)));
                    break;
                case 2:
                    jSONArray.put(d(readableArray.getArray(i)));
                    break;
                case 3:
                    jSONArray.put(readableArray.getString(i));
                    break;
                case 4:
                    double d = readableArray.getDouble(i);
                    Double dValueOf = Double.valueOf(d);
                    if (d == Math.floor(d) && !Double.isInfinite(d)) {
                        jSONArray.put(dValueOf.longValue());
                    } else {
                        try {
                            jSONArray.put(d);
                        } catch (JSONException unused) {
                            throw new CodePushUnknownException("Unable to put value " + readableArray.getDouble(i) + " in JSONArray");
                        }
                    }
                    break;
                case 5:
                    jSONArray.put(readableArray.getBoolean(i));
                    break;
                case 6:
                    jSONArray.put((Object) null);
                    break;
            }
        }
        return jSONArray;
    }

    public static JSONObject e(ReadableMap readableMap) {
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            ReadableType type = readableMap.getType(strNextKey);
            try {
                switch (a.a[type.ordinal()]) {
                    case 1:
                        jSONObject.put(strNextKey, e(readableMap.getMap(strNextKey)));
                        continue;
                    case 2:
                        jSONObject.put(strNextKey, d(readableMap.getArray(strNextKey)));
                        continue;
                    case 3:
                        jSONObject.put(strNextKey, readableMap.getString(strNextKey));
                        continue;
                    case 4:
                        jSONObject.put(strNextKey, readableMap.getDouble(strNextKey));
                        continue;
                    case 5:
                        jSONObject.put(strNextKey, readableMap.getBoolean(strNextKey));
                        continue;
                    case 6:
                        jSONObject.put(strNextKey, (Object) null);
                        continue;
                    default:
                        throw new CodePushUnknownException("Unrecognized type: " + type + " of key: " + strNextKey);
                }
            } catch (JSONException e) {
                com.microsoft.codepush.react.a.a(l5.m("Error setting key: ", strNextKey, " in JSONObject"), e);
                return null;
            }
            com.microsoft.codepush.react.a.a(l5.m("Error setting key: ", strNextKey, " in JSONObject"), e);
            return null;
        }
        return jSONObject;
    }

    public static JSONObject f(String str) {
        try {
            return new JSONObject(c0h.K(str));
        } catch (JSONException e) {
            throw new CodePushMalformedDataException(str, e);
        }
    }

    public static String g(InputStream inputStream) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        try {
            StringBuilder sb = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append("\n");
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    if (inputStream == null) {
                        throw th;
                    }
                    inputStream.close();
                    throw th;
                }
            }
            String strTrim = sb.toString().trim();
            bufferedReader.close();
            if (inputStream != null) {
                inputStream.close();
            }
            return strTrim;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }

    public static void h(String str) {
        Log.d("ReactNative", "[CodePush] " + str);
    }

    public static void i(Throwable th) {
        Log.e("ReactNative", "[CodePush] Exception", th);
    }

    public static void j(String str) {
        h("Loading JS bundle from \"" + str + "\"");
    }

    public static void k(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
            throw new CodePushUnknownException("Unable to set value " + obj + " for key " + str + " to JSONObject");
        }
    }

    public static void l(JSONObject jSONObject, String str) throws Throwable {
        PrintWriter printWriter;
        String string = jSONObject.toString();
        PrintWriter printWriter2 = null;
        try {
            printWriter = new PrintWriter(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            printWriter.print(string);
            printWriter.close();
        } catch (Throwable th2) {
            th = th2;
            printWriter2 = printWriter;
            if (printWriter2 != null) {
                printWriter2.close();
            }
            throw th;
        }
    }
}
