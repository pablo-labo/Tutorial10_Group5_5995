package defpackage;

import android.view.MenuItem;
import androidx.fragment.app.g;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.indeed.android.jobsearch.R;
import com.linecorp.linesdk.openchat.ui.CreateOpenChatActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class no9 implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ no9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ro9 ro9Var = (ro9) obj;
                menuItem.getClass();
                if (menuItem.hasSubMenu()) {
                    return false;
                }
                ro9Var.e = false;
                ReadableArray readableArray = ro9Var.b;
                if (readableArray == null) {
                    wl7.g("mActions");
                    throw null;
                }
                if (!readableArray.isNull(menuItem.getOrder())) {
                    ReadableArray readableArray2 = ro9Var.b;
                    if (readableArray2 == null) {
                        wl7.g("mActions");
                        throw null;
                    }
                    ReadableMap map = readableArray2.getMap(menuItem.getOrder());
                    EventDispatcher eventDispatcherE = dmc.e(ro9Var.a, ro9Var.getId());
                    int iH = dmc.h(ro9Var);
                    if (eventDispatcherE != null) {
                        eventDispatcherE.a(new io9(map != null ? map.getString("id") : null, iH, ro9Var.getId(), ro9Var.getId()));
                    }
                }
                return true;
            default:
                xta xtaVar = (xta) obj;
                menuItem.getClass();
                if (menuItem.getItemId() != R.id.menu_item_openchat_next) {
                    return false;
                }
                g gVarRequireActivity = xtaVar.requireActivity();
                gVarRequireActivity.getClass();
                ((CreateOpenChatActivity) gVarRequireActivity).A(CreateOpenChatActivity.a.b, true);
                return true;
        }
    }
}
