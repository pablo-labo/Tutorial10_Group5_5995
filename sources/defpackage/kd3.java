package defpackage;

import com.daily.reactlibrary.DailyNativeUtils;
import com.facebook.react.bridge.ReactApplicationContext;
import com.indeed.android.rnmessaging.RNMessagingModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kd3 implements inc {
    public final /* synthetic */ int a;

    public /* synthetic */ kd3(int i) {
        this.a = i;
    }

    @Override // defpackage.inc
    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        switch (this.a) {
            case 0:
                return Arrays.asList(new DailyNativeUtils(reactApplicationContext));
            default:
                reactApplicationContext.getClass();
                return new ArrayList(u63.Z(new RNMessagingModule(reactApplicationContext, null, 2, null)));
        }
    }

    @Override // defpackage.inc
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_LIST;
            default:
                return new ArrayList();
        }
    }
}
