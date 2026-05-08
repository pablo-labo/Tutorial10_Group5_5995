package defpackage;

import androidx.compose.runtime.b;
import androidx.navigation.d;
import defpackage.n44;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class i44 extends mj8 implements Function2<b, Integer, j6g> {
    final /* synthetic */ d $backStackEntry;
    final /* synthetic */ n44.a $destination;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i44(n44.a aVar, d dVar) {
        super(2);
        this.$destination = aVar;
        this.$backStackEntry = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        if ((num.intValue() & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            this.$destination.b0.q(this.$backStackEntry, bVar2, 0);
        }
        return j6g.a;
    }
}
