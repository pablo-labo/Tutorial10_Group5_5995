package defpackage;

import androidx.compose.runtime.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class pzf {
    public static final jte a = new jte(a.a);

    public static final class a extends mj8 implements gu5<mzf> {
        public static final a a = new a(0);

        @Override // defpackage.gu5
        public final mzf invoke() {
            return new mzf(0);
        }
    }

    public static final tjf a(ozf ozfVar, b bVar) {
        mzf mzfVar = (mzf) bVar.M(a);
        switch (ozfVar.ordinal()) {
            case 0:
                return mzfVar.j;
            case 1:
                return mzfVar.k;
            case 2:
                return mzfVar.l;
            case 3:
                return mzfVar.a;
            case 4:
                return mzfVar.b;
            case 5:
                return mzfVar.c;
            case 6:
                return mzfVar.d;
            case 7:
                return mzfVar.e;
            case 8:
                return mzfVar.f;
            case DatadogLogGenerator.CRASH /* 9 */:
                return mzfVar.m;
            case 10:
                return mzfVar.n;
            case 11:
                return mzfVar.o;
            case 12:
                return mzfVar.g;
            case 13:
                return mzfVar.h;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return mzfVar.i;
            default:
                l.g();
                return null;
        }
    }
}
