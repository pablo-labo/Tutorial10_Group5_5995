package defpackage;

import androidx.fragment.app.Fragment;
import androidx.navigation.d;
import androidx.navigation.fragment.a;
import defpackage.kv8;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class qr5 extends mj8 implements Function1<zv8, j6g> {
    final /* synthetic */ d $entry;
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr5(a aVar, Fragment fragment, d dVar) {
        super(1);
        this.this$0 = aVar;
        this.$fragment = fragment;
        this.$entry = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(zv8 zv8Var) {
        zv8 zv8Var2 = zv8Var;
        ArrayList arrayList = this.this$0.g;
        Fragment fragment = this.$fragment;
        boolean z = false;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (wl7.b(((Pair) it.next()).d(), fragment.getTag())) {
                    z = true;
                    break;
                }
            }
        }
        if (zv8Var2 != null && !z) {
            kv8 lifecycle = this.$fragment.getViewLifecycleOwner().getLifecycle();
            if (lifecycle.b().compareTo(kv8.b.c) >= 0) {
                lifecycle.a((yv8) this.this$0.i.invoke(this.$entry));
            }
        }
        return j6g.a;
    }
}
