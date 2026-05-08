package com.datadog.android.ndk.internal;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.UserInfo;
import com.datadog.android.core.internal.persistence.file.FileMover;
import com.datadog.android.core.internal.persistence.file.FilePersistenceConfig;
import com.datadog.android.core.internal.persistence.file.FileWriter;
import com.datadog.android.core.internal.persistence.file.advanced.ConsentAwareFileMigrator;
import com.datadog.android.core.internal.persistence.file.advanced.ConsentAwareFileOrchestrator;
import com.datadog.android.core.internal.persistence.file.single.SingleFileOrchestrator;
import com.datadog.android.core.internal.persistence.file.single.SingleItemDataWriter;
import com.datadog.android.core.internal.privacy.ConsentProvider;
import com.datadog.android.core.internal.user.UserInfoSerializer;
import com.datadog.android.ndk.internal.DatadogNdkCrashHandler;
import java.io.File;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/datadog/android/ndk/internal/NdkUserInfoDataWriter;", "Lcom/datadog/android/core/internal/persistence/file/single/SingleItemDataWriter;", "Lcom/datadog/android/api/context/UserInfo;", "storageDir", "Ljava/io/File;", "consentProvider", "Lcom/datadog/android/core/internal/privacy/ConsentProvider;", "executorService", "Ljava/util/concurrent/ExecutorService;", "fileWriter", "Lcom/datadog/android/core/internal/persistence/file/FileWriter;", "", "fileMover", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "filePersistenceConfig", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "(Ljava/io/File;Lcom/datadog/android/core/internal/privacy/ConsentProvider;Ljava/util/concurrent/ExecutorService;Lcom/datadog/android/core/internal/persistence/file/FileWriter;Lcom/datadog/android/core/internal/persistence/file/FileMover;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;)V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NdkUserInfoDataWriter extends SingleItemDataWriter<UserInfo> {
    /* JADX WARN: Illegal instructions before constructor call */
    public NdkUserInfoDataWriter(File file, ConsentProvider consentProvider, ExecutorService executorService, FileWriter<byte[]> fileWriter, FileMover fileMover, InternalLogger internalLogger, FilePersistenceConfig filePersistenceConfig) {
        file.getClass();
        consentProvider.getClass();
        executorService.getClass();
        fileWriter.getClass();
        fileMover.getClass();
        internalLogger.getClass();
        filePersistenceConfig.getClass();
        DatadogNdkCrashHandler.Companion companion = DatadogNdkCrashHandler.INSTANCE;
        super(new ConsentAwareFileOrchestrator(consentProvider, new SingleFileOrchestrator(companion.getPendingUserInfoFile$dd_sdk_android_core_release(file), internalLogger), new SingleFileOrchestrator(companion.getGrantedUserInfoFile$dd_sdk_android_core_release(file), internalLogger), new ConsentAwareFileMigrator(fileMover, internalLogger), executorService, internalLogger), new UserInfoSerializer(), fileWriter, internalLogger, filePersistenceConfig);
    }
}
