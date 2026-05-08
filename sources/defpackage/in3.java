package defpackage;

import android.net.Uri;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.e47;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class in3 implements p55 {
    public qyc a;
    public int d;
    public static final int[] e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final a f = new a(new b0(6));
    public static final a V = new a(new akb());
    public qq3 c = new qq3();
    public boolean b = true;

    public static final class a {
        public final InterfaceC0270a a;
        public final AtomicBoolean b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: in3$a$a, reason: collision with other inner class name */
        public interface InterfaceC0270a {
            Constructor<? extends m55> b();
        }

        public a(InterfaceC0270a interfaceC0270a) {
            this.a = interfaceC0270a;
        }

        public final m55 a(Object... objArr) {
            Constructor<? extends m55> constructorB;
            synchronized (this.b) {
                if (!this.b.get()) {
                    try {
                        constructorB = this.a.b();
                    } catch (ClassNotFoundException unused) {
                        this.b.set(true);
                        constructorB = null;
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating extension", e);
                    }
                }
                constructorB = null;
            }
            if (constructorB == null) {
                return null;
            }
            try {
                return constructorB.newInstance(objArr);
            } catch (Exception e2) {
                ja.m("Unexpected error creating extractor", e2);
                return null;
            }
        }
    }

    public final void a(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new i5());
                break;
            case 1:
                arrayList.add(new m5());
                break;
            case 2:
                arrayList.add(new sz(0));
                break;
            case 3:
                arrayList.add(new l20());
                break;
            case 4:
                m55 m55VarA = f.a(0);
                if (m55VarA == null) {
                    arrayList.add(new vg5());
                } else {
                    arrayList.add(m55VarA);
                }
                break;
            case 5:
                arrayList.add(new ml5());
                break;
            case 6:
                arrayList.add(new lf9(this.c, this.b ? 0 : 2));
                break;
            case 7:
                arrayList.add(new u0a(0));
                break;
            case 8:
                qq3 qq3Var = this.c;
                int i2 = this.b ? 0 : 32;
                e47.b bVar = e47.b;
                arrayList.add(new ps5(qq3Var, i2, null, qyc.e, null));
                arrayList.add(new x0a(this.c, this.b ? 0 : 16));
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                arrayList.add(new yoa());
                break;
            case 10:
                arrayList.add(new m6c());
                break;
            case 11:
                if (this.a == null) {
                    e47.b bVar2 = e47.b;
                    this.a = qyc.e;
                }
                arrayList.add(new uuf(1, !this.b ? 1 : 0, this.c, new qmf(0L), new lr3(0, this.a)));
                break;
            case 12:
                arrayList.add(new fug());
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                arrayList.add(new g98(this.d));
                break;
            case 15:
                m55 m55VarA2 = V.a(new Object[0]);
                if (m55VarA2 != null) {
                    arrayList.add(m55VarA2);
                }
                break;
            case 16:
                arrayList.add(new c61(!this.b ? 1 : 0, this.c));
                break;
            case 17:
                arrayList.add(new heb());
                break;
            case 18:
                arrayList.add(new kxg());
                break;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                arrayList.add(new ei1());
                break;
            case 20:
                arrayList.add(new lh6());
                break;
            case 21:
                arrayList.add(new f61());
                break;
        }
    }

    @Override // defpackage.p55
    public final synchronized m55[] e(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            int[] iArr = e;
            arrayList = new ArrayList(21);
            List<String> list = map.get(TracingInterceptor.HEADER_CT);
            int iA = ypd.A((list == null || list.isEmpty()) ? null : list.get(0));
            if (iA != -1) {
                a(iA, arrayList);
            }
            int iB = ypd.B(uri);
            if (iB != -1 && iB != iA) {
                a(iB, arrayList);
            }
            for (int i = 0; i < 21; i++) {
                int i2 = iArr[i];
                if (i2 != iA && i2 != iB) {
                    a(i2, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (m55[]) arrayList.toArray(new m55[0]);
    }

    @Override // defpackage.p55
    public final synchronized m55[] h() {
        return e(Uri.EMPTY, new HashMap());
    }
}
