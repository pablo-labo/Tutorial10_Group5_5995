package com.datadog.android.core.internal.persistence.file;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.security.Encryption;
import defpackage.gu5;
import defpackage.mj8;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0011H\u0017R\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/EncryptedFileReaderWriter;", "Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;", "encryption", "Lcom/datadog/android/security/Encryption;", "delegate", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "(Lcom/datadog/android/security/Encryption;Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;Lcom/datadog/android/api/InternalLogger;)V", "getDelegate$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;", "getEncryption$dd_sdk_android_core_release", "()Lcom/datadog/android/security/Encryption;", "readData", "", "file", "Ljava/io/File;", "writeData", "", "data", "append", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class EncryptedFileReaderWriter implements FileReaderWriter {
    public static final String APPEND_MODE_NOT_SUPPORTED_MESSAGE = "Append mode is not supported, use EncryptedBatchFileReaderWriter instead.";
    public static final String BAD_ENCRYPTION_RESULT_MESSAGE = "Encryption of non-empty data produced empty result, aborting write operation.";
    private final FileReaderWriter delegate;
    private final Encryption encryption;
    private final InternalLogger internalLogger;

    public EncryptedFileReaderWriter(Encryption encryption, FileReaderWriter fileReaderWriter, InternalLogger internalLogger) {
        encryption.getClass();
        fileReaderWriter.getClass();
        internalLogger.getClass();
        this.encryption = encryption;
        this.delegate = fileReaderWriter;
        this.internalLogger = internalLogger;
    }

    /* JADX INFO: renamed from: getDelegate$dd_sdk_android_core_release, reason: from getter */
    public final FileReaderWriter getDelegate() {
        return this.delegate;
    }

    /* JADX INFO: renamed from: getEncryption$dd_sdk_android_core_release, reason: from getter */
    public final Encryption getEncryption() {
        return this.encryption;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileReader
    public byte[] readData(File file) {
        file.getClass();
        return this.encryption.decrypt(this.delegate.readData(file));
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileWriter
    public boolean writeData(File file, byte[] data, boolean append) {
        file.getClass();
        data.getClass();
        if (append) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) AnonymousClass1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            return false;
        }
        byte[] bArrEncrypt = this.encryption.encrypt(data);
        if ((data.length == 0) || bArrEncrypt.length != 0) {
            return this.delegate.writeData(file, bArrEncrypt, append);
        }
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) AnonymousClass2.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        return false;
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.EncryptedFileReaderWriter$writeData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return EncryptedFileReaderWriter.APPEND_MODE_NOT_SUPPORTED_MESSAGE;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.EncryptedFileReaderWriter$writeData$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Encryption of non-empty data produced empty result, aborting write operation.";
        }
    }
}
