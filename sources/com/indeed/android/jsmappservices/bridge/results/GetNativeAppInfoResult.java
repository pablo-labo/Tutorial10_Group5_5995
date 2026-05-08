package com.indeed.android.jsmappservices.bridge.results;

import android.os.Build;
import com.indeed.android.jobsearch.BuildConfig;
import defpackage.akb;
import defpackage.ewa;
import defpackage.ia;
import defpackage.o7e;
import defpackage.q6;
import defpackage.u40;
import defpackage.w40;
import defpackage.wl7;
import defpackage.z3;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/results/GetNativeAppInfoResult;", "Lcom/indeed/android/jsmappservices/bridge/results/BridgeResult;", "Companion", "$serializer", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GetNativeAppInfoResult extends BridgeResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/results/GetNativeAppInfoResult$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jsmappservices/bridge/results/GetNativeAppInfoResult;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GetNativeAppInfoResult> serializer() {
            return GetNativeAppInfoResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetNativeAppInfoResult(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (255 != (i & 255)) {
            ewa.M(i, 255, GetNativeAppInfoResult$$serializer.INSTANCE.get$$serialDesc());
            throw null;
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i2;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetNativeAppInfoResult)) {
            return false;
        }
        GetNativeAppInfoResult getNativeAppInfoResult = (GetNativeAppInfoResult) obj;
        return wl7.b(this.b, getNativeAppInfoResult.b) && wl7.b(this.c, getNativeAppInfoResult.c) && wl7.b(this.d, getNativeAppInfoResult.d) && this.e == getNativeAppInfoResult.e && wl7.b(this.f, getNativeAppInfoResult.f) && wl7.b(this.g, getNativeAppInfoResult.g) && wl7.b(this.h, getNativeAppInfoResult.h) && wl7.b(this.i, getNativeAppInfoResult.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + akb.d(akb.d(akb.d(w40.c(this.e, akb.d(akb.d(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("GetNativeAppInfoResult(platform=", this.b, ", osVersion=", this.c, ", appVersion=");
        sbF.append(this.d);
        sbF.append(", appBuildNumber=");
        sbF.append(this.e);
        sbF.append(", environment=");
        ia.r(sbF, this.f, ", buildType=", this.g, ", appSessionId=");
        return z3.n(sbF, this.h, ", sessionId=", this.i, ")");
    }

    public GetNativeAppInfoResult(String str, String str2, String str3, String str4) {
        String str5 = Build.VERSION.RELEASE;
        q6.m(str5, str3, str4);
        this.b = "ANDROID";
        this.c = str5;
        this.d = BuildConfig.VERSION_NAME;
        this.e = BuildConfig.VERSION_CODE;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
    }
}
