package defpackage;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public final class f70 extends o81 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f70(BaseViewManager baseViewManager, int i) {
        super(baseViewManager);
        this.d = i;
    }

    @Override // defpackage.o81, defpackage.sqg
    /* JADX INFO: renamed from: m */
    public void a(View view, String str, Object obj) {
        View.OnLayoutChangeListener onLayoutChangeListener;
        switch (this.d) {
            case 0:
                onLayoutChangeListener = (BaseViewManager) this.c;
                str.getClass();
                switch (str) {
                    case "statusBarBackgroundColor":
                        ((g70) onLayoutChangeListener).setStatusBarBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case "drawerBackgroundColor":
                        ((g70) onLayoutChangeListener).setDrawerBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case "keyboardDismissMode":
                        ((g70) onLayoutChangeListener).setKeyboardDismissMode(view, (String) obj);
                        break;
                    case "drawerWidth":
                        ((g70) onLayoutChangeListener).setDrawerWidth(view, obj == null ? null : Float.valueOf(((Double) obj).floatValue()));
                        break;
                    case "drawerPosition":
                        ((g70) onLayoutChangeListener).setDrawerPosition(view, (String) obj);
                        break;
                    case "drawerLockMode":
                        ((g70) onLayoutChangeListener).setDrawerLockMode(view, (String) obj);
                        break;
                    default:
                        super.a(view, str, obj);
                        break;
                }
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }

    @Override // defpackage.o81, defpackage.sqg
    /* JADX INFO: renamed from: s */
    public void f(View view, String str, ReadableArray readableArray) {
        switch (this.d) {
            case 0:
                View.OnLayoutChangeListener onLayoutChangeListener = (BaseViewManager) this.c;
                str.getClass();
                if (!str.equals(ReactDrawerLayoutManager.COMMAND_CLOSE_DRAWER)) {
                    if (str.equals(ReactDrawerLayoutManager.COMMAND_OPEN_DRAWER)) {
                        ((g70) onLayoutChangeListener).openDrawer(view);
                        break;
                    }
                } else {
                    ((g70) onLayoutChangeListener).closeDrawer(view);
                    break;
                }
                break;
            default:
                super.f(view, str, readableArray);
                break;
        }
    }
}
