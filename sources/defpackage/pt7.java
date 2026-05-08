package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import expo.modules.kotlin.types.folly.FollyDynamicExtensionConverter;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class pt7 {

    public interface a {
        WritableArray a();

        WritableMap b();
    }

    public static final class b implements a {
        public static final b a = new b();

        @Override // pt7.a
        public final WritableArray a() {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.getClass();
            return writableArrayCreateArray;
        }

        @Override // pt7.a
        public final WritableMap b() {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.getClass();
            return writableMapCreateMap;
        }
    }

    public static Object a(int i, Object obj) {
        boolean z = (i & 4) == 0;
        if (obj == null || (obj instanceof j6g)) {
            return null;
        }
        boolean z2 = obj instanceof Bundle;
        b bVar = b.a;
        if (z2) {
            return qt7.g((Bundle) obj, bVar);
        }
        if (obj instanceof Object[]) {
            return qt7.e((Object[]) obj, bVar);
        }
        if ((obj instanceof int[]) || (obj instanceof float[]) || (obj instanceof double[]) || (obj instanceof boolean[]) || (obj instanceof long[])) {
            return obj;
        }
        if (obj instanceof byte[]) {
            return FollyDynamicExtensionConverter.a.put(obj);
        }
        if (obj instanceof Map) {
            return z ? qt7.k((Map) obj) : qt7.h((Map) obj, bVar);
        }
        if (obj instanceof Enum) {
            return qt7.i((Enum) obj);
        }
        if (obj instanceof ftc) {
            return qt7.f((ftc) obj, bVar);
        }
        if (obj instanceof URI) {
            String string = ((URI) obj).toString();
            string.getClass();
            return string;
        }
        if (obj instanceof URL) {
            String string2 = ((URL) obj).toString();
            string2.getClass();
            return string2;
        }
        if (obj instanceof Uri) {
            String string3 = ((Uri) obj).toString();
            string3.getClass();
            return string3;
        }
        if (obj instanceof File) {
            String absolutePath = ((File) obj).getAbsolutePath();
            absolutePath.getClass();
            return absolutePath;
        }
        if (obj instanceof Pair) {
            return qt7.d((Pair) obj, bVar);
        }
        if (obj instanceof Long) {
            return Double.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof wd4) {
            return Double.valueOf(wd4.o(((wd4) obj).a));
        }
        if (obj instanceof djc) {
            return ((djc) obj).a();
        }
        if (obj instanceof Collection) {
            return z ? qt7.j((Collection) obj) : qt7.c((Collection) obj, bVar);
        }
        return obj;
    }

    public static Object b(Object obj, a aVar) {
        aVar.getClass();
        if (obj == null || (obj instanceof j6g)) {
            return null;
        }
        if (obj instanceof Bundle) {
            return qt7.g((Bundle) obj, aVar);
        }
        if (obj instanceof Object[]) {
            return qt7.e((Object[]) obj, aVar);
        }
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            WritableArray writableArrayA = aVar.a();
            int length = iArr.length;
            while (i < length) {
                writableArrayA.pushInt(iArr[i]);
                i++;
            }
            return writableArrayA;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            WritableArray writableArrayA2 = aVar.a();
            int length2 = jArr.length;
            while (i < length2) {
                writableArrayA2.pushLong(jArr[i]);
                i++;
            }
            return writableArrayA2;
        }
        if (obj instanceof float[]) {
            WritableArray writableArrayA3 = aVar.a();
            int length3 = ((float[]) obj).length;
            while (i < length3) {
                writableArrayA3.pushDouble(r4[i]);
                i++;
            }
            return writableArrayA3;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            WritableArray writableArrayA4 = aVar.a();
            int length4 = dArr.length;
            while (i < length4) {
                writableArrayA4.pushDouble(dArr[i]);
                i++;
            }
            return writableArrayA4;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            WritableArray writableArrayA5 = aVar.a();
            int length5 = zArr.length;
            while (i < length5) {
                writableArrayA5.pushBoolean(zArr[i]);
                i++;
            }
            return writableArrayA5;
        }
        if (obj instanceof byte[]) {
            return FollyDynamicExtensionConverter.a.put(obj);
        }
        if (obj instanceof Map) {
            return qt7.h((Map) obj, aVar);
        }
        if (obj instanceof Enum) {
            return qt7.i((Enum) obj);
        }
        if (obj instanceof ftc) {
            return qt7.f((ftc) obj, aVar);
        }
        if (obj instanceof URI) {
            String string = ((URI) obj).toString();
            string.getClass();
            return string;
        }
        if (obj instanceof URL) {
            String string2 = ((URL) obj).toString();
            string2.getClass();
            return string2;
        }
        if (obj instanceof Uri) {
            String string3 = ((Uri) obj).toString();
            string3.getClass();
            return string3;
        }
        if (!(obj instanceof File)) {
            return obj instanceof Pair ? qt7.d((Pair) obj, aVar) : obj instanceof Long ? Double.valueOf(((Number) obj).longValue()) : obj instanceof wd4 ? Double.valueOf(wd4.o(((wd4) obj).a)) : obj instanceof djc ? ((djc) obj).a() : obj instanceof Collection ? qt7.c((Collection) obj, aVar) : obj;
        }
        String absolutePath = ((File) obj).getAbsolutePath();
        absolutePath.getClass();
        return absolutePath;
    }
}
