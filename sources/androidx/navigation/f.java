package androidx.navigation;

import android.os.Bundle;
import defpackage.huc;
import defpackage.j6g;
import defpackage.juc;
import defpackage.mj8;
import defpackage.zr4;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class f extends mj8 implements Function1<d, j6g> {
    final /* synthetic */ Bundle $args;
    final /* synthetic */ List<d> $entries;
    final /* synthetic */ juc $lastNavigatedIndex;
    final /* synthetic */ huc $navigated;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(huc hucVar, ArrayList arrayList, juc jucVar, e eVar, Bundle bundle) {
        super(1);
        this.$navigated = hucVar;
        this.$entries = arrayList;
        this.$lastNavigatedIndex = jucVar;
        this.this$0 = eVar;
        this.$args = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(d dVar) {
        List<d> listSubList;
        d dVar2 = dVar;
        dVar2.getClass();
        this.$navigated.element = true;
        int iIndexOf = this.$entries.indexOf(dVar2);
        if (iIndexOf != -1) {
            int i = iIndexOf + 1;
            listSubList = this.$entries.subList(this.$lastNavigatedIndex.element, i);
            this.$lastNavigatedIndex.element = i;
        } else {
            listSubList = zr4.a;
        }
        this.this$0.a(dVar2.b, this.$args, dVar2, listSubList);
        return j6g.a;
    }
}
