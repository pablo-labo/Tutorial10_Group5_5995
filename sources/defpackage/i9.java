package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class i9 extends mj8 implements Function1<m74, l74> {
    final /* synthetic */ c9 $activityResultRegistry;
    final /* synthetic */ o8<Object, Object> $contract;
    final /* synthetic */ ese<Function1<Object, j6g>> $currentOnResult;
    final /* synthetic */ String $key;
    final /* synthetic */ a9<Object> $realLauncher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(a9 a9Var, c9 c9Var, String str, o8 o8Var, g4a g4aVar) {
        super(1);
        this.$realLauncher = a9Var;
        this.$activityResultRegistry = c9Var;
        this.$key = str;
        this.$contract = o8Var;
        this.$currentOnResult = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final l74 invoke(m74 m74Var) {
        this.$realLauncher.a = this.$activityResultRegistry.d(this.$key, this.$contract, new g9(this.$currentOnResult, 0));
        return new h9(this.$realLauncher);
    }
}
