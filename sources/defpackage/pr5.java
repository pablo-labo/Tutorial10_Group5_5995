package defpackage;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.fragment.a;

/* JADX INFO: loaded from: classes.dex */
public final class pr5 extends mj8 implements gu5<j6g> {
    final /* synthetic */ d $entry;
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ nea $state;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr5(d dVar, e.a aVar, a aVar2, Fragment fragment) {
        super(0);
        this.$entry = dVar;
        this.$state = aVar;
        this.this$0 = aVar2;
        this.$fragment = fragment;
    }

    @Override // defpackage.gu5
    public final j6g invoke() {
        nea neaVar = this.$state;
        a aVar = this.this$0;
        Fragment fragment = this.$fragment;
        for (d dVar : (Iterable) neaVar.f.a.getValue()) {
            aVar.getClass();
            if (a.n()) {
                Log.v("FragmentNavigator", "Marking transition complete for entry " + dVar + " due to fragment " + fragment + " viewmodel being cleared");
            }
            neaVar.b(dVar);
        }
        return j6g.a;
    }
}
