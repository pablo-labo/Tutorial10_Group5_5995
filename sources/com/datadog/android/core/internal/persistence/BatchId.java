package com.datadog.android.core.internal.persistence;

import defpackage.l5;
import defpackage.wl7;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/datadog/android/core/internal/persistence/BatchId;", "", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "matchesFile", "file", "Ljava/io/File;", "toString", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class BatchId {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String id;

    public BatchId(String str) {
        str.getClass();
        this.id = str;
    }

    public static /* synthetic */ BatchId copy$default(BatchId batchId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = batchId.id;
        }
        return batchId.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final BatchId copy(String id) {
        id.getClass();
        return new BatchId(id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BatchId) && wl7.b(this.id, ((BatchId) other).id);
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public final boolean matchesFile(File file) {
        file.getClass();
        return wl7.b(INSTANCE.extractFileId(file), this.id);
    }

    public String toString() {
        return l5.m("BatchId(id=", this.id, ")");
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\f\u0010\u0007\u001a\u00020\b*\u00020\u0006H\u0002¨\u0006\t"}, d2 = {"Lcom/datadog/android/core/internal/persistence/BatchId$Companion;", "", "()V", "fromFile", "Lcom/datadog/android/core/internal/persistence/BatchId;", "file", "Ljava/io/File;", "extractFileId", "", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String extractFileId(File file) {
            String absolutePath = file.getAbsolutePath();
            absolutePath.getClass();
            return absolutePath;
        }

        public final BatchId fromFile(File file) {
            file.getClass();
            return new BatchId(extractFileId(file));
        }

        private Companion() {
        }
    }
}
