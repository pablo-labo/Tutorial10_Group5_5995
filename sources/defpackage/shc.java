package defpackage;

import android.graphics.Typeface;
import android.view.View;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.indeed.android.jobsearch.R;
import com.indeed.android.rnviewjob.RNViewJobModule;
import java.util.ArrayList;
import java.util.List;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final class shc implements inc {
    public final OkHttpClient a;
    public final wd b;
    public final qh2 c;
    public final phc d;
    public final tb e;

    public shc(OkHttpClient okHttpClient, wd wdVar, qh2 qh2Var, phc phcVar, tb tbVar) {
        okHttpClient.getClass();
        this.a = okHttpClient;
        this.b = wdVar;
        this.c = qh2Var;
        this.d = phcVar;
        this.e = tbVar;
    }

    @Override // defpackage.inc
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        reactApplicationContext.getClass();
        nkc nkcVar = nkc.e;
        nkcVar.getClass();
        Typeface typefaceA = g6d.a(reactApplicationContext, R.font.indeed_sans);
        if (typefaceA != null) {
            nkcVar.b.put("Indeed Sans", typefaceA);
        }
        return new ArrayList(u63.Z(new RNViewJobModule(reactApplicationContext, this.a, this.b, this.c, this.d, this.e)));
    }

    @Override // defpackage.inc
    public final List<ViewManager<View, koc<?>>> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList();
    }
}
