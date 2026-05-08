package com.datadog.android.sqlite;

import android.database.DatabaseErrorHandler;
import android.database.DefaultDatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.core.SdkReference;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumAttributes;
import com.datadog.android.rum.RumErrorSource;
import defpackage.gu5;
import defpackage.l5;
import defpackage.lc9;
import defpackage.mj8;
import defpackage.t40;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/datadog/android/sqlite/DatadogDatabaseErrorHandler;", "Landroid/database/DatabaseErrorHandler;", "", "sdkInstanceName", "defaultErrorHandler", "<init>", "(Ljava/lang/String;Landroid/database/DatabaseErrorHandler;)V", "Landroid/database/sqlite/SQLiteDatabase;", "dbObj", "Lj6g;", "onCorruption", "(Landroid/database/sqlite/SQLiteDatabase;)V", "Ljava/lang/String;", "Landroid/database/DatabaseErrorHandler;", "getDefaultErrorHandler$dd_sdk_android_rum_release", "()Landroid/database/DatabaseErrorHandler;", "Lcom/datadog/android/core/SdkReference;", "sdkReference", "Lcom/datadog/android/core/SdkReference;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DatadogDatabaseErrorHandler implements DatabaseErrorHandler {
    public static final String DATABASE_CORRUPTION_ERROR_MESSAGE = "Corruption reported by sqlite database: %s";
    private final DatabaseErrorHandler defaultErrorHandler;
    private final String sdkInstanceName;
    private final SdkReference sdkReference;

    /* JADX INFO: renamed from: com.datadog.android.sqlite.DatadogDatabaseErrorHandler$onCorruption$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ String $prefix;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$prefix = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return t40.k(this.$prefix, " is not found, skipping reporting the corruption of sqlite database: %s");
        }
    }

    public DatadogDatabaseErrorHandler(String str, DatabaseErrorHandler databaseErrorHandler) {
        databaseErrorHandler.getClass();
        this.sdkInstanceName = str;
        this.defaultErrorHandler = databaseErrorHandler;
        this.sdkReference = new SdkReference(str, null, 2, null);
    }

    /* JADX INFO: renamed from: getDefaultErrorHandler$dd_sdk_android_rum_release, reason: from getter */
    public final DatabaseErrorHandler getDefaultErrorHandler() {
        return this.defaultErrorHandler;
    }

    @Override // android.database.DatabaseErrorHandler
    public void onCorruption(SQLiteDatabase dbObj) {
        dbObj.getClass();
        this.defaultErrorHandler.onCorruption(dbObj);
        SdkCore sdkCore = this.sdkReference.get();
        if (sdkCore != null) {
            GlobalRumMonitor.get(sdkCore).addError(String.format(Locale.US, DATABASE_CORRUPTION_ERROR_MESSAGE, Arrays.copyOf(new Object[]{dbObj.getPath()}, 1)), RumErrorSource.SOURCE, null, lc9.a0(new Pair(RumAttributes.ERROR_DATABASE_PATH, dbObj.getPath()), new Pair(RumAttributes.ERROR_DATABASE_VERSION, Integer.valueOf(dbObj.getVersion()))));
        } else {
            String str = this.sdkInstanceName;
            InternalLogger.DefaultImpls.log$default(InternalLogger.INSTANCE.getUNBOUND(), InternalLogger.Level.INFO, InternalLogger.Target.USER, (gu5) new AnonymousClass1(str == null ? "Default SDK instance" : l5.l("SDK instance with name=", str)), (Throwable) null, false, (Map) null, 56, (Object) null);
        }
    }

    public DatadogDatabaseErrorHandler() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ DatadogDatabaseErrorHandler(String str, DatabaseErrorHandler databaseErrorHandler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new DefaultDatabaseErrorHandler() : databaseErrorHandler);
    }
}
