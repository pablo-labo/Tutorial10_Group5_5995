package defpackage;

import com.indeed.android.jobsearch.util.AppStartupTimes;
import defpackage.s87;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dn0 implements Function2 {
    public final /* synthetic */ long V;
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    public /* synthetic */ dn0(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.V = j7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Long l = (Long) obj2;
        ((String) obj).getClass();
        l.getClass();
        if (AppStartupTimes.d) {
            ArrayList arrayList = lz2.a;
            lz2.f("ColdInitializationTime sent already, not sending again");
            return l;
        }
        HashMap map = new HashMap();
        long j = this.a;
        long j2 = this.b;
        long jMax = Math.max(j, j2);
        long j3 = this.c;
        map.put("totalTimeToColdStartFinished", Long.valueOf(jMax - j3));
        map.put("proctorLoaded", Long.valueOf(j - j3));
        map.put("initValuesSynced", Long.valueOf(j2 - this.d));
        long j4 = this.e;
        long j5 = this.f;
        map.put("homePageHTMLLoaded", Long.valueOf(j4 - j5));
        map.put("homePageRendered", Long.valueOf(this.V - j3));
        map.put("homePageReady", Long.valueOf(l.longValue() - j3));
        Long l2 = AppStartupTimes.V.get("initRnHomepageFragmentStart");
        if (l2 != null) {
            map.put("rnhpInitTime", Long.valueOf(j5 - l2.longValue()));
        }
        Lazy<s87> lazy = s87.f;
        AppStartupTimes appStartupTimes = AppStartupTimes.a;
        gz4 gz4Var = (gz4) AppStartupTimes.b.getValue();
        AppStartupTimes.X.getClass();
        s87.a.a(gz4Var, new xl0(map));
        AppStartupTimes.d = true;
        return l;
    }
}
