package com.datadog.android;

import defpackage.l5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/DatadogSite;", "", "siteName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "intakeHostName", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "intakeEndpoint", "getIntakeEndpoint", "()Ljava/lang/String;", "getSiteName$dd_sdk_android_core_release", "US1", "US3", "US5", "EU1", "AP1", "US1_FED", "STAGING", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public enum DatadogSite {
    US1("us1", "browser-intake-datadoghq.com"),
    US3("us3"),
    US5("us5"),
    EU1("eu1", "browser-intake-datadoghq.eu"),
    AP1("ap1"),
    US1_FED("us1_fed", "browser-intake-ddog-gov.com"),
    STAGING("staging", "browser-intake-datad0g.com");

    private final String intakeEndpoint;
    private final String intakeHostName;
    private final String siteName;

    DatadogSite(String str, String str2) {
        this.siteName = str;
        this.intakeHostName = str2;
        this.intakeEndpoint = l5.l("https://", str2);
    }

    public final String getIntakeEndpoint() {
        return this.intakeEndpoint;
    }

    /* JADX INFO: renamed from: getSiteName$dd_sdk_android_core_release, reason: from getter */
    public final String getSiteName() {
        return this.siteName;
    }

    DatadogSite(String str) {
        this(str, l5.m("browser-intake-", str, "-datadoghq.com"));
    }
}
