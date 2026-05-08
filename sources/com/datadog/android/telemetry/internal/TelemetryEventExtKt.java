package com.datadog.android.telemetry.internal;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.telemetry.model.TelemetryConfigurationEvent;
import com.datadog.android.telemetry.model.TelemetryDebugEvent;
import com.datadog.android.telemetry.model.TelemetryErrorEvent;
import com.datadog.android.telemetry.model.TelemetryUsageEvent;
import defpackage.gu5;
import defpackage.mj8;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001e\u0010\u0002\u001a\u0004\u0018\u00010\b*\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001e\u0010\u0002\u001a\u0004\u0018\u00010\n*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001e\u0010\u0002\u001a\u0004\u0018\u00010\f*\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"UNKNOWN_SOURCE_WARNING_MESSAGE_FORMAT", "", "tryFromSource", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Source;", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Source$Companion;", "source", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$Source;", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$Source$Companion;", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source;", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source$Companion;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Source;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Source$Companion;", "dd-sdk-android-rum_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class TelemetryEventExtKt {
    public static final String UNKNOWN_SOURCE_WARNING_MESSAGE_FORMAT = "You are using an unknown source %s for your events";

    /* JADX INFO: renamed from: com.datadog.android.telemetry.internal.TelemetryEventExtKt$tryFromSource$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ String $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$source = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{this.$source}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.telemetry.internal.TelemetryEventExtKt$tryFromSource$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        final /* synthetic */ String $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(0);
            this.$source = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{this.$source}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.telemetry.internal.TelemetryEventExtKt$tryFromSource$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass3 extends mj8 implements gu5<String> {
        final /* synthetic */ String $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str) {
            super(0);
            this.$source = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{this.$source}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.telemetry.internal.TelemetryEventExtKt$tryFromSource$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass4 extends mj8 implements gu5<String> {
        final /* synthetic */ String $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str) {
            super(0);
            this.$source = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{this.$source}, 1));
        }
    }

    public static final TelemetryDebugEvent.Source tryFromSource(TelemetryDebugEvent.Source.Companion companion, String str, InternalLogger internalLogger) {
        companion.getClass();
        str.getClass();
        internalLogger.getClass();
        try {
            return companion.fromJson(str);
        } catch (NoSuchElementException e) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) new AnonymousClass1(str), (Throwable) e, false, (Map) null, 48, (Object) null);
            return null;
        }
    }

    public static final TelemetryErrorEvent.Source tryFromSource(TelemetryErrorEvent.Source.Companion companion, String str, InternalLogger internalLogger) {
        companion.getClass();
        str.getClass();
        internalLogger.getClass();
        try {
            return companion.fromJson(str);
        } catch (NoSuchElementException e) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) new AnonymousClass2(str), (Throwable) e, false, (Map) null, 48, (Object) null);
            return null;
        }
    }

    public static final TelemetryUsageEvent.Source tryFromSource(TelemetryUsageEvent.Source.Companion companion, String str, InternalLogger internalLogger) {
        companion.getClass();
        str.getClass();
        internalLogger.getClass();
        try {
            return companion.fromJson(str);
        } catch (NoSuchElementException e) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) new AnonymousClass3(str), (Throwable) e, false, (Map) null, 48, (Object) null);
            return null;
        }
    }

    public static final TelemetryConfigurationEvent.Source tryFromSource(TelemetryConfigurationEvent.Source.Companion companion, String str, InternalLogger internalLogger) {
        companion.getClass();
        str.getClass();
        internalLogger.getClass();
        try {
            return companion.fromJson(str);
        } catch (NoSuchElementException e) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) new AnonymousClass4(str), (Throwable) e, false, (Map) null, 48, (Object) null);
            return null;
        }
    }
}
