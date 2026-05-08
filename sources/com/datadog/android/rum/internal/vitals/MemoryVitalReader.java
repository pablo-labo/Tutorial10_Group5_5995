package com.datadog.android.rum.internal.vitals;

import com.datadog.android.api.InternalLogger;
import defpackage.pxc;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000f\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/MemoryVitalReader;", "Lcom/datadog/android/rum/internal/vitals/VitalReader;", "statusFile", "Ljava/io/File;", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "(Ljava/io/File;Lcom/datadog/android/api/InternalLogger;)V", "getInternalLogger$dd_sdk_android_rum_release", "()Lcom/datadog/android/api/InternalLogger;", "getStatusFile$dd_sdk_android_rum_release", "()Ljava/io/File;", "readVitalData", "", "()Ljava/lang/Double;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class MemoryVitalReader implements VitalReader {
    private static final int BYTES_IN_KB = 1000;
    private final InternalLogger internalLogger;
    private final File statusFile;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String STATUS_PATH = "/proc/self/status";
    private static final File STATUS_FILE = new File(STATUS_PATH);
    private static final String VM_RSS_PATTERN = "VmRSS:\\s+(\\d+) kB";
    private static final pxc VM_RSS_REGEX = new pxc(VM_RSS_PATTERN);

    public MemoryVitalReader(File file, InternalLogger internalLogger) {
        file.getClass();
        internalLogger.getClass();
        this.statusFile = file;
        this.internalLogger = internalLogger;
    }

    /* JADX INFO: renamed from: getInternalLogger$dd_sdk_android_rum_release, reason: from getter */
    public final InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    /* JADX INFO: renamed from: getStatusFile$dd_sdk_android_rum_release, reason: from getter */
    public final File getStatusFile() {
        return this.statusFile;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    @Override // com.datadog.android.rum.internal.vitals.VitalReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Double readVitalData() {
        /*
            r5 = this;
            java.io.File r0 = r5.statusFile
            com.datadog.android.api.InternalLogger r1 = r5.internalLogger
            boolean r0 = com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(r0, r1)
            r1 = 0
            if (r0 == 0) goto L72
            java.io.File r0 = r5.statusFile
            com.datadog.android.api.InternalLogger r2 = r5.internalLogger
            boolean r0 = com.datadog.android.core.internal.persistence.file.FileExtKt.canReadSafe(r0, r2)
            if (r0 != 0) goto L16
            goto L72
        L16:
            java.io.File r0 = r5.statusFile
            com.datadog.android.api.InternalLogger r5 = r5.internalLogger
            r2 = 1
            java.util.List r5 = com.datadog.android.core.internal.persistence.file.FileExtKt.readLinesSafe$default(r0, r1, r5, r2, r1)
            if (r5 == 0) goto L5f
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L2c:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L52
            java.lang.Object r3 = r5.next()
            java.lang.String r3 = (java.lang.String) r3
            pxc r4 = com.datadog.android.rum.internal.vitals.MemoryVitalReader.VM_RSS_REGEX
            ke9 r3 = r4.c(r3)
            if (r3 == 0) goto L4b
            java.util.List r3 = r3.a()
            java.lang.Object r3 = defpackage.z92.R0(r2, r3)
            java.lang.String r3 = (java.lang.String) r3
            goto L4c
        L4b:
            r3 = r1
        L4c:
            if (r3 == 0) goto L2c
            r0.add(r3)
            goto L2c
        L52:
            java.lang.Object r5 = defpackage.z92.Q0(r0)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L5f
            java.lang.Double r5 = defpackage.vve.A(r5)
            goto L60
        L5f:
            r5 = r1
        L60:
            if (r5 != 0) goto L63
            goto L72
        L63:
            double r0 = r5.doubleValue()
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 * r2
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            return r5
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.vitals.MemoryVitalReader.readVitalData():java.lang.Double");
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/MemoryVitalReader$Companion;", "", "<init>", "()V", "Ljava/io/File;", "STATUS_FILE", "Ljava/io/File;", "getSTATUS_FILE$dd_sdk_android_rum_release", "()Ljava/io/File;", "", "BYTES_IN_KB", "I", "", "STATUS_PATH", "Ljava/lang/String;", "VM_RSS_PATTERN", "Lpxc;", "VM_RSS_REGEX", "Lpxc;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final File getSTATUS_FILE$dd_sdk_android_rum_release() {
            return MemoryVitalReader.STATUS_FILE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MemoryVitalReader(File file, InternalLogger internalLogger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? STATUS_FILE : file, internalLogger);
    }
}
