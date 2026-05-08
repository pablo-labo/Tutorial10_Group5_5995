package com.indeed.android.jsmappservices.util;

import android.content.Context;
import defpackage.a9c;
import defpackage.ai8;
import defpackage.boa;
import defpackage.d2f;
import defpackage.dd;
import defpackage.fwc;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.oq;
import defpackage.ot2;
import defpackage.qpd;
import defpackage.qt8;
import defpackage.vh8;
import defpackage.xh8;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationSensor implements xh8 {
    public final Lazy a = boa.E(qt8.a, new a(this));
    public final d2f b = new d2f(new oq(this, 13));
    public final d2f c = new d2f(new dd(this, 11));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/indeed/android/jsmappservices/util/LocationSensor$LocationUnavailableException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LocationUnavailableException extends Exception {
        public LocationUnavailableException() {
            super("Location is not available, e.g. disabled in the settings.");
        }
    }

    public static final class a extends mj8 implements gu5<Context> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LocationSensor locationSensor) {
            super(0);
            this.$this_inject = locationSensor;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context, java.lang.Object] */
        @Override // defpackage.gu5
        public final Context invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(Context.class), a9cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0140 A[Catch: all -> 0x008d, SecurityException -> 0x0091, CancellationException -> 0x0096, TRY_LEAVE, TryCatch #0 {SecurityException -> 0x0091, blocks: (B:72:0x013b, B:74:0x0140, B:39:0x0089, B:60:0x00e1, B:62:0x00e6, B:69:0x0125), top: B:99:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.pu2 r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.jsmappservices.util.LocationSensor.a(pu2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b A[Catch: all -> 0x0050, SecurityException -> 0x0054, CancellationException -> 0x0058, TryCatch #5 {SecurityException -> 0x0054, CancellationException -> 0x0058, all -> 0x0050, blocks: (B:24:0x004c, B:37:0x0087, B:39:0x008b, B:40:0x009b), top: B:67:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b A[Catch: all -> 0x0050, SecurityException -> 0x0054, CancellationException -> 0x0058, TRY_LEAVE, TryCatch #5 {SecurityException -> 0x0054, CancellationException -> 0x0058, all -> 0x0050, blocks: (B:24:0x004c, B:37:0x0087, B:39:0x008b, B:40:0x009b), top: B:67:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc A[Catch: all -> 0x0037, SecurityException -> 0x003a, CancellationException -> 0x003d, TRY_LEAVE, TryCatch #5 {all -> 0x0037, blocks: (B:13:0x0032, B:44:0x00b8, B:46:0x00bc, B:50:0x00d1, B:51:0x00d6, B:58:0x00e0, B:59:0x00ef, B:60:0x00f0), top: B:63:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1 A[Catch: all -> 0x0037, SecurityException -> 0x003a, CancellationException -> 0x003d, TRY_ENTER, TryCatch #5 {all -> 0x0037, blocks: (B:13:0x0032, B:44:0x00b8, B:46:0x00bc, B:50:0x00d1, B:51:0x00d6, B:58:0x00e0, B:59:0x00ef, B:60:0x00f0), top: B:63:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.indeed.android.jsmappservices.util.b, pu2] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.pu2 r15) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.jsmappservices.util.LocationSensor.b(pu2):java.lang.Object");
    }

    public final boolean c() {
        Lazy lazy = this.a;
        return ot2.a((Context) lazy.getValue(), "android.permission.ACCESS_FINE_LOCATION") == 0 || (ot2.a((Context) lazy.getValue(), "android.permission.ACCESS_COARSE_LOCATION") == 0);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
