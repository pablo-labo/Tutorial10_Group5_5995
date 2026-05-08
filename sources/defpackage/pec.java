package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.indeed.android.jobsearch.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpec;", "Ll1g;", "<init>", "()V", "reactnative_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class pec extends l1g {
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.rn_tare_debug_fragment, viewGroup, false);
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        a aVar = new a(childFragmentManager);
        List<Fragment> listF = getChildFragmentManager().c.f();
        listF.getClass();
        Iterator<T> it = listF.iterator();
        while (it.hasNext()) {
            aVar.l((Fragment) it.next());
        }
        aVar.h(true);
        super.onDestroyView();
    }

    @Override // defpackage.l1g, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ija ijaVar = new ija();
        Bundle bundle2 = new Bundle();
        bundle2.putString("arg_component_name", "JSTPushAuthorizationDebug");
        bundle2.putBundle("arg_launch_options", null);
        bundle2.putBoolean("arg_fabric_enabled", false);
        ijaVar.setArguments(bundle2);
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        a aVar = new a(childFragmentManager);
        aVar.d(R.id.rn_tare_debug_container, ijaVar, null, 1);
        aVar.h(false);
    }

    @Override // defpackage.l1g
    public final boolean tryHandleBackNavigation() {
        return false;
    }
}
