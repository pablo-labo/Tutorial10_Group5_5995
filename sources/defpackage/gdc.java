package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.indeed.android.jobsearch.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgdc;", "Ll1g;", "<init>", "()V", "ghostwriter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class gdc extends l1g {
    public ija a;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.ghostwriter_rn_fragment, viewGroup, false);
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // defpackage.l1g, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        ija ijaVar = new ija();
        Bundle bundle2 = new Bundle();
        bundle2.putString("arg_component_name", "GhostwriterApplicationReviewRoot");
        bundle2.putBundle("arg_launch_options", arguments);
        bundle2.putBoolean("arg_fabric_enabled", false);
        ijaVar.setArguments(bundle2);
        this.a = ijaVar;
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        a aVar = new a(childFragmentManager);
        ija ijaVar2 = this.a;
        if (ijaVar2 == null) {
            wl7.g("rnFragment");
            throw null;
        }
        aVar.d(R.id.ghostwriter_rn_fragment_container, ijaVar2, null, 1);
        aVar.h(false);
    }

    @Override // defpackage.l1g
    public final boolean tryHandleBackNavigation() {
        ija ijaVar = this.a;
        if (ijaVar != null) {
            ijaVar.E();
            return true;
        }
        wl7.g("rnFragment");
        throw null;
    }
}
