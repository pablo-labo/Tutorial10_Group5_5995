package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import com.indeed.android.jobsearch.R;
import com.linecorp.linesdk.openchat.ui.CreateOpenChatActivity;
import defpackage.grg;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnrb;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "line-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class nrb extends Fragment {
    public orb a;
    public gua b;

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        g gVarRequireActivity = requireActivity();
        gVarRequireActivity.getClass();
        irg viewModelStore = gVarRequireActivity.getViewModelStore();
        grg.c defaultViewModelProviderFactory = gVarRequireActivity.getDefaultViewModelProviderFactory();
        p63 defaultViewModelCreationExtras = gVarRequireActivity.getDefaultViewModelCreationExtras();
        defaultViewModelProviderFactory.getClass();
        hrg hrgVar = new hrg(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        yd8 yd8VarB = fwc.a.b(gua.class);
        String strP = yd8VarB.p();
        if (strP == null) {
            l5.q("Local and anonymous classes can not be ViewModels");
            return;
        }
        gua guaVar = (gua) hrgVar.a(yd8VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strP));
        this.b = guaVar;
        orb orbVar = this.a;
        if (orbVar == null) {
            wl7.g("binding");
            throw null;
        }
        orbVar.e0(guaVar);
        g gVarRequireActivity2 = requireActivity();
        gVarRequireActivity2.getClass();
        x7 x7Var = ((CreateOpenChatActivity) gVarRequireActivity2).q0;
        if (x7Var == null) {
            wl7.g("binding");
            throw null;
        }
        Toolbar toolbar = (Toolbar) x7Var.b;
        toolbar.setTitle(getString(R.string.openchat_create_profile_title));
        toolbar.getMenu().clear();
        toolbar.o(R.menu.menu_profile_info);
        final MenuItem menuItemFindItem = toolbar.getMenu().findItem(R.id.menu_item_create_profile_done);
        menuItemFindItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: krb
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                menuItem.getClass();
                if (menuItem.getItemId() != R.id.menu_item_create_profile_done) {
                    return false;
                }
                nrb nrbVar = this.a;
                View currentFocus = nrbVar.requireActivity().getCurrentFocus();
                if (currentFocus != null) {
                    Object systemService = nrbVar.requireActivity().getSystemService("input_method");
                    systemService.getClass();
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                }
                gua guaVar2 = nrbVar.b;
                if (guaVar2 == null) {
                    wl7.g("viewModel");
                    throw null;
                }
                SharedPreferences.Editor editorEdit = guaVar2.b.edit();
                editorEdit.getClass();
                g3a<String> g3aVar = guaVar2.e;
                editorEdit.putString("key_profile_name", g3aVar.d());
                editorEdit.apply();
                String strD = guaVar2.d.d();
                String str = strD == null ? "" : strD;
                String strD2 = guaVar2.f.d();
                String str2 = strD2 == null ? "" : strD2;
                String strD3 = g3aVar.d();
                String str3 = strD3 == null ? "" : strD3;
                sta staVarD = guaVar2.V.d();
                if (staVarD == null) {
                    staVarD = sta.NotSelected;
                }
                sta staVar = staVarD;
                Boolean boolD = guaVar2.W.d();
                if (boolD == null) {
                    boolD = Boolean.TRUE;
                }
                u63.Y(ee3.p(guaVar2), null, null, new fua(guaVar2, new hua(str, str2, str3, staVar, boolD.booleanValue()), null), 3);
                return true;
            }
        });
        gua guaVar2 = this.b;
        if (guaVar2 == null) {
            wl7.g("viewModel");
            throw null;
        }
        guaVar2.c0.e(this, new goa() { // from class: lrb
            @Override // defpackage.goa
            public final void d(Object obj) {
                Boolean bool = (Boolean) obj;
                menuItemFindItem.setEnabled(bool == null ? false : bool.booleanValue());
            }
        });
        orb orbVar2 = this.a;
        if (orbVar2 == null) {
            wl7.g("binding");
            throw null;
        }
        EditText editText = orbVar2.D0;
        editText.getClass();
        editText.addTextChangedListener(new mi8(new mrb(this)));
        orb orbVar3 = this.a;
        if (orbVar3 == null) {
            wl7.g("binding");
            throw null;
        }
        TextView textView = orbVar3.E0;
        Resources resources = getResources();
        gua guaVar3 = this.b;
        if (guaVar3 != null) {
            textView.setText(resources.getString(R.string.openchat_create_profile_input_guide, guaVar3.d.d()));
        } else {
            wl7.g("viewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        int i = orb.G0;
        DataBinderMapperImpl dataBinderMapperImpl = wd3.a;
        orb orbVar = (orb) qpg.W(layoutInflater, R.layout.profile_info_fragment, viewGroup);
        orbVar.getClass();
        this.a = orbVar;
        orbVar.b0(this);
        orb orbVar2 = this.a;
        if (orbVar2 != null) {
            return orbVar2.r0;
        }
        wl7.g("binding");
        throw null;
    }
}
