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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lidc;", "Ll1g;", "<init>", "()V", "rninterviewprep_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class idc extends l1g {
    public ija a;
    public ir b;
    public final z8<String> c;

    public idc() {
        z8<String> z8VarRegisterForActivityResult = registerForActivityResult(new v8(), new sk3(this, 9));
        z8VarRegisterForActivityResult.getClass();
        this.c = z8VarRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: F */
    public abstract String getD();

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.interview_fragment, viewGroup, false);
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // defpackage.l1g, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        String strF = getD();
        strF.getClass();
        Bundle arguments = getArguments();
        ija ijaVar = new ija();
        Bundle bundle2 = new Bundle();
        bundle2.putString("arg_component_name", strF);
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
        aVar.d(R.id.interview_fragment, ijaVar2, null, 1);
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
