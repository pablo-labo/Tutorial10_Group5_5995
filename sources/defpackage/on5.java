package defpackage;

import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.datadog.android.core.internal.system.DefaultAndroidInfoProvider;
import com.datadog.android.rum.internal.debug.UiRumDebugListener;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.horcrux.svg.p;

/* JADX INFO: loaded from: classes2.dex */
public final class on5 {
    public static final on5 p = new on5();
    public final double a;
    public final String b;
    public final ajf c;
    public final ReadableMap d;
    public cjf e;
    public int f;
    public final String g;
    public final String h;
    public final bjf i;
    public final djf j;
    public final ejf k;
    public final double l;
    public final double m;
    public final double n;
    public final boolean o;

    public static class a {
        public static final cjf[] a;
        public static final int[] b;

        static {
            cjf cjfVar = cjf.w100;
            cjf cjfVar2 = cjf.w200;
            cjf cjfVar3 = cjf.w300;
            cjf cjfVar4 = cjf.Normal;
            cjf cjfVar5 = cjf.w500;
            cjf cjfVar6 = cjf.w600;
            cjf cjfVar7 = cjf.Bold;
            cjf cjfVar8 = cjf.w800;
            cjf cjfVar9 = cjf.w900;
            a = new cjf[]{cjfVar, cjfVar, cjfVar2, cjfVar3, cjfVar4, cjfVar5, cjfVar6, cjfVar7, cjfVar8, cjfVar9, cjfVar9};
            b = new int[]{DataOkHttpUploader.HTTP_BAD_REQUEST, 700, 100, UiRumDebugListener.DEFAULT_ALPHA, 300, DataOkHttpUploader.HTTP_BAD_REQUEST, 500, 600, 700, DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP, 900};
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065 A[PHI: r12
  0x0065: PHI (r12v57 int) = (r12v56 int), (r12v60 int) binds: [B:27:0x006f, B:21:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public on5(com.facebook.react.bridge.ReadableMap r12, defpackage.on5 r13, double r14) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.on5.<init>(com.facebook.react.bridge.ReadableMap, on5, double):void");
    }

    public static double b(ReadableMap readableMap, String str, double d, double d2, double d3) {
        return readableMap.getType(str) == ReadableType.Number ? readableMap.getDouble(str) : p.b(readableMap.getString(str), d3, d, d2);
    }

    public final void a(on5 on5Var, double d) {
        long jRound = Math.round(d);
        if (jRound < 1 || jRound > 1000) {
            this.f = on5Var.f;
            this.e = on5Var.e;
        } else {
            int i = (int) jRound;
            this.f = i;
            this.e = a.a[Math.round(i / 100.0f)];
        }
    }

    public on5() {
        this.d = null;
        this.b = "";
        this.c = ajf.a;
        this.e = cjf.Normal;
        this.f = DataOkHttpUploader.HTTP_BAD_REQUEST;
        this.g = "";
        this.h = "";
        this.i = bjf.a;
        this.j = djf.a;
        this.k = ejf.None;
        this.o = false;
        this.l = 0.0d;
        this.a = 12.0d;
        this.m = 0.0d;
        this.n = 0.0d;
    }
}
