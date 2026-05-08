package defpackage;

import android.graphics.Color;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cb2 extends ge4<Color> {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static Color g(double[] dArr) {
        Double dValueOf = 3 < dArr.length ? Double.valueOf(dArr[3]) : null;
        Color colorValueOf = Color.valueOf((float) dArr[0], (float) dArr[1], (float) dArr[2], (float) (dValueOf != null ? dValueOf.doubleValue() : 1.0d));
        colorValueOf.getClass();
        return colorValueOf;
    }

    public static Color h(String str) {
        List list = (List) db2.a.get(str);
        if (list != null) {
            Color colorValueOf = Color.valueOf(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue(), ((Number) list.get(3)).floatValue());
            colorValueOf.getClass();
            return colorValueOf;
        }
        Color colorValueOf2 = Color.valueOf(Color.parseColor(str));
        colorValueOf2.getClass();
        return colorValueOf2;
    }

    @Override // defpackage.kka, defpackage.owf
    public final boolean b() {
        return false;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return new ExpectedType(new SingleType(s23.b, null), new SingleType(s23.f, null), new SingleType(s23.b0, new ExpectedType[]{new ExpectedType(s23.a)}));
    }

    @Override // defpackage.ge4
    public final Color e(Object obj, gk0 gk0Var, boolean z) throws UnexpectedException {
        if (obj instanceof Integer) {
            Color colorValueOf = Color.valueOf(((Number) obj).intValue());
            colorValueOf.getClass();
            return colorValueOf;
        }
        if (obj instanceof String) {
            return h((String) obj);
        }
        if (obj instanceof double[]) {
            return g((double[]) obj);
        }
        throw new UnexpectedException("Unknown argument type: " + fwc.a.b(obj.getClass()), null);
    }

    @Override // defpackage.ge4
    public final Color f(Dynamic dynamic, gk0 gk0Var, boolean z) throws DynamicCastException, UnexpectedException {
        int i = a.a[dynamic.getType().ordinal()];
        if (i == 1) {
            Color colorValueOf = Color.valueOf((int) dynamic.asDouble());
            colorValueOf.getClass();
            return colorValueOf;
        }
        if (i == 2) {
            String strAsString = dynamic.asString();
            if (strAsString != null) {
                return h(strAsString);
            }
            throw new DynamicCastException(fwc.a.b(String.class));
        }
        if (i != 3) {
            throw new UnexpectedException("Unknown argument type: " + dynamic.getType(), null);
        }
        ReadableArray readableArrayAsArray = dynamic.asArray();
        if (readableArrayAsArray == null) {
            throw new DynamicCastException(fwc.a.b(ReadableArray.class));
        }
        ArrayList<Object> arrayList = readableArrayAsArray.toArrayList();
        ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
        for (Object obj : arrayList) {
            obj.getClass();
            arrayList2.add((Double) obj);
        }
        return g(z92.v1(arrayList2));
    }
}
