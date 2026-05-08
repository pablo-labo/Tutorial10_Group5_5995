package defpackage;

import android.util.Log;
import com.indeed.android.rnprofile.RNProfileScreenModule;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class bz implements l74 {
    public final /* synthetic */ int a;

    public /* synthetic */ bz(int i) {
        this.a = i;
    }

    @Override // defpackage.l74
    public final void dispose() {
        switch (this.a) {
            case 0:
                hz.c(i2h.V);
                break;
            default:
                ArrayList arrayList = lz2.a;
                Log.d("RNProfileScreenContainer", "Clearing ViewModels from bridge", null);
                Log.d("ProfileViewModelBridge", "Clearing ViewModels", null);
                m2c.a = null;
                m2c.b = null;
                m2c.c = null;
                m2c.d = null;
                m2c.e = null;
                ee3.f0 = null;
                RNProfileScreenModule.INSTANCE.getClass();
                RNProfileScreenModule.onUploadButtonVisibilityChanged = null;
                RNProfileScreenModule.onOpenResumeUploadFlowCallback = null;
                break;
        }
    }
}
