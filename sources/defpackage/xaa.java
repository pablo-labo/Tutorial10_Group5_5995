package defpackage;

import androidx.navigation.e;
import androidx.navigation.k;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xaa extends mj8 implements Function1<k, Boolean> {
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xaa(e eVar) {
        super(1);
        this.this$0 = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(k kVar) {
        kVar.getClass();
        return Boolean.valueOf(!this.this$0.m.containsKey(Integer.valueOf(r1.W)));
    }
}
