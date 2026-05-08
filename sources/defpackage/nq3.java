package defpackage;

import android.view.View;
import defpackage.epg;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class nq3 extends mj8 implements Function1<Map.Entry<String, View>, Boolean> {
    final /* synthetic */ Collection<String> $names;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq3(Collection<String> collection) {
        super(1);
        this.$names = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Map.Entry<String, View> entry) {
        Map.Entry<String, View> entry2 = entry;
        entry2.getClass();
        Collection<String> collection = this.$names;
        View value = entry2.getValue();
        WeakHashMap<View, prg> weakHashMap = epg.a;
        return Boolean.valueOf(z92.I0(collection, epg.d.f(value)));
    }
}
