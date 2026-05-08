package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class h44 extends mj8 implements Function1<m74, l74> {
    final /* synthetic */ d $backStackEntry;
    final /* synthetic */ n44 $dialogNavigator;
    final /* synthetic */ SnapshotStateList<d> $dialogsToDispose;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h44(n44 n44Var, SnapshotStateList snapshotStateList, d dVar) {
        super(1);
        this.$dialogsToDispose = snapshotStateList;
        this.$backStackEntry = dVar;
        this.$dialogNavigator = n44Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final l74 invoke(m74 m74Var) {
        this.$dialogsToDispose.add(this.$backStackEntry);
        return new g44(this.$dialogNavigator, this.$dialogsToDispose, this.$backStackEntry);
    }
}
