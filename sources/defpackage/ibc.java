package defpackage;

import com.dooboolab.audiorecorderplayer.RNAudioRecorderPlayerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.linusu.RNGetRandomValuesModule;

/* JADX INFO: loaded from: classes2.dex */
public final class ibc implements inc {
    public final /* synthetic */ int a;

    public /* synthetic */ ibc(int i) {
        this.a = i;
    }

    @Override // defpackage.inc
    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        switch (this.a) {
            case 0:
                reactApplicationContext.getClass();
                List listAsList = Arrays.asList(new RNAudioRecorderPlayerModule(reactApplicationContext));
                listAsList.getClass();
                return listAsList;
            default:
                return Arrays.asList(new RNGetRandomValuesModule(reactApplicationContext));
        }
    }

    @Override // defpackage.inc
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        switch (this.a) {
            case 0:
                return zr4.a;
            default:
                return Collections.EMPTY_LIST;
        }
    }
}
