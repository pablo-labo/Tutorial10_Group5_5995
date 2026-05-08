package defpackage;

import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: loaded from: classes3.dex */
public final class la8 {
    public static final wd7 a = pi3.b("kotlinx.serialization.json.JsonUnquotedLiteral", mve.a);

    public static final JsonPrimitive a(Boolean bool) {
        return bool == null ? JsonNull.INSTANCE : new ta8(bool, false, null);
    }

    public static final JsonPrimitive b(Number number) {
        return number == null ? JsonNull.INSTANCE : new ta8(number, false, null);
    }

    public static final JsonPrimitive c(String str) {
        return str == null ? JsonNull.INSTANCE : new ta8(str, true, null);
    }

    public static final void d(String str, JsonElement jsonElement) {
        throw new IllegalArgumentException("Element " + fwc.a.b(jsonElement.getClass()) + " is not a " + str);
    }

    public static final Integer e(JsonPrimitive jsonPrimitive) {
        Long lValueOf;
        jsonPrimitive.getClass();
        try {
            lValueOf = Long.valueOf(i(jsonPrimitive));
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    public static final JsonObject f(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        d("JsonObject", jsonElement);
        throw null;
    }

    public static final JsonPrimitive g(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        d("JsonPrimitive", jsonElement);
        throw null;
    }

    public static final Long h(JsonPrimitive jsonPrimitive) {
        jsonPrimitive.getClass();
        try {
            return Long.valueOf(i(jsonPrimitive));
        } catch (JsonDecodingException unused) {
            return null;
        }
    }

    public static final long i(JsonPrimitive jsonPrimitive) {
        jsonPrimitive.getClass();
        eve eveVar = new eve(jsonPrimitive.a());
        long jH = eveVar.h();
        if (eveVar.e() == 10) {
            return jH;
        }
        int i = eveVar.a;
        int i2 = i - 1;
        String str = eveVar.e;
        eve.m(eveVar, l5.m("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, null, 4);
        throw null;
    }
}
