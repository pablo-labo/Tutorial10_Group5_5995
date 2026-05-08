package defpackage;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;

/* JADX INFO: loaded from: classes.dex */
public final class zc0 implements l74 {
    public final /* synthetic */ SnapshotStateList a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ AnimatedContentTransitionScopeImpl c;

    public zc0(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        this.a = snapshotStateList;
        this.b = obj;
        this.c = animatedContentTransitionScopeImpl;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.l74
    public final void dispose() {
        SnapshotStateList snapshotStateList = this.a;
        Object obj = this.b;
        snapshotStateList.remove(obj);
        this.c.d.k((S) obj);
    }
}
