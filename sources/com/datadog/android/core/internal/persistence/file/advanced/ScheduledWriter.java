package com.datadog.android.core.internal.persistence.file.advanced;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.DataWriter;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import defpackage.kl3;
import defpackage.vb0;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0017¢\u0006\u0004\b\r\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/advanced/ScheduledWriter;", "", "T", "Lcom/datadog/android/core/internal/persistence/DataWriter;", "delegateWriter", "Ljava/util/concurrent/ExecutorService;", "executorService", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/core/internal/persistence/DataWriter;Ljava/util/concurrent/ExecutorService;Lcom/datadog/android/api/InternalLogger;)V", "element", "Lj6g;", "write", "(Ljava/lang/Object;)V", "", "data", "(Ljava/util/List;)V", "Lcom/datadog/android/core/internal/persistence/DataWriter;", "getDelegateWriter$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/DataWriter;", "Ljava/util/concurrent/ExecutorService;", "getExecutorService$dd_sdk_android_core_release", "()Ljava/util/concurrent/ExecutorService;", "Lcom/datadog/android/api/InternalLogger;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class ScheduledWriter<T> implements DataWriter<T> {
    private final DataWriter<T> delegateWriter;
    private final ExecutorService executorService;
    private final InternalLogger internalLogger;

    public ScheduledWriter(DataWriter<T> dataWriter, ExecutorService executorService, InternalLogger internalLogger) {
        dataWriter.getClass();
        executorService.getClass();
        internalLogger.getClass();
        this.delegateWriter = dataWriter;
        this.executorService = executorService;
        this.internalLogger = internalLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write$lambda$0(ScheduledWriter scheduledWriter, Object obj) {
        scheduledWriter.getClass();
        obj.getClass();
        scheduledWriter.delegateWriter.write(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write$lambda$1(ScheduledWriter scheduledWriter, List list) {
        scheduledWriter.getClass();
        list.getClass();
        scheduledWriter.delegateWriter.write(list);
    }

    public final DataWriter<T> getDelegateWriter$dd_sdk_android_core_release() {
        return this.delegateWriter;
    }

    /* JADX INFO: renamed from: getExecutorService$dd_sdk_android_core_release, reason: from getter */
    public final ExecutorService getExecutorService() {
        return this.executorService;
    }

    @Override // com.datadog.android.core.internal.persistence.DataWriter
    public void write(T element) {
        element.getClass();
        ConcurrencyExtKt.submitSafe(this.executorService, "Data writing", this.internalLogger, new kl3(2, this, element));
    }

    @Override // com.datadog.android.core.internal.persistence.DataWriter
    public void write(List<? extends T> data) {
        data.getClass();
        ConcurrencyExtKt.submitSafe(this.executorService, "Data writing", this.internalLogger, new vb0(2, this, data));
    }
}
