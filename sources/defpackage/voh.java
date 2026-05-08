package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class voh implements j7i {
    public final /* synthetic */ mhh a;

    public voh(mhh mhhVar) {
        this.a = mhhVar;
    }

    @Override // defpackage.j7i
    public final void a(Bundle bundle) {
        mhh mhhVar = this.a;
        mhhVar.c(new yhh(mhhVar, bundle));
    }

    @Override // defpackage.j7i
    public final void b(String str, String str2, Bundle bundle) {
        mhh mhhVar = this.a;
        mhhVar.c(new nih(mhhVar, str, str2, bundle));
    }

    @Override // defpackage.j7i
    public final List<Bundle> c(String str, String str2) {
        jli jliVar = new jli();
        mhh mhhVar = this.a;
        mhhVar.c(new iih(mhhVar, str, str2, jliVar));
        List<Bundle> list = (List) jli.e(jliVar.h(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // defpackage.j7i
    public final void d(String str, String str2, Bundle bundle) {
        mhh mhhVar = this.a;
        mhhVar.c(new lmh(mhhVar, str, str2, bundle, true));
    }

    @Override // defpackage.j7i
    public final int e(String str) {
        jli jliVar = new jli();
        mhh mhhVar = this.a;
        mhhVar.c(new slh(mhhVar, str, jliVar));
        Integer num = (Integer) jli.e(jliVar.h(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // defpackage.j7i
    public final Map<String, Object> f(String str, String str2, boolean z) {
        jli jliVar = new jli();
        mhh mhhVar = this.a;
        mhhVar.c(new olh(mhhVar, str, str2, z, jliVar));
        Bundle bundleH = jliVar.h(5000L);
        if (bundleH == null || bundleH.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleH.size());
        for (String str3 : bundleH.keySet()) {
            Object obj = bundleH.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    @Override // defpackage.j7i
    public final String zza() {
        jli jliVar = new jli();
        mhh mhhVar = this.a;
        mhhVar.c(new hkh(mhhVar, jliVar));
        return (String) jli.e(jliVar.h(500L), String.class);
    }

    @Override // defpackage.j7i
    public final String zzb() {
        jli jliVar = new jli();
        mhh mhhVar = this.a;
        mhhVar.c(new dkh(mhhVar, jliVar));
        return (String) jli.e(jliVar.h(500L), String.class);
    }

    @Override // defpackage.j7i
    public final String zzc() {
        jli jliVar = new jli();
        mhh mhhVar = this.a;
        mhhVar.c(new zjh(mhhVar, jliVar));
        return (String) jli.e(jliVar.h(50L), String.class);
    }

    @Override // defpackage.j7i
    public final String zzd() {
        jli jliVar = new jli();
        mhh mhhVar = this.a;
        mhhVar.c(new njh(mhhVar, jliVar));
        return (String) jli.e(jliVar.h(500L), String.class);
    }

    @Override // defpackage.j7i
    public final long zze() {
        jli jliVar = new jli();
        mhh mhhVar = this.a;
        mhhVar.c(new vjh(mhhVar, jliVar));
        Long l = (Long) jli.e(jliVar.h(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = mhhVar.d + 1;
        mhhVar.d = i;
        return jNextLong + ((long) i);
    }

    @Override // defpackage.j7i
    public final void zza(String str) {
        mhh mhhVar = this.a;
        mhhVar.c(new ljh(mhhVar, str));
    }

    @Override // defpackage.j7i
    public final void zzb(String str) {
        mhh mhhVar = this.a;
        mhhVar.c(new rjh(mhhVar, str));
    }
}
