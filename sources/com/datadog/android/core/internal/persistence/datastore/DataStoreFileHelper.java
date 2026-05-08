package com.datadog.android.core.internal.persistence.datastore;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.FileExtKt;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nJ%\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0002\b\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/datadog/android/core/internal/persistence/datastore/DataStoreFileHelper;", "", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "(Lcom/datadog/android/api/InternalLogger;)V", "getDataStoreDirectory", "Ljava/io/File;", "storageDir", "featureName", "", "getDataStoreDirectory$dd_sdk_android_core_release", "getDataStoreFile", "key", "getDataStoreFile$dd_sdk_android_core_release", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DataStoreFileHelper {
    public static final String DATASTORE_FOLDER_NAME = "datastore_v%s";
    private final InternalLogger internalLogger;

    public DataStoreFileHelper(InternalLogger internalLogger) {
        internalLogger.getClass();
        this.internalLogger = internalLogger;
    }

    public final File getDataStoreDirectory$dd_sdk_android_core_release(File storageDir, String featureName) {
        storageDir.getClass();
        featureName.getClass();
        File file = new File(new File(storageDir, String.format(Locale.US, DATASTORE_FOLDER_NAME, Arrays.copyOf(new Object[]{0}, 1))), featureName);
        if (!FileExtKt.existsSafe(file, this.internalLogger)) {
            FileExtKt.mkdirsSafe(file, this.internalLogger);
        }
        return file;
    }

    public final File getDataStoreFile$dd_sdk_android_core_release(File storageDir, String featureName, String key) {
        storageDir.getClass();
        featureName.getClass();
        key.getClass();
        return new File(getDataStoreDirectory$dd_sdk_android_core_release(storageDir, featureName), key);
    }
}
