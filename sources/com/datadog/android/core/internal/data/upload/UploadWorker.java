package com.datadog.android.core.internal.data.upload;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.datadog.android.Datadog;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.feature.FeatureScope;
import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.NoOpInternalSdkCore;
import com.datadog.android.core.internal.SdkFeature;
import com.datadog.android.core.internal.data.upload.UploadStatus;
import com.datadog.android.core.internal.metrics.RemovalReason;
import com.datadog.android.core.internal.persistence.BatchData;
import com.datadog.android.core.internal.persistence.BatchId;
import com.datadog.android.core.internal.persistence.Storage;
import com.datadog.android.core.internal.utils.RuntimeUtilsKt;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.z92;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "()Landroidx/work/c$a;", "Companion", "UploadNextBatchTask", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class UploadWorker extends Worker {
    public static final String DATADOG_INSTANCE_NAME = "_dd.sdk.instanceName";
    public static final String MESSAGE_NOT_INITIALIZED = "Datadog has not been initialized.";

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ?\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadWorker$UploadNextBatchTask;", "Ljava/lang/Runnable;", "Ljava/util/Queue;", "taskQueue", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "Lcom/datadog/android/core/internal/SdkFeature;", "feature", "<init>", "(Ljava/util/Queue;Lcom/datadog/android/core/InternalSdkCore;Lcom/datadog/android/core/internal/SdkFeature;)V", "Lcom/datadog/android/core/internal/persistence/BatchId;", "batchId", "Lcom/datadog/android/api/context/DatadogContext;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "", "Lcom/datadog/android/api/storage/RawBatchEvent;", "batch", "", "batchMeta", "Lcom/datadog/android/core/internal/data/upload/DataUploader;", "uploader", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "consumeBatch", "(Lcom/datadog/android/core/internal/persistence/BatchId;Lcom/datadog/android/api/context/DatadogContext;Ljava/util/List;[BLcom/datadog/android/core/internal/data/upload/DataUploader;)Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "Lj6g;", "run", "()V", "Ljava/util/Queue;", "Lcom/datadog/android/core/InternalSdkCore;", "Lcom/datadog/android/core/internal/SdkFeature;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class UploadNextBatchTask implements Runnable {
        private final SdkFeature feature;
        private final InternalSdkCore sdkCore;
        private final Queue<UploadNextBatchTask> taskQueue;

        public UploadNextBatchTask(Queue<UploadNextBatchTask> queue, InternalSdkCore internalSdkCore, SdkFeature sdkFeature) {
            queue.getClass();
            internalSdkCore.getClass();
            sdkFeature.getClass();
            this.taskQueue = queue;
            this.sdkCore = internalSdkCore;
            this.feature = sdkFeature;
        }

        private final UploadStatus consumeBatch(BatchId batchId, DatadogContext context, List<RawBatchEvent> batch, byte[] batchMeta, DataUploader uploader) {
            return uploader.upload(context, batch, batchMeta, batchId);
        }

        @Override // java.lang.Runnable
        public void run() {
            DatadogContext datadogContext = this.sdkCore.getDatadogContext();
            if (datadogContext == null) {
                return;
            }
            Storage storage = this.feature.getStorage();
            DataUploader uploader = this.feature.getUploader();
            BatchData nextBatch = storage.readNextBatch();
            if (nextBatch != null) {
                UploadStatus uploadStatusConsumeBatch = consumeBatch(nextBatch.getId(), datadogContext, nextBatch.getData(), nextBatch.getMetadata(), uploader);
                storage.confirmBatchRead(nextBatch.getId(), new RemovalReason.IntakeCode(uploadStatusConsumeBatch.getCode()), !uploadStatusConsumeBatch.getShouldRetry());
                if (uploadStatusConsumeBatch instanceof UploadStatus.Success) {
                    Queue<UploadNextBatchTask> queue = this.taskQueue;
                    queue.offer(new UploadNextBatchTask(queue, this.sdkCore, this.feature));
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public c.a doWork() {
        Object obj = getInputData().a.get(DATADOG_INSTANCE_NAME);
        SdkCore datadog = Datadog.getInstance(obj instanceof String ? (String) obj : null);
        InternalSdkCore internalSdkCore = datadog instanceof InternalSdkCore ? (InternalSdkCore) datadog : null;
        if (internalSdkCore == null || (internalSdkCore instanceof NoOpInternalSdkCore)) {
            InternalLogger.DefaultImpls.log$default(RuntimeUtilsKt.getUnboundInternalLogger(), InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) AnonymousClass1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            return new c.a.C0079c();
        }
        List<FeatureScope> allFeatures = internalSdkCore.getAllFeatures();
        ArrayList arrayList = new ArrayList();
        for (FeatureScope featureScope : allFeatures) {
            SdkFeature sdkFeature = featureScope instanceof SdkFeature ? (SdkFeature) featureScope : null;
            if (sdkFeature != null) {
                arrayList.add(sdkFeature);
            }
        }
        List listC1 = z92.C1(arrayList);
        Collections.shuffle(listC1);
        LinkedList linkedList = new LinkedList();
        Iterator it = listC1.iterator();
        while (it.hasNext()) {
            linkedList.offer(new UploadNextBatchTask(linkedList, internalSdkCore, (SdkFeature) it.next()));
        }
        while (!linkedList.isEmpty()) {
            UploadNextBatchTask uploadNextBatchTask = (UploadNextBatchTask) linkedList.poll();
            if (uploadNextBatchTask != null) {
                uploadNextBatchTask.run();
            }
        }
        return new c.a.C0079c();
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.data.upload.UploadWorker$doWork$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return UploadWorker.MESSAGE_NOT_INITIALIZED;
        }
    }
}
