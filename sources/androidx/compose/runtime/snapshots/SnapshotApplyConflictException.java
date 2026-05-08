package androidx.compose.runtime.snapshots;

import defpackage.d4a;
import defpackage.wle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotApplyConflictException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lwle;", "snapshot", "Lwle;", "getSnapshot", "()Lwle;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SnapshotApplyConflictException extends Exception {
    private final wle snapshot;

    public SnapshotApplyConflictException(d4a d4aVar) {
        this.snapshot = d4aVar;
    }
}
