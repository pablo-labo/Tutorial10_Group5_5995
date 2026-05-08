package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.indeed.android.jobsearch.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lped;", "Ll1g;", "<init>", "()V", "rnmessaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ped extends l1g {
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.rn_selected_conversation_fragment, viewGroup, false);
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // defpackage.l1g, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        zv8 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        u63.Y(hh1.A(viewLifecycleOwner), null, null, new oed(this, null), 3);
        Bundle arguments = getArguments();
        ija ijaVar = new ija();
        Bundle bundle2 = new Bundle();
        bundle2.putString("arg_component_name", "SelectedConversation");
        bundle2.putBundle("arg_launch_options", arguments);
        bundle2.putBoolean("arg_fabric_enabled", false);
        ijaVar.setArguments(bundle2);
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        a aVar = new a(childFragmentManager);
        aVar.d(R.id.rn_selected_conversation_container, ijaVar, null, 1);
        aVar.h(false);
    }

    @Override // defpackage.l1g
    public final boolean tryHandleBackNavigation() {
        return false;
    }
}
