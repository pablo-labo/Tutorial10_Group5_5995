package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzn;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u4i implements Runnable {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public u4i(m4i m4iVar, Bundle bundle) {
        this.b = m4iVar;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                m4i m4iVar = (m4i) obj;
                Bundle bundle = (Bundle) obj2;
                qgi.a();
                i0i i0iVar = m4iVar.a;
                if (i0iVar.V.k(null, djh.M0)) {
                    if (bundle == null) {
                        m4iVar.f().r0.b(new Bundle());
                    } else {
                        Bundle bundleA = m4iVar.f().r0.a();
                        for (String str : bundle.keySet()) {
                            Object obj3 = bundle.get(str);
                            if (obj3 != null && !(obj3 instanceof String) && !(obj3 instanceof Long) && !(obj3 instanceof Double)) {
                                m4iVar.e();
                                if (yei.K(obj3)) {
                                    m4iVar.e().y(null, 27, 0, null);
                                }
                                m4iVar.zzr().Z.c("Invalid default event parameter type. Name, value", str, obj3);
                            } else if (yei.h0(str)) {
                                m4iVar.zzr().Z.a(str, "Invalid default event parameter name. Name");
                            } else if (obj3 == null) {
                                bundleA.remove(str);
                            } else if (m4iVar.e().O("param", str, 100, obj3)) {
                                m4iVar.e().x(bundleA, str, obj3);
                            }
                        }
                        m4iVar.e();
                        int iL = i0iVar.V.l();
                        if (bundleA.size() > iL) {
                            int i2 = 0;
                            for (String str2 : new TreeSet(bundleA.keySet())) {
                                i2++;
                                if (i2 > iL) {
                                    bundleA.remove(str2);
                                }
                            }
                            m4iVar.e().y(null, 26, 0, null);
                            m4iVar.zzr().Z.b("Too many default event parameters set. Discarding beyond event parameter limit");
                        }
                        m4iVar.f().r0.b(bundleA);
                        y8i y8iVarM = i0iVar.m();
                        y8iVarM.b();
                        y8iVarM.k();
                        y8iVarM.p(new o9i(y8iVarM, bundleA, y8iVarM.n(false)));
                    }
                    break;
                }
                break;
            default:
                y8i y8iVar = (y8i) obj2;
                pvh pvhVar = y8iVar.d;
                if (pvhVar == null) {
                    y8iVar.zzr().f.b("Failed to reset data on the service: not connected to service");
                } else {
                    try {
                        pvhVar.E0((zzn) obj);
                    } catch (RemoteException e) {
                        y8iVar.zzr().f.a(e, "Failed to reset data on the service: remote exception");
                    }
                    y8iVar.u();
                }
                break;
        }
    }

    public u4i(y8i y8iVar, zzn zznVar) {
        this.c = y8iVar;
        this.b = zznVar;
    }
}
