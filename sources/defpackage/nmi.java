package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzae;

/* JADX INFO: loaded from: classes2.dex */
public final class nmi extends ifh implements xli {
    @Override // defpackage.xli
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeLong(j);
        h(parcelC, 23);
    }

    @Override // defpackage.xli
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        nkh.c(parcelC, bundle);
        h(parcelC, 9);
    }

    @Override // defpackage.xli
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeLong(j);
        h(parcelC, 24);
    }

    @Override // defpackage.xli
    public final void generateEventId(gmi gmiVar) {
        Parcel parcelC = c();
        nkh.b(parcelC, gmiVar);
        h(parcelC, 22);
    }

    @Override // defpackage.xli
    public final void getCachedAppInstanceId(gmi gmiVar) {
        Parcel parcelC = c();
        nkh.b(parcelC, gmiVar);
        h(parcelC, 19);
    }

    @Override // defpackage.xli
    public final void getConditionalUserProperties(String str, String str2, gmi gmiVar) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        nkh.b(parcelC, gmiVar);
        h(parcelC, 10);
    }

    @Override // defpackage.xli
    public final void getCurrentScreenClass(gmi gmiVar) {
        Parcel parcelC = c();
        nkh.b(parcelC, gmiVar);
        h(parcelC, 17);
    }

    @Override // defpackage.xli
    public final void getCurrentScreenName(gmi gmiVar) {
        Parcel parcelC = c();
        nkh.b(parcelC, gmiVar);
        h(parcelC, 16);
    }

    @Override // defpackage.xli
    public final void getGmpAppId(gmi gmiVar) {
        Parcel parcelC = c();
        nkh.b(parcelC, gmiVar);
        h(parcelC, 21);
    }

    @Override // defpackage.xli
    public final void getMaxUserProperties(String str, gmi gmiVar) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        nkh.b(parcelC, gmiVar);
        h(parcelC, 6);
    }

    @Override // defpackage.xli
    public final void getUserProperties(String str, String str2, boolean z, gmi gmiVar) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        ClassLoader classLoader = nkh.a;
        parcelC.writeInt(z ? 1 : 0);
        nkh.b(parcelC, gmiVar);
        h(parcelC, 5);
    }

    @Override // defpackage.xli
    public final void initialize(tn6 tn6Var, zzae zzaeVar, long j) {
        Parcel parcelC = c();
        nkh.b(parcelC, tn6Var);
        nkh.c(parcelC, zzaeVar);
        parcelC.writeLong(j);
        h(parcelC, 1);
    }

    @Override // defpackage.xli
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        nkh.c(parcelC, bundle);
        parcelC.writeInt(z ? 1 : 0);
        parcelC.writeInt(1);
        parcelC.writeLong(j);
        h(parcelC, 2);
    }

    @Override // defpackage.xli
    public final void logHealthData(int i, String str, tn6 tn6Var, tn6 tn6Var2, tn6 tn6Var3) {
        Parcel parcelC = c();
        parcelC.writeInt(5);
        parcelC.writeString("Error with data collection. Data lost.");
        nkh.b(parcelC, tn6Var);
        nkh.b(parcelC, tn6Var2);
        nkh.b(parcelC, tn6Var3);
        h(parcelC, 33);
    }

    @Override // defpackage.xli
    public final void onActivityCreated(tn6 tn6Var, Bundle bundle, long j) {
        Parcel parcelC = c();
        nkh.b(parcelC, tn6Var);
        nkh.c(parcelC, bundle);
        parcelC.writeLong(j);
        h(parcelC, 27);
    }

    @Override // defpackage.xli
    public final void onActivityDestroyed(tn6 tn6Var, long j) {
        Parcel parcelC = c();
        nkh.b(parcelC, tn6Var);
        parcelC.writeLong(j);
        h(parcelC, 28);
    }

    @Override // defpackage.xli
    public final void onActivityPaused(tn6 tn6Var, long j) {
        Parcel parcelC = c();
        nkh.b(parcelC, tn6Var);
        parcelC.writeLong(j);
        h(parcelC, 29);
    }

    @Override // defpackage.xli
    public final void onActivityResumed(tn6 tn6Var, long j) {
        Parcel parcelC = c();
        nkh.b(parcelC, tn6Var);
        parcelC.writeLong(j);
        h(parcelC, 30);
    }

    @Override // defpackage.xli
    public final void onActivitySaveInstanceState(tn6 tn6Var, gmi gmiVar, long j) {
        Parcel parcelC = c();
        nkh.b(parcelC, tn6Var);
        nkh.b(parcelC, gmiVar);
        parcelC.writeLong(j);
        h(parcelC, 31);
    }

    @Override // defpackage.xli
    public final void onActivityStarted(tn6 tn6Var, long j) {
        Parcel parcelC = c();
        nkh.b(parcelC, tn6Var);
        parcelC.writeLong(j);
        h(parcelC, 25);
    }

    @Override // defpackage.xli
    public final void onActivityStopped(tn6 tn6Var, long j) {
        Parcel parcelC = c();
        nkh.b(parcelC, tn6Var);
        parcelC.writeLong(j);
        h(parcelC, 26);
    }

    @Override // defpackage.xli
    public final void registerOnMeasurementEventListener(igh ighVar) {
        Parcel parcelC = c();
        nkh.b(parcelC, ighVar);
        h(parcelC, 35);
    }

    @Override // defpackage.xli
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelC = c();
        nkh.c(parcelC, bundle);
        parcelC.writeLong(j);
        h(parcelC, 8);
    }

    @Override // defpackage.xli
    public final void setCurrentScreen(tn6 tn6Var, String str, String str2, long j) {
        Parcel parcelC = c();
        nkh.b(parcelC, tn6Var);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        parcelC.writeLong(j);
        h(parcelC, 15);
    }

    @Override // defpackage.xli
    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    @Override // defpackage.xli
    public final void setUserId(String str, long j) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeLong(j);
        h(parcelC, 7);
    }

    @Override // defpackage.xli
    public final void setUserProperty(String str, String str2, tn6 tn6Var, boolean z, long j) {
        Parcel parcelC = c();
        parcelC.writeString("fcm");
        parcelC.writeString("_ln");
        nkh.b(parcelC, tn6Var);
        parcelC.writeInt(1);
        parcelC.writeLong(j);
        h(parcelC, 4);
    }
}
