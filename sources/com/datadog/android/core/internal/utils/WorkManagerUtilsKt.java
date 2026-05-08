package com.datadog.android.core.internal.utils;

import android.content.Context;
import androidx.work.b;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.data.upload.UploadWorker;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.a2h;
import defpackage.dha;
import defpackage.fsa;
import defpackage.gu5;
import defpackage.jq2;
import defpackage.jw1;
import defpackage.mj8;
import defpackage.q25;
import defpackage.u63;
import defpackage.w2h;
import defpackage.z92;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\b\"\u0014\u0010\n\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\f\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u000b\"\u0014\u0010\r\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b\"\u0014\u0010\u0011\u001a\u00020\u00108\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "", "instanceName", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lj6g;", "cancelUploadWorker", "(Landroid/content/Context;Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;)V", "triggerUploadWorker", "CANCEL_ERROR_MESSAGE", "Ljava/lang/String;", "SETUP_ERROR_MESSAGE", "UPLOAD_WORKER_WAS_SCHEDULED", "UPLOAD_WORKER_NAME", "TAG_DATADOG_UPLOAD", "", "DELAY_MS", "J", "dd-sdk-android-core_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class WorkManagerUtilsKt {
    public static final String CANCEL_ERROR_MESSAGE = "Error cancelling the UploadWorker";
    public static final long DELAY_MS = 5000;
    public static final String SETUP_ERROR_MESSAGE = "Error while trying to setup the UploadWorker";
    public static final String TAG_DATADOG_UPLOAD = "DatadogBackgroundUpload";
    public static final String UPLOAD_WORKER_NAME = "DatadogUploadWorker";
    public static final String UPLOAD_WORKER_WAS_SCHEDULED = "UploadWorker was scheduled.";

    public static final void cancelUploadWorker(Context context, String str, InternalLogger internalLogger) {
        context.getClass();
        str.getClass();
        internalLogger.getClass();
        try {
            w2h w2hVarA = w2h.a(context);
            w2hVarA.getClass();
            w2hVarA.d.a(new jw1(w2hVarA, "DatadogBackgroundUpload/".concat(str)));
        } catch (IllegalStateException e) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) AnonymousClass1.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
        }
    }

    public static final void triggerUploadWorker(Context context, String str, InternalLogger internalLogger) throws Throwable {
        context.getClass();
        str.getClass();
        internalLogger.getClass();
        try {
            w2h w2hVarA = w2h.a(context);
            w2hVarA.getClass();
            jq2 jq2Var = new jq2(dha.d, false, false, false, false, -1L, -1L, z92.E1(new LinkedHashSet()));
            fsa.a aVar = new fsa.a(UploadWorker.class);
            aVar.b.j = jq2Var;
            aVar.c.add("DatadogBackgroundUpload/".concat(str));
            TimeUnit.MILLISECONDS.getClass();
            aVar.b.g = 5000L;
            if (Long.MAX_VALUE - System.currentTimeMillis() <= aVar.b.g) {
                throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
            }
            HashMap map = new HashMap();
            map.put(UploadWorker.DATADOG_INSTANCE_NAME, str);
            b bVar = new b(map);
            b.b(bVar);
            aVar.b.e = bVar;
            new a2h(w2hVarA, UPLOAD_WORKER_NAME, q25.a, Collections.singletonList(aVar.a())).R();
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.INFO, InternalLogger.Target.MAINTAINER, (gu5) C05561.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        } catch (Exception e) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) AnonymousClass2.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.utils.WorkManagerUtilsKt$cancelUploadWorker$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return WorkManagerUtilsKt.CANCEL_ERROR_MESSAGE;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.utils.WorkManagerUtilsKt$triggerUploadWorker$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05561 extends mj8 implements gu5<String> {
        public static final C05561 INSTANCE = new C05561();

        public C05561() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return WorkManagerUtilsKt.UPLOAD_WORKER_WAS_SCHEDULED;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.utils.WorkManagerUtilsKt$triggerUploadWorker$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return WorkManagerUtilsKt.SETUP_ERROR_MESSAGE;
        }
    }
}
