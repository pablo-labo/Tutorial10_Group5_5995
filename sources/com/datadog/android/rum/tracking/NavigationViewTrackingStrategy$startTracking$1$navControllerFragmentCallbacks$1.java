package com.datadog.android.rum.tracking;

import androidx.fragment.app.Fragment;
import defpackage.bs4;
import defpackage.mj8;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "", "it", "Landroidx/fragment/app/Fragment;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class NavigationViewTrackingStrategy$startTracking$1$navControllerFragmentCallbacks$1 extends mj8 implements Function1<Fragment, Map<String, ? extends Object>> {
    public static final NavigationViewTrackingStrategy$startTracking$1$navControllerFragmentCallbacks$1 INSTANCE = new NavigationViewTrackingStrategy$startTracking$1$navControllerFragmentCallbacks$1();

    public NavigationViewTrackingStrategy$startTracking$1$navControllerFragmentCallbacks$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Map<String, Object> invoke(Fragment fragment) {
        fragment.getClass();
        return bs4.a;
    }
}
