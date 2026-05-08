package androidx.paging.compose;

import defpackage.at8;
import defpackage.mj8;
import defpackage.zg;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends mj8 implements Function1<Integer, Object> {
    final /* synthetic */ Function1<Object, Object> $key;
    final /* synthetic */ at8<Object> $this_itemKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zg zgVar, at8 at8Var) {
        super(1);
        this.$key = zgVar;
        this.$this_itemKey = at8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        Object obj;
        int iIntValue = num.intValue();
        if (this.$key != null && (obj = this.$this_itemKey.b().get(iIntValue)) != null) {
            return this.$key.invoke(obj);
        }
        return new PagingPlaceholderKey(iIntValue);
    }
}
