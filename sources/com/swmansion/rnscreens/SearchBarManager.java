package com.swmansion.rnscreens;

import android.util.Log;
import android.view.View;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.efc;
import defpackage.ffc;
import defpackage.lc9;
import defpackage.mkf;
import defpackage.nmc;
import defpackage.snc;
import defpackage.sqg;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = SearchBarManager.REACT_CLASS)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0007\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001EB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0017H\u0017¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b#\u0010\u0016J!\u0010%\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b%\u0010\u0016J!\u0010&\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b&\u0010\u001eJ!\u0010'\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b'\u0010\u001eJ!\u0010(\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b(\u0010\u001eJ\u001f\u0010*\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0017H\u0017¢\u0006\u0004\b*\u0010!J\u001b\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020,0+H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b/\u0010\u0013J\u0019\u00100\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b0\u0010\u0013J\u0019\u00101\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b1\u0010\u0013J!\u00103\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u00102\u001a\u00020\u0017H\u0016¢\u0006\u0004\b3\u0010!J#\u00105\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u00104\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b5\u0010\u0016J\u0019\u00106\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b6\u0010\u0013J!\u00107\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b7\u0010\u0016J\u001f\u00109\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u0017H\u0016¢\u0006\u0004\b9\u0010!J!\u0010:\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u00108\u001a\u00020\u0017H\u0016¢\u0006\u0004\b:\u0010!J!\u0010;\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u00108\u001a\u00020\u0017H\u0016¢\u0006\u0004\b;\u0010!J!\u0010<\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u00108\u001a\u00020\u0017H\u0016¢\u0006\u0004\b<\u0010!J#\u0010=\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u00108\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b=\u0010\u0016J#\u0010>\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u00108\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b>\u0010\u001eJ\u0017\u0010@\u001a\u00020\u00112\u0006\u0010?\u001a\u00020\tH\u0002¢\u0006\u0004\b@\u0010AR\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lcom/swmansion/rnscreens/SearchBarManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/i;", "Lffc;", "<init>", "()V", "Lsqg;", "getDelegate", "()Lsqg;", "", "getName", "()Ljava/lang/String;", "Lmkf;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "createViewInstance", "(Lmkf;)Lcom/swmansion/rnscreens/i;", "view", "Lj6g;", "onAfterUpdateTransaction", "(Lcom/swmansion/rnscreens/i;)V", "autoCapitalize", "setAutoCapitalize", "(Lcom/swmansion/rnscreens/i;Ljava/lang/String;)V", "", "autoFocus", "setAutoFocus", "(Lcom/swmansion/rnscreens/i;Ljava/lang/Boolean;)V", "", "color", "setBarTintColor", "(Lcom/swmansion/rnscreens/i;Ljava/lang/Integer;)V", "disableBackButtonOverride", "setDisableBackButtonOverride", "(Lcom/swmansion/rnscreens/i;Z)V", "inputType", "setInputType", "placeholder", "setPlaceholder", "setTextColor", "setHeaderIconColor", "setHintTextColor", "shouldShowHintSearchIcon", "setShouldShowHintSearchIcon", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "blur", "focus", "clearText", "flag", "toggleCancelButton", "text", "setText", "cancelSearch", "setPlacement", "value", "setAllowToolbarIntegration", "setHideWhenScrolling", "setObscureBackground", "setHideNavigationBar", "setCancelButtonText", "setTintColor", "propName", "logNotAvailable", "(Ljava/lang/String;)V", "delegate", "Lsqg;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SearchBarManager extends ViewGroupManager<i> implements ffc<i> {
    public static final String REACT_CLASS = "RNSSearchBar";
    private final sqg<i> delegate;

    public SearchBarManager() {
        super(null, 1, null);
        this.delegate = new efc(this, 0);
    }

    private final void logNotAvailable(String propName) {
        Log.w("[RNScreens]", propName + " prop is not available on Android");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public i createViewInstance(mkf context) {
        context.getClass();
        return new i(context);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public sqg<i> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return lc9.Z(new Pair("topSearchBlur", lc9.Z(new Pair("registrationName", "onSearchBlur"))), new Pair("topChangeText", lc9.Z(new Pair("registrationName", "onChangeText"))), new Pair("topClose", lc9.Z(new Pair("registrationName", "onClose"))), new Pair("topSearchFocus", lc9.Z(new Pair("registrationName", "onSearchFocus"))), new Pair("topOpen", lc9.Z(new Pair("registrationName", "onOpen"))), new Pair("topSearchButtonPress", lc9.Z(new Pair("registrationName", "onSearchButtonPress"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(i view) {
        view.getClass();
        super.onAfterUpdateTransaction(view);
        view.o();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // defpackage.ffc
    public void setAllowToolbarIntegration(i view, boolean value) {
        view.getClass();
        logNotAvailable("allowToolbarIntegration");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (r2.equals("none") != false) goto L21;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ffc
    @defpackage.snc(name = "autoCapitalize")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setAutoCapitalize(com.swmansion.rnscreens.i r1, java.lang.String r2) {
        /*
            r0 = this;
            r1.getClass()
            if (r2 == 0) goto L3d
            int r0 = r2.hashCode()
            switch(r0) {
                case 3387192: goto L2e;
                case 113318569: goto L23;
                case 490141296: goto L18;
                case 1245424234: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L37
        Ld:
            java.lang.String r0 = "characters"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L37
            com.swmansion.rnscreens.i$a r0 = com.swmansion.rnscreens.i.a.d
            goto L3f
        L18:
            java.lang.String r0 = "sentences"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L37
            com.swmansion.rnscreens.i$a r0 = com.swmansion.rnscreens.i.a.c
            goto L3f
        L23:
            java.lang.String r0 = "words"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L37
            com.swmansion.rnscreens.i$a r0 = com.swmansion.rnscreens.i.a.b
            goto L3f
        L2e:
            java.lang.String r0 = "none"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L37
            goto L3d
        L37:
            java.lang.String r0 = "Forbidden auto capitalize value passed"
            defpackage.m6.m(r0)
            return
        L3d:
            com.swmansion.rnscreens.i$a r0 = com.swmansion.rnscreens.i.a.a
        L3f:
            r1.setAutoCapitalize(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.SearchBarManager.setAutoCapitalize(com.swmansion.rnscreens.i, java.lang.String):void");
    }

    @snc(name = "autoFocus")
    public final void setAutoFocus(i view, Boolean autoFocus) {
        view.getClass();
        view.setAutoFocus(autoFocus != null ? autoFocus.booleanValue() : false);
    }

    @Override // defpackage.ffc
    @snc(customType = "Color", name = "barTintColor")
    public void setBarTintColor(i view, Integer color) {
        view.getClass();
        view.setTintColor(color);
    }

    @Override // defpackage.ffc
    @snc(name = "disableBackButtonOverride")
    public void setDisableBackButtonOverride(i view, boolean disableBackButtonOverride) {
        view.getClass();
        view.setShouldOverrideBackButton(!disableBackButtonOverride);
    }

    @Override // defpackage.ffc
    @snc(customType = "Color", name = "headerIconColor")
    public void setHeaderIconColor(i view, Integer color) {
        view.getClass();
        view.setHeaderIconColor(color);
    }

    @Override // defpackage.ffc
    @snc(customType = "Color", name = "hintTextColor")
    public void setHintTextColor(i view, Integer color) {
        view.getClass();
        view.setHintTextColor(color);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r2.equals("text") != false) goto L21;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ffc
    @defpackage.snc(name = "inputType")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setInputType(com.swmansion.rnscreens.i r1, java.lang.String r2) {
        /*
            r0 = this;
            r1.getClass()
            if (r2 == 0) goto L3d
            int r0 = r2.hashCode()
            switch(r0) {
                case -1034364087: goto L2c;
                case 3556653: goto L23;
                case 96619420: goto L18;
                case 106642798: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L37
        Ld:
            java.lang.String r0 = "phone"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L37
            com.swmansion.rnscreens.i$b$c r0 = com.swmansion.rnscreens.i.b.b
            goto L3f
        L18:
            java.lang.String r0 = "email"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L37
            com.swmansion.rnscreens.i$b$a r0 = com.swmansion.rnscreens.i.b.d
            goto L3f
        L23:
            java.lang.String r0 = "text"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L37
            goto L3d
        L2c:
            java.lang.String r0 = "number"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L37
            com.swmansion.rnscreens.i$b$b r0 = com.swmansion.rnscreens.i.b.c
            goto L3f
        L37:
            java.lang.String r0 = "Forbidden input type value"
            defpackage.m6.m(r0)
            return
        L3d:
            com.swmansion.rnscreens.i$b$d r0 = com.swmansion.rnscreens.i.b.a
        L3f:
            r1.setInputType(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.SearchBarManager.setInputType(com.swmansion.rnscreens.i, java.lang.String):void");
    }

    @Override // defpackage.ffc
    @snc(name = "placeholder")
    public void setPlaceholder(i view, String placeholder) {
        view.getClass();
        if (placeholder != null) {
            view.setPlaceholder(placeholder);
        }
    }

    @Override // defpackage.ffc
    public void setPlacement(i view, String placeholder) {
        view.getClass();
        logNotAvailable("setPlacement");
    }

    @Override // defpackage.ffc
    @snc(name = "shouldShowHintSearchIcon")
    public void setShouldShowHintSearchIcon(i view, boolean shouldShowHintSearchIcon) {
        view.getClass();
        view.setShouldShowHintSearchIcon(shouldShowHintSearchIcon);
    }

    @Override // defpackage.ffc
    @snc(customType = "Color", name = "textColor")
    public void setTextColor(i view, Integer color) {
        view.getClass();
        view.setTextColor(color);
    }

    @Override // defpackage.ffc
    public void blur(i view) {
        if (view != null) {
            view.j();
        }
    }

    @Override // defpackage.ffc
    public void cancelSearch(i view) {
        if (view != null) {
            view.l();
        }
    }

    @Override // defpackage.ffc
    public void clearText(i view) {
        if (view != null) {
            view.k();
        }
    }

    @Override // defpackage.ffc
    public void focus(i view) {
        if (view != null) {
            view.l();
        }
    }

    @Override // defpackage.ffc
    public void setCancelButtonText(i view, String value) {
        logNotAvailable("cancelButtonText");
    }

    @Override // defpackage.ffc
    public void setHideNavigationBar(i view, boolean value) {
        logNotAvailable("hideNavigationBar");
    }

    @Override // defpackage.ffc
    public void setHideWhenScrolling(i view, boolean value) {
        logNotAvailable("hideWhenScrolling");
    }

    @Override // defpackage.ffc
    public void setObscureBackground(i view, boolean value) {
        logNotAvailable("hideNavigationBar");
    }

    @Override // defpackage.ffc
    public void setText(i view, String text) {
        if (view != null) {
            view.m(text);
        }
    }

    @Override // defpackage.ffc
    public void setTintColor(i view, Integer value) {
        logNotAvailable("tintColor");
    }

    @Override // defpackage.ffc
    public void toggleCancelButton(i view, boolean flag) {
    }
}
