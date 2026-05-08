package defpackage;

import androidx.compose.runtime.b;
import androidx.navigation.d;
import androidx.navigation.k;
import defpackage.uk2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class qba extends mj8 implements Function2<b, Integer, j6g> {
    final /* synthetic */ d $currentEntry;
    final /* synthetic */ bd0 $this_AnimatedContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qba(d dVar, bd0 bd0Var) {
        super(2);
        this.$currentEntry = dVar;
        this.$this_AnimatedContent = bd0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        if ((num.intValue() & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            k kVar = this.$currentEntry.b;
            kVar.getClass();
            ((uk2.a) kVar).a0.j(this.$this_AnimatedContent, this.$currentEntry, bVar2, 0);
        }
        return j6g.a;
    }
}
