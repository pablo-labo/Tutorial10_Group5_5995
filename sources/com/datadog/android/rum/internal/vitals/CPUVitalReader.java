package com.datadog.android.rum.internal.vitals;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.FileExtKt;
import defpackage.vve;
import defpackage.zve;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000f\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/CPUVitalReader;", "Lcom/datadog/android/rum/internal/vitals/VitalReader;", "statFile", "Ljava/io/File;", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "(Ljava/io/File;Lcom/datadog/android/api/InternalLogger;)V", "getInternalLogger$dd_sdk_android_rum_release", "()Lcom/datadog/android/api/InternalLogger;", "getStatFile$dd_sdk_android_rum_release", "()Ljava/io/File;", "readVitalData", "", "()Ljava/lang/Double;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class CPUVitalReader implements VitalReader {
    private static final int UTIME_IDX = 13;
    private final InternalLogger internalLogger;
    private final File statFile;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String STAT_PATH = "/proc/self/stat";
    private static final File STAT_FILE = new File(STAT_PATH);

    public CPUVitalReader(File file, InternalLogger internalLogger) {
        file.getClass();
        internalLogger.getClass();
        this.statFile = file;
        this.internalLogger = internalLogger;
    }

    /* JADX INFO: renamed from: getInternalLogger$dd_sdk_android_rum_release, reason: from getter */
    public final InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    /* JADX INFO: renamed from: getStatFile$dd_sdk_android_rum_release, reason: from getter */
    public final File getStatFile() {
        return this.statFile;
    }

    @Override // com.datadog.android.rum.internal.vitals.VitalReader
    public Double readVitalData() {
        String textSafe$default;
        if (FileExtKt.existsSafe(this.statFile, this.internalLogger) && FileExtKt.canReadSafe(this.statFile, this.internalLogger) && (textSafe$default = FileExtKt.readTextSafe$default(this.statFile, null, this.internalLogger, 1, null)) != null) {
            List listJ0 = zve.j0(textSafe$default, new char[]{' '});
            if (listJ0.size() > UTIME_IDX) {
                return vve.A((String) listJ0.get(UTIME_IDX));
            }
        }
        return null;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/CPUVitalReader$Companion;", "", "()V", "STAT_FILE", "Ljava/io/File;", "getSTAT_FILE$dd_sdk_android_rum_release", "()Ljava/io/File;", "STAT_PATH", "", "UTIME_IDX", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final File getSTAT_FILE$dd_sdk_android_rum_release() {
            return CPUVitalReader.STAT_FILE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CPUVitalReader(File file, InternalLogger internalLogger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? STAT_FILE : file, internalLogger);
    }
}
