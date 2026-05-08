package defpackage;

import androidx.compose.runtime.snapshots.SnapshotApplyConflictException;

/* JADX INFO: loaded from: classes.dex */
public abstract class xle {

    public static final class a extends xle {
        public final d4a a;

        public a(d4a d4aVar) {
            this.a = d4aVar;
        }

        @Override // defpackage.xle
        public final void a() throws SnapshotApplyConflictException {
            d4a d4aVar = this.a;
            d4aVar.c();
            throw new SnapshotApplyConflictException(d4aVar);
        }
    }

    public static final class b extends xle {
        public static final b a = new b();

        @Override // defpackage.xle
        public final void a() {
        }
    }

    public abstract void a();
}
