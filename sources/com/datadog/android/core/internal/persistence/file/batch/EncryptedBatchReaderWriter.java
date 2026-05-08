package com.datadog.android.core.internal.persistence.file.batch;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.security.Encryption;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.t92;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0012H\u0017R\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/batch/EncryptedBatchReaderWriter;", "Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReaderWriter;", "encryption", "Lcom/datadog/android/security/Encryption;", "delegate", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "(Lcom/datadog/android/security/Encryption;Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReaderWriter;Lcom/datadog/android/api/InternalLogger;)V", "getDelegate$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReaderWriter;", "getEncryption$dd_sdk_android_core_release", "()Lcom/datadog/android/security/Encryption;", "readData", "", "Lcom/datadog/android/api/storage/RawBatchEvent;", "file", "Ljava/io/File;", "writeData", "", "data", "append", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class EncryptedBatchReaderWriter implements BatchFileReaderWriter {
    public static final String BAD_ENCRYPTION_RESULT_MESSAGE = "Encryption of non-empty data produced empty result, aborting write operation.";
    private final BatchFileReaderWriter delegate;
    private final Encryption encryption;
    private final InternalLogger internalLogger;

    public EncryptedBatchReaderWriter(Encryption encryption, BatchFileReaderWriter batchFileReaderWriter, InternalLogger internalLogger) {
        encryption.getClass();
        batchFileReaderWriter.getClass();
        internalLogger.getClass();
        this.encryption = encryption;
        this.delegate = batchFileReaderWriter;
        this.internalLogger = internalLogger;
    }

    /* JADX INFO: renamed from: getDelegate$dd_sdk_android_core_release, reason: from getter */
    public final BatchFileReaderWriter getDelegate() {
        return this.delegate;
    }

    /* JADX INFO: renamed from: getEncryption$dd_sdk_android_core_release, reason: from getter */
    public final Encryption getEncryption() {
        return this.encryption;
    }

    @Override // com.datadog.android.core.internal.persistence.file.batch.BatchFileReader
    public List<RawBatchEvent> readData(File file) {
        file.getClass();
        List<RawBatchEvent> data = this.delegate.readData(file);
        ArrayList arrayList = new ArrayList(t92.r0(data, 10));
        for (RawBatchEvent rawBatchEvent : data) {
            arrayList.add(new RawBatchEvent(!(rawBatchEvent.getData().length == 0) ? this.encryption.decrypt(rawBatchEvent.getData()) : rawBatchEvent.getData(), !(rawBatchEvent.getMetadata().length == 0) ? this.encryption.decrypt(rawBatchEvent.getMetadata()) : rawBatchEvent.getMetadata()));
        }
        return arrayList;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileWriter
    public boolean writeData(File file, RawBatchEvent data, boolean append) {
        file.getClass();
        data.getClass();
        RawBatchEvent rawBatchEvent = new RawBatchEvent(this.encryption.encrypt(data.getData()), this.encryption.encrypt(data.getMetadata()));
        if ((data.getData().length == 0) || rawBatchEvent.getData().length != 0) {
            return this.delegate.writeData(file, rawBatchEvent, append);
        }
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) AnonymousClass1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        return false;
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.batch.EncryptedBatchReaderWriter$writeData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Encryption of non-empty data produced empty result, aborting write operation.";
        }
    }
}
