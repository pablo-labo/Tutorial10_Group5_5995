package defpackage;

import com.facebook.react.views.text.PreparedLayoutTextViewManager;
import com.facebook.react.views.text.ReactTextViewManager;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a99 implements Provider {
    @Override // javax.inject.Provider
    public final Object get() {
        return ie7.g0.enablePreparedTextLayout() ? new PreparedLayoutTextViewManager(null, 1, null) : new ReactTextViewManager(null, 1, null);
    }
}
