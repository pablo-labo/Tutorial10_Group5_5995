package defpackage;

import com.facebook.react.bridge.ReactApplicationContext;
import com.indeed.android.rnmyjobs.RNMyJobsModule;
import com.indeed.android.rnsearch.RNSearchModule;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wdc implements inc {
    public final /* synthetic */ int a;

    public /* synthetic */ wdc(int i) {
        this.a = i;
    }

    @Override // defpackage.inc
    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        int i = this.a;
        reactApplicationContext.getClass();
        switch (i) {
            case 0:
                ((np7) cr8.p(np7.class)).a("RNMyJobsModulePackage", "Creating native modules for RNMyJobs");
                return u63.d0(new RNMyJobsModule(reactApplicationContext));
            default:
                return new ArrayList(u63.Z(new RNSearchModule(reactApplicationContext)));
        }
    }

    @Override // defpackage.inc
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        switch (this.a) {
        }
        return new ArrayList();
    }
}
