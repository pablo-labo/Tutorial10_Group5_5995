package com.datadog.android.core.internal.persistence.file.single;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.DataWriter;
import com.datadog.android.core.internal.persistence.file.FileOrchestrator;
import com.datadog.android.core.internal.persistence.file.FilePersistenceConfig;
import com.datadog.android.core.internal.persistence.file.FileWriter;
import com.datadog.android.core.persistence.Serializer;
import com.datadog.android.core.persistence.SerializerKt;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.u63;
import defpackage.z92;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0012\b\u0010\u0018\u0000 0*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u00010B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u001e\u0010\u0014J\u001d\u0010\u001e\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0017¢\u0006\u0004\b\u001e\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u000e\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/single/SingleItemDataWriter;", "", "T", "Lcom/datadog/android/core/internal/persistence/DataWriter;", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "fileOrchestrator", "Lcom/datadog/android/core/persistence/Serializer;", "serializer", "Lcom/datadog/android/core/internal/persistence/file/FileWriter;", "", "fileWriter", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "filePersistenceConfig", "<init>", "(Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;Lcom/datadog/android/core/persistence/Serializer;Lcom/datadog/android/core/internal/persistence/file/FileWriter;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;)V", "data", "Lj6g;", "consume", "(Ljava/lang/Object;)V", "byteArray", "", "writeData", "([B)Z", "", "eventSize", "checkEventSize", "(I)Z", "element", "write", "", "(Ljava/util/List;)V", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "getFileOrchestrator$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "Lcom/datadog/android/core/persistence/Serializer;", "getSerializer$dd_sdk_android_core_release", "()Lcom/datadog/android/core/persistence/Serializer;", "Lcom/datadog/android/core/internal/persistence/file/FileWriter;", "getFileWriter$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileWriter;", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger$dd_sdk_android_core_release", "()Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "getFilePersistenceConfig$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class SingleItemDataWriter<T> implements DataWriter<T> {
    public static final String ERROR_LARGE_DATA = "Can't write data with size %d (max item size is %d)";
    private final FileOrchestrator fileOrchestrator;
    private final FilePersistenceConfig filePersistenceConfig;
    private final FileWriter<byte[]> fileWriter;
    private final InternalLogger internalLogger;
    private final Serializer<T> serializer;

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.single.SingleItemDataWriter$checkEventSize$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ int $eventSize;
        final /* synthetic */ SingleItemDataWriter<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, SingleItemDataWriter<T> singleItemDataWriter) {
            super(0);
            this.$eventSize = i;
            this.this$0 = singleItemDataWriter;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "Can't write data with size %d (max item size is %d)", Arrays.copyOf(new Object[]{Integer.valueOf(this.$eventSize), Long.valueOf(this.this$0.getFilePersistenceConfig().getMaxItemSize())}, 2));
        }
    }

    public SingleItemDataWriter(FileOrchestrator fileOrchestrator, Serializer<T> serializer, FileWriter<byte[]> fileWriter, InternalLogger internalLogger, FilePersistenceConfig filePersistenceConfig) {
        fileOrchestrator.getClass();
        serializer.getClass();
        fileWriter.getClass();
        internalLogger.getClass();
        filePersistenceConfig.getClass();
        this.fileOrchestrator = fileOrchestrator;
        this.serializer = serializer;
        this.fileWriter = fileWriter;
        this.internalLogger = internalLogger;
        this.filePersistenceConfig = filePersistenceConfig;
    }

    private final boolean checkEventSize(int eventSize) {
        if (eventSize <= this.filePersistenceConfig.getMaxItemSize()) {
            return true;
        }
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY), (gu5) new AnonymousClass1(eventSize, this), (Throwable) null, false, (Map) null, 56, (Object) null);
        return false;
    }

    private final void consume(T data) {
        byte[] bArrSerializeToByteArray = SerializerKt.serializeToByteArray(this.serializer, data, this.internalLogger);
        if (bArrSerializeToByteArray == null) {
            return;
        }
        synchronized (this) {
            writeData(bArrSerializeToByteArray);
        }
    }

    private final boolean writeData(byte[] byteArray) {
        File writableFile$default;
        if (checkEventSize(byteArray.length) && (writableFile$default = FileOrchestrator.DefaultImpls.getWritableFile$default(this.fileOrchestrator, false, 1, null)) != null) {
            return this.fileWriter.writeData(writableFile$default, byteArray, false);
        }
        return false;
    }

    /* JADX INFO: renamed from: getFileOrchestrator$dd_sdk_android_core_release, reason: from getter */
    public final FileOrchestrator getFileOrchestrator() {
        return this.fileOrchestrator;
    }

    /* JADX INFO: renamed from: getFilePersistenceConfig$dd_sdk_android_core_release, reason: from getter */
    public final FilePersistenceConfig getFilePersistenceConfig() {
        return this.filePersistenceConfig;
    }

    public final FileWriter<byte[]> getFileWriter$dd_sdk_android_core_release() {
        return this.fileWriter;
    }

    /* JADX INFO: renamed from: getInternalLogger$dd_sdk_android_core_release, reason: from getter */
    public final InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    public final Serializer<T> getSerializer$dd_sdk_android_core_release() {
        return this.serializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.datadog.android.core.internal.persistence.DataWriter
    public void write(List<? extends T> data) {
        data.getClass();
        Object objZ0 = z92.Z0(data);
        if (objZ0 == null) {
            return;
        }
        consume(objZ0);
    }

    @Override // com.datadog.android.core.internal.persistence.DataWriter
    public void write(T element) {
        element.getClass();
        consume(element);
    }
}
