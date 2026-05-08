package defpackage;

import androidx.navigation.d;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class sk1 extends mj8 implements Function1<d, j6g> {
    final /* synthetic */ ese<Set<d>> $transitionsInProgressEntries$delegate;
    final /* synthetic */ pk1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk1(pk1 pk1Var, g4a g4aVar) {
        super(1);
        this.this$0 = pk1Var;
        this.$transitionsInProgressEntries$delegate = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(d dVar) {
        Set<d> value = this.$transitionsInProgressEntries$delegate.getValue();
        nea neaVarB = this.this$0.b();
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            neaVarB.b((d) it.next());
        }
        return j6g.a;
    }
}
