package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public final class lv5 implements gu5<Collection<kv5>> {
    public final /* synthetic */ TypeSubstitutor a;
    public final /* synthetic */ mv5 b;

    public lv5(mv5 mv5Var, TypeSubstitutor typeSubstitutor) {
        this.b = mv5Var;
        this.a = typeSubstitutor;
    }

    @Override // defpackage.gu5
    public final Collection<kv5> invoke() {
        lke lkeVar = new lke();
        Iterator<? extends kv5> it = this.b.m().iterator();
        while (it.hasNext()) {
            lkeVar.add(it.next().b(this.a));
        }
        return lkeVar;
    }
}
