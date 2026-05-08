package com.facebook.react.uimanager;

import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import defpackage.awe;
import defpackage.s55;
import defpackage.wve;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J:\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0083 ¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/facebook/react/uimanager/TransformHelper;", "", "Lcom/facebook/react/bridge/NativeArray;", "transforms", "", "result", "", "viewWidth", "viewHeight", "transformOrigin", "Lj6g;", "nativeProcessTransform", "(Lcom/facebook/react/bridge/NativeArray;[DFFLcom/facebook/react/bridge/NativeArray;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransformHelper {
    public static final b a = new b();

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
            a = iArr;
        }
    }

    public static final class b extends ThreadLocal<double[]> {
        @Override // java.lang.ThreadLocal
        public final double[] initialValue() {
            return new double[16];
        }
    }

    public static double a(ReadableMap readableMap, String str) {
        double d;
        boolean z = true;
        if (readableMap.getType(str) == ReadableType.String) {
            String string = readableMap.getString(str);
            string.getClass();
            if (wve.D(string, "rad", false)) {
                string = awe.x0(3, string);
            } else if (wve.D(string, "deg", false)) {
                string = awe.x0(3, string);
                z = false;
            }
            d = Double.parseDouble(string);
        } else {
            d = readableMap.getDouble(str);
        }
        return z ? d : (d * 3.141592653589793d) / 180.0d;
    }

    public static double b(String str, double d) {
        try {
            return wve.D(str, "%", false) ? (Double.parseDouble(awe.x0(1, str)) * d) / 100.0d : Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            s55.n("ReactNative", "Invalid translate value: ".concat(str));
            return 0.0d;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0380 A[PHI: r16 r23 r24 r29
  0x0380: PHI (r16v18 char) = 
  (r16v1 char)
  (r16v2 char)
  (r16v3 char)
  (r16v4 char)
  (r16v5 char)
  (r16v6 char)
  (r16v7 char)
  (r16v8 char)
  (r16v9 char)
  (r16v10 char)
  (r16v19 char)
 binds: [B:133:0x037e, B:124:0x034d, B:118:0x0329, B:114:0x02f6, B:110:0x02d8, B:106:0x02be, B:102:0x02a0, B:98:0x0282, B:94:0x0262, B:90:0x0243, B:56:0x0149] A[DONT_GENERATE, DONT_INLINE]
  0x0380: PHI (r23v17 char) = 
  (r23v0 char)
  (r23v1 char)
  (r23v2 char)
  (r23v3 char)
  (r23v4 char)
  (r23v5 char)
  (r23v6 char)
  (r23v7 char)
  (r23v8 char)
  (r23v9 char)
  (r23v18 char)
 binds: [B:133:0x037e, B:124:0x034d, B:118:0x0329, B:114:0x02f6, B:110:0x02d8, B:106:0x02be, B:102:0x02a0, B:98:0x0282, B:94:0x0262, B:90:0x0243, B:56:0x0149] A[DONT_GENERATE, DONT_INLINE]
  0x0380: PHI (r24v17 int) = 
  (r24v0 int)
  (r24v1 int)
  (r24v2 int)
  (r24v3 int)
  (r24v4 int)
  (r24v5 int)
  (r24v6 int)
  (r24v7 int)
  (r24v8 int)
  (r24v9 int)
  (r24v18 int)
 binds: [B:133:0x037e, B:124:0x034d, B:118:0x0329, B:114:0x02f6, B:110:0x02d8, B:106:0x02be, B:102:0x02a0, B:98:0x0282, B:94:0x0262, B:90:0x0243, B:56:0x0149] A[DONT_GENERATE, DONT_INLINE]
  0x0380: PHI (r29v18 char) = 
  (r29v1 char)
  (r29v2 char)
  (r29v3 char)
  (r29v4 char)
  (r29v5 char)
  (r29v6 char)
  (r29v7 char)
  (r29v8 char)
  (r29v9 char)
  (r29v10 char)
  (r29v19 char)
 binds: [B:133:0x037e, B:124:0x034d, B:118:0x0329, B:114:0x02f6, B:110:0x02d8, B:106:0x02be, B:102:0x02a0, B:98:0x0282, B:94:0x0262, B:90:0x0243, B:56:0x0149] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(com.facebook.react.bridge.ReadableArray r25, double[] r26, float r27, float r28, com.facebook.react.bridge.ReadableArray r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 1044
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.TransformHelper.c(com.facebook.react.bridge.ReadableArray, double[], float, float, com.facebook.react.bridge.ReadableArray, boolean):void");
    }

    private static final native void nativeProcessTransform(NativeArray transforms, double[] result, float viewWidth, float viewHeight, NativeArray transformOrigin);
}
