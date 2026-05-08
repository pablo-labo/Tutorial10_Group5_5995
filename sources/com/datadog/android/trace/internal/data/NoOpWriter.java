package com.datadog.android.trace.internal.data;

import defpackage.h5h;
import defpackage.rc3;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0003¨\u0006\r"}, d2 = {"Lcom/datadog/android/trace/internal/data/NoOpWriter;", "Lh5h;", "<init>", "()V", "Lj6g;", "close", "", "Lrc3;", "trace", "write", "(Ljava/util/List;)V", "start", "incrementTraceCount", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpWriter implements h5h {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // defpackage.h5h
    public void incrementTraceCount() {
    }

    @Override // defpackage.h5h
    public void start() {
    }

    @Override // defpackage.h5h
    public void write(List<rc3> trace) {
    }
}
