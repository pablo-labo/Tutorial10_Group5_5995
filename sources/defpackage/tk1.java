package defpackage;

import androidx.navigation.d;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class tk1 extends mj8 implements Function1<d, j6g> {
    final /* synthetic */ ese<Set<d>> $transitionsInProgressEntries$delegate;
    final /* synthetic */ pk1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk1(pk1 pk1Var, g4a g4aVar) {
        super(1);
        this.this$0 = pk1Var;
        this.$transitionsInProgressEntries$delegate = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(d dVar) {
        d dVar2 = dVar;
        boolean zContains = this.$transitionsInProgressEntries$delegate.getValue().contains(dVar2);
        pk1 pk1Var = this.this$0;
        if (zContains) {
            pk1Var.b().b(dVar2);
        } else {
            pk1Var.b().d(dVar2, false);
        }
        return j6g.a;
    }
}
