package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class di3 extends mj8 implements Function1<Integer, Object> {
    final /* synthetic */ Function1 $contentType;
    final /* synthetic */ List $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di3(List list, Function1 function1) {
        super(1);
        this.$contentType = function1;
        this.$items = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        return this.$contentType.invoke(this.$items.get(num.intValue()));
    }
}
