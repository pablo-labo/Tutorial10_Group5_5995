package com.datadog.android.core.internal.persistence.file.advanced;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.FileMover;
import com.datadog.android.core.internal.persistence.file.FileOrchestrator;
import com.datadog.android.privacy.TrackingConsent;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.u63;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0012\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/advanced/ConsentAwareFileMigrator;", "Lcom/datadog/android/core/internal/persistence/file/advanced/DataMigrator;", "Lcom/datadog/android/privacy/TrackingConsent;", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "fileMover", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/core/internal/persistence/file/FileMover;Lcom/datadog/android/api/InternalLogger;)V", "previousState", "newState", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "previousFileOrchestrator", "newFileOrchestrator", "Lcom/datadog/android/core/internal/persistence/file/advanced/DataMigrationOperation;", "resolveMigrationOperation", "(Lcom/datadog/android/privacy/TrackingConsent;Lcom/datadog/android/privacy/TrackingConsent;Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;)Lcom/datadog/android/core/internal/persistence/file/advanced/DataMigrationOperation;", "Lj6g;", "migrateData", "(Lcom/datadog/android/privacy/TrackingConsent;Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;Lcom/datadog/android/privacy/TrackingConsent;Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;)V", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "Lcom/datadog/android/api/InternalLogger;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class ConsentAwareFileMigrator implements DataMigrator<TrackingConsent> {
    private final FileMover fileMover;
    private final InternalLogger internalLogger;

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.advanced.ConsentAwareFileMigrator$resolveMigrationOperation$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ TrackingConsent $newState;
        final /* synthetic */ TrackingConsent $previousState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TrackingConsent trackingConsent, TrackingConsent trackingConsent2) {
            super(0);
            this.$previousState = trackingConsent;
            this.$newState = trackingConsent2;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Unexpected consent migration from " + this.$previousState + " to " + this.$newState;
        }
    }

    public ConsentAwareFileMigrator(FileMover fileMover, InternalLogger internalLogger) {
        fileMover.getClass();
        internalLogger.getClass();
        this.fileMover = fileMover;
        this.internalLogger = internalLogger;
    }

    private final DataMigrationOperation resolveMigrationOperation(TrackingConsent previousState, TrackingConsent newState, FileOrchestrator previousFileOrchestrator, FileOrchestrator newFileOrchestrator) {
        boolean zEquals;
        Pair pair = new Pair(previousState, newState);
        TrackingConsent trackingConsent = TrackingConsent.PENDING;
        if (pair.equals(new Pair(null, trackingConsent)) ? true : pair.equals(new Pair(null, TrackingConsent.GRANTED)) ? true : pair.equals(new Pair(null, TrackingConsent.NOT_GRANTED)) ? true : pair.equals(new Pair(trackingConsent, TrackingConsent.NOT_GRANTED))) {
            return new WipeDataMigrationOperation(previousFileOrchestrator.getRootDir(), this.fileMover, this.internalLogger);
        }
        TrackingConsent trackingConsent2 = TrackingConsent.GRANTED;
        if (pair.equals(new Pair(trackingConsent2, trackingConsent)) ? true : pair.equals(new Pair(TrackingConsent.NOT_GRANTED, trackingConsent))) {
            return new WipeDataMigrationOperation(newFileOrchestrator.getRootDir(), this.fileMover, this.internalLogger);
        }
        if (pair.equals(new Pair(trackingConsent, trackingConsent2))) {
            return new MoveDataMigrationOperation(previousFileOrchestrator.getRootDir(), newFileOrchestrator.getRootDir(), this.fileMover, this.internalLogger);
        }
        if (pair.equals(new Pair(trackingConsent, trackingConsent)) ? true : pair.equals(new Pair(trackingConsent2, trackingConsent2)) ? true : pair.equals(new Pair(trackingConsent2, TrackingConsent.NOT_GRANTED))) {
            zEquals = true;
        } else {
            TrackingConsent trackingConsent3 = TrackingConsent.NOT_GRANTED;
            zEquals = pair.equals(new Pair(trackingConsent3, trackingConsent3));
        }
        if (zEquals ? true : pair.equals(new Pair(TrackingConsent.NOT_GRANTED, trackingConsent2))) {
            return new NoOpDataMigrationOperation();
        }
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new AnonymousClass1(previousState, newState), (Throwable) null, false, (Map) null, 56, (Object) null);
        return new NoOpDataMigrationOperation();
    }

    @Override // com.datadog.android.core.internal.persistence.file.advanced.DataMigrator
    public void migrateData(TrackingConsent previousState, FileOrchestrator previousFileOrchestrator, TrackingConsent newState, FileOrchestrator newFileOrchestrator) {
        previousFileOrchestrator.getClass();
        newState.getClass();
        newFileOrchestrator.getClass();
        resolveMigrationOperation(previousState, newState, previousFileOrchestrator, newFileOrchestrator).run();
    }
}
