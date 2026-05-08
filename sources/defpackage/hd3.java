package defpackage;

import android.app.Activity;
import androidx.media3.session.p;
import androidx.media3.session.q;
import androidx.media3.session.r;
import com.daily.reactlibrary.DailyNativeUtils;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hd3 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hd3(q qVar, r rVar, p pVar, boolean z) {
        this.c = qVar;
        this.d = rVar;
        this.e = pVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        boolean z = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((DailyNativeUtils) obj3).lambda$setKeepDeviceAwake$0(z, (String) obj2, (Activity) obj);
                break;
            default:
                ((q) obj3).d((r) obj2, (p) obj, z);
                break;
        }
    }

    public /* synthetic */ hd3(DailyNativeUtils dailyNativeUtils, boolean z, String str, Activity activity) {
        this.c = dailyNativeUtils;
        this.b = z;
        this.d = str;
        this.e = activity;
    }
}
