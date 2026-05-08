package com.indeed.android.rnpathfinder;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.indeed.android.rnpathfinder.props.RNPathfinderProps;
import defpackage.e9a;
import defpackage.ija;
import defpackage.l1g;
import defpackage.lz2;
import defpackage.wl7;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0003R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/indeed/android/rnpathfinder/RNPathfinderFragment;", "Ll1g;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Lj6g;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "tryHandleBackNavigation", "()Z", "onDestroy", "Lija;", "rnFragment", "Lija;", "Companion", "rnpathfinder_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNPathfinderFragment extends l1g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String FRAGMENT_NAME_TAG = "RNPathfinderFragment";
    private static final String TAG = "RNPathfinderFragment";
    private ija rnFragment;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        inflater.getClass();
        View viewInflate = inflater.inflate(R.layout.pathfinder_fragment, container, false);
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = lz2.a;
        Log.d("RNPathfinderFragment", "Destroying RNPathfinderFragment", null);
    }

    @Override // defpackage.l1g, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        view.getClass();
        super.onViewCreated(view, savedInstanceState);
        ArrayList arrayList = lz2.a;
        Log.d("RNPathfinderFragment", "Creating RNPathfinderFragment", null);
        Bundle arguments = getArguments();
        Bundle bundle = arguments != null ? arguments.getBundle("launchOptions") : null;
        ija ijaVar = new ija();
        Bundle bundle2 = new Bundle();
        bundle2.putString("arg_component_name", "Pathfinder");
        bundle2.putBundle("arg_launch_options", bundle);
        bundle2.putBoolean("arg_fabric_enabled", false);
        ijaVar.setArguments(bundle2);
        this.rnFragment = ijaVar;
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        a aVar = new a(childFragmentManager);
        int i = R.id.pathfinder_fragment_container;
        ija ijaVar2 = this.rnFragment;
        if (ijaVar2 == null) {
            wl7.g("rnFragment");
            throw null;
        }
        aVar.d(i, ijaVar2, null, 1);
        aVar.h(false);
    }

    @Override // defpackage.l1g
    public boolean tryHandleBackNavigation() {
        ija ijaVar = this.rnFragment;
        if (ijaVar != null) {
            ijaVar.E();
            return true;
        }
        wl7.g("rnFragment");
        throw null;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/indeed/android/rnpathfinder/RNPathfinderFragment$Companion;", "", "<init>", "()V", "TAG", "", "FRAGMENT_NAME_TAG", "createInstance", "Lcom/indeed/android/rnpathfinder/RNPathfinderFragment;", "prforceGroups", "proctorGroups", "url", "optionalArgs", "", "rnpathfinder_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RNPathfinderFragment createInstance$default(Companion companion, String str, String str2, String str3, Map map, int i, Object obj) {
            if ((i & 8) != 0) {
                map = null;
            }
            return companion.createInstance(str, str2, str3, map);
        }

        public final RNPathfinderFragment createInstance(String prforceGroups, String proctorGroups, String url, Map<String, String> optionalArgs) {
            prforceGroups.getClass();
            proctorGroups.getClass();
            url.getClass();
            RNPathfinderFragment rNPathfinderFragment = new RNPathfinderFragment();
            Bundle bundle = new Bundle();
            bundle.putBundle("launchOptions", new RNPathfinderProps(e9a.a.a(prforceGroups, proctorGroups), url, optionalArgs).toBundle());
            rNPathfinderFragment.setArguments(bundle);
            return rNPathfinderFragment;
        }

        private Companion() {
        }
    }
}
