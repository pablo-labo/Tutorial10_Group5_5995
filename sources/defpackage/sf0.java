package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.exception.NullArgumentException;
import expo.modules.kotlin.jni.ExpectedType;

/* JADX INFO: loaded from: classes3.dex */
public final class sf0 extends ge4<Object> {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Boolean.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Null.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return new ExpectedType(s23.i0);
    }

    @Override // defpackage.ge4
    public final Object e(Object obj, gk0 gk0Var, boolean z) {
        return obj;
    }

    @Override // defpackage.ge4
    public final Object f(Dynamic dynamic, gk0 gk0Var, boolean z) throws NullArgumentException, DynamicCastException {
        switch (a.a[dynamic.getType().ordinal()]) {
            case 1:
                return Boolean.valueOf(dynamic.asBoolean());
            case 2:
                return Double.valueOf(dynamic.asDouble());
            case 3:
                String strAsString = dynamic.asString();
                if (strAsString != null) {
                    return strAsString;
                }
                throw new DynamicCastException(fwc.a.b(String.class));
            case 4:
                ReadableMap readableMapAsMap = dynamic.asMap();
                if (readableMapAsMap != null) {
                    return readableMapAsMap.toHashMap();
                }
                throw new DynamicCastException(fwc.a.b(ReadableMap.class));
            case 5:
                ReadableArray readableArrayAsArray = dynamic.asArray();
                if (readableArrayAsArray != null) {
                    return readableArrayAsArray.toArrayList();
                }
                throw new DynamicCastException(fwc.a.b(ReadableArray.class));
            case 6:
                throw new NullArgumentException();
            default:
                l.g();
                return null;
        }
    }
}
