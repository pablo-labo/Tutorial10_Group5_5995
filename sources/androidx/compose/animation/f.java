package androidx.compose.animation;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.l74;
import defpackage.m74;
import defpackage.mj8;
import defpackage.zc0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class f extends mj8 implements Function1<m74, l74> {
    final /* synthetic */ SnapshotStateList<Object> $currentlyVisible;
    final /* synthetic */ AnimatedContentTransitionScopeImpl<Object> $rootScope;
    final /* synthetic */ Object $stateForContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SnapshotStateList<Object> snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl) {
        super(1);
        this.$currentlyVisible = snapshotStateList;
        this.$stateForContent = obj;
        this.$rootScope = animatedContentTransitionScopeImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final l74 invoke(m74 m74Var) {
        return new zc0(this.$currentlyVisible, this.$stateForContent, this.$rootScope);
    }
}
