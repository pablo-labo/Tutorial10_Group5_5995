package defpackage;

import android.os.Build;
import androidx.work.b;
import defpackage.jq2;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class oda extends qv4 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oda(xed xedVar, int i) {
        super(xedVar);
        this.d = i;
    }

    @Override // defpackage.ha1
    public final String d() {
        switch (this.d) {
            case 0:
                return "INSERT OR REPLACE INTO `HamburgerMenuCategory` (`id`,`label`,`isLoggedIn`,`locale`) VALUES (?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    @Override // defpackage.qv4
    public final void h(zze zzeVar, Object obj) throws Throwable {
        int i;
        int i2;
        byte[] byteArray;
        int i3 = 2;
        switch (this.d) {
            case 0:
                ve6 ve6Var = (ve6) obj;
                zzeVar.n(1, ve6Var.a);
                String str = ve6Var.b;
                if (str == null) {
                    zzeVar.u(2);
                } else {
                    zzeVar.n(2, str);
                }
                zzeVar.q(3, ve6Var.c ? 1L : 0L);
                zzeVar.n(4, ve6Var.d);
                return;
            default:
                r3h r3hVar = (r3h) obj;
                String str2 = r3hVar.a;
                if (str2 == null) {
                    zzeVar.u(1);
                } else {
                    zzeVar.n(1, str2);
                }
                zzeVar.q(2, pyd.V(r3hVar.b));
                String str3 = r3hVar.c;
                if (str3 == null) {
                    zzeVar.u(3);
                } else {
                    zzeVar.n(3, str3);
                }
                String str4 = r3hVar.d;
                if (str4 == null) {
                    zzeVar.u(4);
                } else {
                    zzeVar.n(4, str4);
                }
                byte[] bArrB = b.b(r3hVar.e);
                if (bArrB == null) {
                    zzeVar.u(5);
                } else {
                    zzeVar.r(5, bArrB);
                }
                byte[] bArrB2 = b.b(r3hVar.f);
                if (bArrB2 == null) {
                    zzeVar.u(6);
                } else {
                    zzeVar.r(6, bArrB2);
                }
                zzeVar.q(7, r3hVar.g);
                zzeVar.q(8, r3hVar.h);
                zzeVar.q(9, r3hVar.i);
                zzeVar.q(10, r3hVar.k);
                b81 b81Var = r3hVar.l;
                b81Var.getClass();
                int iOrdinal = b81Var.ordinal();
                if (iOrdinal == 0) {
                    i = 0;
                } else {
                    if (iOrdinal != 1) {
                        l.g();
                        return;
                    }
                    i = 1;
                }
                zzeVar.q(11, i);
                zzeVar.q(12, r3hVar.m);
                zzeVar.q(13, r3hVar.n);
                zzeVar.q(14, r3hVar.o);
                zzeVar.q(15, r3hVar.p);
                zzeVar.q(16, r3hVar.q ? 1L : 0L);
                iwa iwaVar = r3hVar.r;
                iwaVar.getClass();
                int iOrdinal2 = iwaVar.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = 0;
                } else {
                    if (iOrdinal2 != 1) {
                        l.g();
                        return;
                    }
                    i2 = 1;
                }
                zzeVar.q(17, i2);
                zzeVar.q(18, r3hVar.s);
                zzeVar.q(19, r3hVar.t);
                jq2 jq2Var = r3hVar.j;
                if (jq2Var == null) {
                    zzeVar.u(20);
                    zzeVar.u(21);
                    zzeVar.u(22);
                    zzeVar.u(23);
                    zzeVar.u(24);
                    zzeVar.u(25);
                    zzeVar.u(26);
                    zzeVar.u(27);
                    return;
                }
                dha dhaVar = jq2Var.a;
                dhaVar.getClass();
                int iOrdinal3 = dhaVar.ordinal();
                if (iOrdinal3 == 0) {
                    i3 = 0;
                } else if (iOrdinal3 == 1) {
                    i3 = 1;
                } else if (iOrdinal3 != 2) {
                    if (iOrdinal3 == 3) {
                        i3 = 3;
                    } else if (iOrdinal3 == 4) {
                        i3 = 4;
                    } else if (Build.VERSION.SDK_INT < 30 || dhaVar != dha.f) {
                        w40.m("Could not convert ", dhaVar, " to int");
                        i3 = 0;
                    } else {
                        i3 = 5;
                    }
                }
                zzeVar.q(20, i3);
                zzeVar.q(21, jq2Var.b ? 1L : 0L);
                zzeVar.q(22, jq2Var.c ? 1L : 0L);
                zzeVar.q(23, jq2Var.d ? 1L : 0L);
                zzeVar.q(24, jq2Var.e ? 1L : 0L);
                zzeVar.q(25, jq2Var.f);
                zzeVar.q(26, jq2Var.g);
                Set<jq2.a> set = jq2Var.h;
                set.getClass();
                if (set.isEmpty()) {
                    byteArray = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            objectOutputStream.writeInt(set.size());
                            for (jq2.a aVar : set) {
                                objectOutputStream.writeUTF(aVar.a.toString());
                                objectOutputStream.writeBoolean(aVar.b);
                            }
                            j6g j6gVar = j6g.a;
                            objectOutputStream.close();
                            byteArrayOutputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                            byteArray.getClass();
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            c0h.q(byteArrayOutputStream, th);
                            throw th2;
                        }
                    }
                }
                zzeVar.r(27, byteArray);
                return;
        }
    }
}
