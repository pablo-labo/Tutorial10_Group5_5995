package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.d;

/* JADX INFO: loaded from: classes.dex */
public final class g44 implements l74 {
    public final /* synthetic */ n44 a;
    public final /* synthetic */ d b;
    public final /* synthetic */ SnapshotStateList c;

    public g44(n44 n44Var, SnapshotStateList snapshotStateList, d dVar) {
        this.a = n44Var;
        this.b = dVar;
        this.c = snapshotStateList;
    }

    @Override // defpackage.l74
    public final void dispose() {
        nea neaVarB = this.a.b();
        d dVar = this.b;
        neaVarB.b(dVar);
        this.c.remove(dVar);
    }
}
