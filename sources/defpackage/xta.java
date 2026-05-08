package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import com.indeed.android.jobsearch.R;
import com.linecorp.linesdk.openchat.ui.CreateOpenChatActivity;
import defpackage.grg;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxta;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "line-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class xta extends Fragment {
    public yta a;
    public gua b;

    public final String D(int i, String str) {
        int integer = requireActivity().getResources().getInteger(i);
        StringBuilder sb = new StringBuilder();
        sb.append(str.length());
        sb.append('/');
        sb.append(integer);
        return sb.toString();
    }

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
        yta ytaVar = this.a;
        if (ytaVar == null) {
            wl7.g("binding");
            throw null;
        }
        ytaVar.e0(guaVar);
        gua guaVar2 = this.b;
        if (guaVar2 == null) {
            wl7.g("viewModel");
            throw null;
        }
        guaVar2.d.e(this, new goa() { // from class: tta
            @Override // defpackage.goa
            public final void d(Object obj) {
                String str = (String) obj;
                xta xtaVar = this.a;
                yta ytaVar2 = xtaVar.a;
                if (ytaVar2 == null) {
                    wl7.g("binding");
                    throw null;
                }
                TextView textView = ytaVar2.N0;
                str.getClass();
                textView.setText(xtaVar.D(R.integer.max_chatroom_name_length, str));
            }
        });
        gua guaVar3 = this.b;
        if (guaVar3 == null) {
            wl7.g("viewModel");
            throw null;
        }
        int i = 1;
        guaVar3.f.e(this, new u53(this, 1));
        gua guaVar4 = this.b;
        if (guaVar4 == null) {
            wl7.g("viewModel");
            throw null;
        }
        guaVar4.V.e(this, new v53(this, 1));
        g gVarRequireActivity2 = requireActivity();
        gVarRequireActivity2.getClass();
        x7 x7Var = ((CreateOpenChatActivity) gVarRequireActivity2).q0;
        if (x7Var == null) {
            wl7.g("binding");
            throw null;
        }
        Toolbar toolbar = (Toolbar) x7Var.b;
        toolbar.setTitle(getString(R.string.openchat_create_room_title));
        toolbar.getMenu().clear();
        toolbar.o(R.menu.menu_openchat_info);
        final MenuItem menuItemFindItem = toolbar.getMenu().findItem(R.id.menu_item_openchat_next);
        menuItemFindItem.setOnMenuItemClickListener(new no9(this, i));
        gua guaVar5 = this.b;
        if (guaVar5 == null) {
            wl7.g("viewModel");
            throw null;
        }
        guaVar5.b0.e(this, new goa() { // from class: vta
            @Override // defpackage.goa
            public final void d(Object obj) {
                Boolean bool = (Boolean) obj;
                menuItemFindItem.setEnabled(bool == null ? false : bool.booleanValue());
            }
        });
        yta ytaVar2 = this.a;
        if (ytaVar2 == null) {
            wl7.g("binding");
            throw null;
        }
        EditText editText = ytaVar2.M0;
        editText.getClass();
        gua guaVar6 = this.b;
        if (guaVar6 == null) {
            wl7.g("viewModel");
            throw null;
        }
        editText.addTextChangedListener(new mi8(new fp8(1, guaVar6.d, g3a.class, "setValue", "setValue(Ljava/lang/Object;)V", 0, 1)));
        yta ytaVar3 = this.a;
        if (ytaVar3 == null) {
            wl7.g("binding");
            throw null;
        }
        EditText editText2 = ytaVar3.J0;
        editText2.getClass();
        gua guaVar7 = this.b;
        if (guaVar7 == null) {
            wl7.g("viewModel");
            throw null;
        }
        editText2.addTextChangedListener(new mi8(new ep8(1, guaVar7.f, g3a.class, "setValue", "setValue(Ljava/lang/Object;)V", 0, 1)));
        yta ytaVar4 = this.a;
        if (ytaVar4 == null) {
            wl7.g("binding");
            throw null;
        }
        ytaVar4.F0.setOnClickListener(new View.OnClickListener() { // from class: wta
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xta xtaVar = this.a;
                c.a aVar = new c.a(xtaVar.requireContext());
                if (xtaVar.b == null) {
                    wl7.g("viewModel");
                    throw null;
                }
                Context contextRequireContext = xtaVar.requireContext();
                contextRequireContext.getClass();
                sta[] staVarArrValues = sta.values();
                ArrayList arrayList = new ArrayList(staVarArrValues.length);
                for (sta staVar : staVarArrValues) {
                    arrayList.add(contextRequireContext.getResources().getString(staVar.c()));
                }
                Object[] array = arrayList.toArray(new String[0]);
                array.getClass();
                b63 b63Var = new b63(xtaVar, 1);
                AlertController.b bVar = aVar.a;
                bVar.p = (String[]) array;
                bVar.r = b63Var;
                aVar.b();
            }
        });
        yta ytaVar5 = this.a;
        if (ytaVar5 == null) {
            wl7.g("binding");
            throw null;
        }
        ytaVar5.P0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: uta
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                gua guaVar8 = this.a.b;
                if (guaVar8 != null) {
                    guaVar8.W.j(Boolean.valueOf(z));
                } else {
                    wl7.g("viewModel");
                    throw null;
                }
            }
        });
        yta ytaVar6 = this.a;
        if (ytaVar6 != null) {
            ytaVar6.Q0.setOnClickListener(new dh3(this, 1));
        } else {
            wl7.g("binding");
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
        int i = yta.T0;
        DataBinderMapperImpl dataBinderMapperImpl = wd3.a;
        yta ytaVar = (yta) qpg.W(layoutInflater, R.layout.open_chat_info_fragment, viewGroup);
        ytaVar.getClass();
        this.a = ytaVar;
        ytaVar.b0(this);
        yta ytaVar2 = this.a;
        if (ytaVar2 != null) {
            return ytaVar2.r0;
        }
        wl7.g("binding");
        throw null;
    }
}
