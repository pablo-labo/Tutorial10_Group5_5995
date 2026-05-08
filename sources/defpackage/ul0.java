package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.cd4;
import defpackage.s87;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.tracking.AppLifecycleTracking$trackOnAppStart$2$1", f = "AppLifecycleTracking.kt", l = {50}, m = "invokeSuspend")
public final class ul0 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Map<String, String> $extraProperties;
    final /* synthetic */ boolean $isColdLaunch;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul0(boolean z, Map<String, String> map, lu2<? super ul0> lu2Var) {
        super(2, lu2Var);
        this.$isColdLaunch = z;
        this.$extraProperties = map;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ul0(this.$isColdLaunch, this.$extraProperties, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ul0) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objI;
        int i;
        String str;
        String str2;
        String strA;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                r7d.b(obj);
                sl0 sl0Var = sl0.a;
                this.label = 1;
                objI = sl0.i(sl0Var, this);
                g13 g13Var = g13.a;
                if (objI == g13Var) {
                    return g13Var;
                }
            } else {
                if (i2 != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                objI = obj;
            }
            Pair pair = (Pair) objI;
            ol0 ol0Var = (ol0) pair.a();
            ol0 ol0Var2 = (ol0) pair.b();
            String str3 = ol0Var != null ? ol0Var.c : null;
            String str4 = ol0Var2.c;
            String str5 = ol0Var2.g;
            String str6 = ol0Var2.f;
            if (wl7.b(str3, str4)) {
                i = 1;
                str = str5;
                str2 = str6;
            } else {
                ol0Var2.n++;
                Lazy<s87> lazy = s87.f;
                sl0 sl0Var2 = sl0.a;
                gz4 gz4Var = (gz4) sl0.c.getValue();
                wg2 wg2Var = sl0.e;
                long j = ol0Var2.n;
                long j2 = ol0Var2.d;
                long j3 = ol0Var2.e;
                String str7 = ol0Var2.g;
                String strJ = sl0.j();
                strJ.getClass();
                i = 1;
                String str8 = ol0Var2.b;
                wg2Var.getClass();
                str4.getClass();
                str6.getClass();
                str2 = str6;
                str = str5;
                s87.a.a(gz4Var, new ez5("lifecycle_session_start", "sessionStart", j, str4, j3, j2, str2, null, str7, strJ, str8, null, 12416));
            }
            if (this.$isColdLaunch) {
                if (ol0Var == null) {
                    Lazy<s87> lazy2 = s87.f;
                    sl0 sl0Var3 = sl0.a;
                    gz4 gz4Var2 = (gz4) sl0.c.getValue();
                    wg2 wg2Var2 = sl0.e;
                    long j4 = ol0Var2.d;
                    long j5 = ol0Var2.e;
                    String str9 = str == null ? "" : str;
                    String strJ2 = sl0.j();
                    strJ2.getClass();
                    String str10 = ol0Var2.b;
                    wg2Var2.getClass();
                    str2.getClass();
                    String str11 = str2;
                    str2 = str11;
                    s87.a.a(gz4Var2, new ez5("lifecycle_install", "install", 1L, null, j5, j4, str11, null, str9, strJ2, str10, null, 12424));
                } else {
                    String str12 = ol0Var.a;
                    if (!wl7.b(str12, ol0Var2.a)) {
                        ol0Var2.m++;
                        ol0Var2.e += System.currentTimeMillis();
                        Lazy<s87> lazy3 = s87.f;
                        sl0 sl0Var4 = sl0.a;
                        gz4 gz4Var3 = (gz4) sl0.c.getValue();
                        wg2 wg2Var3 = sl0.e;
                        long j6 = ol0Var2.m;
                        long j7 = ol0Var2.d;
                        long j8 = ol0Var2.e;
                        String str13 = str == null ? "" : str;
                        String strJ3 = sl0.j();
                        strJ3.getClass();
                        String str14 = ol0Var2.b;
                        wg2Var3.getClass();
                        str2.getClass();
                        str12.getClass();
                        String str15 = str2;
                        str2 = str15;
                        s87.a.a(gz4Var3, new ez5("lifecycle_upgrade", "upgrade", j6, null, j8, j7, str15, str12, str13, strJ3, str14, null, 12296));
                    }
                }
                ol0Var2.l++;
                dd4 dd4Var = dd4.a;
                ad4 ad4Var = dd4.n().a;
                ad4Var.getClass();
                if (ad4Var.e(cd4.a.g0) == cd4.y.a.getValue() && ol0Var2.l == i) {
                    sl0 sl0Var5 = sl0.a;
                    strA = ylb.a(sl0.m());
                } else {
                    strA = null;
                }
                Lazy<s87> lazy4 = s87.f;
                sl0 sl0Var6 = sl0.a;
                gz4 gz4Var4 = (gz4) sl0.c.getValue();
                wg2 wg2Var4 = sl0.e;
                long j9 = ol0Var2.l;
                long j10 = ol0Var2.d;
                long j11 = ol0Var2.e;
                String str16 = str == null ? "" : str;
                String strJ4 = sl0.j();
                strJ4.getClass();
                String str17 = ol0Var2.b;
                LinkedHashMap linkedHashMapK = sl0.k(ol0Var2, this.$extraProperties, strA);
                wg2Var4.getClass();
                str4.getClass();
                str2.getClass();
                s87.a.a(gz4Var4, new ez5("lifecycle_cold_launch", "coldLaunch", j9, str4, j11, j10, str2, null, str16, strJ4, str17, linkedHashMapK, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
            }
            sl0 sl0Var7 = sl0.a;
            bu8 bu8Var = bu8.a;
            String strB = sl0.W.b(ol0.Companion.serializer(), ol0Var2);
            bu8Var.getClass();
            bu8.p0.b(bu8.b[26], bu8Var, strB);
        } catch (Exception unused) {
            ArrayList arrayList = lz2.a;
            lz2.h("AppLifecycleTracking", "trackOnAppResume - Error getting current app lifecycle snapshot, skipping tracking", null, 12);
        }
        return j6g.a;
    }
}
